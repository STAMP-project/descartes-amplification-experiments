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
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isStatic());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isDefault());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isAbstract());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isNative());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isSynchronized());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg178__30)).isStrictFP());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg178__12)).hasArgs());
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
    public void testSwitchInnerEnum_mg115() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg115__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg115__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg115__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg115__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Collection<JAnnotationUse> o_testSwitchInnerEnum_mg115__30 = jEnumClass.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_mg115__30.isEmpty());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg115__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg115__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg115__12)).hasArgs());
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
    public void testSwitchInnerEnum_mg157() throws Exception {
        AbstractJType[] __DSPOT_argTypes_45 = new AbstractJType[]{  };
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg157__13 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg157__31 = m.hasSignature(__DSPOT_argTypes_45);
        Assert.assertFalse(o_testSwitchInnerEnum_mg157__31);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg157__13)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg146() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg146__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg146__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg146__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg146__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        List<IJExpression> o_testSwitchInnerEnum_mg146__30 = cb.args();
        Assert.assertTrue(o_testSwitchInnerEnum_mg146__30.isEmpty());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg146__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg146__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg146__12)).hasArgs());
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
    public void testSwitchInnerEnum_rv219() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_rv219__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        JBreak __DSPOT_invoc_26 = s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JLabel o_testSwitchInnerEnum_rv219__32 = __DSPOT_invoc_26.label();
        Assert.assertNull(o_testSwitchInnerEnum_rv219__32);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).hasArgs());
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
    public void testSwitchInnerEnum_mg117_failAssert0() throws Exception {
        try {
            int __DSPOT_nMods_29 = 1221341321;
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
            jEnumClass.constructor(__DSPOT_nMods_29);
            org.junit.Assert.fail("testSwitchInnerEnum_mg117 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
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
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isHidden());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPackage())).isUnnamed());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isPackage());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isAnnotationTypeDeclaration());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).getPackage())).isUnnamed());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).isPackage());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getOuter())).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(issue41.Issue41Test.MyEnum)", ((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getPrimitiveType());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isParameterized());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isError());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isReference());
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
    public void testSwitchInnerEnum_rv202() throws Exception {
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
        List<IJExpression> o_testSwitchInnerEnum_rv202__32 = __DSPOT_invoc_12.argsMutable();
        Assert.assertTrue(o_testSwitchInnerEnum_rv202__32.isEmpty());
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
    public void testSwitchInnerEnum_add4_add42232() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        JEnumConstant o_testSwitchInnerEnum_add4__8 = jEnumClass.enumConstant("A");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_add4__13 = jEnumClass.enumConstant("C");
        JMethod o_testSwitchInnerEnum_add4_add42232__18 = c2.method(0, cm.VOID, "dummy");
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add4_add42232__18)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testSwitchInnerEnum_add4_add42232__18)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add4_add42232__18)).hasVarArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add4_add42232__18)).isConstructor());
        Assert.assertTrue(((JMethod) (o_testSwitchInnerEnum_add4_add42232__18)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add4_add42232__18)).hasVarArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg185_mg29553() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg185__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        IJExpression o_testSwitchInnerEnum_mg185__30 = s.test();
        Collection<JAnnotationUse> o_testSwitchInnerEnum_mg185_mg29553__35 = m.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_mg185_mg29553__35.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg158_mg15192() throws Exception {
        JVar __DSPOT_o_3945 = null;
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg158__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JDocComment o_testSwitchInnerEnum_mg158__30 = m.javadoc();
        boolean o_testSwitchInnerEnum_mg158_mg15192__36 = p.equals(__DSPOT_o_3945);
        Assert.assertFalse(o_testSwitchInnerEnum_mg158_mg15192__36);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_literalMutationString45_mg3280() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("xx");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_literalMutationString45__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJType o_testSwitchInnerEnum_literalMutationString45_mg3280__32 = m.type();
        Assert.assertTrue(((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString45_mg3280__32)).isPrimitive());
        Assert.assertEquals("com.helger.jcodemodel.JPrimitiveType(void)", ((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString45_mg3280__32)).toString());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString45_mg3280__32)).isArray());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString45_mg3280__32)).isError());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString45_mg3280__32)).isReference());
    }
}

