
cd subjects

IFS=$'\n';
OUTPUT=`cat projects.json | jq -r ".[].project"`
PROJECTS=($OUTPUT)
OUTPUT=`cat projects.json | jq -r ".[].revision"`
REVISIONS=($OUTPUT)

for ((idx=0; idx < ${#PROJECTS[@]}; ++idx)); do
    PROJECT_DIR=`basename ${PROJECTS[$idx]}`
    [ ! -d $PROJECT_DIR ] && mkdir $PROJECT_DIR
    cd $PROJECT_DIR
    echo "Clonning ${PROJECTS[$idx]} into $PROJECT_DIR"
    git clone https://github.com/${PROJECTS[$idx]} code > /dev/null
    cd code
    echo "Switching to ${REVISIONS[$idx]}"
    git checkout ${REVISIONS[$idx]} > /dev/null
    cd ..
    [ ! -d results ] && mkdir results
    cd ..
    echo "Done"
done
