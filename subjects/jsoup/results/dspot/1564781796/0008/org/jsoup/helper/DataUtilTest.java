package org.jsoup.helper;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
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
    public void supportsXmlCharsetDeclaration_add4_mg1807_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_205 = "DGp8 6)>g, xm6L;&=q[";
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document doc = Jsoup.parse(soup, null, "");
            Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
            String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
            o_supportsXmlCharsetDeclaration_add4__7.getElementsMatchingOwnText(__DSPOT_regex_205);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_add4_mg1807 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: DGp8 6)>g, xm6L;&=q[", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg45_mg2665_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_376 = ".T/Ag-uM;$U!(sd:kbrJ";
            String __DSPOT_text_2 = "&><6ycw,-c^.vZ(8(U^r";
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document doc = Jsoup.parse(soup, null, "");
            String o_supportsXmlCharsetDeclaration_mg45__8 = doc.body().text();
            Element o_supportsXmlCharsetDeclaration_mg45__10 = doc.text(__DSPOT_text_2);
            o_supportsXmlCharsetDeclaration_mg45__10.getElementsMatchingText(__DSPOT_regex_376);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg45_mg2665 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36_literalMutationString2117_mg18475() throws IOException {
        String __DSPOT_searchText_4465 = "3b^|I_nfd2^E#]_(x8)@";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
        Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
        Elements o_supportsXmlCharsetDeclaration_mg36_literalMutationString2117_mg18475__15 = o_supportsXmlCharsetDeclaration_mg36__9.getElementsContainingText(__DSPOT_searchText_4465);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg36_literalMutationString2117_mg18475__15.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg36__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_add4_add1468_mg6497() throws IOException {
        String __DSPOT_searchText_1321 = "w#^S0DsOTkxdwW3Fs)]<";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
        String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        ((Element) (o_supportsXmlCharsetDeclaration_add4__7)).getAllElements().isEmpty();
        Elements o_supportsXmlCharsetDeclaration_add4_add1468_mg6497__17 = o_supportsXmlCharsetDeclaration_add4__7.getElementsContainingOwnText(__DSPOT_searchText_1321);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_add4_add1468_mg6497__17.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg35_literalMutationString3341_mg13930() throws IOException {
        int __DSPOT_index_3180 = 1230428736;
        String __DSPOT_tagName_0 = "lKC*+{5@T5!^MYU(dM7K";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg35__8 = doc.body().text();
        Assert.assertEquals("Hell\ufffd W\ufffdrld!", o_supportsXmlCharsetDeclaration_mg35__8);
        Element o_supportsXmlCharsetDeclaration_mg35__10 = doc.createElement(__DSPOT_tagName_0);
        Elements o_supportsXmlCharsetDeclaration_mg35_literalMutationString3341_mg13930__16 = o_supportsXmlCharsetDeclaration_mg35__10.getElementsByIndexEquals(__DSPOT_index_3180);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg35_literalMutationString3341_mg13930__16.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\ufffd W\ufffdrld!", o_supportsXmlCharsetDeclaration_mg35__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg45_add2359_mg10046_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_2201 = "Wbjsd>XB,G-B[d7Q&e*!";
            String __DSPOT_key_2200 = ":|P[(1jN54{j{Up%/ #c";
            String __DSPOT_text_2 = "&><6ycw,-c^.vZ(8(U^r";
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document o_supportsXmlCharsetDeclaration_mg45_add2359__6 = Jsoup.parse(soup, null, "");
            Document doc = Jsoup.parse(soup, null, "");
            String o_supportsXmlCharsetDeclaration_mg45__8 = doc.body().text();
            Element o_supportsXmlCharsetDeclaration_mg45__10 = doc.text(__DSPOT_text_2);
            o_supportsXmlCharsetDeclaration_mg45__10.getElementsByAttributeValueMatching(__DSPOT_key_2200, __DSPOT_regex_2201);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg45_add2359_mg10046 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: Wbjsd>XB,G-B[d7Q&e*!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_add4_mg1770_mg19573() throws IOException {
        String __DSPOT_regex_4856 = "L/9co8_Jb3ocTa4Isw_1";
        Set<String> __DSPOT_classNames_182 = Collections.singleton("}.QB6=g%p30y%h%PLOA_");
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
        String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        Element o_supportsXmlCharsetDeclaration_add4_mg1770__16 = o_supportsXmlCharsetDeclaration_add4__7.classNames(__DSPOT_classNames_182);
        Elements o_supportsXmlCharsetDeclaration_add4_mg1770_mg19573__20 = o_supportsXmlCharsetDeclaration_add4_mg1770__16.getElementsMatchingOwnText(__DSPOT_regex_4856);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_add4_mg1770_mg19573__20.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_literalMutationString29_mg1724_mg14777() throws IOException {
        String __DSPOT_match_3401 = "8Pwrf7OG!f9wm%rWk#b{";
        String __DSPOT_key_3400 = ".%t(P!b <i>DF-ynF>67";
        String __DSPOT_text_157 = "^7J][{h RC`ESL#^ETTS";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_literalMutationString29__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_literalMutationString29__7);
        Element o_supportsXmlCharsetDeclaration_literalMutationString29_mg1724__12 = doc.text(__DSPOT_text_157);
        Elements o_supportsXmlCharsetDeclaration_literalMutationString29_mg1724_mg14777__17 = o_supportsXmlCharsetDeclaration_literalMutationString29_mg1724__12.getElementsByAttributeValueContaining(__DSPOT_key_3400, __DSPOT_match_3401);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_literalMutationString29_mg1724_mg14777__17.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_literalMutationString29__7);
    }
}

