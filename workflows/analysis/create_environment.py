import os.path
import os
import sys
import json

if __name__ == '__main__':
    root_path = sys.argv[1]

    with open(os.path.join(root_path, 'projects.json')) as _file:
        projects = json.load(_file)
    
    for item in projects:
        project_folder = item['project'].split('/')[-1]
        os.makedirs(os.path.join(root_path, project_folder))
        with open(os.path.join(root_path, project_folder, 'project.json'), 'w') as _file:
            json.dump(item, _file)


