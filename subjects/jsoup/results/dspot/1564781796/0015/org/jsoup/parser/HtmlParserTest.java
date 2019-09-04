package org.jsoup.parser;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class HtmlParserTest {
    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg54() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg54__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg54__4);
        String o_handlesUnclosedTitle_mg54__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg54__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg54__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg54__11);
        two.body().html();
        Parser o_handlesUnclosedTitle_mg54__14 = two.parser();
        Assert.assertFalse(((Parser) (o_handlesUnclosedTitle_mg54__14)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesUnclosedTitle_mg54__14)).getErrors())).isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg54__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg54__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg54__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg25() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg25__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg25__4);
        String o_handlesUnclosedTitle_mg25__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg25__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg25__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg25__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg25__14 = one.body();
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg25__14)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedTitle_mg25__14)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg25__14)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg25__14)).hasParent());
        Assert.assertEquals("<body>\n <p>Test</p>\n</body>", ((Element) (o_handlesUnclosedTitle_mg25__14)).toString());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg25__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg25__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg25__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg50() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg50__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg50__4);
        String o_handlesUnclosedTitle_mg50__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg50__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg50__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg50__11);
        two.body().html();
        Document o_handlesUnclosedTitle_mg50__14 = two.normalise();
        Assert.assertFalse(((Document) (o_handlesUnclosedTitle_mg50__14)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_handlesUnclosedTitle_mg50__14)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_handlesUnclosedTitle_mg50__14)).hasText());
        Assert.assertFalse(((Document) (o_handlesUnclosedTitle_mg50__14)).hasParent());
        Assert.assertEquals("<html>\n <head>\n  <title>One</title>\n </head>\n <body>\n  <b>Two <p>Test</p></b>\n </body>\n</html>", ((Document) (o_handlesUnclosedTitle_mg50__14)).toString());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg50__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg50__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg50__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add4_mg2945() throws Exception {
        String __DSPOT_value_694 = "$oyupUkSHK#x;,<iNX$|";
        String __DSPOT_key_693 = "9Te0m8rd<T2_O>?aZhdy";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_add4__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add4__4);
        Element o_handlesUnclosedTitle_add4__5 = one.select("p").first();
        String o_handlesUnclosedTitle_add4__7 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add4__7);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_add4__13 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_add4__13);
        two.body().html();
        Elements o_handlesUnclosedTitle_add4_mg2945__26 = o_handlesUnclosedTitle_add4__5.getElementsByAttributeValueNot(__DSPOT_key_693, __DSPOT_value_694);
        Assert.assertFalse(o_handlesUnclosedTitle_add4_mg2945__26.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add4__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add4__7);
        Assert.assertEquals("One", o_handlesUnclosedTitle_add4__13);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg25_mg612() throws Exception {
        String __DSPOT_searchText_108 = "}Xj*`gmH>[A}8/o#n)B(";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg25__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg25__4);
        String o_handlesUnclosedTitle_mg25__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg25__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg25__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg25__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg25__14 = one.body();
        Elements o_handlesUnclosedTitle_mg25_mg612__24 = o_handlesUnclosedTitle_mg25__14.getElementsContainingOwnText(__DSPOT_searchText_108);
        Assert.assertTrue(o_handlesUnclosedTitle_mg25_mg612__24.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg25__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg25__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg25__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg28_mg1622() throws Exception {
        String __DSPOT_match_410 = "2XbQs |)TDG+L,kgWS%r";
        String __DSPOT_key_409 = "#EivvST}!G30F*uc([}!";
        String __DSPOT_tagName_0 = "L`A=SO/woO!OKS@Rl&{h";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg28__5 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg28__5);
        String o_handlesUnclosedTitle_mg28__6 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg28__6);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg28__12 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg28__12);
        two.body().html();
        Element o_handlesUnclosedTitle_mg28__15 = one.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedTitle_mg28_mg1622__26 = o_handlesUnclosedTitle_mg28__15.getElementsByAttributeValueContaining(__DSPOT_key_409, __DSPOT_match_410);
        Assert.assertTrue(o_handlesUnclosedTitle_mg28_mg1622__26.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg28__5);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg28__6);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg28__12);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg38_mg4278_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_1023 = "12l(eVkrHn@BV]j=2V;#";
            String __DSPOT_text_2 = "!&Bcvg[?i!rb0/|]6^FT";
            Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
            String o_handlesUnclosedTitle_mg38__5 = one.title();
            String o_handlesUnclosedTitle_mg38__6 = one.select("p").first().text();
            Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
            String o_handlesUnclosedTitle_mg38__12 = two.title();
            two.body().html();
            Element o_handlesUnclosedTitle_mg38__15 = one.text(__DSPOT_text_2);
            o_handlesUnclosedTitle_mg38__15.getElementsMatchingOwnText(__DSPOT_regex_1023);
            org.junit.Assert.fail("handlesUnclosedTitle_mg38_mg4278 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 12l(eVkrHn@BV]j=2V;#", expected.getMessage());
        }
    }
}

