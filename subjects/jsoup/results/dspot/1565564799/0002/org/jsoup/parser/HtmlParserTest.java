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
    public void handlesUnclosedAnchors_mg16() throws Exception {
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_mg16__7)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedAnchors_mg16__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_mg16__7)).hasText());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_mg16__7)).hasParent());
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
    public void handlesUnclosedAnchors_mg29_mg788() throws Exception {
        String __DSPOT_searchText_163 = "37NN)HAw,R/t[:&/Q%ha";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg788__12 = o_handlesUnclosedAnchors_mg29__8.getElementsContainingText(__DSPOT_searchText_163);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg788__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg806() throws Exception {
        String __DSPOT_regex_180 = "&j=|H&S:leb1;bIVLt3n";
        String __DSPOT_key_179 = "6_1*349DE!mrYdu#?a@W";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        doc.body().html();
        Elements o_handlesUnclosedAnchors_add3_mg806__12 = o_handlesUnclosedAnchors_add3__5.getElementsByAttributeValueMatching(__DSPOT_key_179, __DSPOT_regex_180);
        Assert.assertTrue(o_handlesUnclosedAnchors_add3_mg806__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg1105() throws Exception {
        String __DSPOT_keyPrefix_281 = "EoA3yxe0!W)bfl&TZ>Pi";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg1105__11 = o_handlesUnclosedAnchors_mg20__7.getElementsByAttributeStarting(__DSPOT_keyPrefix_281);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg1105__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1387() throws Exception {
        String __DSPOT_regex_389 = "!Z*x7Dr ^3DNX#dEme<K";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1387__12 = o_handlesUnclosedAnchors_mg19__8.getElementsMatchingText(__DSPOT_regex_389);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1387__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg27_mg1211() throws Exception {
        int __DSPOT_maxErrors_336 = 2143815591;
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Parser o_handlesUnclosedAnchors_mg27__7 = doc.parser();
        Assert.assertFalse(((Parser) (o_handlesUnclosedAnchors_mg27__7)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesUnclosedAnchors_mg27__7)).getErrors())).isEmpty());
        Parser o_handlesUnclosedAnchors_mg27_mg1211__11 = o_handlesUnclosedAnchors_mg27__7.setTrackErrors(__DSPOT_maxErrors_336);
        Assert.assertTrue(((Parser) (o_handlesUnclosedAnchors_mg27_mg1211__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesUnclosedAnchors_mg27_mg1211__11)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_handlesUnclosedAnchors_mg27__7)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesUnclosedAnchors_mg27__7)).getErrors())).isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1376_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_376 = ";Uwg0xDDFQ*2sc[c&=M-";
            String __DSPOT_key_375 = "*mAg]:d>pQ#u#4>|U.0@";
            String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
            o_handlesUnclosedAnchors_mg19__8.getElementsByAttributeValueMatching(__DSPOT_key_375, __DSPOT_regex_376);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg19_mg1376 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: ;Uwg0xDDFQ*2sc[c&=M-", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg770() throws Exception {
        int __DSPOT_index_155 = -1602599220;
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg770__12 = o_handlesUnclosedAnchors_mg29__8.getElementsByIndexEquals(__DSPOT_index_155);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg770__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg1120() throws Exception {
        String __DSPOT_searchText_299 = "@DLF4dxe9d3L<Q[o@+ Y";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg1120__11 = o_handlesUnclosedAnchors_mg20__7.getElementsContainingOwnText(__DSPOT_searchText_299);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg1120__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg1107() throws Exception {
        String __DSPOT_match_285 = "yL.%h46! !iC)CcF+znA";
        String __DSPOT_key_284 = "IRaR1JHw:7h`I?]oGd[&";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg1107__12 = o_handlesUnclosedAnchors_mg20__7.getElementsByAttributeValueContaining(__DSPOT_key_284, __DSPOT_match_285);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg1107__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg759() throws Exception {
        String __DSPOT_value_147 = ">;YwP/8[Cozg$:>o/lW&";
        String __DSPOT_key_146 = ")v@[9ZFe]3#C6HvQ{7`[";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg759__12 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeValueNot(__DSPOT_key_146, __DSPOT_value_147);
        Assert.assertFalse(o_handlesUnclosedAnchors_mg16_mg759__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg796_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_167 = "DgX9`d38%J6lBV@1{ @{";
            String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
            o_handlesUnclosedAnchors_mg29__8.getElementsMatchingText(__DSPOT_regex_167);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg29_mg796 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg752() throws Exception {
        String __DSPOT_valueSuffix_133 = "RU|o[;[w&^[qeq[===)J";
        String __DSPOT_key_132 = "=,R/: .in5MN*PHXYTv{";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg752__13 = o_handlesUnclosedAnchors_mg29__8.getElementsByAttributeValueEnding(__DSPOT_key_132, __DSPOT_valueSuffix_133);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg752__13.isEmpty());
    }
}

