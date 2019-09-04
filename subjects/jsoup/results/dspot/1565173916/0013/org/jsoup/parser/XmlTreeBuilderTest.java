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
    public void testCommentAndDocType_mg23_mg1216() throws Exception {
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Document o_testCommentAndDocType_mg23__8 = doc.normalise();
        Element o_testCommentAndDocType_mg23_mg1216__11 = o_testCommentAndDocType_mg23__8.head();
        Assert.assertFalse(((Collection) (((Element) (o_testCommentAndDocType_mg23_mg1216__11)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testCommentAndDocType_mg23_mg1216__11)).isBlock());
        Assert.assertFalse(((Element) (o_testCommentAndDocType_mg23_mg1216__11)).hasText());
        Assert.assertTrue(((Element) (o_testCommentAndDocType_mg23_mg1216__11)).hasParent());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg545() throws Exception {
        int __DSPOT_index_131 = -1949939781;
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testCommentAndDocType_mg19_mg545__13 = o_testCommentAndDocType_mg19__9.getElementsByIndexEquals(__DSPOT_index_131);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg545__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg561_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_142 = "=C]SG#JnI[]y <3bSwN_";
            String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
            String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
            o_testCommentAndDocType_mg19__9.getElementsMatchingText(__DSPOT_regex_142);
            org.junit.Assert.fail("testCommentAndDocType_mg19_mg561 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: =C]SG#JnI[]y <3bSwN_", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg31_failAssert0_add237_failAssert0_literalMutationString4885_failAssert0() throws Exception {
        try {
            {
                {
                    String __DSPOT_title_3 = "!rb0/|]6^FT)-ef&bk*2";
                    String xml = "<!DOCTYPE HTML><!- a comment -->One <qux />Two";
                    XmlTreeBuilder tb = new XmlTreeBuilder();
                    Document doc = tb.parse(xml, "http://foo.com/");
                    doc.html();
                    TextUtil.stripNewlines(doc.html());
                    doc.title(__DSPOT_title_3);
                    org.junit.Assert.fail("testCommentAndDocType_mg31 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testCommentAndDocType_mg31_failAssert0_add237 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testCommentAndDocType_mg31_failAssert0_add237_failAssert0_literalMutationString4885 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
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

