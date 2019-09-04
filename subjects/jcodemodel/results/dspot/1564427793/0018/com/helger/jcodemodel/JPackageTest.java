package com.helger.jcodemodel;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
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
        Assert.assertNull(o_testGetParent_mg25__15);
    }

    @Test(timeout = 10000)
    public void testGetParent_mg45() throws Exception {
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
        JPackage o_testGetParent_mg45__15 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg45__15);
        JTypeWildcard o_testGetParent_mg45__16 = wClass.wildcardSuper();
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg45__16)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg45__16)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg45__16)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? super com.helger.jcodemodel.JExpr)", ((JTypeWildcard) (o_testGetParent_mg45__16)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testGetParent_mg45__16)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testGetParent_mg45__16)).getPrimitiveType());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg45__16)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testGetParent_mg45__16)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg45__16)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testGetParent_mg45__16)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testGetParent_mg45__16)).isReference());
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
        Assert.assertNull(o_testGetParent_mg45__15);
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
        Assert.assertNull(o_testGetParent_mg32__16);
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
        JPackage o_testGetParent_mg62__16 = wCurrentPackage.parent();
        Assert.assertNull(o_testGetParent_mg62__16);
        JPackage o_testGetParent_mg62__17 = wCurrentPackage.subPackage(__DSPOT_sSubPackageName_34);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testGetParent_mg62__17)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testGetParent_mg62__17)).isPackage());
        Assert.assertFalse(((JPackage) (o_testGetParent_mg62__17)).isClass());
        Assert.assertFalse(((JPackage) (o_testGetParent_mg62__17)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testGetParent_mg62__17)).getAllResourceFiles())).isEmpty());
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
    public void testGetParent_mg35_mg6378_failAssert0() throws Exception {
        try {
            List<? extends AbstractJClass> __DSPOT_aClazz_1756 = Collections.emptyList();
            final JCodeModel wModel = new JCodeModel();
            final AbstractJClass wClass = wModel.ref(JExpr.class);
            JPackage wCurrentPackage = wClass._package();
            while ((wCurrentPackage.parent()) != null) {
                wCurrentPackage = wCurrentPackage.parent();
            } 
            JPackage o_testGetParent_mg35__15 = wCurrentPackage.parent();
            AbstractJClass o_testGetParent_mg35__16 = wClass.narrowAny();
            o_testGetParent_mg35__16.narrow(__DSPOT_aClazz_1756);
            org.junit.Assert.fail("testGetParent_mg35_mg6378 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(com.helger.jcodemodel.JExpr<? extends java.lang.Object>)", expected.getMessage());
        }
    }
}

