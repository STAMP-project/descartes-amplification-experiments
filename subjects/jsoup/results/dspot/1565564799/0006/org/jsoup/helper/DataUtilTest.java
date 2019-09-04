package org.jsoup.helper;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
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
    public void discardsSpuriousByteOrderMark_mg24() throws IOException {
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
        Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).hasText());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).hasParent());
        Assert.assertEquals("<body>\n Two\n</body>", ((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).toString());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_add3() throws IOException {
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Parser o_discardsSpuriousByteOrderMark_add3__2 = Parser.htmlParser();
        Assert.assertFalse(((Parser) (o_discardsSpuriousByteOrderMark_add3__2)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_discardsSpuriousByteOrderMark_add3__2)).getErrors())).isEmpty());
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_add3__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add3__7);
        Assert.assertFalse(((Parser) (o_discardsSpuriousByteOrderMark_add3__2)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_discardsSpuriousByteOrderMark_add3__2)).getErrors())).isEmpty());
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg28_mg2389() throws IOException {
        int __DSPOT_index_437 = 1301681452;
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg28__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
        Element o_discardsSpuriousByteOrderMark_mg28__8 = doc.head();
        Elements o_discardsSpuriousByteOrderMark_mg28_mg2389__14 = o_discardsSpuriousByteOrderMark_mg28__8.getElementsByIndexEquals(__DSPOT_index_437);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg28_mg2389__14.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg28_mg2393() throws IOException {
        String __DSPOT_searchText_441 = "xs8cVBe24*w=zoF9c%{]";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg28__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
        Element o_discardsSpuriousByteOrderMark_mg28__8 = doc.head();
        Elements o_discardsSpuriousByteOrderMark_mg28_mg2393__14 = o_discardsSpuriousByteOrderMark_mg28__8.getElementsContainingOwnText(__DSPOT_searchText_441);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg28_mg2393__14.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg27_mg2080_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_344 = "AA%NPt)H]hdupZe_f1/d";
            String __DSPOT_key_343 = ")dYLHGthUmyN*yr|/$GF";
            String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
            String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
            Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
            String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
            Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
            o_discardsSpuriousByteOrderMark_mg27__9.getElementsByAttributeValueMatching(__DSPOT_key_343, __DSPOT_regex_344);
            org.junit.Assert.fail("discardsSpuriousByteOrderMark_mg27_mg2080 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg26_mg1671_mg11659_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_3334 = "7hT)tGD)!qu!!+O`dRma";
            String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
            Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
            String o_discardsSpuriousByteOrderMark_mg26__6 = doc.head().text();
            Document o_discardsSpuriousByteOrderMark_mg26__8 = doc.clone();
            Element o_discardsSpuriousByteOrderMark_mg26_mg1671__13 = o_discardsSpuriousByteOrderMark_mg26__8.body();
            o_discardsSpuriousByteOrderMark_mg26_mg1671__13.getElementsMatchingText(__DSPOT_regex_3334);
            org.junit.Assert.fail("discardsSpuriousByteOrderMark_mg26_mg1671_mg11659 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 7hT)tGD)!qu!!+O`dRma", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_add5_mg1777_mg4331() throws IOException {
        String __DSPOT_keyPrefix_899 = "5[-|0E?2-.319M)1m*w|";
        String __DSPOT_text_242 = "0[e!2k?WP/q=qf@xV4RP";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        Element o_discardsSpuriousByteOrderMark_add5__6 = doc.head();
        String o_discardsSpuriousByteOrderMark_add5__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add5__7);
        Element o_discardsSpuriousByteOrderMark_add5_mg1777__14 = o_discardsSpuriousByteOrderMark_add5__6.prependText(__DSPOT_text_242);
        Elements o_discardsSpuriousByteOrderMark_add5_mg1777_mg4331__18 = o_discardsSpuriousByteOrderMark_add5_mg1777__14.getElementsByAttributeStarting(__DSPOT_keyPrefix_899);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_add5_mg1777_mg4331__18.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add5__7);
    }
}

