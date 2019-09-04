package org.jsoup.parser;


import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
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
        Assert.assertFalse(((Collection) (((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).hasText());
        Assert.assertFalse(((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <p>One</p>&amp;arrgh;\n  <font></font>\n  <br>\n </body>\n</html>", ((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).toString());
        Assert.assertFalse(((Document) (o_tracksLimitedErrorsWhenRequested_mg57__16)).hasParent());
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
        Assert.assertFalse(((Collection) (((Element) (o_tracksLimitedErrorsWhenRequested_mg54__16)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_tracksLimitedErrorsWhenRequested_mg54__16)).hasText());
        Assert.assertTrue(((Element) (o_tracksLimitedErrorsWhenRequested_mg54__16)).isBlock());
        Assert.assertTrue(((Element) (o_tracksLimitedErrorsWhenRequested_mg54__16)).hasParent());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested_mg54__9)));
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested_literalMutationString28_literalMutationString2425_failAssert0() throws Exception {
        try {
            String html = "1Ouksq %9=__2uK] fk&zdUA}ta^p[a+9MOHI<:##Gs!n`(S#,%#dY:3ia]G";
            Parser parser = Parser.htmlParser().setTrackErrors(3);
            Document doc = parser.parseInput(html, "zgYc TM1`_8;0L`A=S");
            List<ParseError> errors = parser.getErrors();
            int o_tracksLimitedErrorsWhenRequested_literalMutationString28__9 = errors.size();
            errors.get(0).toString();
            errors.get(1).toString();
            errors.get(2).toString();
            org.junit.Assert.fail("tracksLimitedErrorsWhenRequested_literalMutationString28_literalMutationString2425 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index 1 out of bounds for length 1", expected.getMessage());
        }
    }
}

