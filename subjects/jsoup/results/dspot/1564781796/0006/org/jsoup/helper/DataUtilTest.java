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
    public void discardsSpuriousByteOrderMark_mg24_mg2674() throws IOException {
        String __DSPOT_searchText_516 = "((f,nBh]Mh0jpiWYz6:*";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
        Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
        Elements o_discardsSpuriousByteOrderMark_mg24_mg2674__14 = o_discardsSpuriousByteOrderMark_mg24__8.getElementsContainingText(__DSPOT_searchText_516);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg24_mg2674__14.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg24_mg2676_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_518 = "A;4`PN SVD6SI7Q;{KD3";
            String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
            Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
            String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
            Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
            o_discardsSpuriousByteOrderMark_mg24__8.getElementsMatchingText(__DSPOT_regex_518);
            org.junit.Assert.fail("discardsSpuriousByteOrderMark_mg24_mg2676 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: A;4`PN SVD6SI7Q;{KD3", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg37_mg1512() throws IOException {
        String __DSPOT_valueSuffix_181 = "2J j[AsO&r7Mez&0A)5f";
        String __DSPOT_key_180 = "([DypXWAgQD^/r %<0v|";
        String __DSPOT_text_2 = "/|]6^FT)-ef&bk*201yC";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg37__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
        Element o_discardsSpuriousByteOrderMark_mg37__9 = doc.text(__DSPOT_text_2);
        Elements o_discardsSpuriousByteOrderMark_mg37_mg1512__16 = o_discardsSpuriousByteOrderMark_mg37__9.getElementsByAttributeValueEnding(__DSPOT_key_180, __DSPOT_valueSuffix_181);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg37_mg1512__16.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg27_mg1913() throws IOException {
        String __DSPOT_value_303 = "9!kqC{WfY|n}KRY;#Eiv";
        String __DSPOT_key_302 = ">RdB;T70[$>ww =JiT4>";
        String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_discardsSpuriousByteOrderMark_mg27_mg1913__16 = o_discardsSpuriousByteOrderMark_mg27__9.getElementsByAttributeValueNot(__DSPOT_key_302, __DSPOT_value_303);
        Assert.assertFalse(o_discardsSpuriousByteOrderMark_mg27_mg1913__16.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg24_mg2675_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_517 = "[*mSOw:[^>!x&W{f Q@a";
            String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
            Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
            String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
            Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
            o_discardsSpuriousByteOrderMark_mg24__8.getElementsMatchingOwnText(__DSPOT_regex_517);
            org.junit.Assert.fail("discardsSpuriousByteOrderMark_mg24_mg2675 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}

