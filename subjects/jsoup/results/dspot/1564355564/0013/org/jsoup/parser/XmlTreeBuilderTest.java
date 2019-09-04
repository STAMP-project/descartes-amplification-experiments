package org.jsoup.parser;


import java.io.IOException;
import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
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
        Assert.assertEquals("<!DOCTYPE HTML>\n<!-- a comment -->\n<qux />\n<html>\n <head></head>\n <body>\n  One  Two \n </body>\n</html>", ((Document) (o_testCommentAndDocType_mg23__8)).toString());
        Assert.assertFalse(((Document) (o_testCommentAndDocType_mg23__8)).hasParent());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg29_failAssert0_literalMutationString173_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_text_2 = "!OKS@Rl&{ha!&Bcvg[?i";
                String xml = "<!DOCTYPE HTML><!s-- a comment -->One <qux />Two";
                XmlTreeBuilder tb = new XmlTreeBuilder();
                Document doc = tb.parse(xml, "http://foo.com/");
                TextUtil.stripNewlines(doc.html());
                doc.text(__DSPOT_text_2);
                org.junit.Assert.fail("testCommentAndDocType_mg29 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testCommentAndDocType_mg29_failAssert0_literalMutationString173 should have thrown NullPointerException");
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

