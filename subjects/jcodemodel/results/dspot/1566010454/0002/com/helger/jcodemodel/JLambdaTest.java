package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import com.helger.jcodemodel.writer.JCMWriter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public final class JLambdaTest {
    private static final String CRLF = JCMWriter.getDefaultNewLine();

    @Test(timeout = 10000)
    public void testExpressionBasic2_literalMutationString11_failAssert0() throws Exception {
        try {
            final JLambda aLambda = new JLambda();
            final JLambdaParam aParam1 = aLambda.addParam("x");
            final JLambdaParam aParam2 = aLambda.addParam("");
            aLambda.body().lambdaExpr(aParam1.plus(aParam2));
            CodeModelTestsHelper.toString(aLambda);
            org.junit.Assert.fail("testExpressionBasic2_literalMutationString11 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
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
    public void testExpressionBasic2_add5_rv320_rv7648() throws Exception {
        int __DSPOT_nIndex_1608 = 1242773915;
        int __DSPOT_rhs_44 = 830860305;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.gt(__DSPOT_rhs_44);
        __DSPOT_invoc_25.component(__DSPOT_nIndex_1608);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv330_rv8474() throws Exception {
        double __DSPOT_rhs_1823 = 0.4739873354673444;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.minus();
        __DSPOT_invoc_24.mul(__DSPOT_rhs_1823);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv344_rv8725() throws Exception {
        int __DSPOT_rhs_1906 = -613858790;
        double __DSPOT_rhs_59 = 0.03424632818794471;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.plus(__DSPOT_rhs_59);
        __DSPOT_invoc_25.minus(__DSPOT_rhs_1906);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv316_rv6181() throws Exception {
        int __DSPOT_rhs_42 = -1794034100;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.div(__DSPOT_rhs_42);
        __DSPOT_invoc_25.lte0();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv338_rv7038() throws Exception {
        int __DSPOT_rhs_1456 = 1571772007;
        float __DSPOT_rhs_56 = 0.07505207F;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.mul(__DSPOT_rhs_56);
        __DSPOT_invoc_25.lt(__DSPOT_rhs_1456);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv310_rv3743() throws Exception {
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.complement();
        __DSPOT_invoc_24.ne0();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv321_rv5044() throws Exception {
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.gt0();
        __DSPOT_invoc_24.minus();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }
}

