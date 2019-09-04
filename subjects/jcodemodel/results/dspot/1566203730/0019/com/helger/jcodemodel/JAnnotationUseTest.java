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
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv58() throws Exception {
        long __DSPOT_nValue_49 = 804819380L;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv58__9 = __DSPOT_invoc_3.param(__DSPOT_nValue_49);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv58__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv59() throws Exception {
        short __DSPOT_nValue_50 = 12212;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv59__9 = __DSPOT_invoc_3.param(__DSPOT_nValue_50);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv59__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv63() throws Exception {
        char[] __DSPOT_aValues_57 = new char[0];
        String __DSPOT_sName_56 = "MFZw!EI)uhDiCMs-NCPS";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv63__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_56, __DSPOT_aValues_57);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv63__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv42() throws Exception {
        boolean __DSPOT_bValue_24 = true;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv42__9 = __DSPOT_invoc_3.param(__DSPOT_bValue_24);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv42__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv64() throws Exception {
        AbstractJType[] __DSPOT_aValues_59 = new AbstractJType[]{  };
        String __DSPOT_sName_58 = "sen+,yJLZTgm;JxP,_&`";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv64__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_58, __DSPOT_aValues_59);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv64__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv61() throws Exception {
        boolean[] __DSPOT_aValues_53 = new boolean[]{ true, false };
        String __DSPOT_sName_52 = "UUWY=?8NvMRz<]d[Uel1";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv61__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_52, __DSPOT_aValues_53);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv61__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv62() throws Exception {
        byte[] __DSPOT_aValues_55 = new byte[0];
        String __DSPOT_sName_54 = "Aa]P!B!8p#]q;a7/ez@l";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv62__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_54, __DSPOT_aValues_55);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv62__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv60() throws Exception {
        String __DSPOT_sName_51 = "($16qvQ}E3:oK*M=;$a4";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationArrayMember o_testPackageAnnotation_rv60__9 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_51);
        Assert.assertTrue(((JAnnotationArrayMember) (o_testPackageAnnotation_rv60__9)).getAllAnnotations().isEmpty());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
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
    public void testPackageAnnotation_mg30() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse o_testPackageAnnotation_mg30__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJClass o_testPackageAnnotation_mg30__6 = cm.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isError());
        Assert.assertNull(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isReference());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testPackageAnnotation_mg30__6)).isPrimitive());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg30__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv49() throws Exception {
        boolean __DSPOT_bValue_32 = false;
        String __DSPOT_sName_31 = "^zOCxu?!rIXp5pNO|oPq";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv49__10 = __DSPOT_invoc_3.param(__DSPOT_sName_31, __DSPOT_bValue_32);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv49__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv47() throws Exception {
        int __DSPOT_nValue_29 = 1733528622;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv47__9 = __DSPOT_invoc_3.param(__DSPOT_nValue_29);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv47__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv69() throws Exception {
        int[] __DSPOT_aValues_69 = new int[]{ 1294758391 };
        String __DSPOT_sName_68 = "vLY3Pe#L360:}[gYFUIC";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv69__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_68, __DSPOT_aValues_69);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv69__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv48() throws Exception {
        String __DSPOT_sValue_30 = "0]W#nkib%A@IY:Wo-9M/";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv48__9 = __DSPOT_invoc_3.param(__DSPOT_sValue_30);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv48__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv45() throws Exception {
        double __DSPOT_dValue_27 = 0.42153086832340625;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv45__9 = __DSPOT_invoc_3.param(__DSPOT_dValue_27);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv45__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv67() throws Exception {
        double[] __DSPOT_aValues_65 = new double[]{ 0.5287642223372351, 0.09065117081254415 };
        String __DSPOT_sName_64 = "^(qL7}kh?A:jNYySysP>";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv67__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_64, __DSPOT_aValues_65);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv67__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv46() throws Exception {
        float __DSPOT_fValue_28 = 0.1662341F;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv46__9 = __DSPOT_invoc_3.param(__DSPOT_fValue_28);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv46__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv68() throws Exception {
        float[] __DSPOT_aValues_67 = new float[]{ 0.054157432F };
        String __DSPOT_sName_66 = "C-?9AC*$S oY.>c^U!$C";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv68__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_66, __DSPOT_aValues_67);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv68__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv43() throws Exception {
        byte __DSPOT_nValue_25 = -9;
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv43__9 = __DSPOT_invoc_3.param(__DSPOT_nValue_25);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv43__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv65() throws Exception {
        IJExpression[] __DSPOT_aValues_61 = new IJExpression[]{  };
        String __DSPOT_sName_60 = "8:?%1I,&C;G<+|h=gdwL";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv65__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_60, __DSPOT_aValues_61);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv65__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv44() throws Exception {
        char __DSPOT_cValue_26 = 'r';
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv44__9 = __DSPOT_invoc_3.param(__DSPOT_cValue_26);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv44__9)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv66() throws Exception {
        JEnumConstant[] __DSPOT_aValues_63 = new JEnumConstant[]{  };
        String __DSPOT_sName_62 = "G{#C.D%L]DUhLoAf#)/A";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv66__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_62, __DSPOT_aValues_63);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv66__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv52() throws Exception {
        double __DSPOT_dValue_38 = 0.9462201138901207;
        String __DSPOT_sName_37 = "U#J;!9+7]6k!Ld8U4ryn";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv52__10 = __DSPOT_invoc_3.param(__DSPOT_sName_37, __DSPOT_dValue_38);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv52__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv74() throws Exception {
        short[] __DSPOT_aValues_79 = new short[0];
        String __DSPOT_sName_78 = "=0]>?iJ#]gu.p/60%FD2";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv74__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_78, __DSPOT_aValues_79);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv74__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv50() throws Exception {
        byte __DSPOT_nValue_34 = -12;
        String __DSPOT_sName_33 = "r5>K`HNw]f4QDhB+ _ 2";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv50__10 = __DSPOT_invoc_3.param(__DSPOT_sName_33, __DSPOT_nValue_34);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv50__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg24() throws Exception {
        String __DSPOT_sName_16 = "6y}W`_*s>).BmtV)2[ga";
        String __DSPOT_sMessage_15 = "L&q_{{l>^r@)C1RND7C-";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse o_testPackageAnnotation_mg24__5 = cm._package("foo").annotate(Inherited.class);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        JErrorClass o_testPackageAnnotation_mg24__8 = cm.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg24__8)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg24__8)).isAbstract());
        Assert.assertEquals("L&q_{{l>^r@)C1RND7C-", ((JErrorClass) (o_testPackageAnnotation_mg24__8)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testPackageAnnotation_mg24__8)).isError());
        Assert.assertNull(((JErrorClass) (o_testPackageAnnotation_mg24__8)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testPackageAnnotation_mg24__8)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg24__8)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testPackageAnnotation_mg24__8)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testPackageAnnotation_mg24__8)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg24__8)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg24__8)).isPrimitive());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg24__5)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv51() throws Exception {
        char __DSPOT_cValue_36 = 'b';
        String __DSPOT_sName_35 = "pb?56TtKz.F5M(E@of6;";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv51__10 = __DSPOT_invoc_3.param(__DSPOT_sName_35, __DSPOT_cValue_36);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv51__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv73() throws Exception {
        long[] __DSPOT_aValues_77 = new long[]{ -810941415L };
        String __DSPOT_sName_76 = "niWimrOiR]O2;851PO!@";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv73__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_76, __DSPOT_aValues_77);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv73__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg23() throws Exception {
        String __DSPOT_sMessage_14 = "VTx>DODA!L#vK5WR{oE1";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse o_testPackageAnnotation_mg23__4 = cm._package("foo").annotate(Inherited.class);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        JErrorClass o_testPackageAnnotation_mg23__7 = cm.errorClass(__DSPOT_sMessage_14);
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg23__7)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg23__7)).isAbstract());
        Assert.assertEquals("VTx>DODA!L#vK5WR{oE1", ((JErrorClass) (o_testPackageAnnotation_mg23__7)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testPackageAnnotation_mg23__7)).isError());
        Assert.assertNull(((JErrorClass) (o_testPackageAnnotation_mg23__7)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testPackageAnnotation_mg23__7)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg23__7)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testPackageAnnotation_mg23__7)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testPackageAnnotation_mg23__7)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg23__7)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testPackageAnnotation_mg23__7)).isPrimitive());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg23__4)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv70() throws Exception {
        Class<?>[] __DSPOT_aValues_71 = new Class<?>[]{  };
        String __DSPOT_sName_70 = ")SU7EvLBHp9HIW?9U-1%";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv70__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_70, __DSPOT_aValues_71);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv70__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv71() throws Exception {
        Enum<?>[] __DSPOT_aValues_73 = new Enum<?>[]{  };
        String __DSPOT_sName_72 = "+1!kAF:15u&sdcOgKS{q";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
        CodeModelTestsHelper.parseCodeModel(cm);
        JAnnotationUse o_testPackageAnnotation_rv71__10 = __DSPOT_invoc_3.paramArray(__DSPOT_sName_72, __DSPOT_aValues_73);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationClass())).isError());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).getAnnotationMembers().isEmpty());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_rv71__10)).hasAnnotationMembers());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg28() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse o_testPackageAnnotation_mg28__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        JPackage o_testPackageAnnotation_mg28__6 = cm.rootPackage();
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_mg28__6)).isUnnamed());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_mg28__6)).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_mg28__6)).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_mg28__6)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_mg28__6)).isPackage());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg28__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg27() throws Exception {
        String __DSPOT_sFullyQualifiedClassName_18 = "3r6EO;&FZRy/=u eShD9";
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse o_testPackageAnnotation_mg27__4 = cm._package("foo").annotate(Inherited.class);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJClass o_testPackageAnnotation_mg27__7 = cm.ref(__DSPOT_sFullyQualifiedClassName_18);
        Assert.assertEquals(1144171899, ((int) (((JDirectClass) (o_testPackageAnnotation_mg27__7)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isAbstract());
        Assert.assertNull(((JDirectClass) (o_testPackageAnnotation_mg27__7)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isClass());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testPackageAnnotation_mg27__7)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testPackageAnnotation_mg27__7)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testPackageAnnotation_mg27__7)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isReference());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testPackageAnnotation_mg27__7)).isError());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg27__4)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg21() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse o_testPackageAnnotation_mg21__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        int o_testPackageAnnotation_mg21__6 = cm.countArtifacts();
        Assert.assertEquals(1, ((int) (o_testPackageAnnotation_mg21__6)));
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg21__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg20() throws Exception {
        final JCodeModel cm = new JCodeModel();
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        JAnnotationUse o_testPackageAnnotation_mg20__3 = cm._package("foo").annotate(Inherited.class);
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).hasAnnotationMembers());
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testPackageAnnotation_mg20__6 = cm.buildsErrorTypeRefs();
        Assert.assertFalse(o_testPackageAnnotation_mg20__6);
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).getAnnotationMembers().isEmpty());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_mg20__3)).hasAnnotationMembers());
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_mg14null7861_failAssert0() throws Exception {
        try {
            String __DSPOT_sFullyQualifiedClassName_3 = null;
            final JCodeModel cm = new JCodeModel();
            JAnnotationUse o_testPackageAnnotation_mg14__4 = cm._package("foo").annotate(Inherited.class);
            CodeModelTestsHelper.parseCodeModel(cm);
            JDefinedClass o_testPackageAnnotation_mg14__7 = cm._getClass(__DSPOT_sFullyQualifiedClassName_3);
            org.junit.Assert.fail("testPackageAnnotation_mg14null7861 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_rv56null8498_failAssert0() throws Exception {
        try {
            long __DSPOT_nValue_46 = 721015330L;
            String __DSPOT_sName_45 = null;
            final JCodeModel cm = new JCodeModel();
            JAnnotationUse __DSPOT_invoc_3 = cm._package("foo").annotate(Inherited.class);
            CodeModelTestsHelper.parseCodeModel(cm);
            JAnnotationUse o_testPackageAnnotation_rv56__10 = __DSPOT_invoc_3.param(__DSPOT_sName_45, __DSPOT_nValue_46);
            org.junit.Assert.fail("testPackageAnnotation_rv56null8498 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPackageAnnotation_add2_mg9555() throws Exception {
        String __DSPOT_sClassLocalName_7064 = "d%_&8`HB]>s#]]Z?#3:k";
        final JCodeModel cm = new JCodeModel();
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        JPackage o_testPackageAnnotation_add2__3 = cm._package("foo");
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2__3)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_add2__3)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2__3)).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_add2__3)).isPackage());
        JAnnotationUse o_testPackageAnnotation_add2__4 = cm._package("foo").annotate(Inherited.class);
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_add2__4)).hasAnnotationMembers());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationMembers().isEmpty());
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testPackageAnnotation_add2_mg9555__12 = o_testPackageAnnotation_add2__3.isDefined(__DSPOT_sClassLocalName_7064);
        Assert.assertFalse(o_testPackageAnnotation_add2_mg9555__12);
        Assert.assertEquals("\n", ((JCodeModel) (cm)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (cm)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((Collection) (((JCodeModel) (cm)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (cm)).getBuildingCharset());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2__3)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testPackageAnnotation_add2__3)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testPackageAnnotation_add2__3)).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testPackageAnnotation_add2__3)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testPackageAnnotation_add2__3)).isPackage());
        Assert.assertFalse(((JAnnotationUse) (o_testPackageAnnotation_add2__4)).hasAnnotationMembers());
        Assert.assertNull(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getPrimitiveType());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getAllInnerClasses().isEmpty());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isParameterized());
        Assert.assertEquals("com.helger.jcodemodel.JReferencedClass(java.lang.annotation.Inherited)", ((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).toString());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isInterface());
        Assert.assertTrue(((Collection) (((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).getTypeParameters())).isEmpty());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isAbstract());
        Assert.assertTrue(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isReference());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isArray());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isPrimitive());
        Assert.assertFalse(((AbstractJClass) (((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationClass())).isError());
        Assert.assertTrue(((JAnnotationUse) (o_testPackageAnnotation_add2__4)).getAnnotationMembers().isEmpty());
    }
}

