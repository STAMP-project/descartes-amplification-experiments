package com.helger.jcodemodel;


import com.github.javaparser.ParseProblemException;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public final class VarArgsFuncTest {
    @Test(timeout = 10000)
    public void testBasic_add5_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.param(String.class, "param1");
            m.param(Integer.class, "param2");
            m.varParam(Object.class, "param3");
            final JVar var = m.varParam(Object.class, "param3");
            if (false) {
                System.out.println(("First varParam " + var));
            }
            final AbstractJClass string = cm.ref(String.class);
            final AbstractJClass stringArray = string.array();
            m.param(String.class, "param5");
            final JForLoop forloop = m.body()._for();
            final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
            forloop.test(jcount.lt(JExpr.direct("param3.length")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasic_add5 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: Cannot have two varargs in a method,\nCheck if varParam method of JMethod is invoked more than once", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg161_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_20 = 416956815;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.param(String.class, "param1");
            m.param(Integer.class, "param2");
            final JVar var = m.varParam(Object.class, "param3");
            if (false) {
                System.out.println(("First varParam " + var));
            }
            final AbstractJClass string = cm.ref(String.class);
            final AbstractJClass stringArray = string.array();
            m.param(String.class, "param5");
            final JForLoop forloop = m.body()._for();
            final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
            forloop.test(jcount.lt(JExpr.direct("param3.length")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            cls.constructor(__DSPOT_nMods_20);
            org.junit.Assert.fail("testBasic_mg161 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv375() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
        Assert.assertFalse(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        JVar o_testBasic_rv375__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv375__7)).hashCode())));
        JVar o_testBasic_rv375__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv375__8)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        final AbstractJClass stringArray = string.array();
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_rv375__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv375__20)).hashCode())));
        final JForLoop forloop = m.body()._for();
        final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        forloop.test(jcount.lt(JExpr.direct("param3.length")));
        forloop.update(jcount.incr());
        final JFieldRef out = cm.ref(System.class).staticRef("out");
        final JVar typearray = m.varParam();
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        JBlock __DSPOT_invoc_39 = forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
        final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        JVar o_testBasic_rv375__48 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv375__48)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        __DSPOT_invoc_39.invokeSuper();
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv375__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv375__8)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv375__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv375__48)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testBasic_remove36_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.param(String.class, "param1");
            m.param(Integer.class, "param2");
            final JVar var = m.varParam(Object.class, "param3");
            if (false) {
                System.out.println(("First varParam " + var));
            }
            final AbstractJClass string = cm.ref(String.class);
            final AbstractJClass stringArray = string.array();
            m.param(String.class, "param5");
            final JForLoop forloop = m.body()._for();
            final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasic_remove36 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_literalMutationString59_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.param(String.class, "(q2 5[");
            m.param(Integer.class, "param2");
            final JVar var = m.varParam(Object.class, "param3");
            if (false) {
                System.out.println(("First varParam " + var));
            }
            final AbstractJClass string = cm.ref(String.class);
            final AbstractJClass stringArray = string.array();
            m.param(String.class, "param5");
            final JForLoop forloop = m.body()._for();
            final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
            forloop.test(jcount.lt(JExpr.direct("param3.length")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasic_literalMutationString59 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'(q2 5[\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasicnull302_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, null);
            m.param(String.class, "param1");
            m.param(Integer.class, "param2");
            final JVar var = m.varParam(Object.class, "param3");
            if (false) {
                System.out.println(("First varParam " + var));
            }
            final AbstractJClass string = cm.ref(String.class);
            final AbstractJClass stringArray = string.array();
            m.param(String.class, "param5");
            final JForLoop forloop = m.body()._for();
            final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
            forloop.test(jcount.lt(JExpr.direct("param3.length")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasicnull302 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg281_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_67 = "ICnc)SU7EvLBHp9HIW?9";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.param(String.class, "param1");
            m.param(Integer.class, "param2");
            final JVar var = m.varParam(Object.class, "param3");
            if (false) {
                System.out.println(("First varParam " + var));
            }
            final AbstractJClass string = cm.ref(String.class);
            final AbstractJClass stringArray = string.array();
            m.param(String.class, "param5");
            final JForLoop forloop = m.body()._for();
            final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
            forloop.test(jcount.lt(JExpr.direct("param3.length")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            typearray.name(__DSPOT_sName_67);
            org.junit.Assert.fail("testBasic_mg281 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'ICnc)SU7EvLBHp9HIW?9\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg206_failAssert0null22187_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_sName_37 = "Q}E3:oK*M=;$a4UUWY=?";
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass cls = cm._class("Test");
                final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
                m.param(String.class, "param1");
                m.param(Integer.class, "param2");
                final JVar var = m.varParam(Object.class, "param3");
                if (false) {
                    System.out.println(("First varParam " + var));
                }
                final AbstractJClass string = cm.ref(String.class);
                final AbstractJClass stringArray = string.array();
                m.param(String.class, "param5");
                final JForLoop forloop = m.body()._for();
                final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
                forloop.test(jcount.lt(JExpr.direct("param3.length")));
                forloop.update(jcount.incr());
                final JFieldRef out = cm.ref(System.class).staticRef("out");
                final JVar typearray = m.varParam();
                forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
                final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
                main.param(stringArray, "args");
                main.body().directStatement(null);
                CodeModelTestsHelper.parseCodeModel(cm);
                var.name(__DSPOT_sName_37);
                org.junit.Assert.fail("testBasic_mg206 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testBasic_mg206_failAssert0null22187 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Source\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg281_failAssert0_literalMutationString1499_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_sName_67 = "ICnc)SU7EvLBHp9HIW?9";
                final JCodeModel cm = new JCodeModel();
                final JDefinedClass cls = cm._class("Test");
                final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
                m.param(String.class, "param1");
                m.param(Integer.class, "param2");
                final JVar var = m.varParam(Object.class, "param3");
                if (false) {
                    System.out.println(("First varParam " + var));
                }
                final AbstractJClass string = cm.ref(String.class);
                final AbstractJClass stringArray = string.array();
                m.param(String.class, "param5");
                final JForLoop forloop = m.body()._for();
                final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
                forloop.test(jcount.lt(JExpr.direct("param3.length")));
                forloop.update(jcount.incr());
                final JFieldRef out = cm.ref(System.class).staticRef("out");
                final JVar typearray = m.varParam();
                forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
                final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
                main.param(stringArray, "args");
                main.body().directStatement("new Test().foo(new String(\"Param1\"),nw Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
                CodeModelTestsHelper.parseCodeModel(cm);
                typearray.name(__DSPOT_sName_67);
                org.junit.Assert.fail("testBasic_mg281 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testBasic_mg281_failAssert0_literalMutationString1499 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv356_mg13462() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
        Assert.assertFalse(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        JVar o_testBasic_rv356__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv356__7)).hashCode())));
        JVar o_testBasic_rv356__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv356__8)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        final AbstractJClass stringArray = string.array();
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_rv356__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv356__20)).hashCode())));
        final JForLoop forloop = m.body()._for();
        final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        forloop.test(jcount.lt(JExpr.direct("param3.length")));
        forloop.update(jcount.incr());
        final JFieldRef out = cm.ref(System.class).staticRef("out");
        final JVar typearray = m.varParam();
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        JBlock __DSPOT_invoc_39 = forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
        final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        JVar o_testBasic_rv356__48 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv356__48)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        __DSPOT_invoc_39._break();
        AbstractJClass o_testBasic_rv356_mg13462__61 = cls._extends();
        Assert.assertFalse(((JReferencedClass) (o_testBasic_rv356_mg13462__61)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (o_testBasic_rv356_mg13462__61)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.Object)", ((JReferencedClass) (o_testBasic_rv356_mg13462__61)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (o_testBasic_rv356_mg13462__61)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (o_testBasic_rv356_mg13462__61)).isReference());
        Assert.assertFalse(((JReferencedClass) (o_testBasic_rv356_mg13462__61)).isArray());
        Assert.assertFalse(((JReferencedClass) (o_testBasic_rv356_mg13462__61)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (o_testBasic_rv356_mg13462__61)).isError());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv356__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv356__8)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv356__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv356__48)).hashCode())));
    }
}

