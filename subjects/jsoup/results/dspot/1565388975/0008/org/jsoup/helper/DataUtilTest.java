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
    public void supportsXmlCharsetDeclaration_add4_mg2681() throws IOException {
        String __DSPOT_valueSuffix_366 = "bO`7fHNrf8y0oG#]Rw6j";
        String __DSPOT_key_365 = ".,{b2Fc[XDk)k0ASr!(<";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
        String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        Elements o_supportsXmlCharsetDeclaration_add4_mg2681__16 = o_supportsXmlCharsetDeclaration_add4__7.getElementsByAttributeValueEnding(__DSPOT_key_365, __DSPOT_valueSuffix_366);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_add4_mg2681__16.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg32_mg2971() throws IOException {
        int __DSPOT_index_444 = 1688637338;
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        String o_supportsXmlCharsetDeclaration_mg32__7 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg32__7);
        Element o_supportsXmlCharsetDeclaration_mg32__9 = doc.body();
        Elements o_supportsXmlCharsetDeclaration_mg32_mg2971__15 = o_supportsXmlCharsetDeclaration_mg32__9.getElementsByIndexEquals(__DSPOT_index_444);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_mg32_mg2971__15.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_mg32__7);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36_mg2203_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_285 = "PP&=)ahC8}@P]Bj9St<a";
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document doc = Jsoup.parse(soup, null, "");
            String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
            Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
            o_supportsXmlCharsetDeclaration_mg36__9.getElementsMatchingOwnText(__DSPOT_regex_285);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg36_mg2203 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: PP&=)ahC8}@P]Bj9St<a", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36_mg2152_failAssert0() throws IOException {
        try {
            int __DSPOT_index_261 = -691672756;
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document doc = Jsoup.parse(soup, null, "");
            String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
            Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
            o_supportsXmlCharsetDeclaration_mg36__9.child(__DSPOT_index_261);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg36_mg2152 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-691672756", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36_add1981_mg10032_failAssert0() throws IOException {
        try {
            String __DSPOT_regex_2252 = "wP_KA(kq! P7StEfZ85(";
            String __DSPOT_key_2251 = "`=;H{%goQ[|E#]j4xtha";
            String encoding = "iso-8859-1";
            InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
            Document doc = Jsoup.parse(soup, null, "");
            String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
            Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
            o_supportsXmlCharsetDeclaration_mg36__9.isBlock();
            o_supportsXmlCharsetDeclaration_mg36__9.getElementsByAttributeValueMatching(__DSPOT_key_2251, __DSPOT_regex_2252);
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg36_add1981_mg10032 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: wP_KA(kq! P7StEfZ85(", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_add4_mg2612_mg15668() throws IOException {
        String __DSPOT_searchText_4047 = "9?T0d4F7a-/@&27@j,f_";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
        String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        String o_supportsXmlCharsetDeclaration_add4_mg2612__14 = doc.location();
        Assert.assertEquals("", o_supportsXmlCharsetDeclaration_add4_mg2612__14);
        Elements o_supportsXmlCharsetDeclaration_add4_mg2612_mg15668__18 = o_supportsXmlCharsetDeclaration_add4__7.getElementsContainingText(__DSPOT_searchText_4047);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_add4_mg2612_mg15668__18.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        Assert.assertEquals("", o_supportsXmlCharsetDeclaration_add4_mg2612__14);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_add4_mg2735_mg6099() throws IOException {
        String __DSPOT_match_998 = "e0uC={d] N#V/:!7,sg}";
        String __DSPOT_key_997 = "neUI(FQcaKR}t@-}[H)A";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        Element o_supportsXmlCharsetDeclaration_add4__7 = doc.body();
        String o_supportsXmlCharsetDeclaration_add4__8 = doc.body().text();
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
        Element o_supportsXmlCharsetDeclaration_add4_mg2735__14 = o_supportsXmlCharsetDeclaration_add4__7.nextElementSibling();
        Elements o_supportsXmlCharsetDeclaration_add4_mg2735_mg6099__19 = o_supportsXmlCharsetDeclaration_add4__7.getElementsByAttributeValueContaining(__DSPOT_key_997, __DSPOT_match_998);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_add4_mg2735_mg6099__19.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("Hell\u00f6 W\u00f6rld!", o_supportsXmlCharsetDeclaration_add4__8);
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_mg36_mg2152_failAssert0_rv7332_failAssert0() throws IOException {
        try {
            {
                String __DSPOT_match_1408 = "52,[?/s*I]#W?sZGp(In";
                String __DSPOT_key_1407 = "Mb7`(nvs-j(<68cQ=S*6";
                int __DSPOT_index_261 = -691672756;
                String encoding = "iso-8859-1";
                InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>")).getBytes(encoding));
                Document doc = Jsoup.parse(soup, null, "");
                String o_supportsXmlCharsetDeclaration_mg36__7 = doc.body().text();
                Element o_supportsXmlCharsetDeclaration_mg36__9 = doc.head();
                Element __DSPOT_invoc_17 = o_supportsXmlCharsetDeclaration_mg36__9.child(__DSPOT_index_261);
                org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg36_mg2152 should have thrown ArrayIndexOutOfBoundsException");
                __DSPOT_invoc_17.getElementsByAttributeValueContaining(__DSPOT_key_1407, __DSPOT_match_1408);
            }
            org.junit.Assert.fail("supportsXmlCharsetDeclaration_mg36_mg2152_failAssert0_rv7332 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-691672756", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsXmlCharsetDeclaration_literalMutationString23_add497_mg20207() throws IOException {
        String __DSPOT_searchText_5217 = "0]FEo:rbeP23)F<7o}]*";
        String encoding = "iso-8859-1";
        Assert.assertEquals("iso-8859-1", encoding);
        InputStream soup = new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" + ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + "")).getBytes(encoding));
        Document doc = Jsoup.parse(soup, null, "");
        Element o_supportsXmlCharsetDeclaration_literalMutationString23_add497__7 = doc.body();
        String o_supportsXmlCharsetDeclaration_literalMutationString23__7 = doc.body().text();
        Assert.assertEquals("", o_supportsXmlCharsetDeclaration_literalMutationString23__7);
        Elements o_supportsXmlCharsetDeclaration_literalMutationString23_add497_mg20207__15 = o_supportsXmlCharsetDeclaration_literalMutationString23_add497__7.getElementsContainingOwnText(__DSPOT_searchText_5217);
        Assert.assertTrue(o_supportsXmlCharsetDeclaration_literalMutationString23_add497_mg20207__15.isEmpty());
        Assert.assertEquals("iso-8859-1", encoding);
        Assert.assertEquals("", o_supportsXmlCharsetDeclaration_literalMutationString23__7);
    }
}

