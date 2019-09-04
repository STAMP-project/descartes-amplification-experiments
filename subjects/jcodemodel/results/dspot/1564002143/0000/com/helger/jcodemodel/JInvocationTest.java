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
    public void testWithGenerics_rv663_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_156 = -1046351086;
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
            __DSPOT_invoc_64.pos(__DSPOT_nNewPos_156);
            org.junit.Assert.fail("testWithGenerics_rv663 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: -1046351086", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv513_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_92 = ")uhDiCMs-NCPSNsen+,y";
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
            JVar __DSPOT_invoc_41 = m2.param(JMod.FINAL, tv21, "t");
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
            __DSPOT_invoc_41.name(__DSPOT_sName_92);
            org.junit.Assert.fail("testWithGenerics_rv513 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \')uhDiCMs-NCPSNsen+,y\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv696_failAssert0() throws Exception {
        try {
            int __DSPOT_index_171 = 2069022813;
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
            __DSPOT_invoc_79.remove(__DSPOT_index_171);
            org.junit.Assert.fail("testWithGenerics_rv696 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index 2069022813 out of bounds for length 5", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_mg235_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_20 = 1764739549;
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
            cls.constructor(__DSPOT_nMods_20);
            org.junit.Assert.fail("testWithGenerics_mg235 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testWithGenericsnull425_failAssert0() throws Exception {
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
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, "foo2");
            final JTypeVar tv21 = m2.generify(null);
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
            org.junit.Assert.fail("testWithGenericsnull425 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_literalMutationString167_failAssert0() throws Exception {
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
            final JMethod m2 = cls.method(JMod.PUBLIC, cm.VOID, "foo2");
            final JTypeVar tv21 = m2.generify("T");
            final JTypeVar tv22 = m2.generify("U");
            final JTypeVar tv23 = m2.generify("V");
            m2.param(JMod.FINAL, tv21, "");
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
            org.junit.Assert.fail("testWithGenerics_literalMutationString167 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testWithGenerics_rv561_failAssert0() throws Exception {
        try {
            String __DSPOT_sMethod_111 = "AC*$S oY.>c^U!$Cz2lv";
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
            JBlock __DSPOT_invoc_48 = minvoke.body().add(JExpr._new(cls).narrow(Integer.class).arg(cm.INT.wrap(JExpr.lit(17))));
            minvoke.body().add(JExpr.invokeThis(m1).narrow(String.class).arg("jippie"));
            minvoke.body().add(JExpr.invoke(m1).arg("jippie"));
            minvoke.body().add(JExpr.invokeThis(m2).narrow(String.class).narrow(cls).narrow(cm.ref(List.class).narrow(Long.class)).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            minvoke.body().add(JExpr.invoke(m2).arg("jippie").arg(JExpr._this()).arg(cm.ref(ArrayList.class).narrow(Long.class)._new()));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_48.invoke(__DSPOT_sMethod_111);
            org.junit.Assert.fail("testWithGenerics_rv561 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: method name contains \'.\': AC*$S oY.>c^U!$Cz2lv", expected.getMessage());
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
            org.junit.Assert.fail("testWithGenerics_mg346 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -1745347144 out of bounds for length 1", expected.getMessage());
        }
    }
}

