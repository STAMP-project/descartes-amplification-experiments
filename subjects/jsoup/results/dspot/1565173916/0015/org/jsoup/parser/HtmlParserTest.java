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
    public void handlesUnclosedTitle_mg29_mg2132() throws Exception {
        String __DSPOT_match_516 = "2y]!j|ETYlfkC]2kysr0";
        String __DSPOT_key_515 = "*4Grb2{]m,=py20Fs4d]";
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
        Elements o_handlesUnclosedTitle_mg29_mg2132__25 = o_handlesUnclosedTitle_mg29__14.getElementsByAttributeValueContaining(__DSPOT_key_515, __DSPOT_match_516);
        Assert.assertTrue(o_handlesUnclosedTitle_mg29_mg2132__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg38_mg4749() throws Exception {
        String __DSPOT_searchText_1132 = ":28)uQOJ[5_&aRoLe!m)";
        String __DSPOT_text_2 = "!&Bcvg[?i!rb0/|]6^FT";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg38__5 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg38__5);
        String o_handlesUnclosedTitle_mg38__6 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg38__6);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg38__12 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg38__12);
        two.body().html();
        Element o_handlesUnclosedTitle_mg38__15 = one.text(__DSPOT_text_2);
        Elements o_handlesUnclosedTitle_mg38_mg4749__25 = o_handlesUnclosedTitle_mg38__15.getElementsContainingText(__DSPOT_searchText_1132);
        Assert.assertTrue(o_handlesUnclosedTitle_mg38_mg4749__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg38__5);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg38__6);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg38__12);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg46_mg703() throws Exception {
        String __DSPOT_value_131 = "ynZ< gd.usM]Jt}g`wki";
        String __DSPOT_key_130 = "<,)|Wy@juza;+kVD6&G)";
        String __DSPOT_tagName_5 = "R%h1,xavU[1Rvnj|}8wu";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg46__5 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg46__5);
        String o_handlesUnclosedTitle_mg46__6 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg46__6);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg46__12 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg46__12);
        two.body().html();
        Element o_handlesUnclosedTitle_mg46__15 = two.createElement(__DSPOT_tagName_5);
        Elements o_handlesUnclosedTitle_mg46_mg703__26 = o_handlesUnclosedTitle_mg46__15.getElementsByAttributeValueNot(__DSPOT_key_130, __DSPOT_value_131);
        Assert.assertFalse(o_handlesUnclosedTitle_mg46_mg703__26.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg46__5);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg46__6);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg46__12);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg29_mg2222_mg13926() throws Exception {
        String __DSPOT_searchText_4046 = "u3jz[K/|AF,3Y|NeR;sp";
        String __DSPOT_html_558 = "U0<3#}]I<wAj/G]bRb.7";
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
        Element o_handlesUnclosedTitle_mg29_mg2222__24 = o_handlesUnclosedTitle_mg29__14.prepend(__DSPOT_html_558);
        Elements o_handlesUnclosedTitle_mg29_mg2222_mg13926__28 = o_handlesUnclosedTitle_mg29__14.getElementsContainingOwnText(__DSPOT_searchText_4046);
        Assert.assertTrue(o_handlesUnclosedTitle_mg29_mg2222_mg13926__28.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add4_add2469_mg14470() throws Exception {
        String __DSPOT_regex_4296 = "PImZLqq!jHkP546$CkDo";
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
        two.body().html();
        Elements o_handlesUnclosedTitle_add4_add2469_mg14470__27 = o_handlesUnclosedTitle_add4__5.getElementsMatchingText(__DSPOT_regex_4296);
        Assert.assertTrue(o_handlesUnclosedTitle_add4_add2469_mg14470__27.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add4__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add4__7);
        Assert.assertEquals("One", o_handlesUnclosedTitle_add4__13);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg27_mg994_mg27077() throws Exception {
        String __DSPOT_valueSuffix_8841 = "@uD2({)-agW !+Qrr3k4";
        String __DSPOT_key_8840 = "*_vA-uXBq]sf:>.cq2*,";
        String __DSPOT_tagName_243 = "k#nQ$=[0p+;F#O7,e!<J";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg27__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg27__4);
        String o_handlesUnclosedTitle_mg27__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg27__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg27__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg27__11);
        two.body().html();
        Document o_handlesUnclosedTitle_mg27__14 = one.clone();
        Element o_handlesUnclosedTitle_mg27_mg994__24 = one.createElement(__DSPOT_tagName_243);
        Elements o_handlesUnclosedTitle_mg27_mg994_mg27077__29 = o_handlesUnclosedTitle_mg27_mg994__24.getElementsByAttributeValueEnding(__DSPOT_key_8840, __DSPOT_valueSuffix_8841);
        Assert.assertTrue(o_handlesUnclosedTitle_mg27_mg994_mg27077__29.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg27__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg27__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg27__11);
    }
}

