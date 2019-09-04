#!/bin/bash

EXCLUSIONS=$1

function descartes() {
    mvn eu.stamp-project:pitmp-maven-plugin:1.3.7-EXPERIMENTS:descartes -DoutputFormats=METHODS,JSON,CSV,XML -DtimestampedReports=false -DreportsDirectory=/results
}

function reneri_methods() {
    mvn eu.stamp-project:reneri:1.0-EXPERIMENTS:observeMethods -DouputFolder=/results/reneri -DmethodReport=/results/methods.json
}

function reneri_tests() {
    mvn eu.stamp-project:reneri:1.0-EXPERIMENTS:observeTests -Dtransformations=/results/mutations.json -DouputFolder=/results/reneri -DexcludedTests="$EXCLUSIONS" 
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
    ${COMMAND[@]} > "/results/$NAME.output.txt" 2>&1
    local RESULT=$?

    # Record time at the end
    local END_TIME=`date +"%s"`

    # Record progress
    echo "$NAME exit code $RESULT from $START_TIME to $END_TIME" >> "/results/progress.txt"

    # Exit if one step failed
    [ ! $RESULT -eq 0 ] && { exit 1; }

    return $RESULT
}

execute_step build mvn clean test -DskipTests=true
execute_step descartes descartes
execute_step methods reneri_methods
execute_step tests reneri_tests

