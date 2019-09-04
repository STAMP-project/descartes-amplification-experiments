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
    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }

    @Test(timeout = 10000)
    public void handleNullContextInParseFragment_add7() throws Exception {
        String html = "<ol><li>One</li></ol><p>Two</p>";
        List<Node> nodes = Parser.parseFragment(html, null, "http://example.com/");
        int o_handleNullContextInParseFragment_add7__4 = nodes.size();
        Assert.assertEquals(1, ((int) (o_handleNullContextInParseFragment_add7__4)));
        String o_handleNullContextInParseFragment_add7__5 = nodes.get(0).nodeName();
        Assert.assertEquals("html", o_handleNullContextInParseFragment_add7__5);
        Node o_handleNullContextInParseFragment_add7__7 = nodes.get(0);
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add7__7)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handleNullContextInParseFragment_add7__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add7__7)).hasText());
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add7__7)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <ol>\n   <li>One</li>\n  </ol>\n  <p>Two</p>\n </body>\n</html>", ((Element) (o_handleNullContextInParseFragment_add7__7)).toString());
        StringUtil.normaliseWhitespace(nodes.get(0).outerHtml());
        Assert.assertEquals(1, ((int) (o_handleNullContextInParseFragment_add7__4)));
        Assert.assertEquals("html", o_handleNullContextInParseFragment_add7__5);
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add7__7)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handleNullContextInParseFragment_add7__7)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add7__7)).hasText());
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add7__7)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <ol>\n   <li>One</li>\n  </ol>\n  <p>Two</p>\n </body>\n</html>", ((Element) (o_handleNullContextInParseFragment_add7__7)).toString());
    }

    @Test(timeout = 10000)
    public void handleNullContextInParseFragment_literalMutationString13() throws Exception {
        String html = "<ol><l*>One</li></ol><p>Two</p>";
        List<Node> nodes = Parser.parseFragment(html, null, "http://example.com/");
        int o_handleNullContextInParseFragment_literalMutationString13__4 = nodes.size();
        Assert.assertEquals(1, ((int) (o_handleNullContextInParseFragment_literalMutationString13__4)));
        String o_handleNullContextInParseFragment_literalMutationString13__5 = nodes.get(0).nodeName();
        Assert.assertEquals("html", o_handleNullContextInParseFragment_literalMutationString13__5);
        StringUtil.normaliseWhitespace(nodes.get(0).outerHtml());
        Assert.assertEquals(1, ((int) (o_handleNullContextInParseFragment_literalMutationString13__4)));
        Assert.assertEquals("html", o_handleNullContextInParseFragment_literalMutationString13__5);
    }
}

