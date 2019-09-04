package org.jsoup.select;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.MultiLocaleRule;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;


public class SelectorTest {
    @Rule
    public MultiLocaleRule rule = new MultiLocaleRule();

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg227() throws Exception {
        String __DSPOT_searchText_120 = "C/$oDWlo<Yu0]keSCJZq";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg227__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg227__10)));
        String o_testSupportsLeadingCombinator_mg227__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg227__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg227__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg227__21);
        Elements o_testSupportsLeadingCombinator_mg227__22 = div.getElementsContainingText(__DSPOT_searchText_120);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg227__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg227__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg227__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg227__21);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg214() throws Exception {
        String __DSPOT_keyPrefix_101 = "l,IK)Mo+)A*O^;uS9b&r";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg214__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg214__10)));
        String o_testSupportsLeadingCombinator_mg214__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg214__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg214__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg214__21);
        Elements o_testSupportsLeadingCombinator_mg214__22 = div.getElementsByAttributeStarting(__DSPOT_keyPrefix_101);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg214__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg214__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg214__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg214__21);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg98_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_28 = "mtV)2[gaNZ#S&Gu4*{9G";
            String __DSPOT_key_27 = "C1RND7C-6y}W`_*s>).B";
            String h = "<div><p><span>One</span><span>Two</span></p></div>";
            Document doc = Jsoup.parse(h);
            Element p = doc.select("div > p").first();
            Elements spans = p.select("> span");
            spans.size();
            spans.first().text();
            h = "<div id=1><div id=2><div id=3></div></div></div>";
            doc = Jsoup.parse(h);
            Element div = doc.select("div").select(" > div").first();
            div.id();
            p.getElementsByAttributeValueMatching(__DSPOT_key_27, __DSPOT_regex_28);
            org.junit.Assert.fail("testSupportsLeadingCombinator_mg98 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: mtV)2[gaNZ#S&Gu4*{9G", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg228_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_121 = "W<Z|&oob]U)GU|GC>>@9";
            String h = "<div><p><span>One</span><span>Two</span></p></div>";
            Document doc = Jsoup.parse(h);
            Element p = doc.select("div > p").first();
            Elements spans = p.select("> span");
            spans.size();
            spans.first().text();
            h = "<div id=1><div id=2><div id=3></div></div></div>";
            doc = Jsoup.parse(h);
            Element div = doc.select("div").select(" > div").first();
            div.id();
            div.getElementsMatchingOwnText(__DSPOT_regex_121);
            org.junit.Assert.fail("testSupportsLeadingCombinator_mg228 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: W<Z|&oob]U)GU|GC>>@9", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg99() throws Exception {
        String __DSPOT_value_30 = "=u eShD9P/&h4]]s%=])";
        String __DSPOT_key_29 = "i}cRQHCH3r6EO;&FZRy/";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg99__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg99__11)));
        String o_testSupportsLeadingCombinator_mg99__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg99__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg99__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg99__22);
        Elements o_testSupportsLeadingCombinator_mg99__23 = p.getElementsByAttributeValueNot(__DSPOT_key_29, __DSPOT_value_30);
        Assert.assertFalse(o_testSupportsLeadingCombinator_mg99__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg99__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg99__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg99__22);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_literalMutationString18() throws Exception {
        String h = "<div><p><span>One</pan><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_literalMutationString18__9 = spans.size();
        Assert.assertEquals(1, ((int) (o_testSupportsLeadingCombinator_literalMutationString18__9)));
        String o_testSupportsLeadingCombinator_literalMutationString18__10 = spans.first().text();
        Assert.assertEquals("OneTwo", o_testSupportsLeadingCombinator_literalMutationString18__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_literalMutationString18__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_literalMutationString18__20);
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(1, ((int) (o_testSupportsLeadingCombinator_literalMutationString18__9)));
        Assert.assertEquals("OneTwo", o_testSupportsLeadingCombinator_literalMutationString18__10);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg97() throws Exception {
        String __DSPOT_valueSuffix_26 = "K5WR{oE1L&q_{{l>^r@)";
        String __DSPOT_key_25 = "?/OCDfviVTx>DODA!L#v";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg97__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg97__11)));
        String o_testSupportsLeadingCombinator_mg97__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg97__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg97__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg97__22);
        Elements o_testSupportsLeadingCombinator_mg97__23 = p.getElementsByAttributeValueEnding(__DSPOT_key_25, __DSPOT_valueSuffix_26);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg97__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg97__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg97__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg97__22);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg229_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_122 = "%$tKd!o7n&%5]#&n[!M}";
            String h = "<div><p><span>One</span><span>Two</span></p></div>";
            Document doc = Jsoup.parse(h);
            Element p = doc.select("div > p").first();
            Elements spans = p.select("> span");
            spans.size();
            spans.first().text();
            h = "<div id=1><div id=2><div id=3></div></div></div>";
            doc = Jsoup.parse(h);
            Element div = doc.select("div").select(" > div").first();
            div.id();
            div.getElementsMatchingText(__DSPOT_regex_122);
            org.junit.Assert.fail("testSupportsLeadingCombinator_mg229 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: %$tKd!o7n&%5]#&n[!M}", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg222() throws Exception {
        int __DSPOT_index_115 = -346099135;
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg222__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg222__10)));
        String o_testSupportsLeadingCombinator_mg222__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg222__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg222__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg222__21);
        Elements o_testSupportsLeadingCombinator_mg222__22 = div.getElementsByIndexEquals(__DSPOT_index_115);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg222__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg222__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg222__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg222__21);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg70() throws Exception {
        String __DSPOT_tagName_8 = "C*+{5@T5!^MYU(dM7KJ&";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg70__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg70__10)));
        String o_testSupportsLeadingCombinator_mg70__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg70__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg70__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg70__21);
        Element o_testSupportsLeadingCombinator_mg70__22 = p.appendElement(__DSPOT_tagName_8);
        Assert.assertFalse(((Element) (o_testSupportsLeadingCombinator_mg70__22)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testSupportsLeadingCombinator_mg70__22)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_testSupportsLeadingCombinator_mg70__22)).hasText());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg70__22)).hasParent());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg70__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg70__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg70__21);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg220() throws Exception {
        String __DSPOT_valuePrefix_113 = "8/o#n)B( ^qB(YasZ%ds";
        String __DSPOT_key_112 = "rtG]LM{a}Xj*`gmH>[A}";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg220__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg220__11)));
        String o_testSupportsLeadingCombinator_mg220__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg220__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg220__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg220__22);
        Elements o_testSupportsLeadingCombinator_mg220__23 = div.getElementsByAttributeValueStarting(__DSPOT_key_112, __DSPOT_valuePrefix_113);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg220__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg220__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg220__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg220__22);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg231_mg60517() throws Exception {
        String __DSPOT_searchText_30831 = "AL[Mp.Tme$-D3{H ;v[X";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg231__9 = spans.size();
        String o_testSupportsLeadingCombinator_mg231__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg231__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg231__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg231__20);
        div.html();
        Elements o_testSupportsLeadingCombinator_mg231_mg60517__29 = p.getElementsContainingOwnText(__DSPOT_searchText_30831);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg231_mg60517__29.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg231__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg231__20);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg145_mg12843() throws Exception {
        String __DSPOT_match_6218 = "@g`U5h%FCo$.yLsV[%s8";
        String __DSPOT_key_6217 = "{zbSy?kS]2Mrc1OKNn2G";
        String __DSPOT_className_60 = "UhLoAf#)/AY^(qL7}kh?";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg145__10 = spans.size();
        String o_testSupportsLeadingCombinator_mg145__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg145__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg145__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg145__21);
        Elements o_testSupportsLeadingCombinator_mg145__22 = spans.addClass(__DSPOT_className_60);
        Assert.assertFalse(o_testSupportsLeadingCombinator_mg145__22.isEmpty());
        Elements o_testSupportsLeadingCombinator_mg145_mg12843__33 = p.getElementsByAttributeValueContaining(__DSPOT_key_6217, __DSPOT_match_6218);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg145_mg12843__33.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg145__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg145__21);
        Assert.assertFalse(o_testSupportsLeadingCombinator_mg145__22.isEmpty());
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg176_literalMutationString18772_mg71779() throws Exception {
        String __DSPOT_regex_36334 = "MXltP5DRpt;UyC?Vi@_W";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg176__9 = spans.size();
        String o_testSupportsLeadingCombinator_mg176__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg176__10);
        h = "<div id=1><div id=2><div id=3></div></div*</div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg176__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg176__20);
        Elements o_testSupportsLeadingCombinator_mg176__21 = spans.remove();
        Assert.assertFalse(o_testSupportsLeadingCombinator_mg176__21.isEmpty());
        Elements o_testSupportsLeadingCombinator_mg176_literalMutationString18772_mg71779__31 = p.getElementsMatchingOwnText(__DSPOT_regex_36334);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg176_literalMutationString18772_mg71779__31.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg176__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg176__20);
        Assert.assertFalse(o_testSupportsLeadingCombinator_mg176__21.isEmpty());
    }
}

