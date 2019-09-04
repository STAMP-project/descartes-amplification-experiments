#!/bin/bash

function descartes() {
    mvn eu.stamp-project:pitmp-maven-plugin:1.3.7-EXPERIMENTS:descartes -DoutputFormats=METHODS,JSON,CSV,XML -DtimestampedReports=false -DreportsDirectory=../results
}

function reneri_methods() {
    mvn -X eu.stamp-project:reneri:1.0-EXPERIMENTS:observeMethods -DouputFolder=../results/reneri -DmethodReport=../results/methods.json -DexcludedTests="$EXCLUSIONS"
}

function reneri_tests() {
    mvn -X eu.stamp-project:reneri:1.0-EXPERIMENTS:observeTests -Dtransformations=../results/mutations.json -DouputFolder=../results/reneri -DexcludedTests="$EXCLUSIONS" 
}


function execute_step () {
    local PARAMETERS=("$@")
    local COMMAND=("${PARAMETERS[@]:1}")
    local NAME=("${PARAMETERS[0]}")

    echo "Executing $NAME"

    # Record time before start
    local START_TIME=`date +"%s"`
    
    echo "Starting at $START_TIME"

    # Execute the command and store the output
    ${COMMAND[@]} > "../results/$NAME.output.txt" 2>&1
    local RESULT=$?

    # Record time at the end
    local END_TIME=`date +"%s"`

    # Record progress
    echo "$NAME exit code $RESULT from $START_TIME to $END_TIME" >> "../results/progress.txt"

    # Exit if one step failed
    [ ! $RESULT -eq 0 ] && { exit 1; }

    return $RESULT
}

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

PROJECT_DIR=$1

[ ! -d "$PROJECT_DIR" ] && { echo "Input directory: $PROJECT_DIR does not exist"; exit 1; }

cd "$PROJECT_DIR"
PROJECT_DIR=`pwd`

[ ! -f project.json ] && { echo "Input directory: $PROJECT_DIR does not contain a project.json file"; exit 2; }

GITHUB_ID=`cat project.json | jq -r ".project"`
REVISION=`cat project.json | jq -r ".revision"`
EXCLUSIONS=`cat project.json | jq -r ".exclude[]" |  xargs | sed -e 's/ /,/g'`

[ ! -d results ] && mkdir results

# Clone the repository
git clone "https://github.com/$GITHUB_ID" code/ > /dev/null 2>&1
cd code
git checkout $REVISION

export MAVEN_OPTS="-Xmx10G"

execute_step build mvn clean test -DskipTests=true
execute_step descartes descartes
execute_step methods reneri_methods
execute_step tests reneri_tests