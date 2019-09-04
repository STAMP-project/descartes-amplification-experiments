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
    public void handlesUnclosedAnchors_mg19_mg1269() throws Exception {
        int __DSPOT_index_357 = -808495006;
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1269__12 = o_handlesUnclosedAnchors_mg19__8.getElementsByIndexEquals(__DSPOT_index_357);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1269__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg817_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_158 = " {%=kav)LA|PjLTh9Ov(";
            String __DSPOT_key_157 = "d38%J6lBV@1{ @{#Lk#?";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            Element o_handlesUnclosedAnchors_add3__5 = doc.body();
            doc.body().html();
            o_handlesUnclosedAnchors_add3__5.getElementsByAttributeValueMatching(__DSPOT_key_157, __DSPOT_regex_158);
            org.junit.Assert.fail("handlesUnclosedAnchors_add3_mg817 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error:  {%=kav)LA|PjLTh9Ov(", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg905() throws Exception {
        String __DSPOT_valueSuffix_240 = "ku8d[w[zx>weSco;ly|y";
        String __DSPOT_key_239 = "A<.:Gw_1nfNsEocWj+V2";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg905__12 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeValueEnding(__DSPOT_key_239, __DSPOT_valueSuffix_240);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg16_mg905__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg933() throws Exception {
        String __DSPOT_valuePrefix_248 = "skRx;om6_QO0c5a.U(&b";
        String __DSPOT_key_247 = "Nc$=$JI<B[&L]p+q/>@O";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg933__12 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeValueStarting(__DSPOT_key_247, __DSPOT_valuePrefix_248);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg16_mg933__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg955_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_270 = "(B1ohN#bUwM2fXs,Xbq-";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
            o_handlesUnclosedAnchors_mg16__7.getElementsMatchingText(__DSPOT_regex_270);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg16_mg955 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: (B1ohN#bUwM2fXs,Xbq-", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1222_mg18230() throws Exception {
        String __DSPOT_keyPrefix_7919 = "u7}V gLr<$hK((#DWdGs";
        String __DSPOT_text_322 = ")#ztti*@ku$Om%r}]!fp";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Element o_handlesUnclosedAnchors_mg19_mg1222__12 = doc.text(__DSPOT_text_322);
        Elements o_handlesUnclosedAnchors_mg19_mg1222_mg18230__16 = o_handlesUnclosedAnchors_mg19__8.getElementsByAttributeStarting(__DSPOT_keyPrefix_7919);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1222_mg18230__16.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg933_mg16733_failAssert0() throws Exception {
        try {
            int __DSPOT_index_7243 = -749915522;
            String __DSPOT_valuePrefix_248 = "skRx;om6_QO0c5a.U(&b";
            String __DSPOT_key_247 = "Nc$=$JI<B[&L]p+q/>@O";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
            Elements o_handlesUnclosedAnchors_mg16_mg933__12 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeValueStarting(__DSPOT_key_247, __DSPOT_valuePrefix_248);
            o_handlesUnclosedAnchors_mg16__7.child(__DSPOT_index_7243);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg16_mg933_mg16733 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-749915522", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg958_mg18242() throws Exception {
        String __DSPOT_searchText_7936 = "Y2QH0VN4pxR_qn|P9&xy";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Element o_handlesUnclosedAnchors_mg20_mg958__10 = o_handlesUnclosedAnchors_mg20__7.nextElementSibling();
        Elements o_handlesUnclosedAnchors_mg20_mg958_mg18242__14 = o_handlesUnclosedAnchors_mg20_mg958__10.getElementsContainingOwnText(__DSPOT_searchText_7936);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg958_mg18242__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg958_mg15957() throws Exception {
        String __DSPOT_regex_6886 = "n_*9TAn;zF&%8JEkt`}e";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Element o_handlesUnclosedAnchors_mg20_mg958__10 = o_handlesUnclosedAnchors_mg20__7.nextElementSibling();
        Elements o_handlesUnclosedAnchors_mg20_mg958_mg15957__14 = o_handlesUnclosedAnchors_mg20__7.getElementsMatchingOwnText(__DSPOT_regex_6886);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg958_mg15957__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg32_mg485_mg8550() throws Exception {
        String __DSPOT_value_3362 = ",t>jQ@5]Uzmk&1jeRI|<";
        String __DSPOT_key_3361 = ";ZnqL_RsyphY7bv]]u7H";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        boolean o_handlesUnclosedAnchors_mg32__7 = doc.updateMetaCharsetElement();
        Element o_handlesUnclosedAnchors_mg32_mg485__10 = doc.body();
        Elements o_handlesUnclosedAnchors_mg32_mg485_mg8550__15 = o_handlesUnclosedAnchors_mg32_mg485__10.getElementsByAttributeValueNot(__DSPOT_key_3361, __DSPOT_value_3362);
        Assert.assertFalse(o_handlesUnclosedAnchors_mg32_mg485_mg8550__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg998_mg11570() throws Exception {
        String __DSPOT_searchText_4821 = "6C[FARTo]Qzll P]>`X{";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        String o_handlesUnclosedAnchors_mg29_mg998__11 = o_handlesUnclosedAnchors_mg29__8.wholeText();
        Assert.assertEquals("`l V!3a(!.#b{[Iz>YSe", o_handlesUnclosedAnchors_mg29_mg998__11);
        Elements o_handlesUnclosedAnchors_mg29_mg998_mg11570__15 = o_handlesUnclosedAnchors_mg29__8.getElementsContainingText(__DSPOT_searchText_4821);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg998_mg11570__15.isEmpty());
        Assert.assertEquals("`l V!3a(!.#b{[Iz>YSe", o_handlesUnclosedAnchors_mg29_mg998__11);
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_literalMutationString441_mg17242() throws Exception {
        String __DSPOT_match_7506 = "eAOgE_(?i<7B_-o!IlcK";
        String __DSPOT_key_7505 = "YJ):gTlYZ<1#WIGhPoTz";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = ".K}Mjm5t1& yMN`s;U{R IF%j!9gwX1[[en#R7RXkugQ}vhH&a[&sg2R8>3aX.)v8-E+,N[v<l2kvDr1FoAgu-u1_)";
        Assert.assertEquals(".K}Mjm5t1& yMN`s;U{R IF%j!9gwX1[[en#R7RXkugQ}vhH&a[&sg2R8>3aX.)v8-E+,N[v<l2kvDr1FoAgu-u1_)", want);
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_literalMutationString441_mg17242__12 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeValueContaining(__DSPOT_key_7505, __DSPOT_match_7506);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg16_literalMutationString441_mg17242__12.isEmpty());
        Assert.assertEquals(".K}Mjm5t1& yMN`s;U{R IF%j!9gwX1[[en#R7RXkugQ}vhH&a[&sg2R8>3aX.)v8-E+,N[v<l2kvDr1FoAgu-u1_)", want);
    }
}

