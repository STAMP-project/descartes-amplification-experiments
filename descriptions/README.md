This folder contains descriptions of methods where at least one extreme transformation was created and was not detected by the test suite.

Each description includes the undetected extreme transformations, the method and other involved class members, an example of a test case executing the method (unless irrelevant) and some observations.

The description also include conclusions on whether the immediate program state (after the method call) is altered for the existing test inputs while applying the extreme transformations. Also whether this change is propagated to an augmented observation point in the test code and whether the method could be tested by adding one assertion to an existing test case or requires the creation of a new input.

These conclusions are shown in a table with three columns: `Infection`, `Propagation` and `Testable`.
For the two first column, each transformation may have a `Y` or `N` value which standing for `Yes` and `No` respectively.
A cell in the `Testable` column may contain `A`, `I` or `N`. These value mean that the transformation could be tested by:
* adding an assertion to an existing test case (`A`)
* requires a new input (`I`)
* can not be tested without modifying the existing code base (`N`)
