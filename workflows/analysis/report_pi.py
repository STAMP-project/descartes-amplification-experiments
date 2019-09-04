import os
from glob import glob
from os.path import exists, dirname, join
from generate_report_files import load_json

{
  "mutator": "null",
  "class": "ArrayTypeName",
  "package": "com.squareup.javapoet",
  "method": "get",
  "description": "(Ljava/lang/reflect/GenericArrayType;Ljava/util/Map;)Lcom/squareup/javapoet/ArrayTypeName;",
  "tests": [
    "com.squareup.javapoet.TypeNameTest"
  ]
}

def report(path_to_project, diff_files):
    for diff_path in diff_files:
        print(diff_path)
        differences = load_json(diff_path)
        for item in differences:
            if len(item['expected']) == 1:
                print('+', item['pointcut'])
                mutation = load_json(join(dirname(diff_path), 'mutation.json'))
                print('| {mutator} => {package}.{class}.{method}{description}'.format(**mutation))
                print()
                break

def report_propagation(path_to_project):
    report(path_to_project, glob(join(path_to_project, 'target', 'reneri', 'observations', 'tests', '*', 'diff.json')))

def report_infection(path_to_project):
    report(path_to_project, glob(join(path_to_project, 'target', 'reneri', 'observations', 'methods', '*', '*', 'diff.json')))

def main(path_to_project):
    print(path_to_project)
    print("Infection")
    report_infection(path_to_project)
    print("Propagation")
    report_propagation(path_to_project)

if __name__ == "__main__":
    import sys
    main(f'/Users/overaper/Projects/playground/{sys.argv[1]}/')
