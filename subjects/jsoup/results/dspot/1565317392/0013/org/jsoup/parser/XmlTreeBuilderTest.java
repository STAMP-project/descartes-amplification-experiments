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
    public void testCommentAndDocType_mg19_mg412() throws Exception {
        String __DSPOT_value_71 = "Un((j*-vj<@X]YP!2!1t";
        String __DSPOT_key_70 = "BT#3Y8uSO_U./J9r^9e<";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testCommentAndDocType_mg19_mg412__14 = o_testCommentAndDocType_mg19__9.getElementsByAttributeValueNot(__DSPOT_key_70, __DSPOT_value_71);
        Assert.assertFalse(o_testCommentAndDocType_mg19_mg412__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg478() throws Exception {
        String __DSPOT_tagName_115 = "=,gxwDv>@=(rae5We)X{";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Element o_testCommentAndDocType_mg19_mg478__13 = o_testCommentAndDocType_mg19__9.prependElement(__DSPOT_tagName_115);
        Assert.assertFalse(((Element) (o_testCommentAndDocType_mg19_mg478__13)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testCommentAndDocType_mg19_mg478__13)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_testCommentAndDocType_mg19_mg478__13)).isBlock());
        Assert.assertTrue(((Element) (o_testCommentAndDocType_mg19_mg478__13)).hasParent());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg484_mg2063_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_454 = "WGLR`6=x(Yr#r2jY$5$(";
            String __DSPOT_text_117 = "^!%Y]_E]i.}JC]TrhX0]";
            String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
            String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
            Element o_testCommentAndDocType_mg19_mg484__13 = o_testCommentAndDocType_mg19__9.prependText(__DSPOT_text_117);
            o_testCommentAndDocType_mg19__9.getElementsMatchingText(__DSPOT_regex_454);
            org.junit.Assert.fail("testCommentAndDocType_mg19_mg484_mg2063 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: WGLR`6=x(Yr#r2jY$5$(", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg478_mg2123() throws Exception {
        String __DSPOT_regex_492 = "^ETTSXDZQ<pTD<p_MjnE";
        String __DSPOT_key_491 = "UG+r6^7J][{h RC`ESL#";
        String __DSPOT_tagName_115 = "=,gxwDv>@=(rae5We)X{";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Element o_testCommentAndDocType_mg19_mg478__13 = o_testCommentAndDocType_mg19__9.prependElement(__DSPOT_tagName_115);
        Elements o_testCommentAndDocType_mg19_mg478_mg2123__18 = o_testCommentAndDocType_mg19__9.getElementsByAttributeValueMatching(__DSPOT_key_491, __DSPOT_regex_492);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg478_mg2123__18.isEmpty());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg360_mg5930() throws Exception {
        String __DSPOT_valuePrefix_2177 = "D%>z<Ug?#j>d0N)_5wJ_";
        String __DSPOT_key_2176 = ";m#<[B=/qH?ExW/8(45w";
        String __DSPOT_className_38 = "vMRz<]d[Uel1Jp:Aa]P!";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Element o_testCommentAndDocType_mg19_mg360__13 = o_testCommentAndDocType_mg19__9.addClass(__DSPOT_className_38);
        Elements o_testCommentAndDocType_mg19_mg360_mg5930__18 = o_testCommentAndDocType_mg19_mg360__13.getElementsByAttributeValueStarting(__DSPOT_key_2176, __DSPOT_valuePrefix_2177);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg360_mg5930__18.isEmpty());
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

