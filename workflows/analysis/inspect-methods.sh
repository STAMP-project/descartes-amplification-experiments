IFS=$'\n';
OUTPUT=`cat ../../subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)
for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT_DIR=`basename ${PROJECTS[$idx]}`
    echo $PROJECT_DIR
    pushd . > /dev/null
    cd ../../subjects/$PROJECT_DIR/code
    # mvn clean test
    mvn eu.stamp-project:method-inspector-maven-plugin:2.2-SNAPSHOT:inspect -Doutput=../results/inspected-methods.json
    popd > /dev/null
done