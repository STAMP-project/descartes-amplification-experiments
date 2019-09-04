package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;


public final class JDefinedClassTest {
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
    public void testCallSuper_mg92_failAssert0_literalMutationNumber9081_failAssert0() throws Exception {
        try {
            {
                File __DSPOT_aDestDir_5 = new File("[Iz>YSe|%xHdm7#=ToX)");
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(-1, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
                con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                cm.build(__DSPOT_aDestDir_5);
                org.junit.Assert.fail("testCallSuper_mg92 should have thrown IOException");
            }
            org.junit.Assert.fail("testCallSuper_mg92_failAssert0_literalMutationNumber9081 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_rv3103_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_string_687 = ".F%Q%Rh<DFMF%&a%r^,B";
                int __DSPOT_index_62 = -1660021251;
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "str");
                JBlock __DSPOT_invoc_12 = con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                JDefinedClass __DSPOT_invoc_29 = c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_12.remove(__DSPOT_index_62);
                org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
                __DSPOT_invoc_29.direct(__DSPOT_string_687);
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_rv3103 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSupernull203_failAssert0_add5994_failAssert0() throws Exception {
        try {
            {
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), null);
                con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
                cm._package("myPackage")._class(0, "DerivedClass");
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "DerivedClass");
                c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                org.junit.Assert.fail("testCallSupernull203 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testCallSupernull203_failAssert0_add5994 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_rv238_failAssert0_mg2179_failAssert0() throws Exception {
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
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_12.remove(__DSPOT_index_62);
                org.junit.Assert.fail("testCallSuper_rv238 should have thrown ArrayIndexOutOfBoundsException");
                c1.containsErrorTypes();
            }
            org.junit.Assert.fail("testCallSuper_rv238_failAssert0_mg2179 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1660021251", expected.getMessage());
        }
    }
}

