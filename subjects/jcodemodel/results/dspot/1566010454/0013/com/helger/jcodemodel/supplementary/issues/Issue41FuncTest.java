package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.IJFormatter;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JArrayClass;
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
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JPrimitiveType;
import com.helger.jcodemodel.JSwitch;
import com.helger.jcodemodel.JTypeVar;
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
    public void testSwitchInnerEnum_mg166() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg166__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).getName());
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
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg166__12)).getName());
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
    public void testSwitchInnerEnum_mg137() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg137__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg137__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg137__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg137__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        List<IJExpression> o_testSwitchInnerEnum_mg137__30 = ca.args();
        Assert.assertTrue(o_testSwitchInnerEnum_mg137__30.isEmpty());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg137__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg137__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg137__12)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg124() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg124__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Map<String, JFieldVar> o_testSwitchInnerEnum_mg124__30 = jEnumClass.fields();
        Assert.assertTrue(o_testSwitchInnerEnum_mg124__30.isEmpty());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg124__12)).getName());
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
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JDocComment o_testSwitchInnerEnum_mg151__30 = cb.javadoc();
        Assert.assertTrue(o_testSwitchInnerEnum_mg151__30.isEmpty());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg151__12)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg163() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg163__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JMods o_testSwitchInnerEnum_mg163__30 = m.mods();
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isStrictFP());
        Assert.assertEquals(0, ((int) (((JMods) (o_testSwitchInnerEnum_mg163__30)).getValue())));
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isAbstract());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isDefault());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isStatic());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isNative());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isSynchronized());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).getName());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_literalMutationString66_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            org.junit.Assert.fail("testSwitchInnerEnum_literalMutationString66 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The expression must be true but it is not: Illegal variable name \'\'", expected.getMessage());
        }
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
    public void testSwitchInnerEnum_rv219() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_rv219__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        JBreak __DSPOT_invoc_26 = s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JLabel o_testSwitchInnerEnum_rv219__32 = __DSPOT_invoc_26.label();
        Assert.assertNull(o_testSwitchInnerEnum_rv219__32);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_rv219__12)).getName());
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
    public void testSwitchInnerEnum_mg78() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg78__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        int o_testSwitchInnerEnum_mg78__30 = cm.countArtifacts();
        Assert.assertEquals(2, ((int) (o_testSwitchInnerEnum_mg78__30)));
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg78__12)).getName());
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
    public void testSwitchInnerEnum_add7() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_add7__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).getName());
        JMethod o_testSwitchInnerEnum_add7__13 = c2.method(0, cm.VOID, "dummy");
        Assert.assertTrue(((JMethod) (o_testSwitchInnerEnum_add7__13)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add7__13)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add7__13)).isConstructor());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_add7__12)).getName());
        Assert.assertTrue(((JMethod) (o_testSwitchInnerEnum_add7__13)).getThrows().isEmpty());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add7__13)).hasVarArgs());
        Assert.assertFalse(((JMethod) (o_testSwitchInnerEnum_add7__13)).isConstructor());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg90() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg90__12 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg90__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg90__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg90__12)).getName());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JPackage o_testSwitchInnerEnum_mg90__30 = c2._package();
        Assert.assertTrue(((Collection) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testSwitchInnerEnum_mg90__30)).isClass());
        Assert.assertFalse(((JPackage) (o_testSwitchInnerEnum_mg90__30)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testSwitchInnerEnum_mg90__30)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testSwitchInnerEnum_mg90__30)).isPackage());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg90__12)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg90__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg90__12)).getName());
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
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_rv211__32)).isClass());
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
    public void testSwitchInnerEnum_mg80() throws Exception {
        String __DSPOT_sMessage_14 = "r6EO;&FZRy/=u eShD9P";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg80__13 = jEnumClass.enumConstant("C");
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).getName());
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
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isParameterized());
        Assert.assertNull(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).getAllInnerClasses())).isEmpty());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testSwitchInnerEnum_mg80__31)).isPrimitive());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).hasArgs());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg80__13)).getName());
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
    public void testSwitchInnerEnum_mg90_mg2943() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg90__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JPackage o_testSwitchInnerEnum_mg90__30 = c2._package();
        boolean o_testSwitchInnerEnum_mg90_mg2943__35 = jEnumClass.containsErrorTypes();
        Assert.assertFalse(o_testSwitchInnerEnum_mg90_mg2943__35);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_literalMutationString46_mg36539() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("W");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_literalMutationString46__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJType o_testSwitchInnerEnum_literalMutationString46_mg36539__32 = m.type();
        Assert.assertTrue(((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString46_mg36539__32)).isPrimitive());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString46_mg36539__32)).isReference());
        Assert.assertEquals("com.helger.jcodemodel.JPrimitiveType(void)", ((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString46_mg36539__32)).toString());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString46_mg36539__32)).isArray());
        Assert.assertFalse(((JPrimitiveType) (o_testSwitchInnerEnum_literalMutationString46_mg36539__32)).isError());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg143_mg25111() throws Exception {
        Object __DSPOT_o_6635 = new Object();
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg143__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        String o_testSwitchInnerEnum_mg143__30 = ca.name();
        Assert.assertEquals("A", o_testSwitchInnerEnum_mg143__30);
        boolean o_testSwitchInnerEnum_mg143_mg25111__37 = p.equals(__DSPOT_o_6635);
        Assert.assertFalse(o_testSwitchInnerEnum_mg143_mg25111__37);
        Assert.assertEquals("A", o_testSwitchInnerEnum_mg143__30);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg147_mg9278() throws Exception {
        String __DSPOT_sName_2365 = "gX6R<aXI|-_$Z_Il])&`";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg147__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        List<IJExpression> o_testSwitchInnerEnum_mg147__30 = cb.argsMutable();
        boolean o_testSwitchInnerEnum_mg147_mg9278__36 = jEnumClass.containsField(__DSPOT_sName_2365);
        Assert.assertFalse(o_testSwitchInnerEnum_mg147_mg9278__36);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_add7_mg31616_mg59300() throws Exception {
        String __DSPOT_sName_8392 = "KKG.TpYJ>}6REv+xkO_y";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_add7__12 = jEnumClass.enumConstant("C");
        JMethod o_testSwitchInnerEnum_add7__13 = c2.method(0, cm.VOID, "dummy");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JTypeVar o_testSwitchInnerEnum_add7_mg31616__36 = c2.generify(__DSPOT_sName_8392);
        boolean o_testSwitchInnerEnum_add7_mg31616_mg59300__39 = cm.buildsErrorTypeRefs();
        Assert.assertFalse(o_testSwitchInnerEnum_add7_mg31616_mg59300__39);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_add8_mg8764_mg71379() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_add8__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        JVar o_testSwitchInnerEnum_add8__15 = m.param(jEnumClass, "enumParam");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJClass o_testSwitchInnerEnum_add8_mg8764__35 = cm.wildcard();
        JArrayClass o_testSwitchInnerEnum_add8_mg8764_mg71379__38 = o_testSwitchInnerEnum_add8_mg8764__35.array();
        Assert.assertFalse(((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).isInterface());
        Assert.assertTrue(((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).isArray());
        Assert.assertFalse(((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).isAbstract());
        Assert.assertFalse(((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).isParameterized());
        Assert.assertNull(((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JArrayClass(? extends java.lang.Object[])", ((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).toString());
        Assert.assertTrue(((Collection) (((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).isReference());
        Assert.assertFalse(((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).isPrimitive());
        Assert.assertFalse(((JArrayClass) (o_testSwitchInnerEnum_add8_mg8764_mg71379__38)).isError());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg144_mg10616_mg49695() throws Exception {
        AbstractJClass[] __DSPOT_aClazz_13138 = new AbstractJClass[0];
        String __DSPOT_sName_2721 = "A!-e,i1gE@,=l#<HPQ;k";
        String __DSPOT_sMessage_2720 = "q}n#c_|_@QM]eeOOozog";
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg144__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        AbstractJClass o_testSwitchInnerEnum_mg144__30 = ca.type();
        JErrorClass o_testSwitchInnerEnum_mg144_mg10616__37 = cm.errorClass(__DSPOT_sMessage_2720, __DSPOT_sName_2721);
        AbstractJClass o_testSwitchInnerEnum_mg144_mg10616_mg49695__41 = o_testSwitchInnerEnum_mg144__30.narrow(__DSPOT_aClazz_13138);
        Assert.assertFalse(((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).isInterface());
        Assert.assertFalse(((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).isArray());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).isAbstract());
        Assert.assertFalse(((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).isError());
        Assert.assertTrue(((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).isParameterized());
        Assert.assertNull(((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).getAllInnerClasses())).isEmpty());
        Assert.assertEquals("com.helger.jcodemodel.JNarrowedClass(issue41.Issue41Test.MyEnum<>)", ((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).toString());
        Assert.assertTrue(((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).isReference());
        Assert.assertFalse(((JNarrowedClass) (o_testSwitchInnerEnum_mg144_mg10616_mg49695__41)).isPrimitive());
    }
}

