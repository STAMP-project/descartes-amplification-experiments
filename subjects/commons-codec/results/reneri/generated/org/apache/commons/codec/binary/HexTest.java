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
 * Tests {@link org.apache.commons.codec.binary.Hex}.
 *
 * @version $Id$
 */
public class HexTest {
    private static final java.lang.String BAD_ENCODING_NAME = "UNKNOWN";

    private static final boolean LOG = false;

    private boolean charsetSanityCheck(final java.lang.String name) {
        final java.lang.String source = "the quick brown dog jumped over the lazy fox";
        try {
            final byte[] bytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|0", source).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|1", name)));
            final java.lang.String str = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|5", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|3", byte[].class, bytes), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|4", name)));
            final boolean equals = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|6", source).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|7", str)));
            if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|9", equals)) == false) {
                // Here with:
                // 
                // Java Sun 1.4.2_19 x86 32-bits on Windows XP
                // JIS_X0212-1990
                // x-JIS0208
                // 
                // Java Sun 1.5.0_17 x86 32-bits on Windows XP
                // JIS_X0212-1990
                // x-IBM834
                // x-JIS0208
                // x-MacDingbat
                // x-MacSymbol
                // 
                // Java Sun 1.6.0_14 x86 32-bits
                // JIS_X0212-1990
                // x-IBM834
                // x-JIS0208
                // x-MacDingbat
                // x-MacSymbol
                // 
                log(("FAILED charsetSanityCheck=Interesting Java charset oddity: Roundtrip failed for " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|10", name))));
            }
            return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|11", equals);
        } catch (final java.io.UnsupportedEncodingException e) {
            // Should NEVER happen since we are getting the name from the Charset class.
            if (org.apache.commons.codec.binary.HexTest.LOG) {
                log(((("FAILED charsetSanityCheck=" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|12", name))) + ", e=") + (eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.UnsupportedEncodingException>observeState("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|13", java.io.UnsupportedEncodingException.class, e))));
                log(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.UnsupportedEncodingException>observeState("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|14", java.io.UnsupportedEncodingException.class, e));
            }
            return false;
        } catch (final java.lang.UnsupportedOperationException e) {
            // Caught here with:
            // x-JISAutoDetect on Windows XP and Java Sun 1.4.2_19 x86 32-bits
            // x-JISAutoDetect on Windows XP and Java Sun 1.5.0_17 x86 32-bits
            // x-JISAutoDetect on Windows XP and Java Sun 1.6.0_14 x86 32-bits
            if (org.apache.commons.codec.binary.HexTest.LOG) {
                log(((("FAILED charsetSanityCheck=" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|15", name))) + ", e=") + (eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.UnsupportedOperationException>observeState("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|16", java.lang.UnsupportedOperationException.class, e))));
                log(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.UnsupportedOperationException>observeState("org.apache.commons.codec.binary.HexTest|charsetSanityCheck(java.lang.String)|17", java.lang.UnsupportedOperationException.class, e));
            }
            return false;
        }
    }

    private void checkDecodeHexCharArrayOddCharacters(final char[] data) {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|checkDecodeHexCharArrayOddCharacters(char[])|1", byte[].class, org.apache.commons.codec.binary.Hex.decodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|checkDecodeHexCharArrayOddCharacters(char[])|0", char[].class, data)));
            org.junit.Assert.fail("An exception wasn't thrown when trying to decode an odd number of characters");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected exception
        }
    }

    private void checkDecodeHexCharArrayOddCharacters(final java.lang.String data) {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|checkDecodeHexCharArrayOddCharacters(java.lang.String)|1", byte[].class, org.apache.commons.codec.binary.Hex.decodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|checkDecodeHexCharArrayOddCharacters(java.lang.String)|0", data)));
            org.junit.Assert.fail("An exception wasn't thrown when trying to decode an odd number of characters");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected exception
        }
    }

    private void log(final java.lang.String s) {
        if (org.apache.commons.codec.binary.HexTest.LOG) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.binary.HexTest|log(java.lang.String)|0", java.io.PrintStream.class, java.lang.System.out).println(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|log(java.lang.String)|1", s));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.binary.HexTest|log(java.lang.String)|2", java.io.PrintStream.class, java.lang.System.out).flush();
        }
    }

    private void log(final java.lang.Throwable t) {
        if (org.apache.commons.codec.binary.HexTest.LOG) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.binary.HexTest|log(java.lang.Throwable)|0", java.lang.Throwable.class, t).printStackTrace(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.binary.HexTest|log(java.lang.Throwable)|1", java.io.PrintStream.class, java.lang.System.out));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.binary.HexTest|log(java.lang.Throwable)|2", java.io.PrintStream.class, java.lang.System.out).flush();
        }
    }

    @org.junit.Test
    public void testCustomCharset() throws java.io.UnsupportedEncodingException, org.apache.commons.codec.DecoderException {
        for (final java.lang.String name : eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset()|1", java.util.Set.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset()|0", java.util.SortedMap.class, java.nio.charset.Charset.availableCharsets()).keySet())) {
            testCustomCharset(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset()|2", name), "testCustomCharset");
        }
    }

    /**
     *
     *
     * @param name
     * 		
     * @param parent
     * 		
     * @throws UnsupportedEncodingException
     * 		
     * @throws DecoderException
     * 		
     */
    private void testCustomCharset(final java.lang.String name, final java.lang.String parent) throws java.io.UnsupportedEncodingException, org.apache.commons.codec.DecoderException {
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|1", charsetSanityCheck(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|0", name)))) == false) {
            return;
        }
        log((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|2", parent)) + "=") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|3", name))));
        final org.apache.commons.codec.binary.Hex customCodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|5", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|4", name)));
        // source data
        final java.lang.String sourceString = "Hello World";
        final byte[] sourceBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|8", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|6", sourceString).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|7", name)));
        // test 1
        // encode source to hex string to bytes with charset
        final byte[] actualEncodedBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|11", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|9", org.apache.commons.codec.binary.Hex.class, customCodec).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|10", byte[].class, sourceBytes)));
        // encode source to hex string...
        java.lang.String expectedHexString = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|13", org.apache.commons.codec.binary.Hex.encodeHexString(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|12", byte[].class, sourceBytes)));
        // ... and get the bytes in the expected charset
        final byte[] expectedHexStringBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|16", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|14", expectedHexString).getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|15", name)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|19", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|17", byte[].class, expectedHexStringBytes), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|18", byte[].class, actualEncodedBytes))));
        // test 2
        java.lang.String actualStringFromBytes = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|22", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|20", byte[].class, actualEncodedBytes), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|21", name)));
        org.junit.Assert.assertEquals((((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|23", name)) + ", expectedHexString=") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|24", expectedHexString))) + ", actualStringFromBytes=") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|25", actualStringFromBytes))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|26", expectedHexString), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|27", actualStringFromBytes));
        // second test:
        final org.apache.commons.codec.binary.Hex utf8Codec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|28", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|29", (expectedHexString = "48656c6c6f20576f726c64"));
        final byte[] decodedUtf8Bytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|32", byte[].class, ((byte[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|30", org.apache.commons.codec.binary.Hex.class, utf8Codec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|31", expectedHexString)))));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|36", (actualStringFromBytes = new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|33", byte[].class, decodedUtf8Bytes), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|35", java.nio.charset.Charset.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|34", org.apache.commons.codec.binary.Hex.class, utf8Codec).getCharset()))));
        // sanity check:
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|37", name), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|38", sourceString), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|39", actualStringFromBytes));
        // actual check:
        final byte[] decodedCustomBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|42", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|40", org.apache.commons.codec.binary.Hex.class, customCodec).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|41", byte[].class, actualEncodedBytes)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|45", (actualStringFromBytes = new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|43", byte[].class, decodedCustomBytes), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|44", name))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|46", name), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|47", sourceString), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharset(java.lang.String,java.lang.String)|48", actualStringFromBytes));
    }

    @org.junit.Test(expected = java.nio.charset.UnsupportedCharsetException.class)
    public void testCustomCharsetBadName() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharsetBadName()|0", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex(org.apache.commons.codec.binary.HexTest.BAD_ENCODING_NAME));
        } catch (java.nio.charset.UnsupportedCharsetException a1553628734055) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.binary.HexTest|testCustomCharsetBadName()|!", a1553628734055);
            throw a1553628734055;
        }
    }

    @org.junit.Test
    public void testCustomCharsetToString() {
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharsetToString()|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testCustomCharsetToString()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testCustomCharsetToString()|0", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).toString()).indexOf(org.apache.commons.codec.binary.Hex.DEFAULT_CHARSET_NAME))) >= 0));
    }

    @org.junit.Test
    public void testDecodeBadCharacterPos0() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testDecodeBadCharacterPos0()|1", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeBadCharacterPos0()|0", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode("q0"));
            org.junit.Assert.fail("An exception wasn't thrown when trying to decode an illegal character");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected exception
        }
    }

    @org.junit.Test
    public void testDecodeBadCharacterPos1() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testDecodeBadCharacterPos1()|1", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeBadCharacterPos1()|0", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode("0q"));
            org.junit.Assert.fail("An exception wasn't thrown when trying to decode an illegal character");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected exception
        }
    }

    @org.junit.Test
    public void testDecodeByteArrayEmpty() throws org.apache.commons.codec.DecoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayEmpty()|4", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayEmpty()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayEmpty()|2", byte[].class, new byte[0]))))));
    }

    @org.junit.Test
    public void testDecodeByteArrayObjectEmpty() throws org.apache.commons.codec.DecoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayObjectEmpty()|4", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayObjectEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayObjectEmpty()|3", byte[].class, ((byte[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayObjectEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayObjectEmpty()|2", java.lang.Object.class, ((java.lang.Object) (new byte[0]))))))))));
    }

    @org.junit.Test
    public void testDecodeByteArrayOddCharacters() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayOddCharacters()|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayOddCharacters()|0", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteArrayOddCharacters()|1", byte[].class, new byte[]{ 65 })));
            org.junit.Assert.fail("An exception wasn't thrown when trying to decode an odd number of characters");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected exception
        }
    }

    @org.junit.Test
    public void testDecodeByteBufferEmpty() throws org.apache.commons.codec.DecoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferEmpty()|4", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferEmpty()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferEmpty()|2", java.nio.ByteBuffer.class, java.nio.ByteBuffer.allocate(0)))))));
    }

    @org.junit.Test
    public void testDecodeByteBufferObjectEmpty() throws org.apache.commons.codec.DecoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferObjectEmpty()|4", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferObjectEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferObjectEmpty()|3", byte[].class, ((byte[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferObjectEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferObjectEmpty()|2", java.lang.Object.class, ((java.lang.Object) (java.nio.ByteBuffer.allocate(0)))))))))));
    }

    @org.junit.Test
    public void testDecodeByteBufferOddCharacters() {
        final java.nio.ByteBuffer buffer = eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferOddCharacters()|0", java.nio.ByteBuffer.class, java.nio.ByteBuffer.allocate(1));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferOddCharacters()|2", java.nio.ByteBuffer.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferOddCharacters()|1", java.nio.ByteBuffer.class, buffer).put(((byte) (65))));
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferOddCharacters()|5", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferOddCharacters()|3", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testDecodeByteBufferOddCharacters()|4", java.nio.ByteBuffer.class, buffer)));
            org.junit.Assert.fail("An exception wasn't thrown when trying to decode an odd number of characters");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected exception
        }
    }

    @org.junit.Test
    public void testDecodeHexCharArrayEmpty() throws org.apache.commons.codec.DecoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testDecodeHexCharArrayEmpty()|3", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexCharArrayEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexCharArrayEmpty()|2", byte[].class, org.apache.commons.codec.binary.Hex.decodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexCharArrayEmpty()|1", char[].class, new char[0]))))));
    }

    @org.junit.Test
    public void testDecodeHexStringEmpty() throws org.apache.commons.codec.DecoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testDecodeHexStringEmpty()|2", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexStringEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexStringEmpty()|1", byte[].class, org.apache.commons.codec.binary.Hex.decodeHex("")))));
    }

    @org.junit.Test
    public void testDecodeClassCastException() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testDecodeClassCastException()|2", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeClassCastException()|0", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeClassCastException()|1", int[].class, new int[]{ 65 })));
            org.junit.Assert.fail("An exception wasn't thrown when trying to decode.");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected exception
        }
    }

    @org.junit.Test
    public void testDecodeHexCharArrayOddCharacters1() {
        checkDecodeHexCharArrayOddCharacters(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexCharArrayOddCharacters1()|0", char[].class, new char[]{ 'A' }));
    }

    @org.junit.Test
    public void testDecodeHexStringOddCharacters1() {
        checkDecodeHexCharArrayOddCharacters("A");
    }

    @org.junit.Test
    public void testDecodeHexCharArrayOddCharacters3() {
        checkDecodeHexCharArrayOddCharacters(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexCharArrayOddCharacters3()|0", char[].class, new char[]{ 'A', 'B', 'C' }));
    }

    @org.junit.Test
    public void testDecodeHexCharArrayOddCharacters5() {
        checkDecodeHexCharArrayOddCharacters(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexCharArrayOddCharacters5()|0", char[].class, new char[]{ 'A', 'B', 'C', 'D', 'E' }));
    }

    @org.junit.Test
    public void testDecodeHexStringOddCharacters() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexStringOddCharacters()|1", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeHexStringOddCharacters()|0", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode("6"));
            org.junit.Assert.fail("An exception wasn't thrown when trying to decode an odd number of characters");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected exception
        }
    }

    @org.junit.Test
    public void testDecodeStringEmpty() throws org.apache.commons.codec.DecoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testDecodeStringEmpty()|3", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeStringEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testDecodeStringEmpty()|2", byte[].class, ((byte[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testDecodeStringEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).decode("")))))));
    }

    @org.junit.Test
    public void testEncodeByteArrayEmpty() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayEmpty()|4", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayEmpty()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayEmpty()|2", byte[].class, new byte[0]))))));
    }

    @org.junit.Test
    public void testEncodeByteArrayObjectEmpty() throws org.apache.commons.codec.EncoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayObjectEmpty()|4", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayObjectEmpty()|0", char[].class, new char[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayObjectEmpty()|3", char[].class, ((char[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayObjectEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteArrayObjectEmpty()|2", java.lang.Object.class, ((java.lang.Object) (new byte[0]))))))))));
    }

    @org.junit.Test
    public void testEncodeByteBufferEmpty() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferEmpty()|4", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferEmpty()|0", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferEmpty()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferEmpty()|2", java.nio.ByteBuffer.class, java.nio.ByteBuffer.allocate(0)))))));
    }

    @org.junit.Test
    public void testEncodeByteBufferObjectEmpty() throws org.apache.commons.codec.EncoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferObjectEmpty()|4", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferObjectEmpty()|0", char[].class, new char[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferObjectEmpty()|3", char[].class, ((char[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferObjectEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testEncodeByteBufferObjectEmpty()|2", java.lang.Object.class, ((java.lang.Object) (java.nio.ByteBuffer.allocate(0)))))))))));
    }

    @org.junit.Test
    public void testEncodeClassCastException() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.binary.HexTest|testEncodeClassCastException()|2", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeClassCastException()|0", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeClassCastException()|1", int[].class, new int[]{ 65 })));
            org.junit.Assert.fail("An exception wasn't thrown when trying to encode.");
        } catch (final org.apache.commons.codec.EncoderException e) {
            // Expected exception
        }
    }

    @org.junit.Test
    public void testEncodeDecodeHexCharArrayRandom() throws org.apache.commons.codec.DecoderException, org.apache.commons.codec.EncoderException {
        final java.util.Random random = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|0", java.util.Random.class, new java.util.Random());
        final org.apache.commons.codec.binary.Hex hex = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex());
        for (int i = 5; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|2", i)) > 0; i--) {
            final byte[] data = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|5", byte[].class, new byte[(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|3", java.util.Random.class, random).nextInt(10000))) + 1]);
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|6", java.util.Random.class, random).nextBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|7", byte[].class, data));
            // static API
            final char[] encodedChars = eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|9", char[].class, org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|8", byte[].class, data)));
            byte[] decodedBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|11", byte[].class, org.apache.commons.codec.binary.Hex.decodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|10", char[].class, encodedChars)));
            org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|14", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|12", byte[].class, data), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|13", byte[].class, decodedBytes))));
            // instance API with array parameter
            final byte[] encodedStringBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|17", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|15", org.apache.commons.codec.binary.Hex.class, hex).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|16", byte[].class, data)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|20", byte[].class, (decodedBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|18", org.apache.commons.codec.binary.Hex.class, hex).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|19", byte[].class, encodedStringBytes))));
            org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|23", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|21", byte[].class, data), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|22", byte[].class, decodedBytes))));
            // instance API with char[] (Object) parameter
            java.lang.String dataString = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|25", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|24", char[].class, encodedChars)));
            char[] encodedStringChars = eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|28", char[].class, ((char[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|26", org.apache.commons.codec.binary.Hex.class, hex).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|27", dataString)))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|31", byte[].class, (decodedBytes = ((byte[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|29", org.apache.commons.codec.binary.Hex.class, hex).decode(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|30", char[].class, encodedStringChars))))));
            org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|35", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|33", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|32", dataString))), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|34", byte[].class, decodedBytes))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|37", // instance API with String (Object) parameter
            (dataString = new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|36", char[].class, encodedChars))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|40", char[].class, (encodedStringChars = ((char[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|38", org.apache.commons.codec.binary.Hex.class, hex).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|39", dataString))))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|44", byte[].class, (decodedBytes = ((byte[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|41", org.apache.commons.codec.binary.Hex.class, hex).decode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|43", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|42", char[].class, encodedStringChars))))))));
            org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|48", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|46", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|45", dataString))), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeDecodeHexCharArrayRandom()|47", byte[].class, decodedBytes))));
        }
    }

    @org.junit.Test
    public void testEncodeHexByteArrayEmpty() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|3", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|0", char[].class, new char[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|2", char[].class, org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|1", byte[].class, new byte[0]))))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|8", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|4", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|7", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|5", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayEmpty()|6", byte[].class, new byte[0]))))));
    }

    @org.junit.Test
    public void testEncodeHexByteArrayHelloWorldLowerCaseHex() {
        final byte[] b = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World"));
        final java.lang.String expected = "48656c6c6f20576f726c64";
        char[] actual;
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|2", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|1", byte[].class, b))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|3", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|5", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|4", char[].class, actual))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|7", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|6", byte[].class, b), true)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|8", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|10", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|9", char[].class, actual))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|12", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|11", byte[].class, b), false)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|16", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|13", expected).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|15", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldLowerCaseHex()|14", char[].class, actual))))));
    }

    @org.junit.Test
    public void testEncodeHexByteArrayHelloWorldUpperCaseHex() {
        final byte[] b = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8("Hello World"));
        final java.lang.String expected = "48656C6C6F20576F726C64";
        char[] actual;
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|2", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|1", byte[].class, b))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|6", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|3", expected).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|5", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|4", char[].class, actual))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|8", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|7", byte[].class, b), true)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|12", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|9", expected).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|11", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|10", char[].class, actual))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|14", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|13", byte[].class, b), false)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|18", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|15", expected).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|17", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayHelloWorldUpperCaseHex()|16", char[].class, actual))))));
    }

    @org.junit.Test
    public void testEncodeHexByteArrayZeroes() {
        final char[] c = eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayZeroes()|1", char[].class, org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayZeroes()|0", byte[].class, new byte[36])));
        org.junit.Assert.assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayZeroes()|3", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteArrayZeroes()|2", char[].class, c))));
    }

    @org.junit.Test
    public void testEncodeHexByteBufferEmpty() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|3", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|0", char[].class, new char[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|2", char[].class, org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|1", java.nio.ByteBuffer.class, java.nio.ByteBuffer.allocate(0)))))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|8", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|4", byte[].class, new byte[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|7", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|5", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferEmpty()|6", java.nio.ByteBuffer.class, java.nio.ByteBuffer.allocate(0)))))));
    }

    @org.junit.Test
    public void testEncodeHexByteBufferHelloWorldLowerCaseHex() {
        final java.nio.ByteBuffer b = eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|0", java.nio.ByteBuffer.class, org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("Hello World"));
        final java.lang.String expected = "48656c6c6f20576f726c64";
        char[] actual;
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|2", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|1", java.nio.ByteBuffer.class, b))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|3", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|5", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|4", char[].class, actual))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|7", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|6", java.nio.ByteBuffer.class, b), true)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|8", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|10", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|9", char[].class, actual))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|12", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|11", java.nio.ByteBuffer.class, b), false)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|16", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|13", expected).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|15", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldLowerCaseHex()|14", char[].class, actual))))));
    }

    @org.junit.Test
    public void testEncodeHexByteBufferHelloWorldUpperCaseHex() {
        final java.nio.ByteBuffer b = eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|0", java.nio.ByteBuffer.class, org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8("Hello World"));
        final java.lang.String expected = "48656C6C6F20576F726C64";
        char[] actual;
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|2", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|1", java.nio.ByteBuffer.class, b))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|6", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|3", expected).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|5", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|4", char[].class, actual))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|8", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|7", java.nio.ByteBuffer.class, b), true)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|12", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|9", expected).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|11", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|10", char[].class, actual))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|14", char[].class, (actual = org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|13", java.nio.ByteBuffer.class, b), false)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|18", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|15", expected).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|17", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteBufferHelloWorldUpperCaseHex()|16", char[].class, actual))))));
    }

    @org.junit.Test
    public void testEncodeHex_ByteBufferOfZeroes() {
        final char[] c = eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHex_ByteBufferOfZeroes()|1", char[].class, org.apache.commons.codec.binary.Hex.encodeHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHex_ByteBufferOfZeroes()|0", java.nio.ByteBuffer.class, java.nio.ByteBuffer.allocate(36))));
        org.junit.Assert.assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHex_ByteBufferOfZeroes()|3", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHex_ByteBufferOfZeroes()|2", char[].class, c))));
    }

    @org.junit.Test
    public void testEncodeHexByteString_ByteBufferOfZeroes() {
        final java.lang.String c = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferOfZeroes()|1", org.apache.commons.codec.binary.Hex.encodeHexString(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferOfZeroes()|0", java.nio.ByteBuffer.class, java.nio.ByteBuffer.allocate(36))));
        org.junit.Assert.assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferOfZeroes()|2", c));
    }

    @org.junit.Test
    public void testEncodeHexByteString_ByteArrayOfZeroes() {
        final java.lang.String c = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteArrayOfZeroes()|1", org.apache.commons.codec.binary.Hex.encodeHexString(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteArrayOfZeroes()|0", byte[].class, new byte[36])));
        org.junit.Assert.assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteArrayOfZeroes()|2", c));
    }

    @org.junit.Test
    public void testEncodeHexByteString_ByteArrayBoolean_ToLowerCase() {
        org.junit.Assert.assertEquals("0a", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteArrayBoolean_ToLowerCase()|1", org.apache.commons.codec.binary.Hex.encodeHexString(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteArrayBoolean_ToLowerCase()|0", byte[].class, new byte[]{ 10 }), true)));
    }

    @org.junit.Test
    public void testEncodeHexByteString_ByteArrayBoolean_ToUpperCase() {
        org.junit.Assert.assertEquals("0A", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteArrayBoolean_ToUpperCase()|1", org.apache.commons.codec.binary.Hex.encodeHexString(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteArrayBoolean_ToUpperCase()|0", byte[].class, new byte[]{ 10 }), false)));
    }

    @org.junit.Test
    public void testEncodeHexByteString_ByteBufferBoolean_ToLowerCase() {
        org.junit.Assert.assertEquals("0a", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferBoolean_ToLowerCase()|2", org.apache.commons.codec.binary.Hex.encodeHexString(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferBoolean_ToLowerCase()|1", java.nio.ByteBuffer.class, java.nio.ByteBuffer.wrap(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferBoolean_ToLowerCase()|0", byte[].class, new byte[]{ 10 }))), true)));
    }

    @org.junit.Test
    public void testEncodeHexByteString_ByteBufferBoolean_ToUpperCase() {
        org.junit.Assert.assertEquals("0A", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferBoolean_ToUpperCase()|2", org.apache.commons.codec.binary.Hex.encodeHexString(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferBoolean_ToUpperCase()|1", java.nio.ByteBuffer.class, java.nio.ByteBuffer.wrap(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeHexByteString_ByteBufferBoolean_ToUpperCase()|0", byte[].class, new byte[]{ 10 }))), false)));
    }

    @org.junit.Test
    public void testEncodeStringEmpty() throws org.apache.commons.codec.EncoderException {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testEncodeStringEmpty()|3", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeStringEmpty()|0", char[].class, new char[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.binary.HexTest|testEncodeStringEmpty()|2", char[].class, ((char[]) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testEncodeStringEmpty()|1", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex()).encode("")))))));
    }

    @org.junit.Test
    public void testGetCharset() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.binary.HexTest|testGetCharset()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.binary.HexTest|testGetCharset()|3", java.nio.charset.Charset.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testGetCharset()|2", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.binary.HexTest|testGetCharset()|1", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))).getCharset()));
    }

    @org.junit.Test
    public void testGetCharsetName() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testGetCharsetName()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.binary.HexTest|testGetCharsetName()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8).name()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.HexTest|testGetCharsetName()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Hex>observeState("org.apache.commons.codec.binary.HexTest|testGetCharsetName()|3", org.apache.commons.codec.binary.Hex.class, new org.apache.commons.codec.binary.Hex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.binary.HexTest|testGetCharsetName()|2", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))).getCharsetName()));
    }

    @org.junit.Test
    public void testRequiredCharset() throws java.io.UnsupportedEncodingException, org.apache.commons.codec.DecoderException {
        testCustomCharset("UTF-8", "testRequiredCharset");
        testCustomCharset("UTF-16", "testRequiredCharset");
        testCustomCharset("UTF-16BE", "testRequiredCharset");
        testCustomCharset("UTF-16LE", "testRequiredCharset");
        testCustomCharset("US-ASCII", "testRequiredCharset");
        testCustomCharset("ISO8859_1", "testRequiredCharset");
    }
}

