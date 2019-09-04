#!/bin/bash

echo $1 # Input file with the list of projects
echo $2 # Folder where the results are to be stored

exec 5< $1

bookmark=$3
[ -z $bookmark ] && { bookmark=0; }

index=1
while read -u 5 project; do
    if [ $index -gt $bookmark ]; then
        echo $project
        ./install_project.sh $project `printf P%03d $index` "$2"
    fi
    ((index++))
done

echo "done"