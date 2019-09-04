package org.jsoup.parser;


import java.util.Collection;
import java.util.regex.Pattern;
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
    public void handlesUnclosedAnchors_mg20_mg949() throws Exception {
        String __DSPOT_valueSuffix_259 = "uK=:[kK]A!BJ>|;uK1dA";
        String __DSPOT_key_258 = "$>(xx8O:>9?$i8hdx3(]";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg949__12 = o_handlesUnclosedAnchors_mg20__7.getElementsByAttributeValueEnding(__DSPOT_key_258, __DSPOT_valueSuffix_259);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg949__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg948() throws Exception {
        String __DSPOT_match_257 = "bzLSgsM<P2/c-44h!,y)";
        String __DSPOT_key_256 = "OskRx;om6_QO0c5a.U(&";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg948__12 = o_handlesUnclosedAnchors_mg20__7.getElementsByAttributeValueContaining(__DSPOT_key_256, __DSPOT_match_257);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg948__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg716() throws Exception {
        Pattern __DSPOT_pattern_109 = null;
        String __DSPOT_key_108 = "=zq=$5-^b!lcEWMHUZo@";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg716__13 = o_handlesUnclosedAnchors_mg29__8.getElementsByAttributeValueMatching(__DSPOT_key_108, __DSPOT_pattern_109);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg716__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg830() throws Exception {
        String __DSPOT_valuePrefix_180 = "O$YaM)]&FgYicpi).(9M";
        String __DSPOT_key_179 = "UN)AU$4HgD@uUId=zIrf";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        doc.body().html();
        Elements o_handlesUnclosedAnchors_add3_mg830__12 = o_handlesUnclosedAnchors_add3__5.getElementsByAttributeValueStarting(__DSPOT_key_179, __DSPOT_valuePrefix_180);
        Assert.assertTrue(o_handlesUnclosedAnchors_add3_mg830__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg854() throws Exception {
        String __DSPOT_searchText_193 = "n#S4@x6*]1I5%}^%8%Xw";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        doc.body().html();
        Elements o_handlesUnclosedAnchors_add3_mg854__11 = o_handlesUnclosedAnchors_add3__5.getElementsContainingText(__DSPOT_searchText_193);
        Assert.assertTrue(o_handlesUnclosedAnchors_add3_mg854__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg855() throws Exception {
        String __DSPOT_regex_194 = "`vTP_Hc!|LEXFzv4>O+j";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        doc.body().html();
        Elements o_handlesUnclosedAnchors_add3_mg855__11 = o_handlesUnclosedAnchors_add3__5.getElementsMatchingOwnText(__DSPOT_regex_194);
        Assert.assertTrue(o_handlesUnclosedAnchors_add3_mg855__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1242() throws Exception {
        String __DSPOT_searchText_360 = "f2=X^4<N|/U4Y/4LsTv2";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1242__12 = o_handlesUnclosedAnchors_mg19__8.getElementsContainingOwnText(__DSPOT_searchText_360);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1242__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1232() throws Exception {
        int __DSPOT_index_356 = 1017867440;
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1232__12 = o_handlesUnclosedAnchors_mg19__8.getElementsByIndexEquals(__DSPOT_index_356);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1232__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg952() throws Exception {
        String __DSPOT_value_263 = "WP/q=qf@xV4RP-Rlv;5Z";
        String __DSPOT_key_262 = "dXo/B!IcY}7hT0[e!2k?";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg952__12 = o_handlesUnclosedAnchors_mg20__7.getElementsByAttributeValueNot(__DSPOT_key_262, __DSPOT_value_263);
        Assert.assertFalse(o_handlesUnclosedAnchors_mg20_mg952__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg18_mg304_mg8531_failAssert0() throws Exception {
        try {
            int __DSPOT_index_3305 = -1868847533;
            String __DSPOT_text_22 = "ftS}%g/mS6TE0=.J($16";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Document o_handlesUnclosedAnchors_mg18__7 = doc.clone();
            Element o_handlesUnclosedAnchors_mg18_mg304__11 = o_handlesUnclosedAnchors_mg18__7.text(__DSPOT_text_22);
            o_handlesUnclosedAnchors_mg18_mg304__11.child(__DSPOT_index_3305);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg18_mg304_mg8531 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1868847533", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_literalMutationString774_mg7362_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_2868 = "[,]|Xhjx((i@Rk:*7aA!";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "]5u=^+Op(XM{CFmTeGhyCnQJS`<Loz}GR7y7[ooB+&I;BFkxyr;t]&]!vbNw8.:<e2op^cl&xZn2X00Sj5ra4M8l+l";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
            o_handlesUnclosedAnchors_mg20__7.getElementsMatchingText(__DSPOT_regex_2868);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg20_literalMutationString774_mg7362 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: [,]|Xhjx((i@Rk:*7aA!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_add728_mg3727() throws Exception {
        String __DSPOT_keyPrefix_1124 = "[Yph8C_yF,D0i<z^?X]a";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_mg20_add728__5 = doc.body();
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_add728_mg3727__14 = o_handlesUnclosedAnchors_mg20_add728__5.getElementsByAttributeStarting(__DSPOT_keyPrefix_1124);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_add728_mg3727__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1283_mg19067_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_8306 = ",C;3f&hiI&()%[Eq.r*;";
            String __DSPOT_key_8305 = "6zG y}fa.c:+3^gcvm] ";
            String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
            String o_handlesUnclosedAnchors_mg19_mg1283__11 = o_handlesUnclosedAnchors_mg19__8.nodeName();
            o_handlesUnclosedAnchors_mg19__8.getElementsByAttributeValueMatching(__DSPOT_key_8305, __DSPOT_regex_8306);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg19_mg1283_mg19067 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: ,C;3f&hiI&()%[Eq.r*;", expected.getMessage());
        }
    }
}

