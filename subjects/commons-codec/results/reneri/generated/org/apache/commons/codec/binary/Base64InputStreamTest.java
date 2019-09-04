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
public class Base64InputStreamTest {
    /**
     * Decodes to {0, 0, 0, 255, 255, 255}
     */
    private static final java.lang.String ENCODED_B64 = "AAAA////";

    private static final byte[] CRLF = new byte[]{ ((byte) ('\r')), ((byte) ('\n')) };

    private static final byte[] LF = new byte[]{ ((byte) ('\n')) };

    private static final java.lang.String STRING_FIXTURE = "Hello World";

    /**
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
    @org.junit.Test
    public void testCodec130() throws java.io.IOException {
        final java.io.ByteArrayOutputStream bos = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        try (final org.apache.commons.codec.binary.Base64OutputStream base64os = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|2", org.apache.commons.codec.binary.Base64OutputStream.class, new org.apache.commons.codec.binary.Base64OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|1", java.io.ByteArrayOutputStream.class, bos)))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64OutputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|3", org.apache.commons.codec.binary.Base64OutputStream.class, base64os).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|4", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE)));
        }
        final java.io.ByteArrayInputStream bis = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|7", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|6", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|5", java.io.ByteArrayOutputStream.class, bos).toByteArray())));
        final org.apache.commons.codec.binary.Base64InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|9", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|8", java.io.ByteArrayInputStream.class, bis)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|11", // we skip the first character read from the reader
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|10", org.apache.commons.codec.binary.Base64InputStream.class, ins).skip(1));
        final byte[] decodedBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|14", byte[].class, org.apache.commons.codec.binary.Base64TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|12", org.apache.commons.codec.binary.Base64InputStream.class, ins), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|13", byte[].class, new byte[64])));
        final java.lang.String str = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|16", org.apache.commons.codec.binary.StringUtils.newStringUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|15", byte[].class, decodedBytes)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|17", org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE.substring(1)), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec130()|18", str));
    }

    /**
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
    @org.junit.Test
    public void testCodec105() throws java.io.IOException {
        try (final org.apache.commons.codec.binary.Base64InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec105()|1", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Codec105ErrorInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec105()|0", org.apache.commons.codec.binary.Codec105ErrorInputStream.class, new org.apache.commons.codec.binary.Codec105ErrorInputStream()), true, 0, null))) {
            for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec105()|2", i)) < 5; i++) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec105()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec105()|3", org.apache.commons.codec.binary.Base64InputStream.class, in).read());
            }
        }
    }

    /**
     * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0 because Java's builtin InputStreamReader hates that.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testCodec101() throws java.lang.Exception {
        final byte[] codec101 = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64TestData.CODEC_101_MULTIPLE_OF_3));
        final java.io.ByteArrayInputStream bais = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|2", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|1", byte[].class, codec101)));
        try (final org.apache.commons.codec.binary.Base64InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|4", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|3", java.io.ByteArrayInputStream.class, bais)))) {
            final byte[] result = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|5", byte[].class, new byte[8192]);
            int c = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|6", org.apache.commons.codec.binary.Base64InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|7", byte[].class, result)));
            org.junit.Assert.assertTrue((("Codec101: First read successful [c=" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|9", c))) + "]"), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|10", c)) > 0));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|13", (c = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|11", org.apache.commons.codec.binary.Base64InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|12", byte[].class, result))));
            org.junit.Assert.assertTrue((("Codec101: Second read should report end-of-stream [c=" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|14", c))) + "]"), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec101()|15", c)) < 0));
        }
    }

    /**
     * Another test for the CODEC-101 bug: In commons-codec-1.4 this test shows InputStreamReader explicitly hating an
     * InputStream.read(byte[]) return of 0:
     *
     * java.io.IOException: Underlying input stream returned zero bytes at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268) at
     * sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306) at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158) at
     * java.io.InputStreamReader.read(InputStreamReader.java:167) at java.io.BufferedReader.fill(BufferedReader.java:136) at
     * java.io.BufferedReader.readLine(BufferedReader.java:299) at java.io.BufferedReader.readLine(BufferedReader.java:362) at
     * org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader(Base64InputStreamTest.java:75)
     *
     * But in commons-codec-1.5 it's fixed. :-)
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testInputStreamReader() throws java.lang.Exception {
        final byte[] codec101 = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64TestData.CODEC_101_MULTIPLE_OF_3));
        final java.io.ByteArrayInputStream bais = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|2", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|1", byte[].class, codec101)));
        final org.apache.commons.codec.binary.Base64InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|4", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|3", java.io.ByteArrayInputStream.class, bais)));
        final java.io.InputStreamReader isr = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStreamReader>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|6", java.io.InputStreamReader.class, new java.io.InputStreamReader(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|5", org.apache.commons.codec.binary.Base64InputStream.class, in)));
        try (final java.io.BufferedReader br = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.BufferedReader>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|8", java.io.BufferedReader.class, new java.io.BufferedReader(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStreamReader>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|7", java.io.InputStreamReader.class, isr)))) {
            final java.lang.String line = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.BufferedReader>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|9", java.io.BufferedReader.class, br).readLine());
            org.junit.Assert.assertNotNull("Codec101:  InputStreamReader works!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testInputStreamReader()|11", line));
        }
    }

    /**
     * Test the Base64InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testCodec98NPE() throws java.lang.Exception {
        final byte[] codec98 = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE));
        final java.io.ByteArrayInputStream data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|2", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|1", byte[].class, codec98)));
        final org.apache.commons.codec.binary.Base64InputStream stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|4", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|3", java.io.ByteArrayInputStream.class, data)));
        // This line causes an NPE in commons-codec-1.4.jar:
        final byte[] decodedBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|7", byte[].class, org.apache.commons.codec.binary.Base64TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|5", org.apache.commons.codec.binary.Base64InputStream.class, stream), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|6", byte[].class, new byte[1024])));
        final java.lang.String decoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|9", org.apache.commons.codec.binary.StringUtils.newStringUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|8", byte[].class, decodedBytes)));
        org.junit.Assert.assertEquals("codec-98 NPE Base64InputStream", org.apache.commons.codec.binary.Base64TestData.CODEC_98_NPE_DECODED, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testCodec98NPE()|10", decoded));
    }

    /**
     * Tests skipping past the end of a stream.
     *
     * @throws Throwable
     * 		
     */
    @org.junit.Test
    public void testAvailable() throws java.lang.Throwable {
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base64InputStreamTest.ENCODED_B64))));
        try (final org.apache.commons.codec.binary.Base64InputStream b64stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|3", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|2", java.io.InputStream.class, ins)))) {
            org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|4", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).available()));
            org.junit.Assert.assertEquals(6, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|6", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).skip(10)));
            // End of stream reached
            org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|8", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).available()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|10", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|12", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
            org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testAvailable()|14", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).available()));
        }
    }

    /**
     * Tests the Base64InputStream implementation against empty input.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase64EmptyInputStreamMimeChuckSize() throws java.lang.Exception {
        testBase64EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
    }

    /**
     * Tests the Base64InputStream implementation against empty input.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase64EmptyInputStreamPemChuckSize() throws java.lang.Exception {
        testBase64EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
    }

    private void testBase64EmptyInputStream(final int chuckSize) throws java.lang.Exception {
        final byte[] emptyEncoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|0", byte[].class, new byte[0]);
        final byte[] emptyDecoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|1", byte[].class, new byte[0]);
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|2", byte[].class, emptyEncoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|3", byte[].class, emptyDecoded), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|4", chuckSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|5", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.CRLF));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|6", byte[].class, emptyEncoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|7", byte[].class, emptyDecoded), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|8", chuckSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64EmptyInputStream(int)|9", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.CRLF));
    }

    /**
     * Tests the Base64InputStream implementation.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase64InputStreamByChunk() throws java.lang.Exception {
        // Hello World test.
        byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n"));
        byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|1", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|2", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|3", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|4", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|5", byte[].class, // Single Byte test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|6", byte[].class, (decoded = new byte[]{ ((byte) (0)) }));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|7", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|8", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|9", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|10", byte[].class, // OpenSSL interop test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64TestData.ENCODED_64_CHARS_PER_LINE)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|11", byte[].class, (decoded = org.apache.commons.codec.binary.Base64TestData.DECODED));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|12", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|13", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|14", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.LF));
        // Single Line test.
        final java.lang.String singleLine = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|15", org.apache.commons.codec.binary.Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", ""));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|17", byte[].class, (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|16", singleLine))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|18", byte[].class, (decoded = org.apache.commons.codec.binary.Base64TestData.DECODED));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|19", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|20", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|21", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.LF));
        // test random data of sizes 0 thru 150
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|22", i)) <= 150; i++) {
            final byte[][] randomData = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|24", byte[][].class, org.apache.commons.codec.binary.Base64TestData.randomData(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|23", i), false));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|26", byte[].class, (encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|25", byte[][].class, randomData)[1]));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|28", byte[].class, (decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|27", byte[][].class, randomData)[0]));
            testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|29", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|30", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByChunk()|31", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.LF));
        }
    }

    /**
     * Tests the Base64InputStream implementation.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase64InputStreamByteByByte() throws java.lang.Exception {
        // Hello World test.
        byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8("SGVsbG8gV29ybGQ=\r\n"));
        byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|1", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|2", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|3", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|4", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|5", byte[].class, // Single Byte test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA==\r\n")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|6", byte[].class, (decoded = new byte[]{ ((byte) (0)) }));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|7", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|8", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|9", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|10", byte[].class, // OpenSSL interop test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64TestData.ENCODED_64_CHARS_PER_LINE)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|11", byte[].class, (decoded = org.apache.commons.codec.binary.Base64TestData.DECODED));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|12", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|13", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|14", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.LF));
        // Single Line test.
        final java.lang.String singleLine = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|15", org.apache.commons.codec.binary.Base64TestData.ENCODED_64_CHARS_PER_LINE.replaceAll("\n", ""));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|17", byte[].class, (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|16", singleLine))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|18", byte[].class, (decoded = org.apache.commons.codec.binary.Base64TestData.DECODED));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|19", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|20", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|21", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.LF));
        // test random data of sizes 0 thru 150
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|22", i)) <= 150; i++) {
            final byte[][] randomData = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|24", byte[][].class, org.apache.commons.codec.binary.Base64TestData.randomData(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|23", i), false));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|26", byte[].class, (encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|25", byte[][].class, randomData)[1]));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|28", byte[].class, (decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|27", byte[][].class, randomData)[0]));
            testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|29", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|30", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testBase64InputStreamByteByByte()|31", byte[].class, org.apache.commons.codec.binary.Base64InputStreamTest.LF));
        }
    }

    /**
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
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
        java.io.InputStream in;
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|4", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|0", byte[].class, decoded))), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|2", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|3", byte[].class, separator))));
        byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|6", byte[].class, org.apache.commons.codec.binary.Base64TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|5", java.io.InputStream.class, in)));
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|7", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|9", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base64 encode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|13", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|11", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|12", byte[].class, encoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|14", java.io.InputStream.class, in).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|17", java.io.InputStream.class, // Now let's try decode.
        (in = new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|16", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|15", byte[].class, encoded))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|19", byte[].class, (output = org.apache.commons.codec.binary.Base64TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|18", java.io.InputStream.class, in))));
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|21", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|20", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|23", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|22", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base64 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|26", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|24", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|25", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|28", java.io.InputStream.class, // I always wanted to do this! (wrap encoder with decoder etc etc).
        (in = new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|27", byte[].class, decoded))));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|29", i)) < 10; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|33", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|30", java.io.InputStream.class, in), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|31", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|32", byte[].class, separator))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|35", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|34", java.io.InputStream.class, in), false)));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|37", byte[].class, (output = org.apache.commons.codec.binary.Base64TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|36", java.io.InputStream.class, in))));
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|39", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|38", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|41", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|40", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base64 wrap-wrap-wrap!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|44", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|42", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|43", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByChunk(byte[],byte[],int,byte[])|45", java.io.InputStream.class, in).close();
    }

    /**
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base64InputStream wraps itself in encode and decode mode over and over
     * again.
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
        java.io.InputStream in;
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|4", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|0", byte[].class, decoded))), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|2", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|3", byte[].class, separator))));
        byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|7", byte[].class, new byte[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|6", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|5", byte[].class, encoded).length)]);
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|8", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|10", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|9", byte[].class, output).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|14", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|11", byte[].class, output)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|12", i)] = ((byte) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|13", java.io.InputStream.class, in).read()))));
        }
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|16", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|15", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|18", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|17", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base64 encode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|21", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|19", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|20", byte[].class, encoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|22", java.io.InputStream.class, in).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|25", java.io.InputStream.class, // Now let's try decode.
        (in = new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|24", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|23", byte[].class, encoded))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|28", byte[].class, (output = new byte[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|27", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|26", byte[].class, decoded).length)]));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|29", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|31", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|30", byte[].class, output).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|35", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|32", byte[].class, output)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|33", i)] = ((byte) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|34", java.io.InputStream.class, in).read()))));
        }
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|37", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|36", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|39", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|38", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base64 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|42", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|40", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|41", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|43", java.io.InputStream.class, in).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|45", java.io.InputStream.class, // I always wanted to do this! (wrap encoder with decoder etc etc).
        (in = new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|44", byte[].class, decoded))));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|46", i)) < 10; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|50", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|47", java.io.InputStream.class, in), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|48", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|49", byte[].class, separator))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|52", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|51", java.io.InputStream.class, in), false)));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|55", byte[].class, (output = new byte[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|54", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|53", byte[].class, decoded).length)]));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|56", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|58", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|57", byte[].class, output).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|62", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|59", byte[].class, output)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|60", i)] = ((byte) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|61", java.io.InputStream.class, in).read()))));
        }
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|64", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|63", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|66", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|65", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base64 wrap-wrap-wrap!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|69", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|67", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|68", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|70", java.io.InputStream.class, in).close();
    }

    /**
     * Tests markSupported.
     *
     * @throws Exception
     * 		
     */
    @org.junit.Test
    public void testMarkSupported() throws java.lang.Exception {
        final byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testMarkSupported()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE));
        final java.io.ByteArrayInputStream bin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testMarkSupported()|2", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testMarkSupported()|1", byte[].class, decoded)));
        try (final org.apache.commons.codec.binary.Base64InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testMarkSupported()|5", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testMarkSupported()|3", java.io.ByteArrayInputStream.class, bin), true, 4, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testMarkSupported()|4", byte[].class, new byte[]{ 0, 0, 0 })))) {
            // Always returns false for now.
            org.junit.Assert.assertFalse("Base64InputStream.markSupported() is false", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testMarkSupported()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testMarkSupported()|6", org.apache.commons.codec.binary.Base64InputStream.class, in).markSupported()));
        }
    }

    /**
     * Tests read returning 0
     *
     * @throws Exception
     * 		
     */
    @org.junit.Test
    public void testRead0() throws java.lang.Exception {
        final byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE));
        final byte[] buf = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|1", byte[].class, new byte[1024]);
        int bytesRead = 0;
        final java.io.ByteArrayInputStream bin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|3", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|2", byte[].class, decoded)));
        try (final org.apache.commons.codec.binary.Base64InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|6", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|4", java.io.ByteArrayInputStream.class, bin), true, 4, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|5", byte[].class, new byte[]{ 0, 0, 0 })))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|9", (bytesRead = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|7", org.apache.commons.codec.binary.Base64InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|8", byte[].class, buf), 0, 0)));
            org.junit.Assert.assertEquals("Base64InputStream.read(buf, 0, 0) returns 0", 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testRead0()|10", bytesRead));
        }
    }

    /**
     * Tests read with null.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testReadNull() throws java.lang.Exception {
        final byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadNull()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE));
        final java.io.ByteArrayInputStream bin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadNull()|2", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadNull()|1", byte[].class, decoded)));
        try (final org.apache.commons.codec.binary.Base64InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadNull()|5", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadNull()|3", java.io.ByteArrayInputStream.class, bin), true, 4, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadNull()|4", byte[].class, new byte[]{ 0, 0, 0 })))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testReadNull()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadNull()|6", org.apache.commons.codec.binary.Base64InputStream.class, in).read(null, 0, 0));
            org.junit.Assert.fail("Base64InputStream.read(null, 0, 0) to throw a NullPointerException");
        } catch (final java.lang.NullPointerException e) {
            // Expected
        }
    }

    /**
     * Tests read throwing IndexOutOfBoundsException
     *
     * @throws Exception
     * 		
     */
    @org.junit.Test
    public void testReadOutOfBounds() throws java.lang.Exception {
        final byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base64InputStreamTest.STRING_FIXTURE));
        final byte[] buf = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|1", byte[].class, new byte[1024]);
        final java.io.ByteArrayInputStream bin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|3", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|2", byte[].class, decoded)));
        try (final org.apache.commons.codec.binary.Base64InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|6", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|4", java.io.ByteArrayInputStream.class, bin), true, 4, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|5", byte[].class, new byte[]{ 0, 0, 0 })))) {
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|7", org.apache.commons.codec.binary.Base64InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|8", byte[].class, buf), (-1), 0));
                org.junit.Assert.fail("Expected Base64InputStream.read(buf, -1, 0) to throw IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException e) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|10", org.apache.commons.codec.binary.Base64InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|11", byte[].class, buf), 0, (-1)));
                org.junit.Assert.fail("Expected Base64InputStream.read(buf, 0, -1) to throw IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException e) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|13", org.apache.commons.codec.binary.Base64InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|14", byte[].class, buf), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|15", byte[].class, buf).length)) + 1), 0));
                org.junit.Assert.fail("Base64InputStream.read(buf, buf.length + 1, 0) throws IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException e) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|18", org.apache.commons.codec.binary.Base64InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|19", byte[].class, buf), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testReadOutOfBounds()|20", byte[].class, buf).length)) - 1), 2));
                org.junit.Assert.fail("Base64InputStream.read(buf, buf.length - 1, 2) throws IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException e) {
                // Expected
            }
        }
    }

    /**
     * Tests skipping number of characters larger than the internal buffer.
     *
     * @throws Throwable
     * 		
     */
    @org.junit.Test
    public void testSkipBig() throws java.lang.Throwable {
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base64InputStreamTest.ENCODED_B64))));
        try (final org.apache.commons.codec.binary.Base64InputStream b64stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|3", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|2", java.io.InputStream.class, ins)))) {
            org.junit.Assert.assertEquals(6, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|4", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).skip(java.lang.Integer.MAX_VALUE)));
            // End of stream reached
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|6", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipBig()|8", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
        }
    }

    /**
     * Tests skipping as a noop
     *
     * @throws Throwable
     * 		
     */
    @org.junit.Test
    public void testSkipNone() throws java.lang.Throwable {
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base64InputStreamTest.ENCODED_B64))));
        try (final org.apache.commons.codec.binary.Base64InputStream b64stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|3", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|2", java.io.InputStream.class, ins)))) {
            final byte[] actualBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|4", byte[].class, new byte[6]);
            org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|5", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).skip(0)));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|7", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|8", byte[].class, actualBytes), 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|9", byte[].class, actualBytes).length)));
            org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|12", byte[].class, actualBytes), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|13", byte[].class, new byte[]{ 0, 0, 0, ((byte) (255)), ((byte) (255)), ((byte) (255)) }));
            // End of stream reached
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipNone()|14", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
        }
    }

    /**
     * Tests skipping past the end of a stream.
     *
     * @throws Throwable
     * 		
     */
    @org.junit.Test
    public void testSkipPastEnd() throws java.lang.Throwable {
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base64InputStreamTest.ENCODED_B64))));
        try (final org.apache.commons.codec.binary.Base64InputStream b64stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|3", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|2", java.io.InputStream.class, ins)))) {
            // due to CODEC-130, skip now skips correctly decoded characters rather than encoded
            org.junit.Assert.assertEquals(6, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|4", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).skip(10)));
            // End of stream reached
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|6", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipPastEnd()|8", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
        }
    }

    /**
     * Tests skipping to the end of a stream.
     *
     * @throws Throwable
     * 		
     */
    @org.junit.Test
    public void testSkipToEnd() throws java.lang.Throwable {
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base64InputStreamTest.ENCODED_B64))));
        try (final org.apache.commons.codec.binary.Base64InputStream b64stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|3", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|2", java.io.InputStream.class, ins)))) {
            // due to CODEC-130, skip now skips correctly decoded characters rather than encoded
            org.junit.Assert.assertEquals(6, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|4", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).skip(6)));
            // End of stream reached
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|6", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipToEnd()|8", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).read()));
        }
    }

    /**
     * Tests if negative arguments to skip are handled correctly.
     *
     * @throws Throwable
     * 		
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testSkipWrongArgument() throws java.lang.Throwable {
        try {
            final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipWrongArgument()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipWrongArgument()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base64InputStreamTest.ENCODED_B64))));
            try (final org.apache.commons.codec.binary.Base64InputStream b64stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipWrongArgument()|3", org.apache.commons.codec.binary.Base64InputStream.class, new org.apache.commons.codec.binary.Base64InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipWrongArgument()|2", java.io.InputStream.class, ins)))) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipWrongArgument()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base64InputStream>observeState("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipWrongArgument()|4", org.apache.commons.codec.binary.Base64InputStream.class, b64stream).skip((-10)));
            }
        } catch (java.lang.IllegalArgumentException a1553628733506) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.binary.Base64InputStreamTest|testSkipWrongArgument()|!", a1553628733506);
            throw a1553628733506;
        }
    }
}

