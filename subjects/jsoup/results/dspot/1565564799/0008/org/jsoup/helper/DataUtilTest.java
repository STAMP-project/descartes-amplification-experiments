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
        Assert.assertTrue(((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_supportsXmlCharsetDeclaration_mg36__9)).hasText());
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
        Assert.assertFalse(((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_supportsXmlCharsetDeclaration_mg39__9)).hasText());
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
    public void supportsXmlCharsetDeclaration_mg36_mg2311() throws IOException {
        String __DSPOT_searchText_287 = "i[c[$pD-8hLO9NZxlbaJ";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
        Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
        Elements o_supportsXmlCharsetDeclaration_mg36_mg2311__15 = o_supportsXmlCharsetDeclaration_mg36__9.getElementsContainingOwnText(__DSPOT_searchText_287);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg36_mg2311__15.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_add4_mg1845() throws IOException {
        String __DSPOT_value_189 = "kgb@d1`U0<3#}]I<wAj/";
        String __DSPOT_key_188 = "TF2]9S/Pc(}S($`Y68M&";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
        String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        Elements o_supportsXmlCharsetDeclaration_add4_mg1845__16 = o_supportsXmlCharsetDeclaration_add4__7.getElementsByAttributeValueNot(__DSPOT_key_188, __DSPOT_value_189);
        Assert.assertFalse(o_supportsXmlCharsetDeclaration_add4_mg1845__16.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36_mg2302() throws IOException {
        String __DSPOT_valuePrefix_281 = "![[}26AfBU*3)B]>&U{C";
        String __DSPOT_key_280 = "uZ`PE,L[0SbX#ZgRg!2|";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
        Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
        Elements o_supportsXmlCharsetDeclaration_mg36_mg2302__16 = o_supportsXmlCharsetDeclaration_mg36__9.getElementsByAttributeValueStarting(__DSPOT_key_280, __DSPOT_valuePrefix_281);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg36_mg2302__16.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg45_mg2672() throws IOException {
        int __DSPOT_index_373 = 818945758;
        String __DSPOT_text_2 = "&><6ycw,-c^.vZ(8(U^r";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg45__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg45__8);
        Element o_supportsXmlCharsetDeclaration_mg45__10 = doc.text(__DSPOT_text_2);
        Elements o_supportsXmlCharsetDeclaration_mg45_mg2672__16 = o_supportsXmlCharsetDeclaration_mg45__10.getElementsByIndexEquals(__DSPOT_index_373);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg45_mg2672__16.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg45__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg32_mg3199_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_474 = "zt/,KdfQ7QJ$`&3a<C[:";
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document doc = Jsoup.parse(soup, null, "");
            String o_supportsXmlCharsetDeclaration_mg32__7 = doc.body().text();
            Element o_supportsXmlCharsetDeclaration_mg32__9 = doc.body();
            o_supportsXmlCharsetDeclaration_mg32__9.getElementsMatchingOwnText(__DSPOT_regex_474);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg32_mg3199 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36_mg2299() throws IOException {
        String __DSPOT_valueSuffix_275 = "!w^uTe=TKkftLA4)55VD";
        String __DSPOT_key_274 = "=WFI4qq_S}ZY}+!<O`1o";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
        Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
        Elements o_supportsXmlCharsetDeclaration_mg36_mg2299__16 = o_supportsXmlCharsetDeclaration_mg36__9.getElementsByAttributeValueEnding(__DSPOT_key_274, __DSPOT_valueSuffix_275);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg36_mg2299__16.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg45_mg2664() throws IOException {
        String __DSPOT_keyPrefix_359 = "vW0gV#-9+YTMGk6G!eqT";
        String __DSPOT_text_2 = "&><6ycw,-c^.vZ(8(U^r";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg45__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg45__8);
        Element o_supportsXmlCharsetDeclaration_mg45__10 = doc.text(__DSPOT_text_2);
        Elements o_supportsXmlCharsetDeclaration_mg45_mg2664__16 = o_supportsXmlCharsetDeclaration_mg45__10.getElementsByAttributeStarting(__DSPOT_keyPrefix_359);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg45_mg2664__16.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg45__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg32_literalMutationString3111_mg12701() throws IOException {
        String __DSPOT_searchText_2819 = ".JK-HtksMx&U&w2dX:|E";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "Accept-Encoding");
        String o_supportsXmlCharsetDeclaration_mg32__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg32__7);
        Element o_supportsXmlCharsetDeclaration_mg32__9 = doc.body();
        Elements o_supportsXmlCharsetDeclaration_mg32_literalMutationString3111_mg12701__15 = o_supportsXmlCharsetDeclaration_mg32__9.getElementsContainingText(__DSPOT_searchText_2819);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg32_literalMutationString3111_mg12701__15.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg32__7);
    }
}

