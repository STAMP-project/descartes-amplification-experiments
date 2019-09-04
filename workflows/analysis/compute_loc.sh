IFS=$'\n';
OUTPUT=`cat ../../subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)

for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT_DIR=`basename ${PROJECTS[$idx]}`
    # cloc --json ../../subjects/$PROJECT_DIR/code/src/main > ../../subjects/$PROJECT_DIR/results/loc.json
    # cloc --json ../../subjects/$PROJECT_DIR/code/src/test > ../../subjects/$PROJECT_DIR/results/test-loc.json
    echo $PROJECT_DIR
    cloc ../../subjects/$PROJECT_DIR/code/src/main
    cloc ../../subjects/$PROJECT_DIR/code/src/test
done