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
    public void handlesFrames_mg13_mg471() throws Exception {
        String __DSPOT_valuePrefix_133 = "sv>Bx*R0oQx`#S=-MZ,L";
        String __DSPOT_key_132 = "8Xh}`e!,3/H!B>(rYhJj";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg471__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueStarting(__DSPOT_key_132, __DSPOT_valuePrefix_133);
        Assert.assertTrue(o_handlesFrames_mg13_mg471__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg449() throws Exception {
        String __DSPOT_match_103 = ">6Om:]zsR!qjgSF<3#]s";
        String __DSPOT_key_102 = "BYGG!0gGi?=}tR?SY{S>";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg449__12 = o_handlesFrames_mg14__7.getElementsByAttributeValueContaining(__DSPOT_key_102, __DSPOT_match_103);
        Assert.assertTrue(o_handlesFrames_mg14_mg449__12.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg490_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_146 = "8cC[Ga?A(>iJy:v}SV5H";
            String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
            o_handlesFrames_mg13__8.getElementsMatchingOwnText(__DSPOT_regex_146);
            org.junit.Assert.fail("handlesFrames_mg13_mg490 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 8cC[Ga?A(>iJy:v}SV5H", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg401_failAssert0() throws Exception {
        try {
            int __DSPOT_index_83 = -2057911274;
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg14__7 = doc.head();
            o_handlesFrames_mg14__7.child(__DSPOT_index_83);
            org.junit.Assert.fail("handlesFrames_mg14_mg401 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2057911274", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_literalMutationString300_mg17891() throws Exception {
        String __DSPOT_valueSuffix_8344 = "#^y*^N6/qz|A7T&s2`Z^";
        String __DSPOT_key_8343 = "o>SH8(fK1(h_8IP4Vws_";
        String h = "";
        Assert.assertEquals("", h);
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_literalMutationString300_mg17891__12 = o_handlesFrames_mg14__7.getElementsByAttributeValueEnding(__DSPOT_key_8343, __DSPOT_valueSuffix_8344);
        Assert.assertTrue(o_handlesFrames_mg14_literalMutationString300_mg17891__12.isEmpty());
        Assert.assertEquals("", h);
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_literalMutationString300_mg17895() throws Exception {
        String __DSPOT_value_8348 = "N@U*_Lp)$5F9cHHHs0B$";
        String __DSPOT_key_8347 = "klkmx8wZx?U6X*ezG;?]";
        String h = "";
        Assert.assertEquals("", h);
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_literalMutationString300_mg17895__12 = o_handlesFrames_mg14__7.getElementsByAttributeValueNot(__DSPOT_key_8347, __DSPOT_value_8348);
        Assert.assertFalse(o_handlesFrames_mg14_literalMutationString300_mg17895__12.isEmpty());
        Assert.assertEquals("", h);
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg474_mg13384() throws Exception {
        String __DSPOT_regex_6086 = "]7-h;.$K]*^cow=&KV!p";
        String __DSPOT_key_6085 = "#XuSJ{8,l|}H-Uu`{p2K";
        int __DSPOT_index_131 = 1590515262;
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg474__11 = o_handlesFrames_mg14__7.getElementsByIndexGreaterThan(__DSPOT_index_131);
        Elements o_handlesFrames_mg14_mg474_mg13384__16 = o_handlesFrames_mg14__7.getElementsByAttributeValueMatching(__DSPOT_key_6085, __DSPOT_regex_6086);
        Assert.assertTrue(o_handlesFrames_mg14_mg474_mg13384__16.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg570_mg3253() throws Exception {
        String __DSPOT_searchText_1140 = "gYG4]&r2n8Xhy7)l4|g=";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Element o_handlesFrames_mg14_mg570__10 = o_handlesFrames_mg14__7.shallowClone();
        Elements o_handlesFrames_mg14_mg570_mg3253__14 = o_handlesFrames_mg14_mg570__10.getElementsContainingText(__DSPOT_searchText_1140);
        Assert.assertTrue(o_handlesFrames_mg14_mg570_mg3253__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg397_mg14803() throws Exception {
        String __DSPOT_keyPrefix_6781 = "5W RN!rzvqXL0!RYOMGo";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        String o_handlesFrames_mg14_mg397__10 = o_handlesFrames_mg14__7.baseUri();
        Assert.assertEquals("", o_handlesFrames_mg14_mg397__10);
        Elements o_handlesFrames_mg14_mg397_mg14803__14 = o_handlesFrames_mg14__7.getElementsByAttributeStarting(__DSPOT_keyPrefix_6781);
        Assert.assertTrue(o_handlesFrames_mg14_mg397_mg14803__14.isEmpty());
        Assert.assertEquals("", o_handlesFrames_mg14_mg397__10);
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg573_mg13841() throws Exception {
        String __DSPOT_searchText_6309 = "WcGm:U6Uz?]/Tsw4.;uB";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg573__10 = o_handlesFrames_mg14__7.siblingElements();
        Elements o_handlesFrames_mg14_mg573_mg13841__14 = o_handlesFrames_mg14__7.getElementsContainingOwnText(__DSPOT_searchText_6309);
        Assert.assertTrue(o_handlesFrames_mg14_mg573_mg13841__14.isEmpty());
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

