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
public class QCodecTest {
    static final int[] SWISS_GERMAN_STUFF_UNICODE = new int[]{ 71, 114, 252, 101, 122, 105, 95, 122, 228, 109, 228 };

    static final int[] RUSSIAN_STUFF_UNICODE = new int[]{ 1042, 1089, 1077, 1084, 95, 1087, 1088, 1080, 1074, 1077, 1090 };

    private java.lang.String constructString(final int[] unicodeChars) {
        final java.lang.StringBuilder buffer = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.QCodecTest|constructString(int[])|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.QCodecTest|constructString(int[])|1", int[].class, unicodeChars)) != null) {
            for (final int unicodeChar : eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.QCodecTest|constructString(int[])|2", int[].class, unicodeChars)) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.QCodecTest|constructString(int[])|5", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.QCodecTest|constructString(int[])|3", java.lang.StringBuilder.class, buffer).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|constructString(int[])|4", ((char) (unicodeChar)))));
            }
        }
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|constructString(int[])|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.QCodecTest|constructString(int[])|6", java.lang.StringBuilder.class, buffer).toString());
    }

    @org.junit.Test
    public void testNullInput() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testNullInput()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.QCodecTest|testNullInput()|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testNullInput()|1", org.apache.commons.codec.net.QCodec.class, qcodec).doDecoding(null)));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.QCodecTest|testNullInput()|4", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testNullInput()|3", org.apache.commons.codec.net.QCodec.class, qcodec).doEncoding(null)));
    }

    @org.junit.Test
    public void testUTF8RoundTrip() throws java.lang.Exception {
        final java.lang.String ru_msg = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|1", constructString(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|0", int[].class, org.apache.commons.codec.net.QCodecTest.RUSSIAN_STUFF_UNICODE)));
        final java.lang.String ch_msg = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|3", constructString(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|2", int[].class, org.apache.commons.codec.net.QCodecTest.SWISS_GERMAN_STUFF_UNICODE)));
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|4", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec(org.apache.commons.codec.CharEncoding.UTF_8));
        org.junit.Assert.assertEquals("=?UTF-8?Q?=D0=92=D1=81=D0=B5=D0=BC=5F=D0=BF=D1=80=D0=B8=D0=B2=D0=B5=D1=82?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|5", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|6", ru_msg))));
        org.junit.Assert.assertEquals("=?UTF-8?Q?Gr=C3=BCezi=5Fz=C3=A4m=C3=A4?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|8", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|9", ch_msg))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|11", ru_msg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|12", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|13", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|14", ru_msg))))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|17", ch_msg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|18", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|19", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUTF8RoundTrip()|20", ch_msg))))));
    }

    @org.junit.Test
    public void testBasicEncodeDecode() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        final java.lang.String plain = "= Hello there =\r\n";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|1", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|2", plain)));
        org.junit.Assert.assertEquals("Basic Q encoding test", "=?UTF-8?Q?=3D Hello there =3D=0D=0A?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|4", encoded));
        org.junit.Assert.assertEquals("Basic Q decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|5", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|6", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testBasicEncodeDecode()|7", encoded))));
    }

    @org.junit.Test
    public void testUnsafeEncodeDecode() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        final java.lang.String plain = "?_=\r\n";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|1", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|2", plain)));
        org.junit.Assert.assertEquals("Unsafe chars Q encoding test", "=?UTF-8?Q?=3F=5F=3D=0D=0A?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|4", encoded));
        org.junit.Assert.assertEquals("Unsafe chars Q decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|5", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|6", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testUnsafeEncodeDecode()|7", encoded))));
    }

    @org.junit.Test
    public void testEncodeDecodeNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeNull()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        org.junit.Assert.assertNull("Null string Q encoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeNull()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeNull()|1", org.apache.commons.codec.net.QCodec.class, qcodec).encode(((java.lang.String) (null)))));
        org.junit.Assert.assertNull("Null string Q decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeNull()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeNull()|3", org.apache.commons.codec.net.QCodec.class, qcodec).decode(((java.lang.String) (null)))));
    }

    @org.junit.Test
    public void testEncodeStringWithNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeStringWithNull()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        final java.lang.String test = null;
        final java.lang.String result = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeStringWithNull()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeStringWithNull()|1", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeStringWithNull()|2", test), "charset"));
        org.junit.Assert.assertEquals("Result should be null", null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeStringWithNull()|4", result));
    }

    @org.junit.Test
    public void testDecodeStringWithNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeStringWithNull()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        final java.lang.String test = null;
        final java.lang.String result = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testDecodeStringWithNull()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeStringWithNull()|1", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testDecodeStringWithNull()|2", test)));
        org.junit.Assert.assertEquals("Result should be null", null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testDecodeStringWithNull()|4", result));
    }

    @org.junit.Test
    public void testEncodeObjects() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        final java.lang.String plain = "1+1 = 2";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|3", ((java.lang.String) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|1", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|2", java.lang.Object.class, ((java.lang.Object) (plain)))))));
        org.junit.Assert.assertEquals("Basic Q encoding test", "=?UTF-8?Q?1+1 =3D 2?=", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|4", encoded));
        final java.lang.Object result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|6", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|5", org.apache.commons.codec.net.QCodec.class, qcodec).encode(((java.lang.Object) (null))));
        org.junit.Assert.assertEquals("Encoding a null Object should return null", null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|7", java.lang.Object.class, result));
        try {
            final java.lang.Object dObj = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|8", new java.lang.Double(3.0));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|11", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|9", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeObjects()|10", java.lang.Object.class, dObj)));
            org.junit.Assert.fail("Trying to url encode a Double object should cause an exception.");
        } catch (final org.apache.commons.codec.EncoderException ee) {
            // Exception expected, test segment passes.
        }
    }

    @org.junit.Test(expected = java.nio.charset.UnsupportedCharsetException.class)
    public void testInvalidEncoding() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testInvalidEncoding()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec("NONSENSE"));
        } catch (java.nio.charset.UnsupportedCharsetException a1553628734532) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.net.QCodecTest|testInvalidEncoding()|!", a1553628734532);
            throw a1553628734532;
        }
    }

    @org.junit.Test
    public void testDecodeObjects() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        final java.lang.String decoded = "=?UTF-8?Q?1+1 =3D 2?=";
        final java.lang.String plain = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|3", ((java.lang.String) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|1", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|2", java.lang.Object.class, ((java.lang.Object) (decoded)))))));
        org.junit.Assert.assertEquals("Basic Q decoding test", "1+1 = 2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|4", plain));
        final java.lang.Object result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|6", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|5", org.apache.commons.codec.net.QCodec.class, qcodec).decode(((java.lang.Object) (null))));
        org.junit.Assert.assertEquals("Decoding a null Object should return null", null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|7", java.lang.Object.class, result));
        try {
            final java.lang.Object dObj = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|8", new java.lang.Double(3.0));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|11", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|9", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.QCodecTest|testDecodeObjects()|10", java.lang.Object.class, dObj)));
            org.junit.Assert.fail("Trying to url encode a Double object should cause an exception.");
        } catch (final org.apache.commons.codec.DecoderException ee) {
            // Exception expected, test segment passes.
        }
    }

    @org.junit.Test
    public void testEncodeDecodeBlanks() throws java.lang.Exception {
        final java.lang.String plain = "Mind those pesky blanks";
        final java.lang.String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?=";
        final java.lang.String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?=";
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|1", org.apache.commons.codec.net.QCodec.class, qcodec).setEncodeBlanks(false);
        java.lang.String s = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|2", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|3", plain)));
        org.junit.Assert.assertEquals("Blanks encoding with the Q codec test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|5", encoded1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|6", s));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|7", org.apache.commons.codec.net.QCodec.class, qcodec).setEncodeBlanks(true);
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|10", (s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|8", org.apache.commons.codec.net.QCodec.class, qcodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|9", plain))));
        org.junit.Assert.assertEquals("Blanks encoding with the Q codec test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|11", encoded2), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|12", s));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|15", (s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|13", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|14", encoded1))));
        org.junit.Assert.assertEquals("Blanks decoding with the Q codec test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|16", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|17", s));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|20", (s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|18", org.apache.commons.codec.net.QCodec.class, qcodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|19", encoded2))));
        org.junit.Assert.assertEquals("Blanks decoding with the Q codec test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|21", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testEncodeDecodeBlanks()|22", s));
    }

    @org.junit.Test
    public void testLetUsMakeCloverHappy() throws java.lang.Exception {
        final org.apache.commons.codec.net.QCodec qcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testLetUsMakeCloverHappy()|0", org.apache.commons.codec.net.QCodec.class, new org.apache.commons.codec.net.QCodec());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testLetUsMakeCloverHappy()|1", org.apache.commons.codec.net.QCodec.class, qcodec).setEncodeBlanks(true);
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testLetUsMakeCloverHappy()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testLetUsMakeCloverHappy()|2", org.apache.commons.codec.net.QCodec.class, qcodec).isEncodeBlanks()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testLetUsMakeCloverHappy()|4", org.apache.commons.codec.net.QCodec.class, qcodec).setEncodeBlanks(false);
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.QCodecTest|testLetUsMakeCloverHappy()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.QCodec>observeState("org.apache.commons.codec.net.QCodecTest|testLetUsMakeCloverHappy()|5", org.apache.commons.codec.net.QCodec.class, qcodec).isEncodeBlanks()));
    }
}

