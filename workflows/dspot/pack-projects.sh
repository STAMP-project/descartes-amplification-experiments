PROJECTS_DIR=../../subjects
ZIP_FILE=dspot-replication.zip

zip $ZIP_FILE {amplify,install}-*.sh
RELATIVE_ZIP_PATH=workflows/dspot/$ZIP_FILE

cd ../../

IFS=$'\n';
OUTPUT=`cat subjects/projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)

zip -ur $RELATIVE_ZIP_PATH subjects/projects.json

for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT_NAME=`basename ${PROJECTS[$idx]}`

    zip -ur $RELATIVE_ZIP_PATH subjects/$PROJECT_NAME/results/amplification-targets.close.json
    zip -ur $RELATIVE_ZIP_PATH subjects/$PROJECT_NAME/results/amplification-targets.json
done
