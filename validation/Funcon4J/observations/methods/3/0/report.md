
When the body of the method `declLabelType` with signature `(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;` declared in the class [`camllight.algebras.decls.GlobalAlg`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/camllight/algebras/decls/GlobalAlg.java) 
was  replaced by  `return null;` . 
however,  none of these tests fail:

*  [`tests.reference.decls.GlobalAlgTest.testDeclLabelsAndVariantsWithVarTypes`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/decls/GlobalAlgTest.java)
*  [`tests.reference.decls.GlobalAlgTest.testDeclRecordType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/decls/GlobalAlgTest.java)
*  [`tests.reference.decls.GlobalAlgTest.testDeclLabelsAndVariantsMultiple`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/decls/GlobalAlgTest.java)


It is possible to observe a difference between the program state when the transformed method is executed and the program state when the original method is executed. This difference is observed right after the method invocation but not from from the top level code of any test.


For one invocation of `declLabelType`, it was observed that the return value  was null but should have been non-null.

To solve this problem you may consider to:

* Create a new test case that targets the result of `declLabelType` directly, since it could be accessed from a test class.


* Refactor the code that uses this method. Maybe the method is not actually needed in the context that it is being used.
