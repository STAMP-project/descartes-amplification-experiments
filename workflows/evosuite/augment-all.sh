IFS=$'\n';
OUTPUT=`cat subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)

for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT=`basename ${PROJECTS[$idx]}`
    echo $PROJECT
    ./augment-project.sh $PROJECT
done