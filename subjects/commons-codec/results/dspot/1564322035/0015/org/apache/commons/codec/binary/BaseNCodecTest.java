package org.apache.commons.codec.binary;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BaseNCodecTest {
    BaseNCodec codec;

    @Before
    public void setUp() {
        codec = new BaseNCodec(0, 0, 0, 0) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final BaseNCodec.Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final BaseNCodec.Context context) {
            }
        };
    }

    @Test(timeout = 10000)
    public void testIsInAlphabetString_literalMutationString7() throws Exception {
        boolean o_testIsInAlphabetString_literalMutationString7__1 = codec.isInAlphabet("OK");
        Assert.assertTrue(o_testIsInAlphabetString_literalMutationString7__1);
        boolean o_testIsInAlphabetString_literalMutationString7__2 = this.codec.isInAlphabet("O=K=, \t\n\r");
        Assert.assertFalse(o_testIsInAlphabetString_literalMutationString7__2);
        Assert.assertTrue(o_testIsInAlphabetString_literalMutationString7__1);
    }
}

