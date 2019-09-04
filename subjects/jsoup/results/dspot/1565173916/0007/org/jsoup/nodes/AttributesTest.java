package org.jsoup.nodes;


import org.junit.Assert;
import org.junit.Test;


public class AttributesTest {
    @Test(timeout = 10000)
    public void removeCaseSensitive_literalMutationString84_mg26817_mg54319() throws Exception {
        Attribute __DSPOT_o_17102 = new Attribute("&a0ewqPUNLM]Zd>Lc<fG", ")rd]eOOU[2#V7}]&wx=`");
        Attribute __DSPOT_attribute_8485 = new Attribute("C:j]&:h_U1l)bT|:QR#P", "#_50&!Dm[7iO<qyjk2ke", new Attributes());
        Attributes a = new Attributes();
        Assert.assertEquals("", ((Attributes) (a)).toString());
        Assert.assertEquals(32, ((int) (((Attributes) (a)).hashCode())));
        Attributes o_removeCaseSensitive_literalMutationString84__3 = a.put("Tot", "a&p");
        Assert.assertEquals(" Tot=\"a&amp;p\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__3)).toString());
        Assert.assertEquals(-924093553, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__3)).hashCode())));
        Attributes o_removeCaseSensitive_literalMutationString84__4 = a.put("tot", "one");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__4)).toString());
        Assert.assertEquals(-1686226883, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__4)).hashCode())));
        Attributes o_removeCaseSensitive_literalMutationString84__5 = a.put("Hello", "There");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__5)).toString());
        Assert.assertEquals(-1006812564, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__5)).hashCode())));
        Attributes o_removeCaseSensitive_literalMutationString84__6 = a.put("hello", "There");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\" hello=\"There\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__6)).toString());
        Assert.assertEquals(-2146972193, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__6)).hashCode())));
        Attributes o_removeCaseSensitive_literalMutationString84__7 = a.put("data-name", "Jsoup");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\" hello=\"There\" data-name=\"Jsoup\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__7)).toString());
        Assert.assertEquals(-819992819, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__7)).hashCode())));
        int o_removeCaseSensitive_literalMutationString84__8 = a.size();
        a.remove("Tlot");
        a.remove("Hello");
        int o_removeCaseSensitive_literalMutationString84__11 = a.size();
        boolean o_removeCaseSensitive_literalMutationString84__12 = a.hasKey("tot");
        boolean o_removeCaseSensitive_literalMutationString84__13 = a.hasKey("Tot");
        Attributes o_removeCaseSensitive_literalMutationString84_mg26817__35 = o_removeCaseSensitive_literalMutationString84__7.put(__DSPOT_attribute_8485);
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" C:j]&:h_U1l)bT|:QR#P=\"#_50&amp;!Dm[7iO<qyjk2ke\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84_mg26817__35)).toString());
        Assert.assertEquals(-1353645175, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84_mg26817__35)).hashCode())));
        boolean o_removeCaseSensitive_literalMutationString84_mg26817_mg54319__40 = __DSPOT_attribute_8485.equals(__DSPOT_o_17102);
        Assert.assertFalse(o_removeCaseSensitive_literalMutationString84_mg26817_mg54319__40);
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" C:j]&:h_U1l)bT|:QR#P=\"#_50&amp;!Dm[7iO<qyjk2ke\"", ((Attributes) (a)).toString());
        Assert.assertEquals(-1353645175, ((int) (((Attributes) (a)).hashCode())));
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" C:j]&:h_U1l)bT|:QR#P=\"#_50&amp;!Dm[7iO<qyjk2ke\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__3)).toString());
        Assert.assertEquals(-1353645175, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__3)).hashCode())));
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" C:j]&:h_U1l)bT|:QR#P=\"#_50&amp;!Dm[7iO<qyjk2ke\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__4)).toString());
        Assert.assertEquals(-1353645175, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__4)).hashCode())));
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" C:j]&:h_U1l)bT|:QR#P=\"#_50&amp;!Dm[7iO<qyjk2ke\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__5)).toString());
        Assert.assertEquals(-1353645175, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__5)).hashCode())));
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" C:j]&:h_U1l)bT|:QR#P=\"#_50&amp;!Dm[7iO<qyjk2ke\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__6)).toString());
        Assert.assertEquals(-1353645175, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__6)).hashCode())));
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" C:j]&:h_U1l)bT|:QR#P=\"#_50&amp;!Dm[7iO<qyjk2ke\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84__7)).toString());
        Assert.assertEquals(-1353645175, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84__7)).hashCode())));
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" C:j]&:h_U1l)bT|:QR#P=\"#_50&amp;!Dm[7iO<qyjk2ke\"", ((Attributes) (o_removeCaseSensitive_literalMutationString84_mg26817__35)).toString());
        Assert.assertEquals(-1353645175, ((int) (((Attributes) (o_removeCaseSensitive_literalMutationString84_mg26817__35)).hashCode())));
    }
}

