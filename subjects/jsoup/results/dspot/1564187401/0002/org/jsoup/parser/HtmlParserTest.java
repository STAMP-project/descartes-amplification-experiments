package org.jsoup.parser;


import java.util.Collection;
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
    public void handlesUnclosedAnchors_add3() throws Exception {
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        Element o_handlesUnclosedAnchors_add3__5 = doc.body();
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).isBlock());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedAnchors_add3__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).hasParent());
        doc.body().html();
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).isBlock());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).hasText());
        Assert.assertFalse(((Collection) (((Element) (o_handlesUnclosedAnchors_add3__5)).getAllElements())).isEmpty());
        Assert.assertTrue(((Element) (o_handlesUnclosedAnchors_add3__5)).hasParent());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg27() throws Exception {
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Parser o_handlesUnclosedAnchors_mg27__7 = doc.parser();
        Assert.assertFalse(((Parser) (o_handlesUnclosedAnchors_mg27__7)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesUnclosedAnchors_mg27__7)).getErrors())).isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesUnclosedAnchors_mg23() throws Exception {
        String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        Document doc = Jsoup.parse(h);
        String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        doc.body().html();
        Document o_handlesUnclosedAnchors_mg23__7 = doc.normalise();
        Assert.assertFalse(((Document) (o_handlesUnclosedAnchors_mg23__7)).isBlock());
        Assert.assertTrue(((Document) (o_handlesUnclosedAnchors_mg23__7)).hasText());
        Assert.assertFalse(((Collection) (((Document) (o_handlesUnclosedAnchors_mg23__7)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (o_handlesUnclosedAnchors_mg23__7)).hasParent());
    }
}

