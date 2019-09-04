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
    public void testSimpleXmlParse_add5_mg1417() throws Exception {
        String __DSPOT_valuePrefix_239 = "U&&o3V,[L^pmElQj&P{p";
        String __DSPOT_key_238 = "wfB xJ(KJ! U$ITqI`N>";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        Elements o_testSimpleXmlParse_add5_mg1417__15 = o_testSimpleXmlParse_add5__8.getElementsByAttributeValueStarting(__DSPOT_key_238, __DSPOT_valuePrefix_239);
        Assert.assertTrue(o_testSimpleXmlParse_add5_mg1417__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_mg1364_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_200 = "+X9hOt_}hJs^EBD:@:#i";
            String __DSPOT_key_199 = "5*<#D< *&blaH h/,{SF";
            String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
            String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            doc.getElementById("2").absUrl("href");
            Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
            o_testSimpleXmlParse_mg30__11.getElementsByAttributeValueMatching(__DSPOT_key_199, __DSPOT_regex_200);
            org.junit.Assert.fail("testSimpleXmlParse_mg30_mg1364 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: +X9hOt_}hJs^EBD:@:#i", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_literalMutationString22_mg669_mg10726() throws Exception {
        String __DSPOT_match_3012 = "^?Kw)G#$>LG+4nyC=7QN";
        String __DSPOT_key_3011 = "=AEX}fh#yY7%j!l.ww}%";
        String __DSPOT_tagName_93 = "8!dh+bBYGG!0gGi?=}tR";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        String o_testSimpleXmlParse_literalMutationString22__8 = doc.getElementById("2").absUrl("<span>Hello <div>there</div> <span>now</span></span>");
        Assert.assertEquals("", o_testSimpleXmlParse_literalMutationString22__8);
        Element o_testSimpleXmlParse_literalMutationString22_mg669__13 = doc.createElement(__DSPOT_tagName_93);
        Elements o_testSimpleXmlParse_literalMutationString22_mg669_mg10726__18 = o_testSimpleXmlParse_literalMutationString22_mg669__13.getElementsByAttributeValueContaining(__DSPOT_key_3011, __DSPOT_match_3012);
        Assert.assertTrue(o_testSimpleXmlParse_literalMutationString22_mg669_mg10726__18.isEmpty());
        Assert.assertEquals("", o_testSimpleXmlParse_literalMutationString22__8);
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_mg1346_mg12075() throws Exception {
        String __DSPOT_regex_3592 = "ztrFwXI5_iViw!Ry5=aU";
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        Map<String, String> o_testSimpleXmlParse_mg30_mg1346__14 = o_testSimpleXmlParse_mg30__11.dataset();
        Elements o_testSimpleXmlParse_mg30_mg1346_mg12075__18 = o_testSimpleXmlParse_mg30__11.getElementsMatchingOwnText(__DSPOT_regex_3592);
        Assert.assertTrue(o_testSimpleXmlParse_mg30_mg1346_mg12075__18.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_literalMutationString1182_mg16890() throws Exception {
        String __DSPOT_value_5341 = "iU9RFb!%c8u+p`i}l2NM";
        String __DSPOT_key_5340 = "0#>qE}1*O:+|I2T8T-:%";
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "`W ?/vHAUe,^ lE");
        TextUtil.stripNewlines(doc.html());
        String o_testSimpleXmlParse_mg30_literalMutationString1182__9 = doc.getElementById("2").absUrl("href");
        Assert.assertEquals("", o_testSimpleXmlParse_mg30_literalMutationString1182__9);
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testSimpleXmlParse_mg30_literalMutationString1182_mg16890__18 = o_testSimpleXmlParse_mg30__11.getElementsByAttributeValueNot(__DSPOT_key_5340, __DSPOT_value_5341);
        Assert.assertFalse(o_testSimpleXmlParse_mg30_literalMutationString1182_mg16890__18.isEmpty());
        Assert.assertEquals("", o_testSimpleXmlParse_mg30_literalMutationString1182__9);
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

