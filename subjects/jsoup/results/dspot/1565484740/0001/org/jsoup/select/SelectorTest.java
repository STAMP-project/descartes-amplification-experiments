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
    public void testPseudoLessThan_mg45() throws Exception {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        Elements ps = doc.select("div p:lt(2)");
        Assert.assertFalse(ps.isEmpty());
        int o_testPseudoLessThan_mg45__5 = ps.size();
        Assert.assertEquals(3, ((int) (o_testPseudoLessThan_mg45__5)));
        String o_testPseudoLessThan_mg45__6 = ps.get(0).text();
        Assert.assertEquals("One", o_testPseudoLessThan_mg45__6);
        String o_testPseudoLessThan_mg45__8 = ps.get(1).text();
        Assert.assertEquals("Two", o_testPseudoLessThan_mg45__8);
        String o_testPseudoLessThan_mg45__10 = ps.get(2).text();
        Assert.assertEquals("Four", o_testPseudoLessThan_mg45__10);
        Parser o_testPseudoLessThan_mg45__12 = doc.parser();
        Assert.assertFalse(((Parser) (o_testPseudoLessThan_mg45__12)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testPseudoLessThan_mg45__12)).getErrors())).isEmpty());
        Assert.assertFalse(ps.isEmpty());
        Assert.assertEquals(3, ((int) (o_testPseudoLessThan_mg45__5)));
        Assert.assertEquals("One", o_testPseudoLessThan_mg45__6);
        Assert.assertEquals("Two", o_testPseudoLessThan_mg45__8);
        Assert.assertEquals("Four", o_testPseudoLessThan_mg45__10);
    }

    @Test(timeout = 10000)
    public void testPseudoLessThan_mg63() throws Exception {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        Elements ps = doc.select("div p:lt(2)");
        Assert.assertFalse(ps.isEmpty());
        int o_testPseudoLessThan_mg63__5 = ps.size();
        Assert.assertEquals(3, ((int) (o_testPseudoLessThan_mg63__5)));
        String o_testPseudoLessThan_mg63__6 = ps.get(0).text();
        Assert.assertEquals("One", o_testPseudoLessThan_mg63__6);
        String o_testPseudoLessThan_mg63__8 = ps.get(1).text();
        Assert.assertEquals("Two", o_testPseudoLessThan_mg63__8);
        String o_testPseudoLessThan_mg63__10 = ps.get(2).text();
        Assert.assertEquals("Four", o_testPseudoLessThan_mg63__10);
        Element o_testPseudoLessThan_mg63__12 = ps.first();
        Assert.assertTrue(((Element) (o_testPseudoLessThan_mg63__12)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testPseudoLessThan_mg63__12)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_testPseudoLessThan_mg63__12)).hasText());
        Assert.assertTrue(((Element) (o_testPseudoLessThan_mg63__12)).hasParent());
        Assert.assertFalse(ps.isEmpty());
        Assert.assertEquals(3, ((int) (o_testPseudoLessThan_mg63__5)));
        Assert.assertEquals("One", o_testPseudoLessThan_mg63__6);
        Assert.assertEquals("Two", o_testPseudoLessThan_mg63__8);
        Assert.assertEquals("Four", o_testPseudoLessThan_mg63__10);
    }

    @Test(timeout = 10000)
    public void testPseudoLessThan_mg41() throws Exception {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        Elements ps = doc.select("div p:lt(2)");
        Assert.assertFalse(ps.isEmpty());
        int o_testPseudoLessThan_mg41__5 = ps.size();
        Assert.assertEquals(3, ((int) (o_testPseudoLessThan_mg41__5)));
        String o_testPseudoLessThan_mg41__6 = ps.get(0).text();
        Assert.assertEquals("One", o_testPseudoLessThan_mg41__6);
        String o_testPseudoLessThan_mg41__8 = ps.get(1).text();
        Assert.assertEquals("Two", o_testPseudoLessThan_mg41__8);
        String o_testPseudoLessThan_mg41__10 = ps.get(2).text();
        Assert.assertEquals("Four", o_testPseudoLessThan_mg41__10);
        Document o_testPseudoLessThan_mg41__12 = doc.normalise();
        Assert.assertFalse(((Document) (o_testPseudoLessThan_mg41__12)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_testPseudoLessThan_mg41__12)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testPseudoLessThan_mg41__12)).hasText());
        Assert.assertFalse(((Document) (o_testPseudoLessThan_mg41__12)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div>\n   <p>One</p>\n   <p>Two</p>\n   <p>Threep&gt;</p>\n  </div>\n  <div>\n   <p>Four</p>\n  </div>\n </body>\n</html>", ((Document) (o_testPseudoLessThan_mg41__12)).toString());
        Assert.assertFalse(ps.isEmpty());
        Assert.assertEquals(3, ((int) (o_testPseudoLessThan_mg41__5)));
        Assert.assertEquals("One", o_testPseudoLessThan_mg41__6);
        Assert.assertEquals("Two", o_testPseudoLessThan_mg41__8);
        Assert.assertEquals("Four", o_testPseudoLessThan_mg41__10);
    }
}

