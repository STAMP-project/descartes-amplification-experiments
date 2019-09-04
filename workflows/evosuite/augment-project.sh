# The working directory of this script is assumed to be the folder that contains the subjects directory

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

FILE_SUFFIX=$2

if [ "$FILE_SUFFIX" ]; then
    FILE_SUFFIX=".$FILE_SUFFIX"
else
    FILE_SUFFIX=""
fi

PROJECT_DIR=`pwd`/subjects/$1
EVOSUITE_DIR=$PROJECT_DIR/results/evosuite

CP=`head -n 1 $PROJECT_DIR/results/.classpath`
COMPILE_CP=$SCRIPT_DIR/evosuite-standalone-runtime-1.0.7-SNAPSHOT.jar:$CP
PIT_CP=$SCRIPT_DIR/pitest-1.4.3.jar:$SCRIPT_DIR/pitest-command-line-1.4.3.jar:$SCRIPT_DIR/pitest-entry-1.4.3.jar:$SCRIPT_DIR/descartes-1.2.5-SNAPSHOT.jar:$SCRIPT_DIR/evosuite-standalone-runtime-1.0.7-SNAPSHOT.jar:$SCRIPT_DIR/pitest-evosuite-plugin-1.0-SNAPSHOT.jar

TIMESTAMP=`date +"%s"`

[ ! -d $EVOSUITE_DIR ] && { mkdir $EVOSUITE_DIR; }

CURRENT_ATTEMPT_DIR=$EVOSUITE_DIR/$TIMESTAMP
mkdir $CURRENT_ATTEMPT_DIR

FOLDER=`date +"%s"`

OUTPUT_FROM_JSON=$(cat "$PROJECT_DIR/results/generation-targets$FILE_SUFFIX.json" | jq -r '.[] | "\(.package).\(.class) \(.name)\(.description)"')
IFS=$'\n'; TARGETS=($OUTPUT_FROM_JSON);
IFS=' '
COUNT=${#TARGETS[@]}
ORIGINAL_TARGET_COUNT=$(cat "$PROJECT_DIR/results/generation-targets.json" | jq -r '.|length')
OFFSET=$((ORIGINAL_TARGET_COUNT-COUNT))
for ((idx=0; idx < ${#TARGETS[@]}; ++idx)); do
    
    # Generate
    ITEM=`printf "%04g" $((idx+OFFSET))`
    ITEM_DIR=$CURRENT_ATTEMPT_DIR/$ITEM
    CLASS_METHOD=( ${TARGETS[$idx]} )
    mkdir $ITEM_DIR
    java -jar $SCRIPT_DIR/evosuite-master-1.0.7-SNAPSHOT.jar -generateSuite -class ${CLASS_METHOD[0]}  -base_dir "$ITEM_DIR"  -Dtarget_method="${CLASS_METHOD[1]}" -DCP_file_path="$PROJECT_DIR/results/.classpath" -Duse_separate_classloader=false

    pushd . > /dev/null
    
    # Compile
    cd $ITEM_DIR/evosuite-tests/
    [ -d bin ] && { rm -rf bin; }
    mkdir bin
    TO_COMPILE=`find . -name "*.java" | sort -r | tr '\n' ' '` #Sorting backguards so the "scaffolding class is always compiled first"

    echo $TO_COMPILE > to_compile.txt
    echo $COMPILE_CP > ccp.txt

    javac -cp "$COMPILE_CP" -Xlint:deprecation -d bin/ $TO_COMPILE

    # Validate
    java -cp $PIT_CP \
    org.pitest.mutationtest.commandline.MutationCoverageReport \
    --reportDir . \
    --timestampedReports=false \
    --targetClasses "${CLASS_METHOD[0]},*Test" \
    --threads 4 \
    --verbose true \
    --outputFormats METHODS,JSON \
    --failWhenNoMutations off \
    --classPath "`pwd`/bin,${CP//:/,}" \
    --mutableCodePath $PROJECT_DIR/code/target/classes \
    --sourceDirs $PROJECT_DIR/code/src/main/java,$PROJECT_DIR/code/src/test/java \
    --testPlugin evosuite \
    --mutationEngine descartes &> pitest.output.txt

    popd > /dev/null
done

