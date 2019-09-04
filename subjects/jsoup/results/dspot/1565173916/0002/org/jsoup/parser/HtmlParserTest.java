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
    public void handlesUnclosedAnchors_add3() throws Exception {
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedAnchors_add3__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).hasParent());
        doc.body().html();
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedAnchors_add3__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).hasParent());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg27() throws Exception {
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Parser o_handlesUnclosedAnchors_mg27__7 = doc.parser();
        Assert.assertFalse(((Parser) (o_handlesUnclosedAnchors_mg27__7)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesUnclosedAnchors_mg27__7)).getErrors())).isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg23() throws Exception {
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Document o_handlesUnclosedAnchors_mg23__7 = doc.normalise();
        Assert.assertFalse(((Document) (o_handlesUnclosedAnchors_mg23__7)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_handlesUnclosedAnchors_mg23__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_handlesUnclosedAnchors_mg23__7)).hasText());
        Assert.assertFalse(((Document) (o_handlesUnclosedAnchors_mg23__7)).hasParent());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg812() throws Exception {
        String __DSPOT_valuePrefix_242 = "t4ZcWnP&.ZuHnJBZ}O[]";
        String __DSPOT_key_241 = "e#(-%(=hn!t{Aox=_<%f";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg812__13 = o_handlesUnclosedAnchors_mg29__8.getElementsByAttributeValueStarting(__DSPOT_key_241, __DSPOT_valuePrefix_242);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg812__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1167() throws Exception {
        int __DSPOT_index_347 = -838417372;
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1167__12 = o_handlesUnclosedAnchors_mg19__8.getElementsByIndexEquals(__DSPOT_index_347);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1167__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg576() throws Exception {
        String __DSPOT_searchText_106 = "*9)[&i]$CwqVG_I.#8$P";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg576__11 = o_handlesUnclosedAnchors_mg20__7.getElementsContainingText(__DSPOT_searchText_106);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg576__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg484_failAssert0() throws Exception {
        try {
            int __DSPOT_index_69 = -847803688;
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
            o_handlesUnclosedAnchors_mg20__7.child(__DSPOT_index_69);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg20_mg484 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-847803688", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1153() throws Exception {
        String __DSPOT_valueSuffix_337 = "ivvST}!G30F*uc([}!2X";
        String __DSPOT_key_336 = "4>9!kqC{WfY|n}KRY;#E";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1153__13 = o_handlesUnclosedAnchors_mg19__8.getElementsByAttributeValueEnding(__DSPOT_key_336, __DSPOT_valueSuffix_337);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1153__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1175() throws Exception {
        String __DSPOT_searchText_351 = "M;F2/}k=(vtO^^O;y6H[";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1175__12 = o_handlesUnclosedAnchors_mg19__8.getElementsContainingOwnText(__DSPOT_searchText_351);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1175__12.isEmpty());
    }
}

