package com.helger.jcodemodel.supplementary.issues;


import com.github.javaparser.ParseProblemException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
import com.helger.jcodemodel.JLambdaParam;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JVar;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.io.File;
import java.io.IOException;
import java.util.function.Supplier;
import org.junit.Assert;
import org.junit.Test;


public final class Issue53FuncTest {
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
    public void testIssue_literalMutationString125_failAssert0() throws Exception {
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
                final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("vnj|}8wu]&8(Dgh`").invoke("andThen").arg(methodLambda)));
                final JLambda lambda = new JLambda();
                final JLambdaParam aParam = lambda.addParam("xx");
                lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                method.body().decl(generator.ref(Object.class), "x2", lambda);
                method.body().add(l1.invoke("get"));
            }
            CodeModelTestsHelper.parseCodeModel(generator);
            org.junit.Assert.fail("testIssue_literalMutationString125 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString154_failAssert0_literalMutationString3838_failAssert0() throws Exception {
        try {
            {
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
                    method.body().decl(generator.ref(Object.class), "", lambda);
                    method.body().add(l1.invoke("8(J"));
                }
                CodeModelTestsHelper.parseCodeModel(generator);
                org.junit.Assert.fail("testIssue_literalMutationString154 should have thrown ParseProblemException");
            }
            org.junit.Assert.fail("testIssue_literalMutationString154_failAssert0_literalMutationString3838 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_remove53_mg14815() throws Exception {
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
        boolean o_testIssue_remove53_mg14815__66 = generator.buildsErrorTypeRefs();
        Assert.assertFalse(o_testIssue_remove53_mg14815__66);
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString129_failAssert0null9392_failAssert0() throws Exception {
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
                    final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValueProvider").invoke("an!dThen").arg(methodLambda)));
                    final JLambda lambda = new JLambda();
                    final JLambdaParam aParam = lambda.addParam("xx");
                    lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                    method.body().decl(generator.ref(Object.class), "x2", lambda);
                    method.body().add(l1.invoke("get"));
                }
                CodeModelTestsHelper.parseCodeModel(generator);
                org.junit.Assert.fail("testIssue_literalMutationString129 should have thrown ParseProblemException");
            }
            org.junit.Assert.fail("testIssue_literalMutationString129_failAssert0null9392 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg162_failAssert0_add11517_failAssert0() throws Exception {
        try {
            {
                File __DSPOT_aResourceDir_7 = new File("=,y4JV)d4}^w[&oDAIOw");
                File __DSPOT_aSrcDir_6 = new File("[*WW4JN-$nw<}7EGpwmm", "(EQndBdj-qEHp!#I]LDW");
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
                aInterface.method(JMod.DEFAULT, generator.VOID, "description3");
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
                generator.build(__DSPOT_aSrcDir_6, __DSPOT_aResourceDir_7);
                org.junit.Assert.fail("testIssue_mg162 should have thrown IOException");
            }
            org.junit.Assert.fail("testIssue_mg162_failAssert0_add11517 should have thrown IOException");
        } catch (IOException expected) {
            Assert.assertEquals("=,y4JV)d4}^w[&oDAIOw: non-existent directory", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_remove51_failAssert0null4622_failAssert0() throws Exception {
        try {
            {
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
                    method.body().decl(generator.ref(Object.class), null, lambda);
                    method.body().add(l1.invoke("get"));
                }
                CodeModelTestsHelper.parseCodeModel(generator);
                org.junit.Assert.fail("testIssue_remove51 should have thrown IllegalStateException");
            }
            org.junit.Assert.fail("testIssue_remove51_failAssert0null4622 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString84_failAssert0_literalMutationString6792_failAssert0_literalMutationString45879_failAssert0() throws Exception {
        try {
            {
                {
                    final JCodeModel generator = new JCodeModel();
                    final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
                    final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
                    JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
                    {
                        final JLambda lambda = JLambda.simple(JExpr._this().invoke("TFs2l>UgIvC=TU&z").invoke("andThen").arg(methodLambda));
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
                        final JVar l1 = method.body().decl(generator.ref(Supplier.class).narrowAny(), "x1", JLambda.simple(JExpr._this().invoke("getValuemProvider").invoke("andThen").arg(methodLambda)));
                        final JLambda lambda = new JLambda();
                        final JLambdaParam aParam = lambda.addParam("xx");
                        lambda.body().lambdaExpr(aParam.invoke("getValueProvider").invoke("andThen").arg(methodLambda));
                        method.body().decl(generator.ref(Object.class), "x2", lambda);
                        method.body().add(l1.invoke("get"));
                    }
                    CodeModelTestsHelper.parseCodeModel(generator);
                    org.junit.Assert.fail("testIssue_literalMutationString84 should have thrown ParseProblemException");
                }
                org.junit.Assert.fail("testIssue_literalMutationString84_failAssert0_literalMutationString6792 should have thrown ParseProblemException");
            }
            org.junit.Assert.fail("testIssue_literalMutationString84_failAssert0_literalMutationString6792_failAssert0_literalMutationString45879 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
            Assert.assertEquals("(line 8,col 22) Illegal left hand side of an assignment.\n", expected.getMessage());
        }
    }
}

