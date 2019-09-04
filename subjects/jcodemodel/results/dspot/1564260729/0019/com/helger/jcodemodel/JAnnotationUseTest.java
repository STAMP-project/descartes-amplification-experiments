package com.helger.jcodemodel;


import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.lang.annotation.Inherited;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public final class JAnnotationUseTest {
    @Test(timeout = 10000)
    public void testPackageAnnotation() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse o_testPackageAnnotation__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationMembers().isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationMembers().isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv49() throws Exception {
        boolean __DSPOT_bValue_32 = false;
        String __DSPOT_sName_31 = "^zOCxu?!rIXp5pNO|oPq";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv49__10 = __DSPOT_invoc_3.param(__DSPOT_sName_31, __DSPOT_bValue_32);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv58() throws Exception {
        long __DSPOT_nValue_49 = 804819380L;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv58__9 = __DSPOT_invoc_3.param(__DSPOT_nValue_49);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv57() throws Exception {
        short __DSPOT_nValue_48 = -16662;
        String __DSPOT_sName_47 = "$N`nJW,ftS}%g/mS6TE0";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv57__10 = __DSPOT_invoc_3.param(__DSPOT_sName_47, __DSPOT_nValue_48);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv57__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv43() throws Exception {
        byte __DSPOT_nValue_25 = -9;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv43__9 = __DSPOT_invoc_3.param(__DSPOT_nValue_25);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg26() throws Exception {
        String __DSPOT_sName_17 = "NZ#S&Gu4*{9Gi}cRQHCH";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse o_testPackageAnnotation_mg26__4 = cm._package("foo").annotate(Inherited.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJType o_testPackageAnnotation_mg26__7 = cm.parseType(__DSPOT_sName_17);
        Assert.assertEquals(84123800, ((int) (((JDirectClass) (o_testPackageAnnotation_mg26__7)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isAbstract());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isPackage());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isClass());
        Assert.assertNull(((JDirectClass) (o_testPackageAnnotation_mg26__7)).getOuter());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(NZ)", ((JDirectClass) (o_testPackageAnnotation_mg26__7)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testPackageAnnotation_mg26__7)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDirectClass) (o_testPackageAnnotation_mg26__7)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testPackageAnnotation_mg26__7)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isParameterized());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isError());
        Assert.assertTrue(((JDirectClass) (o_testPackageAnnotation_mg26__7)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg26__4)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg15() throws Exception {
        String __DSPOT_sName_4 = "&zgYc TM1`_8;0L`A=SO";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse o_testPackageAnnotation_mg15__4 = cm._package("foo").annotate(Inherited.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        JPackage o_testPackageAnnotation_mg15__7 = cm._package(__DSPOT_sName_4);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg15__7)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg15__7)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg15__7)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg15__7)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_mg15__7)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_mg15__7)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_mg15__7)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg15__7)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_mg15__7)).isPackage());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_mg15__7)).isClass());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_mg15__7)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_mg15__7)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg15__4)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv52() throws Exception {
        double __DSPOT_dValue_38 = 0.9462201138901207;
        String __DSPOT_sName_37 = "U#J;!9+7]6k!Ld8U4ryn";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv52__10 = __DSPOT_invoc_3.param(__DSPOT_sName_37, __DSPOT_dValue_38);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv53() throws Exception {
        float __DSPOT_fValue_40 = 0.09375568F;
        String __DSPOT_sName_39 = ",/?bI!ElJH!D*A3(%|?=";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv53__10 = __DSPOT_invoc_3.param(__DSPOT_sName_39, __DSPOT_fValue_40);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv53__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv61() throws Exception {
        boolean[] __DSPOT_aValues_53 = new boolean[]{ true, false };
        String __DSPOT_sName_52 = "UUWY=?8NvMRz<]d[Uel1";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv61__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_52, __DSPOT_aValues_53);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv51() throws Exception {
        char __DSPOT_cValue_36 = 'b';
        String __DSPOT_sName_35 = "pb?56TtKz.F5M(E@of6;";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv51__10 = __DSPOT_invoc_3.param(__DSPOT_sName_35, __DSPOT_cValue_36);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv60() throws Exception {
        String __DSPOT_sName_51 = "($16qvQ}E3:oK*M=;$a4";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationArrayMember o_testPackageAnnotation_rv60__9 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_51);
        Assert.assertTrue(((JAnnotationArrayMember) (o_testPackageAnnotation_rv60__9)).getAllAnnotations().isEmpty());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_literalMutationString6_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            cm._package("").annotate(Inherited.class);
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testPackageAnnotation_literalMutationString6 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be false but it is not: the root package cannot be annotated", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg21() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse o_testPackageAnnotation_mg21__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        int o_testPackageAnnotation_mg21__6 = cm.countArtifacts();
        Assert.assertEquals(1, ((int) (o_testPackageAnnotation_mg21__6)));
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg20() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse o_testPackageAnnotation_mg20__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testPackageAnnotation_mg20__6 = cm.buildsErrorTypeRefs();
        Assert.assertFalse(o_testPackageAnnotation_mg20__6);
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg30() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse o_testPackageAnnotation_mg30__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJClass o_testPackageAnnotation_mg30__6 = cm.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isParameterized());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isReference());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isReference());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_add2_mg10113() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JPackage o_testPackageAnnotation_add2__3 = cm._package("foo");
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_add2__3)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_add2__3)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2__3)).isClass());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2__3)).isUnnamed());
        JAnnotationUse o_testPackageAnnotation_add2__4 = cm._package("foo").annotate(Inherited.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_add2__4)).hasAnnotationMembers());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationMembers().isEmpty());
        CodeModelTestsHelper.parseCodeModel(cm);
        IJClassContainer<?> o_testPackageAnnotation_add2_mg10113__11 = o_testPackageAnnotation_add2__3.parentContainer();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).isClass());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_add2_mg10113__11)).isUnnamed());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_add2__3)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_add2__3)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2__3)).isClass());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2__3)).isUnnamed());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_add2__4)).hasAnnotationMembers());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationMembers().isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv50null7887_failAssert0() throws Exception {
        try {
            byte __DSPOT_nValue_34 = -12;
            String __DSPOT_sName_33 = "r5>K`HNw]f4QDhB+ _ 2";
            final JCodeModel cm = new JCodeModel();
            JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
            CodeModelTestsHelper.parseCodeModel(cm);
            JAnnotationUse o_testPackageAnnotation_rv50__10 = __DSPOT_invoc_3.param(null, __DSPOT_nValue_34);
            org.junit.Assert.fail("testPackageAnnotation_rv50null7887 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg28_mg3514() throws Exception {
        String __DSPOT_sName_2781 = " 8lfF.02lc2DwJc)b(0f";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        JAnnotationUse o_testPackageAnnotation_mg28__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).hasAnnotationMembers());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationMembers().isEmpty());
        CodeModelTestsHelper.parseCodeModel(cm);
        JPackage o_testPackageAnnotation_mg28__6 = cm.rootPackage();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_mg28__6)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_mg28__6)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_mg28__6)).isClass());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_mg28__6)).isUnnamed());
        boolean o_testPackageAnnotation_mg28_mg3514__12 = o_testPackageAnnotation_mg28__6.hasResourceFile(__DSPOT_sName_2781);
        Assert.assertFalse(o_testPackageAnnotation_mg28_mg3514__12);
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isAbstract());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isParameterized());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).hasAnnotationMembers());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_mg28__6)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_mg28__6)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_mg28__6)).isClass());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_mg28__6)).isUnnamed());
    }
}

