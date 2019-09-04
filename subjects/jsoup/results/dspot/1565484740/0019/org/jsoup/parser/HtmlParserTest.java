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
    public void handlesFrames_mg14_mg889_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_287 = "o7?!rRJQ:ZU(u=(1.&Kg";
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg14__7 = doc.head();
            o_handlesFrames_mg14__7.getElementsMatchingText(__DSPOT_regex_287);
            org.junit.Assert.fail("handlesFrames_mg14_mg889 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: o7?!rRJQ:ZU(u=(1.&Kg", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg370() throws Exception {
        String __DSPOT_value_93 = "}Xj*`gmH>[A}8/o#n)B(";
        String __DSPOT_key_92 = "a[[KUdhw0!nnrtG]LM{a";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg370__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueNot(__DSPOT_key_92, __DSPOT_value_93);
        Assert.assertFalse(o_handlesFrames_mg13_mg370__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg371() throws Exception {
        String __DSPOT_valuePrefix_95 = "mgdhAD^|dc@;rWqb8+-h";
        String __DSPOT_key_94 = " ^qB(YasZ%ds TuK*Yo^";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg371__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueStarting(__DSPOT_key_94, __DSPOT_valuePrefix_95);
        Assert.assertTrue(o_handlesFrames_mg13_mg371__13.isEmpty());
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

