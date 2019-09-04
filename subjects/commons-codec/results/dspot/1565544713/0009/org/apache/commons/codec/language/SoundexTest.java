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
    public void testNewInstance2_literalMutationString7_literalMutationString94() throws Exception {
        String o_testNewInstance2_literalMutationString7__1 = new Soundex(Soundex.US_ENGLISH_MAPPING_STRING.toCharArray()).soundex("GghscbCS");
        Assert.assertEquals("G120", o_testNewInstance2_literalMutationString7__1);
    }
}

