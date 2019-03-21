
When the body of the method `typeId` with signature `(Ljava/lang/String;)Ljava/lang/Object;` declared in the class [`camllight.algebras.typeexprs.TypeExpAlg`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/main/java/camllight/algebras/typeexprs/TypeExpAlg.java) 
was  replaced by  `return null;` . 
however,  none of these tests fail:

*  [`tests.reference.decls.GlobalAlgTest.testDeclTypeDefEquals`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/decls/GlobalAlgTest.java)
*  [`tests.reference.exprs.ExpAlgTest.testTypedExp`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/exprs/ExpAlgTest.java)
*  [`tests.reference.decls.GlobalAlgTest.testDeclRecordType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/decls/GlobalAlgTest.java)
*  [`tests.reference.decls.GlobalAlgTest.testDeclLabelsAndVariantsMultiple`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/decls/GlobalAlgTest.java)
*  [`tests.reference.typeexprs.TypeExpAlgTest.testTypeId`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/typeexprs/TypeExpAlgTest.java)
*  [`tests.reference.decls.GlobalAlgTest.testDeclNewConstrType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/decls/GlobalAlgTest.java)
*  [`tests.reference.typeexprs.TypeExpAlgTest.testBracketedType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/typeexprs/TypeExpAlgTest.java)
*  [`tests.reference.typeexprs.TypeExpAlgTest.testFunctionType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/typeexprs/TypeExpAlgTest.java)
*  [`tests.reference.exprs.ExceptionAlgTest.testRaiseWithArgumentExp`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/exprs/ExceptionAlgTest.java)
*  [`tests.reference.patts.PattAlgTest.testPattType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/patts/PattAlgTest.java)
*  [`tests.reference.typeexprs.TypeExpAlgTest.testTupleType`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/typeexprs/TypeExpAlgTest.java)
*  [`tests.reference.decls.GlobalAlgTest.testDeclConstrException`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/decls/GlobalAlgTest.java)
*  [`tests.reference.exprs.ExceptionAlgTest.testTryWithExp`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/exprs/ExceptionAlgTest.java)
*  [`tests.reference.patts.PattAlgTest.testPattConstrPatt`](https://github.com/manuelleduc/Funcon4J/blob/9d2e32824daee71b895f0d9fa6091ed4de8e1513/language/src/test/java/tests/reference/patts/PattAlgTest.java)


It is possible to observe a difference between the program state when the transformed method is executed and the program state when the original method is executed. This difference is observed right after the method invocation but not from from the top level code of any test.


For one invocation of `typeId`, it was observed that the return value  was null but should have been non-null.

To solve this problem you may consider to:

* Create a new test case that targets the result of `typeId` directly, since it could be accessed from a test class.


* Refactor the code that uses this method. Maybe the method is not actually needed in the context that it is being used.
