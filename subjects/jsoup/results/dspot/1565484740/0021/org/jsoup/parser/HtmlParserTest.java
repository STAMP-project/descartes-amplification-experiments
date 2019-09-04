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
    public void handleNullContextInParseFragment_literalMutationNumber26_failAssert0() throws Exception {
        try {
            String html = "<ol><li>One</li></ol><p>Two</p>";
            List<Node> nodes = Parser.parseFragment(html, null, "http://example.com/");
            nodes.size();
            nodes.get(0).nodeName();
            StringUtil.normaliseWhitespace(nodes.get(-1).outerHtml());
            org.junit.Assert.fail("handleNullContextInParseFragment_literalMutationNumber26 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handleNullContextInParseFragment_add4() throws Exception {
        String html = "<ol><li>One</li></ol><p>Two</p>";
        List<Node> nodes = Parser.parseFragment(html, null, "http://example.com/");
        int o_handleNullContextInParseFragment_add4__4 = nodes.size();
        Assert.assertEquals(1, ((int) (o_handleNullContextInParseFragment_add4__4)));
        Node o_handleNullContextInParseFragment_add4__5 = nodes.get(0);
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add4__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handleNullContextInParseFragment_add4__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add4__5)).hasText());
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add4__5)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <ol>\n   <li>One</li>\n  </ol>\n  <p>Two</p>\n </body>\n</html>", ((Element) (o_handleNullContextInParseFragment_add4__5)).toString());
        String o_handleNullContextInParseFragment_add4__6 = nodes.get(0).nodeName();
        Assert.assertEquals("html", o_handleNullContextInParseFragment_add4__6);
        StringUtil.normaliseWhitespace(nodes.get(0).outerHtml());
        Assert.assertEquals(1, ((int) (o_handleNullContextInParseFragment_add4__4)));
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add4__5)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handleNullContextInParseFragment_add4__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add4__5)).hasText());
        Assert.assertTrue(((Element) (o_handleNullContextInParseFragment_add4__5)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <ol>\n   <li>One</li>\n  </ol>\n  <p>Two</p>\n </body>\n</html>", ((Element) (o_handleNullContextInParseFragment_add4__5)).toString());
        Assert.assertEquals("html", o_handleNullContextInParseFragment_add4__6);
    }
}

