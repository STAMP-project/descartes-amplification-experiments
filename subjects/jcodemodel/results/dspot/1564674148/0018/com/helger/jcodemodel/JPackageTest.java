package com.helger.jcodemodel;


import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public final class JPackageTest {
    @Test(timeout = 10000)
    public void testGetParent() throws Exception {
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent__15 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent__15);
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testGetParent_mg14() throws Exception {
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg14__15 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg14__15);
        boolean o_testGetParent_mg14__16 = wModel.buildsErrorTypeRefs();
        Assert.assertFalse(o_testGetParent_mg14__16);
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg14__15);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg25() throws Exception {
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg25__15 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg25__15);
        JArrayClass o_testGetParent_mg25__16 = wClass.array();
        Assert.assertFalse(((JArrayClass) (o_testGetParent_mg25__16)).isInterface());
        Assert.assertTrue(((JArrayClass) (o_testGetParent_mg25__16)).isArray());
        Assert.assertFalse(((JArrayClass) (o_testGetParent_mg25__16)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(com.helger.jcodemodel.JExpr[])", ((JArrayClass) (o_testGetParent_mg25__16)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (o_testGetParent_mg25__16)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JArrayClass) (o_testGetParent_mg25__16)).getPrimitiveType());
        Assert.assertFalse(((JArrayClass) (o_testGetParent_mg25__16)).isParameterized());
        Assert.assertTrue(((Collection) (((JArrayClass) (o_testGetParent_mg25__16)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JArrayClass) (o_testGetParent_mg25__16)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (o_testGetParent_mg25__16)).isError());
        Assert.assertTrue(((JArrayClass) (o_testGetParent_mg25__16)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg25__15);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg33() throws Exception {
        Class<?>[] __DSPOT_aClazzes_24 = new Class<?>[]{  };
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg33__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg33__16);
        AbstractJClass o_testGetParent_mg33__17 = wClass.narrow(__DSPOT_aClazzes_24);
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg33__17)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg33__17)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg33__17)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg33__17)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg33__17)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(com.helger.jcodemodel.JExpr<>)", ((JNarrowedClass) (o_testGetParent_mg33__17)).toString());
        Assert.assertNull(((JNarrowedClass) (o_testGetParent_mg33__17)).getPrimitiveType());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg33__17)).isParameterized());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg33__17)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg33__17)).isPrimitive());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg33__17)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg33__16);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg42() throws Exception {
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg42__15 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg42__15);
        AbstractJType o_testGetParent_mg42__16 = wClass.unboxify();
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (o_testGetParent_mg42__16)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (o_testGetParent_mg42__16)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (o_testGetParent_mg42__16)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (o_testGetParent_mg42__16)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (o_testGetParent_mg42__16)).isArray());
        Assert.assertFalse(((JReferencedClass) (o_testGetParent_mg42__16)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (o_testGetParent_mg42__16)).isError());
        Assert.assertTrue(((JReferencedClass) (o_testGetParent_mg42__16)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg42__15);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg21() throws Exception {
        String __DSPOT_sFullyQualifiedClassName_18 = "u)p]QM-k,I]-r8//GGUV";
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg21__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg21__16);
        AbstractJClass o_testGetParent_mg21__17 = wModel.ref(__DSPOT_sFullyQualifiedClassName_18);
        Assert.assertEquals(-1464434245, ((int) (((JDirectClass) (o_testGetParent_mg21__17)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isAbstract());
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testGetParent_mg21__17)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testGetParent_mg21__17)).isClass());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testGetParent_mg21__17)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDirectClass) (o_testGetParent_mg21__17)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testGetParent_mg21__17)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testGetParent_mg21__17)).isError());
        Assert.assertTrue(((JDirectClass) (o_testGetParent_mg21__17)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg21__16);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg32() throws Exception {
        AbstractJClass[] __DSPOT_aClazz_23 = new AbstractJClass[]{  };
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg32__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg32__16);
        AbstractJClass o_testGetParent_mg32__17 = wClass.narrow(__DSPOT_aClazz_23);
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg32__17)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(com.helger.jcodemodel.JExpr<>)", ((JNarrowedClass) (o_testGetParent_mg32__17)).toString());
        Assert.assertNull(((JNarrowedClass) (o_testGetParent_mg32__17)).getPrimitiveType());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg32__17)).isParameterized());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg32__17)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isPrimitive());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg32__17)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg32__16);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg43() throws Exception {
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg43__15 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg43__15);
        JTypeWildcard o_testGetParent_mg43__16 = wClass.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg43__16)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg43__16)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg43__16)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends com.helger.jcodemodel.JExpr)", ((JTypeWildcard) (o_testGetParent_mg43__16)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testGetParent_mg43__16)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testGetParent_mg43__16)).getPrimitiveType());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg43__16)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testGetParent_mg43__16)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg43__16)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg43__16)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testGetParent_mg43__16)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg43__15);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg51() throws Exception {
        String __DSPOT_sName_31 = "RQHCH3r6EO;&FZRy/=u ";
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg51__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg51__16);
        boolean o_testGetParent_mg51__17 = wCurrentPackage.hasResourceFile(__DSPOT_sName_31);
        Assert.assertFalse(o_testGetParent_mg51__17);
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg51__16);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg62() throws Exception {
        String __DSPOT_sSubPackageName_34 = "!&b-W-(y_V1a;?h(*fl<";
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg62__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg62__16);
        JPackage o_testGetParent_mg62__17 = wCurrentPackage.subPackage(__DSPOT_sSubPackageName_34);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testGetParent_mg62__17)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testGetParent_mg62__17)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testGetParent_mg62__17)).isClass());
        Assert.assertFalse(((JPackage) (o_testGetParent_mg62__17)).isUnnamed());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg62__16);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg40_failAssert0() throws Exception {
        try {
            String __DSPOT_sField_27 = "ND7C-6y}W`_*s>).BmtV";
            final JCodeModel wModel = new JCodeModel();
            final AbstractJClass wClass = wModel.ref(JExpr.class);
            JPackage wCurrentPackage = wClass._package();
            while ((wCurrentPackage.parent()) != null) {
                wCurrentPackage = wCurrentPackage.parent();
            } 
            wCurrentPackage.parent();
            wClass.staticRef(__DSPOT_sField_27);
            org.junit.Assert.fail("testGetParent_mg40 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Field name contains \'.\': ND7C-6y}W`_*s>).BmtV", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGetParent_mg52() throws Exception {
        String __DSPOT_sClassLocalName_32 = "eShD9P/&h4]]s%=])JWO";
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg52__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg52__16);
        boolean o_testGetParent_mg52__17 = wCurrentPackage.isDefined(__DSPOT_sClassLocalName_32);
        Assert.assertFalse(o_testGetParent_mg52__17);
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg52__16);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg50_failAssert0() throws Exception {
        try {
            IJFormatter __DSPOT_f_30 = null;
            final JCodeModel wModel = new JCodeModel();
            final AbstractJClass wClass = wModel.ref(JExpr.class);
            JPackage wCurrentPackage = wClass._package();
            while ((wCurrentPackage.parent()) != null) {
                wCurrentPackage = wCurrentPackage.parent();
            } 
            wCurrentPackage.parent();
            wCurrentPackage.generate(__DSPOT_f_30);
            org.junit.Assert.fail("testGetParent_mg50 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGetParent_mg17() throws Exception {
        String __DSPOT_sMessage_14 = "#Ahw*&z*$G`c:wkJ!][,";
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg17__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg17__16);
        JErrorClass o_testGetParent_mg17__17 = wModel.errorClass(__DSPOT_sMessage_14);
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg17__17)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg17__17)).isAbstract());
        Assert.assertEquals("#Ahw*&z*$G`c:wkJ!][,", ((JErrorClass) (o_testGetParent_mg17__17)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testGetParent_mg17__17)).isError());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testGetParent_mg17__17)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JErrorClass) (o_testGetParent_mg17__17)).getPrimitiveType());
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg17__17)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testGetParent_mg17__17)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg17__17)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg17__17)).isPrimitive());
        Assert.assertTrue(((JErrorClass) (o_testGetParent_mg17__17)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg17__16);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg18() throws Exception {
        String __DSPOT_sName_16 = "xk?Yw`yc.L`HJ*J8r}4@";
        String __DSPOT_sMessage_15 = "J^uy}s#6CE3#^t lGvSz";
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg18__17 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg18__17);
        JErrorClass o_testGetParent_mg18__18 = wModel.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg18__18)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg18__18)).isAbstract());
        Assert.assertEquals("J^uy}s#6CE3#^t lGvSz", ((JErrorClass) (o_testGetParent_mg18__18)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testGetParent_mg18__18)).isError());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testGetParent_mg18__18)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JErrorClass) (o_testGetParent_mg18__18)).getPrimitiveType());
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg18__18)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testGetParent_mg18__18)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg18__18)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testGetParent_mg18__18)).isPrimitive());
        Assert.assertTrue(((JErrorClass) (o_testGetParent_mg18__18)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg18__17);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg15() throws Exception {
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg15__15 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg15__15);
        int o_testGetParent_mg15__16 = wModel.countArtifacts();
        Assert.assertEquals(0, ((int) (o_testGetParent_mg15__16)));
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertNull(o_testGetParent_mg15__15);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg60_failAssert0() throws Exception {
        try {
            String __DSPOT_sClassLocalName_33 = "M_4gdsL9rC)A6fdF&0xT";
            final JCodeModel wModel = new JCodeModel();
            final AbstractJClass wClass = wModel.ref(JExpr.class);
            JPackage wCurrentPackage = wClass._package();
            while ((wCurrentPackage.parent()) != null) {
                wCurrentPackage = wCurrentPackage.parent();
            } 
            wCurrentPackage.parent();
            wCurrentPackage.ref(__DSPOT_sClassLocalName_33);
            org.junit.Assert.fail("testGetParent_mg60 should have thrown ClassNotFoundException");
        } catch (ClassNotFoundException expected) {
            Assert.assertEquals("M_4gdsL9rC)A6fdF&0xT", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGetParent_mg42_mg11221_failAssert0() throws Exception {
        try {
            final JCodeModel wModel = new JCodeModel();
            final AbstractJClass wClass = wModel.ref(JExpr.class);
            JPackage wCurrentPackage = wClass._package();
            while ((wCurrentPackage.parent()) != null) {
                wCurrentPackage = wCurrentPackage.parent();
            } 
            JPackage o_testGetParent_mg42__15 = wCurrentPackage.parent();
            AbstractJType o_testGetParent_mg42__16 = wClass.unboxify();
            o_testGetParent_mg42__16.elementType();
            org.junit.Assert.fail("testGetParent_mg42_mg11221 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Not an array type: com.helger.jcodemodel.JExpr", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGetParent_mg32_mg10953() throws Exception {
        AbstractJClass[] __DSPOT_aClazz_2869 = new AbstractJClass[]{  };
        AbstractJClass[] __DSPOT_aClazz_23 = new AbstractJClass[]{  };
        final JCodeModel wModel = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        final AbstractJClass wClass = wModel.ref(JExpr.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        JPackage wCurrentPackage = wClass._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        while ((wCurrentPackage.parent()) != null) {
            wCurrentPackage = wCurrentPackage.parent();
        } 
        JPackage o_testGetParent_mg32__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg32__16);
        AbstractJClass o_testGetParent_mg32__17 = wClass.narrow(__DSPOT_aClazz_23);
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg32__17)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(com.helger.jcodemodel.JExpr<>)", ((JNarrowedClass) (o_testGetParent_mg32__17)).toString());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg32__17)).getAllInnerClasses())).isEmpty());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg32__17)).isParameterized());
        Assert.assertNull(((JNarrowedClass) (o_testGetParent_mg32__17)).getPrimitiveType());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isPrimitive());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg32__17)).isReference());
        AbstractJClass o_testGetParent_mg32_mg10953__23 = o_testGetParent_mg32__17.narrow(__DSPOT_aClazz_2869);
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(com.helger.jcodemodel.JExpr<>)", ((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).toString());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).getAllInnerClasses())).isEmpty());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).isParameterized());
        Assert.assertNull(((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).getPrimitiveType());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).isPrimitive());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg32_mg10953__23)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (wModel)).getAllPackages())).isEmpty());
        Assert.assertEquals("\n", ((JCodeModel) (wModel)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (wModel)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (wModel)).getBuildingCharset());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(com.helger.jcodemodel.JExpr)", ((JReferencedClass) (wClass)).toString());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((Collection) (((JReferencedClass) (wClass)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JReferencedClass) (wClass)).isParameterized());
        Assert.assertFalse(((JReferencedClass) (wClass)).isArray());
        Assert.assertFalse(((JReferencedClass) (wClass)).isPrimitive());
        Assert.assertFalse(((JReferencedClass) (wClass)).isError());
        Assert.assertTrue(((JReferencedClass) (wClass)).isReference());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (wCurrentPackage)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isPackage());
        Assert.assertTrue(((JPackage) (wCurrentPackage)).isUnnamed());
        Assert.assertFalse(((JPackage) (wCurrentPackage)).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (wCurrentPackage)).getAllResourceFiles())).isEmpty());
        Assert.assertNull(o_testGetParent_mg32__16);
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg32__17)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(com.helger.jcodemodel.JExpr<>)", ((JNarrowedClass) (o_testGetParent_mg32__17)).toString());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testGetParent_mg32__17)).getAllInnerClasses())).isEmpty());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg32__17)).isParameterized());
        Assert.assertNull(((JNarrowedClass) (o_testGetParent_mg32__17)).getPrimitiveType());
        Assert.assertFalse(((JNarrowedClass) (o_testGetParent_mg32__17)).isPrimitive());
        Assert.assertTrue(((JNarrowedClass) (o_testGetParent_mg32__17)).isReference());
    }
}

