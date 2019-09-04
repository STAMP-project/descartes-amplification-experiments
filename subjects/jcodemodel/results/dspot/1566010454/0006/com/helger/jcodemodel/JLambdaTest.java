package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import com.helger.jcodemodel.writer.JCMWriter;
import org.junit.Assert;
import org.junit.Test;


public final class JLambdaTest {
    private static final String CRLF = JCMWriter.getDefaultNewLine();

    @Test(timeout = 10000)
    public void testIssue62_literalMutationString20_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JVar holder = new JVar(JMods.forVar(0), cm.ref(Object.class), "-", null);
            final JLambda aLambda = new JLambda();
            final JLambdaParam arr = aLambda.addParam("arr");
            final JBlock setBody = aLambda.body().synchronizedBlock(holder).body();
            setBody.add(JExpr.invoke(cm, holder, "entrySet").invoke("retainAll").arg(arr.invoke("entrySet")));
            String String_20 = (((((((((("arr -> {" + (JLambdaTest.CRLF)) + "    synchronized (a)") + (JLambdaTest.CRLF)) + "    {") + (JLambdaTest.CRLF)) + "        a.entrySet().retainAll(arr.entrySet());") + (JLambdaTest.CRLF)) + "    }") + (JLambdaTest.CRLF)) + "}") + (JLambdaTest.CRLF);
            CodeModelTestsHelper.toString(aLambda);
            org.junit.Assert.fail("testIssue62_literalMutationString20 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'-\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue62_rv145_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_53 = 1271429239;
            final JCodeModel cm = new JCodeModel();
            final JVar holder = new JVar(JMods.forVar(0), cm.ref(Object.class), "a", null);
            final JLambda aLambda = new JLambda();
            final JLambdaParam arr = aLambda.addParam("arr");
            final JBlock setBody = aLambda.body().synchronizedBlock(holder).body();
            JBlock __DSPOT_invoc_15 = setBody.add(JExpr.invoke(cm, holder, "entrySet").invoke("retainAll").arg(arr.invoke("entrySet")));
            String String_144 = (((((((((("arr -> {" + (JLambdaTest.CRLF)) + "    synchronized (a)") + (JLambdaTest.CRLF)) + "    {") + (JLambdaTest.CRLF)) + "        a.entrySet().retainAll(arr.entrySet());") + (JLambdaTest.CRLF)) + "    }") + (JLambdaTest.CRLF)) + "}") + (JLambdaTest.CRLF);
            CodeModelTestsHelper.toString(aLambda);
            __DSPOT_invoc_15.pos(__DSPOT_nNewPos_53);
            org.junit.Assert.fail("testIssue62_rv145 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: 1271429239", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue62_mg72_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_24 = "(?xw0]W#nkib%A@IY:Wo";
            final JCodeModel cm = new JCodeModel();
            final JVar holder = new JVar(JMods.forVar(0), cm.ref(Object.class), "a", null);
            final JLambda aLambda = new JLambda();
            final JLambdaParam arr = aLambda.addParam("arr");
            final JBlock setBody = aLambda.body().synchronizedBlock(holder).body();
            setBody.add(JExpr.invoke(cm, holder, "entrySet").invoke("retainAll").arg(arr.invoke("entrySet")));
            String String_72 = (((((((((("arr -> {" + (JLambdaTest.CRLF)) + "    synchronized (a)") + (JLambdaTest.CRLF)) + "    {") + (JLambdaTest.CRLF)) + "        a.entrySet().retainAll(arr.entrySet());") + (JLambdaTest.CRLF)) + "    }") + (JLambdaTest.CRLF)) + "}") + (JLambdaTest.CRLF);
            CodeModelTestsHelper.toString(aLambda);
            holder.name(__DSPOT_sName_24);
            org.junit.Assert.fail("testIssue62_mg72 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'(?xw0]W#nkib%A@IY:Wo\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue62_rv146_failAssert0() throws Exception {
        try {
            int __DSPOT_index_54 = 528037162;
            final JCodeModel cm = new JCodeModel();
            final JVar holder = new JVar(JMods.forVar(0), cm.ref(Object.class), "a", null);
            final JLambda aLambda = new JLambda();
            final JLambdaParam arr = aLambda.addParam("arr");
            final JBlock setBody = aLambda.body().synchronizedBlock(holder).body();
            JBlock __DSPOT_invoc_15 = setBody.add(JExpr.invoke(cm, holder, "entrySet").invoke("retainAll").arg(arr.invoke("entrySet")));
            String String_145 = (((((((((("arr -> {" + (JLambdaTest.CRLF)) + "    synchronized (a)") + (JLambdaTest.CRLF)) + "    {") + (JLambdaTest.CRLF)) + "        a.entrySet().retainAll(arr.entrySet());") + (JLambdaTest.CRLF)) + "    }") + (JLambdaTest.CRLF)) + "}") + (JLambdaTest.CRLF);
            CodeModelTestsHelper.toString(aLambda);
            __DSPOT_invoc_15.remove(__DSPOT_index_54);
            org.junit.Assert.fail("testIssue62_rv146 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 528037162, Size: 1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue62_literalMutationNumber15_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JVar holder = new JVar(JMods.forVar(-1), cm.ref(Object.class), "a", null);
            final JLambda aLambda = new JLambda();
            final JLambdaParam arr = aLambda.addParam("arr");
            final JBlock setBody = aLambda.body().synchronizedBlock(holder).body();
            setBody.add(JExpr.invoke(cm, holder, "entrySet").invoke("retainAll").arg(arr.invoke("entrySet")));
            String String_15 = (((((((((("arr -> {" + (JLambdaTest.CRLF)) + "    synchronized (a)") + (JLambdaTest.CRLF)) + "    {") + (JLambdaTest.CRLF)) + "        a.entrySet().retainAll(arr.entrySet());") + (JLambdaTest.CRLF)) + "    }") + (JLambdaTest.CRLF)) + "}") + (JLambdaTest.CRLF);
            CodeModelTestsHelper.toString(aLambda);
            org.junit.Assert.fail("testIssue62_literalMutationNumber15 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}

