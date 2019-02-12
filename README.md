Open-science repository containing results and a replication pack for experiments on how to leverage the output of [Descartes](https://github.com/STAMP-project/pitest-descartes) and [Reneri](https://github.com/STAMP-project/reneri) to improve the test suite of a given project.

## Descriptions

The [descriptions folder](descriptions/) contains detailed descriptions of methods where at least one extreme transformation was created and was not detected by the test suite.
Each description shows the method, the number of test classes executing the method, an example of a test case involving the method and some remarks. All descriptions include conclusions on whether the immediate program state, after the method call, is altered for the existing test inputs and applying the extreme transformations. Also whether this change is propagated to an augmented observation point in the test code and whether the method could be tested by adding one assertion to an existing test case or requires the creation of a new input.
