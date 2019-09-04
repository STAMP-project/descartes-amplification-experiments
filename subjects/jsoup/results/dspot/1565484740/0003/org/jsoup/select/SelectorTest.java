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
        Assert.assertFalse(((Document) (o_multiChildDescent_mg25__9)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"foo\">\n   <h1 class=\"bar\"><a href=\"http://example.com/\">One</a></h1>\n  </div>\n </body>\n</html>", ((Document) (o_multiChildDescent_mg25__9)).toString());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg25__6)));
        Assert.assertEquals("a", o_multiChildDescent_mg25__7);
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg46_failAssert0() throws Exception {
        try {
            int __DSPOT_index_13 = -1060307497;
            String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
            Document doc = Jsoup.parse(h);
            Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
            els.size();
            els.first().tagName();
            els.eq(__DSPOT_index_13);
            org.junit.Assert.fail("multiChildDescent_mg46 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1060307497", expected.getMessage());
        }
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

    @Test(timeout = 10000)
    public void multiChildDescent_mg22_mg1620_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_596 = "A[9J}3aHlOoQ#mQuh<!T";
            String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
            Document doc = Jsoup.parse(h);
            Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
            int o_multiChildDescent_mg22__6 = els.size();
            String o_multiChildDescent_mg22__7 = els.first().tagName();
            Element o_multiChildDescent_mg22__9 = doc.head();
            o_multiChildDescent_mg22__9.getElementsMatchingText(__DSPOT_regex_596);
            org.junit.Assert.fail("multiChildDescent_mg22_mg1620 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: A[9J}3aHlOoQ#mQuh<!T", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg47_mg431_mg20830() throws Exception {
        String __DSPOT_value_8576 = "3#Dn.-4cJi^F@57R:!uO";
        String __DSPOT_key_8575 = "g^i;yza<,+]<0{Tcd?V)";
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg47__6 = els.size();
        String o_multiChildDescent_mg47__7 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg47__7);
        Element o_multiChildDescent_mg47__9 = els.first();
        Element o_multiChildDescent_mg47_mg431__16 = doc.body();
        Elements o_multiChildDescent_mg47_mg431_mg20830__21 = o_multiChildDescent_mg47_mg431__16.getElementsByAttributeValueNot(__DSPOT_key_8575, __DSPOT_value_8576);
        Assert.assertFalse(o_multiChildDescent_mg47_mg431_mg20830__21.isEmpty());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals("a", o_multiChildDescent_mg47__7);
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg54_mg8086_mg24530() throws Exception {
        String __DSPOT_keyPrefix_10194 = "R0cZSzS7X!qUF219`x2K";
        String __DSPOT_value_3175 = "P?rbS7vY]:odKi&i#plo";
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg54__6 = els.size();
        String o_multiChildDescent_mg54__7 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg54__7);
        Element o_multiChildDescent_mg54__9 = els.last();
        Element o_multiChildDescent_mg54_mg8086__17 = o_multiChildDescent_mg54__9.val(__DSPOT_value_3175);
        Elements o_multiChildDescent_mg54_mg8086_mg24530__21 = o_multiChildDescent_mg54__9.getElementsByAttributeStarting(__DSPOT_keyPrefix_10194);
        Assert.assertTrue(o_multiChildDescent_mg54_mg8086_mg24530__21.isEmpty());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals("a", o_multiChildDescent_mg54__7);
    }
}

