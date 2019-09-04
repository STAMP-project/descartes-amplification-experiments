IFS=$'\n';
OUTPUT=`cat ../../subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)
for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT_DIR=`basename ${PROJECTS[$idx]}`
    echo $PROJECT_DIR
    pushd . > /dev/null
    cd ../../subjects/$PROJECT_DIR/code
    # mvn clean test 2>/dev/null | egrep "^Tests run: [0-9]+, Failures: [0-9]+, Errors: [0-9]+, Skipped: [0-9]+$" | egrep -o '[0-9]+' | awk '{n += $1}; END{print n}'
    mvn clean test 2>/dev/null | egrep "Tests run: [0-9]+, Failures: [0-9]+, Errors: [0-9]+, Skipped: [0-9]+$"
    popd > /dev/null
done