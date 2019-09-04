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
    public void testSelectWithOption_mg30_mg4581() throws Exception {
        String __DSPOT_searchText_1455 = "e))q[qNBd_ip8+l4Zt D";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg30__3 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg30__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg30__3)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg30__6 = parser.getErrors().size();
        Element o_testSelectWithOption_mg30__8 = document.body();
        Elements o_testSelectWithOption_mg30_mg4581__16 = o_testSelectWithOption_mg30__8.getElementsContainingText(__DSPOT_searchText_1455);
        Assert.assertTrue(o_testSelectWithOption_mg30_mg4581__16.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg30__3)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg30__3)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg43_mg3703() throws Exception {
        int __DSPOT_index_1099 = -169002258;
        String __DSPOT_text_9 = "xHdm7#=ToX)D7x>[Bob5";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg43__4 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg43__4)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg43__4)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg43__7 = parser.getErrors().size();
        Element o_testSelectWithOption_mg43__9 = document.text(__DSPOT_text_9);
        Elements o_testSelectWithOption_mg43_mg3703__17 = o_testSelectWithOption_mg43__9.getElementsByIndexEquals(__DSPOT_index_1099);
        Assert.assertTrue(o_testSelectWithOption_mg43_mg3703__17.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg43__4)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg43__4)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg33_mg3962() throws Exception {
        String __DSPOT_searchText_1205 = ")uQOJ[5_&aRoLe!m)OkD";
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
        Elements o_testSelectWithOption_mg33_mg3962__17 = o_testSelectWithOption_mg33__9.getElementsContainingOwnText(__DSPOT_searchText_1205);
        Assert.assertTrue(o_testSelectWithOption_mg33_mg3962__17.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg33__4)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg33__4)).isTrackErrors());
    }

    @Test(timeout = 10000)
    public void testSelectWithOption_mg43_mg3691() throws Exception {
        String __DSPOT_match_1088 = "Gy22<Ty`TI]JEt[0RI8-";
        String __DSPOT_key_1087 = "I0wXBnWuO!eu(at.iN$n";
        String __DSPOT_text_9 = "xHdm7#=ToX)D7x>[Bob5";
        Parser parser = Parser.htmlParser();
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Parser o_testSelectWithOption_mg43__4 = parser.setTrackErrors(10);
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg43__4)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg43__4)).isTrackErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption_mg43__7 = parser.getErrors().size();
        Element o_testSelectWithOption_mg43__9 = document.text(__DSPOT_text_9);
        Elements o_testSelectWithOption_mg43_mg3691__18 = o_testSelectWithOption_mg43__9.getElementsByAttributeValueContaining(__DSPOT_key_1087, __DSPOT_match_1088);
        Assert.assertTrue(o_testSelectWithOption_mg43_mg3691__18.isEmpty());
        Assert.assertTrue(((Collection) (((Parser) (parser)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_testSelectWithOption_mg43__4)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption_mg43__4)).isTrackErrors());
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

