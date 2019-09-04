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
    public void multiChildDescent_mg54_mg8196_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_3285 = "[8#:^u&K+n5QOj/[1:?f";
            String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
            Document doc = Jsoup.parse(h);
            Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
            int o_multiChildDescent_mg54__6 = els.size();
            String o_multiChildDescent_mg54__7 = els.first().tagName();
            Element o_multiChildDescent_mg54__9 = els.last();
            o_multiChildDescent_mg54__9.getElementsMatchingText(__DSPOT_regex_3285);
            org.junit.Assert.fail("multiChildDescent_mg54_mg8196 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg21_mg1246_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_407 = "8(ZIeS+<WVL=#l&[/PX=";
            String __DSPOT_tagName_0 = "/|]6^FT)-ef&bk*201yC";
            String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
            Document doc = Jsoup.parse(h);
            Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
            int o_multiChildDescent_mg21__7 = els.size();
            String o_multiChildDescent_mg21__8 = els.first().tagName();
            Element o_multiChildDescent_mg21__10 = doc.createElement(__DSPOT_tagName_0);
            o_multiChildDescent_mg21__10.getElementsMatchingOwnText(__DSPOT_regex_407);
            org.junit.Assert.fail("multiChildDescent_mg21_mg1246 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg21_mg1221() throws Exception {
        String __DSPOT_value_393 = "u#4>|U.0@;Uwg0xDDFQ*";
        String __DSPOT_key_392 = "}XY] &yec*mAg]:d>pQ#";
        String __DSPOT_tagName_0 = "/|]6^FT)-ef&bk*201yC";
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg21__7 = els.size();
        String o_multiChildDescent_mg21__8 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg21__8);
        Element o_multiChildDescent_mg21__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_multiChildDescent_mg21_mg1221__19 = o_multiChildDescent_mg21__10.getElementsByAttributeValueNot(__DSPOT_key_392, __DSPOT_value_393);
        Assert.assertFalse(o_multiChildDescent_mg21_mg1221__19.isEmpty());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals("a", o_multiChildDescent_mg21__8);
    }

    @Test(timeout = 10000)
    public void multiChildDescent_mg31_mg2872_mg29514() throws Exception {
        String __DSPOT_keyPrefix_12611 = ":%$,<=.*9xi3&y/s 9k=";
        String __DSPOT_tagName_1081 = "&%O&O# !AVh-ucrypaDZ";
        String __DSPOT_text_2 = "*OdwpauR%h1,xavU[1Rv";
        String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        Document doc = Jsoup.parse(h);
        Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        Assert.assertFalse(els.isEmpty());
        int o_multiChildDescent_mg31__7 = els.size();
        String o_multiChildDescent_mg31__8 = els.first().tagName();
        Assert.assertEquals("a", o_multiChildDescent_mg31__8);
        Element o_multiChildDescent_mg31__10 = doc.text(__DSPOT_text_2);
        Element o_multiChildDescent_mg31_mg2872__18 = o_multiChildDescent_mg31__10.appendElement(__DSPOT_tagName_1081);
        Elements o_multiChildDescent_mg31_mg2872_mg29514__22 = o_multiChildDescent_mg31__10.getElementsByAttributeStarting(__DSPOT_keyPrefix_12611);
        Assert.assertTrue(o_multiChildDescent_mg31_mg2872_mg29514__22.isEmpty());
        Assert.assertFalse(els.isEmpty());
        Assert.assertEquals("a", o_multiChildDescent_mg31__8);
    }
}

