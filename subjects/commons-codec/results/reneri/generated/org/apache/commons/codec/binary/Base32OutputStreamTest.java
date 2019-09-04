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


public class Base32OutputStreamTest {
    private static final byte[] CRLF = new byte[]{ ((byte) ('\r')), ((byte) ('\n')) };

    private static final byte[] LF = new byte[]{ ((byte) ('\n')) };

    // /**
    // * Test the Base32OutputStream implementation against the special NPE inducing input
    // * identified in the CODEC-98 bug.
    // *
    // * @throws Exception for some failure scenarios.
    // */
    // @Test
    // public void testCodec98NPE() throws Exception {
    // byte[] codec98 = StringUtils.getBytesUtf8(Base32TestData.CODEC_98_NPE);
    // byte[] codec98_1024 = new byte[1024];
    // System.arraycopy(codec98, 0, codec98_1024, 0, codec98.length);
    // ByteArrayOutputStream data = new ByteArrayOutputStream(1024);
    // Base32OutputStream stream = new Base32OutputStream(data, false);
    // stream.write(codec98_1024, 0, 1024);
    // stream.close();
    // 
    // byte[] decodedBytes = data.toByteArray();
    // String decoded = StringUtils.newStringUtf8(decodedBytes);
    // assertEquals(
    // "codec-98 NPE Base32OutputStream", Base32TestData.CODEC_98_NPE_DECODED, decoded
    // );
    // }
    /**
     * Test the Base32OutputStream implementation against empty input.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase32EmptyOutputStreamMimeChunkSize() throws java.lang.Exception {
        testBase32EmptyOutputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
    }

    /**
     * Test the Base32OutputStream implementation against empty input.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase32EmptyOutputStreamPemChunkSize() throws java.lang.Exception {
        testBase32EmptyOutputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
    }

    private void testBase32EmptyOutputStream(final int chunkSize) throws java.lang.Exception {
        final byte[] emptyEncoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|0", byte[].class, new byte[0]);
        final byte[] emptyDecoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|1", byte[].class, new byte[0]);
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|2", byte[].class, emptyEncoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|3", byte[].class, emptyDecoded), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|4", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|5", byte[].class, org.apache.commons.codec.binary.Base32OutputStreamTest.CRLF));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|6", byte[].class, emptyEncoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|7", byte[].class, emptyDecoded), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|8", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32EmptyOutputStream(int)|9", byte[].class, org.apache.commons.codec.binary.Base32OutputStreamTest.CRLF));
    }

    /**
     * Test the Base32OutputStream implementation
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase32OutputStreamByChunk() throws java.lang.Exception {
        // Hello World test.
        byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE));
        byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|1", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|2", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|3", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|4", byte[].class, org.apache.commons.codec.binary.Base32OutputStreamTest.CRLF));
        // // Single Byte test.
        // encoded = StringUtils.getBytesUtf8("AA==\r\n");
        // decoded = new byte[]{(byte) 0};
        // testByChunk(encoded, decoded, Base32.MIME_CHUNK_SIZE, CRLF);
        // // Single Line test.
        // String singleLine = Base32TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        // encoded = StringUtils.getBytesUtf8(singleLine);
        // decoded = Base32TestData.DECODED;
        // testByChunk(encoded, decoded, 0, LF);
        // test random data of sizes 0 thru 150
        final org.apache.commons.codec.binary.BaseNCodec codec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|5", org.apache.commons.codec.binary.Base32.class, new org.apache.commons.codec.binary.Base32());
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|6", i)) <= 150; i++) {
            final byte[][] randomData = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|9", byte[][].class, org.apache.commons.codec.binary.Base32TestData.randomData(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|7", org.apache.commons.codec.binary.BaseNCodec.class, codec), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|8", i)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|11", byte[].class, (encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|10", byte[][].class, randomData)[1]));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|13", byte[].class, (decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|12", byte[][].class, randomData)[0]));
            testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|14", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|15", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByChunk()|16", byte[].class, org.apache.commons.codec.binary.Base32OutputStreamTest.LF));
        }
    }

    /**
     * Test the Base32OutputStream implementation
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase32OutputStreamByteByByte() throws java.lang.Exception {
        // Hello World test.
        byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE));
        byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|1", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|2", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|3", byte[].class, decoded), 76, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|4", byte[].class, org.apache.commons.codec.binary.Base32OutputStreamTest.CRLF));
        // // Single Byte test.
        // encoded = StringUtils.getBytesUtf8("AA==\r\n");
        // decoded = new byte[]{(byte) 0};
        // testByteByByte(encoded, decoded, 76, CRLF);
        // // Single Line test.
        // String singleLine = Base32TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", "");
        // encoded = StringUtils.getBytesUtf8(singleLine);
        // decoded = Base32TestData.DECODED;
        // testByteByByte(encoded, decoded, 0, LF);
        // test random data of sizes 0 thru 150
        final org.apache.commons.codec.binary.BaseNCodec codec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|5", org.apache.commons.codec.binary.Base32.class, new org.apache.commons.codec.binary.Base32());
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|6", i)) <= 150; i++) {
            final byte[][] randomData = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|9", byte[][].class, org.apache.commons.codec.binary.Base32TestData.randomData(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|7", org.apache.commons.codec.binary.BaseNCodec.class, codec), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|8", i)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|11", byte[].class, (encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|10", byte[][].class, randomData)[1]));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|13", byte[].class, (decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|12", byte[][].class, randomData)[0]));
            testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|14", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|15", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testBase32OutputStreamByteByByte()|16", byte[].class, org.apache.commons.codec.binary.Base32OutputStreamTest.LF));
        }
    }

    /**
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     *
     * @param encoded
     * 		Base32 encoded data
     * @param decoded
     * 		the data from above, but decoded
     * @param chunkSize
     * 		chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * 		Line separator in the Base32 encoded data.
     * @throws Exception
     * 		Usually signifies a bug in the Base32 commons-codec implementation.
     */
    private void testByChunk(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws java.lang.Exception {
        // Start with encode.
        java.io.ByteArrayOutputStream byteOut = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        java.io.OutputStream out = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|4", org.apache.commons.codec.binary.Base32OutputStream.class, new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|1", java.io.ByteArrayOutputStream.class, byteOut), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|2", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|3", byte[].class, separator)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|5", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|6", byte[].class, decoded));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|7", java.io.OutputStream.class, out).close();
        byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|9", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|8", java.io.ByteArrayOutputStream.class, byteOut).toByteArray());
        org.junit.Assert.assertTrue("Streaming chunked Base32 encode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|12", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|10", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|11", byte[].class, encoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|13", java.io.ByteArrayOutputStream.class, // Now let's try decode.
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|15", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|14", java.io.ByteArrayOutputStream.class, byteOut), false)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|16", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|17", byte[].class, encoded));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|18", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|20", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|19", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming chunked Base32 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|23", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|21", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|22", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|24", java.io.ByteArrayOutputStream.class, // I always wanted to do this! (wrap encoder with decoder etc etc).
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|25", java.io.OutputStream.class, (out = byteOut));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|26", i)) < 10; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|28", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|27", java.io.OutputStream.class, out), false)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|32", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|29", java.io.OutputStream.class, out), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|30", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|31", byte[].class, separator))));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|33", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|34", byte[].class, decoded));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|35", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|37", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|36", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming chunked Base32 wrap-wrap-wrap!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|40", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|38", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByChunk(byte[],byte[],int,byte[])|39", byte[].class, decoded))));
    }

    /**
     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]-->
     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32OutputStream wraps itself in encode and decode
     * mode over and over again.
     *
     * @param encoded
     * 		Base32 encoded data
     * @param decoded
     * 		the data from above, but decoded
     * @param chunkSize
     * 		chunk size (line-length) of the Base32 encoded data.
     * @param separator
     * 		Line separator in the Base32 encoded data.
     * @throws Exception
     * 		Usually signifies a bug in the Base32 commons-codec implementation.
     */
    private void testByteByByte(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws java.lang.Exception {
        // Start with encode.
        java.io.ByteArrayOutputStream byteOut = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        java.io.OutputStream out = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|4", org.apache.commons.codec.binary.Base32OutputStream.class, new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|1", java.io.ByteArrayOutputStream.class, byteOut), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|2", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|3", byte[].class, separator)));
        for (final byte element : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|5", byte[].class, decoded)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|6", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|7", element));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|8", java.io.OutputStream.class, out).close();
        byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|10", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|9", java.io.ByteArrayOutputStream.class, byteOut).toByteArray());
        org.junit.Assert.assertTrue("Streaming byte-by-byte Base32 encode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|13", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|11", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|12", byte[].class, encoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|14", java.io.ByteArrayOutputStream.class, // Now let's try decode.
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|16", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|15", java.io.ByteArrayOutputStream.class, byteOut), false)));
        for (final byte element : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|17", byte[].class, encoded)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|18", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|19", element));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|20", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|22", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|21", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming byte-by-byte Base32 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|25", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|23", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|24", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|26", java.io.ByteArrayOutputStream.class, // Now let's try decode with tonnes of flushes.
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|28", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|27", java.io.ByteArrayOutputStream.class, byteOut), false)));
        for (final byte element : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|29", byte[].class, encoded)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|30", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|31", element));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|32", java.io.OutputStream.class, out).flush();
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|33", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|35", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|34", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming byte-by-byte flush() Base32 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|38", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|36", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|37", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|39", java.io.ByteArrayOutputStream.class, // I always wanted to do this! (wrap encoder with decoder etc etc).
        (byteOut = new java.io.ByteArrayOutputStream()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|40", java.io.OutputStream.class, (out = byteOut));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|41", i)) < 10; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|43", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|42", java.io.OutputStream.class, out), false)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|47", java.io.OutputStream.class, (out = new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|44", java.io.OutputStream.class, out), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|45", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|46", byte[].class, separator))));
        }
        for (final byte element : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|48", byte[].class, decoded)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|49", java.io.OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|50", element));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|51", java.io.OutputStream.class, out).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|53", byte[].class, (output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|52", java.io.ByteArrayOutputStream.class, byteOut).toByteArray()));
        org.junit.Assert.assertTrue("Streaming byte-by-byte Base32 wrap-wrap-wrap!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|56", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|54", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testByteByByte(byte[],byte[],int,byte[])|55", byte[].class, decoded))));
    }

    /**
     * Tests Base32OutputStream.write for expected IndexOutOfBoundsException conditions.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testWriteOutOfBounds() throws java.lang.Exception {
        final byte[] buf = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|0", byte[].class, new byte[1024]);
        final java.io.ByteArrayOutputStream bout = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|1", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        try (final org.apache.commons.codec.binary.Base32OutputStream out = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|3", org.apache.commons.codec.binary.Base32OutputStream.class, new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|2", java.io.ByteArrayOutputStream.class, bout)))) {
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|4", org.apache.commons.codec.binary.Base32OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|5", byte[].class, buf), (-1), 1);
                org.junit.Assert.fail("Expected Base32OutputStream.write(buf, -1, 1) to throw a IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException ioobe) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|6", org.apache.commons.codec.binary.Base32OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|7", byte[].class, buf), 1, (-1));
                org.junit.Assert.fail("Expected Base32OutputStream.write(buf, 1, -1) to throw a IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException ioobe) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|8", org.apache.commons.codec.binary.Base32OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|9", byte[].class, buf), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|10", byte[].class, buf).length)) + 1), 0);
                org.junit.Assert.fail("Expected Base32OutputStream.write(buf, buf.length + 1, 0) to throw a IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException ioobe) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|12", org.apache.commons.codec.binary.Base32OutputStream.class, out).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|13", byte[].class, buf), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteOutOfBounds()|14", byte[].class, buf).length)) - 1), 2);
                org.junit.Assert.fail("Expected Base32OutputStream.write(buf, buf.length - 1, 2) to throw a IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException ioobe) {
                // Expected
            }
        }
    }

    /**
     * Tests Base32OutputStream.write(null).
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testWriteToNullCoverage() throws java.lang.Exception {
        final java.io.ByteArrayOutputStream bout = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteToNullCoverage()|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        try (final org.apache.commons.codec.binary.Base32OutputStream out = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteToNullCoverage()|2", org.apache.commons.codec.binary.Base32OutputStream.class, new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteToNullCoverage()|1", java.io.ByteArrayOutputStream.class, bout)))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32OutputStreamTest|testWriteToNullCoverage()|3", org.apache.commons.codec.binary.Base32OutputStream.class, out).write(null, 0, 0);
            org.junit.Assert.fail("Expcted Base32OutputStream.write(null) to throw a NullPointerException");
        } catch (final java.lang.NullPointerException e) {
            // Expected
        }
    }
}

