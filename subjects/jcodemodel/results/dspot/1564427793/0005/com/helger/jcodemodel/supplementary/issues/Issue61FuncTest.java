package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.fmt.JTextFile;
import com.helger.jcodemodel.writer.JCMWriter;
import com.helger.jcodemodel.writer.SingleStreamCodeWriter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public class Issue61FuncTest {
    @Test(timeout = 10000)
    public void testIssue_mg46() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_mg46__22 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_mg46__22);
        int o_testIssue_mg46__23 = cm.countArtifacts();
        Assert.assertEquals(2, ((int) (o_testIssue_mg46__23)));
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg46__22);
    }

    @Test(timeout = 10000)
    public void testIssue_mg45() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_mg45__22 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_mg45__22);
        boolean o_testIssue_mg45__23 = cm.buildsErrorTypeRefs();
        Assert.assertFalse(o_testIssue_mg45__23);
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg45__22);
    }

    @Test(timeout = 10000)
    public void testIssue_mg52() throws Exception {
        String __DSPOT_sFullyQualifiedClassName_18 = ")A6fdF&0xT!&b-W-(y_V";
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_mg52__23 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_mg52__23);
        AbstractJClass o_testIssue_mg52__24 = cm.ref(__DSPOT_sFullyQualifiedClassName_18);
        Assert.assertEquals(2092717834, ((int) (((JDirectClass) (o_testIssue_mg52__24)).hashCode())));
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isAbstract());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isPackage());
        Assert.assertNull(((JDirectClass) (o_testIssue_mg52__24)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testIssue_mg52__24)).isClass());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass()A6fdF&0xT!&b-W-(y_V)", ((JDirectClass) (o_testIssue_mg52__24)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_mg52__24)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JDirectClass) (o_testIssue_mg52__24)).getPrimitiveType());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_mg52__24)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isError());
        Assert.assertTrue(((JDirectClass) (o_testIssue_mg52__24)).isReference());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg52__23);
    }

    @Test(timeout = 10000)
    public void testIssue_mg55() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_mg55__22 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_mg55__22);
        AbstractJClass o_testIssue_mg55__23 = cm.wildcard();
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isInterface());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isAbstract());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isError());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testIssue_mg55__23)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg55__23)).getTypeParameters())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testIssue_mg55__23)).getPrimitiveType());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg55__23)).getAllInnerClasses())).isEmpty());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testIssue_mg55__23)).isReference());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg55__22);
    }

    @Test(timeout = 10000)
    public void testIssue_mg40() throws Exception {
        String __DSPOT_sName_4 = "rb0/|]6^FT)-ef&bk*20";
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_mg40__23 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_mg40__23);
        JPackage o_testIssue_mg40__24 = cm._package(__DSPOT_sName_4);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).isUnnamed());
        Assert.assertTrue(((JPackage) (o_testIssue_mg40__24)).isPackage());
        Assert.assertTrue(((Collection) (((JPackage) (o_testIssue_mg40__24)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testIssue_mg40__24)).isClass());
        Assert.assertFalse(((JPackage) (o_testIssue_mg40__24)).isUnnamed());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg40__23);
    }

    @Test(timeout = 10000)
    public void testIssue_add3_mg4502() throws Exception {
        String __DSPOT_sSubPackageName_1343 = "!KZa]sC&l w{R,6]GeA_";
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        JPackage o_testIssue_add3__7 = cm.rootPackage();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_add3__23 = txtRes.contains("Testing");
        JPackage o_testIssue_add3_mg4502__29 = o_testIssue_add3__7.subPackage(__DSPOT_sSubPackageName_1343);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3_mg4502__29)).getPackage())).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3_mg4502__29)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3_mg4502__29)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3_mg4502__29)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_add3_mg4502__29)).getPackage())).isPackage());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_add3_mg4502__29)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testIssue_add3_mg4502__29)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_add3_mg4502__29)).getPackage())).isClass());
        Assert.assertTrue(((JPackage) (o_testIssue_add3_mg4502__29)).isPackage());
        Assert.assertFalse(((JPackage) (o_testIssue_add3_mg4502__29)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testIssue_add3_mg4502__29)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (o_testIssue_add3_mg4502__29)).isClass());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
    }

    @Test(timeout = 10000)
    public void testIssue_mg48_mg791_failAssert0() throws Exception {
        try {
            String __DSPOT_sMessage_14 = "_*s>).BmtV)2[gaNZ#S&";
            final JCodeModel cm = new JCodeModel();
            final Charset ascii = Charset.forName("US-ASCII");
            final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
            final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
            res.setContents("Testing");
            new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
            final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
            boolean o_testIssue_mg48__23 = txtRes.contains("Testing");
            JErrorClass o_testIssue_mg48__24 = cm.errorClass(__DSPOT_sMessage_14);
            o_testIssue_mg48__24._extends();
            org.junit.Assert.fail("testIssue_mg48_mg791 should have thrown JErrorClassUsedException");
        } catch (JErrorClassUsedException expected) {
            Assert.assertEquals("_*s>).BmtV)2[gaNZ#S&", expected.getMessage());
        }
    }
}

