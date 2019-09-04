package org.jsoup.nodes;


import org.junit.Assert;
import org.junit.Test;


public class EntitiesTest {
    @Test(timeout = 10000)
    public void strictUnescape() throws Exception {
        String text = "Hello &amp= &amp;";
        Assert.assertEquals("Hello &amp= &amp;", text);
        String o_strictUnescape__3 = Entities.unescape(text, true);
        Assert.assertEquals("Hello &amp= &", o_strictUnescape__3);
        String o_strictUnescape__4 = Entities.unescape(text);
        Assert.assertEquals("Hello &= &", o_strictUnescape__4);
        String o_strictUnescape__5 = Entities.unescape(text, false);
        Assert.assertEquals("Hello &= &", o_strictUnescape__5);
        Assert.assertEquals("Hello &amp= &amp;", text);
        Assert.assertEquals("Hello &amp= &", o_strictUnescape__3);
        Assert.assertEquals("Hello &= &", o_strictUnescape__4);
    }
}

