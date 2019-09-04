package org.jsoup.parser;


import java.io.IOException;
import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class XmlTreeBuilderTest {
    @Test(timeout = 10000)
    public void testPopToClose_mg23() throws Exception {
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Document o_testPopToClose_mg23__9 = doc.normalise();
        Assert.assertFalse(((Document) (o_testPopToClose_mg23__9)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_testPopToClose_mg23__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testPopToClose_mg23__9)).hasText());
        Assert.assertFalse(((Document) (o_testPopToClose_mg23__9)).hasParent());
        Assert.assertEquals("<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>Three\n </val>\n</doc>\n<html>\n <head></head>\n <body></body>\n</html>", ((Document) (o_testPopToClose_mg23__9)).toString());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg27() throws Exception {
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Parser o_testPopToClose_mg27__9 = doc.parser();
        Assert.assertTrue(((Collection) (((Parser) (o_testPopToClose_mg27__9)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (o_testPopToClose_mg27__9)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg926() throws Exception {
        int __DSPOT_index_234 = -1226790227;
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_mg926__14 = o_testPopToClose_mg19__10.getElementsByIndexEquals(__DSPOT_index_234);
        Assert.assertTrue(o_testPopToClose_mg19_mg926__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg930() throws Exception {
        String __DSPOT_searchText_238 = "jBF>&A*|z 7k#nQ$=[0p";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_mg930__14 = o_testPopToClose_mg19__10.getElementsContainingOwnText(__DSPOT_searchText_238);
        Assert.assertTrue(o_testPopToClose_mg19_mg930__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg864() throws Exception {
        Element __DSPOT_parent_194 = new Element("/w_7F5V-t}U%YT7=5zOk");
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Element o_testPopToClose_mg19_mg864__15 = o_testPopToClose_mg19__10.appendTo(__DSPOT_parent_194);
        Assert.assertFalse(((Element) (o_testPopToClose_mg19_mg864__15)).isBlock());
        Assert.assertFalse(((Element) (o_testPopToClose_mg19_mg864__15)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPopToClose_mg19_mg864__15)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPopToClose_mg19_mg864__15)).hasParent());
    }

    @Test(timeout = 10000)
    public void testPopToClose_literalMutationString9_mg314() throws Exception {
        String xml = "GdhscbCS@!x*zH_,y(q2 5[gpbL[{$QV5:Wz2[|+mr6#";
        Assert.assertEquals("GdhscbCS@!x*zH_,y(q2 5[gpbL[{$QV5:Wz2[|+mr6#", xml);
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        String o_testPopToClose_literalMutationString9__7 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("GdhscbCS@!x*zH_,y(q2 5[gpbL[{$QV5:Wz2[|+mr6#", o_testPopToClose_literalMutationString9__7);
        Document o_testPopToClose_literalMutationString9_mg314__11 = doc.normalise();
        Assert.assertFalse(((Document) (o_testPopToClose_literalMutationString9_mg314__11)).isBlock());
        Assert.assertTrue(((Document) (o_testPopToClose_literalMutationString9_mg314__11)).hasText());
        Assert.assertFalse(((Collection) (((Document) (o_testPopToClose_literalMutationString9_mg314__11)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (o_testPopToClose_literalMutationString9_mg314__11)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  GdhscbCS@!x*zH_,y(q2 5[gpbL[{$QV5:Wz2[|+mr6# \n </body>\n</html>", ((Document) (o_testPopToClose_literalMutationString9_mg314__11)).toString());
        Assert.assertEquals("GdhscbCS@!x*zH_,y(q2 5[gpbL[{$QV5:Wz2[|+mr6#", xml);
        Assert.assertEquals("GdhscbCS@!x*zH_,y(q2 5[gpbL[{$QV5:Wz2[|+mr6#", o_testPopToClose_literalMutationString9__7);
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg32_mg1115_mg12552() throws Exception {
        String __DSPOT_keyPrefix_5133 = "y.P2F9ftv05|nORt<l+a";
        String __DSPOT_tagName_275 = "&^U6Y]Kg1e/q[NKD[/hF";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        boolean o_testPopToClose_mg32__9 = doc.updateMetaCharsetElement();
        Element o_testPopToClose_mg32_mg1115__13 = doc.createElement(__DSPOT_tagName_275);
        Elements o_testPopToClose_mg32_mg1115_mg12552__17 = o_testPopToClose_mg32_mg1115__13.getElementsByAttributeStarting(__DSPOT_keyPrefix_5133);
        Assert.assertTrue(o_testPopToClose_mg32_mg1115_mg12552__17.isEmpty());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg864_mg13322_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_5523 = "(@4A]ts7bQ$0RCD(gs/Z";
            String __DSPOT_key_5522 = "h7y)j/]*$3K5`lo$tLVj";
            Element __DSPOT_parent_194 = new Element("/w_7F5V-t}U%YT7=5zOk");
            String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
            String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
            Element o_testPopToClose_mg19_mg864__15 = o_testPopToClose_mg19__10.appendTo(__DSPOT_parent_194);
            o_testPopToClose_mg19_mg864__15.getElementsByAttributeValueMatching(__DSPOT_key_5522, __DSPOT_regex_5523);
            org.junit.Assert.fail("testPopToClose_mg19_mg864_mg13322 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg23_mg1245_mg14897_failAssert0() throws Exception {
        try {
            int __DSPOT_index_6227 = -2023548916;
            String __DSPOT_tagName_329 = "(sN&;Qy]-J(&+WU``^#(";
            String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Document o_testPopToClose_mg23__9 = doc.normalise();
            Element o_testPopToClose_mg23_mg1245__13 = doc.createElement(__DSPOT_tagName_329);
            o_testPopToClose_mg23_mg1245__13.child(__DSPOT_index_6227);
            org.junit.Assert.fail("testPopToClose_mg23_mg1245_mg14897 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2023548916", expected.getMessage());
        }
    }

    @Ignore
    @Test
    public void testSupplyParserToConnection() throws IOException {
        String xmlUrl = "http://direct.infohound.net/tools/jsoup-xml-test.xml";
        Document xmlDoc = Jsoup.connect(xmlUrl).parser(Parser.xmlParser()).get();
        Document htmlDoc = Jsoup.connect(xmlUrl).parser(Parser.htmlParser()).get();
        Document autoXmlDoc = Jsoup.connect(xmlUrl).get();
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", TextUtil.stripNewlines(xmlDoc.html()));
        Assert.assertFalse(htmlDoc.equals(xmlDoc));
        Assert.assertEquals(xmlDoc, autoXmlDoc);
        Assert.assertEquals(1, htmlDoc.select("head").size());
        Assert.assertEquals(0, xmlDoc.select("head").size());
        Assert.assertEquals(0, autoXmlDoc.select("head").size());
    }
}

