package org.jsoup.parser;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
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
}

