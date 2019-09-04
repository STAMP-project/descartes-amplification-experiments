package org.jsoup.parser;


import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
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
    public void handlesSpanInTbody_add4_mg1777() throws Exception {
        String __DSPOT_searchText_388 = "(fmo,!<w<S$>+z,&]U+t";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_add4__5 = doc.select("span").first();
        int o_handlesSpanInTbody_add4__7 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_add4__11 = doc.select("table").size();
        Elements o_handlesSpanInTbody_add4_mg1777__20 = o_handlesSpanInTbody_add4__5.getElementsContainingText(__DSPOT_searchText_388);
        Assert.assertTrue(o_handlesSpanInTbody_add4_mg1777__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_add4_mg1769() throws Exception {
        String __DSPOT_value_379 = "Q*2sc[c&=M-zk($_3?gQ";
        String __DSPOT_key_378 = "Q#u#4>|U.0@;Uwg0xDDF";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        Element o_handlesSpanInTbody_add4__5 = doc.select("span").first();
        int o_handlesSpanInTbody_add4__7 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_add4__11 = doc.select("table").size();
        Elements o_handlesSpanInTbody_add4_mg1769__21 = o_handlesSpanInTbody_add4__5.getElementsByAttributeValueNot(__DSPOT_key_378, __DSPOT_value_379);
        Assert.assertFalse(o_handlesSpanInTbody_add4_mg1769__21.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg29_mg767() throws Exception {
        String __DSPOT_keyPrefix_102 = "?>YN{q48ErJ,Q*wO|INC";
        String __DSPOT_tagName_0 = "]6^FT)-ef&bk*201yCi*";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg29__6 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg29__10 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg29__12 = doc.createElement(__DSPOT_tagName_0);
        Elements o_handlesSpanInTbody_mg29_mg767__20 = o_handlesSpanInTbody_mg29__12.getElementsByAttributeStarting(__DSPOT_keyPrefix_102);
        Assert.assertTrue(o_handlesSpanInTbody_mg29_mg767__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg30_mg1174() throws Exception {
        String __DSPOT_valuePrefix_206 = "XWZ9Li]$FA^|2]&v3A9B";
        String __DSPOT_key_205 = "5aw4Z#8{}YbgCZ5GeAZB";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg30__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg30__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg30__11 = doc.head();
        Elements o_handlesSpanInTbody_mg30_mg1174__20 = o_handlesSpanInTbody_mg30__11.getElementsByAttributeValueStarting(__DSPOT_key_205, __DSPOT_valuePrefix_206);
        Assert.assertTrue(o_handlesSpanInTbody_mg30_mg1174__20.isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg37_mg3044_mg14346() throws Exception {
        String __DSPOT_searchText_3817 = "p(iza^=2rjJUsQ_AFh;G";
        String __DSPOT_baseUri_607 = "jfFoivhm7x#bjj<(]+C3";
        Element __DSPOT_context_606 = new Element("]e!rr/nSBZZeZ`frP}g+");
        String __DSPOT_fragment_605 = "Ku&]73_i>:KiG&gv%,zG";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg37__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg37__9 = doc.select("table").size();
        Parser o_handlesSpanInTbody_mg37__11 = doc.parser();
        Assert.assertFalse(((Parser) (o_handlesSpanInTbody_mg37__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37__11)).getErrors())).isEmpty());
        List<Node> o_handlesSpanInTbody_mg37_mg3044__22 = o_handlesSpanInTbody_mg37__11.parseFragmentInput(__DSPOT_fragment_605, __DSPOT_context_606, __DSPOT_baseUri_607);
        Elements o_handlesSpanInTbody_mg37_mg3044_mg14346__26 = __DSPOT_context_606.getElementsContainingOwnText(__DSPOT_searchText_3817);
        Assert.assertTrue(o_handlesSpanInTbody_mg37_mg3044_mg14346__26.isEmpty());
        Assert.assertFalse(((Parser) (o_handlesSpanInTbody_mg37__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37__11)).getErrors())).isEmpty());
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_add1_mg1901_mg5647_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_1200 = "] zgFt67%U@u5&#{([(0";
            String __DSPOT_key_1199 = "Yp]`FR3gIv=]j5iYeyQf";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document o_handlesSpanInTbody_add1__3 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            int o_handlesSpanInTbody_add1__6 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_add1__10 = doc.select("table").size();
            Element o_handlesSpanInTbody_add1_mg1901__18 = doc.body();
            o_handlesSpanInTbody_add1_mg1901__18.getElementsByAttributeValueMatching(__DSPOT_key_1199, __DSPOT_regex_1200);
            org.junit.Assert.fail("handlesSpanInTbody_add1_mg1901_mg5647 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: ] zgFt67%U@u5&#{([(0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg39_add2301_mg13884_failAssert0() throws Exception {
        try {
            String __DSPOT_regex_3642 = ")$qg6>C3}Tz`K9DIAXA0";
            String __DSPOT_text_2 = "dwpauR%h1,xavU[1Rvnj";
            String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
            Document doc = Jsoup.parse(h);
            Elements o_handlesSpanInTbody_mg39_add2301__6 = doc.select("span").first().children();
            int o_handlesSpanInTbody_mg39__6 = doc.select("span").first().children().size();
            int o_handlesSpanInTbody_mg39__10 = doc.select("table").size();
            Element o_handlesSpanInTbody_mg39__12 = doc.text(__DSPOT_text_2);
            o_handlesSpanInTbody_mg39__12.getElementsMatchingOwnText(__DSPOT_regex_3642);
            org.junit.Assert.fail("handlesSpanInTbody_mg39_add2301_mg13884 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Pattern syntax error: )$qg6>C3}Tz`K9DIAXA0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg30_mg1203_mg17364() throws Exception {
        String __DSPOT_regex_4915 = "!FS#,-5us:C9m.0+6tqm";
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg30__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg30__9 = doc.select("table").size();
        Element o_handlesSpanInTbody_mg30__11 = doc.head();
        Element o_handlesSpanInTbody_mg30_mg1203__18 = o_handlesSpanInTbody_mg30__11.nextElementSibling();
        Elements o_handlesSpanInTbody_mg30_mg1203_mg17364__22 = o_handlesSpanInTbody_mg30_mg1203__18.getElementsMatchingOwnText(__DSPOT_regex_4915);
        Assert.assertTrue(o_handlesSpanInTbody_mg30_mg1203_mg17364__22.isEmpty());
    }
}

