package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.IJFormatter;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JOpBinary;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JReturn;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


public final class Issue51FuncTest {
    @Test(timeout = 10000)
    public void testDefaultMethod() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        m.body()._return(JExpr._null());
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod__19 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod__19);
        CodeModelTestsHelper.parseCodeModel(generator);
        Assert.assertTrue(o_testDefaultMethod__19);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg53() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg53__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg53__20);
        boolean o_testDefaultMethod_mg53__21 = generator.buildsErrorTypeRefs();
        Assert.assertFalse(o_testDefaultMethod_mg53__21);
        Assert.assertTrue(o_testDefaultMethod_mg53__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg86() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg86__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg86__20);
        JMods o_testDefaultMethod_mg86__21 = aInterface.mods();
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isStrictFP());
        Assert.assertEquals(1, ((int) (((JMods) (o_testDefaultMethod_mg86__21)).getValue())));
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isAbstract());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isDefault());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isStatic());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isNative());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isSynchronized());
        Assert.assertTrue(o_testDefaultMethod_mg86__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg75() throws Exception {
        String __DSPOT_sName_24 = ")JWOM_4gdsL9rC)A6fdF";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg75__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg75__21);
        JEnumConstant o_testDefaultMethod_mg75__22 = aInterface.enumConstant(__DSPOT_sName_24);
        Assert.assertFalse(((JEnumConstant) (o_testDefaultMethod_mg75__22)).hasArgs());
        Assert.assertEquals(229190760, ((int) (((JEnumConstant) (o_testDefaultMethod_mg75__22)).hashCode())));
        Assert.assertEquals("issue51.Test.)JWOM_4gdsL9rC)A6fdF", ((JEnumConstant) (o_testDefaultMethod_mg75__22)).getName());
        Assert.assertTrue(o_testDefaultMethod_mg75__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg76() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg76__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg76__20);
        Map<String, JFieldVar> o_testDefaultMethod_mg76__21 = aInterface.fields();
        Assert.assertTrue(o_testDefaultMethod_mg76__21.isEmpty());
        Assert.assertTrue(o_testDefaultMethod_mg76__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg54() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg54__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg54__20);
        int o_testDefaultMethod_mg54__21 = generator.countArtifacts();
        Assert.assertEquals(4, ((int) (o_testDefaultMethod_mg54__21)));
        Assert.assertTrue(o_testDefaultMethod_mg54__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg55() throws Exception {
        String __DSPOT_sName_13 = "][1u)p]QM-k,I]-r8//G";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg55__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg55__21);
        JDirectClass o_testDefaultMethod_mg55__22 = generator.directClass(__DSPOT_sName_13);
        Assert.assertEquals(-160704910, ((int) (((JDirectClass) (o_testDefaultMethod_mg55__22)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isAbstract());
        Assert.assertNull(((JDirectClass) (o_testDefaultMethod_mg55__22)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testDefaultMethod_mg55__22)).isClass());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testDefaultMethod_mg55__22)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testDefaultMethod_mg55__22)).getAllInnerClasses())).isEmpty());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testDefaultMethod_mg55__22)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDirectClass) (o_testDefaultMethod_mg55__22)).isReference());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg55__22)).isError());
        Assert.assertTrue(o_testDefaultMethod_mg55__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg88() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg88__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg88__20);
        Collection<JAnnotationUse> o_testDefaultMethod_mg88__21 = m.annotations();
        Assert.assertTrue(o_testDefaultMethod_mg88__21.isEmpty());
        Assert.assertTrue(o_testDefaultMethod_mg88__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg102_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_32 = -1448749422;
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue51")._class("Test");
            JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
            m.body()._return(JExpr._null());
            m.body()._return(JExpr._null());
            m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
            CodeModelTestsHelper.parseCodeModel(generator);
            CodeModelTestsHelper.parseCodeModel(generator);
            generator.addDontImportClass(URI.class);
            m.paramAtIndex(__DSPOT_nIndex_32);
            org.junit.Assert.fail("testDefaultMethod_mg102 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1448749422", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg67() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg67__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg67__20);
        Collection<JAnnotationUse> o_testDefaultMethod_mg67__21 = aInterface.annotations();
        Assert.assertTrue(o_testDefaultMethod_mg67__21.isEmpty());
        Assert.assertTrue(o_testDefaultMethod_mg67__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg56() throws Exception {
        String __DSPOT_sMessage_14 = "GUV@1wly$),bA%.UJum&";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg56__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg56__21);
        JErrorClass o_testDefaultMethod_mg56__22 = generator.errorClass(__DSPOT_sMessage_14);
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isAbstract());
        Assert.assertTrue(((JErrorClass) (o_testDefaultMethod_mg56__22)).isError());
        Assert.assertNull(((JErrorClass) (o_testDefaultMethod_mg56__22)).getPrimitiveType());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg56__22)).getAllInnerClasses())).isEmpty());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg56__22)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testDefaultMethod_mg56__22)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isPrimitive());
        Assert.assertTrue(o_testDefaultMethod_mg56__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg57() throws Exception {
        String __DSPOT_sName_16 = ";s?/OCDfviVTx>DODA!L";
        String __DSPOT_sMessage_15 = ")<4oK[>Va&1`i[aMe!@y";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg57__22 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg57__22);
        JErrorClass o_testDefaultMethod_mg57__23 = generator.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg57__23)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg57__23)).isAbstract());
        Assert.assertEquals(")<4oK[>Va&1`i[aMe!@y", ((JErrorClass) (o_testDefaultMethod_mg57__23)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testDefaultMethod_mg57__23)).isError());
        Assert.assertNull(((JErrorClass) (o_testDefaultMethod_mg57__23)).getPrimitiveType());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg57__23)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg57__23)).getAllInnerClasses())).isEmpty());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg57__23)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testDefaultMethod_mg57__23)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg57__23)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg57__23)).isPrimitive());
        Assert.assertTrue(o_testDefaultMethod_mg57__22);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_add8() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        JMethod o_testDefaultMethod_add8__12 = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add8__12)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).isConstructor());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_add8__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_add8__21);
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add8__12)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).isConstructor());
        Assert.assertTrue(o_testDefaultMethod_add8__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethodnull109_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue51")._class("Test");
            JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
            m.body()._return(JExpr._null());
            m.body()._return(JExpr._null());
            m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), null);
            CodeModelTestsHelper.parseCodeModel(generator);
            CodeModelTestsHelper.parseCodeModel(generator);
            generator.addDontImportClass(URI.class);
            org.junit.Assert.fail("testDefaultMethodnull109 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg72() throws Exception {
        String __DSPOT_sName_21 = "Gi}cRQHCH3r6EO;&FZRy";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg72__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg72__21);
        boolean o_testDefaultMethod_mg72__22 = aInterface.containsField(__DSPOT_sName_21);
        Assert.assertFalse(o_testDefaultMethod_mg72__22);
        Assert.assertTrue(o_testDefaultMethod_mg72__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg61() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg61__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg61__20);
        JPackage o_testDefaultMethod_mg61__21 = generator.rootPackage();
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg61__21)).isUnnamed());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg61__21)).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_mg61__21)).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg61__21)).isPackage());
        Assert.assertTrue(o_testDefaultMethod_mg61__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg62() throws Exception {
        String __DSPOT_sNewLine_19 = ".BmtV)2[gaNZ#S&Gu4*{";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg62__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg62__21);
        JCodeModel o_testDefaultMethod_mg62__22 = generator.setBuildingNewLine(__DSPOT_sNewLine_19);
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testDefaultMethod_mg62__22)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (o_testDefaultMethod_mg62__22)).getBuildingCharset());
        Assert.assertEquals(".BmtV)2[gaNZ#S&Gu4*{", ((JCodeModel) (o_testDefaultMethod_mg62__22)).getBuildingNewLine());
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testDefaultMethod_mg62__22)).getAllDontImportClasses())).isEmpty());
        Assert.assertTrue(o_testDefaultMethod_mg62__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg63() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg63__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg63__20);
        AbstractJClass o_testDefaultMethod_mg63__21 = generator.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isError());
        Assert.assertNull(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getPrimitiveType());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testDefaultMethod_mg63__21)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isReference());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isPrimitive());
        Assert.assertTrue(o_testDefaultMethod_mg63__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg101() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg101__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg101__20);
        JDefinedClass o_testDefaultMethod_mg101__21 = m.owningClass();
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isHidden());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isInterface());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isPackage());
        Assert.assertNull(((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(issue51.Test)", ((JDefinedClass) (o_testDefaultMethod_mg101__21)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isReference());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isError());
        Assert.assertTrue(o_testDefaultMethod_mg101__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg8105() throws Exception {
        int __DSPOT_rhs_2259 = -814857636;
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        JReturn __DSPOT_invoc_12 = m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_rv116__22 = generator.addDontImportClass(URI.class);
        IJExpression o_testDefaultMethod_rv116__23 = __DSPOT_invoc_12.expr();
        IJExpression o_testDefaultMethod_rv116_mg8105__29 = o_testDefaultMethod_rv116__23.lte(__DSPOT_rhs_2259);
        Assert.assertEquals(-1636534662, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg8105__29)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg102_failAssert0_mg2745_failAssert0() throws Exception {
        try {
            {
                IJFormatter __DSPOT_f_705 = null;
                int __DSPOT_nIndex_32 = -1448749422;
                final JCodeModel generator = new JCodeModel();
                final JDefinedClass aInterface = generator._package("issue51")._class("Test");
                JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
                m.body()._return(JExpr._null());
                m.body()._return(JExpr._null());
                m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
                CodeModelTestsHelper.parseCodeModel(generator);
                CodeModelTestsHelper.parseCodeModel(generator);
                generator.addDontImportClass(URI.class);
                m.paramAtIndex(__DSPOT_nIndex_32);
                org.junit.Assert.fail("testDefaultMethod_mg102 should have thrown ArrayIndexOutOfBoundsException");
                m.declare(__DSPOT_f_705);
            }
            org.junit.Assert.fail("testDefaultMethod_mg102_failAssert0_mg2745 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1448749422", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg48_mg6745() throws Exception {
        String __DSPOT_sSubPackageName_1886 = "!(CNLxRMVVV:0;(Q4MdF";
        String __DSPOT_sName_4 = "ha!&Bcvg[?i!rb0/|]6^";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg48__21 = generator.addDontImportClass(URI.class);
        JPackage o_testDefaultMethod_mg48__22 = generator._package(__DSPOT_sName_4);
        JPackage o_testDefaultMethod_mg48_mg6745__28 = o_testDefaultMethod_mg48__22.subPackage(__DSPOT_sSubPackageName_1886);
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).isClass());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg48_mg6745__28)).isPackage());
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_add2_mg6931_mg27531_failAssert0() throws Exception {
        try {
            IJFormatter __DSPOT_f_7870 = null;
            final JCodeModel generator = new JCodeModel();
            JPackage o_testDefaultMethod_add2__3 = generator._package("issue51");
            final JDefinedClass aInterface = generator._package("issue51")._class("Test");
            JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
            m.body()._return(JExpr._null());
            m.body()._return(JExpr._null());
            m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
            CodeModelTestsHelper.parseCodeModel(generator);
            CodeModelTestsHelper.parseCodeModel(generator);
            boolean o_testDefaultMethod_add2__20 = generator.addDontImportClass(URI.class);
            AbstractJClass o_testDefaultMethod_add2_mg6931__26 = generator.wildcard();
            o_testDefaultMethod_add2__3.generate(__DSPOT_f_7870);
            org.junit.Assert.fail("testDefaultMethod_add2_mg6931_mg27531 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg61_mg10356null28748_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_2938 = null;
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue51")._class("Test");
            JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
            m.body()._return(JExpr._null());
            m.body()._return(JExpr._null());
            m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
            CodeModelTestsHelper.parseCodeModel(generator);
            CodeModelTestsHelper.parseCodeModel(generator);
            boolean o_testDefaultMethod_mg61__20 = generator.addDontImportClass(URI.class);
            JPackage o_testDefaultMethod_mg61__21 = generator.rootPackage();
            JDefinedClass o_testDefaultMethod_mg61_mg10356__27 = o_testDefaultMethod_mg61__21._getClass(__DSPOT_sName_2938);
            org.junit.Assert.fail("testDefaultMethod_mg61_mg10356null28748 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg8105_mg29701() throws Exception {
        int __DSPOT_rhs_8522 = -2057308867;
        int __DSPOT_rhs_2259 = -814857636;
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        JReturn __DSPOT_invoc_12 = m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_rv116__22 = generator.addDontImportClass(URI.class);
        IJExpression o_testDefaultMethod_rv116__23 = __DSPOT_invoc_12.expr();
        IJExpression o_testDefaultMethod_rv116_mg8105__29 = o_testDefaultMethod_rv116__23.lte(__DSPOT_rhs_2259);
        IJExpression o_testDefaultMethod_rv116_mg8105_mg29701__33 = o_testDefaultMethod_rv116__23.gt(__DSPOT_rhs_8522);
        Assert.assertEquals(1415923774, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg8105_mg29701__33)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg54_rv980_mg26206() throws Exception {
        float __DSPOT_rhs_7483 = 0.26479167F;
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        JReturn __DSPOT_invoc_12 = m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg54__20 = generator.addDontImportClass(URI.class);
        int o_testDefaultMethod_mg54__21 = generator.countArtifacts();
        IJExpression o_testDefaultMethod_mg54_rv980__28 = __DSPOT_invoc_12.expr();
        IJExpression o_testDefaultMethod_mg54_rv980_mg26206__32 = o_testDefaultMethod_mg54_rv980__28.div(__DSPOT_rhs_7483);
        Assert.assertEquals(-1394045847, ((int) (((JOpBinary) (o_testDefaultMethod_mg54_rv980_mg26206__32)).hashCode())));
    }
}

