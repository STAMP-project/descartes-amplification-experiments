package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.IJFormatter;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JBreak;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDocComment;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JLabel;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JPrimitiveType;
import com.helger.jcodemodel.JSwitch;
import com.helger.jcodemodel.JVar;
import com.helger.jcodemodel.util.CodeModelTestsHelper;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


public final class Issue41FuncTest {
    @Test(timeout = 10000)
    public void testSwitchInnerEnum() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg178() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg178__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JMods o_testSwitchInnerEnum_mg178__30 = p.mods();
        Assert.assertEquals(0, ((int) (((JMods) (o_testSwitchInnerEnum_mg178__30)).getValue())));
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isAbstract());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isDefault());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isStatic());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isNative());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isSynchronized());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isStrictFP());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg153() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg153__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg153__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg153__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg153__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJClass o_testSwitchInnerEnum_mg153__30 = cb.type();
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isHidden());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPackage())).isUnnamed());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getOuter())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getOuter())).isClass());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isAnonymous());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(issue41.Issue41Test.MyEnum)", ((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isParameterized());
        Assert.assertNull(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isError());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_mg153__30)).isReference());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg153__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg153__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg153__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg175() throws Exception {
        JVar __DSPOT_o_50 = null;
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg175__13 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg175__31 = p.equals(__DSPOT_o_50);
        Assert.assertFalse(o_testSwitchInnerEnum_mg175__31);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnumnull192_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, null);
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testSwitchInnerEnumnull192 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv220_failAssert0() throws Exception {
        try {
            IJFormatter __DSPOT_f_59 = null;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            JBreak __DSPOT_invoc_26 = s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_26.state(__DSPOT_f_59);
            org.junit.Assert.fail("testSwitchInnerEnum_rv220 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg170() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg170__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJType o_testSwitchInnerEnum_mg170__30 = m.type();
        Assert.assertTrue(((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).isPrimitive());
        Assert.assertEquals("com.helger.jcodemodel.JPrimitiveType(void)", ((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).toString());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).isArray());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).isError());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).isReference());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnumnull196_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(null).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testSwitchInnerEnumnull196 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg151() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg151__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JDocComment o_testSwitchInnerEnum_mg151__30 = cb.javadoc();
        Assert.assertTrue(o_testSwitchInnerEnum_mg151__30.isEmpty());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnumnull195_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(null);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testSwitchInnerEnumnull195 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg77() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg77__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg77__30 = cm.buildsErrorTypeRefs();
        Assert.assertFalse(o_testSwitchInnerEnum_mg77__30);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg78() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg78__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        int o_testSwitchInnerEnum_mg78__30 = cm.countArtifacts();
        Assert.assertEquals(2, ((int) (o_testSwitchInnerEnum_mg78__30)));
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_add7() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_add7__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).hasArgs());
        JMethod o_testSwitchInnerEnum_add7__13 = c2.method(0, cm.VOID, "dummy");
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add7__13)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testSwitchInnerEnum_add7__13)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add7__13)).hasVarArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).hasArgs());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add7__13)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testSwitchInnerEnum_add7__13)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add7__13)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_literalMutationString63_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enu(Param");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testSwitchInnerEnum_literalMutationString63 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'enu(Param\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg119() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg119__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg119__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg119__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg119__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg119__30 = jEnumClass.containsErrorTypes();
        Assert.assertFalse(o_testSwitchInnerEnum_mg119__30);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg119__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg119__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg119__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv200() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant __DSPOT_invoc_12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Collection<JAnnotationUse> o_testSwitchInnerEnum_rv200__32 = __DSPOT_invoc_12.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_rv200__32.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv201() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant __DSPOT_invoc_12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        List<IJExpression> o_testSwitchInnerEnum_rv201__32 = __DSPOT_invoc_12.args();
        Assert.assertTrue(o_testSwitchInnerEnum_rv201__32.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg168_failAssert0() throws Exception {
        try {
            int __DSPOT_nIndex_47 = -573926002;
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            m.paramAtIndex(__DSPOT_nIndex_47);
            org.junit.Assert.fail("testSwitchInnerEnum_mg168 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-573926002", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg72() throws Exception {
        String __DSPOT_sName_4 = "f&bk*201yCi*OdwpauR%";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg72__13 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JPackage o_testSwitchInnerEnum_mg72__31 = cm._package(__DSPOT_sName_4);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testSwitchInnerEnum_mg72__31)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testSwitchInnerEnum_mg72__31)).isClass());
        Assert.assertFalse(((JPackage) (o_testSwitchInnerEnum_mg72__31)).isUnnamed());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv204() throws Exception {
        Object __DSPOT_o_55 = new Object();
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant __DSPOT_invoc_12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_rv204__34 = __DSPOT_invoc_12.equals(__DSPOT_o_55);
        Assert.assertFalse(o_testSwitchInnerEnum_rv204__34);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg166() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg166__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JCodeModel o_testSwitchInnerEnum_mg166__30 = m.owner();
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testSwitchInnerEnum_mg166__30)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (o_testSwitchInnerEnum_mg166__30)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (o_testSwitchInnerEnum_mg166__30)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (o_testSwitchInnerEnum_mg166__30)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg120() throws Exception {
        String __DSPOT_sName_30 = "*A3(%|?=4=uV!aV(v6Iw";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg120__13 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg120__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg120__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg120__13)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg120__31 = jEnumClass.containsField(__DSPOT_sName_30);
        Assert.assertFalse(o_testSwitchInnerEnum_mg120__31);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg120__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg120__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg120__13)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg124() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg124__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Map<String, JFieldVar> o_testSwitchInnerEnum_mg124__30 = jEnumClass.fields();
        Assert.assertTrue(o_testSwitchInnerEnum_mg124__30.isEmpty());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg180_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_52 = "*M=;$a4UUWY=?8NvMRz<";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            p.name(__DSPOT_sName_52);
            org.junit.Assert.fail("testSwitchInnerEnum_mg180 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'*M=;$a4UUWY=?8NvMRz<\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_literalMutationNumber54_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(-1, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testSwitchInnerEnum_literalMutationNumber54 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg80() throws Exception {
        String __DSPOT_sMessage_14 = "r6EO;&FZRy/=u eShD9P";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg80__13 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JErrorClass o_testSwitchInnerEnum_mg80__31 = cm.errorClass(__DSPOT_sMessage_14);
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isAbstract());
        Assert.assertTrue(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isError());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isParameterized());
        Assert.assertNull(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isPrimitive());
        Assert.assertTrue(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isReference());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg81() throws Exception {
        String __DSPOT_sName_16 = "L9rC)A6fdF&0xT!&b-W-";
        String __DSPOT_sMessage_15 = "/&h4]]s%=])JWOM_4gds";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg81__14 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JErrorClass o_testSwitchInnerEnum_mg81__32 = cm.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isAbstract());
        Assert.assertTrue(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isError());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isParameterized());
        Assert.assertNull(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isPrimitive());
        Assert.assertTrue(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isReference());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv213() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_rv213__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        JBreak __DSPOT_invoc_20 = s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JLabel o_testSwitchInnerEnum_rv213__32 = __DSPOT_invoc_20.label();
        Assert.assertNull(o_testSwitchInnerEnum_rv213__32);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg81_mg25501_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_16 = "L9rC)A6fdF&0xT!&b-W-";
            String __DSPOT_sMessage_15 = "/&h4]]s%=])JWOM_4gds";
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            JEnumConstant o_testSwitchInnerEnum_mg81__14 = jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            JErrorClass o_testSwitchInnerEnum_mg81__32 = cm.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
            o_testSwitchInnerEnum_mg81__32.fullName();
            org.junit.Assert.fail("testSwitchInnerEnum_mg81_mg25501 should have thrown JErrorClassUsedException");
        } catch (JErrorClassUsedException expected) {
        }
    }
}

