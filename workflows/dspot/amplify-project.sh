#!/bin/bash

PROJECT=$1

SUBJECTS_DIR=subjects

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

FOLDER=`date +"%s"`
OUTPUT=$(cat "$SUBJECTS_DIR/$PROJECT/results/amplification-targets.close.json" | jq -r '.[] | "\(.class) \(.method + "")"')
IFS=$'\n'; TARGETS=($OUTPUT);

for ((idx=0; idx < ${#TARGETS[@]}; ++idx)); do
    ITEM=`printf "%04g" $idx`
    $SCRIPT_DIR/amplify-test.sh "$SUBJECTS_DIR/$PROJECT/code" "$SUBJECTS_DIR/$PROJECT/results/dspot/$FOLDER/$ITEM" ${TARGETS[$idx]}
done