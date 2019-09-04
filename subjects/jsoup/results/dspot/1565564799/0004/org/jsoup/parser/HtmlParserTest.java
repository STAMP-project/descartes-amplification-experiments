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
    public void handlesSpanInTbody_mg30_mg1334_mg10268() throws Exception {
        String __DSPOT_valueSuffix_2558 = "f(Aq7}|EWHZN=%}5or-g";
        String __DSPOT_key_2557 = "|GCB![/.Lj/`k)S^v@aO";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg30__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg30__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg30__11 = doc.head();
        String o_handlesSpanInTbody_mg30_mg1334__18 = doc.location();
        Assert.assertEquals("", o_handlesSpanInTbody_mg30_mg1334__18);
        Elements o_handlesSpanInTbody_mg30_mg1334_mg10268__23 = o_handlesSpanInTbody_mg30__11.getElementsByAttributeValueEnding(__DSPOT_key_2557, __DSPOT_valueSuffix_2558);
        Assert.assertTrue(o_handlesSpanInTbody_mg30_mg1334_mg10268__23.isEmpty());
        Assert.assertEquals("", o_handlesSpanInTbody_mg30_mg1334__18);
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_mg1302_mg18000() throws Exception {
        String __DSPOT_searchText_5393 = "K+/:+?.a<[AYn&Khhr}@";
        String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
        Element o_handlesSpanInTbody_mg39_mg1302__19 = doc.body();
        Elements o_handlesSpanInTbody_mg39_mg1302_mg18000__23 = o_handlesSpanInTbody_mg39__12.getElementsContainingOwnText(__DSPOT_searchText_5393);
        Assert.assertTrue(o_handlesSpanInTbody_mg39_mg1302_mg18000__23.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg26_mg2321_mg11733() throws Exception {
        int __DSPOT_index_3111 = 2093467267;
        String __DSPOT_html_501 = "v#]Or;=b$]&*jK4]wIpL";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg26__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg26__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg26__11 = doc.body();
        Element o_handlesSpanInTbody_mg26_mg2321__19 = o_handlesSpanInTbody_mg26__11.prepend(__DSPOT_html_501);
        Elements o_handlesSpanInTbody_mg26_mg2321_mg11733__23 = o_handlesSpanInTbody_mg26_mg2321__19.getElementsByIndexEquals(__DSPOT_index_3111);
        Assert.assertTrue(o_handlesSpanInTbody_mg26_mg2321_mg11733__23.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg26_add2021_mg11923_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_3182 = "Czum+14[Vi3u*-ggH#tx";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg26__5 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg26_add2021__11 = doc.select("table").size();
            int o_handlesSpanInTbody_mg26__9 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg26__11 = doc.body();
            o_handlesSpanInTbody_mg26__11.getElementsMatchingOwnText(__DSPOT_regex_3182);
            org.junit.Assert.fail("handlesSpanInTbody_mg26_add2021_mg11923 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: Czum+14[Vi3u*-ggH#tx", expected.getMessage());
        }
    }
}

