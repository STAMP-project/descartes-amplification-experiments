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
    public void testIsInAlphabetString_literalMutationString9() throws Exception {
        boolean o_testIsInAlphabetString_literalMutationString9__1 = codec.isInAlphabet("OK");
        Assert.assertTrue(o_testIsInAlphabetString_literalMutationString9__1);
        boolean o_testIsInAlphabetString_literalMutationString9__2 = this.codec.isInAlphabet("iYLn5h9lIhD/x9moaPRnTX6mJEJKThg4WXxS7IrR2zblH26uOkINz0dJNTJVets0ZNYDnsnT7J2i\r\nI3Y6hTVWPGoYU49J3B2LhCREs0DZQ3C7080FtiOcfHbfBLNn0DyCK1LeAC7YB/bNdiyhLqH8fKl+\r\n0+KhiPDIUBJY2e7IbZR/9t0sxJbIXx6cRvI5AXex12o=\r\n");
        Assert.assertFalse(o_testIsInAlphabetString_literalMutationString9__2);
        Assert.assertTrue(o_testIsInAlphabetString_literalMutationString9__1);
    }
}

