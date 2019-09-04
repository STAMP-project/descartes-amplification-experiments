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
    public void testCommentAndDocType_mg27() throws Exception {
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Parser o_testCommentAndDocType_mg27__8 = doc.parser();
        Assert.assertTrue(((Collection) (((Parser) (o_testCommentAndDocType_mg27__8)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (o_testCommentAndDocType_mg27__8)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg23() throws Exception {
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Document o_testCommentAndDocType_mg23__8 = doc.normalise();
        Assert.assertFalse(((Document) (o_testCommentAndDocType_mg23__8)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_testCommentAndDocType_mg23__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testCommentAndDocType_mg23__8)).hasText());
        Assert.assertFalse(((Document) (o_testCommentAndDocType_mg23__8)).hasParent());
        Assert.assertEquals("<!DOCTYPE HTML>\n<!-- a comment -->\n<qux />\n<html>\n <head></head>\n <body>\n  One  Two \n </body>\n</html>", ((Document) (o_testCommentAndDocType_mg23__8)).toString());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg502() throws Exception {
        String __DSPOT_match_112 = "]=|URllB^!%Y]_E]i.}J";
        String __DSPOT_key_111 = "e5We)X{?5;Z[ft0f^6j9";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testCommentAndDocType_mg19_mg502__14 = o_testCommentAndDocType_mg19__9.getElementsByAttributeValueContaining(__DSPOT_key_111, __DSPOT_match_112);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg502__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg503() throws Exception {
        String __DSPOT_valueSuffix_114 = "b 2PqgP;4/v.v)|C5[:S";
        String __DSPOT_key_113 = "C]TrhX0]_^tFCqr,tX[g";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testCommentAndDocType_mg19_mg503__14 = o_testCommentAndDocType_mg19__9.getElementsByAttributeValueEnding(__DSPOT_key_113, __DSPOT_valueSuffix_114);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg503__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg532_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_148 = "h}`e!,3/H!B>(rYhJjsv";
            String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
            String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
            o_testCommentAndDocType_mg19__9.getElementsMatchingText(__DSPOT_regex_148);
            org.junit.Assert.fail("testCommentAndDocType_mg19_mg532 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg502_mg8410() throws Exception {
        String __DSPOT_value_3357 = "cddZjM^$[fN);Oe]7=]w";
        String __DSPOT_key_3356 = "*<GJ![ySpS4ms3&2B._B";
        String __DSPOT_match_112 = "]=|URllB^!%Y]_E]i.}J";
        String __DSPOT_key_111 = "e5We)X{?5;Z[ft0f^6j9";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testCommentAndDocType_mg19_mg502__14 = o_testCommentAndDocType_mg19__9.getElementsByAttributeValueContaining(__DSPOT_key_111, __DSPOT_match_112);
        Elements o_testCommentAndDocType_mg19_mg502_mg8410__19 = o_testCommentAndDocType_mg19__9.getElementsByAttributeValueNot(__DSPOT_key_3356, __DSPOT_value_3357);
        Assert.assertFalse(o_testCommentAndDocType_mg19_mg502_mg8410__19.isEmpty());
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

