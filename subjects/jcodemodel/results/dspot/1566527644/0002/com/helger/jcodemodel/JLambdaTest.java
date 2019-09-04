package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import com.helger.jcodemodel.writer.JCMWriter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public final class JLambdaTest {
    private static final String CRLF = JCMWriter.getDefaultNewLine();

    @Test(timeout = 10000)
    public void testExpressionBasic2_literalMutationString10_failAssert0() throws Exception {
        try {
            final JLambda aLambda = new JLambda();
            final JLambdaParam aParam1 = aLambda.addParam("-");
            final JLambdaParam aParam2 = aLambda.addParam("y");
            aLambda.body().lambdaExpr(aParam1.plus(aParam2));
            CodeModelTestsHelper.toString(aLambda);
            org.junit.Assert.fail("testExpressionBasic2_literalMutationString10 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'-\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add3() throws Exception {
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add3__13 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add3__13);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_mg18() throws Exception {
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_mg18__10 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_mg18__10);
        List<JLambdaParam> o_testExpressionBasic2_mg18__11 = aLambda.params();
        Assert.assertFalse(o_testExpressionBasic2_mg18__11.isEmpty());
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_mg18__10);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv355_rv10123() throws Exception {
        int __DSPOT_rhs_2444 = 555549935;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.postdecr();
        __DSPOT_invoc_24.plus(__DSPOT_rhs_2444);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv329_rv9600() throws Exception {
        int __DSPOT_rhs_2284 = -1886143579;
        int __DSPOT_rhs_51 = 303201396;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.lt(__DSPOT_rhs_51);
        __DSPOT_invoc_25.lte(__DSPOT_rhs_2284);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv354_rv3940() throws Exception {
        long __DSPOT_rhs_70 = 1931980183L;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.plus(__DSPOT_rhs_70);
        __DSPOT_invoc_25.eqNull();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv340_rv5933() throws Exception {
        int __DSPOT_rhs_1323 = -169537792;
        long __DSPOT_rhs_59 = -1649700730L;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.minus(__DSPOT_rhs_59);
        __DSPOT_invoc_25.mul(__DSPOT_rhs_1323);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv333_rv2900() throws Exception {
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.lte0();
        __DSPOT_invoc_24.minus();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv328_mg6213() throws Exception {
        long __DSPOT_v_1407 = -971690491L;
        String __DSPOT_sMethod_50 = "[Iz>YSe|%xHdm7#=ToX)";
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        JInvocation o_testExpressionBasic2_add5_rv328__17 = __DSPOT_invoc_13.invoke(__DSPOT_sMethod_50);
        Assert.assertFalse(((JInvocation) (o_testExpressionBasic2_add5_rv328__17)).isConstructor());
        JInvocation o_testExpressionBasic2_add5_rv328_mg6213__21 = o_testExpressionBasic2_add5_rv328__17.arg(__DSPOT_v_1407);
        Assert.assertFalse(((JInvocation) (o_testExpressionBasic2_add5_rv328_mg6213__21)).isConstructor());
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        Assert.assertFalse(((JInvocation) (o_testExpressionBasic2_add5_rv328__17)).isConstructor());
    }
}

