
When the body of the method `compare` with signature `(Lio/usethesource/vallang/IMap;Lio/usethesource/vallang/IMap;)I` declared in the class [`funcons.helper.RascalValueComperator`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/funcons/helper/RascalValueComperator.java) 
was  replaced by  `return 1;` . 
however,  [`tests.reference.exprs.BoolLogicAlgTest.testGreater`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/exprs/BoolLogicAlgTest.java) does not fail. 

When the transformed method is executed, there is no difference with the execution with the original source code. This could mean that the original method always returns the same value. 
Consider creating a modified variant of the  test mentioned  above to make the method produce a different value.
