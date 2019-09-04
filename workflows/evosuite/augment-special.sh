IFS=$'\n';
OUTPUT=`cat subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)

for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT=`basename ${PROJECTS[$idx]}`
    if [ -f "subjects/$PROJECT/results/generation-targets.special.json" ]; then
        echo $PROJECT
        ./augment-project.sh $PROJECT special
    fi
done