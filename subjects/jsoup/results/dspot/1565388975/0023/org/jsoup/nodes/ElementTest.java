package org.jsoup.nodes;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;


public class ElementTest {
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

    @Test(timeout = 10000)
    public void testIs() throws Exception {
        String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element p = doc.select("p").first();
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        boolean o_testIs__7 = p.is("p");
        Assert.assertTrue(o_testIs__7);
        boolean o_testIs__8 = p.is("div");
        Assert.assertFalse(o_testIs__8);
        boolean o_testIs__9 = p.is("p:has(a)");
        Assert.assertTrue(o_testIs__9);
        boolean o_testIs__10 = p.is("p:first-child");
        Assert.assertTrue(o_testIs__10);
        boolean o_testIs__11 = p.is("p:last-child");
        Assert.assertFalse(o_testIs__11);
        boolean o_testIs__12 = p.is("*");
        Assert.assertTrue(o_testIs__12);
        boolean o_testIs__13 = p.is("div p");
        Assert.assertTrue(o_testIs__13);
        Element q = doc.select("p").last();
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        boolean o_testIs__17 = q.is("p");
        Assert.assertTrue(o_testIs__17);
        boolean o_testIs__18 = q.is("p ~ p");
        Assert.assertTrue(o_testIs__18);
        boolean o_testIs__19 = q.is("p + p");
        Assert.assertTrue(o_testIs__19);
        boolean o_testIs__20 = q.is("p:last-child");
        Assert.assertTrue(o_testIs__20);
        boolean o_testIs__21 = q.is("p a");
        Assert.assertFalse(o_testIs__21);
        boolean o_testIs__22 = q.is("a");
        Assert.assertFalse(o_testIs__22);
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        Assert.assertTrue(o_testIs__7);
        Assert.assertFalse(o_testIs__8);
        Assert.assertTrue(o_testIs__9);
        Assert.assertTrue(o_testIs__10);
        Assert.assertFalse(o_testIs__11);
        Assert.assertTrue(o_testIs__12);
        Assert.assertTrue(o_testIs__13);
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        Assert.assertTrue(o_testIs__17);
        Assert.assertTrue(o_testIs__18);
        Assert.assertTrue(o_testIs__19);
        Assert.assertTrue(o_testIs__20);
        Assert.assertFalse(o_testIs__21);
    }

