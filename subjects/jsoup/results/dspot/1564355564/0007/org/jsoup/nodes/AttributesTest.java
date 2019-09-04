package org.jsoup.nodes;


import org.junit.Assert;
import org.junit.Test;


public class AttributesTest {
    @Test(timeout = 10000)
    public void removeCaseSensitive_rv174_mg1534_mg67831() throws Exception {
        Attribute __DSPOT_attribute_222 = new Attribute(" &]H6Q*bglwm[6_1*349", "DE!mrYdu#?a@W&j=|H&S", new Attributes());
        String __DSPOT_key_38 = "o-9M/^zOCxu?!rIXp5pN";
        Attributes a = new Attributes();
        Assert.assertEquals("", ((Attributes) (a)).toString());
        Assert.assertEquals(32, ((int) (((Attributes) (a)).hashCode())));
        Attributes o_removeCaseSensitive_rv174__4 = a.put("Tot", "a&p");
        Assert.assertEquals(" Tot=\"a&amp;p\"", ((Attributes) (o_removeCaseSensitive_rv174__4)).toString());
        Assert.assertEquals(-924093553, ((int) (((Attributes) (o_removeCaseSensitive_rv174__4)).hashCode())));
        Attributes __DSPOT_invoc_4 = a.put("tot", "one");
        Attributes o_removeCaseSensitive_rv174__8 = a.put("Hello", "There");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\"", ((Attributes) (o_removeCaseSensitive_rv174__8)).toString());
        Assert.assertEquals(-1006812564, ((int) (((Attributes) (o_removeCaseSensitive_rv174__8)).hashCode())));
        Attributes o_removeCaseSensitive_rv174__9 = a.put("hello", "There");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\" hello=\"There\"", ((Attributes) (o_removeCaseSensitive_rv174__9)).toString());
        Assert.assertEquals(-2146972193, ((int) (((Attributes) (o_removeCaseSensitive_rv174__9)).hashCode())));
        Attributes o_removeCaseSensitive_rv174__10 = a.put("data-name", "Jsoup");
        Assert.assertEquals(" Tot=\"a&amp;p\" tot=\"one\" Hello=\"There\" hello=\"There\" data-name=\"Jsoup\"", ((Attributes) (o_removeCaseSensitive_rv174__10)).toString());
        Assert.assertEquals(-819992819, ((int) (((Attributes) (o_removeCaseSensitive_rv174__10)).hashCode())));
        int o_removeCaseSensitive_rv174__11 = a.size();
        a.remove("Tot");
        a.remove("Hello");
        int o_removeCaseSensitive_rv174__14 = a.size();
        boolean o_removeCaseSensitive_rv174__15 = a.hasKey("tot");
        boolean o_removeCaseSensitive_rv174__16 = a.hasKey("Tot");
        __DSPOT_invoc_4.removeIgnoreCase(__DSPOT_key_38);
        Attributes o_removeCaseSensitive_rv174_mg1534__37 = __DSPOT_invoc_4.put(__DSPOT_attribute_222);
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" &]H6Q*bglwm[6_1*349=\"DE!mrYdu#?a@W&amp;j=|H&amp;S\"", ((Attributes) (o_removeCaseSensitive_rv174_mg1534__37)).toString());
        Assert.assertEquals(1096763735, ((int) (((Attributes) (o_removeCaseSensitive_rv174_mg1534__37)).hashCode())));
        Attribute o_removeCaseSensitive_rv174_mg1534_mg67831__40 = __DSPOT_attribute_222.clone();
        Assert.assertEquals("&]H6Q*bglwm[6_1*349=\"DE!mrYdu#?a@W&amp;j=|H&amp;S\"", ((Attribute) (o_removeCaseSensitive_rv174_mg1534_mg67831__40)).toString());
        Assert.assertEquals(-1026369119, ((int) (((Attribute) (o_removeCaseSensitive_rv174_mg1534_mg67831__40)).hashCode())));
        Assert.assertEquals("DE!mrYdu#?a@W&j=|H&S", ((Attribute) (o_removeCaseSensitive_rv174_mg1534_mg67831__40)).getValue());
        Assert.assertEquals("&]H6Q*bglwm[6_1*349", ((Attribute) (o_removeCaseSensitive_rv174_mg1534_mg67831__40)).getKey());
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" &]H6Q*bglwm[6_1*349=\"DE!mrYdu#?a@W&amp;j=|H&amp;S\"", ((Attributes) (a)).toString());
        Assert.assertEquals(1096763735, ((int) (((Attributes) (a)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" &]H6Q*bglwm[6_1*349=\"DE!mrYdu#?a@W&amp;j=|H&amp;S\"", ((Attributes) (o_removeCaseSensitive_rv174__4)).toString());
        Assert.assertEquals(1096763735, ((int) (((Attributes) (o_removeCaseSensitive_rv174__4)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" &]H6Q*bglwm[6_1*349=\"DE!mrYdu#?a@W&amp;j=|H&amp;S\"", ((Attributes) (o_removeCaseSensitive_rv174__8)).toString());
        Assert.assertEquals(1096763735, ((int) (((Attributes) (o_removeCaseSensitive_rv174__8)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" &]H6Q*bglwm[6_1*349=\"DE!mrYdu#?a@W&amp;j=|H&amp;S\"", ((Attributes) (o_removeCaseSensitive_rv174__9)).toString());
        Assert.assertEquals(1096763735, ((int) (((Attributes) (o_removeCaseSensitive_rv174__9)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" &]H6Q*bglwm[6_1*349=\"DE!mrYdu#?a@W&amp;j=|H&amp;S\"", ((Attributes) (o_removeCaseSensitive_rv174__10)).toString());
        Assert.assertEquals(1096763735, ((int) (((Attributes) (o_removeCaseSensitive_rv174__10)).hashCode())));
        Assert.assertEquals(" tot=\"one\" hello=\"There\" data-name=\"Jsoup\" &]H6Q*bglwm[6_1*349=\"DE!mrYdu#?a@W&amp;j=|H&amp;S\"", ((Attributes) (o_removeCaseSensitive_rv174_mg1534__37)).toString());
        Assert.assertEquals(1096763735, ((int) (((Attributes) (o_removeCaseSensitive_rv174_mg1534__37)).hashCode())));
    }
}

