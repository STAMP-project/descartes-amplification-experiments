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
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JOpBinary;
import com.helger.jcodemodel.JOpUnaryTight;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JReturn;
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
        Assert.assertEquals(1, ((int) (((JMods) (o_testDefaultMethod_mg97__21)).getValue())));
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isStatic());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isDefault());
        Assert.assertFalse(((JMods) (o_testDefaultMethod_mg97__21)).isAbstract());
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
    public void testDefaultMethod_mg66() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg66__20 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_mg66__20);
        JPackage o_testDefaultMethod_mg66__21 = aInterface._package();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg66__21)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg66__21)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg66__21)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_mg66__21)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_mg66__21)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_mg66__21)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg66__21)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_mg66__21)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_mg66__21)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_mg66__21)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg66__21)).isClass());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_mg66__21)).isUnnamed());
        Assert.assertTrue(o_testDefaultMethod_mg66__20);
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
            org.junit.Assert.fail("testDefaultMethod_mg102 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index -1448749422 out of bounds for length 0", expected.getMessage());
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
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).hasVarArgs());
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add8__12)).getThrows().isEmpty());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_add8__21 = generator.addDontImportClass(URI.class);
        Assert.assertTrue(o_testDefaultMethod_add8__21);
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).isConstructor());
        Assert.assertFalse(((JMethod) (o_testDefaultMethod_add8__12)).hasVarArgs());
        Assert.assertTrue(((JMethod) (o_testDefaultMethod_add8__12)).getThrows().isEmpty());
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
        Assert.assertNull(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).getPrimitiveType());
        Assert.assertFalse(((JTypeWildcard) (o_testDefaultMethod_mg63__21)).isParameterized());
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
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPackage())).isUnnamed());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getOuter())).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(issue51.Test)", ((JDefinedClass) (o_testDefaultMethod_mg101__21)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDefinedClass) (o_testDefaultMethod_mg101__21)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testDefaultMethod_mg101__21)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isError());
        Assert.assertTrue(((JDefinedClass) (o_testDefaultMethod_mg101__21)).isReference());
        Assert.assertTrue(o_testDefaultMethod_mg101__20);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg5651() throws Exception {
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
        IJExpression o_testDefaultMethod_rv116_mg5651__28 = o_testDefaultMethod_rv116__23.lt0();
        Assert.assertEquals(-821734717, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg5651__28)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg60_mg4577_failAssert0() throws Exception {
        try {
            String __DSPOT_sField_1236 = "h]RhcMW$![#Ze1gbT.Im";
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
            o_testDefaultMethod_mg60__22.staticRef(__DSPOT_sField_1236);
            org.junit.Assert.fail("testDefaultMethod_mg60_mg4577 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Field name contains \'.\': h]RhcMW$![#Ze1gbT.Im", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_add2_mg9147() throws Exception {
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
        IJClassContainer<?> o_testDefaultMethod_add2_mg9147__26 = o_testDefaultMethod_add2__3.parentContainer();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_add2_mg9147__26)).isPackage());
        Assert.assertFalse(((JPackage) (o_testDefaultMethod_add2_mg9147__26)).isClass());
        Assert.assertTrue(((JPackage) (o_testDefaultMethod_add2_mg9147__26)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testDefaultMethod_add2_mg9147__26)).getAllResourceFiles())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg5728() throws Exception {
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
        IJExpression o_testDefaultMethod_rv116_mg5728__28 = o_testDefaultMethod_rv116__23.predecr();
        Assert.assertEquals(2068785161, ((int) (((JOpUnaryTight) (o_testDefaultMethod_rv116_mg5728__28)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg5728_mg30702() throws Exception {
        double __DSPOT_rhs_8926 = 0.2889658062403606;
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
        IJExpression o_testDefaultMethod_rv116_mg5728__28 = o_testDefaultMethod_rv116__23.predecr();
        IJExpression o_testDefaultMethod_rv116_mg5728_mg30702__32 = o_testDefaultMethod_rv116_mg5728__28.mul(__DSPOT_rhs_8926);
        Assert.assertEquals(282535135, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg5728_mg30702__32)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_remove16_rv7852_mg17037() throws Exception {
        float __DSPOT_rhs_4819 = 0.015585424F;
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        JReturn __DSPOT_invoc_12 = m.body()._return(JExpr._null());
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_remove16__16 = generator.addDontImportClass(URI.class);
        IJExpression o_testDefaultMethod_remove16_rv7852__22 = __DSPOT_invoc_12.expr();
        IJExpression o_testDefaultMethod_remove16_rv7852_mg17037__26 = o_testDefaultMethod_remove16_rv7852__22.mul(__DSPOT_rhs_4819);
        Assert.assertEquals(-1428139254, ((int) (((JOpBinary) (o_testDefaultMethod_remove16_rv7852_mg17037__26)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg84_mg12733_mg33236() throws Exception {
        Map<String, String> __DSPOT_aAttributes_9628 = Collections.<String, String>emptyMap();
        String __DSPOT_sName_9627 = "U;^2$g59eUhDei^;8m=G";
        String __DSPOT_sFullyQualifiedClassName_3664 = "ozG<bg;wXt OQ{PH>g99";
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
        AbstractJClass o_testDefaultMethod_mg84_mg12733__27 = generator.ref(__DSPOT_sFullyQualifiedClassName_3664);
        Map<String, String> o_testDefaultMethod_mg84_mg12733_mg33236__33 = o_testDefaultMethod_mg84__21.addXdoclet(__DSPOT_sName_9627, __DSPOT_aAttributes_9628);
        Assert.assertTrue(o_testDefaultMethod_mg84_mg12733_mg33236__33.isEmpty());
    }
}

