
The body of the method [`funcons.helper.RascalValueComperator.compare(funcons.values.Variable,funcons.values.Variable)`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/funcons/helper/RascalValueComperator.java#L78) 
was  replaced by  `return 1;`  
yet,  [`tests.reference.exprs.BoolLogicAlgTest.testGreater`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/exprs/BoolLogicAlgTest.java) did not fail. 

It is possible to observe a difference between the program state when the transformed method is executed and the program state when the original method is executed. This difference is observed right after the method invocation but not from from the top level code of any test.


For one invocation of `compare`, it was observed that the return value  was `1` but should have been `0`.

To solve this problem you may consider to:

* Create a new test case that targets the result of `compare` directly, since it could be accessed from a test class.


* Refactor the code that uses this method. Maybe the method is not actually needed in the context that it is being used.

---