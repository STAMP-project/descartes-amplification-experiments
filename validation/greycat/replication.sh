git clone https://github.com/datathings/greycat
cd greycat
git checkout 5ced869407f7612517fc354b41516eb300d8a3f1
cd greycat
mvn eu.stamp-project:pitmp-maven-plugin:1.3.7-EXPERIMENTS:descartes -DoutputFormats=METHODS,JSON,CSV,XML -DtimestampedReports=false -DreportsDirectory=target/ -DexcludedTestClasses=greycatTest.internal.task.RobustnessTests
mvn eu.stamp-project:dissector-monitor:stack-trace -Doutput="target/stack-traces.json" -DclassificationsOfInterest="pseudo-tested,partially-tested"

export MAVEN_OPTS="-Xmx10G"
mvn -X eu.stamp-project:reneri:1.0-EXPERIMENTS:observeMethods -DexcludedTests="greycatTest.internal.heap.HeapSuperTimeTreeChunkTest,greycatTest.internal.heap.HeapEStructArrayTest,greycatTest.internal.heap.HeapTimeTreeChunkTest"
mvn -X eu.stamp-project:reneri:1.0-EXPERIMENTS:observeTests