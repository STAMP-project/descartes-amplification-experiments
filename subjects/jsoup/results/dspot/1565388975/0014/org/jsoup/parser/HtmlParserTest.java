package org.jsoup.parser;


import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class HtmlParserTest {
    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested() throws Exception {
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Parser parser = Parser.htmlParser().setTrackErrors(3);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Document doc = parser.parseInput(html, "http://example.com");
        List<ParseError> errors = parser.getErrors();
        int o_tracksLimitedErrorsWhenRequested__9 = errors.size();
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested__9)));
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested__9)));
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested_mg57() throws Exception {
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Parser parser = Parser.htmlParser().setTrackErrors(3);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Document doc = parser.parseInput(html, "http://example.com");
        List<ParseError> errors = parser.getErrors();
        int o_tracksLimitedErrorsWhenRequested_mg57__9 = errors.size();
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested_mg57__9)));
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        Document o_tracksLimitedErrorsWhenRequested_mg57__16 = doc.normalise();
        Assert.assertFalse(((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).hasText());
        Assert.assertFalse(((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <p>One</p>&amp;arrgh;\n  <font></font>\n  <br>\n </body>\n</html>", ((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).toString());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested_mg57__9)));
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested_add2() throws Exception {
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Parser o_tracksLimitedErrorsWhenRequested_add2__2 = Parser.htmlParser();
        Assert.assertFalse(((Parser) (o_tracksLimitedErrorsWhenRequested_add2__2)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_tracksLimitedErrorsWhenRequested_add2__2)).getErrors())).isEmpty());
        Parser parser = Parser.htmlParser().setTrackErrors(3);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Document doc = parser.parseInput(html, "http://example.com");
        List<ParseError> errors = parser.getErrors();
        int o_tracksLimitedErrorsWhenRequested_add2__10 = errors.size();
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested_add2__10)));
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        Assert.assertFalse(((Parser) (o_tracksLimitedErrorsWhenRequested_add2__2)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_tracksLimitedErrorsWhenRequested_add2__2)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested_add2__10)));
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested_mg54() throws Exception {
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Parser parser = Parser.htmlParser().setTrackErrors(3);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Document doc = parser.parseInput(html, "http://example.com");
        List<ParseError> errors = parser.getErrors();
        int o_tracksLimitedErrorsWhenRequested_mg54__9 = errors.size();
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested_mg54__9)));
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        Element o_tracksLimitedErrorsWhenRequested_mg54__16 = doc.head();
        Assert.assertTrue(((Element) (o_tracksLimitedErrorsWhenRequested_mg54__16)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_tracksLimitedErrorsWhenRequested_mg54__16)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_tracksLimitedErrorsWhenRequested_mg54__16)).hasText());
        Assert.assertTrue(((Element) (o_tracksLimitedErrorsWhenRequested_mg54__16)).hasParent());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested_mg54__9)));
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested_mg50_mg4717() throws Exception {
        String __DSPOT_value_801 = "PW)u/w]c17x09WeW$H2n";
        String __DSPOT_key_800 = "L&lAQdLZh%ynuH+Awg`R";
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Parser parser = Parser.htmlParser().setTrackErrors(3);
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Document doc = parser.parseInput(html, "http://example.com");
        List<ParseError> errors = parser.getErrors();
        int o_tracksLimitedErrorsWhenRequested_mg50__9 = errors.size();
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        Element o_tracksLimitedErrorsWhenRequested_mg50__16 = doc.body();
        Elements o_tracksLimitedErrorsWhenRequested_mg50_mg4717__23 = o_tracksLimitedErrorsWhenRequested_mg50__16.getElementsByAttributeValueNot(__DSPOT_key_800, __DSPOT_value_801);
        Assert.assertFalse(o_tracksLimitedErrorsWhenRequested_mg50_mg4717__23.isEmpty());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested_mg63_mg4666() throws Exception {
        String __DSPOT_match_761 = "ndZ{B&m4r:Pnc]J7w5ba";
        String __DSPOT_key_760 = "Z$d^zjp6FP.8[!<,tmxv";
        String __DSPOT_text_9 = "_83OI`-k-a8(J8Bp[$Xd";
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Parser parser = Parser.htmlParser().setTrackErrors(3);
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Document doc = parser.parseInput(html, "http://example.com");
        List<ParseError> errors = parser.getErrors();
        int o_tracksLimitedErrorsWhenRequested_mg63__10 = errors.size();
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        Element o_tracksLimitedErrorsWhenRequested_mg63__17 = doc.text(__DSPOT_text_9);
        Elements o_tracksLimitedErrorsWhenRequested_mg63_mg4666__24 = o_tracksLimitedErrorsWhenRequested_mg63__17.getElementsByAttributeValueContaining(__DSPOT_key_760, __DSPOT_match_761);
        Assert.assertTrue(o_tracksLimitedErrorsWhenRequested_mg63_mg4666__24.isEmpty());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested_mg53_mg5454() throws Exception {
        String __DSPOT_valuePrefix_999 = "SB@>}q_o7Tm(8).8Wk6S";
        String __DSPOT_key_998 = "s(eO|guN@L@dejgsT^X6";
        String __DSPOT_tagName_7 = "%xHdm7#=ToX)D7x>[Bob";
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Parser parser = Parser.htmlParser().setTrackErrors(3);
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Document doc = parser.parseInput(html, "http://example.com");
        List<ParseError> errors = parser.getErrors();
        int o_tracksLimitedErrorsWhenRequested_mg53__10 = errors.size();
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        Element o_tracksLimitedErrorsWhenRequested_mg53__17 = doc.createElement(__DSPOT_tagName_7);
        Elements o_tracksLimitedErrorsWhenRequested_mg53_mg5454__24 = o_tracksLimitedErrorsWhenRequested_mg53__17.getElementsByAttributeValueStarting(__DSPOT_key_998, __DSPOT_valuePrefix_999);
        Assert.assertTrue(o_tracksLimitedErrorsWhenRequested_mg53_mg5454__24.isEmpty());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
    }
}

