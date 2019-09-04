package org.jsoup.parser;


import java.io.IOException;
import java.util.Collection;
import java.util.Map;
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
    public void testSimpleXmlParse_add1_mg2105_mg21096() throws Exception {
        String __DSPOT_regex_7093 = "]@tiI/c*u}@`JM&Dun9B";
        String __DSPOT_tagName_343 = "G%$s5Za_=(n+lTbV|h.|";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document o_testSimpleXmlParse_add1__4 = tb.parse(xml, "http://foo.com/");
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_add1_mg2105__14 = doc.createElement(__DSPOT_tagName_343);
        Elements o_testSimpleXmlParse_add1_mg2105_mg21096__18 = o_testSimpleXmlParse_add1_mg2105__14.getElementsMatchingText(__DSPOT_regex_7093);
        Assert.assertTrue(o_testSimpleXmlParse_add1_mg2105_mg21096__18.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1418_mg17659() throws Exception {
        String __DSPOT_valueSuffix_6076 = "jim!tb3GrJD_cQKq}70(";
        String __DSPOT_key_6075 = "UW|wanH*aPg@:*Mjq#|k";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        Map<String, String> o_testSimpleXmlParse_add5_mg1418__13 = o_testSimpleXmlParse_add5__8.dataset();
        Elements o_testSimpleXmlParse_add5_mg1418_mg17659__18 = o_testSimpleXmlParse_add5__8.getElementsByAttributeValueEnding(__DSPOT_key_6075, __DSPOT_valueSuffix_6076);
        Assert.assertTrue(o_testSimpleXmlParse_add5_mg1418_mg17659__18.isEmpty());
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

