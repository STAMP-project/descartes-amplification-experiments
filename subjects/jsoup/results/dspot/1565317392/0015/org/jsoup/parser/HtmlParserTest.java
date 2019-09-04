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
    public void handlesUnclosedTitle_mg29_mg2178() throws Exception {
        String __DSPOT_searchText_553 = "g, xm6L;&=q[J1`4^Ek`";
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
        Elements o_handlesUnclosedTitle_mg29_mg2178__24 = o_handlesUnclosedTitle_mg29__14.getElementsContainingText(__DSPOT_searchText_553);
        Assert.assertTrue(o_handlesUnclosedTitle_mg29_mg2178__24.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg29__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg29__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg29__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_add9_mg824() throws Exception {
        String __DSPOT_searchText_206 = "Ph3?+w?h+LZ(B%Q=,R/:";
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
        Elements o_handlesUnclosedTitle_add9_mg824__24 = o_handlesUnclosedTitle_add9__12.getElementsContainingOwnText(__DSPOT_searchText_206);
        Assert.assertTrue(o_handlesUnclosedTitle_add9_mg824__24.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_add9__4);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_add9__5);
        Assert.assertEquals("One", o_handlesUnclosedTitle_add9__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedTitle_mg28_mg1689() throws Exception {
        int __DSPOT_index_432 = -484991190;
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
        Elements o_handlesUnclosedTitle_mg28_mg1689__25 = o_handlesUnclosedTitle_mg28__15.getElementsByIndexEquals(__DSPOT_index_432);
        Assert.assertTrue(o_handlesUnclosedTitle_mg28_mg1689__25.isEmpty());
        Assert.assertEquals("One <b>Two <b>Three", o_handlesUnclosedTitle_mg28__5);
        Assert.assertEquals("Test", o_handlesUnclosedTitle_mg28__6);
        Assert.assertEquals("One", o_handlesUnclosedTitle_mg28__12);
    }
}

