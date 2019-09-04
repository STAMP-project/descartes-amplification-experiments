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
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Element o_testPrependNewHtml__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml__5)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasParent());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml__5)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml__5)).hasParent());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg39() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Element o_testPrependNewHtml_mg39__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg39__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg39__5)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasParent());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Document o_testPrependNewHtml_mg39__16 = doc.normalise();
        Assert.assertFalse(((Collection) (((Document) (o_testPrependNewHtml_mg39__16)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testPrependNewHtml_mg39__16)).hasText());
        Assert.assertFalse(((Document) (o_testPrependNewHtml_mg39__16)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (o_testPrependNewHtml_mg39__16)).toString());
        Assert.assertFalse(((Document) (o_testPrependNewHtml_mg39__16)).hasParent());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg39__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg39__5)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg39__5)).hasParent());
    }

    @Test(timeout = 10000)
    public void testPrependNewHtml_mg43() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.getElementById("1");
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Element o_testPrependNewHtml_mg43__5 = div.prepend("<p>there</p><p>now</p>");
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg43__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg43__5)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasParent());
        TextUtil.stripNewlines(div.html());
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Parser o_testPrependNewHtml_mg43__16 = doc.parser();
        Assert.assertFalse(((Parser) (o_testPrependNewHtml_mg43__16)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testPrependNewHtml_mg43__16)).getErrors())).isEmpty());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>there</p>\n   <p>now</p>\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (div)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertFalse(((Collection) (((Element) (o_testPrependNewHtml_mg43__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasText());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>there</p>\n <p>now</p>\n <p>Hello</p>\n</div>", ((Element) (o_testPrependNewHtml_mg43__5)).toString());
        Assert.assertTrue(((Element) (o_testPrependNewHtml_mg43__5)).hasParent());
    }
}

