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
    public void parsesUnterminatedOption_mg56() throws Exception {
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg56__6 = options.size();
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg56__6)));
        String o_parsesUnterminatedOption_mg56__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg56__7);
        String o_parsesUnterminatedOption_mg56__9 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg56__9);
        Element o_parsesUnterminatedOption_mg56__11 = options.last();
        Assert.assertFalse(((Collection) (((Element) (o_parsesUnterminatedOption_mg56__11)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_mg56__11)).hasText());
        Assert.assertFalse(((Element) (o_parsesUnterminatedOption_mg56__11)).isBlock());
        Assert.assertTrue(((Element) (o_parsesUnterminatedOption_mg56__11)).hasParent());
        Assert.assertEquals(2, ((int) (o_parsesUnterminatedOption_mg56__6)));
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg56__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg56__9);
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
    public void parsesUnterminatedOption_mg23_mg2479() throws Exception {
        String __DSPOT_match_923 = "3yxWRWN]#_&>3aBPF#]^";
        String __DSPOT_key_922 = "%+>F|HVSM[sCW8$DSC2(";
        String __DSPOT_tagName_0 = "gYc TM1`_8;0L`A=SO/w";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg23__7 = options.size();
        String o_parsesUnterminatedOption_mg23__8 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg23__8);
        String o_parsesUnterminatedOption_mg23__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg23__10);
        Element o_parsesUnterminatedOption_mg23__12 = doc.createElement(__DSPOT_tagName_0);
        Elements o_parsesUnterminatedOption_mg23_mg2479__23 = o_parsesUnterminatedOption_mg23__12.getElementsByAttributeValueContaining(__DSPOT_key_922, __DSPOT_match_923);
        Assert.assertTrue(o_parsesUnterminatedOption_mg23_mg2479__23.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg23__8);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg23__10);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_mg23_mg2483() throws Exception {
        String __DSPOT_regex_928 = "%*epy?.]!=Hw=ic8:KL-";
        String __DSPOT_key_926 = "xLXM-qiv,D^Lmyj0F[EI";
        String __DSPOT_tagName_0 = "gYc TM1`_8;0L`A=SO/w";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_mg23__7 = options.size();
        String o_parsesUnterminatedOption_mg23__8 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg23__8);
        String o_parsesUnterminatedOption_mg23__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg23__10);
        Element o_parsesUnterminatedOption_mg23__12 = doc.createElement(__DSPOT_tagName_0);
        Elements o_parsesUnterminatedOption_mg23_mg2483__23 = o_parsesUnterminatedOption_mg23__12.getElementsByAttributeValueMatching(__DSPOT_key_926, __DSPOT_regex_928);
        Assert.assertTrue(o_parsesUnterminatedOption_mg23_mg2483__23.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_mg23__8);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_mg23__10);
    }

    @Test(timeout = 10000)
    public void parsesUnterminatedOption_add7_mg7817() throws Exception {
        String __DSPOT_searchText_3112 = "4H1DpYE,,XXjHu{<0.M ";
        Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        Elements options = doc.select("option");
        int o_parsesUnterminatedOption_add7__6 = options.size();
        String o_parsesUnterminatedOption_add7__7 = options.first().text();
        Assert.assertEquals("One", o_parsesUnterminatedOption_add7__7);
        Element o_parsesUnterminatedOption_add7__9 = options.last();
        String o_parsesUnterminatedOption_add7__10 = options.last().text();
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_add7__10);
        Elements o_parsesUnterminatedOption_add7_mg7817__21 = o_parsesUnterminatedOption_add7__9.getElementsContainingText(__DSPOT_searchText_3112);
        Assert.assertTrue(o_parsesUnterminatedOption_add7_mg7817__21.isEmpty());
        Assert.assertEquals("One", o_parsesUnterminatedOption_add7__7);
        Assert.assertEquals("TwoThree", o_parsesUnterminatedOption_add7__10);
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

