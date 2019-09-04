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
    public void handlesSpanInTbody_mg29_mg1020() throws Exception {
        String __DSPOT_regex_146 = "vKHTt73Ga%21isI%atY*";
        String __DSPOT_tagName_0 = "]6^FT)-ef&bk*201yCi*";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg29__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg29__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg29__12 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesSpanInTbody_mg29_mg1020__20 = o_handlesSpanInTbody_mg29__12.getElementsMatchingOwnText(__DSPOT_regex_146);
        Assert.assertTrue(o_handlesSpanInTbody_mg29_mg1020__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg26_mg2361() throws Exception {
        String __DSPOT_match_470 = "[lTS?oYjp(0/_3,|P^W2";
        String __DSPOT_key_469 = "f(<!u}K!:&h+CYgVy!-]";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg26__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg26__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg26__11 = doc.body();
        Elements o_handlesSpanInTbody_mg26_mg2361__20 = o_handlesSpanInTbody_mg26__11.getElementsByAttributeValueContaining(__DSPOT_key_469, __DSPOT_match_470);
        Assert.assertTrue(o_handlesSpanInTbody_mg26_mg2361__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_mg1569_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_291 = "tPJ#I@rL.{XK2uP_o`@7";
            String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
            o_handlesSpanInTbody_mg39__12.getElementsMatchingText(__DSPOT_regex_291);
            org.junit.Assert.fail("handlesSpanInTbody_mg39_mg1569 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: tPJ#I@rL.{XK2uP_o`@7", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg29_mg1007() throws Exception {
        String __DSPOT_valuePrefix_138 = "yr;t]&]!vbNw8.:<e2op";
        String __DSPOT_key_137 = "oz}GR7y7[ooB+&I;BFkx";
        String __DSPOT_tagName_0 = "]6^FT)-ef&bk*201yCi*";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg29__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg29__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg29__12 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesSpanInTbody_mg29_mg1007__21 = o_handlesSpanInTbody_mg29__12.getElementsByAttributeValueStarting(__DSPOT_key_137, __DSPOT_valuePrefix_138);
        Assert.assertTrue(o_handlesSpanInTbody_mg29_mg1007__21.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_add4_mg2244_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_425 = "z0[|zDDSlq};6b)7b[F0";
            String __DSPOT_key_424 = "F;K^aA[n|M]WL!pi%TT:";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            Element o_handlesSpanInTbody_add4__5 = doc.select("span").first();
            int o_handlesSpanInTbody_add4__7 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_add4__11 = doc.select("table").size();
            o_handlesSpanInTbody_add4__5.getElementsByAttributeValueMatching(__DSPOT_key_424, __DSPOT_regex_425);
            org.junit.Assert.fail("handlesSpanInTbody_add4_mg2244 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: z0[|zDDSlq};6b)7b[F0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg30_mg1451() throws Exception {
        String __DSPOT_keyPrefix_222 = "84(x8(s:+ZFc$}Z:<[ x";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg30__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg30__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg30__11 = doc.head();
        Elements o_handlesSpanInTbody_mg30_mg1451__19 = o_handlesSpanInTbody_mg30__11.getElementsByAttributeStarting(__DSPOT_keyPrefix_222);
        Assert.assertTrue(o_handlesSpanInTbody_mg30_mg1451__19.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_mg1560() throws Exception {
        String __DSPOT_searchText_286 = "Z;/Ed_ T#PrJhA8(Z(aR";
        String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
        Elements o_handlesSpanInTbody_mg39_mg1560__20 = o_handlesSpanInTbody_mg39__12.getElementsContainingOwnText(__DSPOT_searchText_286);
        Assert.assertTrue(o_handlesSpanInTbody_mg39_mg1560__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg35_mg2667_mg13996() throws Exception {
        String __DSPOT_valueSuffix_3993 = "O^97C)we-vU+5TTAnEN5";
        String __DSPOT_key_3991 = "=n[s?sIY!QES@3rbIsY@";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg35__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg35__9 = doc.select("table").size();
        doc.outputSettings();
        Element o_handlesSpanInTbody_mg35_mg2667__16 = doc.body();
        Elements o_handlesSpanInTbody_mg35_mg2667_mg13996__21 = o_handlesSpanInTbody_mg35_mg2667__16.getElementsByAttributeValueEnding(__DSPOT_key_3991, __DSPOT_valueSuffix_3993);
        Assert.assertTrue(o_handlesSpanInTbody_mg35_mg2667_mg13996__21.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg26_mg2444_mg15529() throws Exception {
        String __DSPOT_value_4522 = "@+L_P5>-]8WNV|2TR)D(";
        String __DSPOT_key_4521 = "])?M+8]t#xJ(aj71n&F6";
        String __DSPOT_text_507 = "5xR.>qdkt7C+>Wr&o7SO";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg26__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg26__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg26__11 = doc.body();
        Element o_handlesSpanInTbody_mg26_mg2444__19 = o_handlesSpanInTbody_mg26__11.prependText(__DSPOT_text_507);
        Elements o_handlesSpanInTbody_mg26_mg2444_mg15529__24 = o_handlesSpanInTbody_mg26__11.getElementsByAttributeValueNot(__DSPOT_key_4521, __DSPOT_value_4522);
        Assert.assertFalse(o_handlesSpanInTbody_mg26_mg2444_mg15529__24.isEmpty());
    }
}

