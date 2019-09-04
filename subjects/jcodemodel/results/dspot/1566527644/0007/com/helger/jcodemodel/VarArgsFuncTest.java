package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public final class VarArgsFuncTest {
    @Test(timeout = 10000)
    public void testBasicnull314_failAssert0() throws Exception {
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
            forloop.test(jcount.lt(JExpr.direct("param3.length")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, null);
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasicnull314 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv397_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_105 = "X G.I]?$AOD{_@e,R]r3";
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
            JVar __DSPOT_invoc_47 = main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_47.name(__DSPOT_sName_105);
            org.junit.Assert.fail("testBasic_rv397 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

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
    public void testBasic_rv380_failAssert0() throws Exception {
        try {
            int __DSPOT_nNewPos_97 = 1539022222;
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
            JBlock __DSPOT_invoc_39 = forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_39.pos(__DSPOT_nNewPos_97);
            org.junit.Assert.fail("testBasic_rv380 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal position provided: 1539022222", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv372() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
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
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        JVar o_testBasic_rv372__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv372__7)).hashCode())));
        JVar o_testBasic_rv372__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv372__8)).hashCode())));
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
        JVar o_testBasic_rv372__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv372__20)).hashCode())));
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
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        JVar o_testBasic_rv372__48 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv372__48)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testBasic_rv372__52 = __DSPOT_invoc_39.indentRequired();
        Assert.assertTrue(o_testBasic_rv372__52);
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
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
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv372__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv372__8)).hashCode())));
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
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv372__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv372__48)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testBasicnull309_failAssert0() throws Exception {
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
            forloop.test(jcount.lt(JExpr.direct(null)));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasicnull309 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_literalMutationString79_failAssert0() throws Exception {
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
            m.param(String.class, "");
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
            org.junit.Assert.fail("testBasic_literalMutationString79 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv381_failAssert0() throws Exception {
        try {
            int __DSPOT_index_98 = 1038582778;
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
            JBlock __DSPOT_invoc_39 = forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_39.remove(__DSPOT_index_98);
            org.junit.Assert.fail("testBasic_rv381 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 1038582778, Size: 1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasicnull317_failAssert0() throws Exception {
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
            forloop.test(jcount.lt(JExpr.direct("param3.length")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement(null);
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasicnull317 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Source\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv367_mg15103() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        JVar o_testBasic_rv367__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv367__7)).hashCode())));
        JVar o_testBasic_rv367__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv367__8)).hashCode())));
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_rv367__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv367__20)).hashCode())));
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
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        JVar o_testBasic_rv367__48 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv367__48)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testBasic_rv367__52 = __DSPOT_invoc_39.bracesRequired();
        JTypeWildcard o_testBasic_rv367_mg15103__63 = stringArray.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).isError());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.String[])", ((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).isReference());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv367_mg15103__63)).isPrimitive());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv367__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv367__8)).hashCode())));
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv367__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv367__48)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testBasic_rv372_mg13017() throws Exception {
        AbstractJClass[] __DSPOT_aClazz_3120 = new AbstractJClass[]{  };
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        JVar o_testBasic_rv372__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv372__7)).hashCode())));
        JVar o_testBasic_rv372__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv372__8)).hashCode())));
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_rv372__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv372__20)).hashCode())));
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
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        JVar o_testBasic_rv372__48 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv372__48)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testBasic_rv372__52 = __DSPOT_invoc_39.indentRequired();
        AbstractJClass o_testBasic_rv372_mg13017__64 = stringArray.narrow(__DSPOT_aClazz_3120);
        Assert.assertFalse(((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).isError());
        Assert.assertTrue(((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).isParameterized());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(java.lang.String[]<>)", ((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).toString());
        Assert.assertTrue(((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).isReference());
        Assert.assertFalse(((JNarrowedClass) (o_testBasic_rv372_mg13017__64)).isPrimitive());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv372__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv372__8)).hashCode())));
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv372__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv372__48)).hashCode())));
    }
}
