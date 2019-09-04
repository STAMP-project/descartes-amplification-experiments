import json
import os.path
from glob import glob
from utils import json_load, PROJECTS


class Mutation:
    '''
    Mutation with test information
    '''

    def __init__(self, mutator, package, class_name, method, description, tests=[]):
        self.mutator = mutator
        self.package = package
        self.class_name = class_name
        self.method = method
        self.description = description
        self.tests = tests
    
    def id(self):
        return f'{self.package}/{self.class_name}#{self.method}{self.description}::{self.mutator}'

    def __hash__(self):
        return hash(self.id())
    
    def __eq__(self, value):
        if not isinstance(value, Mutation):
            return False
        return self.id() == value.id()
    
    @staticmethod
    def from_file(path):
        data = json_load(path)
        return Mutation(
            data['mutator'], 
            data['package'], 
            data['class'], # It was a bad choice to name it class.... :(
            data['method'], 
            data['description'], 
            data['tests']  
        )

def get_clean_diff(path):
    if not os.path.exists(path):
        # No file, no diff
        return []
    diff = json_load(path)
    # Consider a difference to be valid if there is only one expected value
    return [item for item in diff if len(item['expected']) == 1]

def get_mutation_diffs(files):
    return [(
            Mutation.from_file(path), 
            get_clean_diff(os.path.join(os.path.dirname(path), 'diff.json'))
        ) for path in files]

def mutation_diff_map(project_path, pattern):
    return { mutant:diff for mutant, diff in get_mutation_diffs(glob(os.path.join(project_path, pattern))) }

def get_diffs_for_project(path):
    method_diffs = mutation_diff_map(path, 'results/reneri/observations/methods/*/*/mutation.json')
    test_difss = mutation_diff_map(path, 'results/reneri/observations/tests/*/mutation.json')
    all_mutants = set(method_diffs.keys())
    all_mutants.update(test_difss.keys())
    return [(mutant, test_difss.get(mutant, []), method_diffs.get(mutant, [])) for mutant in all_mutants]

def method_mutant_count(path):
    data = json_load(os.path.join(path, 'results/methods.json'))
    targets = set(['pseudo-tested', 'partially-tested'])
    methods = [record for record in data['methods'] if record['classification'] in targets]
    undetected_mutants = sum(mutant_count(record['mutations']) for record in methods)
    return len(methods), undetected_mutants

def mutant_count(data_or_path):
    if type(data_or_path) == str :
        data = json_load(os.path.join(data_or_path, 'results/mutations.json'))['mutations']
    else:
        data = data_or_path
    return len([record for record in data if record['status'] == 'SURVIVED'])

def rip_count(path):
    propagation = 0
    infection = 0 # Does not count items in propagation
    execution = 0
    for _, test, method in get_diffs_for_project(path):
        if test:
            propagation += 1
        elif method:
            infection += 1
        else:
            execution += 1
    return propagation, infection, execution


def print_stats_for_project(project):
    path = os.path.join('../../subjects', project)
    transformations = mutant_count(path)
    methods, _ = method_mutant_count(path)
    propagation, infection_only, execution_only = rip_count(path)
    print(project, methods, transformations, propagation + infection_only, propagation)

def main():
    for proj in PROJECTS:
        print_stats_for_project(proj)

if __name__ == '__main__':
    main()
