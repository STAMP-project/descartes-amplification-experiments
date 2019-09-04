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
package org.apache.commons.codec.binary;


/**
 * Tests {@link StringUtils}
 *
 * @version $Id$
 */
public class StringUtilsTest {
    private static final byte[] BYTES_FIXTURE = new byte[]{ 'a', 'b', 'c' };

    // This is valid input for UTF-16BE
    private static final byte[] BYTES_FIXTURE_16BE = new byte[]{ 0, 'a', 0, 'b', 0, 'c' };

    // This is valid for UTF-16LE
    private static final byte[] BYTES_FIXTURE_16LE = new byte[]{ 'a', 0, 'b', 0, 'c', 0 };

    private static final java.lang.String STRING_FIXTURE = "ABC";

    /**
     * We could make the constructor private but there does not seem to be a point to jumping through extra code hoops
     * to restrict instantiation right now.
     */
    @org.junit.Test
    public void testConstructor() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.StringUtils>observeState("org.apache.commons.codec.binary.StringUtilsTest|testConstructor()|0", org.apache.commons.codec.binary.StringUtils.class, new org.apache.commons.codec.binary.StringUtils());
    }

    @org.junit.Test
    public void testGetBytesIso8859_1() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "ISO-8859-1";
        testGetBytesUnchecked(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesIso8859_1()|0", charsetName));
        final byte[] expected = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesIso8859_1()|2", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE.getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesIso8859_1()|1", charsetName)));
        final byte[] actual = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesIso8859_1()|3", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesIso8859_1()|6", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesIso8859_1()|4", byte[].class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesIso8859_1()|5", byte[].class, actual))));
    }

    private void testGetBytesUnchecked(final java.lang.String charsetName) throws java.io.UnsupportedEncodingException {
        final byte[] expected = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUnchecked(java.lang.String)|1", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE.getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUnchecked(java.lang.String)|0", charsetName)));
        final byte[] actual = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUnchecked(java.lang.String)|3", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUnchecked(java.lang.String)|2", charsetName)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUnchecked(java.lang.String)|6", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUnchecked(java.lang.String)|4", byte[].class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUnchecked(java.lang.String)|5", byte[].class, actual))));
    }

    @org.junit.Test
    public void testGetBytesUsAscii() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "US-ASCII";
        testGetBytesUnchecked(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUsAscii()|0", charsetName));
        final byte[] expected = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUsAscii()|2", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE.getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUsAscii()|1", charsetName)));
        final byte[] actual = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUsAscii()|3", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUsAscii()|6", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUsAscii()|4", byte[].class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUsAscii()|5", byte[].class, actual))));
    }

    @org.junit.Test
    public void testGetBytesUtf16() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "UTF-16";
        testGetBytesUnchecked(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16()|0", charsetName));
        final byte[] expected = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16()|2", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE.getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16()|1", charsetName)));
        final byte[] actual = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16()|3", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf16(org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16()|6", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16()|4", byte[].class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16()|5", byte[].class, actual))));
    }

    @org.junit.Test
    public void testGetBytesUtf16Be() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "UTF-16BE";
        testGetBytesUnchecked(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Be()|0", charsetName));
        final byte[] expected = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Be()|2", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE.getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Be()|1", charsetName)));
        final byte[] actual = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Be()|3", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Be()|6", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Be()|4", byte[].class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Be()|5", byte[].class, actual))));
    }

    @org.junit.Test
    public void testGetBytesUtf16Le() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "UTF-16LE";
        testGetBytesUnchecked(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Le()|0", charsetName));
        final byte[] expected = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Le()|2", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE.getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Le()|1", charsetName)));
        final byte[] actual = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Le()|3", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le(org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Le()|6", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Le()|4", byte[].class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf16Le()|5", byte[].class, actual))));
    }

    @org.junit.Test
    public void testGetBytesUtf8() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "UTF-8";
        testGetBytesUnchecked(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf8()|0", charsetName));
        final byte[] expected = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf8()|2", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE.getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf8()|1", charsetName)));
        final byte[] actual = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf8()|3", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf8()|6", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf8()|4", byte[].class, expected), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUtf8()|5", byte[].class, actual))));
    }

    @org.junit.Test
    public void testGetBytesUncheckedBadName() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUncheckedBadName()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(org.apache.commons.codec.binary.StringUtilsTest.STRING_FIXTURE, "UNKNOWN"));
            org.junit.Assert.fail(("Expected " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUncheckedBadName()|1", java.lang.IllegalStateException.class.getName()))));
        } catch (final java.lang.IllegalStateException e) {
            // Expected
        }
    }

    @org.junit.Test
    public void testGetBytesUncheckedNullInput() {
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testGetBytesUncheckedNullInput()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(null, "UNKNOWN")));
    }

    private void testNewString(final java.lang.String charsetName) throws java.io.UnsupportedEncodingException {
        final java.lang.String expected = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewString(java.lang.String)|2", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewString(java.lang.String)|0", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewString(java.lang.String)|1", charsetName)));
        final java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewString(java.lang.String)|5", org.apache.commons.codec.binary.StringUtils.newString(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewString(java.lang.String)|3", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewString(java.lang.String)|4", charsetName)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewString(java.lang.String)|6", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewString(java.lang.String)|7", actual));
    }

    @org.junit.Test
    public void testNewStringBadEnc() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringBadEnc()|1", org.apache.commons.codec.binary.StringUtils.newString(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringBadEnc()|0", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE), "UNKNOWN"));
            org.junit.Assert.fail(("Expected " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringBadEnc()|2", java.lang.IllegalStateException.class.getName()))));
        } catch (final java.lang.IllegalStateException e) {
            // Expected
        }
    }

    @org.junit.Test
    public void testNewStringNullInput() {
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringNullInput()|0", org.apache.commons.codec.binary.StringUtils.newString(null, "UNKNOWN")));
    }

    @org.junit.Test
    public void testNewStringNullInput_CODEC229() {
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringNullInput_CODEC229()|0", org.apache.commons.codec.binary.StringUtils.newStringUtf8(null)));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringNullInput_CODEC229()|1", org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(null)));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringNullInput_CODEC229()|2", org.apache.commons.codec.binary.StringUtils.newStringUsAscii(null)));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringNullInput_CODEC229()|3", org.apache.commons.codec.binary.StringUtils.newStringUtf16(null)));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringNullInput_CODEC229()|4", org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(null)));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringNullInput_CODEC229()|5", org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(null)));
    }

    @org.junit.Test
    public void testNewStringIso8859_1() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "ISO-8859-1";
        testNewString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringIso8859_1()|0", charsetName));
        final java.lang.String expected = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringIso8859_1()|3", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringIso8859_1()|1", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringIso8859_1()|2", charsetName)));
        final java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringIso8859_1()|5", org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringIso8859_1()|4", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringIso8859_1()|6", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringIso8859_1()|7", actual));
    }

    @org.junit.Test
    public void testNewStringUsAscii() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "US-ASCII";
        testNewString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUsAscii()|0", charsetName));
        final java.lang.String expected = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUsAscii()|3", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUsAscii()|1", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUsAscii()|2", charsetName)));
        final java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUsAscii()|5", org.apache.commons.codec.binary.StringUtils.newStringUsAscii(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUsAscii()|4", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUsAscii()|6", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUsAscii()|7", actual));
    }

    @org.junit.Test
    public void testNewStringUtf16() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "UTF-16";
        testNewString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16()|0", charsetName));
        final java.lang.String expected = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16()|3", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16()|1", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16()|2", charsetName)));
        final java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16()|5", org.apache.commons.codec.binary.StringUtils.newStringUtf16(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16()|4", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16()|6", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16()|7", actual));
    }

    @org.junit.Test
    public void testNewStringUtf16Be() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "UTF-16BE";
        testNewString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Be()|0", charsetName));
        final java.lang.String expected = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Be()|3", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Be()|1", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE_16BE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Be()|2", charsetName)));
        final java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Be()|5", org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Be()|4", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE_16BE)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Be()|6", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Be()|7", actual));
    }

    @org.junit.Test
    public void testNewStringUtf16Le() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "UTF-16LE";
        testNewString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Le()|0", charsetName));
        final java.lang.String expected = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Le()|3", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Le()|1", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE_16LE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Le()|2", charsetName)));
        final java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Le()|5", org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Le()|4", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE_16LE)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Le()|6", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf16Le()|7", actual));
    }

    @org.junit.Test
    public void testNewStringUtf8() throws java.io.UnsupportedEncodingException {
        final java.lang.String charsetName = "UTF-8";
        testNewString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf8()|0", charsetName));
        final java.lang.String expected = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf8()|3", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf8()|1", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf8()|2", charsetName)));
        final java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf8()|5", org.apache.commons.codec.binary.StringUtils.newStringUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf8()|4", byte[].class, org.apache.commons.codec.binary.StringUtilsTest.BYTES_FIXTURE)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf8()|6", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testNewStringUtf8()|7", actual));
    }

    @org.junit.Test
    public void testEqualsString() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsString()|0", org.apache.commons.codec.binary.StringUtils.equals(null, null)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsString()|1", org.apache.commons.codec.binary.StringUtils.equals("abc", null)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsString()|2", org.apache.commons.codec.binary.StringUtils.equals(null, "abc")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsString()|3", org.apache.commons.codec.binary.StringUtils.equals("abc", "abc")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsString()|4", org.apache.commons.codec.binary.StringUtils.equals("abc", "abcd")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsString()|5", org.apache.commons.codec.binary.StringUtils.equals("abcd", "abc")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsString()|6", org.apache.commons.codec.binary.StringUtils.equals("abc", "ABC")));
    }

    @org.junit.Test
    public void testEqualsCS1() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|1", org.apache.commons.codec.binary.StringUtils.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|0", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")), null)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|3", org.apache.commons.codec.binary.StringUtils.equals(null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|2", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|6", org.apache.commons.codec.binary.StringUtils.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|4", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|5", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|9", org.apache.commons.codec.binary.StringUtils.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|7", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|8", java.lang.StringBuilder.class, new java.lang.StringBuilder("abcd")))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|12", org.apache.commons.codec.binary.StringUtils.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|10", java.lang.StringBuilder.class, new java.lang.StringBuilder("abcd")), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|11", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|15", org.apache.commons.codec.binary.StringUtils.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|13", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS1()|14", java.lang.StringBuilder.class, new java.lang.StringBuilder("ABC")))));
    }

    @org.junit.Test
    public void testEqualsCS2() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS2()|1", org.apache.commons.codec.binary.StringUtils.equals("abc", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS2()|0", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS2()|3", org.apache.commons.codec.binary.StringUtils.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS2()|2", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")), "abcd")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS2()|5", org.apache.commons.codec.binary.StringUtils.equals("abcd", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS2()|4", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS2()|7", org.apache.commons.codec.binary.StringUtils.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.binary.StringUtilsTest|testEqualsCS2()|6", java.lang.StringBuilder.class, new java.lang.StringBuilder("abc")), "ABC")));
    }
}

