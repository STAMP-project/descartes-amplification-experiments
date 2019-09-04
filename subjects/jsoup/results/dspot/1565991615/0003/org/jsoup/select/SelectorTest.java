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
    public void multiChildDescent_mg22() throws Exception {
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg22__6 = els.size();
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg22__6)));
        String o_multiChildDescent_mg22__7 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg22__7);
        Element o_multiChildDescent_mg22__9 = doc.head();
        Assert.assertTrue(((Element) (o_multiChildDescent_mg22__9)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_multiChildDescent_mg22__9)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_multiChildDescent_mg22__9)).hasText());
        Assert.assertTrue(((Element) (o_multiChildDescent_mg22__9)).hasParent());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals(1, ((int) (o_multiChildDescent_mg22__6)));
        Assert.assertEquals("a", o_multiChildDescent_mg22__7);
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
    public void multiChildDescent_mg54_mg8018() throws Exception {
        int __DSPOT_index_3171 = 765924844;
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg54__6 = els.size();
        String o_multiChildDescent_mg54__7 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg54__7);
        Element o_multiChildDescent_mg54__9 = els.last();
        Elements o_multiChildDescent_mg54_mg8018__17 = o_multiChildDescent_mg54__9.getElementsByIndexEquals(__DSPOT_index_3171);
        Assert.assertTrue(o_multiChildDescent_mg54_mg8018__17.isEmpty());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals("a", o_multiChildDescent_mg54__7);
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg54_mg8042() throws Exception {
        String __DSPOT_searchText_3182 = "TvrIZ!%9nkbN? U85U1}";
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg54__6 = els.size();
        String o_multiChildDescent_mg54__7 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg54__7);
        Element o_multiChildDescent_mg54__9 = els.last();
        Elements o_multiChildDescent_mg54_mg8042__17 = o_multiChildDescent_mg54__9.getElementsContainingText(__DSPOT_searchText_3182);
        Assert.assertTrue(o_multiChildDescent_mg54_mg8042__17.isEmpty());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals("a", o_multiChildDescent_mg54__7);
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg31_mg3307_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_1285 = "iL^kHxY.TF__uT{/`ku{";
            String __DSPOT_text_2 = "*OdwpauR%h1,xavU[1Rv";
            String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
            Document doc = Jsoup.parse(h);
            Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
            int o_multiChildDescent_mg31__7 = els.size();
            String o_multiChildDescent_mg31__8 = els.first().tagName();
            Element o_multiChildDescent_mg31__10 = doc.text(__DSPOT_text_2);
            o_multiChildDescent_mg31__10.getElementsMatchingOwnText(__DSPOT_regex_1285);
            org.junit.Assert.fail("multiChildDescent_mg31_mg3307 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg21_mg1223() throws Exception {
        String __DSPOT_valueSuffix_396 = "ZW!0^5@t*xIh#U7W%TLW";
        String __DSPOT_key_395 = "hTHdr[&6G!S#|+j^,pi4";
        String __DSPOT_tagName_0 = "/|]6^FT)-ef&bk*201yC";
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg21__7 = els.size();
        String o_multiChildDescent_mg21__8 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg21__8);
        Element o_multiChildDescent_mg21__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_multiChildDescent_mg21_mg1223__19 = o_multiChildDescent_mg21__10.getElementsByAttributeValueEnding(__DSPOT_key_395, __DSPOT_valueSuffix_396);
        Assert.assertTrue(o_multiChildDescent_mg21_mg1223__19.isEmpty());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals("a", o_multiChildDescent_mg21__8);
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg49_add5310_mg34436_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_14687 = "}-{=|CZi,nm{Zc,fS|&&";
            String __DSPOT_key_14686 = " LCs_77,@.yooRIX[#X}";
            String __DSPOT_attributeKey_14 = "P&+YTN/#yO[*WW4JN-$n";
            String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
            Document doc = Jsoup.parse(h);
            Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
            int o_multiChildDescent_mg49__7 = els.size();
            Element o_multiChildDescent_mg49_add5310__10 = els.first();
            String o_multiChildDescent_mg49__8 = els.first().tagName();
            boolean o_multiChildDescent_mg49__10 = els.hasAttr(__DSPOT_attributeKey_14);
            o_multiChildDescent_mg49_add5310__10.getElementsByAttributeValueMatching(__DSPOT_key_14686, __DSPOT_regex_14687);
            org.junit.Assert.fail("multiChildDescent_mg49_add5310_mg34436 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: }-{=|CZi,nm{Zc,fS|&&", expected.getMessage());
        }
    }
}

