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
    public void parsesUnterminatedOption_mg78_mg6780_failAssert0() throws Exception {
        try {
            int __DSPOT_index_2697 = -280133666;
            String __DSPOT_value_29 = "vK5WR{oE1L&q_{{l>^r@";
            Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
            Elements options = doc.select("option");
            int o_parsesUnterminatedOption_mg78__7 = options.size();
            String o_parsesUnterminatedOption_mg78__8 = options.first().text();
            String o_parsesUnterminatedOption_mg78__10 = options.last().text();
            Elements o_parsesUnterminatedOption_mg78__12 = options.val(__DSPOT_value_29);
            options.eq(__DSPOT_index_2697);
            org.junit.Assert.fail("parsesUnterminatedOption_mg78_mg6780 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg33_mg3408_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_1354 = "64`ftG*)gV(1WHsd&^k^";
            String __DSPOT_text_2 = "O!OKS@Rl&{ha!&Bcvg[?";
            Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
            Elements options = doc.select("option");
            int o_parsesUnterminatedOption_mg33__7 = options.size();
            String o_parsesUnterminatedOption_mg33__8 = options.first().text();
            String o_parsesUnterminatedOption_mg33__10 = options.last().text();
            Element o_parsesUnterminatedOption_mg33__12 = doc.text(__DSPOT_text_2);
            o_parsesUnterminatedOption_mg33__12.getElementsMatchingText(__DSPOT_regex_1354);
            org.junit.Assert.fail("parsesUnterminatedOption_mg33_mg3408 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 64`ftG*)gV(1WHsd&^k^", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg23_mg2281() throws Exception {
        String __DSPOT_searchText_888 = ")p&(V/p*f@Km$*c!!6gD";
        String __DSPOT_tagName_0 = "gYc TM1`_8;0L`A=SO/w";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg23__7 = options.size();
        String o_parsesUnterminatedOption_mg23__8 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg23__8);
        String o_parsesUnterminatedOption_mg23__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg23__10);
        Element o_parsesUnterminatedOption_mg23__12 = doc.createElement(__DSPOT_tagName_0);
        Elements o_parsesUnterminatedOption_mg23_mg2281__22 = o_parsesUnterminatedOption_mg23__12.getElementsContainingOwnText(__DSPOT_searchText_888);
        Assert.assertTrue(o_parsesUnterminatedOption_mg23_mg2281__22.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg23__8);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg23__10);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg20_mg997_mg17784() throws Exception {
        String __DSPOT_regex_7358 = "e=QVP0.cI/UQii`gV^wT";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg20__6 = options.size();
        String o_parsesUnterminatedOption_mg20__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg20__7);
        String o_parsesUnterminatedOption_mg20__9 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg20__9);
        Element o_parsesUnterminatedOption_mg20__11 = doc.body();
        String o_parsesUnterminatedOption_mg20_mg997__20 = o_parsesUnterminatedOption_mg20__11.baseUri();
        Assert.assertEquals("", o_parsesUnterminatedOption_mg20_mg997__20);
        Elements o_parsesUnterminatedOption_mg20_mg997_mg17784__24 = o_parsesUnterminatedOption_mg20__11.getElementsMatchingText(__DSPOT_regex_7358);
        Assert.assertTrue(o_parsesUnterminatedOption_mg20_mg997_mg17784__24.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg20__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg20__9);
        Assert.assertEquals("", o_parsesUnterminatedOption_mg20_mg997__20);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg20_add329_mg29730_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_12599 = "TNwv|MfQRhU][4$]$(D9";
            Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
            Elements options = doc.select("option");
            int o_parsesUnterminatedOption_mg20__6 = options.size();
            Element o_parsesUnterminatedOption_mg20_add329__9 = options.first();
            String o_parsesUnterminatedOption_mg20__7 = options.first().text();
            String o_parsesUnterminatedOption_mg20__9 = options.last().text();
            Element o_parsesUnterminatedOption_mg20__11 = doc.body();
            o_parsesUnterminatedOption_mg20_add329__9.getElementsMatchingOwnText(__DSPOT_regex_12599);
            org.junit.Assert.fail("parsesUnterminatedOption_mg20_add329_mg29730 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: TNwv|MfQRhU][4$]$(D9", expected.getMessage());
        }
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

