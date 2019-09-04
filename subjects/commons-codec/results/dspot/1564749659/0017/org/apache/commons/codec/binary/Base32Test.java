package org.apache.commons.codec.binary;


import java.nio.charset.Charset;
import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;


public class Base32Test {
    private static final Charset CHARSET_UTF8 = Charsets.UTF_8;

    private static final String[][] BASE32_TEST_CASES = new String[][]{ new String[]{ "", "" }, new String[]{ "f", "MY======" }, new String[]{ "fo", "MZXQ====" }, new String[]{ "foo", "MZXW6===" }, new String[]{ "foob", "MZXW6YQ=" }, new String[]{ "fooba", "MZXW6YTB" }, new String[]{ "foobar", "MZXW6YTBOI======" } };

    private static final Object[][] BASE32_BINARY_TEST_CASES;

    static {
        final Hex hex = new Hex();
        try {
            BASE32_BINARY_TEST_CASES = new Object[][]{ new Object[]{ hex.decode("623a01735836e9a126e12fbf95e013ee6892997c"), "MI5AC42YG3U2CJXBF67ZLYAT5ZUJFGL4" }, new Object[]{ hex.decode("623a01735836e9a126e12fbf95e013ee6892997c"), "mi5ac42yg3u2cjxbf67zlyat5zujfgl4" }, new Object[]{ hex.decode("739ce42108"), "OOOOIIII" } };
        } catch (final DecoderException de) {
            throw new Error(":(", de);
        }
    }

    private static final String[][] BASE32HEX_TEST_CASES = new String[][]{ new String[]{ "", "" }, new String[]{ "f", "CO======" }, new String[]{ "fo", "CPNG====" }, new String[]{ "foo", "CPNMU===" }, new String[]{ "foob", "CPNMUOG=" }, new String[]{ "fooba", "CPNMUOJ1" }, new String[]{ "foobar", "CPNMUOJ1E8======" } };

    private static final String[][] BASE32_TEST_CASES_CHUNKED = new String[][]{ new String[]{ "", "" }, new String[]{ "f", "MY======\r\n" }, new String[]{ "fo", "MZXQ====\r\n" }, new String[]{ "foo", "MZXW6===\r\n" }, new String[]{ "foob", "MZXW6YQ=\r\n" }, new String[]{ "fooba", "MZXW6YTB\r\n" }, new String[]{ "foobar", "MZXW6YTBOI======\r\n" } };

    private static final String[][] BASE32_PAD_TEST_CASES = new String[][]{ new String[]{ "", "" }, new String[]{ "f", "MY%%%%%%" }, new String[]{ "fo", "MZXQ%%%%" }, new String[]{ "foo", "MZXW6%%%" }, new String[]{ "foob", "MZXW6YQ%" }, new String[]{ "fooba", "MZXW6YTB" }, new String[]{ "foobar", "MZXW6YTBOI%%%%%%" } };

    private void testBase64InBuffer(final int startPasSize, final int endPadSize) {
        final Base32 codec = new Base32();
        for (final String[] element : Base32Test.BASE32_TEST_CASES) {
            final byte[] bytes = element[0].getBytes(Base32Test.CHARSET_UTF8);
            byte[] buffer = ArrayUtils.addAll(bytes, new byte[endPadSize]);
            buffer = ArrayUtils.addAll(new byte[startPasSize], buffer);
            Assert.assertEquals(element[1], StringUtils.newStringUtf8(codec.encode(buffer, startPasSize, bytes.length)));
        }
    }

    @Test(timeout = 10000)
    public void testBase32HexSamplesReverse_mg7() throws Exception {
        byte __DSPOT_octet_0 = 103;
        final Base32 codec = new Base32(true);
        for (final String[] element : Base32Test.BASE32HEX_TEST_CASES) {
            String String_7 = element[0];
            new String(codec.decode(element[1]), Base32Test.CHARSET_UTF8);
        }
        boolean o_testBase32HexSamplesReverse_mg7__10 = codec.isInAlphabet(__DSPOT_octet_0);
        Assert.assertTrue(o_testBase32HexSamplesReverse_mg7__10);
    }
}

