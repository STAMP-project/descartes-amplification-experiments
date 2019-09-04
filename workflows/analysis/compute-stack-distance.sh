IFS=$'\n';
OUTPUT=`cat subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)

for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT_NAME=`basename ${PROJECTS[$idx]}`
    pushd . > /dev/null

    cd subjects/$PROJECT_NAME/code

    mvn clean test

    mvn eu.stamp-project:dissector-monitor:distance-to-test -DmethodsOfInterest=../results/methods.json -DclassificationsOfInterest=pseudo-tested,partially-tested

    popd > /dev/null
done