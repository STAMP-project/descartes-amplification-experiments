package com.helger.jcodemodel.supplementary.issues;


import com.github.javaparser.ParseProblemException;
import com.helger.jcodemodel.IJFormatter;
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
import java.util.function.Supplier;
import org.junit.Assert;
import org.junit.Test;


public final class Issue53FuncTest {
    @Test(timeout = 10000)
    public void testIssue_mg181_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_20 = -1684216438;
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
                method.body().decl(generator.ref(Object.class), "x2", lambda);
                method.body().add(l1.invoke("get"));
            }
            CodeModelTestsHelper.parseCodeModel(generator);
            aInterface.constructor(__DSPOT_nMods_20);
            org.junit.Assert.fail("testIssue_mg181 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg220_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_33 = 1839866620;
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
                method.body().decl(generator.ref(Object.class), "x2", lambda);
                method.body().add(l1.invoke("get"));
            }
            CodeModelTestsHelper.parseCodeModel(generator);
            method.paramAtIndex(__DSPOT_nIndex_33);
            org.junit.Assert.fail("testIssue_mg220 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 1839866620, Size: 0", expected.getMessage());
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
    public void testIssue_literalMutationString99_failAssert0() throws Exception {
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
                final JLambdaParam aParam = lambda.addParam("&");
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
            org.junit.Assert.fail("testIssue_literalMutationString99 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'&\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_literalMutationString79_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue53")._interface("ITest");
            final JLambdaMethodRef methodLambda = new JLambdaMethodRef(generator.ref(String.class), "toString");
            JMethod method = aInterface.method(JMod.DEFAULT, generator.ref(Supplier.class).narrowAny(), "description");
            {
                final JLambda lambda = JLambda.simple(JExpr._this().invoke("").invoke("andThen").arg(methodLambda));
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
            org.junit.Assert.fail("testIssue_literalMutationString79 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg208_failAssert0null10205_failAssert0() throws Exception {
        try {
            {
                IJFormatter __DSPOT_f_30 = null;
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
                method.declare(__DSPOT_f_30);
                org.junit.Assert.fail("testIssue_mg208 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testIssue_mg208_failAssert0null10205 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }
}

