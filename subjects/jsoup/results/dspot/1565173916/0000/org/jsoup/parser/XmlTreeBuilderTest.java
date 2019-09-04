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
    public void testSimpleXmlParse_add5_mg1385() throws Exception {
        String __DSPOT_value_195 = "7v[dc=WO=QzF5*<#D< *";
        String __DSPOT_key_194 = "@{^){:[Z2p$uCZw%-9j5";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        Elements o_testSimpleXmlParse_add5_mg1385__15 = o_testSimpleXmlParse_add5__8.getElementsByAttributeValueNot(__DSPOT_key_194, __DSPOT_value_195);
        Assert.assertFalse(o_testSimpleXmlParse_add5_mg1385__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_mg2329() throws Exception {
        String __DSPOT_searchText_397 = "BcMkx7?ezalTwt&Wp6w:";
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testSimpleXmlParse_mg30_mg2329__15 = o_testSimpleXmlParse_mg30__11.getElementsContainingOwnText(__DSPOT_searchText_397);
        Assert.assertTrue(o_testSimpleXmlParse_mg30_mg2329__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1400() throws Exception {
        String __DSPOT_regex_205 = "P}M8a6@]?8h8whMovI#I";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        Elements o_testSimpleXmlParse_add5_mg1400__14 = o_testSimpleXmlParse_add5__8.getElementsMatchingOwnText(__DSPOT_regex_205);
        Assert.assertTrue(o_testSimpleXmlParse_add5_mg1400__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_literalMutationString17_mg462_mg18832() throws Exception {
        String __DSPOT_match_5691 = "!1(SCPTzd7&0c4d&H%y5";
        String __DSPOT_key_5690 = " B=vz{veH[D8ymG#TI/j";
        String __DSPOT_tagName_30 = "I)uhDiCMs-NCPSNsen+,";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "8;0L`A=SO/woO!O");
        TextUtil.stripNewlines(doc.html());
        String o_testSimpleXmlParse_literalMutationString17__8 = doc.getElementById("2").absUrl("href");
        Assert.assertEquals("", o_testSimpleXmlParse_literalMutationString17__8);
        Element o_testSimpleXmlParse_literalMutationString17_mg462__13 = doc.createElement(__DSPOT_tagName_30);
        Elements o_testSimpleXmlParse_literalMutationString17_mg462_mg18832__18 = o_testSimpleXmlParse_literalMutationString17_mg462__13.getElementsByAttributeValueContaining(__DSPOT_key_5690, __DSPOT_match_5691);
        Assert.assertTrue(o_testSimpleXmlParse_literalMutationString17_mg462_mg18832__18.isEmpty());
        Assert.assertEquals("", o_testSimpleXmlParse_literalMutationString17__8);
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

