package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import org.junit.Assert;
import org.junit.Test;


public final class JDefinedClassTest {
    @Test(timeout = 10000)
    public void testCallSuper_mg157_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_37 = "5M(E@of6;bU#J;!9+7]6";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
            final JMethod con1 = c1.constructor(JMod.PUBLIC);
            final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
            con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
            final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
            c2._extends(c1);
            final JMethod con2 = c2.constructor(JMod.PUBLIC);
            con2.body().add(JExpr.invokeSuper().arg("Test"));
            CodeModelTestsHelper.parseCodeModel(cm);
            p1.name(__DSPOT_sName_37);
            org.junit.Assert.fail("testCallSuper_mg157 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'5M(E@of6;bU#J;!9+7]6\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv250_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_65 = 1784252092;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
            final JMethod con1 = c1.constructor(JMod.PUBLIC);
            final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
            con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
            final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
            JDefinedClass __DSPOT_invoc_24 = c2._extends(c1);
            final JMethod con2 = c2.constructor(JMod.PUBLIC);
            con2.body().add(JExpr.invokeSuper().arg("Test"));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_24.constructor(__DSPOT_nMods_65);
            org.junit.Assert.fail("testCallSuper_rv250 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_literalMutationNumber73_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
            final JMethod con1 = c1.constructor(JMod.PUBLIC);
            final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
            con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
            final JDefinedClass c2 = cm._package("myPackage")._class(-1, "DerivedClass");
            c2._extends(c1);
            final JMethod con2 = c2.constructor(JMod.PUBLIC);
            con2.body().add(JExpr.invokeSuper().arg("Test"));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testCallSuper_literalMutationNumber73 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv237_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_61 = 41484259;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
            final JMethod con1 = c1.constructor(JMod.PUBLIC);
            final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
            JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
            final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
            c2._extends(c1);
            final JMethod con2 = c2.constructor(JMod.PUBLIC);
            con2.body().add(JExpr.invokeSuper().arg("Test"));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_12.pos(__DSPOT_nNewPos_61);
            org.junit.Assert.fail("testCallSuper_rv237 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: 41484259", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_literalMutationString42_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
            final JMethod con1 = c1.constructor(JMod.PUBLIC);
            final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "");
            con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
            final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
            c2._extends(c1);
            final JMethod con2 = c2.constructor(JMod.PUBLIC);
            con2.body().add(JExpr.invokeSuper().arg("Test"));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testCallSuper_literalMutationString42 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0() throws Exception {
        try {
            int __DSPOT_index_62 = -1660021251;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
            final JMethod con1 = c1.constructor(JMod.PUBLIC);
            final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
            JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
            final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
            c2._extends(c1);
            final JMethod con2 = c2.constructor(JMod.PUBLIC);
            con2.body().add(JExpr.invokeSuper().arg("Test"));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_12.remove(__DSPOT_index_62);
            org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_literalMutationString9717_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_index_62 = -1660021251;
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
                JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("yq9/").plus(p1)));
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_12.remove(__DSPOT_index_62);
                org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_literalMutationString9717 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_mg10261_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_sName_2792 = "7%L:By4v.5f4K]R#(nG[";
                int __DSPOT_index_62 = -1660021251;
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
                JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_12.remove(__DSPOT_index_62);
                org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
                c2.enumConstant(__DSPOT_sName_2792);
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_mg10261 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_rv10368_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_index_62 = -1660021251;
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
                JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                JBlock __DSPOT_invoc_32 = con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_12.remove(__DSPOT_index_62);
                org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
                __DSPOT_invoc_32.blockSimple();
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_rv10368 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_mg8512_failAssert0() throws Exception {
        try {
            {
                AbstractJType[] __DSPOT_argTypes_2282 = new AbstractJType[]{  };
                int __DSPOT_index_62 = -1660021251;
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
                JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_12.remove(__DSPOT_index_62);
                org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
                con2.hasSignature(__DSPOT_argTypes_2282);
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_mg8512 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }
}

