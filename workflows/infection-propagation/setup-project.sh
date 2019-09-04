#!/bin/bash

function create_dir() {
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
                    <releases><enabled>true</enabled></releases>
                    <snapshots><enabled>true</enabled></snapshots>
                </repository>
                <repository>
                    <id>deploy-repo</id>
                    <url>https://oss.sonatype.org/service/local/staging/deploy/maven2/</url>
                    <releases><enabled>true</enabled></releases>
                    <snapshots><enabled>true</enabled></snapshots>
                </repository>
            </repositories>
            <pluginRepositories>
                <pluginRepository>
                    <id>plugin-snapshots</id>
                    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
                    <releases><enabled>true</enabled></releases>
                    <snapshots><enabled>true</enabled></snapshots>
                </pluginRepository>
                <pluginRepository>
                    <id>plugin-deploy</id>
                    <url>https://oss.sonatype.org/service/local/staging/deploy/maven2/</url>
                    <releases><enabled>true</enabled></releases>
                    <snapshots><enabled>true</enabled></snapshots>
                </pluginRepository>
            </pluginRepositories>
        </profile>
    </profiles>
</settings>
EOS
}

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

PROJECT_DIR=$1

[ ! -d "$PROJECT_DIR" ] && { echo "Input directory: $PROJECT_DIR does not exist"; exit 1; }

cd "$PROJECT_DIR"

[ ! -f project.json ] && { echo "Input directory: $PROJECT_DIR does not contain a project.json file"; exit 2; }

GITHUB_ID=`cat project.json | jq -r ".project"`
REVISION=`cat project.json | jq -r ".revision"`
EXCLUSIONS=`cat project.json | jq -r ".exclude[]" |  xargs | sed -e 's/ /,/g'`

# Set upt local Maven repository
create_dir m2
create_m2_settings

create_dir results

# Clone the repository
git clone "https://github.com/$GITHUB_ID" code/ > /dev/null 2>&1
cd code
git checkout $REVISION
cd ..

PROJECT_DIR=`pwd`

# Run the analysis
docker run -i --dns="131.254.130.100" \
-v "$PROJECT_DIR/m2":/root/.m2 \
-v "$PROJECT_DIR/code":/code \
-v "$PROJECT_DIR/results":/results \
-v "$SCRIPT_DIR":/commons \
-w "/code" maven:3.5.4-jdk-8 /commons/docker-find-hints.sh
