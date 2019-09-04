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
    public void handlesUnclosedTitle_mg32() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg32__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg32__4);
        String o_handlesUnclosedTitle_mg32__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg32__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg32__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg32__11);
        two.body().html();
        Document o_handlesUnclosedTitle_mg32__14 = one.normalise();
        Assert.assertFalse(((Document) (o_handlesUnclosedTitle_mg32__14)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_handlesUnclosedTitle_mg32__14)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_handlesUnclosedTitle_mg32__14)).hasText());
        Assert.assertFalse(((Document) (o_handlesUnclosedTitle_mg32__14)).hasParent());
        Assert.assertEquals("<html>\n <head>\n  <title>One &lt;b&gt;Two &lt;b&gt;Three</title>\n </head>\n <body>\n  <p>Test</p>\n </body>\n</html>", ((Document) (o_handlesUnclosedTitle_mg32__14)).toString());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg32__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg32__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg32__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add4() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_add4__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add4__4);
        Element o_handlesUnclosedTitle_add4__5 = one.select("p").first();
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_add4__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedTitle_add4__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_add4__5)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_add4__5)).hasParent());
        String o_handlesUnclosedTitle_add4__7 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add4__7);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_add4__13 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_add4__13);
        two.body().html();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add4__4);
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_add4__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedTitle_add4__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_add4__5)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_add4__5)).hasParent());
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add4__7);
        Assert.assertEquals("One", o_handlesUnclosedTitle_add4__13);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg36() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg36__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg36__4);
        String o_handlesUnclosedTitle_mg36__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg36__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg36__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg36__11);
        two.body().html();
        Parser o_handlesUnclosedTitle_mg36__14 = one.parser();
        Assert.assertFalse(((Parser) (o_handlesUnclosedTitle_mg36__14)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesUnclosedTitle_mg36__14)).getErrors())).isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg36__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg36__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg36__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg29_mg2078() throws Exception {
        String __DSPOT_match_518 = "cKrT-SlIW?5(|7B##A8q";
        String __DSPOT_key_517 = "BcMkx7?ezalTwt&Wp6w:";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg29__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        String o_handlesUnclosedTitle_mg29__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg29__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg29__14 = one.head();
        Elements o_handlesUnclosedTitle_mg29_mg2078__25 = o_handlesUnclosedTitle_mg29__14.getElementsByAttributeValueContaining(__DSPOT_key_517, __DSPOT_match_518);
        Assert.assertTrue(o_handlesUnclosedTitle_mg29_mg2078__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg29_mg2079() throws Exception {
        String __DSPOT_valueSuffix_520 = "&&`#Jw_^incEl=}o1]Vl";
        String __DSPOT_key_519 = "xYfLI97!n@[jri.o56p(";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg29__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        String o_handlesUnclosedTitle_mg29__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg29__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg29__14 = one.head();
        Elements o_handlesUnclosedTitle_mg29_mg2079__25 = o_handlesUnclosedTitle_mg29__14.getElementsByAttributeValueEnding(__DSPOT_key_519, __DSPOT_valueSuffix_520);
        Assert.assertTrue(o_handlesUnclosedTitle_mg29_mg2079__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add4_mg2860() throws Exception {
        String __DSPOT_keyPrefix_673 = "aU,(tk=54D=fN6wf=/#,";
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
        Elements o_handlesUnclosedTitle_add4_mg2860__25 = o_handlesUnclosedTitle_add4__5.getElementsByAttributeStarting(__DSPOT_keyPrefix_673);
        Assert.assertTrue(o_handlesUnclosedTitle_add4_mg2860__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add4__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add4__7);
        Assert.assertEquals("One", o_handlesUnclosedTitle_add4__13);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add9_mg903() throws Exception {
        String __DSPOT_searchText_219 = "vQ{7`[>;YwP/8[Cozg$:";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_add9__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add9__4);
        String o_handlesUnclosedTitle_add9__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add9__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_add9__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_add9__11);
        Element o_handlesUnclosedTitle_add9__12 = two.body();
        two.body().html();
        Elements o_handlesUnclosedTitle_add9_mg903__24 = o_handlesUnclosedTitle_add9__12.getElementsContainingOwnText(__DSPOT_searchText_219);
        Assert.assertTrue(o_handlesUnclosedTitle_add9_mg903__24.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add9__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add9__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_add9__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg29_mg2082() throws Exception {
        String __DSPOT_valuePrefix_526 = "%*Y1Ic(d,v{F,#ogL9Zc";
        String __DSPOT_key_525 = "<H#Xk%HO9Gb#sRrjByv5";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg29__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        String o_handlesUnclosedTitle_mg29__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg29__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg29__14 = one.head();
        Elements o_handlesUnclosedTitle_mg29_mg2082__25 = o_handlesUnclosedTitle_mg29__14.getElementsByAttributeValueStarting(__DSPOT_key_525, __DSPOT_valuePrefix_526);
        Assert.assertTrue(o_handlesUnclosedTitle_mg29_mg2082__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg25_mg441_mg29109_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_9409 = "*&Bca)|&^{TI^_m#CBmS";
            String __DSPOT_text_31 = "Pq,r5>K`HNw]f4QDhB+ ";
            Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
            String o_handlesUnclosedTitle_mg25__4 = one.title();
            String o_handlesUnclosedTitle_mg25__5 = one.select("p").first().text();
            Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
            String o_handlesUnclosedTitle_mg25__11 = two.title();
            two.body().html();
            Element o_handlesUnclosedTitle_mg25__14 = one.body();
            Element o_handlesUnclosedTitle_mg25_mg441__24 = two.text(__DSPOT_text_31);
            o_handlesUnclosedTitle_mg25_mg441__24.getElementsMatchingOwnText(__DSPOT_regex_9409);
            org.junit.Assert.fail("handlesUnclosedTitle_mg25_mg441_mg29109 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: *&Bca)|&^{TI^_m#CBmS", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add1_mg4564_mg15955_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_4753 = "@w_XkvSGn[K`LV*)SA_7";
            String __DSPOT_text_1088 = "HM9&1&x#LaHAzB|sTDCK";
            Document o_handlesUnclosedTitle_add1__1 = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
            Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
            String o_handlesUnclosedTitle_add1__5 = one.title();
            String o_handlesUnclosedTitle_add1__6 = one.select("p").first().text();
            Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
            String o_handlesUnclosedTitle_add1__12 = two.title();
            two.body().html();
            Element o_handlesUnclosedTitle_add1_mg4564__24 = one.text(__DSPOT_text_1088);
            o_handlesUnclosedTitle_add1_mg4564__24.getElementsMatchingText(__DSPOT_regex_4753);
            org.junit.Assert.fail("handlesUnclosedTitle_add1_mg4564_mg15955 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: @w_XkvSGn[K`LV*)SA_7", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg25_mg587_mg16493() throws Exception {
        String __DSPOT_regex_4970 = "NQqzZj3Vz*likaUWOo* ";
        String __DSPOT_key_4969 = "l.EMKX#DzS.y>][RCFWM";
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
        String o_handlesUnclosedTitle_mg25_mg587__23 = o_handlesUnclosedTitle_mg25__14.className();
        Assert.assertEquals("", o_handlesUnclosedTitle_mg25_mg587__23);
        Elements o_handlesUnclosedTitle_mg25_mg587_mg16493__28 = o_handlesUnclosedTitle_mg25__14.getElementsByAttributeValueMatching(__DSPOT_key_4969, __DSPOT_regex_4970);
        Assert.assertTrue(o_handlesUnclosedTitle_mg25_mg587_mg16493__28.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg25__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg25__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg25__11);
        Assert.assertEquals("", o_handlesUnclosedTitle_mg25_mg587__23);
    }
}

