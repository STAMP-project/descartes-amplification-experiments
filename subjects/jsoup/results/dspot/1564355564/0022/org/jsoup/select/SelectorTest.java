package org.jsoup.select;


import java.util.Collection;
import java.util.Set;
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
    public void testSupportsLeadingCombinator_mg71() throws Exception {
        String __DSPOT_text_9 = "><6ycw,-c^.vZ(8(U^r,";
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg71__10 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg71__10)));
        String o_testSupportsLeadingCombinator_mg71__11 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg71__11);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg71__21 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg71__21);
        Element o_testSupportsLeadingCombinator_mg71__22 = p.appendText(__DSPOT_text_9);
        Assert.assertFalse(((Collection) (((Element) (o_testSupportsLeadingCombinator_mg71__22)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg71__22)).hasText());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg71__22)).isBlock());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg71__22)).hasParent());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg71__10)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg71__11);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg71__21);
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
    public void testSupportsLeadingCombinator_mg82_mg17687() throws Exception {
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg82__9 = spans.size();
        String o_testSupportsLeadingCombinator_mg82__10 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg82__10);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg82__20 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg82__20);
        Set<String> o_testSupportsLeadingCombinator_mg82__21 = p.classNames();
        Document o_testSupportsLeadingCombinator_mg82_mg17687__30 = doc.normalise();
        Assert.assertFalse(((Collection) (((Document) (o_testSupportsLeadingCombinator_mg82_mg17687__30)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (o_testSupportsLeadingCombinator_mg82_mg17687__30)).isBlock());
        Assert.assertFalse(((Document) (o_testSupportsLeadingCombinator_mg82_mg17687__30)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <div id=\"2\">\n    <div id=\"3\"></div>\n   </div>\n  </div>\n </body>\n</html>", ((Document) (o_testSupportsLeadingCombinator_mg82_mg17687__30)).toString());
        Assert.assertFalse(((Document) (o_testSupportsLeadingCombinator_mg82_mg17687__30)).hasParent());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg82__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg82__20);
    }
}

