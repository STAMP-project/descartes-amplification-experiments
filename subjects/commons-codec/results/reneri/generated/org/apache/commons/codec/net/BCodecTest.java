/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.codec.net;


/**
 * Quoted-printable codec test cases
 *
 * @version $Id$
 */
public class BCodecTest {
    static final int[] SWISS_GERMAN_STUFF_UNICODE = new int[]{ 71, 114, 252, 101, 122, 105, 95, 122, 228, 109, 228 };

    static final int[] RUSSIAN_STUFF_UNICODE = new int[]{ 1042, 1089, 1077, 1084, 95, 1087, 1088, 1080, 1074, 1077, 1090 };

    private java.lang.String constructString(final int[] unicodeChars) {
        final java.lang.StringBuilder buffer = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.BCodecTest|constructString(int[])|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.BCodecTest|constructString(int[])|1", int[].class, unicodeChars)) != null) {
            for (final int unicodeChar : eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.BCodecTest|constructString(int[])|2", int[].class, unicodeChars)) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.BCodecTest|constructString(int[])|5", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.BCodecTest|constructString(int[])|3", java.lang.StringBuilder.class, buffer).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|constructString(int[])|4", ((char) (unicodeChar)))));
            }
        }
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|constructString(int[])|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.BCodecTest|constructString(int[])|6", java.lang.StringBuilder.class, buffer).toString());
    }

    @org.junit.Test
    public void testNullInput() throws java.lang.Exception {
        final org.apache.commons.codec.net.BCodec bcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testNullInput()|0", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec());
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.BCodecTest|testNullInput()|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testNullInput()|1", org.apache.commons.codec.net.BCodec.class, bcodec).doDecoding(null)));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.BCodecTest|testNullInput()|4", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testNullInput()|3", org.apache.commons.codec.net.BCodec.class, bcodec).doEncoding(null)));
    }

    @org.junit.Test
    public void testUTF8RoundTrip() throws java.lang.Exception {
        final java.lang.String ru_msg = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|1", constructString(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|0", int[].class, org.apache.commons.codec.net.BCodecTest.RUSSIAN_STUFF_UNICODE)));
        final java.lang.String ch_msg = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|3", constructString(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|2", int[].class, org.apache.commons.codec.net.BCodecTest.SWISS_GERMAN_STUFF_UNICODE)));
        final org.apache.commons.codec.net.BCodec bcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|4", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec(org.apache.commons.codec.CharEncoding.UTF_8));
        org.junit.Assert.assertEquals("=?UTF-8?B?0JLRgdC10Lxf0L/RgNC40LLQtdGC?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|5", org.apache.commons.codec.net.BCodec.class, bcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|6", ru_msg))));
        org.junit.Assert.assertEquals("=?UTF-8?B?R3LDvGV6aV96w6Rtw6Q=?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|8", org.apache.commons.codec.net.BCodec.class, bcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|9", ch_msg))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|11", ru_msg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|12", org.apache.commons.codec.net.BCodec.class, bcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|13", org.apache.commons.codec.net.BCodec.class, bcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|14", ru_msg))))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|17", ch_msg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|18", org.apache.commons.codec.net.BCodec.class, bcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|19", org.apache.commons.codec.net.BCodec.class, bcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testUTF8RoundTrip()|20", ch_msg))))));
    }

    @org.junit.Test
    public void testBasicEncodeDecode() throws java.lang.Exception {
        final org.apache.commons.codec.net.BCodec bcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|0", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec());
        final java.lang.String plain = "Hello there";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|1", org.apache.commons.codec.net.BCodec.class, bcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|2", plain)));
        org.junit.Assert.assertEquals("Basic B encoding test", "=?UTF-8?B?SGVsbG8gdGhlcmU=?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|4", encoded));
        org.junit.Assert.assertEquals("Basic B decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|5", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|6", org.apache.commons.codec.net.BCodec.class, bcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testBasicEncodeDecode()|7", encoded))));
    }

    @org.junit.Test
    public void testEncodeDecodeNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.BCodec bcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeDecodeNull()|0", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec());
        org.junit.Assert.assertNull("Null string B encoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testEncodeDecodeNull()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeDecodeNull()|1", org.apache.commons.codec.net.BCodec.class, bcodec).encode(((java.lang.String) (null)))));
        org.junit.Assert.assertNull("Null string B decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testEncodeDecodeNull()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeDecodeNull()|3", org.apache.commons.codec.net.BCodec.class, bcodec).decode(((java.lang.String) (null)))));
    }

    @org.junit.Test
    public void testEncodeStringWithNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.BCodec bcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeStringWithNull()|0", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec());
        final java.lang.String test = null;
        final java.lang.String result = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testEncodeStringWithNull()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeStringWithNull()|1", org.apache.commons.codec.net.BCodec.class, bcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testEncodeStringWithNull()|2", test), "charset"));
        org.junit.Assert.assertEquals("Result should be null", null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testEncodeStringWithNull()|4", result));
    }

    @org.junit.Test
    public void testDecodeStringWithNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.BCodec bcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeStringWithNull()|0", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec());
        final java.lang.String test = null;
        final java.lang.String result = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testDecodeStringWithNull()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeStringWithNull()|1", org.apache.commons.codec.net.BCodec.class, bcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testDecodeStringWithNull()|2", test)));
        org.junit.Assert.assertEquals("Result should be null", null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testDecodeStringWithNull()|4", result));
    }

    @org.junit.Test
    public void testEncodeObjects() throws java.lang.Exception {
        final org.apache.commons.codec.net.BCodec bcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|0", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec());
        final java.lang.String plain = "what not";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|3", ((java.lang.String) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|1", org.apache.commons.codec.net.BCodec.class, bcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|2", java.lang.Object.class, ((java.lang.Object) (plain)))))));
        org.junit.Assert.assertEquals("Basic B encoding test", "=?UTF-8?B?d2hhdCBub3Q=?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|4", encoded));
        final java.lang.Object result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|6", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|5", org.apache.commons.codec.net.BCodec.class, bcodec).encode(((java.lang.Object) (null))));
        org.junit.Assert.assertEquals("Encoding a null Object should return null", null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|7", java.lang.Object.class, result));
        try {
            final java.lang.Object dObj = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|8", new java.lang.Double(3.0));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|11", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|9", org.apache.commons.codec.net.BCodec.class, bcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testEncodeObjects()|10", java.lang.Object.class, dObj)));
            org.junit.Assert.fail("Trying to url encode a Double object should cause an exception.");
        } catch (final org.apache.commons.codec.EncoderException ee) {
            // Exception expected, test segment passes.
        }
    }

    @org.junit.Test(expected = java.nio.charset.UnsupportedCharsetException.class)
    public void testInvalidEncoding() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testInvalidEncoding()|0", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec("NONSENSE"));
        } catch (java.nio.charset.UnsupportedCharsetException a1553628734516) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.net.BCodecTest|testInvalidEncoding()|!", a1553628734516);
            throw a1553628734516;
        }
    }

    @org.junit.Test
    public void testDecodeObjects() throws java.lang.Exception {
        final org.apache.commons.codec.net.BCodec bcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|0", org.apache.commons.codec.net.BCodec.class, new org.apache.commons.codec.net.BCodec());
        final java.lang.String decoded = "=?UTF-8?B?d2hhdCBub3Q=?=";
        final java.lang.String plain = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|3", ((java.lang.String) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|1", org.apache.commons.codec.net.BCodec.class, bcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|2", java.lang.Object.class, ((java.lang.Object) (decoded)))))));
        org.junit.Assert.assertEquals("Basic B decoding test", "what not", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|4", plain));
        final java.lang.Object result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|6", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|5", org.apache.commons.codec.net.BCodec.class, bcodec).decode(((java.lang.Object) (null))));
        org.junit.Assert.assertEquals("Decoding a null Object should return null", null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|7", java.lang.Object.class, result));
        try {
            final java.lang.Object dObj = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|8", new java.lang.Double(3.0));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|11", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.BCodec>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|9", org.apache.commons.codec.net.BCodec.class, bcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.BCodecTest|testDecodeObjects()|10", java.lang.Object.class, dObj)));
            org.junit.Assert.fail("Trying to url encode a Double object should cause an exception.");
        } catch (final org.apache.commons.codec.DecoderException ee) {
            // Exception expected, test segment passes.
        }
    }
}

