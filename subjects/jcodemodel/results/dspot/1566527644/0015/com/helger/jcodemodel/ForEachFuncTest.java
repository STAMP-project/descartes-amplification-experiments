package com.helger.jcodemodel;


import com.github.javaparser.ParseProblemException;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;


public final class ForEachFuncTest {
    @Test(timeout = 10000)
    public void testBasic_rv301_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_92 = 1252622390;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            JBlock __DSPOT_invoc_32 = foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_32.pos(__DSPOT_nNewPos_92);
            org.junit.Assert.fail("testBasic_rv301 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: 1252622390", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg138_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_32 = 416956815;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            m.paramAtIndex(__DSPOT_nIndex_32);
            org.junit.Assert.fail("testBasic_mg138 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 416956815, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv302_failAssert0() throws Exception {
        try {
            int __DSPOT_index_93 = -1939453367;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            JBlock __DSPOT_invoc_32 = foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_32.remove(__DSPOT_index_93);
            org.junit.Assert.fail("testBasic_rv302 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1939453367", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg105_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_20 = 903257748;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            cls.constructor(__DSPOT_nMods_20);
            org.junit.Assert.fail("testBasic_mg105 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg171_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_45 = "Xd&W_#*uaYP&<w$N`nJW";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            $list.name(__DSPOT_sName_45);
            org.junit.Assert.fail("testBasic_mg171 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'Xd&W_#*uaYP&<w$N`nJW\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasicnull218_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, null);
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasicnull218 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv265_failAssert0() throws Exception {
        try {
            String __DSPOT_sMethod_76 = "0C-?9AC*$S oY.>c^U!$";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            JBlock __DSPOT_invoc_24 = foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_24.invokeThis(__DSPOT_sMethod_76);
            org.junit.Assert.fail("testBasic_rv265 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: method name contains \'.\': 0C-?9AC*$S oY.>c^U!$", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_literalMutationString43_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "(q2 5[gp");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasic_literalMutationString43 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'(q2 5[gp\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_literalMutationString73_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("U&z");
            foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasic_literalMutationString73 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv263_failAssert0() throws Exception {
        try {
            String __DSPOT_sMethod_75 = "7}kh?A:jNYySysP>6W.t";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.body().decl(cm.INT, "getCount");
            final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
            final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
            final AbstractJClass $integerclass = cm.ref(Integer.class);
            final JForEach foreach = m.body().forEach($integerclass, "count", $list);
            final JVar $count1 = foreach.var();
            JBlock __DSPOT_invoc_24 = foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
            final JFieldRef out1 = cm.ref(System.class).staticRef("out");
            foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_24.invoke(__DSPOT_sMethod_75);
            org.junit.Assert.fail("testBasic_rv263 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: method name contains \'.\': 7}kh?A:jNYySysP>6W.t", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv302_failAssert0_literalMutationNumber2300_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_index_93 = -1939453367;
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass cls = cm._class("Test");
                final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
                m.body().decl(cm.INT, "getCount");
                final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
                final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
                final AbstractJClass $integerclass = cm.ref(Integer.class);
                final JForEach foreach = m.body().forEach($integerclass, "count", $list);
                final JVar $count1 = foreach.var();
                foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(20));
                final JFieldRef out1 = cm.ref(System.class).staticRef("out");
                JBlock __DSPOT_invoc_32 = foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_32.remove(__DSPOT_index_93);
                org.junit.Assert.fail("testBasic_rv302 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testBasic_rv302_failAssert0_literalMutationNumber2300 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1939453367", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv302_failAssert0_mg12673_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_sName_3760 = "U+ IB)GRXs`LlK%v+L$H";
                int __DSPOT_index_93 = -1939453367;
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass cls = cm._class("Test");
                final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
                m.body().decl(cm.INT, "getCount");
                final AbstractJClass arrayListclass = cm.ref(ArrayList.class);
                final JVar $list = m.body().decl(arrayListclass, "alist", JExpr._new(arrayListclass));
                final AbstractJClass $integerclass = cm.ref(Integer.class);
                final JForEach foreach = m.body().forEach($integerclass, "count", $list);
                final JVar $count1 = foreach.var();
                foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
                final JFieldRef out1 = cm.ref(System.class).staticRef("out");
                JBlock __DSPOT_invoc_32 = foreach.body().add(JExpr.invoke(out1, "println").arg($count1));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_32.remove(__DSPOT_index_93);
                org.junit.Assert.fail("testBasic_rv302 should have thrown ArrayIndexOutOfBoundsException");
                arrayListclass.getInnerClass(__DSPOT_sName_3760);
            }
            org.junit.Assert.fail("testBasic_rv302_failAssert0_mg12673 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1939453367", expected.getMessage());
        }
    }
}

