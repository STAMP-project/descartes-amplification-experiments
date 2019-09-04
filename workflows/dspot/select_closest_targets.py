import json
import random
from glob import glob
from os.path import join, dirname
from collections import namedtuple,defaultdict

def load_file(path): 
    with open(path) as _file: 
        return json.load(_file) 

Target = namedtuple('Target', 'test_class test_method')

def get_closest_test(method_record):
    closest = min(method_record['tests'], key=lambda item: min(item['distances']))
    return target_from_internal_name(closest['test'])

def target_from_internal_name(test_full_name):
    test_full_name = test_full_name.replace('/', '.')
    test_full_name = test_full_name[:test_full_name.index('(')]
    last_pos = test_full_name.rindex('.')
    return Target(test_class=test_full_name[:last_pos],test_method=test_full_name[last_pos+1:])

def targets_from_distances(path):
    return { record['method'] : get_closest_test(record) for record in load_file(path)}

def get_method_internal(mutation_record):
    method_record = mutation_record['method']
    return f'{method_record["package"].replace(".", "/")}/{method_record["class"]}/{method_record["name"]}{method_record["description"]}'

def get_precomputed_targets(path):
    data = load_file(path)
    result = defaultdict(lambda : set())
    for record in data:
        target = Target(test_class=record['test']['class'], test_method=record['test'].get('method', None))
        for item in record['mutations']:
            method = get_method_internal(item)
            result[method].add(target)
    return result

def pick_targets(path):
    result = set()
    all_precomputed = get_precomputed_targets(join(path, 'amplification-targets.detailed.json'))
    all_closest = targets_from_distances(join(path, 'stack-distance.json'))
    for method, precomputed in all_precomputed.items():
        closest = all_closest.get(method, None)
        if closest and closest in precomputed:
            result.add(closest)
        if not precomputed.intersection(result):
            result.add(random.choice(list(precomputed)))
    return result


def compute_closest_targets():
    # ensuring there is an amplification-targets.json file
    for path in glob('../../subjects/*/results/amplification-targets.detailed.json'):
        project_dir = dirname(path)
        targets = pick_targets(dirname(path))
        print(project_dir, len(targets))
        with open(join(project_dir, 'amplification-targets.close.json'), 'w') as _file:
            json.dump([ { 'class': t.test_class, 'method': t.test_method } for t in targets ], _file)

if __name__ == '__main__':
    compute_closest_targets()

