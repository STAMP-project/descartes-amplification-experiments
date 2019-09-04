import json
from glob import glob
from lxml import etree
from functools import lru_cache
from collections import namedtuple
from os.path import join, dirname, basename

Mutation = namedtuple('Mutation', 'mutator package class_name method description line')
Stub = namedtuple('Stub', 'mutator method line')

def mutation2json(mut):
    result = { field : mut.__getattribute__(field) for field in mut._fields if field != 'line' and field != 'class_name' }
    result['class'] = mut.class_name
    return result
 
def load_json(path):
    with open(path) as _file:
        return json.load(_file)

def save_json(path, data):
    with open(path, 'w') as _file:
        json.dump(data, _file)


def get_method_lines(project_results_dir):
    document = etree.parse(join(project_results_dir, 'mutations.xml'))
    txt = lambda e,t: e.find(t).text
    return { 
        f'{txt(element, "mutatedClass")}.{txt(element,"mutatedMethod")}{txt(element, "methodDescription")}' 
        : 
        int(txt(element, 'lineNumber')) 
        for element in document.findall('mutation')
    }

@lru_cache(maxsize=100)
def get_targets(project_results_dir):
    lines = get_method_lines(project_results_dir)
    method_signature = lambda m: f'{m["package"]}.{m["class"]}.{m["method"]}{m["description"]}' 
    data = load_json(f'{project_results_dir}/symptoms.json')
    return { symptom : set( Mutation(
        mutator=mut['mutator'],
        package=mut['package'],
        class_name=mut['class'],
        method=mut['method'],
        description=mut['description'],
        line=lines[method_signature(mut)]
     ) for mut in mutants )  for symptom, mutants in data.items() }

def report(path, improvement):
    print( path.split('/')[3], len(improvement['no-infection']), len(improvement['no-propagation']), len(improvement['weak-oracle']))

def get_killed_mutants(attempt_dir):
    result = set()
    for path in glob(join(attempt_dir, '*', '*_report.json')):
        data = load_json(path)
        for test in data['testCases']:
            for mutant in test['mutantsKilled']:
                result.add(Stub(
                    mutator=mutant["ID"], 
                    method=mutant["locationMethod"], 
                    line=int(mutant["lineNumber"])))
    return result

def compute_improvement(attempt_dir):
    targets = get_targets(attempt_dir[:attempt_dir.index('/dspot')])
    getstub = lambda t: Stub(t.mutator, t.method, t.line)
    killed_mutants = get_killed_mutants(attempt_dir)
    # print(killed_mutants)
    # print('---')
    # target_stubs = set()
    # for _,mutants in targets.items():
    #     for mut in mutants:
    #         target_stubs.add(getstub(mut))
    # print(target_stubs)
    return { symptom : [ mutation2json(mut) for mut in mutants if getstub(mut) in killed_mutants ] for symptom, mutants in targets.items()}

def compute_full_improvement():
    for path in glob('../../subjects/*/results/dspot/*'):
        improvement = compute_improvement(path)
        report(path, improvement)
        save_json(f'{path}/improvement.json', improvement)

if __name__ == '__main__':
    compute_full_improvement()
        
