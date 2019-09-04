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
    public void discardsSpuriousByteOrderMark_mg24_mg2688() throws IOException {
        int __DSPOT_index_516 = 1114521177;
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
        Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
        Elements o_discardsSpuriousByteOrderMark_mg24_mg2688__14 = o_discardsSpuriousByteOrderMark_mg24__8.getElementsByIndexEquals(__DSPOT_index_516);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg24_mg2688__14.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg37_mg1494() throws IOException {
        String __DSPOT_searchText_196 = "$(Yc4+914v7{bG0ev !-";
        String __DSPOT_text_2 = "/|]6^FT)-ef&bk*201yC";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg37__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
        Element o_discardsSpuriousByteOrderMark_mg37__9 = doc.text(__DSPOT_text_2);
        Elements o_discardsSpuriousByteOrderMark_mg37_mg1494__15 = o_discardsSpuriousByteOrderMark_mg37__9.getElementsContainingText(__DSPOT_searchText_196);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg37_mg1494__15.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg38_mg1778_mg12848() throws IOException {
        String __DSPOT_valueSuffix_3982 = "Bg9;uejU=IPs$?:?Cj<S";
        String __DSPOT_key_3981 = "&(5G%ejJbAc@7uTXUkpI";
        String __DSPOT_tagName_264 = "ncm%^0X<!OI0}2Z*:D}l";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg38__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg38__6);
        String o_discardsSpuriousByteOrderMark_mg38__8 = doc.title();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg38__8);
        Element o_discardsSpuriousByteOrderMark_mg38_mg1778__14 = doc.createElement(__DSPOT_tagName_264);
        Elements o_discardsSpuriousByteOrderMark_mg38_mg1778_mg12848__19 = o_discardsSpuriousByteOrderMark_mg38_mg1778__14.getElementsByAttributeValueEnding(__DSPOT_key_3981, __DSPOT_valueSuffix_3982);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg38_mg1778_mg12848__19.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg38__6);
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg38__8);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_add4_mg1479_mg19112() throws IOException {
        String __DSPOT_match_6197 = "2G@g`U5h%FCo$.yLsV[%";
        String __DSPOT_key_6196 = "+j{zbSy?kS]2Mrc1OKNn";
        String __DSPOT_tagName_186 = "ZPh?<b+y!U3^[z=3TG?P";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_add4__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add4__6);
        String o_discardsSpuriousByteOrderMark_add4__8 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add4__8);
        Element o_discardsSpuriousByteOrderMark_add4_mg1479__15 = doc.createElement(__DSPOT_tagName_186);
        Elements o_discardsSpuriousByteOrderMark_add4_mg1479_mg19112__20 = o_discardsSpuriousByteOrderMark_add4_mg1479__15.getElementsByAttributeValueContaining(__DSPOT_key_6196, __DSPOT_match_6197);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_add4_mg1479_mg19112__20.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add4__6);
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_add4__8);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg28_mg2391_mg12294() throws IOException {
        String __DSPOT_keyPrefix_3819 = "z|IEQ6lgbn(XxaaN,g b";
        String __DSPOT_className_453 = "g5p/RN6@DGp8 6)>g, x";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg28__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
        Element o_discardsSpuriousByteOrderMark_mg28__8 = doc.head();
        Element o_discardsSpuriousByteOrderMark_mg28_mg2391__14 = o_discardsSpuriousByteOrderMark_mg28__8.toggleClass(__DSPOT_className_453);
        Elements o_discardsSpuriousByteOrderMark_mg28_mg2391_mg12294__18 = o_discardsSpuriousByteOrderMark_mg28__8.getElementsByAttributeStarting(__DSPOT_keyPrefix_3819);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg28_mg2391_mg12294__18.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg27_mg1990_mg21841() throws IOException {
        String __DSPOT_value_7212 = "7/k9*_18+KGiBR_(C>N}";
        String __DSPOT_key_7211 = "}h StPqa*]{G`/c,>5=?";
        String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
        String o_discardsSpuriousByteOrderMark_mg27_mg1990__14 = doc.outerHtml();
        Assert.assertEquals("<html>\n <head>\n  <title>One</title>\n </head>\n <body>\n  Two\n </body>\n</html>", o_discardsSpuriousByteOrderMark_mg27_mg1990__14);
        Elements o_discardsSpuriousByteOrderMark_mg27_mg1990_mg21841__19 = o_discardsSpuriousByteOrderMark_mg27__9.getElementsByAttributeValueNot(__DSPOT_key_7211, __DSPOT_value_7212);
        Assert.assertFalse(o_discardsSpuriousByteOrderMark_mg27_mg1990_mg21841__19.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Assert.assertEquals("<html>\n <head>\n  <title>One</title>\n </head>\n <body>\n  Two\n </body>\n</html>", o_discardsSpuriousByteOrderMark_mg27_mg1990__14);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg27_mg2105_mg4093_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_836 = "J7XHV&!)2q6NZ4&x2yRj";
            String __DSPOT_value_367 = "Kf:SYMC7w7m>;kLhe6_H";
            String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
            String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
            Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
            String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
            Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
            Element o_discardsSpuriousByteOrderMark_mg27_mg2105__15 = o_discardsSpuriousByteOrderMark_mg27__9.val(__DSPOT_value_367);
            o_discardsSpuriousByteOrderMark_mg27_mg2105__15.getElementsMatchingOwnText(__DSPOT_regex_836);
            org.junit.Assert.fail("discardsSpuriousByteOrderMark_mg27_mg2105_mg4093 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: J7XHV&!)2q6NZ4&x2yRj", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg27_mg2106_mg21681() throws IOException {
        String __DSPOT_valuePrefix_7154 = "W*]91_Bo>!*<d(0V=^yh";
        String __DSPOT_key_7153 = "4Q>N6Gl=i@g[/#]&_c#f";
        String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
        String o_discardsSpuriousByteOrderMark_mg27_mg2106__14 = o_discardsSpuriousByteOrderMark_mg27__9.wholeText();
        Assert.assertEquals("", o_discardsSpuriousByteOrderMark_mg27_mg2106__14);
        Elements o_discardsSpuriousByteOrderMark_mg27_mg2106_mg21681__19 = o_discardsSpuriousByteOrderMark_mg27__9.getElementsByAttributeValueStarting(__DSPOT_key_7153, __DSPOT_valuePrefix_7154);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg27_mg2106_mg21681__19.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Assert.assertEquals("", o_discardsSpuriousByteOrderMark_mg27_mg2106__14);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg24_mg2647_mg11362() throws IOException {
        String __DSPOT_searchText_3408 = "JL#OKrd!Bvu&B3{fEj>T";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
        Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
        doc.quirksMode();
        Elements o_discardsSpuriousByteOrderMark_mg24_mg2647_mg11362__15 = o_discardsSpuriousByteOrderMark_mg24__8.getElementsContainingOwnText(__DSPOT_searchText_3408);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg24_mg2647_mg11362__15.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
    }
}

