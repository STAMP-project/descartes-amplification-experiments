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
    public void handlesUnclosedAnchors_mg29_mg788() throws Exception {
        String __DSPOT_keyPrefix_141 = "C6HvQ{7`[>;YwP/8[Coz";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg788__12 = o_handlesUnclosedAnchors_mg29__8.getElementsByAttributeStarting(__DSPOT_keyPrefix_141);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg788__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg862_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_204 = "w)`v}zN/0NJ?w/&c%+z9";
            String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
            o_handlesUnclosedAnchors_mg29__8.getElementsMatchingOwnText(__DSPOT_regex_204);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg29_mg862 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg967_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_266 = "aHOBe#(&QN9/*41o}!0W";
            String __DSPOT_key_264 = "=(1.&KgzF{f-R,!*%vs_";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
            o_handlesUnclosedAnchors_mg20__7.getElementsByAttributeValueMatching(__DSPOT_key_264, __DSPOT_regex_266);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg20_mg967 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1218() throws Exception {
        String __DSPOT_valueSuffix_341 = "omtcrFk4ZE5l*nekFG&,";
        String __DSPOT_key_340 = "p.-shPzN3[jz(>G,*Nw}";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1218__13 = o_handlesUnclosedAnchors_mg19__8.getElementsByAttributeValueEnding(__DSPOT_key_340, __DSPOT_valueSuffix_341);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1218__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg813() throws Exception {
        String __DSPOT_valuePrefix_166 = "^Tc.QTdw$*mg?5HyBm>H";
        String __DSPOT_key_165 = ",7q>6EK|ECO>A_paq1]6";
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg813__13 = o_handlesUnclosedAnchors_mg29__8.getElementsByAttributeValueStarting(__DSPOT_key_165, __DSPOT_valuePrefix_166);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg813__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg816() throws Exception {
        String __DSPOT_searchText_158 = "%=kav)LA|PjLTh9Ov(ZN";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg816__11 = o_handlesUnclosedAnchors_mg16__7.getElementsContainingOwnText(__DSPOT_searchText_158);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg16_mg816__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg818() throws Exception {
        String __DSPOT_searchText_159 = "fm1*o8iZ+g4 Y$jUSC<F";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg818__11 = o_handlesUnclosedAnchors_mg16__7.getElementsContainingText(__DSPOT_searchText_159);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg16_mg818__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg759() throws Exception {
        String __DSPOT_value_130 = "HXYTv{RU|o[;[w&^[qeq";
        String __DSPOT_key_129 = "LZ(B%Q=,R/: .in5MN*P";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg759__12 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeValueNot(__DSPOT_key_129, __DSPOT_value_130);
        Assert.assertFalse(o_handlesUnclosedAnchors_mg16_mg759__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_literalMutationString5_add161_mg8101() throws Exception {
        int __DSPOT_index_3161 = -1108860041;
        String h = "";
        Assert.assertEquals("", h);
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_literalMutationString5_add161__5 = doc.body();
        String o_handlesUnclosedAnchors_literalMutationString5__5 = doc.body().html();
        Assert.assertEquals("", o_handlesUnclosedAnchors_literalMutationString5__5);
        Elements o_handlesUnclosedAnchors_literalMutationString5_add161_mg8101__13 = o_handlesUnclosedAnchors_literalMutationString5_add161__5.getElementsByIndexEquals(__DSPOT_index_3161);
        Assert.assertTrue(o_handlesUnclosedAnchors_literalMutationString5_add161_mg8101__13.isEmpty());
        Assert.assertEquals("", h);
        Assert.assertEquals("", o_handlesUnclosedAnchors_literalMutationString5__5);
    }
}

