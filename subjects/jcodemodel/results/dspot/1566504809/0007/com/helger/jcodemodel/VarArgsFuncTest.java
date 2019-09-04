package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public final class VarArgsFuncTest {
    @Test(timeout = 10000)
    public void testBasic_mg194_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_32 = 2041369093;
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
            m.paramAtIndex(__DSPOT_nIndex_32);
            org.junit.Assert.fail("testBasic_mg194 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 2041369093, Size: 3", expected.getMessage());
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
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
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
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
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
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
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
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
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
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
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
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
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
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
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
    public void testBasic_literalMutationString70_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            m.param(String.class, "param1");
            m.param(Integer.class, "param2");
            final JVar var = m.varParam(Object.class, "+mr6#-");
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
            org.junit.Assert.fail("testBasic_literalMutationString70 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'+mr6#-\'", expected.getMessage());
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
    public void testBasic_rv329_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_76 = "{qxxjff`y&R/x5,;cXLF";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            JVar __DSPOT_invoc_7 = m.param(String.class, "param1");
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
            __DSPOT_invoc_7.name(__DSPOT_sName_76);
            org.junit.Assert.fail("testBasic_rv329 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv383_mg3778() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
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
        JVar o_testBasic_rv383__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv383__7)).hashCode())));
        JVar o_testBasic_rv383__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv383__8)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_rv383__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv383__20)).hashCode())));
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
        JVar o_testBasic_rv383__48 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv383__48)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        int o_testBasic_rv383__52 = __DSPOT_invoc_39.size();
        AbstractJType o_testBasic_rv383_mg3778__63 = main.type();
        Assert.assertTrue(((JPrimitiveType) (o_testBasic_rv383_mg3778__63)).isPrimitive());
        Assert.assertFalse(((JPrimitiveType) (o_testBasic_rv383_mg3778__63)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JPrimitiveType(void)", ((JPrimitiveType) (o_testBasic_rv383_mg3778__63)).toString());
        Assert.assertFalse(((JPrimitiveType) (o_testBasic_rv383_mg3778__63)).isArray());
        Assert.assertFalse(((JPrimitiveType) (o_testBasic_rv383_mg3778__63)).isError());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv383__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv383__8)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv383__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv383__48)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testBasic_rv369_mg18523() throws Exception {
        JVar __DSPOT_o_4421 = null;
        String __DSPOT_sSource_91 = "t]/|:Izr!a`s[iA&c(8{";
        final JCodeModel cm = new JCodeModel();
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
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
        JVar o_testBasic_rv369__8 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv369__8)).hashCode())));
        JVar o_testBasic_rv369__9 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv369__9)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_rv369__21 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv369__21)).hashCode())));
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
        JVar o_testBasic_rv369__49 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv369__49)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        __DSPOT_invoc_39.directStatement(__DSPOT_sSource_91);
        boolean o_testBasic_rv369_mg18523__63 = jcount.equals(__DSPOT_o_4421);
        Assert.assertFalse(o_testBasic_rv369_mg18523__63);
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv369__8)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv369__9)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv369__21)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv369__49)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testBasic_rv384_failAssert0_add4237_failAssert0() throws Exception {
        try {
            {
                IJFormatter __DSPOT_f_99 = null;
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
                JBlock __DSPOT_invoc_39 = forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
                final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
                main.param(stringArray, "args");
                main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
                CodeModelTestsHelper.parseCodeModel(cm);
                __DSPOT_invoc_39.state(__DSPOT_f_99);
                org.junit.Assert.fail("testBasic_rv384 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testBasic_rv384_failAssert0_add4237 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: Cannot have two varargs in a method,\nCheck if varParam method of JMethod is invoked more than once", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_remove38_mg14686() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
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
        JVar o_testBasic_remove38__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_remove38__7)).hashCode())));
        JVar o_testBasic_remove38__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_remove38__8)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_remove38__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_remove38__20)).hashCode())));
        final JForLoop forloop = m.body()._for();
        final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        forloop.test(jcount.lt(JExpr.direct("param3.length")));
        forloop.update(jcount.incr());
        final JFieldRef out = cm.ref(System.class).staticRef("out");
        final JVar typearray = m.varParam();
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        JVar o_testBasic_remove38__40 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_remove38__40)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testBasic_remove38_mg14686__52 = cls.containsErrorTypes();
        Assert.assertFalse(o_testBasic_remove38_mg14686__52);
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_remove38__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_remove38__8)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_remove38__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_remove38__40)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testBasic_rv369_mg18206() throws Exception {
        String __DSPOT_sSource_91 = "t]/|:Izr!a`s[iA&c(8{";
        final JCodeModel cm = new JCodeModel();
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
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
        JVar o_testBasic_rv369__8 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv369__8)).hashCode())));
        JVar o_testBasic_rv369__9 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv369__9)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_rv369__21 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv369__21)).hashCode())));
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
        JVar o_testBasic_rv369__49 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv369__49)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        __DSPOT_invoc_39.directStatement(__DSPOT_sSource_91);
        AbstractJType o_testBasic_rv369_mg18206__62 = string.unboxify();
        Assert.assertTrue(((Collection) (((JReferencedClass) (o_testBasic_rv369_mg18206__62)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (o_testBasic_rv369_mg18206__62)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (o_testBasic_rv369_mg18206__62)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (o_testBasic_rv369_mg18206__62)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (o_testBasic_rv369_mg18206__62)).isReference());
        Assert.assertFalse(((JReferencedClass) (o_testBasic_rv369_mg18206__62)).isArray());
        Assert.assertFalse(((JReferencedClass) (o_testBasic_rv369_mg18206__62)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (o_testBasic_rv369_mg18206__62)).isError());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv369__8)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv369__9)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv369__21)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv369__49)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testBasic_rv383_mg3704_failAssert0() throws Exception {
        try {
            int __DSPOT_index_789 = -1823357810;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass cls = cm._class("Test");
            final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
            JVar o_testBasic_rv383__7 = m.param(String.class, "param1");
            JVar o_testBasic_rv383__8 = m.param(Integer.class, "param2");
            final JVar var = m.varParam(Object.class, "param3");
            if (false) {
                System.out.println(("First varParam " + var));
            }
            final AbstractJClass string = cm.ref(String.class);
            final AbstractJClass stringArray = string.array();
            JVar o_testBasic_rv383__20 = m.param(String.class, "param5");
            final JForLoop forloop = m.body()._for();
            final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
            forloop.test(jcount.lt(JExpr.direct("param3.length")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            JBlock __DSPOT_invoc_39 = forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            JVar o_testBasic_rv383__48 = main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            int o_testBasic_rv383__52 = __DSPOT_invoc_39.size();
            __DSPOT_invoc_39.remove(__DSPOT_index_789);
            org.junit.Assert.fail("testBasic_rv383_mg3704 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1823357810", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_remove38_mg15189() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
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
        JVar o_testBasic_remove38__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_remove38__7)).hashCode())));
        JVar o_testBasic_remove38__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_remove38__8)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
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
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        JVar o_testBasic_remove38__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_remove38__20)).hashCode())));
        final JForLoop forloop = m.body()._for();
        final JVar jcount = forloop.init(cm.INT, "count", JExpr.lit(0));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        forloop.test(jcount.lt(JExpr.direct("param3.length")));
        forloop.update(jcount.incr());
        final JFieldRef out = cm.ref(System.class).staticRef("out");
        final JVar typearray = m.varParam();
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        JVar o_testBasic_remove38__40 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_remove38__40)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        List<Object> o_testBasic_remove38_mg15189__52 = forloop.inits();
        Assert.assertFalse(o_testBasic_remove38_mg15189__52.isEmpty());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
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
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_remove38__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_remove38__8)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_remove38__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_remove38__40)).hashCode())));
    }
}

