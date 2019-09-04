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
 * URL codec test cases
 *
 * @version $Id$
 */
public class URLCodecTest {
    static final int[] SWISS_GERMAN_STUFF_UNICODE = new int[]{ 71, 114, 252, 101, 122, 105, 95, 122, 228, 109, 228 };

    static final int[] RUSSIAN_STUFF_UNICODE = new int[]{ 1042, 1089, 1077, 1084, 95, 1087, 1088, 1080, 1074, 1077, 1090 };

    private void validateState(final org.apache.commons.codec.net.URLCodec urlCodec) {
        // no tests for now.
    }

    private java.lang.String constructString(final int[] unicodeChars) {
        final java.lang.StringBuilder buffer = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.URLCodecTest|constructString(int[])|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.URLCodecTest|constructString(int[])|1", int[].class, unicodeChars)) != null) {
            for (final int unicodeChar : eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.URLCodecTest|constructString(int[])|2", int[].class, unicodeChars)) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.URLCodecTest|constructString(int[])|5", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.URLCodecTest|constructString(int[])|3", java.lang.StringBuilder.class, buffer).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|constructString(int[])|4", ((char) (unicodeChar)))));
            }
        }
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|constructString(int[])|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.net.URLCodecTest|constructString(int[])|6", java.lang.StringBuilder.class, buffer).toString());
    }

    @org.junit.Test
    public void testUTF8RoundTrip() throws java.lang.Exception {
        final java.lang.String ru_msg = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|1", constructString(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|0", int[].class, org.apache.commons.codec.net.URLCodecTest.RUSSIAN_STUFF_UNICODE)));
        final java.lang.String ch_msg = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|3", constructString(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|2", int[].class, org.apache.commons.codec.net.URLCodecTest.SWISS_GERMAN_STUFF_UNICODE)));
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|4", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|5", org.apache.commons.codec.net.URLCodec.class, urlCodec));
        org.junit.Assert.assertEquals("%D0%92%D1%81%D0%B5%D0%BC_%D0%BF%D1%80%D0%B8%D0%B2%D0%B5%D1%82", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|6", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|7", ru_msg), org.apache.commons.codec.CharEncoding.UTF_8)));
        org.junit.Assert.assertEquals("Gr%C3%BCezi_z%C3%A4m%C3%A4", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|9", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|10", ch_msg), org.apache.commons.codec.CharEncoding.UTF_8)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|12", ru_msg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|13", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|14", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|15", ru_msg), org.apache.commons.codec.CharEncoding.UTF_8)), org.apache.commons.codec.CharEncoding.UTF_8)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|18", ch_msg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|19", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|20", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|21", ch_msg), org.apache.commons.codec.CharEncoding.UTF_8)), org.apache.commons.codec.CharEncoding.UTF_8)));
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUTF8RoundTrip()|24", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testBasicEncodeDecode() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final java.lang.String plain = "Hello there!";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|2", plain)));
        org.junit.Assert.assertEquals("Basic URL encoding test", "Hello+there%21", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|4", encoded));
        org.junit.Assert.assertEquals("Basic URL decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|5", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|6", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|7", encoded))));
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testBasicEncodeDecode()|9", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testSafeCharEncodeDecode() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final java.lang.String plain = "abc123_-.*";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|2", plain)));
        org.junit.Assert.assertEquals("Safe chars URL encoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|4", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|5", encoded));
        org.junit.Assert.assertEquals("Safe chars URL decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|6", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|7", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|8", encoded))));
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testSafeCharEncodeDecode()|10", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testUnsafeEncodeDecode() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final java.lang.String plain = "~!@#$%^&()+{}\"\\;:`,/[]";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|2", plain)));
        org.junit.Assert.assertEquals("Unsafe chars URL encoding test", "%7E%21%40%23%24%25%5E%26%28%29%2B%7B%7D%22%5C%3B%3A%60%2C%2F%5B%5D", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|4", encoded));
        org.junit.Assert.assertEquals("Unsafe chars URL decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|5", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|6", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|7", encoded))));
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testUnsafeEncodeDecode()|9", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testEncodeDecodeNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeDecodeNull()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        org.junit.Assert.assertNull("Null string URL encoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeDecodeNull()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeDecodeNull()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(((java.lang.String) (null)))));
        org.junit.Assert.assertNull("Null string URL decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeDecodeNull()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeDecodeNull()|3", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(((java.lang.String) (null)))));
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeDecodeNull()|5", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testDecodeInvalid() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode("%"));
            org.junit.Assert.fail("DecoderException should have been thrown");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected. Move on
        }
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|3", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode("%A"));
            org.junit.Assert.fail("DecoderException should have been thrown");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected. Move on
        }
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|6", // Bad 1st char after %
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|5", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode("%WW"));
            org.junit.Assert.fail("DecoderException should have been thrown");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected. Move on
        }
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|8", // Bad 2nd char after %
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|7", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode("%0W"));
            org.junit.Assert.fail("DecoderException should have been thrown");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected. Move on
        }
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalid()|9", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testDecodeInvalidContent() throws java.io.UnsupportedEncodingException, org.apache.commons.codec.DecoderException {
        final java.lang.String ch_msg = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|1", constructString(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|0", int[].class, org.apache.commons.codec.net.URLCodecTest.SWISS_GERMAN_STUFF_UNICODE)));
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|2", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final byte[] input = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|4", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|3", ch_msg).getBytes("ISO-8859-1"));
        final byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|7", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|5", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|6", byte[].class, input)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|8", byte[].class, input).length), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|10", byte[].class, output).length));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|12", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|13", byte[].class, input).length)); i++) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|15", byte[].class, input)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|16", i)]), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|18", byte[].class, output)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|19", i)]));
        }
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeInvalidContent()|21", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testEncodeNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeNull()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final byte[] plain = null;
        final byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeNull()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeNull()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeNull()|2", byte[].class, plain)));
        org.junit.Assert.assertEquals("Encoding a null string should return null", null, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeNull()|4", byte[].class, encoded));
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeNull()|5", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testEncodeUrlWithNullBitSet() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final java.lang.String plain = "Hello there!";
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|5", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|4", byte[].class, org.apache.commons.codec.net.URLCodec.encodeUrl(null, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|1", plain).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|2", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8)))))));
        org.junit.Assert.assertEquals("Basic URL encoding test", "Hello+there%21", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|6", encoded));
        org.junit.Assert.assertEquals("Basic URL decoding test", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|7", plain), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|8", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|9", encoded))));
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeUrlWithNullBitSet()|11", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testDecodeWithNullArray() throws java.lang.Exception {
        final byte[] plain = null;
        final byte[] result = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeWithNullArray()|1", byte[].class, org.apache.commons.codec.net.URLCodec.decodeUrl(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeWithNullArray()|0", byte[].class, plain)));
        org.junit.Assert.assertEquals("Result should be null", null, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeWithNullArray()|2", byte[].class, result));
    }

    @org.junit.Test
    public void testEncodeStringWithNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeStringWithNull()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final java.lang.String test = null;
        final java.lang.String result = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeStringWithNull()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeStringWithNull()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeStringWithNull()|2", test), "charset"));
        org.junit.Assert.assertEquals("Result should be null", null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeStringWithNull()|4", result));
    }

    @org.junit.Test
    public void testDecodeStringWithNull() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeStringWithNull()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final java.lang.String test = null;
        final java.lang.String result = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeStringWithNull()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeStringWithNull()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeStringWithNull()|2", test), "charset"));
        org.junit.Assert.assertEquals("Result should be null", null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeStringWithNull()|4", result));
    }

    @org.junit.Test
    public void testEncodeObjects() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final java.lang.String plain = "Hello there!";
        java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|3", ((java.lang.String) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|2", java.lang.Object.class, ((java.lang.Object) (plain)))))));
        org.junit.Assert.assertEquals("Basic URL encoding test", "Hello+there%21", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|4", encoded));
        final byte[] plainBA = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|7", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|5", plain).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|6", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8)));
        final byte[] encodedBA = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|10", byte[].class, ((byte[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|8", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|9", java.lang.Object.class, ((java.lang.Object) (plainBA)))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|12", (encoded = new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|11", byte[].class, encodedBA))));
        org.junit.Assert.assertEquals("Basic URL encoding test", "Hello+there%21", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|13", encoded));
        final java.lang.Object result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|15", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|14", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(((java.lang.Object) (null))));
        org.junit.Assert.assertEquals("Encoding a null Object should return null", null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|16", java.lang.Object.class, result));
        try {
            final java.lang.Object dObj = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|17", new java.lang.Double(3.0));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|20", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|18", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|19", java.lang.Object.class, dObj)));
            org.junit.Assert.fail("Trying to url encode a Double object should cause an exception.");
        } catch (final org.apache.commons.codec.EncoderException ee) {
            // Exception expected, test segment passes.
        }
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testEncodeObjects()|21", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testInvalidEncoding() {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testInvalidEncoding()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec("NONSENSE"));
        final java.lang.String plain = "Hello there!";
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testInvalidEncoding()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testInvalidEncoding()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testInvalidEncoding()|2", plain)));
            org.junit.Assert.fail("We set the encoding to a bogus NONSENSE vlaue, this shouldn't have worked.");
        } catch (final org.apache.commons.codec.EncoderException ee) {
            // Exception expected, test segment passes.
        }
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testInvalidEncoding()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testInvalidEncoding()|4", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testInvalidEncoding()|5", plain)));
            org.junit.Assert.fail("We set the encoding to a bogus NONSENSE vlaue, this shouldn't have worked.");
        } catch (final org.apache.commons.codec.DecoderException ee) {
            // Exception expected, test segment passes.
        }
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testInvalidEncoding()|7", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testDecodeObjects() throws java.lang.Exception {
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec());
        final java.lang.String plain = "Hello+there%21";
        java.lang.String decoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|3", ((java.lang.String) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|2", java.lang.Object.class, ((java.lang.Object) (plain)))))));
        org.junit.Assert.assertEquals("Basic URL decoding test", "Hello there!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|4", decoded));
        final byte[] plainBA = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|7", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|5", plain).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|6", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8)));
        final byte[] decodedBA = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|10", byte[].class, ((byte[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|8", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|9", java.lang.Object.class, ((java.lang.Object) (plainBA)))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|12", (decoded = new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|11", byte[].class, decodedBA))));
        org.junit.Assert.assertEquals("Basic URL decoding test", "Hello there!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|13", decoded));
        final java.lang.Object result = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|15", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|14", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(((java.lang.Object) (null))));
        org.junit.Assert.assertEquals("Decoding a null Object should return null", null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|16", java.lang.Object.class, result));
        try {
            final java.lang.Object dObj = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|17", new java.lang.Double(3.0));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|20", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|18", org.apache.commons.codec.net.URLCodec.class, urlCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|19", java.lang.Object.class, dObj)));
            org.junit.Assert.fail("Trying to url encode a Double object should cause an exception.");
        } catch (final org.apache.commons.codec.DecoderException ee) {
            // Exception expected, test segment passes.
        }
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDecodeObjects()|21", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }

    @org.junit.Test
    public void testDefaultEncoding() throws java.lang.Exception {
        final java.lang.String plain = "Hello there!";
        final org.apache.commons.codec.net.URLCodec urlCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|0", org.apache.commons.codec.net.URLCodec.class, new org.apache.commons.codec.net.URLCodec("UnicodeBig"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|1", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|2", plain))// To work around a weird quirk in Java 1.2.2
        );
        final java.lang.String encoded1 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|4", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|5", plain), "UnicodeBig"));
        final java.lang.String encoded2 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|7", org.apache.commons.codec.net.URLCodec.class, urlCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|8", plain)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|10", encoded1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|11", encoded2));
        this.validateState(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.URLCodec>observeState("org.apache.commons.codec.net.URLCodecTest|testDefaultEncoding()|12", org.apache.commons.codec.net.URLCodec.class, urlCodec));
    }
}

