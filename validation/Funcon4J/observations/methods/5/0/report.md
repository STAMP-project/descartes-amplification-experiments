
The body of the method [`camllight.algebras.typeexprs.TypeExpAlg.tupleType(java.lang.Object,java.util.List)`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/camllight/algebras/typeexprs/TypeExpAlg.java#L54) 
was  replaced by  `return null;`  
yet,  none of the following tests failed:

*  [`tests.reference.typeexprs.TypeExpAlgTest.testTupleType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/typeexprs/TypeExpAlgTest.java)
*  [`tests.reference.patts.PattAlgTest.testPattConstrPatt`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/patts/PattAlgTest.java)


It is possible to observe a difference between the program state when the transformed method is executed and the program state when the original method is executed. This difference is observed right after the method invocation but not from from the top level code of any test.


For one invocation of `tupleType`, it was observed that the return value  was null but should have been non-null.

To solve this problem you may consider to:

* Create a new test case that targets the result of `tupleType` directly, since it could be accessed from a test class.


* Refactor the code that uses this method. Maybe the method is not actually needed in the context that it is being used.

---