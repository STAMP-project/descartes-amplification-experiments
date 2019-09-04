package com.helger.jcodemodel;


import com.github.javaparser.ParseProblemException;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public final class JDirectClassTest {
    @Test(timeout = 10000)
    public void testBasic_rv282_failAssert0() throws Exception {
        try {
            IJFormatter __DSPOT_f_66 = null;
            final JCodeModel cm = new JCodeModel();
            final JDirectClass rClassId = cm.directClass("id.aa.R")._class("id");
            rClassId.name();
            rClassId._package().name();
            rClassId.fullName();
            final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
            rClassMenu.name();
            rClassMenu._package().name();
            rClassMenu.fullName();
            final JFieldRef myItem = rClassId.staticRef("myItem");
            final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
            final JPackage aPkg2 = cm._package("id.aa");
            final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
            final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
            aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
            final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onOptionsItemSelected");
            JConditional __DSPOT_invoc_40 = aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_40.state(__DSPOT_f_66);
            org.junit.Assert.fail("testBasic_rv282 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv273_failAssert0() throws Exception {
        try {
            int __DSPOT_index_63 = -636981950;
            final JCodeModel cm = new JCodeModel();
            final JDirectClass rClassId = cm.directClass("id.aa.R")._class("id");
            rClassId.name();
            rClassId._package().name();
            rClassId.fullName();
            final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
            rClassMenu.name();
            rClassMenu._package().name();
            rClassMenu.fullName();
            final JFieldRef myItem = rClassId.staticRef("myItem");
            final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
            final JPackage aPkg2 = cm._package("id.aa");
            final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
            final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
            JBlock __DSPOT_invoc_33 = aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
            final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onOptionsItemSelected");
            aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_33.remove(__DSPOT_index_63);
            org.junit.Assert.fail("testBasic_rv273 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -636981950 out of bounds for length 1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_rv269() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        final JDirectClass rClassId = cm.directClass("id.aa.R")._class("id");
        Assert.assertEquals(84124647, ((int) (((JDirectClass) (rClassId)).hashCode())));
        Assert.assertFalse(((JDirectClass) (rClassId)).isAbstract());
        Assert.assertFalse(((JDirectClass) (rClassId)).isInterface());
        Assert.assertFalse(((JDirectClass) (rClassId)).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDirectClass) (rClassId)).getOuter())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDirectClass) (rClassId)).getOuter())).isClass());
        Assert.assertFalse(((JDirectClass) (rClassId)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (rClassId)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (rClassId)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(id.aa.R.id)", ((JDirectClass) (rClassId)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (rClassId)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDirectClass) (rClassId)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (rClassId)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDirectClass) (rClassId)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (rClassId)).isArray());
        Assert.assertFalse(((JDirectClass) (rClassId)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (rClassId)).isError());
        Assert.assertTrue(((JDirectClass) (rClassId)).isReference());
        String o_testBasic_rv269__6 = rClassId.name();
        Assert.assertEquals("id", o_testBasic_rv269__6);
        String o_testBasic_rv269__7 = rClassId._package().name();
        Assert.assertEquals("id.aa", o_testBasic_rv269__7);
        String o_testBasic_rv269__9 = rClassId.fullName();
        Assert.assertEquals("id.aa.R.id", o_testBasic_rv269__9);
        final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
        Assert.assertEquals(87469099, ((int) (((JDirectClass) (rClassMenu)).hashCode())));
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isAbstract());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isInterface());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDirectClass) (rClassMenu)).getOuter())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDirectClass) (rClassMenu)).getOuter())).isClass());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (rClassMenu)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(id.aa.R.menu)", ((JDirectClass) (rClassMenu)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (rClassMenu)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (rClassMenu)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDirectClass) (rClassMenu)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isArray());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isError());
        Assert.assertTrue(((JDirectClass) (rClassMenu)).isReference());
        String o_testBasic_rv269__13 = rClassMenu.name();
        Assert.assertEquals("menu", o_testBasic_rv269__13);
        String o_testBasic_rv269__14 = rClassMenu._package().name();
        Assert.assertEquals("id.aa", o_testBasic_rv269__14);
        String o_testBasic_rv269__16 = rClassMenu.fullName();
        Assert.assertEquals("id.aa.R.menu", o_testBasic_rv269__16);
        final JFieldRef myItem = rClassId.staticRef("myItem");
        Assert.assertEquals(512961099, ((int) (((JFieldRef) (myItem)).hashCode())));
        final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
        Assert.assertEquals(-564731709, ((int) (((JFieldRef) (myMenu)).hashCode())));
        final JPackage aPkg2 = cm._package("id.aa");
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (aPkg2)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (aPkg2)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (aPkg2)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (aPkg2)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (aPkg2)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (aPkg2)).isClass());
        Assert.assertFalse(((JPackage) (aPkg2)).isUnnamed());
        final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isHidden());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).isUnnamed());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).isClass());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (aClassAct)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(id.aa.HelloAndroidActivity_)", ((JDefinedClass) (aClassAct)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (aClassAct)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (aClassAct)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (aClassAct)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isArray());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isError());
        Assert.assertTrue(((JDefinedClass) (aClassAct)).isReference());
        final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
        Assert.assertFalse(((JMethod) (aMethodCreate)).isConstructor());
        Assert.assertFalse(((JMethod) (aMethodCreate)).hasVarArgs());
        Assert.assertTrue(((JMethod) (aMethodCreate)).getThrows().isEmpty());
        JBlock __DSPOT_invoc_33 = aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
        final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onOptionsItemSelected");
        Assert.assertFalse(((JMethod) (aMethodSelected)).isConstructor());
        Assert.assertFalse(((JMethod) (aMethodSelected)).hasVarArgs());
        Assert.assertTrue(((JMethod) (aMethodSelected)).getThrows().isEmpty());
        aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
        CodeModelTestsHelper.parseCodeModel(cm);
        __DSPOT_invoc_33.isEmpty();
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals(84124647, ((int) (((JDirectClass) (rClassId)).hashCode())));
        Assert.assertFalse(((JDirectClass) (rClassId)).isAbstract());
        Assert.assertFalse(((JDirectClass) (rClassId)).isInterface());
        Assert.assertFalse(((JDirectClass) (rClassId)).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDirectClass) (rClassId)).getOuter())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDirectClass) (rClassId)).getOuter())).isClass());
        Assert.assertFalse(((JDirectClass) (rClassId)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (rClassId)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (rClassId)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(id.aa.R.id)", ((JDirectClass) (rClassId)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (rClassId)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDirectClass) (rClassId)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (rClassId)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDirectClass) (rClassId)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (rClassId)).isArray());
        Assert.assertFalse(((JDirectClass) (rClassId)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (rClassId)).isError());
        Assert.assertTrue(((JDirectClass) (rClassId)).isReference());
        Assert.assertEquals("id", o_testBasic_rv269__6);
        Assert.assertEquals("id.aa", o_testBasic_rv269__7);
        Assert.assertEquals("id.aa.R.id", o_testBasic_rv269__9);
        Assert.assertEquals(87469099, ((int) (((JDirectClass) (rClassMenu)).hashCode())));
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isAbstract());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isInterface());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDirectClass) (rClassMenu)).getOuter())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDirectClass) (rClassMenu)).getOuter())).isClass());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (rClassMenu)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(id.aa.R.menu)", ((JDirectClass) (rClassMenu)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (rClassMenu)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (rClassMenu)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDirectClass) (rClassMenu)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isArray());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (rClassMenu)).isError());
        Assert.assertTrue(((JDirectClass) (rClassMenu)).isReference());
        Assert.assertEquals("menu", o_testBasic_rv269__13);
        Assert.assertEquals("id.aa", o_testBasic_rv269__14);
        Assert.assertEquals("id.aa.R.menu", o_testBasic_rv269__16);
        Assert.assertEquals(512961099, ((int) (((JFieldRef) (myItem)).hashCode())));
        Assert.assertEquals(-564731709, ((int) (((JFieldRef) (myMenu)).hashCode())));
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (aPkg2)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (aPkg2)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (aPkg2)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (aPkg2)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (aPkg2)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (aPkg2)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (aPkg2)).isClass());
        Assert.assertFalse(((JPackage) (aPkg2)).isUnnamed());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isHidden());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (aClassAct)).getPackage())).isUnnamed());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (aClassAct)).getOuter())).isClass());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (aClassAct)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(id.aa.HelloAndroidActivity_)", ((JDefinedClass) (aClassAct)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (aClassAct)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (aClassAct)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (aClassAct)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isArray());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (aClassAct)).isError());
        Assert.assertTrue(((JDefinedClass) (aClassAct)).isReference());
        Assert.assertFalse(((JMethod) (aMethodCreate)).isConstructor());
        Assert.assertFalse(((JMethod) (aMethodCreate)).hasVarArgs());
        Assert.assertTrue(((JMethod) (aMethodCreate)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (aMethodSelected)).isConstructor());
        Assert.assertFalse(((JMethod) (aMethodSelected)).hasVarArgs());
        Assert.assertTrue(((JMethod) (aMethodSelected)).getThrows().isEmpty());
    }

    @Test(timeout = 10000)
    public void testBasic_mg158_failAssert0() throws Exception {
        try {
            IJFormatter __DSPOT_f_30 = null;
            final JCodeModel cm = new JCodeModel();
            final JDirectClass rClassId = cm.directClass("id.aa.R")._class("id");
            rClassId.name();
            rClassId._package().name();
            rClassId.fullName();
            final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
            rClassMenu.name();
            rClassMenu._package().name();
            rClassMenu.fullName();
            final JFieldRef myItem = rClassId.staticRef("myItem");
            final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
            final JPackage aPkg2 = cm._package("id.aa");
            final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
            final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
            aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
            final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onOptionsItemSelected");
            aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
            CodeModelTestsHelper.parseCodeModel(cm);
            aPkg2.generate(__DSPOT_f_30);
            org.junit.Assert.fail("testBasic_mg158 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg176_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_35 = 1396166128;
            final JCodeModel cm = new JCodeModel();
            final JDirectClass rClassId = cm.directClass("id.aa.R")._class("id");
            rClassId.name();
            rClassId._package().name();
            rClassId.fullName();
            final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
            rClassMenu.name();
            rClassMenu._package().name();
            rClassMenu.fullName();
            final JFieldRef myItem = rClassId.staticRef("myItem");
            final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
            final JPackage aPkg2 = cm._package("id.aa");
            final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
            final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
            aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
            final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onOptionsItemSelected");
            aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
            CodeModelTestsHelper.parseCodeModel(cm);
            aClassAct.constructor(__DSPOT_nMods_35);
            org.junit.Assert.fail("testBasic_mg176 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasicnull243_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDirectClass rClassId = cm.directClass("id.aa.R")._class("id");
            rClassId.name();
            rClassId._package().name();
            rClassId.fullName();
            final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
            rClassMenu.name();
            rClassMenu._package().name();
            rClassMenu.fullName();
            final JFieldRef myItem = rClassId.staticRef("myItem");
            final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
            final JPackage aPkg2 = cm._package("id.aa");
            final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
            final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
            aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
            final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, null);
            aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasicnull243 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg209_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_47 = -1775795945;
            final JCodeModel cm = new JCodeModel();
            final JDirectClass rClassId = cm.directClass("id.aa.R")._class("id");
            rClassId.name();
            rClassId._package().name();
            rClassId.fullName();
            final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
            rClassMenu.name();
            rClassMenu._package().name();
            rClassMenu.fullName();
            final JFieldRef myItem = rClassId.staticRef("myItem");
            final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
            final JPackage aPkg2 = cm._package("id.aa");
            final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
            final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
            aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
            final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onOptionsItemSelected");
            aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
            CodeModelTestsHelper.parseCodeModel(cm);
            aMethodCreate.paramAtIndex(__DSPOT_nIndex_47);
            org.junit.Assert.fail("testBasic_mg209 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -1775795945 out of bounds for length 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBasic_mg168_failAssert0() throws Exception {
        try {
            String __DSPOT_sClassLocalName_33 = "]6k!Ld8U4ryn<3,/?bI!";
            final JCodeModel cm = new JCodeModel();
            final JDirectClass rClassId = cm.directClass("id.aa.R")._class("id");
            rClassId.name();
            rClassId._package().name();
            rClassId.fullName();
            final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
            rClassMenu.name();
            rClassMenu._package().name();
            rClassMenu.fullName();
            final JFieldRef myItem = rClassId.staticRef("myItem");
            final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
            final JPackage aPkg2 = cm._package("id.aa");
            final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
            final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
            aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
            final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onOptionsItemSelected");
            aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
            CodeModelTestsHelper.parseCodeModel(cm);
            aPkg2.ref(__DSPOT_sClassLocalName_33);
            org.junit.Assert.fail("testBasic_mg168 should have thrown ClassNotFoundException");
        } catch (ClassNotFoundException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testBasic_literalMutationString34_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDirectClass rClassId = cm.directClass("id*aa.R")._class("id");
            rClassId.name();
            rClassId._package().name();
            rClassId.fullName();
            final JDirectClass rClassMenu = cm.directClass("id.aa.R")._class("menu");
            rClassMenu.name();
            rClassMenu._package().name();
            rClassMenu.fullName();
            final JFieldRef myItem = rClassId.staticRef("myItem");
            final JFieldRef myMenu = rClassMenu.staticRef("myMenu");
            final JPackage aPkg2 = cm._package("id.aa");
            final JDefinedClass aClassAct = aPkg2._class("HelloAndroidActivity_");
            final JMethod aMethodCreate = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onCreateOptionsMenu");
            aMethodCreate.body().add(JExpr.ref("menuInflater").invoke("inflate").arg(myMenu));
            final JMethod aMethodSelected = aClassAct.method(JMod.PUBLIC, cm.BOOLEAN, "onOptionsItemSelected");
            aMethodSelected.body()._if(JExpr.ref("itemId_").eq(myItem));
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testBasic_literalMutationString34 should have thrown ParseProblemException");
        } catch (ParseProblemException expected) {
        }
    }
}