    @Test(timeout = 10000)
    public void testIs_mg234() throws Exception {
        String __DSPOT_regex_95 = "cyHGP}8hoa-J!Pzx|999";
        String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element p = doc.select("p").first();
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        boolean o_testIs_mg234__8 = p.is("p");
        Assert.assertTrue(o_testIs_mg234__8);
        boolean o_testIs_mg234__9 = p.is("div");
        Assert.assertFalse(o_testIs_mg234__9);
        boolean o_testIs_mg234__10 = p.is("p:has(a)");
        Assert.assertTrue(o_testIs_mg234__10);
        boolean o_testIs_mg234__11 = p.is("p:first-child");
        Assert.assertTrue(o_testIs_mg234__11);
        boolean o_testIs_mg234__12 = p.is("p:last-child");
        Assert.assertFalse(o_testIs_mg234__12);
        boolean o_testIs_mg234__13 = p.is("*");
        Assert.assertTrue(o_testIs_mg234__13);
        boolean o_testIs_mg234__14 = p.is("div p");
        Assert.assertTrue(o_testIs_mg234__14);
        Element q = doc.select("p").last();
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        boolean o_testIs_mg234__18 = q.is("p");
        Assert.assertTrue(o_testIs_mg234__18);
        boolean o_testIs_mg234__19 = q.is("p ~ p");
        Assert.assertTrue(o_testIs_mg234__19);
        boolean o_testIs_mg234__20 = q.is("p + p");
        Assert.assertTrue(o_testIs_mg234__20);
        boolean o_testIs_mg234__21 = q.is("p:last-child");
        Assert.assertTrue(o_testIs_mg234__21);
        boolean o_testIs_mg234__22 = q.is("p a");
        Assert.assertFalse(o_testIs_mg234__22);
        boolean o_testIs_mg234__23 = q.is("a");
        Assert.assertFalse(o_testIs_mg234__23);
        Elements o_testIs_mg234__24 = q.getElementsMatchingOwnText(__DSPOT_regex_95);
        Assert.assertTrue(o_testIs_mg234__24.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        Assert.assertTrue(o_testIs_mg234__8);
        Assert.assertFalse(o_testIs_mg234__9);
        Assert.assertTrue(o_testIs_mg234__10);
        Assert.assertTrue(o_testIs_mg234__11);
        Assert.assertFalse(o_testIs_mg234__12);
        Assert.assertTrue(o_testIs_mg234__13);
        Assert.assertTrue(o_testIs_mg234__14);
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        Assert.assertTrue(o_testIs_mg234__18);
        Assert.assertTrue(o_testIs_mg234__19);
        Assert.assertTrue(o_testIs_mg234__20);
        Assert.assertTrue(o_testIs_mg234__21);
        Assert.assertFalse(o_testIs_mg234__22);
        Assert.assertFalse(o_testIs_mg234__23);
    }

    @Test(timeout = 10000)
    public void testIs_mg156_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_40 = "+ _ 2&pb?56TtKz.F5M(";
            String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
            Document doc = Jsoup.parse(html);
            Element p = doc.select("p").first();
            p.is("p");
            p.is("div");
            p.is("p:has(a)");
            p.is("p:first-child");
            p.is("p:last-child");
            p.is("*");
            p.is("div p");
            Element q = doc.select("p").last();
            q.is("p");
            q.is("p ~ p");
            q.is("p + p");
            q.is("p:last-child");
            q.is("p a");
            q.is("a");
            p.getElementsMatchingOwnText(__DSPOT_regex_40);
            org.junit.Assert.fail("testIs_mg156 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: + _ 2&pb?56TtKz.F5M(", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testIs_mg144() throws Exception {
        String __DSPOT_match_24 = "`i[aMe!@y;s?/OCDfviV";
        String __DSPOT_key_23 = "bA%.UJum&)<4oK[>Va&1";
        String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element p = doc.select("p").first();
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        boolean o_testIs_mg144__9 = p.is("p");
        Assert.assertTrue(o_testIs_mg144__9);
        boolean o_testIs_mg144__10 = p.is("div");
        Assert.assertFalse(o_testIs_mg144__10);
        boolean o_testIs_mg144__11 = p.is("p:has(a)");
        Assert.assertTrue(o_testIs_mg144__11);
        boolean o_testIs_mg144__12 = p.is("p:first-child");
        Assert.assertTrue(o_testIs_mg144__12);
        boolean o_testIs_mg144__13 = p.is("p:last-child");
        Assert.assertFalse(o_testIs_mg144__13);
        boolean o_testIs_mg144__14 = p.is("*");
        Assert.assertTrue(o_testIs_mg144__14);
        boolean o_testIs_mg144__15 = p.is("div p");
        Assert.assertTrue(o_testIs_mg144__15);
        Element q = doc.select("p").last();
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        boolean o_testIs_mg144__19 = q.is("p");
        Assert.assertTrue(o_testIs_mg144__19);
        boolean o_testIs_mg144__20 = q.is("p ~ p");
        Assert.assertTrue(o_testIs_mg144__20);
        boolean o_testIs_mg144__21 = q.is("p + p");
        Assert.assertTrue(o_testIs_mg144__21);
        boolean o_testIs_mg144__22 = q.is("p:last-child");
        Assert.assertTrue(o_testIs_mg144__22);
        boolean o_testIs_mg144__23 = q.is("p a");
        Assert.assertFalse(o_testIs_mg144__23);
        boolean o_testIs_mg144__24 = q.is("a");
        Assert.assertFalse(o_testIs_mg144__24);
        Elements o_testIs_mg144__25 = p.getElementsByAttributeValueContaining(__DSPOT_key_23, __DSPOT_match_24);
        Assert.assertTrue(o_testIs_mg144__25.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        Assert.assertTrue(o_testIs_mg144__9);
        Assert.assertFalse(o_testIs_mg144__10);
        Assert.assertTrue(o_testIs_mg144__11);
        Assert.assertTrue(o_testIs_mg144__12);
        Assert.assertFalse(o_testIs_mg144__13);
        Assert.assertTrue(o_testIs_mg144__14);
        Assert.assertTrue(o_testIs_mg144__15);
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        Assert.assertTrue(o_testIs_mg144__19);
        Assert.assertTrue(o_testIs_mg144__20);
        Assert.assertTrue(o_testIs_mg144__21);
        Assert.assertTrue(o_testIs_mg144__22);
        Assert.assertFalse(o_testIs_mg144__23);
        Assert.assertFalse(o_testIs_mg144__24);
    }

    @Test(timeout = 10000)
    public void testIs_mg228() throws Exception {
        int __DSPOT_index_89 = -2007281300;
        String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element p = doc.select("p").first();
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        boolean o_testIs_mg228__8 = p.is("p");
        Assert.assertTrue(o_testIs_mg228__8);
        boolean o_testIs_mg228__9 = p.is("div");
        Assert.assertFalse(o_testIs_mg228__9);
        boolean o_testIs_mg228__10 = p.is("p:has(a)");
        Assert.assertTrue(o_testIs_mg228__10);
        boolean o_testIs_mg228__11 = p.is("p:first-child");
        Assert.assertTrue(o_testIs_mg228__11);
        boolean o_testIs_mg228__12 = p.is("p:last-child");
        Assert.assertFalse(o_testIs_mg228__12);
        boolean o_testIs_mg228__13 = p.is("*");
        Assert.assertTrue(o_testIs_mg228__13);
        boolean o_testIs_mg228__14 = p.is("div p");
        Assert.assertTrue(o_testIs_mg228__14);
        Element q = doc.select("p").last();
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        boolean o_testIs_mg228__18 = q.is("p");
        Assert.assertTrue(o_testIs_mg228__18);
        boolean o_testIs_mg228__19 = q.is("p ~ p");
        Assert.assertTrue(o_testIs_mg228__19);
        boolean o_testIs_mg228__20 = q.is("p + p");
        Assert.assertTrue(o_testIs_mg228__20);
        boolean o_testIs_mg228__21 = q.is("p:last-child");
        Assert.assertTrue(o_testIs_mg228__21);
        boolean o_testIs_mg228__22 = q.is("p a");
        Assert.assertFalse(o_testIs_mg228__22);
        boolean o_testIs_mg228__23 = q.is("a");
        Assert.assertFalse(o_testIs_mg228__23);
        Elements o_testIs_mg228__24 = q.getElementsByIndexEquals(__DSPOT_index_89);
        Assert.assertTrue(o_testIs_mg228__24.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        Assert.assertTrue(o_testIs_mg228__8);
        Assert.assertFalse(o_testIs_mg228__9);
        Assert.assertTrue(o_testIs_mg228__10);
        Assert.assertTrue(o_testIs_mg228__11);
        Assert.assertFalse(o_testIs_mg228__12);
        Assert.assertTrue(o_testIs_mg228__13);
        Assert.assertTrue(o_testIs_mg228__14);
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        Assert.assertTrue(o_testIs_mg228__18);
        Assert.assertTrue(o_testIs_mg228__19);
        Assert.assertTrue(o_testIs_mg228__20);
        Assert.assertTrue(o_testIs_mg228__21);
        Assert.assertFalse(o_testIs_mg228__22);
        Assert.assertFalse(o_testIs_mg228__23);
    }

    @Test(timeout = 10000)
    public void testIs_mg226() throws Exception {
        String __DSPOT_valuePrefix_87 = "&{.K}Mjm5t1& yMN`s;U";
        String __DSPOT_key_86 = "bR-2-=M,.G+$]g)e+[it";
        String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element p = doc.select("p").first();
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        boolean o_testIs_mg226__9 = p.is("p");
        Assert.assertTrue(o_testIs_mg226__9);
        boolean o_testIs_mg226__10 = p.is("div");
        Assert.assertFalse(o_testIs_mg226__10);
        boolean o_testIs_mg226__11 = p.is("p:has(a)");
        Assert.assertTrue(o_testIs_mg226__11);
        boolean o_testIs_mg226__12 = p.is("p:first-child");
        Assert.assertTrue(o_testIs_mg226__12);
        boolean o_testIs_mg226__13 = p.is("p:last-child");
        Assert.assertFalse(o_testIs_mg226__13);
        boolean o_testIs_mg226__14 = p.is("*");
        Assert.assertTrue(o_testIs_mg226__14);
        boolean o_testIs_mg226__15 = p.is("div p");
        Assert.assertTrue(o_testIs_mg226__15);
        Element q = doc.select("p").last();
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        boolean o_testIs_mg226__19 = q.is("p");
        Assert.assertTrue(o_testIs_mg226__19);
        boolean o_testIs_mg226__20 = q.is("p ~ p");
        Assert.assertTrue(o_testIs_mg226__20);
        boolean o_testIs_mg226__21 = q.is("p + p");
        Assert.assertTrue(o_testIs_mg226__21);
        boolean o_testIs_mg226__22 = q.is("p:last-child");
        Assert.assertTrue(o_testIs_mg226__22);
        boolean o_testIs_mg226__23 = q.is("p a");
        Assert.assertFalse(o_testIs_mg226__23);
        boolean o_testIs_mg226__24 = q.is("a");
        Assert.assertFalse(o_testIs_mg226__24);
        Elements o_testIs_mg226__25 = q.getElementsByAttributeValueStarting(__DSPOT_key_86, __DSPOT_valuePrefix_87);
        Assert.assertTrue(o_testIs_mg226__25.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        Assert.assertTrue(o_testIs_mg226__9);
        Assert.assertFalse(o_testIs_mg226__10);
        Assert.assertTrue(o_testIs_mg226__11);
        Assert.assertTrue(o_testIs_mg226__12);
        Assert.assertFalse(o_testIs_mg226__13);
        Assert.assertTrue(o_testIs_mg226__14);
        Assert.assertTrue(o_testIs_mg226__15);
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        Assert.assertTrue(o_testIs_mg226__19);
        Assert.assertTrue(o_testIs_mg226__20);
        Assert.assertTrue(o_testIs_mg226__21);
        Assert.assertTrue(o_testIs_mg226__22);
        Assert.assertFalse(o_testIs_mg226__23);
        Assert.assertFalse(o_testIs_mg226__24);
    }

    @Test(timeout = 10000)
    public void testIs_mg104() throws Exception {
        String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element p = doc.select("p").first();
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        boolean o_testIs_mg104__7 = p.is("p");
        Assert.assertTrue(o_testIs_mg104__7);
        boolean o_testIs_mg104__8 = p.is("div");
        Assert.assertFalse(o_testIs_mg104__8);
        boolean o_testIs_mg104__9 = p.is("p:has(a)");
        Assert.assertTrue(o_testIs_mg104__9);
        boolean o_testIs_mg104__10 = p.is("p:first-child");
        Assert.assertTrue(o_testIs_mg104__10);
        boolean o_testIs_mg104__11 = p.is("p:last-child");
        Assert.assertFalse(o_testIs_mg104__11);
        boolean o_testIs_mg104__12 = p.is("*");
        Assert.assertTrue(o_testIs_mg104__12);
        boolean o_testIs_mg104__13 = p.is("div p");
        Assert.assertTrue(o_testIs_mg104__13);
        Element q = doc.select("p").last();
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        boolean o_testIs_mg104__17 = q.is("p");
        Assert.assertTrue(o_testIs_mg104__17);
        boolean o_testIs_mg104__18 = q.is("p ~ p");
        Assert.assertTrue(o_testIs_mg104__18);
        boolean o_testIs_mg104__19 = q.is("p + p");
        Assert.assertTrue(o_testIs_mg104__19);
        boolean o_testIs_mg104__20 = q.is("p:last-child");
        Assert.assertTrue(o_testIs_mg104__20);
        boolean o_testIs_mg104__21 = q.is("p a");
        Assert.assertFalse(o_testIs_mg104__21);
        boolean o_testIs_mg104__22 = q.is("a");
        Assert.assertFalse(o_testIs_mg104__22);
        Document o_testIs_mg104__23 = doc.normalise();
        Assert.assertTrue(((Document) (o_testIs_mg104__23)).hasText());
        Assert.assertFalse(((Collection) (((Document) (o_testIs_mg104__23)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (o_testIs_mg104__23)).isBlock());
        Assert.assertFalse(((Document) (o_testIs_mg104__23)).hasParent());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        Assert.assertTrue(o_testIs_mg104__7);
        Assert.assertFalse(o_testIs_mg104__8);
        Assert.assertTrue(o_testIs_mg104__9);
        Assert.assertTrue(o_testIs_mg104__10);
        Assert.assertFalse(o_testIs_mg104__11);
        Assert.assertTrue(o_testIs_mg104__12);
        Assert.assertTrue(o_testIs_mg104__13);
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        Assert.assertTrue(o_testIs_mg104__17);
        Assert.assertTrue(o_testIs_mg104__18);
        Assert.assertTrue(o_testIs_mg104__19);
        Assert.assertTrue(o_testIs_mg104__20);
        Assert.assertFalse(o_testIs_mg104__21);
        Assert.assertFalse(o_testIs_mg104__22);
    }

    @Test(timeout = 10000)
    public void testIs_mg224() throws Exception {
        String __DSPOT_regex_83 = "7%vGBT#3Y8uSO_U./J9r";
        String __DSPOT_key_82 = "Gs7)F5:K|}Y.+DPW(yw#";
        String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        Document doc = Jsoup.parse(html);
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element p = doc.select("p").first();
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        boolean o_testIs_mg224__9 = p.is("p");
        Assert.assertTrue(o_testIs_mg224__9);
        boolean o_testIs_mg224__10 = p.is("div");
        Assert.assertFalse(o_testIs_mg224__10);
        boolean o_testIs_mg224__11 = p.is("p:has(a)");
        Assert.assertTrue(o_testIs_mg224__11);
        boolean o_testIs_mg224__12 = p.is("p:first-child");
        Assert.assertTrue(o_testIs_mg224__12);
        boolean o_testIs_mg224__13 = p.is("p:last-child");
        Assert.assertFalse(o_testIs_mg224__13);
        boolean o_testIs_mg224__14 = p.is("*");
        Assert.assertTrue(o_testIs_mg224__14);
        boolean o_testIs_mg224__15 = p.is("div p");
        Assert.assertTrue(o_testIs_mg224__15);
        Element q = doc.select("p").last();
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        boolean o_testIs_mg224__19 = q.is("p");
        Assert.assertTrue(o_testIs_mg224__19);
        boolean o_testIs_mg224__20 = q.is("p ~ p");
        Assert.assertTrue(o_testIs_mg224__20);
        boolean o_testIs_mg224__21 = q.is("p + p");
        Assert.assertTrue(o_testIs_mg224__21);
        boolean o_testIs_mg224__22 = q.is("p:last-child");
        Assert.assertTrue(o_testIs_mg224__22);
        boolean o_testIs_mg224__23 = q.is("p a");
        Assert.assertFalse(o_testIs_mg224__23);
        boolean o_testIs_mg224__24 = q.is("a");
        Assert.assertFalse(o_testIs_mg224__24);
        Elements o_testIs_mg224__25 = q.getElementsByAttributeValueMatching(__DSPOT_key_82, __DSPOT_regex_83);
        Assert.assertTrue(o_testIs_mg224__25.isEmpty());
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Collection) (((Document) (doc)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (p)).hasText());
        Assert.assertFalse(((Collection) (((Element) (p)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (p)).isBlock());
        Assert.assertTrue(((Element) (p)).hasParent());
        Assert.assertTrue(o_testIs_mg224__9);
        Assert.assertFalse(o_testIs_mg224__10);
        Assert.assertTrue(o_testIs_mg224__11);
        Assert.assertTrue(o_testIs_mg224__12);
        Assert.assertFalse(o_testIs_mg224__13);
        Assert.assertTrue(o_testIs_mg224__14);
        Assert.assertTrue(o_testIs_mg224__15);
        Assert.assertTrue(((Element) (q)).hasText());
        Assert.assertFalse(((Collection) (((Element) (q)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (q)).isBlock());
        Assert.assertTrue(((Element) (q)).hasParent());
        Assert.assertTrue(o_testIs_mg224__19);
        Assert.assertTrue(o_testIs_mg224__20);
        Assert.assertTrue(o_testIs_mg224__21);
        Assert.assertTrue(o_testIs_mg224__22);
        Assert.assertFalse(o_testIs_mg224__23);
        Assert.assertFalse(o_testIs_mg224__24);
    }
}

