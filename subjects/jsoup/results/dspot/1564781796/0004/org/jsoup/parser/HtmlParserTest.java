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
    public void handlesSpanInTbody_add4_mg2109() throws Exception {
        String __DSPOT_searchText_422 = "IZW2n2E3&{]8;.*4(VXb";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_add4__5 = doc.select("span").first();
        int o_handlesSpanInTbody_add4__7 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_add4__11 = doc.select("table").size();
        Elements o_handlesSpanInTbody_add4_mg2109__20 = o_handlesSpanInTbody_add4__5.getElementsContainingOwnText(__DSPOT_searchText_422);
        Assert.assertTrue(o_handlesSpanInTbody_add4_mg2109__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg26_mg2301() throws Exception {
        String __DSPOT_match_480 = "vKx<9;8Q[Wm4{}}1)E.E";
        String __DSPOT_key_479 = "<7rr4sa&DkRh<3q]l3K]";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg26__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg26__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg26__11 = doc.body();
        Elements o_handlesSpanInTbody_mg26_mg2301__20 = o_handlesSpanInTbody_mg26__11.getElementsByAttributeValueContaining(__DSPOT_key_479, __DSPOT_match_480);
        Assert.assertTrue(o_handlesSpanInTbody_mg26_mg2301__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg30_mg1526_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_298 = "5PL)Z;/Ed_ T#PrJhA8(";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_mg30__5 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg30__9 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg30__11 = doc.head();
            o_handlesSpanInTbody_mg30__11.getElementsMatchingOwnText(__DSPOT_regex_298);
            org.junit.Assert.fail("handlesSpanInTbody_mg30_mg1526 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_mg1351_mg9525() throws Exception {
        String __DSPOT_valuePrefix_3037 = "nq;;sS=W3J!#:H!.xzjx";
        String __DSPOT_key_3036 = "5h.bCol})ME)P]n?ayf|";
        String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
        Elements o_handlesSpanInTbody_mg39_mg1351__19 = o_handlesSpanInTbody_mg39__12.previousElementSiblings();
        Elements o_handlesSpanInTbody_mg39_mg1351_mg9525__24 = o_handlesSpanInTbody_mg39__12.getElementsByAttributeValueStarting(__DSPOT_key_3036, __DSPOT_valuePrefix_3037);
        Assert.assertTrue(o_handlesSpanInTbody_mg39_mg1351_mg9525__24.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_add4_mg2041_mg4197() throws Exception {
        String __DSPOT_value_842 = "#?^B/U2&@ /hcP25]Gl;";
        String __DSPOT_key_841 = "@Z?k4jkaLn<9W.fIUahC";
        String __DSPOT_text_386 = "+UG+r6^7J][{h RC`ESL";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_add4__5 = doc.select("span").first();
        int o_handlesSpanInTbody_add4__7 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_add4__11 = doc.select("table").size();
        Element o_handlesSpanInTbody_add4_mg2041__20 = doc.text(__DSPOT_text_386);
        Elements o_handlesSpanInTbody_add4_mg2041_mg4197__25 = o_handlesSpanInTbody_add4_mg2041__20.getElementsByAttributeValueNot(__DSPOT_key_841, __DSPOT_value_842);
        Assert.assertFalse(o_handlesSpanInTbody_add4_mg2041_mg4197__25.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg30_mg1421_mg7120() throws Exception {
        String __DSPOT_searchText_2005 = "L7IN%ooCYexSOl5@6Fg!";
        String __DSPOT_html_254 = "$|x/F<j;5eQtIon$t`U(";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg30__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg30__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg30__11 = doc.head();
        Element o_handlesSpanInTbody_mg30_mg1421__19 = o_handlesSpanInTbody_mg30__11.after(__DSPOT_html_254);
        Elements o_handlesSpanInTbody_mg30_mg1421_mg7120__23 = o_handlesSpanInTbody_mg30__11.getElementsContainingText(__DSPOT_searchText_2005);
        Assert.assertTrue(o_handlesSpanInTbody_mg30_mg1421_mg7120__23.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_add3_mg1695_failAssert0_mg20088_failAssert0() throws Exception {
        try {
            {
                int __DSPOT_index_336 = -173361882;
                String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
                Document doc = Jsoup.parse(h);
                Elements o_handlesSpanInTbody_add3__5 = doc.select("span").first().children();
                int o_handlesSpanInTbody_add3__8 = doc.select("span").first().children().size();
                int o_handlesSpanInTbody_add3__12 = doc.select("table").size();
                o_handlesSpanInTbody_add3__5.eq(__DSPOT_index_336);
                org.junit.Assert.fail("handlesSpanInTbody_add3_mg1695 should have thrown ArrayIndexOutOfBoundsException");
                o_handlesSpanInTbody_add3__5.nextAll();
            }
            org.junit.Assert.fail("handlesSpanInTbody_add3_mg1695_failAssert0_mg20088 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-173361882", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg29_add588_mg6974() throws Exception {
        String __DSPOT_valueSuffix_1909 = "M]P|74R2`[)|<O@C>f=e";
        String __DSPOT_key_1908 = "*Lx<t+_y#}N@^Kp;7@` ";
        String __DSPOT_tagName_0 = "]6^FT)-ef&bk*201yCi*";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_mg29_add588__6 = doc.select("span").first();
        int o_handlesSpanInTbody_mg29__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg29__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg29__12 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesSpanInTbody_mg29_add588_mg6974__25 = o_handlesSpanInTbody_mg29_add588__6.getElementsByAttributeValueEnding(__DSPOT_key_1908, __DSPOT_valueSuffix_1909);
        Assert.assertTrue(o_handlesSpanInTbody_mg29_add588_mg6974__25.isEmpty());
    }
}

