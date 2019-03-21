git clone https://github.com/manuelleduc/Funcon4J
cd Funcon4J
git checkout 9d2e32824daee71b895f0d9fa6091ed4de8e1513
cd language
mvn clean install
mvn eu.stamp-project:pitmp-maven-plugin:1.3.7-EXPERIMENTS:descartes -DoutputFormats=METHODS,JSON,CSV,XML -DtimestampedReports=false -DreportsDirectory=target/
mvn eu.stamp-project:dissector-monitor:stack-trace -Doutput="target/stack-traces.json" -DclassificationsOfInterest="pseudo-tested,partially-tested"
mvn -X eu.stamp-project:reneri:1.0-EXPERIMENTS:observeMethods
mvn -X eu.stamp-project:reneri:1.0-EXPERIMENTS:observeTests
