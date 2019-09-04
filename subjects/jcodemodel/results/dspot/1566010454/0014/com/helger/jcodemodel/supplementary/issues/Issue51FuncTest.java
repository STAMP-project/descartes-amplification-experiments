package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JAtom;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDocComment;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JNarrowedClass;
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
    public void testDefaultMethod_mg97() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg97__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg97__20);
        JMods o_testDefaultMethod_mg97__21 = m.mods();
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isStrictFP());
        Assert.assertEquals(1, ((int) (((JMods) (o_testDefaultMethod_mg97__21)).getValue())));
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isAbstract());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isDefault());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isStatic());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isNative());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isSynchronized());
        Assert.assertTrue(o_testDefaultMethod_mg97__20);
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
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg56__22)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JErrorClass) (o_testDefaultMethod_mg56__22)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg56__22)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testDefaultMethod_mg56__22)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isPrimitive());
        Assert.assertTrue(o_testDefaultMethod_mg56__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_add7() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        JAtom o_testDefaultMethod_add7__9 = JExpr._null();
        Assert.assertEquals(-861883075, ((int) (((JAtom) (o_testDefaultMethod_add7__9)).hashCode())));
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_add7__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_add7__20);
        Assert.assertEquals(-861883075, ((int) (((JAtom) (o_testDefaultMethod_add7__9)).hashCode())));
        Assert.assertTrue(o_testDefaultMethod_add7__20);
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
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg57__23)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg57__23)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JErrorClass) (o_testDefaultMethod_mg57__23)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg57__23)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testDefaultMethod_mg57__23)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg57__23)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg57__23)).isPrimitive());
        Assert.assertTrue(o_testDefaultMethod_mg57__22);
    }

    @Test(timeout = 10000)
    public void testDefaultMethodnull108_failAssert0() throws Exception {
        try {
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue51")._class("Test");
            JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), null);
            m.body()._return(JExpr._null());
            m.body()._return(JExpr._null());
            m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
            CodeModelTestsHelper.parseCodeModel(generator);
            CodeModelTestsHelper.parseCodeModel(generator);
            generator.addDontImportClass(URI.class);
            org.junit.Assert.fail("testDefaultMethodnull108 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_add8() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        JMethod o_testDefaultMethod_add8__12 = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).hasVarArgs());
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add8__12)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).isConstructor());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_add8__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_add8__21);
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).hasVarArgs());
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add8__12)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).isConstructor());
        Assert.assertTrue(o_testDefaultMethod_add8__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg71() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg71__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg71__20);
        boolean o_testDefaultMethod_mg71__21 = aInterface.containsErrorTypes();
        Assert.assertFalse(o_testDefaultMethod_mg71__21);
        Assert.assertTrue(o_testDefaultMethod_mg71__20);
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
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg61__21)).isClass());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg61__21)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_mg61__21)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg61__21)).isPackage());
        Assert.assertTrue(o_testDefaultMethod_mg61__20);
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
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testDefaultMethod_mg63__21)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isReference());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isPrimitive());
        Assert.assertTrue(o_testDefaultMethod_mg63__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg100() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg100__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg100__20);
        JCodeModel o_testDefaultMethod_mg100__21 = m.owner();
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testDefaultMethod_mg100__21)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (o_testDefaultMethod_mg100__21)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (o_testDefaultMethod_mg100__21)).getBuildingNewLine());
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testDefaultMethod_mg100__21)).getAllDontImportClasses())).isEmpty());
        Assert.assertTrue(o_testDefaultMethod_mg100__20);
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
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isInterface());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(issue51.Test)", ((JDefinedClass) (o_testDefaultMethod_mg101__21)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isReference());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isError());
        Assert.assertTrue(o_testDefaultMethod_mg101__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg9723() throws Exception {
        double __DSPOT_rhs_2780 = 0.07997419837070052;
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
        IJExpression o_testDefaultMethod_rv116_mg9723__29 = o_testDefaultMethod_rv116__23.minus(__DSPOT_rhs_2780);
        Assert.assertEquals(1562202778, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg9723__29)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg9745() throws Exception {
        float __DSPOT_rhs_2788 = 0.29372662F;
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
        IJExpression o_testDefaultMethod_rv116_mg9745__29 = o_testDefaultMethod_rv116__23.mul(__DSPOT_rhs_2788);
        Assert.assertEquals(-1393075106, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg9745__29)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113_mg7128() throws Exception {
        double __DSPOT_rhs_2027 = 0.2432212548048177;
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        JReturn __DSPOT_invoc_9 = m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_rv113__22 = generator.addDontImportClass(URI.class);
        IJExpression o_testDefaultMethod_rv113__23 = __DSPOT_invoc_9.expr();
        IJExpression o_testDefaultMethod_rv113_mg7128__29 = o_testDefaultMethod_rv113__23.plus(__DSPOT_rhs_2027);
        Assert.assertEquals(3123087, ((int) (((JOpBinary) (o_testDefaultMethod_rv113_mg7128__29)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113_mg7100() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        JReturn __DSPOT_invoc_9 = m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_rv113__22 = generator.addDontImportClass(URI.class);
        IJExpression o_testDefaultMethod_rv113__23 = __DSPOT_invoc_9.expr();
        IJExpression o_testDefaultMethod_rv113_mg7100__28 = o_testDefaultMethod_rv113__23.eqNull();
        Assert.assertEquals(2138753343, ((int) (((JOpBinary) (o_testDefaultMethod_rv113_mg7100__28)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg74_rv11206_mg14615() throws Exception {
        int __DSPOT_rhs_4057 = -1789832216;
        String __DSPOT_string_23 = "/=u eShD9P/&h4]]s%=]";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        JReturn __DSPOT_invoc_13 = m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg74__21 = generator.addDontImportClass(URI.class);
        aInterface.direct(__DSPOT_string_23);
        IJExpression o_testDefaultMethod_mg74_rv11206__27 = __DSPOT_invoc_13.expr();
        IJExpression o_testDefaultMethod_mg74_rv11206_mg14615__31 = o_testDefaultMethod_mg74_rv11206__27.gt(__DSPOT_rhs_4057);
        Assert.assertEquals(1683400425, ((int) (((JOpBinary) (o_testDefaultMethod_mg74_rv11206_mg14615__31)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg74_rv11206_mg14635() throws Exception {
        long __DSPOT_rhs_4071 = -1697355663L;
        String __DSPOT_string_23 = "/=u eShD9P/&h4]]s%=]";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        JReturn __DSPOT_invoc_13 = m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg74__21 = generator.addDontImportClass(URI.class);
        aInterface.direct(__DSPOT_string_23);
        IJExpression o_testDefaultMethod_mg74_rv11206__27 = __DSPOT_invoc_13.expr();
        IJExpression o_testDefaultMethod_mg74_rv11206_mg14635__31 = o_testDefaultMethod_mg74_rv11206__27.mul(__DSPOT_rhs_4071);
        Assert.assertEquals(-2122296736, ((int) (((JOpBinary) (o_testDefaultMethod_mg74_rv11206_mg14635__31)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg60_mg11983_mg20164() throws Exception {
        AbstractJClass[] __DSPOT_aClazz_5668 = new AbstractJClass[]{  };
        String __DSPOT_sFullyQualifiedClassName_18 = "@)C1RND7C-6y}W`_*s>)";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg60__21 = generator.addDontImportClass(URI.class);
        AbstractJClass o_testDefaultMethod_mg60__22 = generator.ref(__DSPOT_sFullyQualifiedClassName_18);
        JMods o_testDefaultMethod_mg60_mg11983__27 = m.mods();
        AbstractJClass o_testDefaultMethod_mg60_mg11983_mg20164__31 = o_testDefaultMethod_mg60__22.narrow(__DSPOT_aClazz_5668);
        Assert.assertEquals(-1057971875, ((int) (((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).hashCode())));
        Assert.assertFalse(((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).isError());
        Assert.assertTrue(((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).isParameterized());
        Assert.assertNull(((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(@)C1RND7C-6y}W`_*s>)<>)", ((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).toString());
        Assert.assertTrue(((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).isReference());
        Assert.assertFalse(((JNarrowedClass) (o_testDefaultMethod_mg60_mg11983_mg20164__31)).isPrimitive());
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg92_add467_mg20026() throws Exception {
        boolean __DSPOT_bSingleLineMode_5645 = true;
        final JCodeModel generator = new JCodeModel();
        JPackage o_testDefaultMethod_mg92_add467__3 = generator._package("issue51");
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg92__20 = generator.addDontImportClass(URI.class);
        JDocComment o_testDefaultMethod_mg92__21 = m.javadoc();
        JDocComment o_testDefaultMethod_mg92_add467_mg20026__30 = o_testDefaultMethod_mg92__21.setSingleLineMode(__DSPOT_bSingleLineMode_5645);
        Assert.assertTrue(o_testDefaultMethod_mg92_add467_mg20026__30.isEmpty());
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg98_rv3876_mg31278() throws Exception {
        int __DSPOT_rhs_9023 = -594704297;
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        JReturn __DSPOT_invoc_9 = m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg98__20 = generator.addDontImportClass(URI.class);
        String o_testDefaultMethod_mg98__21 = m.name();
        Assert.assertEquals("noURL", o_testDefaultMethod_mg98__21);
        IJExpression o_testDefaultMethod_mg98_rv3876__28 = __DSPOT_invoc_9.expr();
        IJExpression o_testDefaultMethod_mg98_rv3876_mg31278__32 = o_testDefaultMethod_mg98_rv3876__28.shrz(__DSPOT_rhs_9023);
        Assert.assertEquals(-1414532328, ((int) (((JOpBinary) (o_testDefaultMethod_mg98_rv3876_mg31278__32)).hashCode())));
        Assert.assertEquals("noURL", o_testDefaultMethod_mg98__21);
    }
}

