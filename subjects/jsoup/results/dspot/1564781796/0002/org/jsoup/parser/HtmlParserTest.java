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
    public void handlesUnclosedAnchors_mg20() throws Exception {
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_mg20__7)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedAnchors_mg20__7)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_handlesUnclosedAnchors_mg20__7)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_mg20__7)).hasParent());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg609_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_114 = "! br=.&jaX`XSWVx(:.@";
            String __DSPOT_key_106 = "4[C+#Sp88R_=&n/z@E)[";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            Element o_handlesUnclosedAnchors_add3__5 = doc.body();
            doc.body().html();
            o_handlesUnclosedAnchors_add3__5.getElementsByAttributeValueMatching(__DSPOT_key_106, __DSPOT_regex_114);
            org.junit.Assert.fail("handlesUnclosedAnchors_add3_mg609 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: ! br=.&jaX`XSWVx(:.@", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg638() throws Exception {
        String __DSPOT_valuePrefix_134 = "puH(&2|h9b-,267YHj?U";
        String __DSPOT_key_133 = "S_F6rq5 w=#@fx)l0pr;";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg638__12 = o_handlesUnclosedAnchors_mg20__7.getElementsByAttributeValueStarting(__DSPOT_key_133, __DSPOT_valuePrefix_134);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg638__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg816() throws Exception {
        String __DSPOT_valueSuffix_249 = "x=_<%ft4ZcWnP&.ZuHnJ";
        String __DSPOT_key_248 = "E9`u!Ce#(-%(=hn!t{Ao";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg816__13 = o_handlesUnclosedAnchors_mg29__8.getElementsByAttributeValueEnding(__DSPOT_key_248, __DSPOT_valueSuffix_249);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg816__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg662() throws Exception {
        String __DSPOT_keyPrefix_149 = "Hkeqn{p}9EZwwCv!G#hy";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg662__11 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeStarting(__DSPOT_keyPrefix_149);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg16_mg662__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1075() throws Exception {
        String __DSPOT_searchText_333 = "Y[?;Ytm)DCeu_0C{UuxT";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1075__12 = o_handlesUnclosedAnchors_mg19__8.getElementsContainingOwnText(__DSPOT_searchText_333);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1075__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg405_mg18148() throws Exception {
        String __DSPOT_value_8086 = "x>=ncjw;MgQ6VOZ`F>8;";
        String __DSPOT_key_8085 = ">.Jr}bkIM*R#C?(2G+D%";
        String __DSPOT_tagName_38 = "Ji&w1WL[gZTO{/AJ+_NX";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Element o_handlesUnclosedAnchors_mg16_mg405__11 = doc.createElement(__DSPOT_tagName_38);
        Elements o_handlesUnclosedAnchors_mg16_mg405_mg18148__16 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeValueNot(__DSPOT_key_8085, __DSPOT_value_8086);
        Assert.assertFalse(o_handlesUnclosedAnchors_mg16_mg405_mg18148__16.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg866_mg17542_failAssert0() throws Exception {
        try {
            int __DSPOT_index_7745 = -65441846;
            String __DSPOT_className_275 = "e_CR@z<e}*1gCLA [,68";
            String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
            Element o_handlesUnclosedAnchors_mg29_mg866__12 = o_handlesUnclosedAnchors_mg29__8.removeClass(__DSPOT_className_275);
            o_handlesUnclosedAnchors_mg29__8.child(__DSPOT_index_7745);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg29_mg866_mg17542 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-65441846", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg708_mg13597() throws Exception {
        String __DSPOT_match_5885 = "Y}fw%I@ylvOCxn>m|3#%";
        String __DSPOT_key_5884 = "{@}UDOF3(}E%2_,}-#GJ";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        doc.body().html();
        String o_handlesUnclosedAnchors_add3_mg708__10 = o_handlesUnclosedAnchors_add3__5.ownText();
        Assert.assertEquals("", o_handlesUnclosedAnchors_add3_mg708__10);
        Elements o_handlesUnclosedAnchors_add3_mg708_mg13597__15 = o_handlesUnclosedAnchors_add3__5.getElementsByAttributeValueContaining(__DSPOT_key_5884, __DSPOT_match_5885);
        Assert.assertTrue(o_handlesUnclosedAnchors_add3_mg708_mg13597__15.isEmpty());
        Assert.assertEquals("", o_handlesUnclosedAnchors_add3_mg708__10);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg862_mg2773() throws Exception {
        String __DSPOT_regex_725 = "MIL=POQdYl8dK}?]r*!b";
        String __DSPOT_key_723 = "j)*YsK2GyngW6!28SUl-";
        String __DSPOT_tagName_273 = "o;ly|yz)r_ 8Q72!4y|o";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Element o_handlesUnclosedAnchors_mg29_mg862__12 = o_handlesUnclosedAnchors_mg29__8.prependElement(__DSPOT_tagName_273);
        Elements o_handlesUnclosedAnchors_mg29_mg862_mg2773__17 = o_handlesUnclosedAnchors_mg29__8.getElementsByAttributeValueMatching(__DSPOT_key_723, __DSPOT_regex_725);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg862_mg2773__17.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg910_mg6025() throws Exception {
        String __DSPOT_searchText_2188 = "nDW!M1hlc%&:Q;*5LAQ.";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Document o_handlesUnclosedAnchors_mg19_mg910__11 = doc.clone();
        Elements o_handlesUnclosedAnchors_mg19_mg910_mg6025__15 = o_handlesUnclosedAnchors_mg19__8.getElementsContainingText(__DSPOT_searchText_2188);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg910_mg6025__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg861_mg4495_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_1504 = "cpyX B4#[iU>[Cg29[$s";
            String __DSPOT_html_272 = "cWj+V2ku8d[w[zx>weSc";
            String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
            Element o_handlesUnclosedAnchors_mg29_mg861__12 = o_handlesUnclosedAnchors_mg29__8.prepend(__DSPOT_html_272);
            o_handlesUnclosedAnchors_mg29__8.getElementsMatchingText(__DSPOT_regex_1504);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg29_mg861_mg4495 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: cpyX B4#[iU>[Cg29[$s", expected.getMessage());
        }
    }
}

