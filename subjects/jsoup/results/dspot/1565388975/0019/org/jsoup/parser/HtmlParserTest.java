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
    public void handlesFrames_mg13_mg474() throws Exception {
        String __DSPOT_regex_102 = "mns*tG=FjE&}Qd4 Iz;o";
        String __DSPOT_key_101 = "{;2P#e;yT1.?>.gB?2l[";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg474__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueMatching(__DSPOT_key_101, __DSPOT_regex_102);
        Assert.assertTrue(o_handlesFrames_mg13_mg474__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg537() throws Exception {
        String __DSPOT_valuePrefix_167 = "]vnwH5v=i}`yj$kCCh?t";
        String __DSPOT_key_166 = "!Y^e-eGm$:fw+YQ6rq<W";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg537__12 = o_handlesFrames_mg14__7.getElementsByAttributeValueStarting(__DSPOT_key_166, __DSPOT_valuePrefix_167);
        Assert.assertTrue(o_handlesFrames_mg14_mg537__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg555_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_177 = "+LZ(B%Q=,R/: .in5MN*";
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg14__7 = doc.head();
            o_handlesFrames_mg14__7.getElementsMatchingText(__DSPOT_regex_177);
            org.junit.Assert.fail("handlesFrames_mg14_mg555 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg583_mg15289() throws Exception {
        String __DSPOT_valueSuffix_7233 = "eE|rmnU#lo&IEsX}Fvkx";
        String __DSPOT_key_7232 = "7a!9[sZyElWYk9QI#h9b";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Element o_handlesFrames_mg14_mg583__10 = o_handlesFrames_mg14__7.parent();
        Elements o_handlesFrames_mg14_mg583_mg15289__15 = o_handlesFrames_mg14__7.getElementsByAttributeValueEnding(__DSPOT_key_7232, __DSPOT_valueSuffix_7233);
        Assert.assertTrue(o_handlesFrames_mg14_mg583_mg15289__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg588_mg22226() throws Exception {
        int __DSPOT_index_10613 = 149997254;
        String __DSPOT_text_192 = "vKHTt73Ga%21isI%atY*";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Element o_handlesFrames_mg14_mg588__11 = o_handlesFrames_mg14__7.prependText(__DSPOT_text_192);
        Elements o_handlesFrames_mg14_mg588_mg22226__15 = o_handlesFrames_mg14_mg588__11.getElementsByIndexEquals(__DSPOT_index_10613);
        Assert.assertTrue(o_handlesFrames_mg14_mg588_mg22226__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg588_mg22019() throws Exception {
        String __DSPOT_keyPrefix_10481 = "acy@_&I:!0Q1F@?+NOBM";
        String __DSPOT_text_192 = "vKHTt73Ga%21isI%atY*";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Element o_handlesFrames_mg14_mg588__11 = o_handlesFrames_mg14__7.prependText(__DSPOT_text_192);
        Elements o_handlesFrames_mg14_mg588_mg22019__15 = o_handlesFrames_mg14__7.getElementsByAttributeStarting(__DSPOT_keyPrefix_10481);
        Assert.assertTrue(o_handlesFrames_mg14_mg588_mg22019__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg500_mg17214() throws Exception {
        String __DSPOT_searchText_8181 = "I5@n_>-M{_x]]^R$ubl5";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Element o_handlesFrames_mg14_mg500__10 = o_handlesFrames_mg14__7.empty();
        Elements o_handlesFrames_mg14_mg500_mg17214__14 = o_handlesFrames_mg14_mg500__10.getElementsContainingOwnText(__DSPOT_searchText_8181);
        Assert.assertTrue(o_handlesFrames_mg14_mg500_mg17214__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg195_mg12613() throws Exception {
        String __DSPOT_searchText_5872 = "%BTLLw[:g}B2h[_Asm6F";
        String __DSPOT_tagName_8 = "2[gaNZ#S&Gu4*{9Gi}cR";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Element o_handlesFrames_mg13_mg195__12 = doc.createElement(__DSPOT_tagName_8);
        Elements o_handlesFrames_mg13_mg195_mg12613__16 = o_handlesFrames_mg13__8.getElementsContainingText(__DSPOT_searchText_5872);
        Assert.assertTrue(o_handlesFrames_mg13_mg195_mg12613__16.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg574_mg18684() throws Exception {
        String __DSPOT_regex_8867 = "zg]sz!TsH35RdU5KDZ+P";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg574__10 = o_handlesFrames_mg14__7.nextElementSiblings();
        Elements o_handlesFrames_mg14_mg574_mg18684__14 = o_handlesFrames_mg14__7.getElementsMatchingOwnText(__DSPOT_regex_8867);
        Assert.assertTrue(o_handlesFrames_mg14_mg574_mg18684__14.isEmpty());
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

