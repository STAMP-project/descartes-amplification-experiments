

OUTPUT=evosuite-replication.zip
RELATIVE_ZIP_PATH=workflows/evosuite/$OUTPUT

# Include binary files
zip $OUTPUT ./*.jar
zip -ur $OUTPUT {augment,install}-*.sh

cd ../../

IFS=$'\n';
OUTPUT=`cat subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)

zip -ur $RELATIVE_ZIP_PATH subjects/projects.json

for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT_NAME=`basename ${PROJECTS[$idx]}`
    zip -ur $RELATIVE_ZIP_PATH subjects/$PROJECT_NAME/results/mutations.json
    zip -ur $RELATIVE_ZIP_PATH subjects/$PROJECT_NAME/results/generation-targets.json
    zip -ur $RELATIVE_ZIP_PATH subjects/$PROJECT_NAME/results/generation-targets.special.json
done


