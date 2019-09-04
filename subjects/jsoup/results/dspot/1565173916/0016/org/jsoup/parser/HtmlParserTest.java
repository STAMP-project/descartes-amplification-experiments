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
    public void parsesUnterminatedOption_mg49() throws Exception {
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg49__6 = options.size();
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg49__6)));
        String o_parsesUnterminatedOption_mg49__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg49__7);
        String o_parsesUnterminatedOption_mg49__9 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg49__9);
        Element o_parsesUnterminatedOption_mg49__11 = options.first();
        Assert.assertFalse(((Collection) (((Element) (o_parsesUnterminatedOption_mg49__11)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_mg49__11)).hasText());
        Assert.assertFalse(((Element) (o_parsesUnterminatedOption_mg49__11)).isBlock());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_mg49__11)).hasParent());
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg49__6)));
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg49__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg49__9);
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
        Assert.assertFalse(((Collection) (((Document) (o_parsesUnterminatedOption_mg27__11)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_parsesUnterminatedOption_mg27__11)).hasText());
        Assert.assertFalse(((Document) (o_parsesUnterminatedOption_mg27__11)).isBlock());
        Assert.assertFalse(((Document) (o_parsesUnterminatedOption_mg27__11)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <p><select><option>One</option><option>TwoThree</option></select></p>\n </body>\n</html>", ((Document) (o_parsesUnterminatedOption_mg27__11)).toString());
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg27__6)));
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg27__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg27__9);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg24_mg3214() throws Exception {
        String __DSPOT_valueSuffix_1247 = ",Xy=;9C_HEWc&dK(#hwk";
        String __DSPOT_key_1246 = "C@P-|]`&.!FBA39?H%al";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg24__6 = options.size();
        String o_parsesUnterminatedOption_mg24__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg24__7);
        String o_parsesUnterminatedOption_mg24__9 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg24__9);
        Element o_parsesUnterminatedOption_mg24__11 = doc.head();
        Elements o_parsesUnterminatedOption_mg24_mg3214__22 = o_parsesUnterminatedOption_mg24__11.getElementsByAttributeValueEnding(__DSPOT_key_1246, __DSPOT_valueSuffix_1247);
        Assert.assertTrue(o_parsesUnterminatedOption_mg24_mg3214__22.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg24__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg24__9);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg33_mg3755() throws Exception {
        int __DSPOT_index_1488 = 2110050416;
        String __DSPOT_text_2 = "O!OKS@Rl&{ha!&Bcvg[?";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg33__7 = options.size();
        String o_parsesUnterminatedOption_mg33__8 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg33__8);
        String o_parsesUnterminatedOption_mg33__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg33__10);
        Element o_parsesUnterminatedOption_mg33__12 = doc.text(__DSPOT_text_2);
        Elements o_parsesUnterminatedOption_mg33_mg3755__22 = o_parsesUnterminatedOption_mg33__12.getElementsByIndexEquals(__DSPOT_index_1488);
        Assert.assertTrue(o_parsesUnterminatedOption_mg33_mg3755__22.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg33__8);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg33__10);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg33_mg3771() throws Exception {
        String __DSPOT_searchText_1499 = "(Wm.lEFfc3hD}&fCvxqR";
        String __DSPOT_text_2 = "O!OKS@Rl&{ha!&Bcvg[?";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg33__7 = options.size();
        String o_parsesUnterminatedOption_mg33__8 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg33__8);
        String o_parsesUnterminatedOption_mg33__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg33__10);
        Element o_parsesUnterminatedOption_mg33__12 = doc.text(__DSPOT_text_2);
        Elements o_parsesUnterminatedOption_mg33_mg3771__22 = o_parsesUnterminatedOption_mg33__12.getElementsContainingText(__DSPOT_searchText_1499);
        Assert.assertTrue(o_parsesUnterminatedOption_mg33_mg3771__22.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg33__8);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg33__10);
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

