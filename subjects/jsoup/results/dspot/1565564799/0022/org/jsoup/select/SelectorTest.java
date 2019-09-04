package org.jsoup.select;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.MultiLocaleRule;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;


public class SelectorTest {
    @Rule
    public MultiLocaleRule rule = new MultiLocaleRule();

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg96() throws Exception {
        String __DSPOT_match_24 = "4oK[>Va&1`i[aMe!@y;s";
        String __DSPOT_key_23 = "V@1wly$),bA%.UJum&)<";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg96__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg96__11)));
        String o_testSupportsLeadingCombinator_mg96__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg96__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg96__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg96__22);
        Elements o_testSupportsLeadingCombinator_mg96__23 = p.getElementsByAttributeValueContaining(__DSPOT_key_23, __DSPOT_match_24);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg96__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg96__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg96__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg96__22);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg226() throws Exception {
        String __DSPOT_searchText_119 = "[s/`d!f[bVJU01<aFOWR";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg226__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg226__10)));
        String o_testSupportsLeadingCombinator_mg226__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg226__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg226__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg226__21);
        Elements o_testSupportsLeadingCombinator_mg226__22 = div.getElementsContainingOwnText(__DSPOT_searchText_119);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg226__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg226__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg226__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg226__21);
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
    public void testSupportsLeadingCombinator_mg219() throws Exception {
        String __DSPOT_value_111 = "[_EdB`v*a[[KUdhw0!nn";
        String __DSPOT_key_110 = "7*v3E3{w[&<Aihc:4mdp";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg219__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg219__11)));
        String o_testSupportsLeadingCombinator_mg219__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg219__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg219__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg219__22);
        Elements o_testSupportsLeadingCombinator_mg219__23 = div.getElementsByAttributeValueNot(__DSPOT_key_110, __DSPOT_value_111);
        Assert.assertFalse(o_testSupportsLeadingCombinator_mg219__23.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg219__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg219__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg219__22);
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
    public void testSupportsLeadingCombinator_mg163() throws Exception {
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg163__9 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg163__9)));
        String o_testSupportsLeadingCombinator_mg163__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg163__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg163__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg163__20);
        Element o_testSupportsLeadingCombinator_mg163__21 = spans.last();
        Assert.assertFalse(((Collection) (((Element) (o_testSupportsLeadingCombinator_mg163__21)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg163__21)).hasText());
        Assert.assertFalse(((Element) (o_testSupportsLeadingCombinator_mg163__21)).isBlock());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg163__21)).hasParent());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg163__9)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg163__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg163__20);
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

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg91_mg23602() throws Exception {
        String __DSPOT_regex_11772 = "O=k.,CpBH,&CTQomxnFt";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg91__9 = spans.size();
        String o_testSupportsLeadingCombinator_mg91__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg91__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg91__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg91__20);
        Element o_testSupportsLeadingCombinator_mg91__21 = p.firstElementSibling();
        Elements o_testSupportsLeadingCombinator_mg91_mg23602__31 = div.getElementsMatchingText(__DSPOT_regex_11772);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg91_mg23602__31.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg91__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg91__20);
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg68_mg17886_failAssert0() throws Exception {
        try {
            int __DSPOT_index_8830 = -1062419849;
            String __DSPOT_html_6 = "$XdYQ7-#sa<}t>?]?7gc";
            String h = "<div><p><span>One</span><span>Two</span></p></div>";
            Document doc = Jsoup.parse(h);
            Element p = doc.select("div > p").first();
            Elements spans = p.select("> span");
            int o_testSupportsLeadingCombinator_mg68__10 = spans.size();
            String o_testSupportsLeadingCombinator_mg68__11 = spans.first().text();
            h = "<div id=1><div id=2><div id=3></div></div></div>";
            doc = Jsoup.parse(h);
            Element div = doc.select("div").select(" > div").first();
            String o_testSupportsLeadingCombinator_mg68__21 = div.id();
            Element o_testSupportsLeadingCombinator_mg68__22 = p.after(__DSPOT_html_6);
            spans.eq(__DSPOT_index_8830);
            org.junit.Assert.fail("testSupportsLeadingCombinator_mg68_mg17886 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1062419849", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg219_mg1312_mg63893_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_32122 = "V)]1`ZIe1B;O[[/tlO{)";
            String __DSPOT_key_32121 = "!f+]3@$zdN[_IBRZPfx4";
            int __DSPOT_index_296 = 119966038;
            String __DSPOT_value_111 = "[_EdB`v*a[[KUdhw0!nn";
            String __DSPOT_key_110 = "7*v3E3{w[&<Aihc:4mdp";
            String h = "<div><p><span>One</span><span>Two</span></p></div>";
            Document doc = Jsoup.parse(h);
            Element p = doc.select("div > p").first();
            Elements spans = p.select("> span");
            int o_testSupportsLeadingCombinator_mg219__11 = spans.size();
            String o_testSupportsLeadingCombinator_mg219__12 = spans.first().text();
            h = "<div id=1><div id=2><div id=3></div></div></div>";
            doc = Jsoup.parse(h);
            Element div = doc.select("div").select(" > div").first();
            String o_testSupportsLeadingCombinator_mg219__22 = div.id();
            Elements o_testSupportsLeadingCombinator_mg219__23 = div.getElementsByAttributeValueNot(__DSPOT_key_110, __DSPOT_value_111);
            Elements o_testSupportsLeadingCombinator_mg219_mg1312__33 = p.getElementsByIndexGreaterThan(__DSPOT_index_296);
            p.getElementsByAttributeValueMatching(__DSPOT_key_32121, __DSPOT_regex_32122);
            org.junit.Assert.fail("testSupportsLeadingCombinator_mg219_mg1312_mg63893 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testSupportsLeadingCombinator_mg196_mg42188_mg120498() throws Exception {
        int __DSPOT_index_21358 = -2066727476;
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg196__9 = spans.size();
        String o_testSupportsLeadingCombinator_mg196__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg196__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg196__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg196__20);
        String o_testSupportsLeadingCombinator_mg196__21 = div.baseUri();
        Assert.assertEquals("", o_testSupportsLeadingCombinator_mg196__21);
        Elements o_testSupportsLeadingCombinator_mg196_mg42188__31 = div.getElementsByIndexGreaterThan(__DSPOT_index_21358);
        Assert.assertFalse(o_testSupportsLeadingCombinator_mg196_mg42188__31.isEmpty());
        Parser o_testSupportsLeadingCombinator_mg196_mg42188_mg120498__34 = doc.parser();
        Assert.assertFalse(((Parser) (o_testSupportsLeadingCombinator_mg196_mg42188_mg120498__34)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSupportsLeadingCombinator_mg196_mg42188_mg120498__34)).getErrors())).isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg196__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg196__20);
        Assert.assertEquals("", o_testSupportsLeadingCombinator_mg196__21);
        Assert.assertFalse(o_testSupportsLeadingCombinator_mg196_mg42188__31.isEmpty());
    }
}

