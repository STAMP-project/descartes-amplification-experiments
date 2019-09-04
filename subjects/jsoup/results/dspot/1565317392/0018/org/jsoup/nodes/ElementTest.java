package org.jsoup.nodes;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Parser;
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
    public void testPrependNewHtml_rv216() throws Exception {
        String __DSPOT_searchText_120 = ">[A}8/o#n)B( ^qB(Yas";
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
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv216__19 = __DSPOT_invoc_5.getElementsContainingText(__DSPOT_searchText_120);
        Assert.assertTrue(o_testPrependNewHtml_rv216__19.isEmpty());
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
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv217() throws Exception {
        String __DSPOT_regex_121 = "Z%ds TuK*Yo^mgdhAD^|";
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
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv217__19 = __DSPOT_invoc_5.getElementsMatchingOwnText(__DSPOT_regex_121);
        Assert.assertFalse(o_testPrependNewHtml_rv217__19.isEmpty());
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
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg39() throws Exception {
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
        Element o_testPrependNewHtml_mg39__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg39__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg39__5)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Document o_testPrependNewHtml_mg39__16 = doc.normalise();
        Assert.assertTrue(((Document) (o_testPrependNewHtml_mg39__16)).hasText());
        Assert.assertFalse(((Collection) (((Document) (o_testPrependNewHtml_mg39__16)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (o_testPrependNewHtml_mg39__16)).isBlock());
        Assert.assertFalse(((Document) (o_testPrependNewHtml_mg39__16)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (o_testPrependNewHtml_mg39__16)).toString());
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
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg39__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg39__5)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg80() throws Exception {
        String __DSPOT_valueSuffix_26 = "JVt2Y][1u)p]QM-k,I]-";
        String __DSPOT_key_25 = "J*J8r}4@(!YL#ZQsb>_1";
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
        Element o_testPrependNewHtml_mg80__7 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg80__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg80__7)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg80__18 = div.getElementsByAttributeValueEnding(__DSPOT_key_25, __DSPOT_valueSuffix_26);
        Assert.assertTrue(o_testPrependNewHtml_mg80__18.isEmpty());
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
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg80__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg80__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg80__7)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg89() throws Exception {
        String __DSPOT_searchText_38 = "s%=])JWOM_4gdsL9rC)A";
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
        Element o_testPrependNewHtml_mg89__6 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg89__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg89__6)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg89__17 = div.getElementsContainingOwnText(__DSPOT_searchText_38);
        Assert.assertTrue(o_testPrependNewHtml_mg89__17.isEmpty());
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
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg89__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg89__6)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg79() throws Exception {
        String __DSPOT_match_24 = "^t lGvSzxk?Yw`yc.L`H";
        String __DSPOT_key_23 = ":wkJ!][,J^uy}s#6CE3#";
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
        Element o_testPrependNewHtml_mg79__7 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg79__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg79__7)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg79__18 = div.getElementsByAttributeValueContaining(__DSPOT_key_23, __DSPOT_match_24);
        Assert.assertTrue(o_testPrependNewHtml_mg79__18.isEmpty());
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
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg79__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg79__7)).toString());
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

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv228_mg18611() throws Exception {
        int __DSPOT_index_9424 = -1176009544;
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Element o_testPrependNewHtml_rv228__18 = __DSPOT_invoc_5.lastElementSibling();
        Assert.assertNull(o_testPrependNewHtml_rv228__18);
        Elements o_testPrependNewHtml_rv228_mg18611__22 = __DSPOT_invoc_5.getElementsByIndexEquals(__DSPOT_index_9424);
        Assert.assertTrue(o_testPrependNewHtml_rv228_mg18611__22.isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertNull(o_testPrependNewHtml_rv228__18);
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_add7_mg57635_failAssert0() throws Exception {
        try {
            int __DSPOT_index_28695 = -1284411158;
            Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
            Element div = doc.getElementById("1");
            Element o_testPrependNewHtml_add7__5 = div.prepend("<p>there</p><p>now</p>");
            TextUtil.stripNewlines(div.html());
            Elements ps = doc.select("p");
            int o_testPrependNewHtml_add7__11 = ps.size();
            for (int i = 0; i < (ps.size()); i++) {
            }
            ps.eq(__DSPOT_index_28695);
            org.junit.Assert.fail("testPrependNewHtml_add7_mg57635 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1284411158", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv179_mg25174_failAssert0() throws Exception {
        try {
            int __DSPOT_index_12558 = -2098903525;
            String __DSPOT_text_90 = "R-2-=M,.G+$]g)e+[it&";
            Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
            Element div = doc.getElementById("1");
            Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
            TextUtil.stripNewlines(div.html());
            Elements ps = doc.select("p");
            for (int i = 0; i < (ps.size()); i++) {
            }
            Element o_testPrependNewHtml_rv179__19 = __DSPOT_invoc_5.appendText(__DSPOT_text_90);
            ps.eq(__DSPOT_index_12558);
            org.junit.Assert.fail("testPrependNewHtml_rv179_mg25174 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg120_mg59332() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg120__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg120__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg120__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg120__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg120__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg120__5)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        String o_testPrependNewHtml_mg120__16 = div.text();
        Assert.assertEquals("there now Hello", o_testPrependNewHtml_mg120__16);
        Parser o_testPrependNewHtml_mg120_mg59332__21 = doc.parser();
        Assert.assertFalse(((Parser) (o_testPrependNewHtml_mg120_mg59332__21)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testPrependNewHtml_mg120_mg59332__21)).getErrors())).isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg120__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg120__5)).isBlock());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg120__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg120__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg120__5)).toString());
        Assert.assertEquals("there now Hello", o_testPrependNewHtml_mg120__16);
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv223_mg42855() throws Exception {
        String __DSPOT_value_21325 = "&t^G4.^uVl,qvw/D!w7b";
        String __DSPOT_key_21324 = "o8&H[3z>;@.!*[%Dt]41";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        String o_testPrependNewHtml_rv223__18 = __DSPOT_invoc_5.id();
        Assert.assertEquals("1", o_testPrependNewHtml_rv223__18);
        Elements o_testPrependNewHtml_rv223_mg42855__23 = __DSPOT_invoc_5.getElementsByAttributeValueNot(__DSPOT_key_21324, __DSPOT_value_21325);
        Assert.assertFalse(o_testPrependNewHtml_rv223_mg42855__23.isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertEquals("1", o_testPrependNewHtml_rv223__18);
    }
}

