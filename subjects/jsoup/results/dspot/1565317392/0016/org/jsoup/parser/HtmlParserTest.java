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
    public void parsesUnterminatedOption_add7() throws Exception {
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_add7__6 = options.size();
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_add7__6)));
        String o_parsesUnterminatedOption_add7__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_add7__7);
        Element o_parsesUnterminatedOption_add7__9 = options.last();
        Assert.assertFalse(((Collection) (((Element) (o_parsesUnterminatedOption_add7__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_add7__9)).hasText());
        Assert.assertFalse(((Element) (o_parsesUnterminatedOption_add7__9)).isBlock());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_add7__9)).hasParent());
        String o_parsesUnterminatedOption_add7__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_add7__10);
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_add7__6)));
        Assert.assertEquals("One", o_parsesUnterminatedOption_add7__7);
        Assert.assertFalse(((Collection) (((Element) (o_parsesUnterminatedOption_add7__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_add7__9)).hasText());
        Assert.assertFalse(((Element) (o_parsesUnterminatedOption_add7__9)).isBlock());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_add7__9)).hasParent());
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
    public void parsesUnterminatedOption_add7_mg5377() throws Exception {
        String __DSPOT_value_2136 = "R=cO<5|!Vbq];7Rt[oXb";
        String __DSPOT_key_2135 = "fY{<wxAR]s7%&$:!hYiU";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_add7__6 = options.size();
        String o_parsesUnterminatedOption_add7__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_add7__7);
        Element o_parsesUnterminatedOption_add7__9 = options.last();
        String o_parsesUnterminatedOption_add7__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_add7__10);
        Elements o_parsesUnterminatedOption_add7_mg5377__22 = o_parsesUnterminatedOption_add7__9.getElementsByAttributeValueNot(__DSPOT_key_2135, __DSPOT_value_2136);
        Assert.assertFalse(o_parsesUnterminatedOption_add7_mg5377__22.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_add7__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_add7__10);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_add7_mg5373() throws Exception {
        String __DSPOT_match_2130 = "OFp:}EGHm}<X+Ceeat%i";
        String __DSPOT_key_2129 = "J>M3eod/k]}J+jYAtV,@";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_add7__6 = options.size();
        String o_parsesUnterminatedOption_add7__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_add7__7);
        Element o_parsesUnterminatedOption_add7__9 = options.last();
        String o_parsesUnterminatedOption_add7__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_add7__10);
        Elements o_parsesUnterminatedOption_add7_mg5373__22 = o_parsesUnterminatedOption_add7__9.getElementsByAttributeValueContaining(__DSPOT_key_2129, __DSPOT_match_2130);
        Assert.assertTrue(o_parsesUnterminatedOption_add7_mg5373__22.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_add7__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_add7__10);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg38_mg1181_failAssert0() throws Exception {
        try {
            int __DSPOT_index_378 = -1522320324;
            String __DSPOT_className_5 = "01yCi*OdwpauR%h1,xav";
            Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
            Elements options = doc.select("option");
            int o_parsesUnterminatedOption_mg38__7 = options.size();
            String o_parsesUnterminatedOption_mg38__8 = options.first().text();
            String o_parsesUnterminatedOption_mg38__10 = options.last().text();
            Elements o_parsesUnterminatedOption_mg38__12 = options.addClass(__DSPOT_className_5);
            options.eq(__DSPOT_index_378);
            org.junit.Assert.fail("parsesUnterminatedOption_mg38_mg1181 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1522320324", expected.getMessage());
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

