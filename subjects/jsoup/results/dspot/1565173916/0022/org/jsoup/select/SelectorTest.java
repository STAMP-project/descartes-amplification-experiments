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
    public void testSupportsLeadingCombinator_mg109_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_41 = "TtKz.F5M(E@of6;bU#J;";
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
            p.getElementsMatchingText(__DSPOT_regex_41);
            org.junit.Assert.fail("testSupportsLeadingCombinator_mg109 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: TtKz.F5M(E@of6;bU#J;", expected.getMessage());
        }
    }

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
    public void testSupportsLeadingCombinator_mg60() throws Exception {
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg60__9 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg60__9)));
        String o_testSupportsLeadingCombinator_mg60__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg60__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg60__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg60__20);
        Parser o_testSupportsLeadingCombinator_mg60__21 = doc.parser();
        Assert.assertFalse(((Parser) (o_testSupportsLeadingCombinator_mg60__21)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSupportsLeadingCombinator_mg60__21)).getErrors())).isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg60__9)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg60__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg60__20);
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
    public void testSupportsLeadingCombinator_mg56() throws Exception {
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg56__9 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg56__9)));
        String o_testSupportsLeadingCombinator_mg56__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg56__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg56__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg56__20);
        Document o_testSupportsLeadingCombinator_mg56__21 = doc.normalise();
        Assert.assertFalse(((Document) (o_testSupportsLeadingCombinator_mg56__21)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_testSupportsLeadingCombinator_mg56__21)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (o_testSupportsLeadingCombinator_mg56__21)).hasText());
        Assert.assertFalse(((Document) (o_testSupportsLeadingCombinator_mg56__21)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <div id=\"2\">\n    <div id=\"3\"></div>\n   </div>\n  </div>\n </body>\n</html>", ((Document) (o_testSupportsLeadingCombinator_mg56__21)).toString());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg56__9)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg56__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg56__20);
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
    public void testSupportsLeadingCombinator_mg102() throws Exception {
        int __DSPOT_index_34 = -1060450426;
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg102__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg102__10)));
        String o_testSupportsLeadingCombinator_mg102__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg102__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg102__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg102__21);
        Elements o_testSupportsLeadingCombinator_mg102__22 = p.getElementsByIndexEquals(__DSPOT_index_34);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg102__22.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg102__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg102__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg102__21);
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
    public void testSupportsLeadingCombinator_mg240_mg4784() throws Exception {
        String __DSPOT_regex_2121 = ".SD9gG3pX#MpZ3Gyj&5z";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg240__9 = spans.size();
        String o_testSupportsLeadingCombinator_mg240__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg240__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg240__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg240__20);
        String o_testSupportsLeadingCombinator_mg240__21 = div.nodeName();
        Assert.assertEquals("div", o_testSupportsLeadingCombinator_mg240__21);
        Elements o_testSupportsLeadingCombinator_mg240_mg4784__31 = div.getElementsMatchingText(__DSPOT_regex_2121);
        Assert.assertTrue(o_testSupportsLeadingCombinator_mg240_mg4784__31.isEmpty());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg240__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg240__20);
        Assert.assertEquals("div", o_testSupportsLeadingCombinator_mg240__21);
    }
}

