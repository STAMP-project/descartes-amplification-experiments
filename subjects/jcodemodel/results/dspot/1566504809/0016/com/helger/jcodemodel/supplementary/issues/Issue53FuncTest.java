package com.helger.jcodemodel.supplementary.issues;


import com.github.javaparser.ParseProblemException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
import com.helger.jcodemodel.JLambdaParam;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JVar;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.Collection;
import java.util.function.Supplier;
import org.junit.Assert;
import org.junit.Test;


public final class Issue53FuncTest {
    @Test(timeout = 10000)
    public void testIssue_literalMutationString85_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
            final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
            JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
            {
                final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("").arg(methodLambda));
                method.body()._return(lambda);
            }
            method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
            {
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("xx");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body()._return(lambda);
            }
            method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
            {
                final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("xx");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body().decl(generator.ref(Object.class), "x2", lambda);
                method.body().add(l1.invoke("get"));
            }
            CodeModelTestsHelper.parseCodeModel(generator);
            org.junit.Assert.fail("testIssue_literalMutationString85 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testIssue_remove53() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
        final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
        JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
        {
            final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
        {
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
        {
            final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            JVar o_testIssue_remove53__60 = method.body().decl(generator.ref(Object.class), "x2", lambda);
            Assert.assertEquals(-1828400530, ((int) (((JVar) (o_testIssue_remove53__60)).hashCode())));
        }
        CodeModelTestsHelper.parseCodeModel(generator);
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString132_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
            final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
            JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
            {
                final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body()._return(lambda);
            }
            method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
            {
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("xx");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body()._return(lambda);
            }
            method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
            {
                final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("a(!.#b{").arg(methodLambda)));
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("xx");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body().decl(generator.ref(Object.class), "x2", lambda);
                method.body().add(l1.invoke("get"));
            }
            CodeModelTestsHelper.parseCodeModel(generator);
            org.junit.Assert.fail("testIssue_literalMutationString132 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: method name contains \'.\': a(!.#b{", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString97_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
            final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
            JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
            {
                final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body()._return(lambda);
            }
            method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
            {
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body()._return(lambda);
            }
            method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
            {
                final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("xx");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body().decl(generator.ref(Object.class), "x2", lambda);
                method.body().add(l1.invoke("get"));
            }
            CodeModelTestsHelper.parseCodeModel(generator);
            org.junit.Assert.fail("testIssue_literalMutationString97 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_remove53_mg7094() throws Exception {
        String __DSPOT_sMessage_1391 = "P-|]`&.!FBA39?H%al,X";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
        final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
        JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
        {
            final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
        {
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
        {
            final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            JVar o_testIssue_remove53__60 = method.body().decl(generator.ref(Object.class), "x2", lambda);
        }
        CodeModelTestsHelper.parseCodeModel(generator);
        JErrorClass o_testIssue_remove53_mg7094__67 = generator.errorClass(__DSPOT_sMessage_1391);
        Assert.assertFalse(((JErrorClass) (o_testIssue_remove53_mg7094__67)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testIssue_remove53_mg7094__67)).isAbstract());
        Assert.assertEquals("P-|]`&.!FBA39?H%al,X", ((JErrorClass) (o_testIssue_remove53_mg7094__67)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testIssue_remove53_mg7094__67)).isError());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_remove53_mg7094__67)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JErrorClass) (o_testIssue_remove53_mg7094__67)).getPrimitiveType());
        Assert.assertFalse(((JErrorClass) (o_testIssue_remove53_mg7094__67)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_remove53_mg7094__67)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testIssue_remove53_mg7094__67)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testIssue_remove53_mg7094__67)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testIssue_remove53_mg7094__67)).isPrimitive());
    }

    @Test(timeout = 10000)
    public void testIssue_remove53_add7544() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
        final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
        JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
        {
            final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        JNarrowedClass o_testIssue_remove53_add7544__22 = generator.ref(Supplier.class).narrow(String.class);
        Assert.assertTrue(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isArray());
        Assert.assertFalse(((Collection) (((JNarrowedClass) (o_testIssue_remove53_add7544__22)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isError());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testIssue_remove53_add7544__22)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).getPrimitiveType());
        Assert.assertTrue(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(java.util.function.Supplier<java.lang.String>)", ((JNarrowedClass) (o_testIssue_remove53_add7544__22)).toString());
        Assert.assertTrue(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isReference());
        Assert.assertFalse(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isPrimitive());
        method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
        {
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
        {
            final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            JVar o_testIssue_remove53__60 = method.body().decl(generator.ref(Object.class), "x2", lambda);
        }
        CodeModelTestsHelper.parseCodeModel(generator);
        Assert.assertTrue(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isArray());
        Assert.assertFalse(((Collection) (((JNarrowedClass) (o_testIssue_remove53_add7544__22)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isError());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testIssue_remove53_add7544__22)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).getPrimitiveType());
        Assert.assertTrue(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(java.util.function.Supplier<java.lang.String>)", ((JNarrowedClass) (o_testIssue_remove53_add7544__22)).toString());
        Assert.assertTrue(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isReference());
        Assert.assertFalse(((JNarrowedClass) (o_testIssue_remove53_add7544__22)).isPrimitive());
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString73_failAssert0null13026_failAssert0() throws Exception {
        try {
            {
                final JCodeModel generator = new JCodeModel();
                final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
                final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
                JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), null);
                {
                    final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                    method.body()._return(lambda);
                }
                method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
                {
                    final JLambda lambda = new JLambda();
                    final JLambdaParam aParam = lambda.addParam("xx");
                    lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                    method.body()._return(lambda);
                }
                method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
                {
                    final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
                    final JLambda lambda = new JLambda();
                    final JLambdaParam aParam = lambda.addParam("xx");
                    lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                    method.body().decl(generator.ref(Object.class), "x2", lambda);
                    method.body().add(l1.invoke("get"));
                }
                CodeModelTestsHelper.parseCodeModel(generator);
                org.junit.Assert.fail("testIssue_literalMutationString73 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testIssue_literalMutationString73_failAssert0null13026 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_remove53_mg7105() throws Exception {
        String __DSPOT_sNewLine_1396 = "vMc^*I!rX6h9A64M}{;[";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
        final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
        JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
        {
            final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
        {
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
        {
            final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            JVar o_testIssue_remove53__60 = method.body().decl(generator.ref(Object.class), "x2", lambda);
        }
        CodeModelTestsHelper.parseCodeModel(generator);
        JCodeModel o_testIssue_remove53_mg7105__67 = generator.setBuildingNewLine(__DSPOT_sNewLine_1396);
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testIssue_remove53_mg7105__67)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (o_testIssue_remove53_mg7105__67)).getBuildingCharset());
        Assert.assertEquals("vMc^*I!rX6h9A64M}{;[", ((JCodeModel) (o_testIssue_remove53_mg7105__67)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (o_testIssue_remove53_mg7105__67)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testIssue_remove53_add6828() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
        final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
        JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
        {
            final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
        {
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            method.body()._return(lambda);
        }
        method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
        {
            JInvocation o_testIssue_remove53_add6828__41 = JExpr._this().invoke("getValueProvider");
            Assert.assertEquals(1866122145, ((int) (((JInvocation) (o_testIssue_remove53_add6828__41)).hashCode())));
            Assert.assertFalse(((JInvocation) (o_testIssue_remove53_add6828__41)).isConstructor());
            final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
            final JLambda lambda = new JLambda();
            final JLambdaParam aParam = lambda.addParam("xx");
            lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
            JVar o_testIssue_remove53__60 = method.body().decl(generator.ref(Object.class), "x2", lambda);
            Assert.assertEquals(1866122145, ((int) (((JInvocation) (o_testIssue_remove53_add6828__41)).hashCode())));
            Assert.assertFalse(((JInvocation) (o_testIssue_remove53_add6828__41)).isConstructor());
        }
        CodeModelTestsHelper.parseCodeModel(generator);
    }

    @Test(timeout = 10000)
    public void testIssue_remove53_mg7926_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_1557 = 2046124717;
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
            final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
            JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
            {
                final JLambda lambda = JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body()._return(lambda);
            }
            method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrow(String.class), "description2");
            {
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("xx");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body()._return(lambda);
            }
            method = aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
            {
                final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("andThen").arg(methodLambda)));
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("xx");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                JVar o_testIssue_remove53__60 = method.body().decl(generator.ref(Object.class), "x2", lambda);
            }
            CodeModelTestsHelper.parseCodeModel(generator);
            aInterface.constructor(__DSPOT_nMods_1557);
            org.junit.Assert.fail("testIssue_remove53_mg7926 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}

