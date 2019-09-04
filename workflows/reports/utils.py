import json
from glob import glob
from collections.abc import Iterable
from collections import namedtuple, defaultdict
from IPython.display import HTML, display

class TableBuilder:

    def __init__(self, *headers):
        self.headers = headers or []
        
    def display(self, content):
        cells = lambda values: wrap(values, 'td')
        rows = lambda values: wrap((cells(r) for r in values), 'tr')
        header_content = f'<tr>{wrap(self.headers, "th")}</tr>' if self.headers else ""
        content = f'<table>{header_content}{rows(r for r in content)}</table>'
        display(HTML(content))

def wrap(content, tag):
    if not isinstance(content, Iterable) or type(content) == str:
        return f'<{tag}>{content}</{tag}>'
    return "".join(f"<{tag}>{value}</{tag}>" for value in content)

PROJECTS = ['jpush-api-java-client',
            'commons-cli',
            'jopt-simple',
            'yahoofinance-api',
            'gson-fire',
            'j2html',
            'spring-petclinic',
            'javapoet',
            'eaxy',
            'java-html-sanitizer',
            'cron-utils',
            'commons-codec',
            'jsoup',
            'TridentSDK',
            'jcodemodel'
]

def json_load(path, **kwargs):
    with open(path) as _file:
        return json.load(_file, **kwargs)

def json_dump(path, data, **kwargs):
    with open(path, 'w') as _file:
        return json.dump(data, _file, **kwargs)

Mutation = namedtuple('Mutation', 'mutator package class_name method description')

class MutationDecoder(json.JSONDecoder):
    def __init__(self, *args, **kwargs):
        json.JSONDecoder.__init__(self, object_hook=self.object_hook, *args, **kwargs)
    
    def object_hook(self, dct):
        if 'mutator' in dct:
            dct['class_name'] = dct['class']
            del(dct['class'])
            return Mutation(**dct)
        return dct


def computed_improvement(tool='evosuite', max_attempts=10):
    result = defaultdict(lambda : [])
    for project in PROJECTS:
        files = sorted(glob(f'../../subjects/{project}/results/{tool}/*/improvement.json'))
        files = files[:min(len(files), max_attempts)]
        for path in files:
            result[project].append(json_load(path, cls=MutationDecoder))
    return result

