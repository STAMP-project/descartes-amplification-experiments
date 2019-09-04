package org.jsoup.helper;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;


public class DataUtilTest {
    private InputStream stream(String data) {
        return new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
    }

    private InputStream stream(String data, String charset) {
        try {
            return new ByteArrayInputStream(data.getBytes(charset));
        } catch (UnsupportedEncodingException e) {
            Assert.fail();
        }
        return null;
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg31() throws IOException {
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg31__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg31__6);
        Document o_discardsSpuriousByteOrderMark_mg31__8 = doc.normalise();
        Assert.assertFalse(((Document) (o_discardsSpuriousByteOrderMark_mg31__8)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_discardsSpuriousByteOrderMark_mg31__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_discardsSpuriousByteOrderMark_mg31__8)).hasText());
        Assert.assertFalse(((Document) (o_discardsSpuriousByteOrderMark_mg31__8)).hasParent());
        Assert.assertEquals("<html>\n <head>\n  <title>One</title>\n </head>\n <body>\n  Two\n </body>\n</html>", ((Document) (o_discardsSpuriousByteOrderMark_mg31__8)).toString());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg31__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg35() throws IOException {
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg35__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg35__6);
        Parser o_discardsSpuriousByteOrderMark_mg35__8 = doc.parser();
        Assert.assertFalse(((Parser) (o_discardsSpuriousByteOrderMark_mg35__8)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_discardsSpuriousByteOrderMark_mg35__8)).getErrors())).isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg35__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg28() throws IOException {
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg28__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
        Element o_discardsSpuriousByteOrderMark_mg28__8 = doc.head();
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg28__8)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_discardsSpuriousByteOrderMark_mg28__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg28__8)).hasText());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg28__8)).hasParent());
        Assert.assertEquals("<head>\n <title>One</title>\n</head>", ((Element) (o_discardsSpuriousByteOrderMark_mg28__8)).toString());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg24_mg2505() throws IOException {
        String __DSPOT_match_480 = "WL!pi%TT:z0[|zDDSlq}";
        String __DSPOT_key_479 = "cx9VgAzGTF;K^aA[n|M]";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
        Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
        Elements o_discardsSpuriousByteOrderMark_mg24_mg2505__15 = o_discardsSpuriousByteOrderMark_mg24__8.getElementsByAttributeValueContaining(__DSPOT_key_479, __DSPOT_match_480);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg24_mg2505__15.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_add5_mg1847() throws IOException {
        String __DSPOT_valueSuffix_241 = "$8H_I=8-[lOV9/j.?.Rx";
        String __DSPOT_key_239 = "ohN#bUwM2fXs,Xbq-We!";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        Element o_discardsSpuriousByteOrderMark_add5__6 = doc.head();
        String o_discardsSpuriousByteOrderMark_add5__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add5__7);
        Elements o_discardsSpuriousByteOrderMark_add5_mg1847__15 = o_discardsSpuriousByteOrderMark_add5__6.getElementsByAttributeValueEnding(__DSPOT_key_239, __DSPOT_valueSuffix_241);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_add5_mg1847__15.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add5__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_add5_mg1856_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_243 = "x0NUxfsqe](S`z[%0Qb?";
            String __DSPOT_key_242 = "#Ib/>ZJL:BhN+R,ViYi7";
            String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
            Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
            Element o_discardsSpuriousByteOrderMark_add5__6 = doc.head();
            String o_discardsSpuriousByteOrderMark_add5__7 = doc.head().text();
            o_discardsSpuriousByteOrderMark_add5__6.getElementsByAttributeValueMatching(__DSPOT_key_242, __DSPOT_regex_243);
            org.junit.Assert.fail("discardsSpuriousByteOrderMark_add5_mg1856 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: x0NUxfsqe](S`z[%0Qb?", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg37_mg2064() throws IOException {
        String __DSPOT_searchText_355 = "/4LsTv2!:d9e$lX2:BB[";
        String __DSPOT_text_2 = "/|]6^FT)-ef&bk*201yC";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg37__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
        Element o_discardsSpuriousByteOrderMark_mg37__9 = doc.text(__DSPOT_text_2);
        Elements o_discardsSpuriousByteOrderMark_mg37_mg2064__15 = o_discardsSpuriousByteOrderMark_mg37__9.getElementsContainingText(__DSPOT_searchText_355);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg37_mg2064__15.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg24_mg2497_mg3537() throws IOException {
        String __DSPOT_valuePrefix_603 = "b|zZLU]V5<AB.VbF.ite";
        String __DSPOT_key_602 = " S($ PcBfRcQE[p!A4Ut";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
        Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
        Map<String, String> o_discardsSpuriousByteOrderMark_mg24_mg2497__13 = o_discardsSpuriousByteOrderMark_mg24__8.dataset();
        Elements o_discardsSpuriousByteOrderMark_mg24_mg2497_mg3537__18 = o_discardsSpuriousByteOrderMark_mg24__8.getElementsByAttributeValueStarting(__DSPOT_key_602, __DSPOT_valuePrefix_603);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg24_mg2497_mg3537__18.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg37_mg2064_mg8294() throws IOException {
        int __DSPOT_index_2268 = -1825731325;
        String __DSPOT_searchText_355 = "/4LsTv2!:d9e$lX2:BB[";
        String __DSPOT_text_2 = "/|]6^FT)-ef&bk*201yC";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg37__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
        Element o_discardsSpuriousByteOrderMark_mg37__9 = doc.text(__DSPOT_text_2);
        Elements o_discardsSpuriousByteOrderMark_mg37_mg2064__15 = o_discardsSpuriousByteOrderMark_mg37__9.getElementsContainingText(__DSPOT_searchText_355);
        Elements o_discardsSpuriousByteOrderMark_mg37_mg2064_mg8294__19 = o_discardsSpuriousByteOrderMark_mg37__9.getElementsByIndexEquals(__DSPOT_index_2268);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg37_mg2064_mg8294__19.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg37_mg2093_mg21218() throws IOException {
        String __DSPOT_keyPrefix_6704 = "2Q&K(SU8i!KtnnhlJ07{";
        String __DSPOT_text_367 = "FIPAa:=.Olyw>`[d Q5_";
        String __DSPOT_text_2 = "/|]6^FT)-ef&bk*201yC";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg37__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
        Element o_discardsSpuriousByteOrderMark_mg37__9 = doc.text(__DSPOT_text_2);
        Element o_discardsSpuriousByteOrderMark_mg37_mg2093__15 = o_discardsSpuriousByteOrderMark_mg37__9.prependText(__DSPOT_text_367);
        Elements o_discardsSpuriousByteOrderMark_mg37_mg2093_mg21218__19 = o_discardsSpuriousByteOrderMark_mg37_mg2093__15.getElementsByAttributeStarting(__DSPOT_keyPrefix_6704);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg37_mg2093_mg21218__19.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
    }
}

