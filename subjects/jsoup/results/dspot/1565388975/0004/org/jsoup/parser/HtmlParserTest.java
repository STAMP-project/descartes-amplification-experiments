package org.jsoup.parser;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
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
    public void handlesSpanInTbody_mg37() throws Exception {
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg37__5 = doc.select("span").first().children().size();
        Assert.assertEquals(0, ((int) (o_handlesSpanInTbody_mg37__5)));
        int o_handlesSpanInTbody_mg37__9 = doc.select("table").size();
        Assert.assertEquals(1, ((int) (o_handlesSpanInTbody_mg37__9)));
        Parser o_handlesSpanInTbody_mg37__11 = doc.parser();
        Assert.assertFalse(((Parser) (o_handlesSpanInTbody_mg37__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37__11)).getErrors())).isEmpty());
        Assert.assertEquals(0, ((int) (o_handlesSpanInTbody_mg37__5)));
        Assert.assertEquals(1, ((int) (o_handlesSpanInTbody_mg37__9)));
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg30() throws Exception {
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg30__5 = doc.select("span").first().children().size();
        Assert.assertEquals(0, ((int) (o_handlesSpanInTbody_mg30__5)));
        int o_handlesSpanInTbody_mg30__9 = doc.select("table").size();
        Assert.assertEquals(1, ((int) (o_handlesSpanInTbody_mg30__9)));
        Element o_handlesSpanInTbody_mg30__11 = doc.head();
        Assert.assertTrue(((Element) (o_handlesSpanInTbody_mg30__11)).isBlock());
        Assert.assertFalse(((Collection) (((Element) (o_handlesSpanInTbody_mg30__11)).getAllElements())).isEmpty());
        Assert.assertFalse(((Element) (o_handlesSpanInTbody_mg30__11)).hasText());
        Assert.assertTrue(((Element) (o_handlesSpanInTbody_mg30__11)).hasParent());
        Assert.assertEquals(0, ((int) (o_handlesSpanInTbody_mg30__5)));
        Assert.assertEquals(1, ((int) (o_handlesSpanInTbody_mg30__9)));
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg33() throws Exception {
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg33__5 = doc.select("span").first().children().size();
        Assert.assertEquals(0, ((int) (o_handlesSpanInTbody_mg33__5)));
        int o_handlesSpanInTbody_mg33__9 = doc.select("table").size();
        Assert.assertEquals(1, ((int) (o_handlesSpanInTbody_mg33__9)));
        Document o_handlesSpanInTbody_mg33__11 = doc.normalise();
        Assert.assertFalse(((Document) (o_handlesSpanInTbody_mg33__11)).isBlock());
        Assert.assertFalse(((Collection) (((Document) (o_handlesSpanInTbody_mg33__11)).getAllElements())).isEmpty());
        Assert.assertTrue(((Document) (o_handlesSpanInTbody_mg33__11)).hasText());
        Assert.assertFalse(((Document) (o_handlesSpanInTbody_mg33__11)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <span class=\"1\"></span>\n  <table>\n   <tbody>\n    <tr>\n     <td>One</td>\n    </tr>\n    <tr>\n     <td>Two</td>\n    </tr>\n   </tbody>\n  </table>\n </body>\n</html>", ((Document) (o_handlesSpanInTbody_mg33__11)).toString());
        Assert.assertEquals(0, ((int) (o_handlesSpanInTbody_mg33__5)));
        Assert.assertEquals(1, ((int) (o_handlesSpanInTbody_mg33__9)));
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_mg1216_failAssert0() throws Exception {
        try {
            int __DSPOT_index_185 = -1256647754;
            String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
            o_handlesSpanInTbody_mg39__12.child(__DSPOT_index_185);
            org.junit.Assert.fail("handlesSpanInTbody_mg39_mg1216 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1256647754", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg26_mg2408_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_495 = ")j&1?*cp^hs_b7`[hP<g";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg26__5 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg26__9 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg26__11 = doc.body();
            o_handlesSpanInTbody_mg26__11.getElementsMatchingText(__DSPOT_regex_495);
            org.junit.Assert.fail("handlesSpanInTbody_mg26_mg2408 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: )j&1?*cp^hs_b7`[hP<g", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg29_mg1201_mg16141() throws Exception {
        String __DSPOT_value_5459 = "@U=9#SSVUw.PPn)]Y&/v";
        String __DSPOT_key_5458 = "V},9&h4jy5xRxxz91*M9";
        String __DSPOT_tagName_0 = "]6^FT)-ef&bk*201yCi*";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg29__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg29__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg29__12 = doc.createElement(__DSPOT_tagName_0);
        String o_handlesSpanInTbody_mg29_mg1201__19 = o_handlesSpanInTbody_mg29__12.html();
        Assert.assertEquals("", o_handlesSpanInTbody_mg29_mg1201__19);
        Elements o_handlesSpanInTbody_mg29_mg1201_mg16141__24 = o_handlesSpanInTbody_mg29__12.getElementsByAttributeValueNot(__DSPOT_key_5458, __DSPOT_value_5459);
        Assert.assertFalse(o_handlesSpanInTbody_mg29_mg1201_mg16141__24.isEmpty());
        Assert.assertEquals("", o_handlesSpanInTbody_mg29_mg1201__19);
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_add1013_mg4486() throws Exception {
        String __DSPOT_valuePrefix_969 = "k%WTHBGeyQtIfFX>K>xc";
        String __DSPOT_key_968 = "AZ!51oRp2=`!GKkN+#VQ";
        String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_mg39_add1013__6 = doc.select("span").first();
        int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
        Elements o_handlesSpanInTbody_mg39_add1013_mg4486__25 = o_handlesSpanInTbody_mg39__12.getElementsByAttributeValueStarting(__DSPOT_key_968, __DSPOT_valuePrefix_969);
        Assert.assertTrue(o_handlesSpanInTbody_mg39_add1013_mg4486__25.isEmpty());
    }
}

