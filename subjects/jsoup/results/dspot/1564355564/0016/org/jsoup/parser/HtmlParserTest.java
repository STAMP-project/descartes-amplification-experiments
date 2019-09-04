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
    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg31() throws Exception {
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg31__6 = options.size();
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg31__6)));
        String o_parsesUnterminatedOption_mg31__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg31__7);
        String o_parsesUnterminatedOption_mg31__9 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg31__9);
        Parser o_parsesUnterminatedOption_mg31__11 = doc.parser();
        Assert.assertFalse(((Parser) (o_parsesUnterminatedOption_mg31__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_parsesUnterminatedOption_mg31__11)).getErrors())).isEmpty());
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg31__6)));
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg31__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg31__9);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg24() throws Exception {
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg24__6 = options.size();
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg24__6)));
        String o_parsesUnterminatedOption_mg24__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg24__7);
        String o_parsesUnterminatedOption_mg24__9 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg24__9);
        Element o_parsesUnterminatedOption_mg24__11 = doc.head();
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_mg24__11)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_parsesUnterminatedOption_mg24__11)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_parsesUnterminatedOption_mg24__11)).hasText());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_mg24__11)).hasParent());
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg24__6)));
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg24__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg24__9);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg27() throws Exception {
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg27__6 = options.size();
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg27__6)));
        String o_parsesUnterminatedOption_mg27__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg27__7);
        String o_parsesUnterminatedOption_mg27__9 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg27__9);
        Document o_parsesUnterminatedOption_mg27__11 = doc.normalise();
        Assert.assertFalse(((Document) (o_parsesUnterminatedOption_mg27__11)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_parsesUnterminatedOption_mg27__11)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_parsesUnterminatedOption_mg27__11)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <p><select><option>One</option><option>TwoThree</option></select></p>\n </body>\n</html>", ((Document) (o_parsesUnterminatedOption_mg27__11)).toString());
        Assert.assertFalse(((Document) (o_parsesUnterminatedOption_mg27__11)).hasParent());
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg27__6)));
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg27__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg27__9);
    }

    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }
}

