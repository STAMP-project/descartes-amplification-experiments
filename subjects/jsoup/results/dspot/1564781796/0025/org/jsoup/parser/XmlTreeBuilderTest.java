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
    public void testPopToClose_mg23_mg1290() throws Exception {
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Document o_testPopToClose_mg23__9 = doc.normalise();
        Element o_testPopToClose_mg23_mg1290__12 = o_testPopToClose_mg23__9.body();
        Assert.assertFalse(((Collection) (((Element) (o_testPopToClose_mg23_mg1290__12)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPopToClose_mg23_mg1290__12)).isBlock());
        Assert.assertFalse(((Element) (o_testPopToClose_mg23_mg1290__12)).hasText());
        Assert.assertTrue(((Element) (o_testPopToClose_mg23_mg1290__12)).hasParent());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg875() throws Exception {
        String __DSPOT_value_224 = "9`d38%J6lBV@1{ @{#Lk";
        String __DSPOT_key_223 = "o%>hnfvH[6v_$Ru5WDgX";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_mg875__15 = o_testPopToClose_mg19__10.getElementsByAttributeValueNot(__DSPOT_key_223, __DSPOT_value_224);
        Assert.assertFalse(o_testPopToClose_mg19_mg875__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg741_mg18310_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_7606 = "DbiZqS0]KH{Gn[F<5=BH";
            String __DSPOT_key_7605 = "eZ,%[bwtWQ|76eON^lIP";
            String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
            String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
            Element o_testPopToClose_mg19_mg741__13 = doc.body();
            o_testPopToClose_mg19__10.getElementsByAttributeValueMatching(__DSPOT_key_7605, __DSPOT_regex_7606);
            org.junit.Assert.fail("testPopToClose_mg19_mg741_mg18310 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: DbiZqS0]KH{Gn[F<5=BH", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_literalMutationString694_mg16349() throws Exception {
        String __DSPOT_searchText_6991 = "$ZxJuK[WFA{!X`]K,QfC";
        String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
        String xml = "v}SV5HR!Y({UBa;x4GTC}l]qvelpPW`h79`wVYde!kAe";
        Assert.assertEquals("v}SV5HR!Y({UBa;x4GTC}l]qvelpPW`h79`wVYde!kAe", xml);
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        String o_testPopToClose_mg19_literalMutationString694__8 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("v}SV5HR!Y({UBa;x4GTC}l]qvelpPW`h79`wVYde!kAe", o_testPopToClose_mg19_literalMutationString694__8);
        Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testPopToClose_mg19_literalMutationString694_mg16349__16 = o_testPopToClose_mg19__10.getElementsContainingText(__DSPOT_searchText_6991);
        Assert.assertTrue(o_testPopToClose_mg19_literalMutationString694_mg16349__16.isEmpty());
        Assert.assertEquals("v}SV5HR!Y({UBa;x4GTC}l]qvelpPW`h79`wVYde!kAe", xml);
        Assert.assertEquals("v}SV5HR!Y({UBa;x4GTC}l]qvelpPW`h79`wVYde!kAe", o_testPopToClose_mg19_literalMutationString694__8);
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg19_mg908_mg14819_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_6293 = "H}zr}V${ ?,FyNe7a1| ";
            String __DSPOT_tagName_0 = "&zgYc TM1`_8;0L`A=SO";
            String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Element o_testPopToClose_mg19__10 = doc.createElement(__DSPOT_tagName_0);
            Element o_testPopToClose_mg19_mg908__13 = o_testPopToClose_mg19__10.parent();
            o_testPopToClose_mg19__10.getElementsMatchingOwnText(__DSPOT_regex_6293);
            org.junit.Assert.fail("testPopToClose_mg19_mg908_mg14819 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: H}zr}V${ ?,FyNe7a1| ", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPopToClose_mg23_mg1290_mg2538_failAssert0() throws Exception {
        try {
            int __DSPOT_index_626 = -1021439757;
            String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
            XmlTreeBuilder tb = new XmlTreeBuilder();
            Document doc = tb.parse(xml, "http://foo.com/");
            TextUtil.stripNewlines(doc.html());
            Document o_testPopToClose_mg23__9 = doc.normalise();
            Element o_testPopToClose_mg23_mg1290__12 = o_testPopToClose_mg23__9.body();
            o_testPopToClose_mg23_mg1290__12.child(__DSPOT_index_626);
            org.junit.Assert.fail("testPopToClose_mg23_mg1290_mg2538 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1021439757", expected.getMessage());
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

