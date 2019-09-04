package com.helger.jcodemodel;


import com.github.javaparser.ParseProblemException;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public final class VarArgsFuncTest {
    @Test(timeout = 10000)
    public void testBasic_literalMutationString132_failAssert0() throws Exception {
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
            main.body().directStatement("Left");
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasic_literalMutationString132 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv378() throws Exception {
        String __DSPOT_sName_96 = "W{5uN(!P:(01(Vo/][%s";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertFalse(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        JVar o_testBasic_rv378__8 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv378__8)).hashCode())));
        JVar o_testBasic_rv378__9 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv378__9)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        final AbstractJClass stringArray = string.array();
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        JVar o_testBasic_rv378__21 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv378__21)).hashCode())));
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
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        JVar o_testBasic_rv378__49 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv378__49)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        __DSPOT_invoc_39.label(__DSPOT_sName_96);
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv378__8)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv378__9)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv378__21)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv378__49)).hashCode())));
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
            Assert.assertEquals("Index 1038582778 out of bounds for length 1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg206_failAssert0() throws Exception {
        try {
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
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            var.name(__DSPOT_sName_37);
            org.junit.Assert.fail("testBasic_mg206 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'Q}E3:oK*M=;$a4UUWY=?\'", expected.getMessage());
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
    public void testBasic_literalMutationString95_failAssert0() throws Exception {
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
            forloop.test(jcount.lt(JExpr.direct("S@Rl&{ha!&Bcv")));
            forloop.update(jcount.incr());
            final JFieldRef out = cm.ref(System.class).staticRef("out");
            final JVar typearray = m.varParam();
            forloop.body().add(JExpr.invoke(out, "println").arg(JExpr.direct("param3[count]")));
            final JMethod main = cls.method(((JMod.PUBLIC) | (JMod.STATIC)), cm.VOID, "main");
            main.param(stringArray, "args");
            main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasic_literalMutationString95 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv382_mg26397() throws Exception {
        JVar __DSPOT_o_6458 = null;
        final JCodeModel cm = new JCodeModel();
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertFalse(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        JVar o_testBasic_rv382__7 = m.param(String.class, "param1");
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv382__7)).hashCode())));
        JVar o_testBasic_rv382__8 = m.param(Integer.class, "param2");
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv382__8)).hashCode())));
        final JVar var = m.varParam(Object.class, "param3");
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        if (false) {
            System.out.println(("First varParam " + var));
        }
        final AbstractJClass string = cm.ref(String.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        final AbstractJClass stringArray = string.array();
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        JVar o_testBasic_rv382__20 = m.param(String.class, "param5");
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv382__20)).hashCode())));
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
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        JVar o_testBasic_rv382__48 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv382__48)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        __DSPOT_invoc_39.removeAll();
        boolean o_testBasic_rv382_mg26397__62 = o_testBasic_rv382__48.equals(__DSPOT_o_6458);
        Assert.assertFalse(o_testBasic_rv382_mg26397__62);
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv382__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv382__8)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv382__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv382__48)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testBasic_rv375_mg22996() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        final JDefinedClass cls = cm._class("Test");
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        final JMethod m = cls.method(JMod.PUBLIC, cm.VOID, "foo");
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertFalse(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
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
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        final AbstractJClass stringArray = string.array();
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
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
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        JVar o_testBasic_rv375__48 = main.param(stringArray, "args");
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv375__48)).hashCode())));
        main.body().directStatement("new Test().foo(new String(\"Param1\"),new Integer(5),null,new String(\"Param3\"),new String(\"Param4\"));");
        CodeModelTestsHelper.parseCodeModel(cm);
        __DSPOT_invoc_39.invokeSuper();
        JTypeWildcard o_testBasic_rv375_mg22996__61 = string.wildcardSuper();
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? super java.lang.String)", ((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).isParameterized());
        Assert.assertNull(((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).getPrimitiveType());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testBasic_rv375_mg22996__61)).isReference());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (cls)).isHidden());
        Assert.assertFalse(((JDefinedClass) (cls)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (cls)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (cls)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (cls)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (cls)).getPackage())).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isPackage());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnonymous());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (cls)).getOuter())).isClass());
        Assert.assertTrue(((JDefinedClass) (cls)).isClass());
        Assert.assertFalse(((JDefinedClass) (cls)).isAnnotationTypeDeclaration());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(Test)", ((JDefinedClass) (cls)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JDefinedClass) (cls)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (cls)).isParameterized());
        Assert.assertNull(((JDefinedClass) (cls)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (cls)).isArray());
        Assert.assertFalse(((JDefinedClass) (cls)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (cls)).isError());
        Assert.assertTrue(((JDefinedClass) (cls)).isReference());
        Assert.assertFalse(((JMethod) (m)).isConstructor());
        Assert.assertTrue(((JMethod) (m)).hasVarArgs());
        Assert.assertTrue(((JMethod) (m)).getThrows().isEmpty());
        Assert.assertEquals(1471134968, ((int) (((JVar) (o_testBasic_rv375__7)).hashCode())));
        Assert.assertEquals(1471134969, ((int) (((JVar) (o_testBasic_rv375__8)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (var)).hashCode())));
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.String)", ((JReferencedClass) (string)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JReferencedClass) (string)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (string)).isParameterized());
        Assert.assertFalse(((JReferencedClass) (string)).isArray());
        Assert.assertFalse(((JReferencedClass) (string)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (string)).isError());
        Assert.assertTrue(((JReferencedClass) (string)).isReference());
        Assert.assertFalse(((JArrayClass) (stringArray)).isInterface());
        Assert.assertTrue(((JArrayClass) (stringArray)).isArray());
        Assert.assertFalse(((JArrayClass) (stringArray)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(java.lang.String[])", ((JArrayClass) (stringArray)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JArrayClass) (stringArray)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (stringArray)).isParameterized());
        Assert.assertNull(((JArrayClass) (stringArray)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (stringArray)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (stringArray)).isError());
        Assert.assertTrue(((JArrayClass) (stringArray)).isReference());
        Assert.assertEquals(1471134972, ((int) (((JVar) (o_testBasic_rv375__20)).hashCode())));
        Assert.assertEquals(-1733552957, ((int) (((JVar) (jcount)).hashCode())));
        Assert.assertEquals(1471134970, ((int) (((JVar) (typearray)).hashCode())));
        Assert.assertFalse(((JMethod) (main)).isConstructor());
        Assert.assertFalse(((JMethod) (main)).hasVarArgs());
        Assert.assertTrue(((JMethod) (main)).getThrows().isEmpty());
        Assert.assertEquals(-1825401711, ((int) (((JVar) (o_testBasic_rv375__48)).hashCode())));
    }
}

