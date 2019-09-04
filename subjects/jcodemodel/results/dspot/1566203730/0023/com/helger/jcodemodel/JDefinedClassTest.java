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
    public void testCallSuper_rv298_failAssert0() throws Exception {
        try {
            int __DSPOT_index_85 = 1393133913;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
            final JMethod con1 = c1.constructor(JMod.PUBLIC);
            final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
            con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
            final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
            c2._extends(c1);
            final JMethod con2 = c2.constructor(JMod.PUBLIC);
            JBlock __DSPOT_invoc_27 = con2.body().add(JExpr.invokeSuper().arg("Test"));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_27.remove(__DSPOT_index_85);
            org.junit.Assert.fail("testCallSuper_rv298 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 1393133913, Size: 1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv297_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_84 = -1709653648;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
            final JMethod con1 = c1.constructor(JMod.PUBLIC);
            final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
            con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
            final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
            c2._extends(c1);
            final JMethod con2 = c2.constructor(JMod.PUBLIC);
            JBlock __DSPOT_invoc_27 = con2.body().add(JExpr.invokeSuper().arg("Test"));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_27.pos(__DSPOT_nNewPos_84);
            org.junit.Assert.fail("testCallSuper_rv297 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: -1709653648", expected.getMessage());
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
    public void testCallSuper_rv238_failAssert0_literalMutationString7002_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_index_62 = -1660021251;
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "DAL");
                JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_12.remove(__DSPOT_index_62);
                org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_literalMutationString7002 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_mg7514_failAssert0() throws Exception {
        try {
            {
                AbstractJType[] __DSPOT_aArgTypes_2017 = new AbstractJType[]{  };
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
                c2.getConstructor(__DSPOT_aArgTypes_2017);
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_mg7514 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_mg7444_failAssert0() throws Exception {
        try {
            {
                boolean __DSPOT_bIndentRequired_1987 = true;
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
                __DSPOT_invoc_12.indentRequired(__DSPOT_bIndentRequired_1987);
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_mg7444 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_mg7449_failAssert0_literalMutationString18924_failAssert0() throws Exception {
        try {
            {
                {
                    int __DSPOT_index_62 = -1660021251;
                    final JCodeModel cm = new JCodeModel();
                    final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                    final JMethod con1 = c1.constructor(JMod.PUBLIC);
                    final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
                    JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Goxt ").plus(p1)));
                    final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                    c2._extends(c1);
                    final JMethod con2 = c2.constructor(JMod.PUBLIC);
                    con2.body().add(JExpr.invokeSuper().arg("Test"));
                    CodeModelTestsHelper.parseCodeModel(cm);
                    __DSPOT_invoc_12.remove(__DSPOT_index_62);
                    org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
                    __DSPOT_invoc_12.pos();
                }
                org.junit.Assert.fail("testCallSuper_rv238_failAssert0_mg7449 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_mg7449_failAssert0_literalMutationString18924 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }
}

