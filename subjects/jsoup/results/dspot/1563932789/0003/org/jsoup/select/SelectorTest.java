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
    public void multiChildDescent_mg47() throws Exception {
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg47__6 = els.size();
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg47__6)));
        String o_multiChildDescent_mg47__7 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg47__7);
        Element o_multiChildDescent_mg47__9 = els.first();
        Assert.assertFalse(((Element) (o_multiChildDescent_mg47__9)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_multiChildDescent_mg47__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_multiChildDescent_mg47__9)).hasText());
        Assert.assertTrue(((Element) (o_multiChildDescent_mg47__9)).hasParent());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg47__6)));
        Assert.assertEquals("a", o_multiChildDescent_mg47__7);
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg25() throws Exception {
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg25__6 = els.size();
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg25__6)));
        String o_multiChildDescent_mg25__7 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg25__7);
        Document o_multiChildDescent_mg25__9 = doc.normalise();
        Assert.assertFalse(((Document) (o_multiChildDescent_mg25__9)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_multiChildDescent_mg25__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_multiChildDescent_mg25__9)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"foo\">\n   <h1 class=\"bar\"><a href=\"http://example.com/\">One</a></h1>\n  </div>\n </body>\n</html>", ((Document) (o_multiChildDescent_mg25__9)).toString());
        Assert.assertFalse(((Document) (o_multiChildDescent_mg25__9)).hasParent());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg25__6)));
        Assert.assertEquals("a", o_multiChildDescent_mg25__7);
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg29() throws Exception {
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg29__6 = els.size();
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg29__6)));
        String o_multiChildDescent_mg29__7 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg29__7);
        Parser o_multiChildDescent_mg29__9 = doc.parser();
        Assert.assertFalse(((Parser) (o_multiChildDescent_mg29__9)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_multiChildDescent_mg29__9)).getErrors())).isEmpty());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg29__6)));
        Assert.assertEquals("a", o_multiChildDescent_mg29__7);
    }
}

