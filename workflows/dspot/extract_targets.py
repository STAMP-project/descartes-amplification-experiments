# This script extracts the test cases/classes to amplify according to the output given by Descartes

import re
import json

from glob import glob
from os.path import dirname, join



TEST_CASE_PATTERN = re.compile(r"^(?P<test>.+)\.((?P<case>[^\[]+)(?P<params>\[.*\])?\((?P=test)\)|(?P=test))$");

class AmplificationTarget:

    def __init__(self, test, case, **kwargs):
        self.test = test
        self.case = case
        self.mutants = []

    def id(self):
        return f'{self.test}.{self.case}'

    def __eq__(self, other):
        return self.id() == other.id()

    def __hash__(self):
        return hash(self.id())

    def include(self, mutant):
        self.mutants.append(mutant)
    
    def to_dict(self):
        result = { 'mutants': self.mutants, 'test': self.test }
        if self.case:
            result['case'] = self.case
        return result
    
    @staticmethod
    def from_line(line):
        match = TEST_CASE_PATTERN.match(line)
        if not match:
            return None
        return AmplificationTarget(**match.groupdict())

def get_amplification_targets(report):
    targets = dict()
    mutants = [ mut for mut in report['mutations'] if mut['status'] == 'SURVIVED' ]
    for mut in mutants:
        record = { 'mutator': mut['mutator'], 'method': mut['method'] }
        for test in mut['tests']['ordered']:
            at = AmplificationTarget.from_line(test)
            if at.id() not in targets:
                at.include(record)
                targets[at.id()] = at
            else:
                targets[at.id()].include(record)
    return [ at.to_dict() for at in targets.values() ]



def main(): 
    for path in glob('../../subjects/*/results/mutations.json'):
        print(path)
        with open(path) as report_file:
            targets = get_amplification_targets(json.load(report_file))
            with open(join(dirname(path), 'amplification-targets.json'), 'w') as result:
                json.dump(targets, result)


if __name__ == '__main__':
    main()
