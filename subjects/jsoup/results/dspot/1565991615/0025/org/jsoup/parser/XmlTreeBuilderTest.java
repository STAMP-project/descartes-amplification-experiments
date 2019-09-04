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
    public void testPopToClose_mg19_mg885_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_218 = "pE0]A]Ci2@sxS($<9$T4";
            String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
            String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
            o_testPopToClose_mg19__10.getElementsMatchingOwnText(__DSPOT_regex_218);
            org.junit.Assert.fail("testPopToClose_mg19_mg885 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: pE0]A]Ci2@sxS($<9$T4", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg883() throws Exception {
        String __DSPOT_searchText_216 = "jUSC<F7cF@g!PRj5O@w,";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_mg883__14 = o_testPopToClose_mg19__10.getElementsContainingOwnText(__DSPOT_searchText_216);
        Assert.assertTrue(o_testPopToClose_mg19_mg883__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg811() throws Exception {
        String __DSPOT_tagName_174 = "T.nK7w|,dxKcm5[*Td[$";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Element o_testPopToClose_mg19_mg811__14 = o_testPopToClose_mg19__10.appendElement(__DSPOT_tagName_174);
        Assert.assertFalse(((Element) (o_testPopToClose_mg19_mg811__14)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPopToClose_mg19_mg811__14)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_testPopToClose_mg19_mg811__14)).hasText());
        Assert.assertTrue(((Element) (o_testPopToClose_mg19_mg811__14)).hasParent());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg868() throws Exception {
        String __DSPOT_valuePrefix_206 = "S(B7t)i*u4NJIgv]|Y&W";
        String __DSPOT_key_205 = "Q%haL`9o.Tvur=+(`;+@";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_mg868__15 = o_testPopToClose_mg19__10.getElementsByAttributeValueStarting(__DSPOT_key_205, __DSPOT_valuePrefix_206);
        Assert.assertTrue(o_testPopToClose_mg19_mg868__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg868_mg19000() throws Exception {
        int __DSPOT_index_7782 = -63370580;
        String __DSPOT_valuePrefix_206 = "S(B7t)i*u4NJIgv]|Y&W";
        String __DSPOT_key_205 = "Q%haL`9o.Tvur=+(`;+@";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_mg868__15 = o_testPopToClose_mg19__10.getElementsByAttributeValueStarting(__DSPOT_key_205, __DSPOT_valuePrefix_206);
        Elements o_testPopToClose_mg19_mg868_mg19000__19 = o_testPopToClose_mg19__10.getElementsByIndexEquals(__DSPOT_index_7782);
        Assert.assertTrue(o_testPopToClose_mg19_mg868_mg19000__19.isEmpty());
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

