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
    public void testWithGenerics_rv537_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_102 = "&C;G<+|h=gdwL%G{#C.D";
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
            JVar __DSPOT_invoc_43 = m2.param(JMod.FINAL, tv23, "v");
            m2.body()._return();
            final JMethod minvoke = cls.method(JMod.PUBLIC, cm.VOID, "bar");
            minvoke.body().add(JExpr._new(cls).narrow(Integer.class).arg(cm.INT.wrap(JExpr.lit(17))));
            minvoke.body().add(JExpr.invokeThis(m1).narrow(String.class).arg("jippie"));
            minvoke.body().add(JExpr.invoke(m1).arg("jippie"));
            minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_43.name(__DSPOT_sName_102);
            org.junit.Assert.fail("testWithGenerics_rv537 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'&C;G<+|h=gdwL%G{#C.D\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv664_failAssert0() throws Exception {
        try {
            int __DSPOT_index_157 = 2037508841;
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
            __DSPOT_invoc_64.remove(__DSPOT_index_157);
            org.junit.Assert.fail("testWithGenerics_rv664 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 2037508841, Size: 5", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_literalMutationString108_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("TestInvocation");
            final JTypeVar tc = cls.generify("IMPL");
            final JMethod mc = cls.constructor(JMod.PUBLIC);
            mc.param(JMod.FINAL, tc, "{$QV");
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
            org.junit.Assert.fail("testWithGenerics_literalMutationString108 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'{$QV\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv599_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_128 = 339746675;
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
            __DSPOT_invoc_55.pos(__DSPOT_nNewPos_128);
            org.junit.Assert.fail("testWithGenerics_rv599 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: 339746675", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv691_failAssert0() throws Exception {
        try {
            String __DSPOT_sMethod_168 = "k]Jpa[bR-2-=M,.G+$]g";
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
            __DSPOT_invoc_79.invokeThis(__DSPOT_sMethod_168);
            org.junit.Assert.fail("testWithGenerics_rv691 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: method name contains \'.\': k]Jpa[bR-2-=M,.G+$]g", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenericsnull419_failAssert0() throws Exception {
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
            final JTypeVar tv1a = m1a.generify(null, BigInteger.class);
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
            org.junit.Assert.fail("testWithGenericsnull419 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_mg346_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_50 = -1745347144;
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
            m1b.paramAtIndex(__DSPOT_nIndex_50);
            org.junit.Assert.fail("testWithGenerics_mg346 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1745347144", expected.getMessage());
        }
    }
}

