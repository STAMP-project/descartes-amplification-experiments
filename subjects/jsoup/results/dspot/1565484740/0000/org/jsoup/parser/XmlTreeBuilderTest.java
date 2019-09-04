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
    public void testSimpleXmlParse_mg30_mg1359_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_217 = "6-*};E9`u!Ce#(-%(=hn";
            String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
            String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            doc.getElementById("2").absUrl("href");
            Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
            o_testSimpleXmlParse_mg30__11.getElementsMatchingText(__DSPOT_regex_217);
            org.junit.Assert.fail("testSimpleXmlParse_mg30_mg1359 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 6-*};E9`u!Ce#(-%(=hn", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1374_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_232 = "}P_26Y5A7)_O)J$[[g4k";
            String __DSPOT_key_231 = "Z&91(l1ZK%SC!M49/u5[";
            String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
            doc.getElementById("2").absUrl("href");
            o_testSimpleXmlParse_add5__8.getElementsByAttributeValueMatching(__DSPOT_key_231, __DSPOT_regex_232);
            org.junit.Assert.fail("testSimpleXmlParse_add5_mg1374 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: }P_26Y5A7)_O)J$[[g4k", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_add1103_mg20106() throws Exception {
        String __DSPOT_match_6305 = "@^6(#5*qdI}5*7?ZC#31";
        String __DSPOT_key_6304 = "|8z}{McfA]>^t6G@1Bns";
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        String o_testSimpleXmlParse_mg30_add1103__7 = doc.html();
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>", o_testSimpleXmlParse_mg30_add1103__7);
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testSimpleXmlParse_mg30_add1103_mg20106__19 = o_testSimpleXmlParse_mg30__11.getElementsByAttributeValueContaining(__DSPOT_key_6304, __DSPOT_match_6305);
        Assert.assertTrue(o_testSimpleXmlParse_mg30_add1103_mg20106__19.isEmpty());
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>", o_testSimpleXmlParse_mg30_add1103__7);
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_mg1225_mg15579_failAssert0() throws Exception {
        try {
            int __DSPOT_index_4712 = -190057432;
            String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
            String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            doc.getElementById("2").absUrl("href");
            Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
            Document o_testSimpleXmlParse_mg30_mg1225__14 = doc.normalise();
            o_testSimpleXmlParse_mg30__11.child(__DSPOT_index_4712);
            org.junit.Assert.fail("testSimpleXmlParse_mg30_mg1225_mg15579 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-190057432", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1329_mg17007() throws Exception {
        String __DSPOT_regex_5124 = "7fo2/n<E1=PPTFFW79#^";
        String __DSPOT_key_5123 = "?[!GB|w1I8U+}ze@3eTD";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        String o_testSimpleXmlParse_add5_mg1329__13 = o_testSimpleXmlParse_add5__8.cssSelector();
        Assert.assertEquals("#2", o_testSimpleXmlParse_add5_mg1329__13);
        Elements o_testSimpleXmlParse_add5_mg1329_mg17007__18 = o_testSimpleXmlParse_add5__8.getElementsByAttributeValueMatching(__DSPOT_key_5123, __DSPOT_regex_5124);
        Assert.assertTrue(o_testSimpleXmlParse_add5_mg1329_mg17007__18.isEmpty());
        Assert.assertEquals("#2", o_testSimpleXmlParse_add5_mg1329__13);
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_add5_mg1351_mg10254() throws Exception {
        String __DSPOT_value_3015 = "lrIh:V#:*(a7b-.iJj3y";
        String __DSPOT_key_3014 = "KNX:wl,NZsVep.O2+|4k";
        String __DSPOT_key_214 = "R/,/%cT(Qx#R_2M%>[bF";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_add5__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        Elements o_testSimpleXmlParse_add5_mg1351__14 = o_testSimpleXmlParse_add5__8.getElementsByAttribute(__DSPOT_key_214);
        Elements o_testSimpleXmlParse_add5_mg1351_mg10254__19 = o_testSimpleXmlParse_add5__8.getElementsByAttributeValueNot(__DSPOT_key_3014, __DSPOT_value_3015);
        Assert.assertFalse(o_testSimpleXmlParse_add5_mg1351_mg10254__19.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_add1103_mg20112() throws Exception {
        int __DSPOT_index_6315 = 24882655;
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        String o_testSimpleXmlParse_mg30_add1103__7 = doc.html();
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>", o_testSimpleXmlParse_mg30_add1103__7);
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testSimpleXmlParse_mg30_add1103_mg20112__18 = o_testSimpleXmlParse_mg30__11.getElementsByIndexEquals(__DSPOT_index_6315);
        Assert.assertTrue(o_testSimpleXmlParse_mg30_add1103_mg20112__18.isEmpty());
        Assert.assertEquals("<doc id=\"2\" href=\"/bar\">\n Foo \n <br />\n <link>\n  One\n </link>\n <link>\n  Two\n </link>\n</doc>", o_testSimpleXmlParse_mg30_add1103__7);
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

