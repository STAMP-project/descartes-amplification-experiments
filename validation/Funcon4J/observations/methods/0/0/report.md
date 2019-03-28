
The body of the method [`funcons.helper.RascalValueComperator.compare(io.usethesource.vallang.IMap,io.usethesource.vallang.IMap)`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/funcons/helper/RascalValueComperator.java#L53) 
was  replaced by  `return 1;`  
yet,  [`tests.reference.exprs.BoolLogicAlgTest.testGreater`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/exprs/BoolLogicAlgTest.java) did not fail. 

When the transformed method is executed, there is no difference with the execution using the original source code. This could mean that the original method always returns the same value. 
Consider creating a modified variant of the  test mentioned  above to make the method produce a different value.

---