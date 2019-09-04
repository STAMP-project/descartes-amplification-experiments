package org.jsoup.parser;


import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
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
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <span class=\"1\"></span>\n  <table>\n   <tbody>\n    <tr>\n     <td>One</td>\n    </tr>\n    <tr>\n     <td>Two</td>\n    </tr>\n   </tbody>\n  </table>\n </body>\n</html>", ((Document) (o_handlesSpanInTbody_mg33__11)).toString());
        Assert.assertFalse(((Document) (o_handlesSpanInTbody_mg33__11)).hasParent());
        Assert.assertEquals(0, ((int) (o_handlesSpanInTbody_mg33__5)));
        Assert.assertEquals(1, ((int) (o_handlesSpanInTbody_mg33__9)));
    }

    @Test(timeout = 10000)
    public void handlesSpanInTbody_mg37_mg1890_mg3864() throws Exception {
        int __DSPOT_maxErrors_657 = 59909112;
        String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        Document doc = Jsoup.parse(h);
        int o_handlesSpanInTbody_mg37__5 = doc.select("span").first().children().size();
        int o_handlesSpanInTbody_mg37__9 = doc.select("table").size();
        Parser o_handlesSpanInTbody_mg37__11 = doc.parser();
        Assert.assertFalse(((Parser) (o_handlesSpanInTbody_mg37__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37__11)).getErrors())).isEmpty());
        String o_handlesSpanInTbody_mg37_mg1890__18 = doc.nodeName();
        Assert.assertEquals("#document", o_handlesSpanInTbody_mg37_mg1890__18);
        Parser o_handlesSpanInTbody_mg37_mg1890_mg3864__22 = o_handlesSpanInTbody_mg37__11.setTrackErrors(__DSPOT_maxErrors_657);
        Assert.assertTrue(((Parser) (o_handlesSpanInTbody_mg37_mg1890_mg3864__22)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37_mg1890_mg3864__22)).getErrors())).isEmpty());
        Assert.assertTrue(((Parser) (o_handlesSpanInTbody_mg37__11)).isTrackErrors());
        Assert.assertTrue(((Collection) (((Parser) (o_handlesSpanInTbody_mg37__11)).getErrors())).isEmpty());
        Assert.assertEquals("#document", o_handlesSpanInTbody_mg37_mg1890__18);
    }
}

