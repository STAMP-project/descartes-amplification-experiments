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
    public void discardsSpuriousByteOrderMark_add5() throws IOException {
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        Element o_discardsSpuriousByteOrderMark_add5__6 = doc.head();
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_add5__6)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_discardsSpuriousByteOrderMark_add5__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_add5__6)).hasText());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_add5__6)).hasParent());
        Assert.assertEquals("<head>\n <title>One</title>\n</head>", ((Element) (o_discardsSpuriousByteOrderMark_add5__6)).toString());
        String o_discardsSpuriousByteOrderMark_add5__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add5__7);
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_add5__6)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_discardsSpuriousByteOrderMark_add5__6)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_add5__6)).hasText());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_add5__6)).hasParent());
        Assert.assertEquals("<head>\n <title>One</title>\n</head>", ((Element) (o_discardsSpuriousByteOrderMark_add5__6)).toString());
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
    public void discardsSpuriousByteOrderMark_mg27_mg2002() throws IOException {
        String __DSPOT_valuePrefix_337 = "<[>#j:%:_<cBEu#P/,w[";
        String __DSPOT_key_336 = "ekFG&,M4| IN8 CihQSC";
        String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_discardsSpuriousByteOrderMark_mg27_mg2002__16 = o_discardsSpuriousByteOrderMark_mg27__9.getElementsByAttributeValueStarting(__DSPOT_key_336, __DSPOT_valuePrefix_337);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg27_mg2002__16.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg24_mg2681() throws IOException {
        String __DSPOT_keyPrefix_503 = "c{b_{git%Dk#2(W^K.W&";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
        Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
        Elements o_discardsSpuriousByteOrderMark_mg24_mg2681__14 = o_discardsSpuriousByteOrderMark_mg24__8.getElementsByAttributeStarting(__DSPOT_keyPrefix_503);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg24_mg2681__14.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
    }
}

