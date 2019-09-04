package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public final class JInvocationTest {
    @Test(timeout = 10000)
    public void testWithGenerics_rv600_failAssert0() throws Exception {
        try {
            int __DSPOT_index_129 = -1360057752;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("TestInvocation");
            final JTypeVar tc = cls.generify("IMPL");
            final JMethod mc = cls.constructor(JMod.PUBLIC);
            mc.param(JMod.FINAL, tc, "ctor");
            final JMethod m1 = cls.method(JMod.PUBLIC, cm.VOID, "foo1");
            final JTypeVar tv1 = m1.generify("T");
            m1.param(JMod.FINAL, tv1, "foo");
            m1.body()._return();
            final JMethod m1a = cls.method(JMod.PUBLIC, cm.VOID, "foo1a");
            final JTypeVar tv1a = m1a.generify("T", BigInteger.class);
            m1a.param(JMod.FINAL, tv1a, "foo");
            m1a.body()._return();
            final JMethod m1b = cls.method(JMod.PUBLIC, cm.VOID, "foo1b");
            m1b.param(JMod.FINAL, cm.ref(Comparator.class).narrow(cm.ref(CharSequence.class).wildcardSuper()), "foo");
            m1b.body()._return();
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, "foo2");
            final JTypeVar tv21 = m2.generify("T");
            final JTypeVar tv22 = m2.generify("U");
            final JTypeVar tv23 = m2.generify("V");
            m2.param(JMod.FINAL, tv21, "t");
            m2.param(JMod.FINAL, tv22, "u");
            m2.param(JMod.FINAL, tv23, "v");
            m2.body()._return();
            final JMethod minvoke = cls.method(JMod.PUBLIC, cm.VOID, "bar");
            minvoke.body().add(JExpr._new(cls).narrow(Integer.class).arg(cm.INT.wrap(JExpr.lit(17))));
            JBlock __DSPOT_invoc_55 = minvoke.body().add(JExpr.invokeThis(m1).narrow(String.class).arg("jippie"));
            minvoke.body().add(JExpr.invoke(m1).arg("jippie"));
            minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_55.remove(__DSPOT_index_129);
            org.junit.Assert.fail("testWithGenerics_rv600 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -1360057752 out of bounds for length 5", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_literalMutationString146_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("TestInvocation");
            final JTypeVar tc = cls.generify("IMPL");
            final JMethod mc = cls.constructor(JMod.PUBLIC);
            mc.param(JMod.FINAL, tc, "ctor");
            final JMethod m1 = cls.method(JMod.PUBLIC, cm.VOID, "foo1");
            final JTypeVar tv1 = m1.generify("T");
            m1.param(JMod.FINAL, tv1, "foo");
            m1.body()._return();
            final JMethod m1a = cls.method(JMod.PUBLIC, cm.VOID, "foo1a");
            final JTypeVar tv1a = m1a.generify("T", BigInteger.class);
            m1a.param(JMod.FINAL, tv1a, "foo");
            m1a.body()._return();
            final JMethod m1b = cls.method(JMod.PUBLIC, cm.VOID, "foo1b");
            m1b.param(JMod.FINAL, cm.ref(Comparator.class).narrow(cm.ref(CharSequence.class).wildcardSuper()), "");
            m1b.body()._return();
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, "foo2");
            final JTypeVar tv21 = m2.generify("T");
            final JTypeVar tv22 = m2.generify("U");
            final JTypeVar tv23 = m2.generify("V");
            m2.param(JMod.FINAL, tv21, "t");
            m2.param(JMod.FINAL, tv22, "u");
            m2.param(JMod.FINAL, tv23, "v");
            m2.body()._return();
            final JMethod minvoke = cls.method(JMod.PUBLIC, cm.VOID, "bar");
            minvoke.body().add(JExpr._new(cls).narrow(Integer.class).arg(cm.INT.wrap(JExpr.lit(17))));
            minvoke.body().add(JExpr.invokeThis(m1).narrow(String.class).arg("jippie"));
            minvoke.body().add(JExpr.invoke(m1).arg("jippie"));
            minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testWithGenerics_literalMutationString146 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv498_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_86 = "!8p#]q;a7/ez@l%MFZw!";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("TestInvocation");
            final JTypeVar tc = cls.generify("IMPL");
            final JMethod mc = cls.constructor(JMod.PUBLIC);
            mc.param(JMod.FINAL, tc, "ctor");
            final JMethod m1 = cls.method(JMod.PUBLIC, cm.VOID, "foo1");
            final JTypeVar tv1 = m1.generify("T");
            m1.param(JMod.FINAL, tv1, "foo");
            m1.body()._return();
            final JMethod m1a = cls.method(JMod.PUBLIC, cm.VOID, "foo1a");
            final JTypeVar tv1a = m1a.generify("T", BigInteger.class);
            m1a.param(JMod.FINAL, tv1a, "foo");
            m1a.body()._return();
            final JMethod m1b = cls.method(JMod.PUBLIC, cm.VOID, "foo1b");
            JVar __DSPOT_invoc_26 = m1b.param(JMod.FINAL, cm.ref(Comparator.class).narrow(cm.ref(CharSequence.class).wildcardSuper()), "foo");
            m1b.body()._return();
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, "foo2");
            final JTypeVar tv21 = m2.generify("T");
            final JTypeVar tv22 = m2.generify("U");
            final JTypeVar tv23 = m2.generify("V");
            m2.param(JMod.FINAL, tv21, "t");
            m2.param(JMod.FINAL, tv22, "u");
            m2.param(JMod.FINAL, tv23, "v");
            m2.body()._return();
            final JMethod minvoke = cls.method(JMod.PUBLIC, cm.VOID, "bar");
            minvoke.body().add(JExpr._new(cls).narrow(Integer.class).arg(cm.INT.wrap(JExpr.lit(17))));
            minvoke.body().add(JExpr.invokeThis(m1).narrow(String.class).arg("jippie"));
            minvoke.body().add(JExpr.invoke(m1).arg("jippie"));
            minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_26.name(__DSPOT_sName_86);
            org.junit.Assert.fail("testWithGenerics_rv498 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv595_failAssert0() throws Exception {
        try {
            String __DSPOT_sMethod_126 = "0]>?iJ#]gu.p/60%FD2[";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("TestInvocation");
            final JTypeVar tc = cls.generify("IMPL");
            final JMethod mc = cls.constructor(JMod.PUBLIC);
            mc.param(JMod.FINAL, tc, "ctor");
            final JMethod m1 = cls.method(JMod.PUBLIC, cm.VOID, "foo1");
            final JTypeVar tv1 = m1.generify("T");
            m1.param(JMod.FINAL, tv1, "foo");
            m1.body()._return();
            final JMethod m1a = cls.method(JMod.PUBLIC, cm.VOID, "foo1a");
            final JTypeVar tv1a = m1a.generify("T", BigInteger.class);
            m1a.param(JMod.FINAL, tv1a, "foo");
            m1a.body()._return();
            final JMethod m1b = cls.method(JMod.PUBLIC, cm.VOID, "foo1b");
            m1b.param(JMod.FINAL, cm.ref(Comparator.class).narrow(cm.ref(CharSequence.class).wildcardSuper()), "foo");
            m1b.body()._return();
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, "foo2");
            final JTypeVar tv21 = m2.generify("T");
            final JTypeVar tv22 = m2.generify("U");
            final JTypeVar tv23 = m2.generify("V");
            m2.param(JMod.FINAL, tv21, "t");
            m2.param(JMod.FINAL, tv22, "u");
            m2.param(JMod.FINAL, tv23, "v");
            m2.body()._return();
            final JMethod minvoke = cls.method(JMod.PUBLIC, cm.VOID, "bar");
            minvoke.body().add(JExpr._new(cls).narrow(Integer.class).arg(cm.INT.wrap(JExpr.lit(17))));
            JBlock __DSPOT_invoc_55 = minvoke.body().add(JExpr.invokeThis(m1).narrow(String.class).arg("jippie"));
            minvoke.body().add(JExpr.invoke(m1).arg("jippie"));
            minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_55.invokeThis(__DSPOT_sMethod_126);
            org.junit.Assert.fail("testWithGenerics_rv595 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_mg364_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_54 = -341077786;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("TestInvocation");
            final JTypeVar tc = cls.generify("IMPL");
            final JMethod mc = cls.constructor(JMod.PUBLIC);
            mc.param(JMod.FINAL, tc, "ctor");
            final JMethod m1 = cls.method(JMod.PUBLIC, cm.VOID, "foo1");
            final JTypeVar tv1 = m1.generify("T");
            m1.param(JMod.FINAL, tv1, "foo");
            m1.body()._return();
            final JMethod m1a = cls.method(JMod.PUBLIC, cm.VOID, "foo1a");
            final JTypeVar tv1a = m1a.generify("T", BigInteger.class);
            m1a.param(JMod.FINAL, tv1a, "foo");
            m1a.body()._return();
            final JMethod m1b = cls.method(JMod.PUBLIC, cm.VOID, "foo1b");
            m1b.param(JMod.FINAL, cm.ref(Comparator.class).narrow(cm.ref(CharSequence.class).wildcardSuper()), "foo");
            m1b.body()._return();
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, "foo2");
            final JTypeVar tv21 = m2.generify("T");
            final JTypeVar tv22 = m2.generify("U");
            final JTypeVar tv23 = m2.generify("V");
            m2.param(JMod.FINAL, tv21, "t");
            m2.param(JMod.FINAL, tv22, "u");
            m2.param(JMod.FINAL, tv23, "v");
            m2.body()._return();
            final JMethod minvoke = cls.method(JMod.PUBLIC, cm.VOID, "bar");
            minvoke.body().add(JExpr._new(cls).narrow(Integer.class).arg(cm.INT.wrap(JExpr.lit(17))));
            minvoke.body().add(JExpr.invokeThis(m1).narrow(String.class).arg("jippie"));
            minvoke.body().add(JExpr.invoke(m1).arg("jippie"));
            minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            m2.paramAtIndex(__DSPOT_nIndex_54);
            org.junit.Assert.fail("testWithGenerics_mg364 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -341077786 out of bounds for length 3", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenericsnull422_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("TestInvocation");
            final JTypeVar tc = cls.generify("IMPL");
            final JMethod mc = cls.constructor(JMod.PUBLIC);
            mc.param(JMod.FINAL, tc, "ctor");
            final JMethod m1 = cls.method(JMod.PUBLIC, cm.VOID, "foo1");
            final JTypeVar tv1 = m1.generify("T");
            m1.param(JMod.FINAL, tv1, "foo");
            m1.body()._return();
            final JMethod m1a = cls.method(JMod.PUBLIC, cm.VOID, "foo1a");
            final JTypeVar tv1a = m1a.generify("T", BigInteger.class);
            m1a.param(JMod.FINAL, tv1a, "foo");
            m1a.body()._return();
            final JMethod m1b = cls.method(JMod.PUBLIC, cm.VOID, null);
            m1b.param(JMod.FINAL, cm.ref(Comparator.class).narrow(cm.ref(CharSequence.class).wildcardSuper()), "foo");
            m1b.body()._return();
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, "foo2");
            final JTypeVar tv21 = m2.generify("T");
            final JTypeVar tv22 = m2.generify("U");
            final JTypeVar tv23 = m2.generify("V");
            m2.param(JMod.FINAL, tv21, "t");
            m2.param(JMod.FINAL, tv22, "u");
            m2.param(JMod.FINAL, tv23, "v");
            m2.body()._return();
            final JMethod minvoke = cls.method(JMod.PUBLIC, cm.VOID, "bar");
            minvoke.body().add(JExpr._new(cls).narrow(Integer.class).arg(cm.INT.wrap(JExpr.lit(17))));
            minvoke.body().add(JExpr.invokeThis(m1).narrow(String.class).arg("jippie"));
            minvoke.body().add(JExpr.invoke(m1).arg("jippie"));
            minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testWithGenericsnull422 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }
}
