#!/bin/bash

for file in ../../second_result/P???; do
    if [ -f "$file/results/methods.json" ]; then
        METHODS_FOUND=`cat "$file/results/methods.json" | jq '[.methods[] | select(.classification == "partially-tested" or .classification == "pseudo-tested")] | length'`
        echo `cat $file/results/github.txt` $METHODS_FOUND
    fi
done