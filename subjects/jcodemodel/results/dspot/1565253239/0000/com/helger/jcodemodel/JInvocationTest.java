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
    public void testWithGenerics_rv695_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_170 = 1723599883;
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
            JBlock __DSPOT_invoc_79 = minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_79.pos(__DSPOT_nNewPos_170);
            org.junit.Assert.fail("testWithGenerics_rv695 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: 1723599883", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv456_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_69 = "S}%g/mS6TE0=.J($16qv";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("TestInvocation");
            final JTypeVar tc = cls.generify("IMPL");
            final JMethod mc = cls.constructor(JMod.PUBLIC);
            JVar __DSPOT_invoc_9 = mc.param(JMod.FINAL, tc, "ctor");
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
            __DSPOT_invoc_9.name(__DSPOT_sName_69);
            org.junit.Assert.fail("testWithGenerics_rv456 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv657_failAssert0() throws Exception {
        try {
            String __DSPOT_sMethod_153 = "`|.O[{SF[5qeWJi&w1WL";
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
            JBlock __DSPOT_invoc_64 = minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_64.invoke(__DSPOT_sMethod_153);
            org.junit.Assert.fail("testWithGenerics_rv657 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: method name contains \'.\': `|.O[{SF[5qeWJi&w1WL", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_literalMutationString150_failAssert0() throws Exception {
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
            m1b.param(JMod.FINAL, cm.ref(Comparator.class).narrow(cm.ref(CharSequence.class).wildcardSuper()), "f=oo");
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
            org.junit.Assert.fail("testWithGenerics_literalMutationString150 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'f=oo\'", expected.getMessage());
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
    public void testWithGenericsnull424_failAssert0() throws Exception {
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
            m1b.param(JMod.FINAL, cm.ref(Comparator.class).narrow(cm.ref(CharSequence.class).wildcardSuper()), "foo");
            m1b.body()._return();
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, null);
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
            org.junit.Assert.fail("testWithGenericsnull424 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
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
            org.junit.Assert.fail("testWithGenerics_mg364 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-341077786", expected.getMessage());
        }
    }
}

