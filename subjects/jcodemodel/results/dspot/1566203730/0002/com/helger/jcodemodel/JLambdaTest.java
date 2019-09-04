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
    public void testExpressionBasic2_add5_rv313_rv4702() throws Exception {
        float __DSPOT_rhs_41 = 0.6382388F;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.div(__DSPOT_rhs_41);
        __DSPOT_invoc_25.component0();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv316_rv8833() throws Exception {
        long __DSPOT_rhs_2172 = -549891124L;
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
        __DSPOT_invoc_24.plus(__DSPOT_rhs_2172);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv354_rv8590() throws Exception {
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
        __DSPOT_invoc_24.eqNull();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv321_rv2600() throws Exception {
        double __DSPOT_rhs_482 = 0.744962449058054;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_24 = __DSPOT_invoc_13.gte0();
        __DSPOT_invoc_24.mul(__DSPOT_rhs_482);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv345_rv1780() throws Exception {
        long __DSPOT_rhs_61 = -1859384303L;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.mul(__DSPOT_rhs_61);
        __DSPOT_invoc_25.gte0();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv349_rv7133() throws Exception {
        float __DSPOT_rhs_1666 = 0.48205772F;
        double __DSPOT_rhs_62 = 0.03424632818794471;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.plus(__DSPOT_rhs_62);
        __DSPOT_invoc_25.plus(__DSPOT_rhs_1666);
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }

    @Test(timeout = 10000)
    public void testExpressionBasic2_add5_rv340_rv8190() throws Exception {
        int __DSPOT_rhs_56 = -164298280;
        final JLambda aLambda = new JLambda();
        final JLambdaParam aParam1 = aLambda.addParam("x");
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        final JLambdaParam aParam2 = aLambda.addParam("y");
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        IJExpression __DSPOT_invoc_13 = aParam1.plus(aParam2);
        aLambda.body().lambdaExpr(aParam1.plus(aParam2));
        String o_testExpressionBasic2_add5__11 = CodeModelTestsHelper.toString(aLambda);
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
        IJExpression __DSPOT_invoc_25 = __DSPOT_invoc_13.mod(__DSPOT_rhs_56);
        __DSPOT_invoc_25.postdecr();
        Assert.assertFalse(((JLambdaParam) (aParam1)).hasType());
        Assert.assertFalse(((JLambdaParam) (aParam2)).hasType());
        Assert.assertEquals("(x, y) -> (x + y)", o_testExpressionBasic2_add5__11);
    }
}

