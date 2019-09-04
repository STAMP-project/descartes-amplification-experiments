package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.fmt.AbstractJResourceFile;
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
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_mg52__24)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDirectClass) (o_testIssue_mg52__24)).getPrimitiveType());
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
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg55__23)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testIssue_mg55__23)).getPrimitiveType());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isPrimitive());
        Assert.assertTrue(((JTypeWildcard) (o_testIssue_mg55__23)).isReference());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg55__22);
    }

    @Test(timeout = 10000)
    public void testIssue_add2() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        AbstractJResourceFile o_testIssue_add2__7 = cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii));
        Assert.assertTrue(((JTextFile) (o_testIssue_add2__7)).isResource());
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\n-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_add2__25 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_add2__25);
        Assert.assertTrue(((JTextFile) (o_testIssue_add2__7)).isResource());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\n-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
    }

    @Test(timeout = 10000)
    public void testIssue_add3() throws Exception {
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        JPackage o_testIssue_add3__7 = cm.rootPackage();
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testIssue_add3__7)).isPackage());
        Assert.assertTrue(((JPackage) (o_testIssue_add3__7)).isUnnamed());
        Assert.assertFalse(((JPackage) (o_testIssue_add3__7)).isClass());
        Assert.assertTrue(((Collection) (((JPackage) (o_testIssue_add3__7)).getAllResourceFiles())).isEmpty());
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_add3__23 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_add3__23);
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).isUnnamed());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).isClass());
        Assert.assertFalse(((Collection) (((JPackage) (((JPackage) (o_testIssue_add3__7)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (o_testIssue_add3__7)).isPackage());
        Assert.assertTrue(((JPackage) (o_testIssue_add3__7)).isUnnamed());
        Assert.assertFalse(((JPackage) (o_testIssue_add3__7)).isClass());
        Assert.assertFalse(((Collection) (((JPackage) (o_testIssue_add3__7)).getAllResourceFiles())).isEmpty());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
    }

    @Test(timeout = 10000)
    public void testIssue_mg49_mg3900_failAssert0() throws Exception {
        try {
            String __DSPOT_sName_16 = ";&FZRy/=u eShD9P/&h4";
            String __DSPOT_sMessage_15 = "Gu4*{9Gi}cRQHCH3r6EO";
            final JCodeModel cm = new JCodeModel();
            final Charset ascii = Charset.forName("US-ASCII");
            final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
            final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
            res.setContents("Testing");
            new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
            final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
            boolean o_testIssue_mg49__24 = txtRes.contains("Testing");
            JErrorClass o_testIssue_mg49__25 = cm.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
            o_testIssue_mg49__25._extends();
            org.junit.Assert.fail("testIssue_mg49_mg3900 should have thrown JErrorClassUsedException");
        } catch (JErrorClassUsedException expected) {
            Assert.assertEquals("Gu4*{9Gi}cRQHCH3r6EO", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIssue_mg40_mg4014() throws Exception {
        String __DSPOT_sName_1166 = ":bKr`831Q#URhh[PzMND";
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
        JPackage o_testIssue_mg40__24 = cm._package(__DSPOT_sName_4);
        boolean o_testIssue_mg40_mg4014__30 = o_testIssue_mg40__24.hasResourceFile(__DSPOT_sName_1166);
        Assert.assertFalse(o_testIssue_mg40_mg4014__30);
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
    }

    @Test(timeout = 10000)
    public void testIssue_mg40_mg4038_failAssert0() throws Exception {
        try {
            String __DSPOT_sClassLocalName_1168 = "p&o]fCRDQo{no3!szEqr";
            String __DSPOT_sName_4 = "rb0/|]6^FT)-ef&bk*20";
            final JCodeModel cm = new JCodeModel();
            final Charset ascii = Charset.forName("US-ASCII");
            final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
            final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
            res.setContents("Testing");
            new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
            final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
            boolean o_testIssue_mg40__23 = txtRes.contains("Testing");
            JPackage o_testIssue_mg40__24 = cm._package(__DSPOT_sName_4);
            o_testIssue_mg40__24.ref(__DSPOT_sClassLocalName_1168);
            org.junit.Assert.fail("testIssue_mg40_mg4038 should have thrown ClassNotFoundException");
        } catch (ClassNotFoundException expected) {
        }
    }
}

