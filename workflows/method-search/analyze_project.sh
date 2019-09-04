#!/bin/bash

# Maven local repository in /root/.m2 
# Source code (also working directory) in /code
# Folder with commits in /commits
# Common scripts in /commons
# Results to be stored in /results


function execute_step () {
    local PARAMETERS=("$@")
    local COMMAND=("${PARAMETERS[@]:2}")
    local RESTRICTION=("${PARAMETERS[0]}") 
    local NAME=("${PARAMETERS[1]}")

    echo "Executing $NAME"

    # Record time before start
    date +"%s" > "/results/$NAME.time.txt"

    # Execute the command and store the output
    ${COMMAND[@]} > "/results/$NAME.output.txt" 2>&1
    local RESULT=$?

    # Record time at the end
    date +"%s" >> "/results/$NAME.time.txt"

    # Record progress
    echo "$NAME $RESULT" >> "/results/progress.txt"

    [ $RESTRICTION == "mandatory" ] && [[ ! $RESULT -eq 0 ]] && { exit 1; }

    return $RESULT
}

# To overcome issues with quotes
function run_descartes() {
    #mvn eu.stamp-project:pitmp-maven-plugin:1.3.7-SNAPSHOT:descartes -DoutputFormats=METHODS,JSON,CSV -DtimestampedReports=false -DreportsDirectory=/results -Dfeatures="+STOP_METHODS(except[to_string] except[getter] except[setter] except[delegate])"
    mvn eu.stamp-project:pitmp-maven-plugin:1.3.7-SNAPSHOT:descartes -DoutputFormats=METHODS,JSON,CSV -DtimestampedReports=false -DreportsDirectory=/results
}

function run_inspector() {
    mvn eu.stamp-project:method-inspector-maven-plugin:inspect -Doutput="/results/inspected-methods.json"
}

function run_dissector() {
    mvn eu.stamp-project:dissector-monitor:stack-trace -Doutput="/results/stack-traces.json" -DmethodsOfInterest="/results/methods.json" -DclassificationsOfInterest="pseudo-tested,partially-tested"
}

function count_tests() {
    mvn eu.stamp-project:dissector-monitor:2.0-SNAPSHOT:count-tests -Doutput="/results/test-methods-found.json"
}

execute_step mandatory build mvn clean test

execute_step mandatory descartes run_descartes

execute_step optional inspector run_inspector

execute_step optional count_tests count_tests

execute_step optional dissector run_dissector
