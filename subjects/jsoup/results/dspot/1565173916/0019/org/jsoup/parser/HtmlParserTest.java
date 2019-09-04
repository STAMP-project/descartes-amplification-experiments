package org.jsoup.parser;


import java.util.Collection;
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
    public void handlesFrames_mg13_mg378() throws Exception {
        String __DSPOT_value_93 = "*`gmH>[A}8/o#n)B( ^q";
        String __DSPOT_key_92 = "KUdhw0!nnrtG]LM{a}Xj";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesFrames_mg13_mg378__13 = o_handlesFrames_mg13__8.getElementsByAttributeValueNot(__DSPOT_key_92, __DSPOT_value_93);
        Assert.assertFalse(o_handlesFrames_mg13_mg378__13.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_mg1038() throws Exception {
        String __DSPOT_searchText_315 = "@=7TNK8vs/Fu`PE8fR%7";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_mg1038__11 = o_handlesFrames_mg14__7.getElementsContainingOwnText(__DSPOT_searchText_315);
        Assert.assertTrue(o_handlesFrames_mg14_mg1038__11.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg310_failAssert0() throws Exception {
        try {
            int __DSPOT_index_62 = -1553486565;
            String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
            o_handlesFrames_mg13__8.child(__DSPOT_index_62);
            org.junit.Assert.fail("handlesFrames_mg13_mg310 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1553486565", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg318_mg7151() throws Exception {
        String __DSPOT_regex_2852 = "e^iyT^I-H&6Bc=aOgZC9";
        String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
        Set<String> o_handlesFrames_mg13_mg318__11 = o_handlesFrames_mg13__8.classNames();
        Elements o_handlesFrames_mg13_mg318_mg7151__15 = o_handlesFrames_mg13__8.getElementsMatchingText(__DSPOT_regex_2852);
        Assert.assertTrue(o_handlesFrames_mg13_mg318_mg7151__15.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg10_mg392_failAssert0_literalMutationString6911_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_regex_109 = "+ D$[[ioj48!dh+bBYGG";
                String __DSPOT_key_108 = "qgP;4/v.v)|C5[:S!JtD";
                String h = "<html><head>script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
                Document doc = Jsoup.parse(h);
                TextUtil.stripNewlines(doc.html());

                Element o_handlesFrames_mg10__7 = doc.body();
                o_handlesFrames_mg10__7.getElementsByAttributeValueMatching(__DSPOT_key_108, __DSPOT_regex_109);
                org.junit.Assert.fail("handlesFrames_mg10_mg392 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("handlesFrames_mg10_mg392_failAssert0_literalMutationString6911 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: + D$[[ioj48!dh+bBYGG", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg13_mg310_failAssert0_mg16120_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_index_62 = -1553486565;
                String __DSPOT_tagName_0 = "&bk*201yCi*OdwpauR%h";
                String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
                Document doc = Jsoup.parse(h);
                TextUtil.stripNewlines(doc.html());

                Element o_handlesFrames_mg13__8 = doc.createElement(__DSPOT_tagName_0);
                o_handlesFrames_mg13__8.child(__DSPOT_index_62);
                org.junit.Assert.fail("handlesFrames_mg13_mg310 should have thrown ArrayIndexOutOfBoundsException");
                o_handlesFrames_mg13__8.previousElementSibling();
            }
            org.junit.Assert.fail("handlesFrames_mg13_mg310_failAssert0_mg16120 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1553486565", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_add919_mg18746() throws Exception {
        String __DSPOT_keyPrefix_8591 = "BA` ][&^XV4<]e@f26pi";
        String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        Document doc = Jsoup.parse(h);
        TextUtil.stripNewlines(doc.html());

        Element o_handlesFrames_mg14_add919__7 = doc.head();
        Element o_handlesFrames_mg14__7 = doc.head();
        Elements o_handlesFrames_mg14_add919_mg18746__14 = o_handlesFrames_mg14_add919__7.getElementsByAttributeStarting(__DSPOT_keyPrefix_8591);
        Assert.assertTrue(o_handlesFrames_mg14_add919_mg18746__14.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesFrames_mg14_add919_mg10073_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_4255 = "d/t!x?j(@r L&wAZpV<|";
            String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
            Document doc = Jsoup.parse(h);
            TextUtil.stripNewlines(doc.html());

            Element o_handlesFrames_mg14_add919__7 = doc.head();
            Element o_handlesFrames_mg14__7 = doc.head();
            o_handlesFrames_mg14_add919__7.getElementsMatchingOwnText(__DSPOT_regex_4255);
            org.junit.Assert.fail("handlesFrames_mg14_add919_mg10073 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
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

