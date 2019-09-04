import json
from glob import glob
from functools import lru_cache
from collections import namedtuple, defaultdict

Mutation = namedtuple('Mutation', 'mutator package class_name method description')

# Naming the attribute 'class' in the JSON files was a bad idea
# Can't use this behavior due to this bug: https://bugs.python.org/issue30343
class MutationEncoder(json.JSONEncoder):
    def default(self, obj):
        print("Enconding")
        if isinstance(obj, Mutation):
            print("Encoding mutation")
            result = dict(obj._asdict()) # Judt not to have an ordered dict
            result['class'] = result['class_name']
            del(result['class_name'])
            return result
        return json.JSONEncoder.default(self, obj)

def mutation2dict(mutation):
    result = dict(mutation._asdict()) # Judt not to have an ordered dict
    result['class'] = result['class_name']
    del(result['class_name'])
    return result

def load_data_from(path, **kwargs):
    with open(path) as _file:
        return json.load(_file, **kwargs)

def save_data(path, data):
    with open(path, 'w') as _file:
        json.dump(data, _file)

@lru_cache(maxsize=100)
def load_symptoms(project):
    data = load_data_from(f'{project}/symptoms.json')
    return { symptom : set( Mutation(
        mutator=mut['mutator'],
        package=mut['package'],
        class_name=mut['class'], # bad idea, due to 'class' in the JSON we can not do this  Mutation(**mut)
        method=mut['method'],
        description=mut['description']
     ) for mut in mutants )  for symptom, mutants in data.items() }

def killed_mutants_in_report(path):
    data = load_data_from(path)
    return [ 
        Mutation(
            mutator=record['mutator'],
            package=record['method']['package'],
            class_name=record['method']['class'],
            method=record['method']['name'],
            description=record['method']['description']
        ) for record in data['mutations'] if record['status'] == 'KILLED' ]

def all_killed_mutants(attempt_dir):
    return set().union(*[killed_mutants_in_report(path) for path in glob(f'{attempt_dir}/????/evosuite-tests/mutations.json')])

def compute_improvement(attempt_dir, targets):
    killed_mutants = all_killed_mutants(attempt_dir)
    return { symptom : targets[symptom].intersection(killed_mutants) for symptom in targets }

def report(path, improvement):
    print( path.split('/')[3], len(improvement['no-infection']), len(improvement['no-propagation']), len(improvement['weak-oracle']))

def save_improvement(path, data):
    save_data(path, { key : [ mutation2dict(mut) for mut in mutations ] for key, mutations in data.items() })

def compute_full_improvement():
    for path in glob('../../subjects/*/results/evosuite/*'):
        project_dir = path[:path.index('/evosuite')]
        improvement = compute_improvement(path, load_symptoms(project_dir))
        report(path, improvement)
        save_improvement(f'{path}/improvement.json', improvement)

if __name__ == '__main__':
    compute_full_improvement()


