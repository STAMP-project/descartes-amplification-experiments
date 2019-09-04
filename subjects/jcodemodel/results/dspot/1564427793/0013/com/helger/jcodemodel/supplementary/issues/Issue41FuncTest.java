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
    public void testSwitchInnerEnum_mg167() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg167__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg167__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg167__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg167__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JDefinedClass o_testSwitchInnerEnum_mg167__30 = m.owningClass();
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isAbstract());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isHidden());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).hasHeaderComment());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isInterface());
        Assert.assertTrue(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPackage())).isUnnamed());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isPackage());
        Assert.assertTrue(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getOuter())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getOuter())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getOuter())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getOuter())).getPackage())).isUnnamed());
        Assert.assertTrue(((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getOuter())).isPackage());
        Assert.assertFalse(((IJClassContainer) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getOuter())).isClass());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isAnonymous());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDefinedClass(issue41.Issue41Test)", ((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).toString());
        Assert.assertTrue(((Collection) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isParameterized());
        Assert.assertNull(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getPrimitiveType());
        Assert.assertFalse(((Collection) (((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isArray());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isPrimitive());
        Assert.assertFalse(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isError());
        Assert.assertTrue(((JDefinedClass) (o_testSwitchInnerEnum_mg167__30)).isReference());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg167__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg167__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg167__12)).hasArgs());
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
    public void testSwitchInnerEnum_mg154() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg154__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Collection<JAnnotationUse> o_testSwitchInnerEnum_mg154__30 = m.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_mg154__30.isEmpty());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg154__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg149() throws Exception {
        Object __DSPOT_o_42 = new Object();
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg149__14 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg149__14)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg149__14)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg149__14)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg149__32 = cb.equals(__DSPOT_o_42);
        Assert.assertFalse(o_testSwitchInnerEnum_mg149__32);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg149__14)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg149__14)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg149__14)).hasArgs());
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
    public void testSwitchInnerEnum_mg136() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg136__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Collection<JAnnotationUse> o_testSwitchInnerEnum_mg136__30 = ca.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_mg136__30.isEmpty());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg136__12)).hasArgs());
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
    public void testSwitchInnerEnum_mg163() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg163__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JMods o_testSwitchInnerEnum_mg163__30 = m.mods();
        Assert.assertEquals(0, ((int) (((JMods) (o_testSwitchInnerEnum_mg163__30)).getValue())));
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isStatic());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isDefault());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isAbstract());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isNative());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isSynchronized());
        Assert.assertFalse(((JMods) (o_testSwitchInnerEnum_mg163__30)).isStrictFP());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg163__12)).hasArgs());
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
    public void testSwitchInnerEnum_mg87() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg87__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).hasArgs());
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
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).getTypeParameters())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isParameterized());
        Assert.assertNull(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testSwitchInnerEnum_mg87__30)).isReference());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg87__12)).hasArgs());
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
    public void testSwitchInnerEnum_mg91() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg91__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        Collection<JAnnotationUse> o_testSwitchInnerEnum_mg91__30 = c2.annotations();
        Assert.assertTrue(o_testSwitchInnerEnum_mg91__30.isEmpty());
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg91__12)).hasArgs());
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
    public void testSwitchInnerEnum_mg95() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_mg95__12 = jEnumClass.enumConstant("C");
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg95__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg95__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg95__12)).hasArgs());
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enumParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        boolean o_testSwitchInnerEnum_mg95__30 = c2.containsErrorTypes();
        Assert.assertFalse(o_testSwitchInnerEnum_mg95__30);
        Assert.assertEquals(270489942, ((int) (((JEnumConstant) (o_testSwitchInnerEnum_mg95__12)).hashCode())));
        Assert.assertEquals("issue41.Issue41Test.MyEnum.C", ((JEnumConstant) (o_testSwitchInnerEnum_mg95__12)).getName());
        Assert.assertFalse(((JEnumConstant) (o_testSwitchInnerEnum_mg95__12)).hasArgs());
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg113null38481_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            JEnumConstant o_testSwitchInnerEnum_mg113__12 = jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, "dummy");
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(null).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            jEnumClass._implements();
            org.junit.Assert.fail("testSwitchInnerEnum_mg113null38481 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg143_mg27049() throws Exception {
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
        Map<String, JFieldVar> o_testSwitchInnerEnum_mg143_mg27049__35 = c2.fields();
        Assert.assertTrue(o_testSwitchInnerEnum_mg143_mg27049__35.isEmpty());
        Assert.assertEquals("A", o_testSwitchInnerEnum_mg143__30);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_literalMutationString64_rv40523() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
        final JDefinedClass jEnumClass = c2._enum("MyEnum");
        final JEnumConstant ca = jEnumClass.enumConstant("A");
        final JEnumConstant cb = jEnumClass.enumConstant("B");
        JEnumConstant o_testSwitchInnerEnum_literalMutationString64__12 = jEnumClass.enumConstant("C");
        final JMethod m = c2.method(0, cm.VOID, "dummy");
        final JVar p = m.param(jEnumClass, "enmParam");
        final JSwitch s = m.body()._switch(p);
        s._case(ca).body()._break();
        JBreak __DSPOT_invoc_34 = s._case(cb).body()._break();
        s._default().body()._break();
        CodeModelTestsHelper.parseCodeModel(cm);
        JLabel o_testSwitchInnerEnum_literalMutationString64_rv40523__34 = __DSPOT_invoc_34.label();
        Assert.assertNull(o_testSwitchInnerEnum_literalMutationString64_rv40523__34);
    }

    @Test(timeout = 10000)
    public void testSwitchInnerEnum_mg91null25916_failAssert0() throws Exception {
        try {
            final JCodeModel cm = new JCodeModel();
            final JDefinedClass c2 = cm._package("issue41")._class("Issue41Test");
            final JDefinedClass jEnumClass = c2._enum("MyEnum");
            final JEnumConstant ca = jEnumClass.enumConstant("A");
            final JEnumConstant cb = jEnumClass.enumConstant("B");
            JEnumConstant o_testSwitchInnerEnum_mg91__12 = jEnumClass.enumConstant("C");
            final JMethod m = c2.method(0, cm.VOID, null);
            final JVar p = m.param(jEnumClass, "enumParam");
            final JSwitch s = m.body()._switch(p);
            s._case(ca).body()._break();
            s._case(cb).body()._break();
            s._default().body()._break();
            CodeModelTestsHelper.parseCodeModel(cm);
            Collection<JAnnotationUse> o_testSwitchInnerEnum_mg91__30 = c2.annotations();
            org.junit.Assert.fail("testSwitchInnerEnum_mg91null25916 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals("The value of \'Name\' may not be null!", expected.getMessage());
        }
    }
}

