package org.jsoup.parser;


import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
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
    public void testSelectWithOption_mg33_mg3580() throws Exception {
        String __DSPOT_value_1048 = "=ic8:KL-L74r1@oKmx5.";
        String __DSPOT_key_1047 = "#t[OEI_b%*epy?.]!=Hw";
        String __DSPOT_tagName_7 = "l V!3a(!.#b{[Iz>YSe|";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg33__4 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg33__4)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg33__4)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg33__7 = parser.getErrors().size();
        Element o_testSelectWithOption_mg33__9 = document.createElement(__DSPOT_tagName_7);
        Elements o_testSelectWithOption_mg33_mg3580__18 = o_testSelectWithOption_mg33__9.getElementsByAttributeValueNot(__DSPOT_key_1047, __DSPOT_value_1048);
        Assert.assertFalse(o_testSelectWithOption_mg33_mg3580__18.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg33__4)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg33__4)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg25_mg941() throws Exception {
        String __DSPOT_valueSuffix_213 = "]3#C6HvQ{7`[>;YwP/8[";
        String __DSPOT_key_212 = ".u#+<3OqUn7j)v@[9ZFe";
        String __DSPOT_baseUri_2 = "g[?i!rb0/|]6^FT)-ef&";
        Element __DSPOT_context_1 = new Element("/woO!OKS@Rl&{ha!&Bcv");
        String __DSPOT_fragment_0 = "U&zgYc TM1`_8;0L`A=S";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg25__7 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg25__7)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg25__7)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg25__10 = parser.getErrors().size();
        List<Node> o_testSelectWithOption_mg25__12 = parser.parseFragmentInput(__DSPOT_fragment_0, __DSPOT_context_1, __DSPOT_baseUri_2);
        Elements o_testSelectWithOption_mg25_mg941__21 = __DSPOT_context_1.getElementsByAttributeValueEnding(__DSPOT_key_212, __DSPOT_valueSuffix_213);
        Assert.assertTrue(o_testSelectWithOption_mg25_mg941__21.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg25__7)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg25__7)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg34_mg4094() throws Exception {
        String __DSPOT_match_1258 = ")ESAx0tsFruMnRnn{M=e";
        String __DSPOT_key_1257 = "A>my[TZ<_):-p&J^>#9!";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg34__3 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg34__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg34__3)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg34__6 = parser.getErrors().size();
        Element o_testSelectWithOption_mg34__8 = document.head();
        Elements o_testSelectWithOption_mg34_mg4094__17 = o_testSelectWithOption_mg34__8.getElementsByAttributeValueContaining(__DSPOT_key_1257, __DSPOT_match_1258);
        Assert.assertTrue(o_testSelectWithOption_mg34_mg4094__17.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg34__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg34__3)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg25_mg950() throws Exception {
        int __DSPOT_index_221 = 1882593549;
        String __DSPOT_baseUri_2 = "g[?i!rb0/|]6^FT)-ef&";
        Element __DSPOT_context_1 = new Element("/woO!OKS@Rl&{ha!&Bcv");
        String __DSPOT_fragment_0 = "U&zgYc TM1`_8;0L`A=S";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg25__7 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg25__7)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg25__7)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg25__10 = parser.getErrors().size();
        List<Node> o_testSelectWithOption_mg25__12 = parser.parseFragmentInput(__DSPOT_fragment_0, __DSPOT_context_1, __DSPOT_baseUri_2);
        Elements o_testSelectWithOption_mg25_mg950__20 = __DSPOT_context_1.getElementsByIndexEquals(__DSPOT_index_221);
        Assert.assertTrue(o_testSelectWithOption_mg25_mg950__20.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg25__7)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg25__7)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg30_mg3685() throws Exception {
        String __DSPOT_searchText_1111 = "C`MM5 6lt8K/I&,WHb#y";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg30__3 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg30__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg30__3)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg30__6 = parser.getErrors().size();
        Element o_testSelectWithOption_mg30__8 = document.body();
        Elements o_testSelectWithOption_mg30_mg3685__16 = o_testSelectWithOption_mg30__8.getElementsContainingOwnText(__DSPOT_searchText_1111);
        Assert.assertTrue(o_testSelectWithOption_mg30_mg3685__16.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg30__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg30__3)).isTrackErrors());
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

