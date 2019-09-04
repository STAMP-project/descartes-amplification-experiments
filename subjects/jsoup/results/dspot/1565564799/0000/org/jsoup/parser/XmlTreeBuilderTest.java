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
    public void testSimpleXmlParse_mg38() throws Exception {
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Parser o_testSimpleXmlParse_mg38__10 = doc.parser();
        Assert.assertTrue(((Collection) (((Parser) (o_testSimpleXmlParse_mg38__10)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (o_testSimpleXmlParse_mg38__10)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5() throws Exception {
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        Assert.assertFalse(((Element) (o_testSimpleXmlParse_add5__8)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testSimpleXmlParse_add5__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testSimpleXmlParse_add5__8)).hasText());
        Assert.assertTrue(((Element) (o_testSimpleXmlParse_add5__8)).hasParent());
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>", ((Element) (o_testSimpleXmlParse_add5__8)).toString());
        doc.getElementById("2").absUrl("href");
        Assert.assertFalse(((Element) (o_testSimpleXmlParse_add5__8)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testSimpleXmlParse_add5__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testSimpleXmlParse_add5__8)).hasText());
        Assert.assertTrue(((Element) (o_testSimpleXmlParse_add5__8)).hasParent());
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>", ((Element) (o_testSimpleXmlParse_add5__8)).toString());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg34() throws Exception {
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Document o_testSimpleXmlParse_mg34__10 = doc.normalise();
        Assert.assertFalse(((Document) (o_testSimpleXmlParse_mg34__10)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_testSimpleXmlParse_mg34__10)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testSimpleXmlParse_mg34__10)).hasText());
        Assert.assertFalse(((Document) (o_testSimpleXmlParse_mg34__10)).hasParent());
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>\n<html>\n <head></head>\n <body></body>\n</html>", ((Document) (o_testSimpleXmlParse_mg34__10)).toString());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1463() throws Exception {
        String __DSPOT_searchText_209 = "gGp%c!j#qn%6lgnN3s]K";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        Elements o_testSimpleXmlParse_add5_mg1463__14 = o_testSimpleXmlParse_add5__8.getElementsContainingText(__DSPOT_searchText_209);
        Assert.assertTrue(o_testSimpleXmlParse_add5_mg1463__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1465_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_211 = "ni>FBM6On9P-fDFn{4R}";
            String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
            doc.getElementById("2").absUrl("href");
            o_testSimpleXmlParse_add5__8.getElementsMatchingText(__DSPOT_regex_211);
            org.junit.Assert.fail("testSimpleXmlParse_add5_mg1465 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: ni>FBM6On9P-fDFn{4R}", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1436_mg20750() throws Exception {
        String __DSPOT_valueSuffix_6739 = "W|w0h@jJO1V[ZU#;U*^(";
        String __DSPOT_key_6738 = "?4m`nZoa%2mQ>(VQ>qz;";
        String __DSPOT_id_188 = "dc=WO=QzF5*<#D< *&bl";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_add5_mg1436__14 = o_testSimpleXmlParse_add5__8.getElementById(__DSPOT_id_188);
        Elements o_testSimpleXmlParse_add5_mg1436_mg20750__19 = o_testSimpleXmlParse_add5__8.getElementsByAttributeValueEnding(__DSPOT_key_6738, __DSPOT_valueSuffix_6739);
        Assert.assertTrue(o_testSimpleXmlParse_add5_mg1436_mg20750__19.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1514_mg9021() throws Exception {
        int __DSPOT_index_2523 = 1060227492;
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        String o_testSimpleXmlParse_add5_mg1514__13 = o_testSimpleXmlParse_add5__8.nodeName();
        Assert.assertEquals("doc", o_testSimpleXmlParse_add5_mg1514__13);
        Elements o_testSimpleXmlParse_add5_mg1514_mg9021__17 = o_testSimpleXmlParse_add5__8.getElementsByIndexEquals(__DSPOT_index_2523);
        Assert.assertTrue(o_testSimpleXmlParse_add5_mg1514_mg9021__17.isEmpty());
        Assert.assertEquals("doc", o_testSimpleXmlParse_add5_mg1514__13);
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_mg2209_mg3523_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_708 = ".^)2*#_d-fD5Vc?FXt(-";
            String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
            String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            doc.getElementById("2").absUrl("href");
            Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
            Element o_testSimpleXmlParse_mg30_mg2209__14 = o_testSimpleXmlParse_mg30__11.clone();
            o_testSimpleXmlParse_mg30_mg2209__14.getElementsMatchingOwnText(__DSPOT_regex_708);
            org.junit.Assert.fail("testSimpleXmlParse_mg30_mg2209_mg3523 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: .^)2*#_d-fD5Vc?FXt(-", expected.getMessage());
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

