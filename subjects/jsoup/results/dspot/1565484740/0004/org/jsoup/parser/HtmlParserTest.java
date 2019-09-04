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
    public void handlesSpanInTbody_mg39_mg1605() throws Exception {
        int __DSPOT_index_289 = 1881346023;
        String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
        Elements o_handlesSpanInTbody_mg39_mg1605__20 = o_handlesSpanInTbody_mg39__12.getElementsByIndexEquals(__DSPOT_index_289);
        Assert.assertTrue(o_handlesSpanInTbody_mg39_mg1605__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_add4_mg2284_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_432 = "hk$+73]3DG}hv;_trDm[";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            Element o_handlesSpanInTbody_add4__5 = doc.select("span").first();
            int o_handlesSpanInTbody_add4__7 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_add4__11 = doc.select("table").size();
            o_handlesSpanInTbody_add4__5.getElementsMatchingOwnText(__DSPOT_regex_432);
            org.junit.Assert.fail("handlesSpanInTbody_add4_mg2284 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: hk$+73]3DG}hv;_trDm[", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_add4_mg2235() throws Exception {
        String __DSPOT_valueSuffix_418 = "m?fld0|x(qm*=]Rs@TQe";
        String __DSPOT_key_417 = "#)W]qvd)n;>{a=yvGr@S";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_add4__5 = doc.select("span").first();
        int o_handlesSpanInTbody_add4__7 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_add4__11 = doc.select("table").size();
        Elements o_handlesSpanInTbody_add4_mg2235__21 = o_handlesSpanInTbody_add4__5.getElementsByAttributeValueEnding(__DSPOT_key_417, __DSPOT_valueSuffix_418);
        Assert.assertTrue(o_handlesSpanInTbody_add4_mg2235__21.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_literalMutationString9_add861_mg17616() throws Exception {
        String __DSPOT_regex_5305 = "=Mt$$3]&nC*PQ*]Qzn,D";
        String h = "<span>Hello <div>there</div> <span>now</span></span>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_literalMutationString9_add861__5 = doc.select("span").first();
        int o_handlesSpanInTbody_literalMutationString9__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_literalMutationString9__9 = doc.select("table").size();
        Elements o_handlesSpanInTbody_literalMutationString9_add861_mg17616__20 = o_handlesSpanInTbody_literalMutationString9_add861__5.getElementsMatchingOwnText(__DSPOT_regex_5305);
        Assert.assertTrue(o_handlesSpanInTbody_literalMutationString9_add861_mg17616__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_add1319_mg20662_failAssert0() throws Exception {
        try {
            int __DSPOT_index_6533 = -89613249;
            String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
            Elements o_handlesSpanInTbody_mg39_add1319__12 = doc.select("table");
            int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
            o_handlesSpanInTbody_mg39__12.child(__DSPOT_index_6533);
            org.junit.Assert.fail("handlesSpanInTbody_mg39_add1319_mg20662 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-89613249", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg38_add2566_mg5126() throws Exception {
        String __DSPOT_match_1017 = "Tv&(1iR#K/1%xJ]MHG,4";
        String __DSPOT_key_1016 = "a5fqHCR^Z6-:rq/GL#8Y";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_mg38_add2566__5 = doc.select("span").first();
        int o_handlesSpanInTbody_mg38__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg38__9 = doc.select("table").size();
        doc.quirksMode();
        Elements o_handlesSpanInTbody_mg38_add2566_mg5126__22 = o_handlesSpanInTbody_mg38_add2566__5.getElementsByAttributeValueContaining(__DSPOT_key_1016, __DSPOT_match_1017);
        Assert.assertTrue(o_handlesSpanInTbody_mg38_add2566_mg5126__22.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_add4_mg2235_mg10876() throws Exception {
        String __DSPOT_searchText_2885 = "w;SJpLw!x$ XaQL[MgTo";
        String __DSPOT_valueSuffix_418 = "m?fld0|x(qm*=]Rs@TQe";
        String __DSPOT_key_417 = "#)W]qvd)n;>{a=yvGr@S";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_add4__5 = doc.select("span").first();
        int o_handlesSpanInTbody_add4__7 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_add4__11 = doc.select("table").size();
        Elements o_handlesSpanInTbody_add4_mg2235__21 = o_handlesSpanInTbody_add4__5.getElementsByAttributeValueEnding(__DSPOT_key_417, __DSPOT_valueSuffix_418);
        Elements o_handlesSpanInTbody_add4_mg2235_mg10876__25 = o_handlesSpanInTbody_add4__5.getElementsContainingOwnText(__DSPOT_searchText_2885);
        Assert.assertTrue(o_handlesSpanInTbody_add4_mg2235_mg10876__25.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg34_mg2394_mg19808_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_6165 = "0}u<X[Ftl:[+2Za3$e %";
            String __DSPOT_key_6164 = "TzEqx[?gC:ma.! `&bL=";
            String __DSPOT_text_459 = "?>t$9[7L1G=%Cl1t^iP.";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg34__5 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg34__9 = doc.select("table").size();
            String o_handlesSpanInTbody_mg34__11 = doc.outerHtml();
            Element o_handlesSpanInTbody_mg34_mg2394__19 = doc.text(__DSPOT_text_459);
            o_handlesSpanInTbody_mg34_mg2394__19.getElementsByAttributeValueMatching(__DSPOT_key_6164, __DSPOT_regex_6165);
            org.junit.Assert.fail("handlesSpanInTbody_mg34_mg2394_mg19808 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: 0}u<X[Ftl:[+2Za3$e %", expected.getMessage());
        }
    }
}

