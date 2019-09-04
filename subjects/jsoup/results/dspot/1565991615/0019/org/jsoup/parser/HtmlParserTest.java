package org.jsoup.parser;


import java.util.Collection;
import java.util.Collections;
import java.util.Set;
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
    public void handlesFrames_mg13_mg361() throws Exception {
        int __DSPOT_index_83 = 2012273211;
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg361__12 = o_handlesFrames_mg13__8.getElementsByIndexEquals(__DSPOT_index_83);
        Assert.assertTrue(o_handlesFrames_mg13_mg361__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg912() throws Exception {
        String __DSPOT_searchText_286 = "/j.?.Rx[_@Zl,@8|><yr";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg912__11 = o_handlesFrames_mg14__7.getElementsContainingText(__DSPOT_searchText_286);
        Assert.assertTrue(o_handlesFrames_mg14_mg912__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg913() throws Exception {
        String __DSPOT_regex_287 = "4]?#7Z;#Ib/>ZJL:BhN+";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg913__11 = o_handlesFrames_mg14__7.getElementsMatchingOwnText(__DSPOT_regex_287);
        Assert.assertTrue(o_handlesFrames_mg14_mg913__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg388_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_110 = "0]_^tFCqr,tX[gb 2Pqg";
            String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
            o_handlesFrames_mg13__8.getElementsMatchingOwnText(__DSPOT_regex_110);
            org.junit.Assert.fail("handlesFrames_mg13_mg388 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 0]_^tFCqr,tX[gb 2Pqg", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg423_mg17707_failAssert0() throws Exception {
        try {
            int __DSPOT_index_8071 = -1408596710;
            String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
            Elements o_handlesFrames_mg13_mg423__11 = o_handlesFrames_mg13__8.previousElementSiblings();
            o_handlesFrames_mg13_mg423__11.eq(__DSPOT_index_8071);
            org.junit.Assert.fail("handlesFrames_mg13_mg423_mg17707 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1408596710", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg829_mg14621() throws Exception {
        String __DSPOT_match_6629 = "I_deVw#uA5w7$v`!$26$";
        String __DSPOT_key_6628 = "y4&DoW_]$Z=lL^3=(S?3";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        boolean o_handlesFrames_mg14_mg829__10 = doc.updateMetaCharsetElement();
        Elements o_handlesFrames_mg14_mg829_mg14621__15 = o_handlesFrames_mg14__7.getElementsByAttributeValueContaining(__DSPOT_key_6628, __DSPOT_match_6629);
        Assert.assertTrue(o_handlesFrames_mg14_mg829_mg14621__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg873_mg9480() throws Exception {
        String __DSPOT_regex_4113 = "!}TS H|I|@^3V}Jh3D:5";
        String __DSPOT_key_4111 = "kz@JH93?og9PwQo[Gi{W";
        Set<String> __DSPOT_classNames_260 = Collections.<String>emptySet();
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Element o_handlesFrames_mg14_mg873__12 = o_handlesFrames_mg14__7.classNames(__DSPOT_classNames_260);
        Elements o_handlesFrames_mg14_mg873_mg9480__17 = o_handlesFrames_mg14__7.getElementsByAttributeValueMatching(__DSPOT_key_4111, __DSPOT_regex_4113);
        Assert.assertTrue(o_handlesFrames_mg14_mg873_mg9480__17.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg211_mg6814() throws Exception {
        String __DSPOT_searchText_2848 = ":!&ffG0+B=!H.GkJd)[R";
        Document.OutputSettings __DSPOT_outputSettings_12 = new Document.OutputSettings();
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Document o_handlesFrames_mg13_mg211__13 = doc.outputSettings(__DSPOT_outputSettings_12);
        Elements o_handlesFrames_mg13_mg211_mg6814__17 = o_handlesFrames_mg13__8.getElementsContainingOwnText(__DSPOT_searchText_2848);
        Assert.assertTrue(o_handlesFrames_mg13_mg211_mg6814__17.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg194_mg5218() throws Exception {
        String __DSPOT_valueSuffix_2077 = "=SL>yrue$/%fh0C[CUpG";
        String __DSPOT_key_2076 = "(f%+#ne4t(W{[iIfyj;P";
        String __DSPOT_tagName_7 = "#S&Gu4*{9Gi}cRQHCH3r";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Element o_handlesFrames_mg13_mg194__12 = doc.createElement(__DSPOT_tagName_7);
        Elements o_handlesFrames_mg13_mg194_mg5218__17 = o_handlesFrames_mg13_mg194__12.getElementsByAttributeValueEnding(__DSPOT_key_2076, __DSPOT_valueSuffix_2077);
        Assert.assertTrue(o_handlesFrames_mg13_mg194_mg5218__17.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg17_mg980_mg3912() throws Exception {
        String __DSPOT_valuePrefix_1445 = "g+;Oo$e(XqUP*nLt=(10";
        String __DSPOT_key_1443 = "A@/VS}P;%/dzohqt>>;8";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Document o_handlesFrames_mg17__7 = doc.normalise();
        Element o_handlesFrames_mg17_mg980__10 = doc.head();
        Elements o_handlesFrames_mg17_mg980_mg3912__15 = o_handlesFrames_mg17_mg980__10.getElementsByAttributeValueStarting(__DSPOT_key_1443, __DSPOT_valuePrefix_1445);
        Assert.assertTrue(o_handlesFrames_mg17_mg980_mg3912__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg372_mg18820() throws Exception {
        String __DSPOT_regex_8576 = "KeI3+uB`q4eoz2i8 kt&";
        int __DSPOT_index_98 = -2111982053;
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg372__12 = o_handlesFrames_mg13__8.getElementsByIndexLessThan(__DSPOT_index_98);
        Elements o_handlesFrames_mg13_mg372_mg18820__16 = o_handlesFrames_mg13__8.getElementsMatchingText(__DSPOT_regex_8576);
        Assert.assertTrue(o_handlesFrames_mg13_mg372_mg18820__16.isEmpty());
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

