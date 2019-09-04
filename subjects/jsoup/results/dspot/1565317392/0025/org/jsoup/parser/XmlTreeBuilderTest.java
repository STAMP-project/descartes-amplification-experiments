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
    public void testPopToClose_mg23() throws Exception {
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Document o_testPopToClose_mg23__9 = doc.normalise();
        Assert.assertFalse(((Document) (o_testPopToClose_mg23__9)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_testPopToClose_mg23__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testPopToClose_mg23__9)).hasText());
        Assert.assertFalse(((Document) (o_testPopToClose_mg23__9)).hasParent());
        Assert.assertEquals("<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>Three\n </val>\n</doc>\n<html>\n <head></head>\n <body></body>\n</html>", ((Document) (o_testPopToClose_mg23__9)).toString());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg27() throws Exception {
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Parser o_testPopToClose_mg27__9 = doc.parser();
        Assert.assertTrue(((Collection) (((Parser) (o_testPopToClose_mg27__9)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (o_testPopToClose_mg27__9)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg893() throws Exception {
        String __DSPOT_regex_236 = "^Tc.QTdw$*mg?5HyBm>H";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_mg893__14 = o_testPopToClose_mg19__10.getElementsMatchingOwnText(__DSPOT_regex_236);
        Assert.assertTrue(o_testPopToClose_mg19_mg893__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg874() throws Exception {
        String __DSPOT_valueSuffix_217 = "&Lr&Ai?X[& 8gq5Uc]J ";
        String __DSPOT_key_216 = "?{yo3o#YMTVY|Pp&%v[;";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_mg874__15 = o_testPopToClose_mg19__10.getElementsByAttributeValueEnding(__DSPOT_key_216, __DSPOT_valueSuffix_217);
        Assert.assertTrue(o_testPopToClose_mg19_mg874__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg23_mg1276() throws Exception {
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Document o_testPopToClose_mg23__9 = doc.normalise();
        Element o_testPopToClose_mg23_mg1276__12 = doc.head();
        Assert.assertFalse(((Element) (o_testPopToClose_mg23_mg1276__12)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPopToClose_mg23_mg1276__12)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPopToClose_mg23_mg1276__12)).isBlock());
        Assert.assertTrue(((Element) (o_testPopToClose_mg23_mg1276__12)).hasParent());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg831_mg13220() throws Exception {
        String __DSPOT_match_5312 = "S!-Ss>X97.Jz$DU1,m<+";
        String __DSPOT_key_5311 = "AYazG}exABL DWEKY]oS";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Document o_testPopToClose_mg19_mg831__13 = doc.normalise();
        Elements o_testPopToClose_mg19_mg831_mg13220__18 = o_testPopToClose_mg19__10.getElementsByAttributeValueContaining(__DSPOT_key_5311, __DSPOT_match_5312);
        Assert.assertTrue(o_testPopToClose_mg19_mg831_mg13220__18.isEmpty());
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

