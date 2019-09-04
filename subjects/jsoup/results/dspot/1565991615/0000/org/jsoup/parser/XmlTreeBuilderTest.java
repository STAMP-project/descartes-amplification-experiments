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
    public void testSimpleXmlParse_mg30_mg1446() throws Exception {
        String __DSPOT_valuePrefix_217 = "T5#5gGp%c!j#qn%6lgnN";
        String __DSPOT_key_216 = "v|9>B^t$vWL?9&8ga`ZD";
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testSimpleXmlParse_mg30_mg1446__16 = o_testSimpleXmlParse_mg30__11.getElementsByAttributeValueStarting(__DSPOT_key_216, __DSPOT_valuePrefix_217);
        Assert.assertTrue(o_testSimpleXmlParse_mg30_mg1446__16.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_literalMutationString22_mg643_mg10928() throws Exception {
        String __DSPOT_keyPrefix_3069 = "].1P1AssHXr&y9r2EC9(";
        String __DSPOT_tagName_90 = "hX0]_^tFCqr,tX[gb 2P";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        String o_testSimpleXmlParse_literalMutationString22__8 = doc.getElementById("2").absUrl("<span>Hello <div>there</div> <span>now</span></span>");
        Assert.assertEquals("", o_testSimpleXmlParse_literalMutationString22__8);
        Element o_testSimpleXmlParse_literalMutationString22_mg643__13 = doc.createElement(__DSPOT_tagName_90);
        Elements o_testSimpleXmlParse_literalMutationString22_mg643_mg10928__17 = o_testSimpleXmlParse_literalMutationString22_mg643__13.getElementsByAttributeStarting(__DSPOT_keyPrefix_3069);
        Assert.assertTrue(o_testSimpleXmlParse_literalMutationString22_mg643_mg10928__17.isEmpty());
        Assert.assertEquals("", o_testSimpleXmlParse_literalMutationString22__8);
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_literalMutationString17_add381_mg15350() throws Exception {
        String __DSPOT_searchText_4551 = "|Q!l}HW.3nlU/-a0S9v4";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "8;0L`A=SO/woO!O");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_literalMutationString17_add381__8 = doc.getElementById("2");
        String o_testSimpleXmlParse_literalMutationString17__8 = doc.getElementById("2").absUrl("href");
        Assert.assertEquals("", o_testSimpleXmlParse_literalMutationString17__8);
        Elements o_testSimpleXmlParse_literalMutationString17_add381_mg15350__16 = o_testSimpleXmlParse_literalMutationString17_add381__8.getElementsContainingText(__DSPOT_searchText_4551);
        Assert.assertTrue(o_testSimpleXmlParse_literalMutationString17_add381_mg15350__16.isEmpty());
        Assert.assertEquals("", o_testSimpleXmlParse_literalMutationString17__8);
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_mg1557_mg19855() throws Exception {
        String __DSPOT_regex_6318 = "o7jR^Cad=^y!x!xmDhJL";
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        String o_testSimpleXmlParse_mg30_mg1557__14 = o_testSimpleXmlParse_mg30__11.val();
        Assert.assertEquals("", o_testSimpleXmlParse_mg30_mg1557__14);
        Elements o_testSimpleXmlParse_mg30_mg1557_mg19855__18 = o_testSimpleXmlParse_mg30__11.getElementsMatchingText(__DSPOT_regex_6318);
        Assert.assertTrue(o_testSimpleXmlParse_mg30_mg1557_mg19855__18.isEmpty());
        Assert.assertEquals("", o_testSimpleXmlParse_mg30_mg1557__14);
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_mg1526_mg11448() throws Exception {
        String __DSPOT_valueSuffix_3250 = "&f3-CX`1y(s<%E,Gp42n";
        String __DSPOT_key_3249 = "JL#OKrd!Bvu&B3{fEj>T";
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        Elements o_testSimpleXmlParse_mg30_mg1526__14 = o_testSimpleXmlParse_mg30__11.siblingElements();
        Elements o_testSimpleXmlParse_mg30_mg1526_mg11448__19 = o_testSimpleXmlParse_mg30__11.getElementsByAttributeValueEnding(__DSPOT_key_3249, __DSPOT_valueSuffix_3250);
        Assert.assertTrue(o_testSimpleXmlParse_mg30_mg1526_mg11448__19.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg30_mg1476_mg9678() throws Exception {
        String __DSPOT_searchText_2610 = "Qt$$.S%^y .=LY+opcG=";
        String __DSPOT_html_237 = "$>(xx8O:>9?$i8hdx3(]";
        String __DSPOT_tagName_0 = "&Bcvg[?i!rb0/|]6^FT)";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg30__11 = doc.createElement(__DSPOT_tagName_0);
        Element o_testSimpleXmlParse_mg30_mg1476__15 = o_testSimpleXmlParse_mg30__11.html(__DSPOT_html_237);
        Elements o_testSimpleXmlParse_mg30_mg1476_mg9678__19 = o_testSimpleXmlParse_mg30__11.getElementsContainingOwnText(__DSPOT_searchText_2610);
        Assert.assertTrue(o_testSimpleXmlParse_mg30_mg1476_mg9678__19.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSimpleXmlParse_mg31_add1679_mg18822() throws Exception {
        String __DSPOT_regex_5933 = "];o=_fRFxfZxKF=p!nao";
        String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        Document doc = tb.parse(xml, "http://foo.com/");
        TextUtil.stripNewlines(doc.html());
        Element o_testSimpleXmlParse_mg31_add1679__8 = doc.getElementById("2");
        doc.getElementById("2").absUrl("href");
        Element o_testSimpleXmlParse_mg31__10 = doc.head();
        Elements o_testSimpleXmlParse_mg31_add1679_mg18822__17 = o_testSimpleXmlParse_mg31_add1679__8.getElementsMatchingOwnText(__DSPOT_regex_5933);
        Assert.assertTrue(o_testSimpleXmlParse_mg31_add1679_mg18822__17.isEmpty());
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

