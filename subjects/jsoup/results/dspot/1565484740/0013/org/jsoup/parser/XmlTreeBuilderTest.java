package org.jsoup.parser;


import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
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
    public void testCommentAndDocType_mg19_mg485() throws Exception {
        String __DSPOT_searchText_131 = "]Jt}g`wki77.&<MPZtI4";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testCommentAndDocType_mg19_mg485__13 = o_testCommentAndDocType_mg19__9.getElementsContainingOwnText(__DSPOT_searchText_131);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg485__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg537() throws Exception {
        String __DSPOT_tagName_169 = "TC}l]qvelpPW`h79`wVY";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        Element o_testCommentAndDocType_mg19_mg537__13 = o_testCommentAndDocType_mg19__9.prependElement(__DSPOT_tagName_169);
        Assert.assertFalse(((Collection) (((Element) (o_testCommentAndDocType_mg19_mg537__13)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_testCommentAndDocType_mg19_mg537__13)).hasText());
        Assert.assertFalse(((Element) (o_testCommentAndDocType_mg19_mg537__13)).isBlock());
        Assert.assertTrue(((Element) (o_testCommentAndDocType_mg19_mg537__13)).hasParent());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg580_mg18673() throws Exception {
        String __DSPOT_valuePrefix_7889 = "FEo:rbeP23)F<7o}]*5_";
        String __DSPOT_key_7888 = "S4 W!3kF?*amuY893k0]";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        List<TextNode> o_testCommentAndDocType_mg19_mg580__12 = o_testCommentAndDocType_mg19__9.textNodes();
        Elements o_testCommentAndDocType_mg19_mg580_mg18673__17 = o_testCommentAndDocType_mg19__9.getElementsByAttributeValueStarting(__DSPOT_key_7888, __DSPOT_valuePrefix_7889);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg580_mg18673__17.isEmpty());
    }

    @Test(timeout = 10000)
    public void testCommentAndDocType_mg19_mg419_mg15649() throws Exception {
        String __DSPOT_keyPrefix_6617 = "A?]F[W;g9FspveRzG U-";
        String __DSPOT_tagName_0 = "Yc TM1`_8;0L`A=SO/wo";
        String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testCommentAndDocType_mg19__9 = doc.createElement(__DSPOT_tagName_0);
        List<DataNode> o_testCommentAndDocType_mg19_mg419__12 = o_testCommentAndDocType_mg19__9.dataNodes();
        Elements o_testCommentAndDocType_mg19_mg419_mg15649__16 = o_testCommentAndDocType_mg19__9.getElementsByAttributeStarting(__DSPOT_keyPrefix_6617);
        Assert.assertTrue(o_testCommentAndDocType_mg19_mg419_mg15649__16.isEmpty());
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

