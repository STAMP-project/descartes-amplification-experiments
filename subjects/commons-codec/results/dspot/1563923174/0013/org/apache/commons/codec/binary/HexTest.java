package org.apache.commons.codec.binary;


import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.commons.codec.DecoderException;
import org.junit.Assert;
import org.junit.Test;


public class HexTest {
    private static final String BAD_ENCODING_NAME = "UNKNOWN";

    private static final boolean LOG = false;

    private boolean charsetSanityCheck(final String name) {
        final String source = "the quick brown dog jumped over the lazy fox";
        try {
            final byte[] bytes = source.getBytes(name);
            final String str = new String(bytes, name);
            final boolean equals = source.equals(str);
            if (equals == false) {
                log(("FAILED charsetSanityCheck=Interesting Java charset oddity: Roundtrip failed for " + name));
            }
            return equals;
        } catch (final UnsupportedEncodingException e) {
            if (HexTest.LOG) {
                log(((("FAILED charsetSanityCheck=" + name) + ", e=") + e));
                log(e);
            }
            return false;
        } catch (final UnsupportedOperationException e) {
            if (HexTest.LOG) {
                log(((("FAILED charsetSanityCheck=" + name) + ", e=") + e));
                log(e);
            }
            return false;
        }
    }

    private void checkDecodeHexCharArrayOddCharacters(final char[] data) {
        try {
            Hex.decodeHex(data);
            Assert.fail("An exception wasn't thrown when trying to decode an odd number of characters");
        } catch (final DecoderException e) {

        }
    }

    private void checkDecodeHexCharArrayOddCharacters(final String data) {
        try {
            Hex.decodeHex(data);
            Assert.fail("An exception wasn't thrown when trying to decode an odd number of characters");
        } catch (final DecoderException e) {

        }
    }

    private void log(final String s) {
        if (HexTest.LOG) {
            System.out.println(s);
            System.out.flush();
        }
    }

    private void log(final Throwable t) {
        if (HexTest.LOG) {
            t.printStackTrace(System.out);
            System.out.flush();
        }
    }

    private void testCustomCharset(final String name, final String parent) throws UnsupportedEncodingException, DecoderException {
        if ((charsetSanityCheck(name)) == false) {
            return;
        }
        log(((parent + "=") + name));
        final Hex customCodec = new Hex(name);
        final String sourceString = "Hello World";
        final byte[] sourceBytes = sourceString.getBytes(name);
        final byte[] actualEncodedBytes = customCodec.encode(sourceBytes);
        String expectedHexString = Hex.encodeHexString(sourceBytes);
        final byte[] expectedHexStringBytes = expectedHexString.getBytes(name);
        Assert.assertTrue(Arrays.equals(expectedHexStringBytes, actualEncodedBytes));
        String actualStringFromBytes = new String(actualEncodedBytes, name);
        Assert.assertEquals(((((name + ", expectedHexString=") + expectedHexString) + ", actualStringFromBytes=") + actualStringFromBytes), expectedHexString, actualStringFromBytes);
        final Hex utf8Codec = new Hex();
        expectedHexString = "48656c6c6f20576f726c64";
        final byte[] decodedUtf8Bytes = ((byte[]) (utf8Codec.decode(expectedHexString)));
        actualStringFromBytes = new String(decodedUtf8Bytes, utf8Codec.getCharset());
        Assert.assertEquals(name, sourceString, actualStringFromBytes);
        final byte[] decodedCustomBytes = customCodec.decode(actualEncodedBytes);
        actualStringFromBytes = new String(decodedCustomBytes, name);
        Assert.assertEquals(name, sourceString, actualStringFromBytes);
    }

    @Test(timeout = 10000)
    public void testEncodeByteBufferEmpty_literalMutationNumber8() throws Exception {
        boolean o_testEncodeByteBufferEmpty_literalMutationNumber8__1 = Arrays.equals(new byte[0], new Hex().encode(ByteBuffer.allocate(1)));
        Assert.assertFalse(o_testEncodeByteBufferEmpty_literalMutationNumber8__1);
    }
}

