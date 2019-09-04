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
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JLabel;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JPrimitiveType;
import com.helger.jcodemodel.JSwitch;
import com.helger.jcodemodel.JTypeWildcard;
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
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum__12)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg134() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg134__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg134__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg134__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg134__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JMods o_testSwitchInnerEnum_mg134__30 = jEnumClass.mods();
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg134__30)).isStrictFP());
        Assert.assertEquals(1, ((int) (((JMods) (o_testSwitchInnerEnum_mg134__30)).getValue())));
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg134__30)).isAbstract());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg134__30)).isDefault());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg134__30)).isStatic());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg134__30)).isNative());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg134__30)).isSynchronized());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg134__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg134__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg134__12)).getName());
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
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg175__31 = p.equals(__DSPOT_o_50);
        Assert.assertFalse(o_testSwitchInnerEnum_mg175__31);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg175__13)).getName());
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
    public void testSwitchInnerEnum_mg154() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg154__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Collection<JAnnotationUse> o_testSwitchInnerEnum_mg154__30 = m.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_mg154__30.isEmpty());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg157() throws Exception {
        AbstractJType[] __DSPOT_argTypes_45 = new AbstractJType[]{  };
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg157__13 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg157__31 = m.hasSignature(__DSPOT_argTypes_45);
        Assert.assertFalse(o_testSwitchInnerEnum_mg157__31);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg136() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg136__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Collection<JAnnotationUse> o_testSwitchInnerEnum_mg136__30 = ca.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_mg136__30.isEmpty());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg170() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg170__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJType o_testSwitchInnerEnum_mg170__30 = m.type();
        Assert.assertTrue(((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).isPrimitive());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JPrimitiveType(void)", ((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).toString());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).isArray());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_mg170__30)).isError());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg170__12)).getName());
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
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg77__30 = cm.buildsErrorTypeRefs();
        Assert.assertFalse(o_testSwitchInnerEnum_mg77__30);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg77__12)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv209() throws Exception {
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
        JDocComment o_testSwitchInnerEnum_rv209__32 = __DSPOT_invoc_12.javadoc();
        Assert.assertTrue(o_testSwitchInnerEnum_rv209__32.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnumnull197_failAssert0() throws Exception {
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
            s._case(ca).body()._break();
            s._case(null).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testSwitchInnerEnumnull197 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg91() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg91__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Collection<JAnnotationUse> o_testSwitchInnerEnum_mg91__30 = c2.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_mg91__30.isEmpty());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).getName());
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
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JPackage o_testSwitchInnerEnum_mg72__31 = cm._package(__DSPOT_sName_4);
        Assert.assertTrue(((Collection) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testSwitchInnerEnum_mg72__31)).isClass());
        Assert.assertFalse(((JPackage) (o_testSwitchInnerEnum_mg72__31)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg72__31)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testSwitchInnerEnum_mg72__31)).isPackage());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg72__13)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg96() throws Exception {
        String __DSPOT_sName_21 = "Wo-9M/^zOCxu?!rIXp5p";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg96__13 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg96__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg96__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg96__13)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg96__31 = c2.containsField(__DSPOT_sName_21);
        Assert.assertFalse(o_testSwitchInnerEnum_mg96__31);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg96__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg96__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg96__13)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg100() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg100__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg100__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg100__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg100__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Map<String, JFieldVar> o_testSwitchInnerEnum_mg100__30 = c2.fields();
        Assert.assertTrue(o_testSwitchInnerEnum_mg100__30.isEmpty());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg100__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg100__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg100__12)).getName());
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
    public void testSwitchInnerEnum_literalMutationString65_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "s2l>UgIvC");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testSwitchInnerEnum_literalMutationString65 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'s2l>UgIvC\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg140() throws Exception {
        Object __DSPOT_o_39 = new Object();
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg140__14 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg140__14)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg140__14)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg140__14)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg140__32 = ca.equals(__DSPOT_o_39);
        Assert.assertFalse(o_testSwitchInnerEnum_mg140__32);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg140__14)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg140__14)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg140__14)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg87() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg87__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJClass o_testSwitchInnerEnum_mg87__30 = cm.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isError());
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isParameterized());
        Assert.assertNull(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isReference());
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isPrimitive());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).getName());
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
    public void testSwitchInnerEnum_rv217_failAssert0() throws Exception {
        try {
            IJFormatter __DSPOT_f_58 = null;
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
            JBreak __DSPOT_invoc_23 = s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            __DSPOT_invoc_23.state(__DSPOT_f_58);
            org.junit.Assert.fail("testSwitchInnerEnum_rv217 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv211() throws Exception {
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
        AbstractJClass o_testSwitchInnerEnum_rv211__32 = __DSPOT_invoc_12.type();
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isHidden());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).getPackage())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isInterface());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isParameterized());
        Assert.assertNull(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(issue41.Issue41Test.MyEnum)", ((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isReference());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isError());
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
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).getName());
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
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isParameterized());
        Assert.assertNull(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).getAllInnerClasses())).isEmpty());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg81__32)).isPrimitive());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg81__14)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv213() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_rv213__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        JBreak __DSPOT_invoc_20 = s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JLabel o_testSwitchInnerEnum_rv213__32 = __DSPOT_invoc_20.label();
        Assert.assertNull(o_testSwitchInnerEnum_rv213__32);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_rv213__12)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg168_failAssert0_literalMutationNumber34956_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_nIndex_47 = -573926003;
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
            }
            org.junit.Assert.fail("testSwitchInnerEnum_mg168_failAssert0_literalMutationNumber34956 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-573926003", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_rv210_mg1437() throws Exception {
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
        String o_testSwitchInnerEnum_rv210__32 = __DSPOT_invoc_12.name();
        Assert.assertEquals("C", o_testSwitchInnerEnum_rv210__32);
        JCodeModel o_testSwitchInnerEnum_rv210_mg1437__35 = m.owner();
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testSwitchInnerEnum_rv210_mg1437__35)).getAllPackages())).isEmpty());
        Assert.assertNull(((JCodeModel) (o_testSwitchInnerEnum_rv210_mg1437__35)).getBuildingCharset());
        Assert.assertEquals("\n", ((JCodeModel) (o_testSwitchInnerEnum_rv210_mg1437__35)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (o_testSwitchInnerEnum_rv210_mg1437__35)).getAllDontImportClasses())).isEmpty());
        Assert.assertEquals("C", o_testSwitchInnerEnum_rv210__32);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg82_add6796() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg82__12 = jEnumClass.enumConstant("C");
        JMethod o_testSwitchInnerEnum_mg82_add6796__15 = c2.method(0, cm.VOID, "dummy");
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_mg82_add6796__15)).hasVarArgs());
        Assert.assertTrue(((JMethod) (o_testSwitchInnerEnum_mg82_add6796__15)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_mg82_add6796__15)).isConstructor());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        cm.packages();
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_mg82_add6796__15)).hasVarArgs());
        Assert.assertTrue(((JMethod) (o_testSwitchInnerEnum_mg82_add6796__15)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_mg82_add6796__15)).isConstructor());
    }
}

