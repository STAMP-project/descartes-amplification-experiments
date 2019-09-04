package com.helger.jcodemodel.supplementary.issues;


import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
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
    public void testIssue_mg48() throws Exception {
        String __DSPOT_sMessage_14 = "_*s>).BmtV)2[gaNZ#S&";
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_mg48__23 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_mg48__23);
        JErrorClass o_testIssue_mg48__24 = cm.errorClass(__DSPOT_sMessage_14);
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg48__24)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg48__24)).isAbstract());
        Assert.assertEquals("_*s>).BmtV)2[gaNZ#S&", ((JErrorClass) (o_testIssue_mg48__24)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg48__24)).isError());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg48__24)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg48__24)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JErrorClass) (o_testIssue_mg48__24)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg48__24)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg48__24)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg48__24)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg48__24)).isPrimitive());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg48__23);
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
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isAnonymous());
        Assert.assertTrue(((JDirectClass) (o_testIssue_mg52__24)).isClass());
        Assert.assertNull(((JDirectClass) (o_testIssue_mg52__24)).getOuter());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isAnnotationTypeDeclaration());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isInterface());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isPackage());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isParameterized());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_mg52__24)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JDirectClass) (o_testIssue_mg52__24)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JDirectClass()A6fdF&0xT!&b-W-(y_V)", ((JDirectClass) (o_testIssue_mg52__24)).toString());
        Assert.assertTrue(((Collection) (((JDirectClass) (o_testIssue_mg52__24)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JDirectClass) (o_testIssue_mg52__24)).isReference());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isArray());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isPrimitive());
        Assert.assertFalse(((JDirectClass) (o_testIssue_mg52__24)).isError());
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
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isParameterized());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg55__23)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JTypeWildcard) (o_testIssue_mg55__23)).getPrimitiveType());
        Assert.assertEquals("com.helger.jcodemodel.JTypeWildcard(? extends java.lang.Object)", ((JTypeWildcard) (o_testIssue_mg55__23)).toString());
        Assert.assertTrue(((Collection) (((JTypeWildcard) (o_testIssue_mg55__23)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JTypeWildcard) (o_testIssue_mg55__23)).isReference());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isArray());
        Assert.assertFalse(((JTypeWildcard) (o_testIssue_mg55__23)).isPrimitive());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg55__22);
    }

    @Test(timeout = 10000)
    public void testIssue_mg54() throws Exception {
        String __DSPOT_sNewLine_19 = "1a;?h(*fl<xJgehgad?H";
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_mg54__23 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_mg54__23);
        JCodeModel o_testIssue_mg54__24 = cm.setBuildingNewLine(__DSPOT_sNewLine_19);
        Assert.assertNull(((JCodeModel) (o_testIssue_mg54__24)).getBuildingCharset());
        Assert.assertEquals("1a;?h(*fl<xJgehgad?H", ((JCodeModel) (o_testIssue_mg54__24)).getBuildingNewLine());
        Assert.assertTrue(((Collection) (((JCodeModel) (o_testIssue_mg54__24)).getAllDontImportClasses())).isEmpty());
        Assert.assertFalse(((Collection) (((JCodeModel) (o_testIssue_mg54__24)).getAllPackages())).isEmpty());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg54__23);
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
        Assert.assertFalse(((JPackage) (o_testIssue_mg40__24)).isClass());
        Assert.assertFalse(((JPackage) (o_testIssue_mg40__24)).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (o_testIssue_mg40__24)).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getPackage())).isClass());
        Assert.assertFalse(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getPackage())).isUnnamed());
        Assert.assertTrue(((Collection) (((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getPackage())).getAllResourceFiles())).isEmpty());
        Assert.assertTrue(((JPackage) (((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (((JPackage) (o_testIssue_mg40__24)).getPackage())).isPackage());
        Assert.assertTrue(((JPackage) (o_testIssue_mg40__24)).isPackage());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg40__23);
    }

    @Test(timeout = 10000)
    public void testIssue_mg49() throws Exception {
        String __DSPOT_sName_16 = ";&FZRy/=u eShD9P/&h4";
        String __DSPOT_sMessage_15 = "Gu4*{9Gi}cRQHCH3r6EO";
        final JCodeModel cm = new JCodeModel();
        final Charset ascii = Charset.forName("US-ASCII");
        final ByteArrayOutputStream resOut = new ByteArrayOutputStream();
        final JTextFile res = ((JTextFile) (cm.rootPackage().addResourceFile(new JTextFile("example.txt", ascii))));
        res.setContents("Testing");
        new JCMWriter(cm).build(new SingleStreamCodeWriter(new ByteArrayOutputStream()), new SingleStreamCodeWriter(resOut));
        final String txtRes = ascii.decode(ByteBuffer.wrap(resOut.toByteArray())).toString();
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        boolean o_testIssue_mg49__24 = txtRes.contains("Testing");
        Assert.assertTrue(o_testIssue_mg49__24);
        JErrorClass o_testIssue_mg49__25 = cm.errorClass(__DSPOT_sMessage_15, __DSPOT_sName_16);
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg49__25)).isInterface());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg49__25)).isAbstract());
        Assert.assertEquals("Gu4*{9Gi}cRQHCH3r6EO", ((JErrorClass) (o_testIssue_mg49__25)).getMessage());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg49__25)).isError());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg49__25)).isParameterized());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg49__25)).getAllInnerClasses())).isEmpty());
        Assert.assertNull(((JErrorClass) (o_testIssue_mg49__25)).getPrimitiveType());
        Assert.assertTrue(((Collection) (((JErrorClass) (o_testIssue_mg49__25)).getTypeParameters())).isEmpty());
        Assert.assertTrue(((JErrorClass) (o_testIssue_mg49__25)).isReference());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg49__25)).isArray());
        Assert.assertFalse(((JErrorClass) (o_testIssue_mg49__25)).isPrimitive());
        Assert.assertEquals("-----------------------------------example.txt-----------------------------------\nTesting", txtRes);
        Assert.assertTrue(o_testIssue_mg49__24);
    }
}

