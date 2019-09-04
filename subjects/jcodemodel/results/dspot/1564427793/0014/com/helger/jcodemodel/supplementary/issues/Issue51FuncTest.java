package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JDocComment;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldRef;
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
import java.util.Collections;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


public final class Issue51FuncTest {
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
    public void testDefaultMethod_mg60() throws Exception {
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
        Assert.assertTrue(o_testDefaultMethod_mg60__21);
        AbstractJClass o_testDefaultMethod_mg60__22 = generator.ref(__DSPOT_sFullyQualifiedClassName_18);
        Assert.assertEquals(-957235412, ((int) (((JDirectClass) (o_testDefaultMethod_mg60__22)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isAbstract());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testDefaultMethod_mg60__22)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testDefaultMethod_mg60__22)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass(@)C1RND7C-6y}W`_*s>))", ((JDirectClass) (o_testDefaultMethod_mg60__22)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testDefaultMethod_mg60__22)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDirectClass) (o_testDefaultMethod_mg60__22)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testDefaultMethod_mg60__22)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testDefaultMethod_mg60__22)).isError());
        Assert.assertTrue(((JDirectClass) (o_testDefaultMethod_mg60__22)).isReference());
        Assert.assertTrue(o_testDefaultMethod_mg60__21);
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
    public void testDefaultMethod_rv113_mg4801() throws Exception {
        String __DSPOT_rhs_1311 = "90-M[]0:7[8r9B&346s8";
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
        IJExpression o_testDefaultMethod_rv113_mg4801__29 = o_testDefaultMethod_rv113__23.plus(__DSPOT_rhs_1311);
        Assert.assertEquals(-1326585646, ((int) (((JOpBinary) (o_testDefaultMethod_rv113_mg4801__29)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113_mg4772() throws Exception {
        long __DSPOT_rhs_1293 = 343418376L;
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
        IJExpression o_testDefaultMethod_rv113_mg4772__29 = o_testDefaultMethod_rv113__23.minus(__DSPOT_rhs_1293);
        Assert.assertEquals(818733367, ((int) (((JOpBinary) (o_testDefaultMethod_rv113_mg4772__29)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113_mg4785() throws Exception {
        long __DSPOT_rhs_1301 = -817925578L;
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
        IJExpression o_testDefaultMethod_rv113_mg4785__29 = o_testDefaultMethod_rv113__23.mul(__DSPOT_rhs_1301);
        Assert.assertEquals(1293240475, ((int) (((JOpBinary) (o_testDefaultMethod_rv113_mg4785__29)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_add2_mg12107() throws Exception {
        String __DSPOT_sClassLocalName_3497 = "1c{D@cUN5r&6xsD:fLW=";
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
        boolean o_testDefaultMethod_add2_mg12107__27 = o_testDefaultMethod_add2__3.isDefined(__DSPOT_sClassLocalName_3497);
        Assert.assertFalse(o_testDefaultMethod_add2_mg12107__27);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg5218() throws Exception {
        int __DSPOT_rhs_1425 = -558282461;
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
        IJExpression o_testDefaultMethod_rv116_mg5218__29 = o_testDefaultMethod_rv116__23.lt(__DSPOT_rhs_1425);
        Assert.assertEquals(-1380017178, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg5218__29)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg96_mg809_mg24886() throws Exception {
        Map<String, String> __DSPOT_aAttributes_7255 = Collections.singletonMap("!mzLCC-l3+-5ZXBfQr#/", "$$h!`gw{:)MI,+h?h;05");
        String __DSPOT_sName_7254 = "G]4TPmAKAa1SL6YXB)O[";
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg96__20 = generator.addDontImportClass(URI.class);
        AbstractJType o_testDefaultMethod_mg96__21 = m.listVarParamType();
        JDocComment o_testDefaultMethod_mg96_mg809__26 = m.javadoc();
        Map<String, String> o_testDefaultMethod_mg96_mg809_mg24886__32 = o_testDefaultMethod_mg96_mg809__26.addXdoclet(__DSPOT_sName_7254, __DSPOT_aAttributes_7255);
        Assert.assertTrue(o_testDefaultMethod_mg96_mg809_mg24886__32.containsKey("!mzLCC-l3+-5ZXBfQr#/"));
        Assert.assertEquals("$$h!`gw{:)MI,+h?h;05", o_testDefaultMethod_mg96_mg809_mg24886__32.get("!mzLCC-l3+-5ZXBfQr#/"));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113_mg4772_mg20611() throws Exception {
        int __DSPOT_rhs_5927 = 362398197;
        long __DSPOT_rhs_1293 = 343418376L;
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
        IJExpression o_testDefaultMethod_rv113_mg4772__29 = o_testDefaultMethod_rv113__23.minus(__DSPOT_rhs_1293);
        IJExpression o_testDefaultMethod_rv113_mg4772_mg20611__33 = o_testDefaultMethod_rv113_mg4772__29.minus(__DSPOT_rhs_5927);
        Assert.assertEquals(-294639519, ((int) (((JOpBinary) (o_testDefaultMethod_rv113_mg4772_mg20611__33)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg66_rv12697_mg21317() throws Exception {
        final JCodeModel generator = new JCodeModel();
        final JDefinedClass aInterface = generator._package("issue51")._class("Test");
        JMethod m = aInterface.method(JMod.PUBLIC, generator.ref(URI.class), "noURI");
        JReturn __DSPOT_invoc_9 = m.body()._return(JExpr._null());
        m.body()._return(JExpr._null());
        m = aInterface.method(JMod.PUBLIC, generator.ref(URL.class), "noURL");
        CodeModelTestsHelper.parseCodeModel(generator);
        CodeModelTestsHelper.parseCodeModel(generator);
        boolean o_testDefaultMethod_mg66__20 = generator.addDontImportClass(URI.class);
        JPackage o_testDefaultMethod_mg66__21 = aInterface._package();
        IJExpression o_testDefaultMethod_mg66_rv12697__28 = __DSPOT_invoc_9.expr();
        IJExpression o_testDefaultMethod_mg66_rv12697_mg21317__31 = o_testDefaultMethod_mg66_rv12697__28.lte0();
        Assert.assertEquals(-821677026, ((int) (((JOpBinary) (o_testDefaultMethod_mg66_rv12697_mg21317__31)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv113_mg4801_mg28498() throws Exception {
        String __DSPOT_sField_8393 = "q=BbrT2&C<bd8fgh[<(}";
        String __DSPOT_rhs_1311 = "90-M[]0:7[8r9B&346s8";
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
        IJExpression o_testDefaultMethod_rv113_mg4801__29 = o_testDefaultMethod_rv113__23.plus(__DSPOT_rhs_1311);
        JFieldRef o_testDefaultMethod_rv113_mg4801_mg28498__33 = o_testDefaultMethod_rv113__23.ref(__DSPOT_sField_8393);
        Assert.assertEquals(-1666608514, ((int) (((JFieldRef) (o_testDefaultMethod_rv113_mg4801_mg28498__33)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg5247_mg15901() throws Exception {
        double __DSPOT_rhs_4471 = 0.7935053644269984;
        long __DSPOT_rhs_1437 = -1881034857L;
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
        IJExpression o_testDefaultMethod_rv116_mg5247__29 = o_testDefaultMethod_rv116__23.mul(__DSPOT_rhs_1437);
        IJExpression o_testDefaultMethod_rv116_mg5247_mg15901__33 = o_testDefaultMethod_rv116_mg5247__29.mul(__DSPOT_rhs_4471);
        Assert.assertEquals(2076403060, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg5247_mg15901__33)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_mg61_mg5472_mg23148() throws Exception {
        String __DSPOT_sName_6688 = "H:@JE`Tz(k)ncb6*0wRF";
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
        AbstractJType o_testDefaultMethod_mg61_mg5472__26 = m.listVarParamType();
        boolean o_testDefaultMethod_mg61_mg5472_mg23148__30 = o_testDefaultMethod_mg61__21.hasResourceFile(__DSPOT_sName_6688);
        Assert.assertFalse(o_testDefaultMethod_mg61_mg5472_mg23148__30);
    }

    @Test(timeout = 10000)
    public void testDefaultMethod_rv116_mg5218_mg25976() throws Exception {
        double __DSPOT_rhs_7599 = 0.24661345136685686;
        int __DSPOT_rhs_1425 = -558282461;
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
        IJExpression o_testDefaultMethod_rv116_mg5218__29 = o_testDefaultMethod_rv116__23.lt(__DSPOT_rhs_1425);
        IJExpression o_testDefaultMethod_rv116_mg5218_mg25976__33 = o_testDefaultMethod_rv116_mg5218__29.div(__DSPOT_rhs_7599);
        Assert.assertEquals(-1022767324, ((int) (((JOpBinary) (o_testDefaultMethod_rv116_mg5218_mg25976__33)).hashCode())));
    }
}

