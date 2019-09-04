package org.jsoup.parser;


import java.io.IOException;
import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
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
        Assert.assertEquals("<doc>\n <val>\n  One\n  <val>\n   Two\n  </val>Three\n </val>\n</doc>\n<html>\n <head></head>\n <body></body>\n</html>", ((Document) (o_testPopToClose_mg23__9)).toString());
        Assert.assertFalse(((Document) (o_testPopToClose_mg23__9)).hasParent());
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
    public void testPopToClose_mg19_mg1052() throws Exception {
        Element __DSPOT_parent_234 = new Element("Y9#Fc@aj6MF5:6[z{Ik(");
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Element o_testPopToClose_mg19_mg1052__15 = o_testPopToClose_mg19__10.appendTo(__DSPOT_parent_234);
        Assert.assertFalse(((Element) (o_testPopToClose_mg19_mg1052__15)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPopToClose_mg19_mg1052__15)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_testPopToClose_mg19_mg1052__15)).isBlock());
        Assert.assertTrue(((Element) (o_testPopToClose_mg19_mg1052__15)).hasParent());
    }

    @Test(timeout = 10000)
    public void testPopToClose_add1_literalMutationString1264() throws Exception {
        String xml = "8m{vtctU`+]ls({S&n-6[>6Jncm%^0X<!OI0}2Z*:D}l";
        Assert.assertEquals("8m{vtctU`+]ls({S&n-6[>6Jncm%^0X<!OI0}2Z*:D}l", xml);
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document o_testPopToClose_add1__5 = tb.parse(xml, "http://foo.com/");
        Document doc = tb.parse(xml, "http://foo.com/");
        String o_testPopToClose_add1_literalMutationString1264__10 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("8m{vtctU`+]ls({S&amp;n-6[&gt;6Jncm%^0X<!--OI0}2Z*:D}l-->", o_testPopToClose_add1_literalMutationString1264__10);
        Assert.assertEquals("8m{vtctU`+]ls({S&n-6[>6Jncm%^0X<!OI0}2Z*:D}l", xml);
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

