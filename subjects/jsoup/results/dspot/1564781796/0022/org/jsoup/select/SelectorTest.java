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
    public void testSupportsLeadingCombinator_mg106() throws Exception {
        String __DSPOT_searchText_38 = "b%A@IY:Wo-9M/^zOCxu?";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg106__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg106__10)));
        String o_testSupportsLeadingCombinator_mg106__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg106__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg106__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg106__21);
        Elements o_testSupportsLeadingCombinator_mg106__22 = p.getElementsContainingOwnText(__DSPOT_searchText_38);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg106__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg106__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg106__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg106__21);
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
    public void testSupportsLeadingCombinator_literalMutationString15() throws Exception {
        String h = "<div><p><span>One</*pan><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_literalMutationString15__9 = spans.size();
        Assert.assertEquals(1, ((int) (o_testSupportsLeadingCombinator_literalMutationString15__9)));
        String o_testSupportsLeadingCombinator_literalMutationString15__10 = spans.first().text();
        Assert.assertEquals("OneTwo", o_testSupportsLeadingCombinator_literalMutationString15__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_literalMutationString15__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_literalMutationString15__20);
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(1, ((int) (o_testSupportsLeadingCombinator_literalMutationString15__9)));
        Assert.assertEquals("OneTwo", o_testSupportsLeadingCombinator_literalMutationString15__10);
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
    public void testSupportsLeadingCombinator_mg217() throws Exception {
        String __DSPOT_valueSuffix_107 = "QT)uukoMbx9bx>ua@F;_";
        String __DSPOT_key_106 = "hDLf,#+w{NUw]t2`oJKX";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg217__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg217__11)));
        String o_testSupportsLeadingCombinator_mg217__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg217__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg217__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg217__22);
        Elements o_testSupportsLeadingCombinator_mg217__23 = div.getElementsByAttributeValueEnding(__DSPOT_key_106, __DSPOT_valueSuffix_107);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg217__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg217__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg217__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg217__22);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg107() throws Exception {
        String __DSPOT_searchText_39 = "!rIXp5pNO|oPq,r5>K`H";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg107__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg107__10)));
        String o_testSupportsLeadingCombinator_mg107__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg107__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg107__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg107__21);
        Elements o_testSupportsLeadingCombinator_mg107__22 = p.getElementsContainingText(__DSPOT_searchText_39);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg107__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg107__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg107__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg107__21);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg53() throws Exception {
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg53__9 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg53__9)));
        String o_testSupportsLeadingCombinator_mg53__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg53__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg53__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg53__20);
        Element o_testSupportsLeadingCombinator_mg53__21 = doc.head();
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg53__21)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testSupportsLeadingCombinator_mg53__21)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_testSupportsLeadingCombinator_mg53__21)).hasText());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg53__21)).hasParent());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg53__9)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg53__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg53__20);
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
    public void testSupportsLeadingCombinator_mg100() throws Exception {
        String __DSPOT_valuePrefix_32 = "0xT!&b-W-(y_V1a;?h(*";
        String __DSPOT_key_31 = "JWOM_4gdsL9rC)A6fdF&";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg100__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg100__11)));
        String o_testSupportsLeadingCombinator_mg100__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg100__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg100__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg100__22);
        Elements o_testSupportsLeadingCombinator_mg100__23 = p.getElementsByAttributeValueStarting(__DSPOT_key_31, __DSPOT_valuePrefix_32);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg100__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg100__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg100__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg100__22);
    }
}

