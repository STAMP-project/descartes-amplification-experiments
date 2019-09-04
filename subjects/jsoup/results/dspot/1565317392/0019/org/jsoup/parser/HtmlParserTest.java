package org.jsoup.parser;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class HtmlParserTest {
    @Test(timeout = 10000)
    public void handlesFrames_mg17() throws Exception {
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Document o_handlesFrames_mg17__7 = doc.normalise();
        Assert.assertFalse(((Collection) (((Document) (o_handlesFrames_mg17__7)).getAllElements())).isEmpty());
        Assert.assertFalse(((Document) (o_handlesFrames_mg17__7)).hasText());
        Assert.assertFalse(((Document) (o_handlesFrames_mg17__7)).isBlock());
        Assert.assertFalse(((Document) (o_handlesFrames_mg17__7)).hasParent());
        Assert.assertEquals("<html>\n <head>\n  <script></script>\n  <noscript></noscript>\n </head>\n <frameset>\n  <frame src=\"foo\">\n  <frame src=\"foo\">\n </frameset>\n <body></body>\n</html>", ((Document) (o_handlesFrames_mg17__7)).toString());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14() throws Exception {
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Assert.assertFalse(((Collection) (((Element) (o_handlesFrames_mg14__7)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_handlesFrames_mg14__7)).hasText());
        Assert.assertTrue(((Element) (o_handlesFrames_mg14__7)).isBlock());
        Assert.assertTrue(((Element) (o_handlesFrames_mg14__7)).hasParent());
        Assert.assertEquals("<head>\n <script></script>\n <noscript></noscript>\n</head>", ((Element) (o_handlesFrames_mg14__7)).toString());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg21() throws Exception {
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Parser o_handlesFrames_mg21__7 = doc.parser();
        Assert.assertFalse(((Parser) (o_handlesFrames_mg21__7)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesFrames_mg21__7)).getErrors())).isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg512() throws Exception {
        String __DSPOT_regex_163 = "M<8e]2c8PS!E+X6u@-w1";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg512__11 = o_handlesFrames_mg14__7.getElementsMatchingText(__DSPOT_regex_163);
        Assert.assertTrue(o_handlesFrames_mg14_mg512__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg478() throws Exception {
        String __DSPOT_match_127 = "a6sRDg-zRApBXKD>MAy9";
        String __DSPOT_key_126 = "y <3bSwN_qZeEg/gcm:C";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg478__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueContaining(__DSPOT_key_126, __DSPOT_match_127);
        Assert.assertTrue(o_handlesFrames_mg13_mg478__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg480() throws Exception {
        String __DSPOT_valueSuffix_131 = "R]FMwAeMp&sZ9q!M32Z7";
        String __DSPOT_key_130 = "dc]DGfHBMlswlSSUhwIb";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg480__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueEnding(__DSPOT_key_130, __DSPOT_valueSuffix_131);
        Assert.assertTrue(o_handlesFrames_mg13_mg480__13.isEmpty());
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

