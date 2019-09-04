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
    public void handlesSpanInTbody_mg37_mg2377() throws Exception {
        int __DSPOT_maxErrors_524 = 1537812369;
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg37__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg37__9 = doc.select("table").size();
        Parser o_handlesSpanInTbody_mg37__11 = doc.parser();
        Assert.assertFalse(((Parser) (o_handlesSpanInTbody_mg37__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37__11)).getErrors())).isEmpty());
        Parser o_handlesSpanInTbody_mg37_mg2377__19 = o_handlesSpanInTbody_mg37__11.setTrackErrors(__DSPOT_maxErrors_524);
        Assert.assertTrue(((Parser) (o_handlesSpanInTbody_mg37_mg2377__19)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37_mg2377__19)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_handlesSpanInTbody_mg37__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37__11)).getErrors())).isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_mg1443_failAssert0() throws Exception {
        try {
            int __DSPOT_index_270 = -1059393630;
            String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
            o_handlesSpanInTbody_mg39__12.child(__DSPOT_index_270);
            org.junit.Assert.fail("handlesSpanInTbody_mg39_mg1443 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1059393630", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg26_mg2010() throws Exception {
        String __DSPOT_valueSuffix_405 = "n@[jri.o56p(&&`#Jw_^";
        String __DSPOT_key_404 = "W?5(|7B##A8qxYfLI97!";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg26__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg26__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg26__11 = doc.body();
        Elements o_handlesSpanInTbody_mg26_mg2010__20 = o_handlesSpanInTbody_mg26__11.getElementsByAttributeValueEnding(__DSPOT_key_404, __DSPOT_valueSuffix_405);
        Assert.assertTrue(o_handlesSpanInTbody_mg26_mg2010__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg26_mg2019() throws Exception {
        String __DSPOT_searchText_417 = "R4 h(MRY1F{5]Lt^[&F*";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg26__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg26__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg26__11 = doc.body();
        Elements o_handlesSpanInTbody_mg26_mg2019__19 = o_handlesSpanInTbody_mg26__11.getElementsContainingOwnText(__DSPOT_searchText_417);
        Assert.assertTrue(o_handlesSpanInTbody_mg26_mg2019__19.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg29_mg1040_mg18122() throws Exception {
        String __DSPOT_value_5623 = "LevOI1P@$3&?Teb,,uEq";
        String __DSPOT_key_5622 = "s/ 86>S]?#?H!/}<7$q:";
        String __DSPOT_value_167 = "7NN)HAw,R/t[:&/Q%haL";
        String __DSPOT_tagName_0 = "]6^FT)-ef&bk*201yCi*";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg29__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg29__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg29__12 = doc.createElement(__DSPOT_tagName_0);
        Element o_handlesSpanInTbody_mg29_mg1040__20 = o_handlesSpanInTbody_mg29__12.val(__DSPOT_value_167);
        Elements o_handlesSpanInTbody_mg29_mg1040_mg18122__25 = o_handlesSpanInTbody_mg29__12.getElementsByAttributeValueNot(__DSPOT_key_5622, __DSPOT_value_5623);
        Assert.assertFalse(o_handlesSpanInTbody_mg29_mg1040_mg18122__25.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg42_mg216_mg16027() throws Exception {
        String __DSPOT_regex_4696 = "=7nRaTKld#AT* 4$UTnz";
        String __DSPOT_tagName_5 = "^.vZ(8(U^r,Jp9Flz5*y";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg42__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg42__9 = doc.select("table").size();
        boolean o_handlesSpanInTbody_mg42__11 = doc.updateMetaCharsetElement();
        Element o_handlesSpanInTbody_mg42_mg216__19 = doc.createElement(__DSPOT_tagName_5);
        Elements o_handlesSpanInTbody_mg42_mg216_mg16027__23 = o_handlesSpanInTbody_mg42_mg216__19.getElementsMatchingText(__DSPOT_regex_4696);
        Assert.assertTrue(o_handlesSpanInTbody_mg42_mg216_mg16027__23.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg29_mg1040_mg18325() throws Exception {
        String __DSPOT_valuePrefix_5755 = "aA,@nPY@.z[DgP0oT`%j";
        String __DSPOT_key_5754 = "T_cL(&4KmIR_sx2Qvz=T";
        String __DSPOT_value_167 = "7NN)HAw,R/t[:&/Q%haL";
        String __DSPOT_tagName_0 = "]6^FT)-ef&bk*201yCi*";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg29__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg29__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg29__12 = doc.createElement(__DSPOT_tagName_0);
        Element o_handlesSpanInTbody_mg29_mg1040__20 = o_handlesSpanInTbody_mg29__12.val(__DSPOT_value_167);
        Elements o_handlesSpanInTbody_mg29_mg1040_mg18325__25 = o_handlesSpanInTbody_mg29_mg1040__20.getElementsByAttributeValueStarting(__DSPOT_key_5754, __DSPOT_valuePrefix_5755);
        Assert.assertTrue(o_handlesSpanInTbody_mg29_mg1040_mg18325__25.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_mg1434_mg17259() throws Exception {
        String __DSPOT_searchText_5206 = "KajcA7wJB#<|Heo|OEtT";
        String __DSPOT_html_261 = "iEni&$|x/F<j;5eQtIon";
        String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
        Element o_handlesSpanInTbody_mg39_mg1434__20 = o_handlesSpanInTbody_mg39__12.append(__DSPOT_html_261);
        Elements o_handlesSpanInTbody_mg39_mg1434_mg17259__24 = o_handlesSpanInTbody_mg39__12.getElementsContainingText(__DSPOT_searchText_5206);
        Assert.assertTrue(o_handlesSpanInTbody_mg39_mg1434_mg17259__24.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg30_mg1374_mg4097_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_798 = "T{wF2=g*>Mf2gpFq$hb6";
            String __DSPOT_tagName_239 = "|U2^w&]RipC8T[dXo/B!";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg30__5 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg30__9 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg30__11 = doc.head();
            Element o_handlesSpanInTbody_mg30_mg1374__19 = o_handlesSpanInTbody_mg30__11.prependElement(__DSPOT_tagName_239);
            o_handlesSpanInTbody_mg30_mg1374__19.getElementsMatchingText(__DSPOT_regex_798);
            org.junit.Assert.fail("handlesSpanInTbody_mg30_mg1374_mg4097 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: T{wF2=g*>Mf2gpFq$hb6", expected.getMessage());
        }
    }
}

