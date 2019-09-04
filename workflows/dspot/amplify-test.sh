#!/bin/bash

# This script will use DSpot to amplify a test class or a test case in a Maven project
# Arguments:
# - The project's directory
# - The directory to store the output (Will be created if it doesn't exist)
# - The fully qualified name of the test class
# - The name of the test case (Optional)

set -- $* #BEWARE OF SPACES!!

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

PROJECT_DIR=$1
cd $PROJECT_DIR
PROJECT_DIR=`pwd`

cd $SCRIPT_DIR

OUTPUT_DIR=$2

if [ ! -d "$OUTPUT_DIR" ]; then
    mkdir -p $OUTPUT_DIR
fi
cd $OUTPUT_DIR
OUTPUT_DIR=`pwd`

TEST_CLASS=$3
TEST_CASE=$4

TRAIL="-Dcases=$TEST_CASE"
if [ -z "$TEST_CASE" ]; then
    TRAIL=""
fi


ITERATIONS=3
AMPLIFIERS=MethodAdd,MethodRemove,TestDataMutator,MethodGeneratorAmplifier,NullifierAmplifier,ReturnValueAmplifier

cd $PROJECT_DIR
mvn eu.stamp-project:dspot-maven:2.1.0:amplify-unit-tests -Dverbose -Doutput-path=$OUTPUT_DIR -Diteration=$ITERATIONS -Damplifiers=$AMPLIFIERS -Dtest=$TEST_CLASS $TRAIL

