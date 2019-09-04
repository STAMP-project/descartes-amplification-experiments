IFS=$'\n';
OUTPUT=`cat subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT_DIR=`basename ${PROJECTS[$idx]}`
    echo $PROJECT_DIR
    $SCRIPT_DIR/amplify-project.sh $PROJECT_DIR
done