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
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JReturn;
import com.helger.jcodemodel.JTypeVar;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
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
        Assert.assertEquals(1, ((int) (((JMods) (o_testDefaultMethod_mg86__21)).getValue())));
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isAbstract());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isDefault());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isStatic());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isNative());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isSynchronized());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg86__21)).isStrictFP());
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
        Assert.assertEquals(229190760, ((int) (((JEnumConstant) (o_testDefaultMethod_mg75__22)).hashCode())));
        Assert.assertEquals("issue51.Test.)JWOM_4gdsL9rC)A6fdF", ((JEnumConstant) (o_testDefaultMethod_mg75__22)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testDefaultMethod_mg75__22)).hasArgs());
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
    public void testDefaultMethod_mg77() throws Exception {
        String __DSPOT_sName_25 = "&0xT!&b-W-(y_V1a;?h(";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg77__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg77__21);
        JTypeVar o_testDefaultMethod_mg77__22 = aInterface.generify(__DSPOT_sName_25);
        Assert.assertFalse(((JTypeVar) (o_testDefaultMethod_mg77__22)).isInterface());
        Assert.assertFalse(((JTypeVar) (o_testDefaultMethod_mg77__22)).isAbstract());
        Assert.assertEquals("com.helger.jcodemodel.JTypeVar(&0xT!&b-W-(y_V1a;?h()", ((JTypeVar) (o_testDefaultMethod_mg77__22)).toString());
        Assert.assertTrue(((Collection) (((JTypeVar) (o_testDefaultMethod_mg77__22)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JTypeVar) (o_testDefaultMethod_mg77__22)).isParameterized());
        Assert.assertNull(((JTypeVar) (o_testDefaultMethod_mg77__22)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JTypeVar) (o_testDefaultMethod_mg77__22)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeVar) (o_testDefaultMethod_mg77__22)).isArray());
        Assert.assertFalse(((JTypeVar) (o_testDefaultMethod_mg77__22)).isPrimitive());
        Assert.assertFalse(((JTypeVar) (o_testDefaultMethod_mg77__22)).isError());
        Assert.assertTrue(((JTypeVar) (o_testDefaultMethod_mg77__22)).isReference());
        Assert.assertTrue(o_testDefaultMethod_mg77__21);
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
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg56__22)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isParameterized());
        Assert.assertNull(((JErrorClass) (o_testDefaultMethod_mg56__22)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testDefaultMethod_mg56__22)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testDefaultMethod_mg56__22)).isPrimitive());
        Assert.assertTrue(((JErrorClass) (o_testDefaultMethod_mg56__22)).isReference());
        Assert.assertTrue(o_testDefaultMethod_mg56__21);
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
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add8__12)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).hasVarArgs());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_add8__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_add8__21);
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add8__12)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).hasVarArgs());
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
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_mg61__21)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg61__21)).isPackage());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg61__21)).isClass());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg61__21)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_mg61__21)).getAllResourceFiles())).isEmpty());
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
    public void testDefaultMethod_rv116() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        JReturn __DSPOT_invoc_12 = m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_rv116__22 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_rv116__22);
        IJExpression o_testDefaultMethod_rv116__23 = __DSPOT_invoc_12.expr();
        Assert.assertEquals(-861883075, ((int) (((JAtom) (o_testDefaultMethod_rv116__23)).hashCode())));
        Assert.assertTrue(o_testDefaultMethod_rv116__22);
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
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testDefaultMethod_mg63__21)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isParameterized());
        Assert.assertNull(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isReference());
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
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isHidden());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(issue51.Test)", ((JDefinedClass) (o_testDefaultMethod_mg101__21)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isParameterized());
        Assert.assertNull(((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isError());
        Assert.assertTrue(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isReference());
        Assert.assertTrue(o_testDefaultMethod_mg101__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg92_mg4835() throws Exception {
        Map<String, String> __DSPOT_aAttributes_1302 = Collections.singletonMap("Qg&pt{$d|pI!svaO>:;j", "AHEp k{]l2UfL_ey:kGu");
        String __DSPOT_sName_1301 = "K4Q!(]R8O:jKl!j%jiL.";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg92__20 = generator.addDontImportClass(URI.class);
        JDocComment o_testDefaultMethod_mg92__21 = m.javadoc();
        Map<String, String> o_testDefaultMethod_mg92_mg4835__29 = o_testDefaultMethod_mg92__21.addXdoclet(__DSPOT_sName_1301, __DSPOT_aAttributes_1302);
        Assert.assertTrue(o_testDefaultMethod_mg92_mg4835__29.containsKey("Qg&pt{$d|pI!svaO>:;j"));
        Assert.assertEquals("AHEp k{]l2UfL_ey:kGu", o_testDefaultMethod_mg92_mg4835__29.get("Qg&pt{$d|pI!svaO>:;j"));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg84_mg10652_failAssert0() throws Exception {
        try {
            Object __DSPOT_o_2986 = new Object();
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue51")._class("Test");
            JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
            m.body()._return(JExpr._null());
            m.body()._return(JExpr._null());
            m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
            CodeModelTestsHelper.parseCodeModel(generator);
            CodeModelTestsHelper.parseCodeModel(generator);
            boolean o_testDefaultMethod_mg84__20 = generator.addDontImportClass(URI.class);
            JDocComment o_testDefaultMethod_mg84__21 = aInterface.javadoc();
            o_testDefaultMethod_mg84__21.append(__DSPOT_o_2986);
            org.junit.Assert.fail("testDefaultMethod_mg84_mg10652 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Value is of an unsupported type: class java.lang.Object", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg75_mg5079() throws Exception {
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
        JEnumConstant o_testDefaultMethod_mg75__22 = aInterface.enumConstant(__DSPOT_sName_24);
        JDocComment o_testDefaultMethod_mg75_mg5079__27 = o_testDefaultMethod_mg75__22.javadoc();
        Assert.assertTrue(o_testDefaultMethod_mg75_mg5079__27.isEmpty());
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg61_mg12264_mg21136() throws Exception {
        boolean __DSPOT_bSingleLineMode_5977 = false;
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
        JDocComment o_testDefaultMethod_mg61_mg12264__26 = m.javadoc();
        JDocComment o_testDefaultMethod_mg61_mg12264_mg21136__30 = o_testDefaultMethod_mg61_mg12264__26.setSingleLineMode(__DSPOT_bSingleLineMode_5977);
        Assert.assertTrue(o_testDefaultMethod_mg61_mg12264_mg21136__30.isEmpty());
    }
}

