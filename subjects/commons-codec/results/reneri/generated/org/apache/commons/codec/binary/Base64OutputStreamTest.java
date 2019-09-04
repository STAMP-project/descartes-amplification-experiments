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
 *
 *
 * @version $Id $
 * @since 1.4
 */
public class Base64OutputStreamTest {
    private static final byte[] CRLF = new byte[]{ ((byte) ('\r')), ((byte) ('\n')) };

    private static final byte[] LF = new byte[]{ ((byte) ('\n')) };

    private static final java.lang.String STRING_FIXTURE = "Hello World";

    /**
     * Test the Base64OutputStream implementation against the special NPE inducing input
     * identified in the CODEC-98 bug.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testCodec98NPE() throws java.lang.Exception {
        final byte[] codec98 = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE));
        final byte[] codec98_1024 = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|1", byte[].class, new byte[1024]);
        java.lang.System.arraycopy(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|2", byte[].class, codec98), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|3", byte[].class, codec98_1024), 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|4", byte[].class, codec98).length));
        final java.io.ByteArrayOutputStream data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|6", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream(1024));
        try (final org.apache.commons.codec.binary.Base64OutputStream stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|8", org.apache.commons.codec.binary.Base64OutputStream.class, new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|7", java.io.ByteArrayOutputStream.class, data), false))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|9", org.apache.commons.codec.binary.Base64OutputStream.class, stream).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|10", byte[].class, codec98_1024), 0, 1024);
        }
        final byte[] decodedBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|12", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|11", java.io.ByteArrayOutputStream.class, data).toByteArray());
        final java.lang.String decoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|14", org.apache.commons.codec.binary.StringUtils.newStringUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|13", byte[].class, decodedBytes)));
        org.junit.Assert.assertEquals("codec-98 NPE Base64OutputStream", org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testCodec98NPE()|15", decoded));
    }

    /**
     * Test the Base64OutputStream implementation against empty input.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase64EmptyOutputStreamMimeChunkSize() throws java.lang.Exception {
        testBase64EmptyOutputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
    }

    /**
     * Test the Base64OutputStream implementation against empty input.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase64EmptyOutputStreamPemChunkSize() throws java.lang.Exception {
        testBase64EmptyOutputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
    }

    private void testBase64EmptyOutputStream(final int chunkSize) throws java.lang.Exception {
        final byte[] emptyEncoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|0", byte[].class, new byte[0]);
        final byte[] emptyDecoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|1", byte[].class, new byte[0]);
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|2", byte[].class, emptyEncoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|3", byte[].class, emptyDecoded), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|4", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|5", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.CRLF));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|6", byte[].class, emptyEncoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|7", byte[].class, emptyDecoded), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|8", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64EmptyOutputStream(int)|9", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.CRLF));
    }

    /**
     * Test the Base64OutputStream implementation
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase64OutputStreamByChunk() throws java.lang.Exception {
        // Hello World test.
        byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n"));
        byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|1", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64OutputStreamTest.STRING_FIXTURE));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|2", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|3", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|4", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|5", byte[].class, // Single Byte test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|6", byte[].class, (decoded = new byte[]{ ((byte) (0)) }));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|7", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|8", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|9", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|10", byte[].class, // OpenSSL interop test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64TestData.ENCODED_64_CHARS_PER_LINE)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|11", byte[].class, (decoded = org.apache.commons.codec.binary.Base64TestData.DECODED));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|12", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|13", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|14", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.LF));
        // Single Line test.
        final java.lang.String singleLine = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|15", org.apache.commons.codec.binary.Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", ""));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|17", byte[].class, (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|16", singleLine))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|18", byte[].class, (decoded = org.apache.commons.codec.binary.Base64TestData.DECODED));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|19", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|20", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|21", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.LF));
        // test random data of sizes 0 thru 150
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|22", i)) <= 150; i++) {
            final byte[][] randomData = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|24", byte[][].class, org.apache.commons.codec.binary.Base64TestData.randomData(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|23", i), false));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|26", byte[].class, (encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|25", byte[][].class, randomData)[1]));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|28", byte[].class, (decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|27", byte[][].class, randomData)[0]));
            testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|29", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|30", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByChunk()|31", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.LF));
        }
    }

    /**
     * Test the Base64OutputStream implementation
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase64OutputStreamByteByByte() throws java.lang.Exception {
        // Hello World test.
        byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n"));
        byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|1", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64OutputStreamTest.STRING_FIXTURE));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|2", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|3", byte[].class, decoded), 76, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|4", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|5", byte[].class, // Single Byte test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|6", byte[].class, (decoded = new byte[]{ ((byte) (0)) }));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|7", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|8", byte[].class, decoded), 76, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|9", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|10", byte[].class, // OpenSSL interop test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64TestData.ENCODED_64_CHARS_PER_LINE)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|11", byte[].class, (decoded = org.apache.commons.codec.binary.Base64TestData.DECODED));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|12", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|13", byte[].class, decoded), 64, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|14", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.LF));
        // Single Line test.
        final java.lang.String singleLine = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|15", org.apache.commons.codec.binary.Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", ""));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|17", byte[].class, (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|16", singleLine))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|18", byte[].class, (decoded = org.apache.commons.codec.binary.Base64TestData.DECODED));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|19", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|20", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|21", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.LF));
        // test random data of sizes 0 thru 150
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|22", i)) <= 150; i++) {
            final byte[][] randomData = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|24", byte[][].class, org.apache.commons.codec.binary.Base64TestData.randomData(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|23", i), false));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|26", byte[].class, (encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|25", byte[][].class, randomData)[1]));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|28", byte[].class, (decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|27", byte[][].class, randomData)[0]));
            testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|29", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|30", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testBase64OutputStreamByteByByte()|31", byte[].class, org.apache.commons.codec.binary.Base64OutputStreamTest.LF));
        }
    }

    /**
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
     *
     * @param encoded
     * 		base64 encoded data
     * @param decoded
     * 		the data from above, but decoded
     * @param chunkSize
     * 		chunk size (line-length) of the base64 encoded data.
     * @param separator
     * 		Line separator in the base64 encoded data.
     * @throws Exception
     * 		Usually signifies a bug in the Base64 commons-codec implementation.
     */
    private void testByChunk(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws java.lang.Exception {
        // Start with encode.
        java.io.ByteArrayOutputStream byteOut = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        java.io.OutputStream out = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|4", org.apache.commons.codec.binary.Base64OutputStream.class, new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|1", java.io.ByteArrayOutputStream.class, byteOut), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|2", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|3", byte[].class, separator)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|5", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|6", byte[].class, decoded));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|7", java.io.OutputStream.class, out).close();
        byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|9", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|8", java.io.ByteArrayOutputStream.class, byteOut).toByteArray());
        org.junit.Assert.assertTrue("Streaming chunked base64 encode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|12", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|10", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|11", byte[].class, encoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|13", java.io.ByteArrayOutputStream.class, // Now let's try decode.
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|15", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|14", java.io.ByteArrayOutputStream.class, byteOut), false)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|16", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|17", byte[].class, encoded));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|18", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|20", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|19", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming chunked base64 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|23", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|21", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|22", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|24", java.io.ByteArrayOutputStream.class, // I always wanted to do this! (wrap encoder with decoder etc etc).
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|25", java.io.OutputStream.class, (out = byteOut));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|26", i)) < 10; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|28", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|27", java.io.OutputStream.class, out), false)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|32", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|29", java.io.OutputStream.class, out), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|30", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|31", byte[].class, separator))));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|33", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|34", byte[].class, decoded));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|35", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|37", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|36", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming chunked base64 wrap-wrap-wrap!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|40", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|38", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|39", byte[].class, decoded))));
    }

    /**
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64OutputStream wraps itself in encode and decode
     * mode over and over again.
     *
     * @param encoded
     * 		base64 encoded data
     * @param decoded
     * 		the data from above, but decoded
     * @param chunkSize
     * 		chunk size (line-length) of the base64 encoded data.
     * @param separator
     * 		Line separator in the base64 encoded data.
     * @throws Exception
     * 		Usually signifies a bug in the Base64 commons-codec implementation.
     */
    private void testByteByByte(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws java.lang.Exception {
        // Start with encode.
        java.io.ByteArrayOutputStream byteOut = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        java.io.OutputStream out = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|4", org.apache.commons.codec.binary.Base64OutputStream.class, new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|1", java.io.ByteArrayOutputStream.class, byteOut), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|2", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|3", byte[].class, separator)));
        for (final byte element : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|5", byte[].class, decoded)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|6", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|7", element));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|8", java.io.OutputStream.class, out).close();
        byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|10", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|9", java.io.ByteArrayOutputStream.class, byteOut).toByteArray());
        org.junit.Assert.assertTrue("Streaming byte-by-byte base64 encode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|13", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|11", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|12", byte[].class, encoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|14", java.io.ByteArrayOutputStream.class, // Now let's try decode.
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|16", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|15", java.io.ByteArrayOutputStream.class, byteOut), false)));
        for (final byte element : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|17", byte[].class, encoded)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|18", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|19", element));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|20", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|22", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|21", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming byte-by-byte base64 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|25", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|23", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|24", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|26", java.io.ByteArrayOutputStream.class, // Now let's try decode with tonnes of flushes.
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|28", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|27", java.io.ByteArrayOutputStream.class, byteOut), false)));
        for (final byte element : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|29", byte[].class, encoded)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|30", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|31", element));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|32", java.io.OutputStream.class, out).flush();
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|33", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|35", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|34", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming byte-by-byte flush() base64 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|38", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|36", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|37", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|39", java.io.ByteArrayOutputStream.class, // I always wanted to do this! (wrap encoder with decoder etc etc).
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|40", java.io.OutputStream.class, (out = byteOut));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|41", i)) < 10; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|43", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|42", java.io.OutputStream.class, out), false)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|47", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|44", java.io.OutputStream.class, out), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|45", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|46", byte[].class, separator))));
        }
        for (final byte element : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|48", byte[].class, decoded)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|49", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|50", element));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|51", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|53", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|52", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming byte-by-byte base64 wrap-wrap-wrap!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|56", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|54", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|55", byte[].class, decoded))));
    }

    /**
     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testWriteOutOfBounds() throws java.lang.Exception {
        final byte[] buf = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|0", byte[].class, new byte[1024]);
        final java.io.ByteArrayOutputStream bout = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|1", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        try (final org.apache.commons.codec.binary.Base64OutputStream out = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|3", org.apache.commons.codec.binary.Base64OutputStream.class, new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|2", java.io.ByteArrayOutputStream.class, bout)))) {
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|4", org.apache.commons.codec.binary.Base64OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|5", byte[].class, buf), (-1), 1);
                org.junit.Assert.fail("Expected Base64OutputStream.write(buf, -1, 1) to throw a IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException ioobe) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|6", org.apache.commons.codec.binary.Base64OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|7", byte[].class, buf), 1, (-1));
                org.junit.Assert.fail("Expected Base64OutputStream.write(buf, 1, -1) to throw a IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException ioobe) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|8", org.apache.commons.codec.binary.Base64OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|9", byte[].class, buf), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|10", byte[].class, buf).length)) + 1), 0);
                org.junit.Assert.fail("Expected Base64OutputStream.write(buf, buf.length + 1, 0) to throw a IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException ioobe) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|12", org.apache.commons.codec.binary.Base64OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|13", byte[].class, buf), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteOutOfBounds()|14", byte[].class, buf).length)) - 1), 2);
                org.junit.Assert.fail("Expected Base64OutputStream.write(buf, buf.length - 1, 2) to throw a IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException ioobe) {
                // Expected
            }
        }
    }

    /**
     * Tests Base64OutputStream.write(null).
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testWriteToNullCoverage() throws java.lang.Exception {
        final java.io.ByteArrayOutputStream bout = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteToNullCoverage()|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        try (final org.apache.commons.codec.binary.Base64OutputStream out = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteToNullCoverage()|2", org.apache.commons.codec.binary.Base64OutputStream.class, new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteToNullCoverage()|1", java.io.ByteArrayOutputStream.class, bout)))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64OutputStreamTest|testWriteToNullCoverage()|3", org.apache.commons.codec.binary.Base64OutputStream.class, out).write(null, 0, 0);
            org.junit.Assert.fail("Expcted Base64OutputStream.write(null) to throw a NullPointerException");
        } catch (final java.lang.NullPointerException e) {
            // Expected
        }
    }
}

