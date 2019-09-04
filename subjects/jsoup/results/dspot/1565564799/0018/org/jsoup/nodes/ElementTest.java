package org.jsoup.nodes;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;


public class ElementTest {
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

    @Test(timeout = 10000)
    public void testPrependNewHtml() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml__5)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml__5)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg83() throws Exception {
        String __DSPOT_valuePrefix_32 = "_*s>).BmtV)2[gaNZ#S&";
        String __DSPOT_key_31 = "{l>^r@)C1RND7C-6y}W`";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg83__7 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg83__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg83__7)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg83__18 = div.getElementsByAttributeValueStarting(__DSPOT_key_31, __DSPOT_valuePrefix_32);
        Assert.assertTrue(o_testPrependNewHtml_mg83__18.isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg83__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg83__7)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv216() throws Exception {
        String __DSPOT_searchText_120 = ">[A}8/o#n)B( ^qB(Yas";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv216__19 = __DSPOT_invoc_5.getElementsContainingText(__DSPOT_searchText_120);
        Assert.assertTrue(o_testPrependNewHtml_rv216__19.isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv215() throws Exception {
        String __DSPOT_searchText_119 = "0!nnrtG]LM{a}Xj*`gmH";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv215__19 = __DSPOT_invoc_5.getElementsContainingOwnText(__DSPOT_searchText_119);
        Assert.assertTrue(o_testPrependNewHtml_rv215__19.isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg39() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg39__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg39__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg39__5)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Document o_testPrependNewHtml_mg39__16 = doc.normalise();
        Assert.assertFalse(((Collection) (((Document) (o_testPrependNewHtml_mg39__16)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testPrependNewHtml_mg39__16)).hasText());
        Assert.assertFalse(((Document) (o_testPrependNewHtml_mg39__16)).isBlock());
        Assert.assertFalse(((Document) (o_testPrependNewHtml_mg39__16)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (o_testPrependNewHtml_mg39__16)).toString());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg39__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg39__5)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg80() throws Exception {
        String __DSPOT_valueSuffix_26 = "JVt2Y][1u)p]QM-k,I]-";
        String __DSPOT_key_25 = "J*J8r}4@(!YL#ZQsb>_1";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg80__7 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg80__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg80__7)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg80__18 = div.getElementsByAttributeValueEnding(__DSPOT_key_25, __DSPOT_valueSuffix_26);
        Assert.assertTrue(o_testPrependNewHtml_mg80__18.isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg80__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg80__7)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv207_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_109 = "T]e_+S#i]w!maZJcf{Y<";
            String __DSPOT_key_108 = "39dL#}_3(,uc,zul%aS[";
            Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
            Element div = doc.getElementById("1");
            Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
            TextUtil.stripNewlines(div.html());
            Elements ps = doc.select("p");
            for (int i = 0; i < (ps.size()); i++) {
            }
            __DSPOT_invoc_5.getElementsByAttributeValueMatching(__DSPOT_key_108, __DSPOT_regex_109);
            org.junit.Assert.fail("testPrependNewHtml_rv207 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: T]e_+S#i]w!maZJcf{Y<", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg79() throws Exception {
        String __DSPOT_match_24 = "^t lGvSzxk?Yw`yc.L`H";
        String __DSPOT_key_23 = ":wkJ!][,J^uy}s#6CE3#";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg79__7 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg79__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg79__7)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg79__18 = div.getElementsByAttributeValueContaining(__DSPOT_key_23, __DSPOT_match_24);
        Assert.assertTrue(o_testPrependNewHtml_mg79__18.isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg79__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg79__7)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg91_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_40 = ";?h(*fl<xJgehgad?HCt";
            Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
            Element div = doc.getElementById("1");
            div.prepend("<p>there</p><p>now</p>");
            TextUtil.stripNewlines(div.html());
            Elements ps = doc.select("p");
            for (int i = 0; i < (ps.size()); i++) {
            }
            div.getElementsMatchingOwnText(__DSPOT_regex_40);
            org.junit.Assert.fail("testPrependNewHtml_mg91 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: ;?h(*fl<xJgehgad?HCt", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg77() throws Exception {
        String __DSPOT_keyPrefix_20 = "DWP=,y4JV)d4}^w[&oDA";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg77__6 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg77__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg77__6)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg77__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg77__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg77__6)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg77__17 = div.getElementsByAttributeStarting(__DSPOT_keyPrefix_20);
        Assert.assertTrue(o_testPrependNewHtml_mg77__17.isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg77__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg77__6)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg77__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg77__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg77__6)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg92_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_41 = "1H=N6{+DN-eV8<Or;(?x";
            Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
            Element div = doc.getElementById("1");
            div.prepend("<p>there</p><p>now</p>");
            TextUtil.stripNewlines(div.html());
            Elements ps = doc.select("p");
            for (int i = 0; i < (ps.size()); i++) {
            }
            div.getElementsMatchingText(__DSPOT_regex_41);
            org.junit.Assert.fail("testPrependNewHtml_mg92 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 1H=N6{+DN-eV8<Or;(?x", expected.getMessage());
        }
    }
}

