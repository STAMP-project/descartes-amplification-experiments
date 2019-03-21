
When the body of the method `equals` with signature `(Ljava/lang/Object;)Z` declared in the class [`funcons.values.Undefined`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/funcons/values/Undefined.java) 
was  replaced by  `return true;` . 
however,  none of these tests fail:

*  [`tests.reference.NullFactoryTest.testUndefined`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/NullFactoryTest.java)
*  [`tests.reference.RecursiveFactoryTest.testFreshFwds`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/RecursiveFactoryTest.java)
*  [`tests.reference.RecursiveFactoryTest.testSetForwards`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/RecursiveFactoryTest.java)


When the transformed method is executed, there is no difference with the execution with the original source code. This could mean that the original method always returns the same value. 
Consider creating a modified variant of the  tests listed  above to make the method produce a different value.
