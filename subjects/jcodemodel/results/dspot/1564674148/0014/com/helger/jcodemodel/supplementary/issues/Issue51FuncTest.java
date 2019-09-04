package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JAtom;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JDocComment;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JOpBinary;
import com.helger.jcodemodel.JOpUnaryTight;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JReturn;
import com.helger.jcodemodel.JTypeVar;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.JVar;
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
    public void testDefaultMethod_add3() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod o_testDefaultMethod_add3__6 = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add3__6)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add3__6)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add3__6)).hasVarArgs());
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_add3__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_add3__21);
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add3__6)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add3__6)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add3__6)).hasVarArgs());
        Assert.assertTrue(o_testDefaultMethod_add3__21);
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
        Assert.assertEquals(1, ((int) (((JMods) (o_testDefaultMethod_mg97__21)).getValue())));
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isAbstract());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isDefault());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isStatic());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isNative());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isSynchronized());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isStrictFP());
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
    public void testDefaultMethod_mg48() throws Exception {
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
        Assert.assertTrue(o_testDefaultMethod_mg48__21);
        JPackage o_testDefaultMethod_mg48__22 = generator._package(__DSPOT_sName_4);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48__22)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48__22)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48__22)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48__22)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg48__22)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg48__22)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg48__22)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_mg48__22)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg48__22)).isPackage());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg48__22)).isClass());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg48__22)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_mg48__22)).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(o_testDefaultMethod_mg48__21);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        JReturn __DSPOT_invoc_9 = m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_rv113__22 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_rv113__22);
        IJExpression o_testDefaultMethod_rv113__23 = __DSPOT_invoc_9.expr();
        Assert.assertEquals(-861883075, ((int) (((JAtom) (o_testDefaultMethod_rv113__23)).hashCode())));
        Assert.assertTrue(o_testDefaultMethod_rv113__22);
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
    public void testDefaultMethod_mg69_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_20 = 467541199;
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue51")._class("Test");
            JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
            m.body()._return(JExpr._null());
            m.body()._return(JExpr._null());
            m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
            CodeModelTestsHelper.parseCodeModel(generator);
            CodeModelTestsHelper.parseCodeModel(generator);
            generator.addDontImportClass(URI.class);
            aInterface.constructor(__DSPOT_nMods_20);
            org.junit.Assert.fail("testDefaultMethod_mg69 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
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
    public void testDefaultMethod_rv116_mg9645() throws Exception {
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
        IJExpression o_testDefaultMethod_rv116_mg9645__28 = o_testDefaultMethod_rv116__23.eq0();
        Assert.assertEquals(-821676065, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg9645__28)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg60_mg11362() throws Exception {
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
        AbstractJType o_testDefaultMethod_mg60_mg11362__27 = o_testDefaultMethod_mg60__22.unboxify();
        Assert.assertEquals(-957235412, ((int) (((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isAbstract());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(@)C1RND7C-6y}W`_*s>))", ((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isParameterized());
        Assert.assertNull(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isError());
        Assert.assertTrue(((JDirectClass) (o_testDefaultMethod_mg60_mg11362__27)).isReference());
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg102_failAssert0_mg2203_failAssert0() throws Exception {
        try {
            {
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
                m.listParamTypes();
            }
            org.junit.Assert.fail("testDefaultMethod_mg102_failAssert0_mg2203 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1448749422", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg102_failAssert0_mg2203_failAssert0_add23174_failAssert0() throws Exception {
        try {
            {
                {
                    int __DSPOT_nIndex_32 = -1448749422;
                    final JCodeModel generator = new JCodeModel();
                    final JDefinedClass aInterface = generator._package("issue51")._class("Test");
                    JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
                    m.body()._return(JExpr._null());
                    m.body()._return(JExpr._null());
                    m.body()._return(JExpr._null());
                    m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
                    CodeModelTestsHelper.parseCodeModel(generator);
                    CodeModelTestsHelper.parseCodeModel(generator);
                    generator.addDontImportClass(URI.class);
                    m.paramAtIndex(__DSPOT_nIndex_32);
                    org.junit.Assert.fail("testDefaultMethod_mg102 should have thrown ArrayIndexOutOfBoundsException");
                    m.listParamTypes();
                }
                org.junit.Assert.fail("testDefaultMethod_mg102_failAssert0_mg2203 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testDefaultMethod_mg102_failAssert0_mg2203_failAssert0_add23174 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1448749422", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113_mg11432_mg19297() throws Exception {
        int __DSPOT_rhs_5435 = -171387813;
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
        JVar o_testDefaultMethod_rv113_mg11432__28 = m.varParam();
        IJExpression o_testDefaultMethod_rv113_mg11432_mg19297__32 = o_testDefaultMethod_rv113__23.shr(__DSPOT_rhs_5435);
        Assert.assertEquals(-993062886, ((int) (((JOpBinary) (o_testDefaultMethod_rv113_mg11432_mg19297__32)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_literalMutationString40_add4260_mg18679() throws Exception {
        String __DSPOT_sSubPackageName_5229 = "4wLD2B(25{r*5 :fQ(GC";
        final JCodeModel generator = new JCodeModel();
        JPackage o_testDefaultMethod_literalMutationString40_add4260__3 = generator._package("issue51");
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "xx");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_literalMutationString40__20 = generator.addDontImportClass(URI.class);
        JPackage o_testDefaultMethod_literalMutationString40_add4260_mg18679__27 = o_testDefaultMethod_literalMutationString40_add4260__3.subPackage(__DSPOT_sSubPackageName_5229);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).isPackage());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).isClass());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_literalMutationString40_add4260_mg18679__27)).getAllResourceFiles())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg78_mg12761_mg16432() throws Exception {
        AbstractJType[] __DSPOT_aArgTypes_26 = new AbstractJType[0];
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg78__21 = generator.addDontImportClass(URI.class);
        JMethod o_testDefaultMethod_mg78__22 = aInterface.getConstructor(__DSPOT_aArgTypes_26);
        JPackage o_testDefaultMethod_mg78_mg12761__27 = aInterface._package();
        IJClassContainer<?> o_testDefaultMethod_mg78_mg12761_mg16432__30 = o_testDefaultMethod_mg78_mg12761__27.parentContainer();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).isPackage());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).isClass());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_mg78_mg12761_mg16432__30)).getAllResourceFiles())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg98_mg11695_mg25038_failAssert0() throws Exception {
        try {
            String __DSPOT_sClassLocalName_7127 = "_tX`v,q5k(e:CODQ#&z`";
            final JCodeModel generator = new JCodeModel();
            final JDefinedClass aInterface = generator._package("issue51")._class("Test");
            JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
            m.body()._return(JExpr._null());
            m.body()._return(JExpr._null());
            m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
            CodeModelTestsHelper.parseCodeModel(generator);
            CodeModelTestsHelper.parseCodeModel(generator);
            boolean o_testDefaultMethod_mg98__20 = generator.addDontImportClass(URI.class);
            String o_testDefaultMethod_mg98__21 = m.name();
            JPackage o_testDefaultMethod_mg98_mg11695__26 = generator.rootPackage();
            o_testDefaultMethod_mg98_mg11695__26.ref(__DSPOT_sClassLocalName_7127);
            org.junit.Assert.fail("testDefaultMethod_mg98_mg11695_mg25038 should have thrown ClassNotFoundException");
        } catch (ClassNotFoundException expected) {
            Assert.assertEquals("_tX`v,q5k(e:CODQ#&z`", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113_mg11432_mg19228() throws Exception {
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
        JVar o_testDefaultMethod_rv113_mg11432__28 = m.varParam();
        IJExpression o_testDefaultMethod_rv113_mg11432_mg19228__31 = o_testDefaultMethod_rv113__23.decr();
        Assert.assertEquals(2068785167, ((int) (((JOpUnaryTight) (o_testDefaultMethod_rv113_mg11432_mg19228__31)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg48_mg2233_mg20779() throws Exception {
        Map<String, String> __DSPOT_aAttributes_5850 = Collections.singletonMap("_$5zDg#nZs[u3zXYEp :", "!vH.J|QH&*wyv$(PtSej");
        String __DSPOT_sName_5849 = ":By.25EuE7;Gaa(Aq1FX";
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
        JDocComment o_testDefaultMethod_mg48_mg2233__27 = aInterface.headerComment();
        Map<String, String> o_testDefaultMethod_mg48_mg2233_mg20779__33 = o_testDefaultMethod_mg48_mg2233__27.addXdoclet(__DSPOT_sName_5849, __DSPOT_aAttributes_5850);
        Assert.assertTrue(o_testDefaultMethod_mg48_mg2233_mg20779__33.containsKey("_$5zDg#nZs[u3zXYEp :"));
        Assert.assertEquals("!vH.J|QH&*wyv$(PtSej", o_testDefaultMethod_mg48_mg2233_mg20779__33.get("_$5zDg#nZs[u3zXYEp :"));
    }
}

