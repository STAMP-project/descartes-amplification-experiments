package org.jsoup.parser;


import java.io.IOException;
import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
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
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>", ((Element) (o_testSimpleXmlParse_add5__8)).toString());
        Assert.assertTrue(((Element) (o_testSimpleXmlParse_add5__8)).hasParent());
        doc.getElementById("2").absUrl("href");
        Assert.assertFalse(((Element) (o_testSimpleXmlParse_add5__8)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testSimpleXmlParse_add5__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testSimpleXmlParse_add5__8)).hasText());
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>", ((Element) (o_testSimpleXmlParse_add5__8)).toString());
        Assert.assertTrue(((Element) (o_testSimpleXmlParse_add5__8)).hasParent());
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
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>\n<html>\n <head></head>\n <body></body>\n</html>", ((Document) (o_testSimpleXmlParse_mg34__10)).toString());
        Assert.assertFalse(((Document) (o_testSimpleXmlParse_mg34__10)).hasParent());
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

