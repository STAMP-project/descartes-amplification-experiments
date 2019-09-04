package org.apache.commons.codec.language;


import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Assert;
import org.junit.Test;


public class SoundexTest extends StringEncoderAbstractTest<Soundex> {
    @Override
    protected Soundex createStringEncoder() {
        return new Soundex();
    }

    @Test(timeout = 10000)
    public void testNewInstance2_add2_literalMutationString65_literalMutationString677() throws Exception {
        Soundex.US_ENGLISH_MAPPING_STRING.toCharArray();
        String o_testNewInstance2_add2__2 = new Soundex(Soundex.US_ENGLISH_MAPPING_STRING.toCharArray()).soundex("Wilwlims");
        Assert.assertEquals("W452", o_testNewInstance2_add2__2);
    }
}

