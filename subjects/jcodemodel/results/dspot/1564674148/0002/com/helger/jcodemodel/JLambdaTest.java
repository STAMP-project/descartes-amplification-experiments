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
    public void testExpressionBasic2_add5_rv610_rv3793() throws Exception {
        long __DSPOT_rhs_765 = 1442934833L;
        int __DSPOT_rhs_110 = 1680715790;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.shrz(__DSPOT_rhs_110);
        __DSPOT_invoc_25.div(__DSPOT_rhs_765);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv609_rv7841() throws Exception {
        int __DSPOT_rhs_109 = -533813102;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.shr(__DSPOT_rhs_109);
        __DSPOT_invoc_25.eq0();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv606_rv8360() throws Exception {
        long __DSPOT_rhs_2022 = 1159423273L;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.preincr();
        __DSPOT_invoc_24.minus(__DSPOT_rhs_2022);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv598_rv9485() throws Exception {
        float __DSPOT_rhs_2348 = 0.594495F;
        String __DSPOT_rhs_103 = "}Lq8xal:7%uE_&Ml%;sG";
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.plus(__DSPOT_rhs_103);
        __DSPOT_invoc_25.plus(__DSPOT_rhs_2348);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv533_rv6670() throws Exception {
        double __DSPOT_rhs_75 = 0.12524565311120617;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.div(__DSPOT_rhs_75);
        __DSPOT_invoc_25.lte0();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv557_rv8487() throws Exception {
        float __DSPOT_rhs_2077 = 0.62356263F;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.lt0();
        __DSPOT_invoc_24.div(__DSPOT_rhs_2077);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv541_rv9657() throws Exception {
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.eqNull();
        __DSPOT_invoc_24.gte0();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }
}

