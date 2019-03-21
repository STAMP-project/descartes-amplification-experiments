
When the body of the method `equals` with signature `(Ljava/lang/Object;)Z` declared in the class [`funcons.values.Null`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/funcons/values/Null.java) 
was  replaced by  `return true;` . 
however,  none of these tests fail:

*  [`tests.reference.NullFactoryTest.testNull_`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/NullFactoryTest.java)
*  [`tests.reference.TypeFactoryTest.testBoundType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/TypeFactoryTest.java)
*  [`tests.reference.LogicControlFactoryTest.testEffect`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/LogicControlFactoryTest.java)
*  [`tests.reference.LogicControlFactoryTest.testWhileTrue`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/LogicControlFactoryTest.java)
*  [`tests.reference.ExceptionFactoryTest.testException`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/ExceptionFactoryTest.java)
*  [`tests.reference.patts.PattAlgTest.testPattConstr`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/patts/PattAlgTest.java)
*  [`tests.reference.exprs.ExceptionAlgTest.testTryWithExp`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/exprs/ExceptionAlgTest.java)


When the transformed method is executed, there is no difference with the execution with the original source code. This could mean that the original method always returns the same value. 
Consider creating a modified variant of the  tests listed  above to make the method produce a different value.
