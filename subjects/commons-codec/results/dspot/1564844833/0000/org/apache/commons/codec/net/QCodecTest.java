package org.apache.commons.codec.net;


import java.nio.charset.IllegalCharsetNameException;
import org.junit.Test;


public class QCodecTest {
    static final int[] SWISS_GERMAN_STUFF_UNICODE = new int[]{ 71, 114, 252, 101, 122, 105, 95, 122, 228, 109, 228 };

    static final int[] RUSSIAN_STUFF_UNICODE = new int[]{ 1042, 1089, 1077, 1084, 95, 1087, 1088, 1080, 1074, 1077, 1090 };

    private String constructString(final int[] unicodeChars) {
        final StringBuilder buffer = new StringBuilder();
        if (unicodeChars != null) {
            for (final int unicodeChar : unicodeChars) {
                buffer.append(((char) (unicodeChar)));
            }
        }
        return buffer.toString();
    }

    @Test(timeout = 10000)
    public void testEncodeStringWithNull_mg12_failAssert0() throws Exception {
        try {
            String __DSPOT_sourceCharset_5 = " TM1`_8;0L`A=SO/woO!";
            String __DSPOT_sourceStr_4 = "r!Fs2l>UgIvC=TU&zgYc";
            final QCodec qcodec = new QCodec();
            final String test = null;
            final String result = qcodec.encode(test, "charset");
            qcodec.encode(__DSPOT_sourceStr_4, __DSPOT_sourceCharset_5);
            org.junit.Assert.fail("testEncodeStringWithNull_mg12 should have thrown IllegalCharsetNameException");
        } catch (IllegalCharsetNameException expected) {
        }
    }
}

