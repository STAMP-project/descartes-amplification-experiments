package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import com.helger.jcodemodel.writer.JCMWriter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public final class JLambdaTest {
    private static final String CRLF = JCMWriter.getDefaultNewLine();

    @Test(timeout = 10000)
    public void testExpressionBasic2_literalMutationString13_failAssert0() throws Exception {
        try {
            final JLambda aLambda = new JLambda();
            final JLambdaParam aParam1 = aLambda.addParam("x");
            final JLambdaParam aParam2 = aLambda.addParam("*");
            aLambda.body().lambdaExpr(aParam1.plus(aParam2));
            CodeModelTestsHelper.toString(aLambda);
            org.junit.Assert.fail("testExpressionBasic2_literalMutationString13 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'*\'", expected.getMessage());
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
    public void testExpressionBasic2_add5_rv737_rv7975() throws Exception {
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.predecr();
        __DSPOT_invoc_24.predecr();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv672_rv7153() throws Exception {
        JArrayCompRef __DSPOT_o_1467 = null;
        int __DSPOT_nIndex_109 = -673318014;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        JArrayCompRef __DSPOT_invoc_25 = __DSPOT_invoc_13.component(__DSPOT_nIndex_109);
        boolean o_testExpressionBasic2_add5_rv672_rv7153__21 = __DSPOT_invoc_25.equals(__DSPOT_o_1467);
        Assert.assertFalse(o_testExpressionBasic2_add5_rv672_rv7153__21);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv672_rv7152() throws Exception {
        int __DSPOT_nIndex_109 = -673318014;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        JArrayCompRef __DSPOT_invoc_25 = __DSPOT_invoc_13.component(__DSPOT_nIndex_109);
        __DSPOT_invoc_25.array();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv719_rv5628() throws Exception {
        float __DSPOT_rhs_1115 = 0.20835598F;
        long __DSPOT_rhs_128 = -1830319410L;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.mod(__DSPOT_rhs_128);
        __DSPOT_invoc_25.mul(__DSPOT_rhs_1115);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv720_rv8436() throws Exception {
        int __DSPOT_rhs_1845 = -8814093;
        double __DSPOT_rhs_129 = 0.6314454887711912;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.mul(__DSPOT_rhs_129);
        __DSPOT_invoc_25.shl(__DSPOT_rhs_1845);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv685_rv8235() throws Exception {
        int __DSPOT_rhs_1754 = -2144298797;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.eq0();
        __DSPOT_invoc_24.gt(__DSPOT_rhs_1754);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv686_rv4053() throws Exception {
        int __DSPOT_rhs_774 = -1790467420;
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
        __DSPOT_invoc_24.lt(__DSPOT_rhs_774);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }
}

