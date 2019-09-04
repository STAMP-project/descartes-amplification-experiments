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
    public void testCommentAndDocType_mg23_mg1211() throws Exception {
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Document o_testCommentAndDocType_mg23__8 = doc.normalise();
        Element o_testCommentAndDocType_mg23_mg1211__11 = o_testCommentAndDocType_mg23__8.body();
        Assert.assertTrue(((Element) (o_testCommentAndDocType_mg23_mg1211__11)).isBlock());
        Assert.assertTrue(((Element) (o_testCommentAndDocType_mg23_mg1211__11)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testCommentAndDocType_mg23_mg1211__11)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testCommentAndDocType_mg23_mg1211__11)).hasParent());
        Assert.assertEquals("<body>\n One  Two \n</body>", ((Element) (o_testCommentAndDocType_mg23_mg1211__11)).toString());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg455() throws Exception {
        String __DSPOT_valueSuffix_83 = "4hm|(J/H,Hzr;m#.W9*#";
        String __DSPOT_key_82 = "Zks#P][B@BafG1>V9s7n";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testCommentAndDocType_mg19_mg455__14 = o_testCommentAndDocType_mg19__9.getElementsByAttributeValueEnding(__DSPOT_key_82, __DSPOT_valueSuffix_83);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg455__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg549_mg13772() throws Exception {
        String __DSPOT_searchText_5829 = "3$wK-fX56@ Li3(,|N#<";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Element o_testCommentAndDocType_mg19_mg549__12 = o_testCommentAndDocType_mg19__9.previousElementSibling();
        Elements o_testCommentAndDocType_mg19_mg549_mg13772__16 = o_testCommentAndDocType_mg19__9.getElementsContainingText(__DSPOT_searchText_5829);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg549_mg13772__16.isEmpty());
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

