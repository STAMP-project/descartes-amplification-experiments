#!/bin/bash

# Usage: install_project.sh <GITHUB_ID> <id> <data_folder>

## Count by a value
# cat log.json | jq '[.networkAlarm[] | select(.severity == "CRITICAL")] | length'

function create_folder() {
    [ ! -d "$1" ] && mkdir "$1"   
}

function create_m2_settings() {
cat > m2/settings.xml << EOS
<settings>
    <profiles>
        <profile>
            <id>allow-snapshots</id>
            <activation><activeByDefault>true</activeByDefault></activation>
            <repositories>
                <repository>
                    <id>snapshots-repo</id>
                    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
                    <releases><enabled>false</enabled></releases>
                    <snapshots><enabled>true</enabled></snapshots>
                </repository>
            </repositories>
            <pluginRepositories>
                <pluginRepository>
                    <id>plugin-snapshots</id>
                    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
                    <releases><enabled>false</enabled></releases>
                    <snapshots><enabled>true</enabled></snapshots>
                </pluginRepository>
            </pluginRepositories>
        </profile>
    </profiles>
</settings>
EOS
}

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

GITHUB_ID=$1
PROJECT_ID=$2
DATA_FOLDER=$3

[ ! -d "$DATA_FOLDER" ] && { echo "Folder: $DATA_FOLDER does not exist"; exit 1; }
cd "$DATA_FOLDER"

create_folder "$PROJECT_ID"
cd "$PROJECT_ID"

# Clone the repository
git clone "https://github.com/$GITHUB_ID" code/ > /dev/null 2>&1

create_folder m2
create_m2_settings

create_folder results

cd code

echo $GITHUB_ID > ../results/github.txt

# Get the last commit
git log -1 --format="%H" > ../results/latest_commit.txt

# Get the release tag
RELEASE_TAG=`curl --silent https://api.github.com/repos/$GITHUB_ID/releases/latest | jq -r ".tag_name"`

if [ $RELEASE_TAG != 'null' ]; then 
    # If there is a release tag then go to the right commit
    git checkout $RELEASE_TAG
    echo $RELEASE_TAG > ../results/latest_release.txt
fi

cd ../


echo "$GITHUB_ID"

PROJECT_PATH=`pwd`

# Run the analysis
docker run -i --dns="131.254.130.100" \
-v "$PROJECT_PATH/m2":/root/.m2 \
-v "$PROJECT_PATH/code":/code \
-v "$PROJECT_PATH/commits":/commits \
-v "$PROJECT_PATH/results":/results \
-v "$SCRIPT_DIR":/commons \
-w "/code/$POMFD" maven:3.5.4-jdk-8 /commons/analyze_project.sh


METHODS_FOUND="NO"

if [ -f "$PROJECT_PATH/results/methods.json" ]; then
    METHODS_FOUND=`cat "$PROJECT_PATH/results/methods.json" | jq '[.methods[] | select(.classification == "partially-tested" or .classification == "pseudo-tested")] | length'`
fi
