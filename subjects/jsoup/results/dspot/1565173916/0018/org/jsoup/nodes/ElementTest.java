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
    public void testPrependNewHtml_mg83() throws Exception {
        String __DSPOT_valuePrefix_32 = "_*s>).BmtV)2[gaNZ#S&";
        String __DSPOT_key_31 = "{l>^r@)C1RND7C-6y}W`";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg83__7 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg83__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg83__7)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg83__18 = div.getElementsByAttributeValueStarting(__DSPOT_key_31, __DSPOT_valuePrefix_32);
        Assert.assertTrue(o_testPrependNewHtml_mg83__18.isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg83__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg83__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg83__7)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv206() throws Exception {
        String __DSPOT_valueSuffix_107 = "T/V7TZG5qmr`1s$.raz`";
        String __DSPOT_key_106 = ";uS9b&r5!GQi?`Oiw0F]";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv206__20 = __DSPOT_invoc_5.getElementsByAttributeValueEnding(__DSPOT_key_106, __DSPOT_valueSuffix_107);
        Assert.assertTrue(o_testPrependNewHtml_rv206__20.isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv217() throws Exception {
        String __DSPOT_regex_121 = "Z%ds TuK*Yo^mgdhAD^|";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv217__19 = __DSPOT_invoc_5.getElementsMatchingOwnText(__DSPOT_regex_121);
        Assert.assertFalse(o_testPrependNewHtml_rv217__19.isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv203() throws Exception {
        String __DSPOT_keyPrefix_101 = "o^DZks#P][B@BafG1>V9";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv203__19 = __DSPOT_invoc_5.getElementsByAttributeStarting(__DSPOT_keyPrefix_101);
        Assert.assertTrue(o_testPrependNewHtml_rv203__19.isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg39() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg39__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg39__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg39__5)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Document o_testPrependNewHtml_mg39__16 = doc.normalise();
        Assert.assertFalse(((Document) (o_testPrependNewHtml_mg39__16)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_testPrependNewHtml_mg39__16)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testPrependNewHtml_mg39__16)).hasText());
        Assert.assertFalse(((Document) (o_testPrependNewHtml_mg39__16)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (o_testPrependNewHtml_mg39__16)).toString());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg39__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg39__5)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg89() throws Exception {
        String __DSPOT_searchText_38 = "s%=])JWOM_4gdsL9rC)A";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg89__6 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg89__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg89__6)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg89__17 = div.getElementsContainingOwnText(__DSPOT_searchText_38);
        Assert.assertTrue(o_testPrependNewHtml_mg89__17.isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg89__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg89__6)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg89__6)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg79() throws Exception {
        String __DSPOT_match_24 = "^t lGvSzxk?Yw`yc.L`H";
        String __DSPOT_key_23 = ":wkJ!][,J^uy}s#6CE3#";
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg79__7 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg79__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg79__7)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_mg79__18 = div.getElementsByAttributeValueContaining(__DSPOT_key_23, __DSPOT_match_24);
        Assert.assertTrue(o_testPrependNewHtml_mg79__18.isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg79__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg79__7)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg79__7)).toString());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_rv211() throws Exception {
        int __DSPOT_index_115 = 1887375197;
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element __DSPOT_invoc_5 = div.prepend("<p>there</p><p>now</p>");
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Elements o_testPrependNewHtml_rv211__19 = __DSPOT_invoc_5.getElementsByIndexEquals(__DSPOT_index_115);
        Assert.assertTrue(o_testPrependNewHtml_rv211__19.isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
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
    public void testPrependNewHtml_mg43() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Element o_testPrependNewHtml_mg43__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg43__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg43__5)).toString());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Parser o_testPrependNewHtml_mg43__16 = doc.parser();
        Assert.assertFalse(((Parser) (o_testPrependNewHtml_mg43__16)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testPrependNewHtml_mg43__16)).getErrors())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg43__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasParent());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg43__5)).toString());
    }
}

