package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import org.junit.Assert;
import org.junit.Test;


public final class JDefinedClassTest {
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
    public void testCallSuper_mg145_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_32 = -2086871735;
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
            con1.paramAtIndex(__DSPOT_nIndex_32);
            org.junit.Assert.fail("testCallSuper_mg145 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -2086871735 out of bounds for length 1", expected.getMessage());
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
            org.junit.Assert.fail("testCallSuper_rv238 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -1660021251 out of bounds for length 1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_literalMutationNumber33_failAssert0() throws Exception {
        try {
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
            org.junit.Assert.fail("testCallSuper_literalMutationNumber33 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testCallSuper_literalMutationString76_failAssert0_literalMutationString4238_failAssert0() throws Exception {
        try {
            {
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass c1 = cm._package("myPackage")._class(0, "BaseClass");
                final JMethod con1 = c1.constructor(JMod.PUBLIC);
                final JVar p1 = con1.param(JMod.FINAL, cm.ref(String.class), "#:k");
                con1.body().add(new JFieldRef(cm.ref(System.class), "out").invoke("println").arg(JExpr.lit("Got ").plus(p1)));
                final JDefinedClass c2 = cm._package("myPackage")._class(0, "");
                c2._extends(c1);
                final JMethod con2 = c2.constructor(JMod.PUBLIC);
                con2.body().add(JExpr.invokeSuper().arg("Test"));
                CodeModelTestsHelper.parseCodeModel(cm);
                org.junit.Assert.fail("testCallSuper_literalMutationString76 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testCallSuper_literalMutationString76_failAssert0_literalMutationString4238 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'#:k\'", expected.getMessage());
        }
    }
}

