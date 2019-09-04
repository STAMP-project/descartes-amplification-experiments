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
    public void testSupportsLeadingCombinator_mg216() throws Exception {
        String __DSPOT_match_105 = "i]w!maZJcf{Y<x-zr2#$";
        String __DSPOT_key_104 = "3(,uc,zul%aS[T]e_+S#";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg216__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg216__11)));
        String o_testSupportsLeadingCombinator_mg216__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg216__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg216__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg216__22);
        Elements o_testSupportsLeadingCombinator_mg216__23 = div.getElementsByAttributeValueContaining(__DSPOT_key_104, __DSPOT_match_105);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg216__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg216__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg216__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg216__22);
    }

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
    public void testSupportsLeadingCombinator_mg94() throws Exception {
        String __DSPOT_keyPrefix_20 = "zxk?Yw`yc.L`HJ*J8r}4";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg94__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg94__10)));
        String o_testSupportsLeadingCombinator_mg94__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg94__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg94__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg94__21);
        Elements o_testSupportsLeadingCombinator_mg94__22 = p.getElementsByAttributeStarting(__DSPOT_keyPrefix_20);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg94__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg94__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg94__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg94__21);
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
    public void testSupportsLeadingCombinator_mg218() throws Exception {
        String __DSPOT_regex_109 = "3F[UUbDcpS ]x;K>tB$@";
        String __DSPOT_key_108 = "a&4Bc{vs!b(f2kvd|>op";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg218__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg218__11)));
        String o_testSupportsLeadingCombinator_mg218__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg218__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg218__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg218__22);
        Elements o_testSupportsLeadingCombinator_mg218__23 = div.getElementsByAttributeValueMatching(__DSPOT_key_108, __DSPOT_regex_109);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg218__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg218__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg218__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg218__22);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg108() throws Exception {
        String __DSPOT_regex_40 = "Nw]f4QDhB+ _ 2&pb?56";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg108__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg108__10)));
        String o_testSupportsLeadingCombinator_mg108__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg108__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg108__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg108__21);
        Elements o_testSupportsLeadingCombinator_mg108__22 = p.getElementsMatchingOwnText(__DSPOT_regex_40);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg108__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg108__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg108__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg108__21);
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
    public void testSupportsLeadingCombinator_mg156() throws Exception {
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg156__9 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg156__9)));
        String o_testSupportsLeadingCombinator_mg156__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg156__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg156__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg156__20);
        Element o_testSupportsLeadingCombinator_mg156__21 = spans.first();
        Assert.assertFalse(((Element) (o_testSupportsLeadingCombinator_mg156__21)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testSupportsLeadingCombinator_mg156__21)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg156__21)).hasText());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg156__21)).hasParent());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg156__9)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg156__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg156__20);
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

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg237_mg47921() throws Exception {
        String __DSPOT_searchText_24475 = "8`qKIo!I@)3}ssQHmx2{";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg237__9 = spans.size();
        String o_testSupportsLeadingCombinator_mg237__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg237__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg237__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg237__20);
        Element o_testSupportsLeadingCombinator_mg237__21 = div.lastElementSibling();
        Elements o_testSupportsLeadingCombinator_mg237_mg47921__31 = div.getElementsContainingOwnText(__DSPOT_searchText_24475);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg237_mg47921__31.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg237__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg237__20);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg222_mg51424_mg127940() throws Exception {
        String __DSPOT_regex_66168 = "<N|k!O61Kr,4#]7#78UI";
        int __DSPOT_index_115 = -346099135;
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg222__10 = spans.size();
        String o_testSupportsLeadingCombinator_mg222__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg222__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg222__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg222__21);
        Elements o_testSupportsLeadingCombinator_mg222__22 = div.getElementsByIndexEquals(__DSPOT_index_115);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg222__22.isEmpty());
        String o_testSupportsLeadingCombinator_mg222_mg51424__31 = div.tagName();
        Assert.assertEquals("div", o_testSupportsLeadingCombinator_mg222_mg51424__31);
        Elements o_testSupportsLeadingCombinator_mg222_mg51424_mg127940__35 = p.getElementsMatchingText(__DSPOT_regex_66168);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg222_mg51424_mg127940__35.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg222__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg222__21);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg222__22.isEmpty());
        Assert.assertEquals("div", o_testSupportsLeadingCombinator_mg222_mg51424__31);
    }
}

