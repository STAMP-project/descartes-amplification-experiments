package org.jsoup.parser;


import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class HtmlParserTest {
    @Test(timeout = 10000)
    public void testSelectWithOption() throws Exception {
        Parser parser = Parser.htmlParser();
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Parser o_testSelectWithOption__3 = parser.setTrackErrors(10);
        Assert.assertTrue(((Parser) (o_testSelectWithOption__3)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption__3)).getErrors())).isEmpty());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption__6 = parser.getErrors().size();
        Assert.assertEquals(0, ((int) (o_testSelectWithOption__6)));
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption__3)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption__3)).getErrors())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_rv54() throws Exception {
        String __DSPOT_baseUri_14 = "@T5!^MYU(dM7KJ&><6yc";
        Element __DSPOT_context_13 = new Element("5_w)+KtmI6N*:lKC*+{5");
        String __DSPOT_fragment_12 = "Q7-#sa<}t>?]?7gchsEp";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser __DSPOT_invoc_3 = parser.setTrackErrors(10);
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_rv54__12 = parser.getErrors().size();
        Assert.assertEquals(0, ((int) (o_testSelectWithOption_rv54__12)));
        List<Node> o_testSelectWithOption_rv54__14 = __DSPOT_invoc_3.parseFragmentInput(__DSPOT_fragment_12, __DSPOT_context_13, __DSPOT_baseUri_14);
        Assert.assertFalse(o_testSelectWithOption_rv54__14.isEmpty());
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertEquals(0, ((int) (o_testSelectWithOption_rv54__12)));
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg37() throws Exception {
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg37__3 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg37__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg37__3)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg37__6 = parser.getErrors().size();
        Assert.assertEquals(0, ((int) (o_testSelectWithOption_mg37__6)));
        Document o_testSelectWithOption_mg37__8 = document.normalise();
        Assert.assertFalse(((Document) (o_testSelectWithOption_mg37__8)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_testSelectWithOption_mg37__8)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_testSelectWithOption_mg37__8)).hasText());
        Assert.assertFalse(((Document) (o_testSelectWithOption_mg37__8)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <select><option>Option 1</option></select>\n </body>\n</html>", ((Document) (o_testSelectWithOption_mg37__8)).toString());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg37__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg37__3)).isTrackErrors());
        Assert.assertEquals(0, ((int) (o_testSelectWithOption_mg37__6)));
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg34() throws Exception {
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg34__3 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg34__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg34__3)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg34__6 = parser.getErrors().size();
        Assert.assertEquals(0, ((int) (o_testSelectWithOption_mg34__6)));
        Element o_testSelectWithOption_mg34__8 = document.head();
        Assert.assertTrue(((Element) (o_testSelectWithOption_mg34__8)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_testSelectWithOption_mg34__8)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_testSelectWithOption_mg34__8)).hasText());
        Assert.assertTrue(((Element) (o_testSelectWithOption_mg34__8)).hasParent());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg34__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg34__3)).isTrackErrors());
        Assert.assertEquals(0, ((int) (o_testSelectWithOption_mg34__6)));
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_literalMutationString16() throws Exception {
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_literalMutationString16__3 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_literalMutationString16__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_literalMutationString16__3)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</o*tion></select>", "http://jsoup.org");
        int o_testSelectWithOption_literalMutationString16__6 = parser.getErrors().size();
        Assert.assertEquals(1, ((int) (o_testSelectWithOption_literalMutationString16__6)));
        Assert.assertFalse(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Collection) (((Parser) (o_testSelectWithOption_literalMutationString16__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_literalMutationString16__3)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg33_mg3707_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_1086 = "& $Z(f%gq*yg9SNkie1L";
            String __DSPOT_tagName_7 = "l V!3a(!.#b{[Iz>YSe|";
            Parser parser = Parser.htmlParser();
            Parser o_testSelectWithOption_mg33__4 = parser.setTrackErrors(10);
            Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
            int o_testSelectWithOption_mg33__7 = parser.getErrors().size();
            Element o_testSelectWithOption_mg33__9 = document.createElement(__DSPOT_tagName_7);
            o_testSelectWithOption_mg33__9.getElementsMatchingOwnText(__DSPOT_regex_1086);
            org.junit.Assert.fail("testSelectWithOption_mg33_mg3707 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: & $Z(f%gq*yg9SNkie1L", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg25_mg954_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_231 = "{%=kav)LA|PjLTh9Ov(Z";
            String __DSPOT_baseUri_2 = "g[?i!rb0/|]6^FT)-ef&";
            Element __DSPOT_context_1 = new Element("/woO!OKS@Rl&{ha!&Bcv");
            String __DSPOT_fragment_0 = "U&zgYc TM1`_8;0L`A=S";
            Parser parser = Parser.htmlParser();
            Parser o_testSelectWithOption_mg25__7 = parser.setTrackErrors(10);
            Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
            int o_testSelectWithOption_mg25__10 = parser.getErrors().size();
            List<Node> o_testSelectWithOption_mg25__12 = parser.parseFragmentInput(__DSPOT_fragment_0, __DSPOT_context_1, __DSPOT_baseUri_2);
            __DSPOT_context_1.getElementsMatchingText(__DSPOT_regex_231);
            org.junit.Assert.fail("testSelectWithOption_mg25_mg954 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: {%=kav)LA|PjLTh9Ov(Z", expected.getMessage());
        }
    }

    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }
}

