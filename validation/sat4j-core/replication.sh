
export MAVEN_OPTS="-Xmx10G"



cd org.sat4j.core/
mvn -X eu.stamp-project:reneri:observeMethods -DtestTimes=2
mvn -X eu.stamp-project:reneri:observeTests -DtestTimes=2 -DexcludedTests=org.sat4j.BugSAT34
mvn -X eu.stamp-project:reneri:hints