import os
import argparse
import json
import jinja2
import itertools
from os.path import join, exists, dirname
from glob import glob

TEMPLATE = '''
**Method:** `{{package}}.{{class}}.{{name}}{{description}}`
**Transformations:** `{{ mutators | join('`, `') }}`

| Transformation | Infection | Propagation | Testable |
|----------------|-----------|-------------|----------|
{% for item in mutators %}| {{item | code | left(width=14) }} |           |             |          |
{% endfor %}

# Environment

Covered by {{ tests | length }} test classes.

## Method

```Java

```

## Tests

```Java
```

## Observations

'''

def main(path_to_project, path_to_reports):
    env = jinja2.Environment()
    env.filters['code'] = lambda value: "`{}`".format(value)
    env.filters['left'] = lambda value, width, fill=' ': value.ljust(width, fill) 
    template = env.from_string(TEMPLATE)

    for method in get_methods(path_to_project):
        report_path = ensure_unique_report_file(path_to_reports, method)
        os.makedirs(dirname(report_path), exist_ok=True)
        with open(report_path, 'w') as report:
            report.write(template.render(method))    

def ensure_unique_report_file(path_to_reports, method):
    report_path = join(path_to_reports, "{package}.{class}.{name}.md".format(**method))
    index = itertools.count()
    while exists(report_path):
        report_path = join(path_to_reports, "{package}.{class}.{name}.{index}.md".format(**method, index=next(index)))
    return report_path

def load_json(path_to_file):    
    with open(path_to_file) as _file:
        return json.load(_file)

def get_methods(project_directory):
    for directory in sorted(glob(join(project_directory,'results', 'reneri', 'observations', 'methods', '*'))):
        yield get_method_info(directory)


def get_method_info(method_directory):
    mutators = set()
    tests = set()
    data = None
    for mutation_file in glob(join(method_directory, '?', 'mutation.json')):
        data = load_json(mutation_file)
        mutators.add(data['mutator'])
        if 'tests' in data:
            tests.update(data.get('tests', []))
    return {
        'name': data['method'],
        'description': data['description'],
        'class': data['class'],
        'package': data['package'],
        'mutators': mutators,
        'tests': tests
    }

if __name__ == "__main__":
    project = 'spring-petclinic'
    main(f'/Users/overaper/Projects/pseudo-amplification/subjects/{project}/', f'../../descriptions/{project}')
