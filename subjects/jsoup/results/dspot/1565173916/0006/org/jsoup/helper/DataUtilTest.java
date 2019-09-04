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
        Assert.assertFalse(((Collection) (((Document) (o_discardsSpuriousByteOrderMark_mg31__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_discardsSpuriousByteOrderMark_mg31__8)).hasText());
        Assert.assertFalse(((Document) (o_discardsSpuriousByteOrderMark_mg31__8)).isBlock());
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
        Assert.assertFalse(((Collection) (((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).hasText());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).isBlock());
        Assert.assertTrue(((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).hasParent());
        Assert.assertEquals("<body>\n Two\n</body>", ((Element) (o_discardsSpuriousByteOrderMark_mg24__8)).toString());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
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
    public void discardsSpuriousByteOrderMark_mg24_mg2673() throws IOException {
        String __DSPOT_valuePrefix_509 = "jp(0/_3,|P^W2Z,2Q5iP";
        String __DSPOT_key_508 = "!:&h+CYgVy!-][lTS?oY";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
        Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
        Elements o_discardsSpuriousByteOrderMark_mg24_mg2673__15 = o_discardsSpuriousByteOrderMark_mg24__8.getElementsByAttributeValueStarting(__DSPOT_key_508, __DSPOT_valuePrefix_509);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg24_mg2673__15.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg24__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg27_mg1986() throws IOException {
        String __DSPOT_searchText_344 = "#P/,w[il`jzs}>*e:K5_";
        String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
        Elements o_discardsSpuriousByteOrderMark_mg27_mg1986__15 = o_discardsSpuriousByteOrderMark_mg27__9.getElementsContainingText(__DSPOT_searchText_344);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg27_mg1986__15.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg24_mg2671_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_505 = "rmWUE([ NxcyWZkasdnA";
            String __DSPOT_key_504 = ":.0)CVp5h+El_H3)p Pd";
            String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
            Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
            String o_discardsSpuriousByteOrderMark_mg24__6 = doc.head().text();
            Element o_discardsSpuriousByteOrderMark_mg24__8 = doc.body();
            o_discardsSpuriousByteOrderMark_mg24__8.getElementsByAttributeValueMatching(__DSPOT_key_504, __DSPOT_regex_505);
            org.junit.Assert.fail("discardsSpuriousByteOrderMark_mg24_mg2671 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: rmWUE([ NxcyWZkasdnA", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg37_mg1467() throws IOException {
        String __DSPOT_valueSuffix_181 = "lZb%LN0=O7`n#S4@x6*]";
        String __DSPOT_key_180 = "p`f_]Wh$_8K%!{;g(#dn";
        String __DSPOT_text_2 = "/|]6^FT)-ef&bk*201yC";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg37__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
        Element o_discardsSpuriousByteOrderMark_mg37__9 = doc.text(__DSPOT_text_2);
        Elements o_discardsSpuriousByteOrderMark_mg37_mg1467__16 = o_discardsSpuriousByteOrderMark_mg37__9.getElementsByAttributeValueEnding(__DSPOT_key_180, __DSPOT_valueSuffix_181);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg37_mg1467__16.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg37__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg28_literalMutationString2187_mg3603() throws IOException {
        String __DSPOT_value_649 = "6+FRoW0%ndqb/eInfplm";
        String __DSPOT_key_647 = "j0oCK|z>0^mm+[S`v+p*";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://fop.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg28__6 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
        Element o_discardsSpuriousByteOrderMark_mg28__8 = doc.head();
        Elements o_discardsSpuriousByteOrderMark_mg28_literalMutationString2187_mg3603__15 = o_discardsSpuriousByteOrderMark_mg28__8.getElementsByAttributeValueNot(__DSPOT_key_647, __DSPOT_value_649);
        Assert.assertFalse(o_discardsSpuriousByteOrderMark_mg28_literalMutationString2187_mg3603__15.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg28__6);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg27_mg1949_mg11159() throws IOException {
        String __DSPOT_keyPrefix_3189 = "5j>) vP{*SBd-d5[dJ5Q";
        String __DSPOT_tagName_313 = "s |)TDG+L,kgWS%rG!{ ";
        String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
        Element o_discardsSpuriousByteOrderMark_mg27_mg1949__15 = o_discardsSpuriousByteOrderMark_mg27__9.appendElement(__DSPOT_tagName_313);
        Elements o_discardsSpuriousByteOrderMark_mg27_mg1949_mg11159__19 = o_discardsSpuriousByteOrderMark_mg27_mg1949__15.getElementsByAttributeStarting(__DSPOT_keyPrefix_3189);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg27_mg1949_mg11159__19.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg27_mg1946_mg19724() throws IOException {
        String __DSPOT_regex_6378 = "pnL%nh!Xou$m8K.1hELF";
        String __DSPOT_key_6377 = "2ww71y$`-:E(@O0b{9mK";
        String __DSPOT_className_310 = ">RdB;T70[$>ww =JiT4>";
        String __DSPOT_tagName_0 = "S@Rl&{ha!&Bcvg[?i!rb";
        String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg27__7 = doc.head().text();
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
        Element o_discardsSpuriousByteOrderMark_mg27__9 = doc.createElement(__DSPOT_tagName_0);
        Element o_discardsSpuriousByteOrderMark_mg27_mg1946__15 = o_discardsSpuriousByteOrderMark_mg27__9.addClass(__DSPOT_className_310);
        Elements o_discardsSpuriousByteOrderMark_mg27_mg1946_mg19724__20 = o_discardsSpuriousByteOrderMark_mg27__9.getElementsByAttributeValueMatching(__DSPOT_key_6377, __DSPOT_regex_6378);
        Assert.assertTrue(o_discardsSpuriousByteOrderMark_mg27_mg1946_mg19724__20.isEmpty());
        Assert.assertEquals("One", o_discardsSpuriousByteOrderMark_mg27__7);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg32_literalMutationString880_literalMutationString7845() throws IOException {
        String html = "\ufeff<html><head><title>One</Uitle></head><body>Two</body></html>";
        Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "htt:p://foo.com/", Parser.htmlParser());
        String o_discardsSpuriousByteOrderMark_mg32__6 = doc.head().text();
        String o_discardsSpuriousByteOrderMark_mg32__8 = doc.outerHtml();
        Assert.assertEquals("<html>\n <head>\n  <title>One&lt;/Uitle&gt;&lt;/head&gt;</title>\n </head>\n <body>\n  Two\n </body>\n</html>", o_discardsSpuriousByteOrderMark_mg32__8);
    }

    @Test(timeout = 10000)
    public void discardsSpuriousByteOrderMark_mg28_mg2289_mg16861_failAssert0() throws IOException {
        try {
            int __DSPOT_index_5305 = -232229049;
            String __DSPOT_html_424 = "Pc,]f*,qx_1TccWub}`x";
            String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
            Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
            String o_discardsSpuriousByteOrderMark_mg28__6 = doc.head().text();
            Element o_discardsSpuriousByteOrderMark_mg28__8 = doc.head();
            Element o_discardsSpuriousByteOrderMark_mg28_mg2289__14 = o_discardsSpuriousByteOrderMark_mg28__8.prepend(__DSPOT_html_424);
            o_discardsSpuriousByteOrderMark_mg28__8.child(__DSPOT_index_5305);
            org.junit.Assert.fail("discardsSpuriousByteOrderMark_mg28_mg2289_mg16861 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-232229049", expected.getMessage());
        }
    }
}

