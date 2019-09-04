package org.jsoup.helper;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import org.jsoup.Jsoup;
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
    public void supportsXmlCharsetDeclaration_mg36() throws IOException {
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
        Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
        Assert.assertFalse(((Collection) (((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).hasText());
        Assert.assertTrue(((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).isBlock());
        Assert.assertTrue(((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).hasParent());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg39() throws IOException {
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg39__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg39__7);
        Document o_supportsXmlCharsetDeclaration_mg39__9 = doc.normalise();
        Assert.assertFalse(((Collection) (((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).hasText());
        Assert.assertFalse(((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).isBlock());
        Assert.assertFalse(((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).hasParent());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg39__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg43() throws IOException {
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg43__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg43__7);
        Parser o_supportsXmlCharsetDeclaration_mg43__9 = doc.parser();
        Assert.assertFalse(((Parser) (o_supportsXmlCharsetDeclaration_mg43__9)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_supportsXmlCharsetDeclaration_mg43__9)).getErrors())).isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg43__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg32_mg2668() throws IOException {
        String __DSPOT_keyPrefix_355 = "`7fHNrf8y0oG#]Rw6jWl";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg32__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg32__7);
        Element o_supportsXmlCharsetDeclaration_mg32__9 = doc.body();
        Elements o_supportsXmlCharsetDeclaration_mg32_mg2668__15 = o_supportsXmlCharsetDeclaration_mg32__9.getElementsByAttributeStarting(__DSPOT_keyPrefix_355);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg32_mg2668__15.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg32__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg45_mg3092() throws IOException {
        String __DSPOT_valuePrefix_462 = ">oz>tjYBh9Q<z3n!##!u";
        String __DSPOT_key_461 = "/QjD0!)Eux|:.xzlI8!o";
        String __DSPOT_text_2 = "&><6ycw,-c^.vZ(8(U^r";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg45__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg45__8);
        Element o_supportsXmlCharsetDeclaration_mg45__10 = doc.text(__DSPOT_text_2);
        Elements o_supportsXmlCharsetDeclaration_mg45_mg3092__17 = o_supportsXmlCharsetDeclaration_mg45__10.getElementsByAttributeValueStarting(__DSPOT_key_461, __DSPOT_valuePrefix_462);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg45_mg3092__17.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg45__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg35_mg3379_mg11767_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_2713 = "Bx`bN!4=9j!m#7nX[d3g";
            String __DSPOT_tagName_0 = "lKC*+{5@T5!^MYU(dM7K";
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document doc = Jsoup.parse(soup, null, "");
            String o_supportsXmlCharsetDeclaration_mg35__8 = doc.body().text();
            Element o_supportsXmlCharsetDeclaration_mg35__10 = doc.createElement(__DSPOT_tagName_0);
            String o_supportsXmlCharsetDeclaration_mg35_mg3379__15 = o_supportsXmlCharsetDeclaration_mg35__10.val();
            o_supportsXmlCharsetDeclaration_mg35__10.getElementsMatchingText(__DSPOT_regex_2713);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg35_mg3379_mg11767 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: Bx`bN!4=9j!m#7nX[d3g", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_add4_literalMutationString1441_mg10474_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_2403 = "Th:E&&S)$- 8_tP=:hE(";
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/19U99/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document doc = Jsoup.parse(soup, null, "");
            Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
            String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
            o_supportsXmlCharsetDeclaration_add4__7.getElementsMatchingOwnText(__DSPOT_regex_2403);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_add4_literalMutationString1441_mg10474 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: Th:E&&S)$- 8_tP=:hE(", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_add4_mg1781_mg18796() throws IOException {
        String __DSPOT_valueSuffix_4637 = "V Ga()kf(H3Xu{L&Ddy8";
        String __DSPOT_key_4636 = "e[-&Fp1V[2h9(<[w#x&K";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
        String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        String o_supportsXmlCharsetDeclaration_add4_mg1781__14 = o_supportsXmlCharsetDeclaration_add4__7.ownText();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4_mg1781__14);
        Elements o_supportsXmlCharsetDeclaration_add4_mg1781_mg18796__19 = o_supportsXmlCharsetDeclaration_add4__7.getElementsByAttributeValueEnding(__DSPOT_key_4636, __DSPOT_valueSuffix_4637);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_add4_mg1781_mg18796__19.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4_mg1781__14);
    }
}

