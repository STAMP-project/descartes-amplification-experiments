package org.jsoup.parser;


import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.DataNode;
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
    public void handlesUnclosedTitle_mg47() throws Exception {
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg47__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg47__4);
        String o_handlesUnclosedTitle_mg47__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg47__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg47__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg47__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg47__14 = two.head();
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg47__14)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedTitle_mg47__14)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg47__14)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedTitle_mg47__14)).hasParent());
        Assert.assertEquals("<head>\n <title>One</title>\n</head>", ((Element) (o_handlesUnclosedTitle_mg47__14)).toString());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg47__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg47__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg47__11);
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
    public void handlesUnclosedTitle_mg43_mg4602() throws Exception {
        String __DSPOT_regex_1072 = "r>0!aCVk!S!Cq&Z&g-HM";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg43__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg43__4);
        String o_handlesUnclosedTitle_mg43__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg43__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg43__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg43__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg43__14 = two.body();
        Elements o_handlesUnclosedTitle_mg43_mg4602__24 = o_handlesUnclosedTitle_mg43__14.getElementsMatchingText(__DSPOT_regex_1072);
        Assert.assertTrue(o_handlesUnclosedTitle_mg43_mg4602__24.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg43__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg43__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg43__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg47_mg1233() throws Exception {
        int __DSPOT_index_304 = -605813910;
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg47__4 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg47__4);
        String o_handlesUnclosedTitle_mg47__5 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg47__5);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg47__11 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg47__11);
        two.body().html();
        Element o_handlesUnclosedTitle_mg47__14 = two.head();
        Elements o_handlesUnclosedTitle_mg47_mg1233__24 = o_handlesUnclosedTitle_mg47__14.getElementsByIndexEquals(__DSPOT_index_304);
        Assert.assertTrue(o_handlesUnclosedTitle_mg47_mg1233__24.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg47__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg47__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg47__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg43_add4457_mg10092_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_2732 = "fxbNw:$)%J}UQa{UO)2j";
            Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
            String o_handlesUnclosedTitle_mg43_add4457__4 = one.title();
            String o_handlesUnclosedTitle_mg43__4 = one.title();
            String o_handlesUnclosedTitle_mg43__5 = one.select("p").first().text();
            Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
            String o_handlesUnclosedTitle_mg43__11 = two.title();
            two.body().html();
            Element o_handlesUnclosedTitle_mg43__14 = two.body();
            o_handlesUnclosedTitle_mg43__14.getElementsMatchingOwnText(__DSPOT_regex_2732);
            org.junit.Assert.fail("handlesUnclosedTitle_mg43_add4457_mg10092 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: fxbNw:$)%J}UQa{UO)2j", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg46_mg622_mg16748() throws Exception {
        String __DSPOT_valueSuffix_5005 = "_4/O|5}`F%coI{vh%CC>";
        String __DSPOT_key_5004 = "QF B3e_U-AMBCXxG}x7*";
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
        List<DataNode> o_handlesUnclosedTitle_mg46_mg622__24 = o_handlesUnclosedTitle_mg46__15.dataNodes();
        Elements o_handlesUnclosedTitle_mg46_mg622_mg16748__29 = o_handlesUnclosedTitle_mg46__15.getElementsByAttributeValueEnding(__DSPOT_key_5004, __DSPOT_valueSuffix_5005);
        Assert.assertTrue(o_handlesUnclosedTitle_mg46_mg622_mg16748__29.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg46__5);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg46__6);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg46__12);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add4_mg2760_mg22506() throws Exception {
        String __DSPOT_match_6987 = "gC:ma.! `&bL=0}u<X[F";
        String __DSPOT_key_6986 = "8pk?v09=mp-[|TzEqx[?";
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
        Elements o_handlesUnclosedTitle_add4_mg2760__24 = o_handlesUnclosedTitle_add4__5.previousElementSiblings();
        Elements o_handlesUnclosedTitle_add4_mg2760_mg22506__29 = o_handlesUnclosedTitle_add4__5.getElementsByAttributeValueContaining(__DSPOT_key_6986, __DSPOT_match_6987);
        Assert.assertTrue(o_handlesUnclosedTitle_add4_mg2760_mg22506__29.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add4__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add4__7);
        Assert.assertEquals("One", o_handlesUnclosedTitle_add4__13);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg28_add1342_mg27407() throws Exception {
        String __DSPOT_regex_8765 = "jLe2TfcMB&kz_vyq]<C]";
        String __DSPOT_key_8764 = "*:TEuT&>&HUDR0#?iHo@";
        String __DSPOT_tagName_0 = "L`A=SO/woO!OKS@Rl&{h";
        Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>");
        String o_handlesUnclosedTitle_mg28__5 = one.title();
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg28__5);
        Element o_handlesUnclosedTitle_mg28_add1342__8 = one.select("p").first();
        String o_handlesUnclosedTitle_mg28__6 = one.select("p").first().text();
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg28__6);
        Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>");
        String o_handlesUnclosedTitle_mg28__12 = two.title();
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg28__12);
        two.body().html();
        Element o_handlesUnclosedTitle_mg28__15 = one.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedTitle_mg28_add1342_mg27407__30 = o_handlesUnclosedTitle_mg28__15.getElementsByAttributeValueMatching(__DSPOT_key_8764, __DSPOT_regex_8765);
        Assert.assertTrue(o_handlesUnclosedTitle_mg28_add1342_mg27407__30.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg28__5);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg28__6);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg28__12);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add9_mg832_mg7808() throws Exception {
        String __DSPOT_searchText_1923 = "Wb50]_n},H9{K (]AgQ|";
        String __DSPOT_tagName_178 = "+X6u@-w1+/`d>#Um]cj_";
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
        Element o_handlesUnclosedTitle_add9_mg832__24 = o_handlesUnclosedTitle_add9__12.appendElement(__DSPOT_tagName_178);
        Elements o_handlesUnclosedTitle_add9_mg832_mg7808__28 = o_handlesUnclosedTitle_add9_mg832__24.getElementsContainingOwnText(__DSPOT_searchText_1923);
        Assert.assertTrue(o_handlesUnclosedTitle_add9_mg832_mg7808__28.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add9__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add9__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_add9__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg28_mg1708_mg27192() throws Exception {
        String __DSPOT_value_8667 = "&2G8Y,Fz&@{!m5YF2}<8";
        String __DSPOT_key_8666 = "z?[N%o/eLN2S]ik9tQ^&";
        String __DSPOT_value_437 = "/f2=X^4<N|/U4Y/4LsTv";
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
        Element o_handlesUnclosedTitle_mg28_mg1708__25 = o_handlesUnclosedTitle_mg28__15.val(__DSPOT_value_437);
        Elements o_handlesUnclosedTitle_mg28_mg1708_mg27192__30 = o_handlesUnclosedTitle_mg28_mg1708__25.getElementsByAttributeValueNot(__DSPOT_key_8666, __DSPOT_value_8667);
        Assert.assertFalse(o_handlesUnclosedTitle_mg28_mg1708_mg27192__30.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg28__5);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg28__6);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg28__12);
    }
}

