import json
from os.path import exists
from glob import glob

NAMES = set([
    'jpush-api-java-client',
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
])

def read_json(path):
    with open(path) as _file:
        return json.load(_file)

def compute_stats(data):
    numbers = [ len(method['tests']) for method in data['methods'] if method['classification'].endswith('-tested') ]
    return min(numbers), max(numbers), len(numbers), sum(numbers)


def main():
    total = 0
    minimum = 1000000
    maximum = -1
    full_sum = 0
    for item in NAMES:
        method_file_path = f'../../subjects/{item}/results/methods.json'
        if not exists(method_file_path):
            continue
        m, M, c, s = compute_stats(read_json(method_file_path))
        minimum = min(m, minimum)
        maximum = max(M, maximum)
        total += c
        full_sum += s
        print(item, m, M, s/c)
    print(minimum, maximum, full_sum/total)


if __name__ == '__main__':
    main()