package org.jsoup.nodes;


import org.junit.Assert;
import org.junit.Test;


public class AttributesTest {
    @Test(timeout = 10000)
    public void removeCaseSensitive_mg103_mg21268_mg91276() throws Exception {
        Attribute __DSPOT_attribute_6721 = new Attribute("Qp2LzG,X3gC()^3X0!!%", "UobyZ)<jY0`lp]I#gN+[");
        Attributes __DSPOT_incoming_0 = new Attributes();
        Attributes a = new Attributes();
        Assert.assertEquals("", ((Attributes) (a)).toString());
        Assert.assertEquals(32, ((int) (((Attributes) (a)).hashCode())));
        Attributes o_removeCaseSensitive_mg103__5 = a.put("Tot", "a&p");
        Assert.assertEquals(" Tot=\"a&amp;p\"", ((Attributes) (o_removeCaseSensitive_mg103__5)).toString());
        Assert.assertEquals(-924093553, ((int) (((Attributes) (o_removeCaseSensitive_mg103__5)).hashCode())));
        Attributes o_removeCaseSensitive_mg103__6 = a.put("tot", "one");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\"", ((Attributes) (o_removeCaseSensitive_mg103__6)).toString());
        Assert.assertEquals(-1686226883, ((int) (((Attributes) (o_removeCaseSensitive_mg103__6)).hashCode())));
        Attributes o_removeCaseSensitive_mg103__7 = a.put("Hello", "There");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\"", ((Attributes) (o_removeCaseSensitive_mg103__7)).toString());
        Assert.assertEquals(-1006812564, ((int) (((Attributes) (o_removeCaseSensitive_mg103__7)).hashCode())));
        Attributes o_removeCaseSensitive_mg103__8 = a.put("hello", "There");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\" hello=\"There\"", ((Attributes) (o_removeCaseSensitive_mg103__8)).toString());
        Assert.assertEquals(-2146972193, ((int) (((Attributes) (o_removeCaseSensitive_mg103__8)).hashCode())));
        Attributes o_removeCaseSensitive_mg103__9 = a.put("data-name", "Jsoup");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\" hello=\"There\" data-name=\"Jsoup\"", ((Attributes) (o_removeCaseSensitive_mg103__9)).toString());
        Assert.assertEquals(-819992819, ((int) (((Attributes) (o_removeCaseSensitive_mg103__9)).hashCode())));
        int o_removeCaseSensitive_mg103__10 = a.size();
        a.remove("Tot");
        a.remove("Hello");
        int o_removeCaseSensitive_mg103__13 = a.size();
        boolean o_removeCaseSensitive_mg103__14 = a.hasKey("tot");
        boolean o_removeCaseSensitive_mg103__15 = a.hasKey("Tot");
        a.addAll(__DSPOT_incoming_0);
        Attributes o_removeCaseSensitive_mg103_mg21268__37 = o_removeCaseSensitive_mg103__6.put(__DSPOT_attribute_6721);
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attributes) (o_removeCaseSensitive_mg103_mg21268__37)).toString());
        Assert.assertEquals(-882688277, ((int) (((Attributes) (o_removeCaseSensitive_mg103_mg21268__37)).hashCode())));
        Attribute o_removeCaseSensitive_mg103_mg21268_mg91276__40 = __DSPOT_attribute_6721.clone();
        Assert.assertEquals("Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attribute) (o_removeCaseSensitive_mg103_mg21268_mg91276__40)).toString());
        Assert.assertEquals(2025371957, ((int) (((Attribute) (o_removeCaseSensitive_mg103_mg21268_mg91276__40)).hashCode())));
        Assert.assertEquals("UobyZ)<jY0`lp]I#gN+[", ((Attribute) (o_removeCaseSensitive_mg103_mg21268_mg91276__40)).getValue());
        Assert.assertEquals("Qp2LzG,X3gC()^3X0!!%", ((Attribute) (o_removeCaseSensitive_mg103_mg21268_mg91276__40)).getKey());
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attributes) (a)).toString());
        Assert.assertEquals(-882688277, ((int) (((Attributes) (a)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attributes) (o_removeCaseSensitive_mg103__5)).toString());
        Assert.assertEquals(-882688277, ((int) (((Attributes) (o_removeCaseSensitive_mg103__5)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attributes) (o_removeCaseSensitive_mg103__6)).toString());
        Assert.assertEquals(-882688277, ((int) (((Attributes) (o_removeCaseSensitive_mg103__6)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attributes) (o_removeCaseSensitive_mg103__7)).toString());
        Assert.assertEquals(-882688277, ((int) (((Attributes) (o_removeCaseSensitive_mg103__7)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attributes) (o_removeCaseSensitive_mg103__8)).toString());
        Assert.assertEquals(-882688277, ((int) (((Attributes) (o_removeCaseSensitive_mg103__8)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attributes) (o_removeCaseSensitive_mg103__9)).toString());
        Assert.assertEquals(-882688277, ((int) (((Attributes) (o_removeCaseSensitive_mg103__9)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" Qp2LzG,X3gC()^3X0!!%=\"UobyZ)<jY0`lp]I#gN+[\"", ((Attributes) (o_removeCaseSensitive_mg103_mg21268__37)).toString());
        Assert.assertEquals(-882688277, ((int) (((Attributes) (o_removeCaseSensitive_mg103_mg21268__37)).hashCode())));
    }
}

