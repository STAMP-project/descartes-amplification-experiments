package org.jsoup.parser;


import java.util.Collection;
import java.util.regex.Pattern;
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
    public void handlesFrames_mg13_mg485() throws Exception {
        String __DSPOT_regex_173 = "TS.]OYfXPAPo4#Scpv.2";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg485__12 = o_handlesFrames_mg13__8.getElementsMatchingText(__DSPOT_regex_173);
        Assert.assertTrue(o_handlesFrames_mg13_mg485__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg450() throws Exception {
        String __DSPOT_valuePrefix_143 = "/P@+R(zMS(6z5UD;Ypk[";
        String __DSPOT_key_142 = "XKD>MAy9vP&R!O-N%<T:";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg450__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueStarting(__DSPOT_key_142, __DSPOT_valuePrefix_143);
        Assert.assertTrue(o_handlesFrames_mg13_mg450__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg483() throws Exception {
        String __DSPOT_searchText_171 = "=zq=$5-^b!lcEWMHUZo@";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg483__12 = o_handlesFrames_mg13__8.getElementsContainingText(__DSPOT_searchText_171);
        Assert.assertTrue(o_handlesFrames_mg13_mg483__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg478() throws Exception {
        String __DSPOT_searchText_166 = "de!kAeH-.^dDUAFL e^.";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg478__12 = o_handlesFrames_mg13__8.getElementsContainingOwnText(__DSPOT_searchText_166);
        Assert.assertTrue(o_handlesFrames_mg13_mg478__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg321() throws Exception {
        Pattern __DSPOT_pattern_60 = null;
        String __DSPOT_key_59 = "/H}*7Gs7)F5:K|}Y.+DP";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg321__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueMatching(__DSPOT_key_59, __DSPOT_pattern_60);
        Assert.assertTrue(o_handlesFrames_mg13_mg321__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg449() throws Exception {
        String __DSPOT_value_141 = "Eg/gcm:Ca6sRDg-zRApB";
        String __DSPOT_key_140 = "SG#JnI[]y <3bSwN_qZe";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg449__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueNot(__DSPOT_key_140, __DSPOT_value_141);
        Assert.assertFalse(o_handlesFrames_mg13_mg449__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg850_mg1888() throws Exception {
        int __DSPOT_index_436 = -283482535;
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Element o_handlesFrames_mg14_mg850__10 = o_handlesFrames_mg14__7.empty();
        Elements o_handlesFrames_mg14_mg850_mg1888__14 = o_handlesFrames_mg14__7.getElementsByIndexEquals(__DSPOT_index_436);
        Assert.assertTrue(o_handlesFrames_mg14_mg850_mg1888__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg898_mg14526_failAssert0() throws Exception {
        try {
            int __DSPOT_index_6587 = -2112383603;
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg14__7 = doc.head();
            Element o_handlesFrames_mg14_mg898__10 = o_handlesFrames_mg14__7.parent();
            o_handlesFrames_mg14__7.child(__DSPOT_index_6587);
            org.junit.Assert.fail("handlesFrames_mg14_mg898_mg14526 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2112383603", expected.getMessage());
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

