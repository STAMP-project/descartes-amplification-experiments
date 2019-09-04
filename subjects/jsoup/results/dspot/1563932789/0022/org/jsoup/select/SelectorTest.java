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
    public void testSupportsLeadingCombinator_mg72() throws Exception {
        Element __DSPOT_parent_10 = new Element("p9Flz5*yC=M]:bMoV#NG");
        String h = "<div><p><span>One</span><span>Two</span></p></div>";
        Document doc = Jsoup.parse(h);
        Element p = doc.select("div > p").first();
        Elements spans = p.select("> span");
        Assert.assertFalse(spans.isEmpty());
        int o_testSupportsLeadingCombinator_mg72__11 = spans.size();
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg72__11)));
        String o_testSupportsLeadingCombinator_mg72__12 = spans.first().text();
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg72__12);
        h = "<div id=1><div id=2><div id=3></div></div></div>";
        doc = Jsoup.parse(h);
        Element div = doc.select("div").select(" > div").first();
        String o_testSupportsLeadingCombinator_mg72__22 = div.id();
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg72__22);
        Element o_testSupportsLeadingCombinator_mg72__23 = p.appendTo(__DSPOT_parent_10);
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg72__23)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testSupportsLeadingCombinator_mg72__23)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg72__23)).hasText());
        Assert.assertTrue(((Element) (o_testSupportsLeadingCombinator_mg72__23)).hasParent());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg72__11)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg72__12);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg72__22);
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
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <div id=\"2\">\n    <div id=\"3\"></div>\n   </div>\n  </div>\n </body>\n</html>", ((Document) (o_testSupportsLeadingCombinator_mg56__21)).toString());
        Assert.assertFalse(((Document) (o_testSupportsLeadingCombinator_mg56__21)).hasParent());
        Assert.assertFalse(spans.isEmpty());
        Assert.assertEquals(2, ((int) (o_testSupportsLeadingCombinator_mg56__9)));
        Assert.assertEquals("One", o_testSupportsLeadingCombinator_mg56__10);
        Assert.assertEquals("2", o_testSupportsLeadingCombinator_mg56__20);
    }
}

