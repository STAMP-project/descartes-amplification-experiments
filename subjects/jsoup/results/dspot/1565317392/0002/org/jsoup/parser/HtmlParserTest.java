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
    public void handlesUnclosedAnchors_mg20_mg618() throws Exception {
        String __DSPOT_regex_113 = "R0oQx`#S=-MZ,LBX]bck";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Elements o_handlesUnclosedAnchors_mg20_mg618__11 = o_handlesUnclosedAnchors_mg20__7.getElementsMatchingOwnText(__DSPOT_regex_113);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg618__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1167_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_343 = "mv:!>93C($5iQ0^E:LLN";
            String __DSPOT_key_342 = "$Om%r}]!fp]_{`wHUXG?";
            String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
            o_handlesUnclosedAnchors_mg19__8.getElementsByAttributeValueMatching(__DSPOT_key_342, __DSPOT_regex_343);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg19_mg1167 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: mv:!>93C($5iQ0^E:LLN", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg712_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_178 = "Hk}gtiFW>G16*{0]q(s_";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            Element o_handlesUnclosedAnchors_add3__5 = doc.body();
            doc.body().html();
            o_handlesUnclosedAnchors_add3__5.getElementsMatchingOwnText(__DSPOT_regex_178);
            org.junit.Assert.fail("handlesUnclosedAnchors_add3_mg712 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: Hk}gtiFW>G16*{0]q(s_", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg719() throws Exception {
        String __DSPOT_keyPrefix_183 = "i?X[& 8gq5Uc]J 37NN)";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg719__11 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeStarting(__DSPOT_keyPrefix_183);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg16_mg719__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1178_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_356 = "?$PpS(_B8Y[|DN0`h+q|";
            String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
            String h = "<a href='http://example.com/'>Link<p>Error link</a>";
            Document doc = Jsoup.parse(h);
            String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
            doc.body().html();
            Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
            o_handlesUnclosedAnchors_mg19__8.getElementsMatchingText(__DSPOT_regex_356);
            org.junit.Assert.fail("handlesUnclosedAnchors_mg19_mg1178 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: ?$PpS(_B8Y[|DN0`h+q|", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg29_mg762() throws Exception {
        int __DSPOT_index_229 = 1697900587;
        String __DSPOT_text_2 = "`l V!3a(!.#b{[Iz>YSe";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg29__8 = doc.text(__DSPOT_text_2);
        Elements o_handlesUnclosedAnchors_mg29_mg762__12 = o_handlesUnclosedAnchors_mg29__8.getElementsByIndexEquals(__DSPOT_index_229);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg29_mg762__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg19_mg1176() throws Exception {
        String __DSPOT_searchText_354 = "Szx;1Mv&[ATOn+!znTd=";
        String __DSPOT_tagName_0 = "avU[1Rvnj|}8wu]&8(Dg";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg19__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesUnclosedAnchors_mg19_mg1176__12 = o_handlesUnclosedAnchors_mg19__8.getElementsContainingText(__DSPOT_searchText_354);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg19_mg1176__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg16_mg734() throws Exception {
        String __DSPOT_valuePrefix_197 = "]6^Tc.QTdw$*mg?5HyBm";
        String __DSPOT_key_195 = "XugatR#qBIyo=C)[DU@7";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg16__7 = doc.body();
        Elements o_handlesUnclosedAnchors_mg16_mg734__12 = o_handlesUnclosedAnchors_mg16__7.getElementsByAttributeValueStarting(__DSPOT_key_195, __DSPOT_valuePrefix_197);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg16_mg734__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg20_mg498_mg13933() throws Exception {
        String __DSPOT_valueSuffix_5890 = ";9$S5,9Yq`Jd&h:`3UUJ";
        String __DSPOT_key_5889 = ">P6{`t5_>SO?KGjBr6Sm";
        boolean __DSPOT_attributeValue_62 = true;
        String __DSPOT_attributeKey_61 = "Jcf{Y<x-zr2#$hDLf,#+";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Element o_handlesUnclosedAnchors_mg20__7 = doc.head();
        Element o_handlesUnclosedAnchors_mg20_mg498__12 = o_handlesUnclosedAnchors_mg20__7.attr(__DSPOT_attributeKey_61, __DSPOT_attributeValue_62);
        Elements o_handlesUnclosedAnchors_mg20_mg498_mg13933__17 = o_handlesUnclosedAnchors_mg20_mg498__12.getElementsByAttributeValueEnding(__DSPOT_key_5889, __DSPOT_valueSuffix_5890);
        Assert.assertTrue(o_handlesUnclosedAnchors_mg20_mg498_mg13933__17.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg821_mg19291() throws Exception {
        String __DSPOT_searchText_8394 = ">+t{l=jk!|:0do:]Z#kk";
        String __DSPOT_className_252 = "}YexJ,;oHv!Lb^R/Cg|3";
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        doc.body().html();
        Element o_handlesUnclosedAnchors_add3_mg821__11 = o_handlesUnclosedAnchors_add3__5.removeClass(__DSPOT_className_252);
        Elements o_handlesUnclosedAnchors_add3_mg821_mg19291__15 = o_handlesUnclosedAnchors_add3_mg821__11.getElementsContainingOwnText(__DSPOT_searchText_8394);
        Assert.assertTrue(o_handlesUnclosedAnchors_add3_mg821_mg19291__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_add3_mg698_mg15445() throws Exception {
        String __DSPOT_value_6552 = "d}lX2mg%:]PSx3P>TEa`";
        String __DSPOT_key_6551 = "Fxa?dn3/DA@/[:hOxu%B";
        int __DSPOT_index_171 = 66886070;
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        doc.body().html();
        Elements o_handlesUnclosedAnchors_add3_mg698__11 = o_handlesUnclosedAnchors_add3__5.getElementsByIndexLessThan(__DSPOT_index_171);
        Elements o_handlesUnclosedAnchors_add3_mg698_mg15445__16 = o_handlesUnclosedAnchors_add3__5.getElementsByAttributeValueNot(__DSPOT_key_6551, __DSPOT_value_6552);
        Assert.assertFalse(o_handlesUnclosedAnchors_add3_mg698_mg15445__16.isEmpty());
    }
}

