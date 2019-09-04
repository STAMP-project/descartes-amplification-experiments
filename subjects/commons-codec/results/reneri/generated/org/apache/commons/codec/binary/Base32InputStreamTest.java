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


public class Base32InputStreamTest {
    private static final java.lang.String ENCODED_FOO = "MZXW6===";

    private static final byte[] CRLF = new byte[]{ ((byte) ('\r')), ((byte) ('\n')) };

    private static final byte[] LF = new byte[]{ ((byte) ('\n')) };

    private static final java.lang.String STRING_FIXTURE = "Hello World";

    /**
     * Tests the problem reported in CODEC-130. Missing / wrong implementation of skip.
     */
    @org.junit.Test
    public void testCodec130() throws java.io.IOException {
        final java.io.ByteArrayOutputStream bos = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        try (final org.apache.commons.codec.binary.Base32OutputStream base32os = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|2", org.apache.commons.codec.binary.Base32OutputStream.class, new org.apache.commons.codec.binary.Base32OutputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|1", java.io.ByteArrayOutputStream.class, bos)))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32OutputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|3", org.apache.commons.codec.binary.Base32OutputStream.class, base32os).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|4", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE)));
        }
        final java.io.ByteArrayInputStream bis = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|7", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|6", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|5", java.io.ByteArrayOutputStream.class, bos).toByteArray())));
        final org.apache.commons.codec.binary.Base32InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|9", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|8", java.io.ByteArrayInputStream.class, bis)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|11", // we skip the first character read from the reader
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|10", org.apache.commons.codec.binary.Base32InputStream.class, ins).skip(1));
        final byte[] decodedBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|14", byte[].class, org.apache.commons.codec.binary.Base32TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|12", org.apache.commons.codec.binary.Base32InputStream.class, ins), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|13", byte[].class, new byte[64])));
        final java.lang.String str = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|16", org.apache.commons.codec.binary.StringUtils.newStringUtf8(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|15", byte[].class, decodedBytes)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|17", org.apache.commons.codec.binary.Base32InputStreamTest.STRING_FIXTURE.substring(1)), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec130()|18", str));
    }

    /**
     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.
     */
    @org.junit.Test
    public void testCodec105() throws java.io.IOException {
        try (final org.apache.commons.codec.binary.Base32InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec105()|1", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Codec105ErrorInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec105()|0", org.apache.commons.codec.binary.Codec105ErrorInputStream.class, new org.apache.commons.codec.binary.Codec105ErrorInputStream()), true, 0, null))) {
            for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec105()|2", i)) < 5; i++) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec105()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testCodec105()|3", org.apache.commons.codec.binary.Base32InputStream.class, in).read());
            }
        }
    }

    // /**
    // * Test for the CODEC-101 bug: InputStream.read(byte[]) should never return 0
    // * because Java's builtin InputStreamReader hates that.
    // *
    // * @throws Exception for some failure scenarios.
    // */
    // @Test
    // public void testCodec101() throws Exception {
    // byte[] codec101 = StringUtils.getBytesUtf8(Base32TestData.CODEC_101_MULTIPLE_OF_3);
    // ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
    // Base32InputStream in = new Base32InputStream(bais);
    // byte[] result = new byte[8192];
    // int c = in.read(result);
    // assertTrue("Codec101: First read successful [c=" + c + "]", c > 0);
    // 
    // c = in.read(result);
    // assertTrue("Codec101: Second read should report end-of-stream [c=" + c + "]", c < 0);
    // }
    /**
     * Another test for the CODEC-101 bug: In commons-codec-1.4 this test shows InputStreamReader explicitly hating an
     * InputStream.read(byte[]) return of 0:
     *
     * java.io.IOException: Underlying input stream returned zero bytes at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268) at
     * sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306) at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158) at
     * java.io.InputStreamReader.read(InputStreamReader.java:167) at java.io.BufferedReader.fill(BufferedReader.java:136) at
     * java.io.BufferedReader.readLine(BufferedReader.java:299) at java.io.BufferedReader.readLine(BufferedReader.java:362) at
     * org.apache.commons.codec.binary.Base32InputStreamTest.testInputStreamReader(Base32InputStreamTest.java:75)
     *
     * But in commons-codec-1.5 it's fixed. :-)
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    // @Test
    // public void testInputStreamReader() throws Exception {
    // byte[] codec101 = StringUtils.getBytesUtf8(Base32TestData.CODEC_101_MULTIPLE_OF_3);
    // ByteArrayInputStream bais = new ByteArrayInputStream(codec101);
    // Base32InputStream in = new Base32InputStream(bais);
    // InputStreamReader isr = new InputStreamReader(in);
    // BufferedReader br = new BufferedReader(isr);
    // String line = br.readLine();
    // assertNotNull("Codec101:  InputStreamReader works!", line);
    // }
    /**
     * Test the Base32InputStream implementation against the special NPE inducing input identified in the CODEC-98 bug.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    // @Test
    // public void testCodec98NPE() throws Exception {
    // byte[] codec98 = StringUtils.getBytesUtf8(Base32TestData.CODEC_98_NPE);
    // ByteArrayInputStream data = new ByteArrayInputStream(codec98);
    // Base32InputStream stream = new Base32InputStream(data);
    // 
    // // This line causes an NPE in commons-codec-1.4.jar:
    // byte[] decodedBytes = Base32TestData.streamToBytes(stream, new byte[1024]);
    // 
    // String decoded = StringUtils.newStringUtf8(decodedBytes);
    // assertEquals(
    // "codec-98 NPE Base32InputStream", Base32TestData.CODEC_98_NPE_DECODED, decoded
    // );
    // }
    /**
     * Tests skipping past the end of a stream.
     *
     * @throws Throwable
     * 		
     */
    @org.junit.Test
    public void testAvailable() throws java.lang.Throwable {
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base32InputStreamTest.ENCODED_FOO))));
        try (final org.apache.commons.codec.binary.Base32InputStream b32stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|3", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|2", java.io.InputStream.class, ins)))) {
            org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|4", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).available()));
            org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|6", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).skip(10)));
            // End of stream reached
            org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|8", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).available()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|10", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|12", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
            org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testAvailable()|14", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).available()));
        }
    }

    /**
     * Tests the Base32InputStream implementation against empty input.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase32EmptyInputStreamMimeChuckSize() throws java.lang.Exception {
        testBase32EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE);
    }

    /**
     * Tests the Base32InputStream implementation against empty input.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase32EmptyInputStreamPemChuckSize() throws java.lang.Exception {
        testBase32EmptyInputStream(org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE);
    }

    private void testBase32EmptyInputStream(final int chuckSize) throws java.lang.Exception {
        final byte[] emptyEncoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|0", byte[].class, new byte[0]);
        final byte[] emptyDecoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|1", byte[].class, new byte[0]);
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|2", byte[].class, emptyEncoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|3", byte[].class, emptyDecoded), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|4", chuckSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|5", byte[].class, org.apache.commons.codec.binary.Base32InputStreamTest.CRLF));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|6", byte[].class, emptyEncoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|7", byte[].class, emptyDecoded), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|8", chuckSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32EmptyInputStream(int)|9", byte[].class, org.apache.commons.codec.binary.Base32InputStreamTest.CRLF));
    }

    /**
     * Tests the Base32InputStream implementation.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase32InputStreamByChunk() throws java.lang.Exception {
        // Hello World test.
        byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE));
        byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|1", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|2", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|3", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|4", byte[].class, org.apache.commons.codec.binary.Base32InputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|5", byte[].class, // Single Byte test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|6", byte[].class, (decoded = new byte[]{ ((byte) (0)) }));
        testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|7", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|8", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|9", byte[].class, org.apache.commons.codec.binary.Base32InputStreamTest.CRLF));
        // // OpenSSL interop test.
        // encoded = StringUtils.getBytesUtf8(Base32TestData.ENCODED_32_CHARS_PER_LINE);
        // decoded = Base32TestData.DECODED;
        // testByChunk(encoded, decoded, Base32.PEM_CHUNK_SIZE, LF);
        // 
        // // Single Line test.
        // String singleLine = Base32TestData.ENCODED_32_CHARS_PER_LINE.replaceAll("\n", "");
        // encoded = StringUtils.getBytesUtf8(singleLine);
        // decoded = Base32TestData.DECODED;
        // testByChunk(encoded, decoded, 0, LF);
        // test random data of sizes 0 thru 150
        final org.apache.commons.codec.binary.BaseNCodec codec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|10", org.apache.commons.codec.binary.Base32.class, new org.apache.commons.codec.binary.Base32());
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|11", i)) <= 150; i++) {
            final byte[][] randomData = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|14", byte[][].class, org.apache.commons.codec.binary.Base32TestData.randomData(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|12", org.apache.commons.codec.binary.BaseNCodec.class, codec), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|13", i)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|16", byte[].class, (encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|15", byte[][].class, randomData)[1]));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|18", byte[].class, (decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|17", byte[][].class, randomData)[0]));
            testByChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|19", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|20", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByChunk()|21", byte[].class, org.apache.commons.codec.binary.Base32InputStreamTest.LF));
        }
    }

    /**
     * Tests the Base32InputStream implementation.
     *
     * @throws Exception
     * 		for some failure scenarios.
     */
    @org.junit.Test
    public void testBase32InputStreamByteByByte() throws java.lang.Exception {
        // Hello World test.
        byte[] encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.BASE32_FIXTURE));
        byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|1", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|2", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|3", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|4", byte[].class, org.apache.commons.codec.binary.Base32InputStreamTest.CRLF));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|5", byte[].class, // Single Byte test.
        (encoded = org.apache.commons.codec.binary.StringUtils.getBytesUtf8("AA======\r\n")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|6", byte[].class, (decoded = new byte[]{ ((byte) (0)) }));
        testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|7", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|8", byte[].class, decoded), org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|9", byte[].class, org.apache.commons.codec.binary.Base32InputStreamTest.CRLF));
        // // Single Line test.
        // String singleLine = Base32TestData.ENCODED_32_CHARS_PER_LINE.replaceAll("\n", "");
        // encoded = StringUtils.getBytesUtf8(singleLine);
        // decoded = Base32TestData.DECODED;
        // testByteByByte(encoded, decoded, 0, LF);
        // test random data of sizes 0 thru 150
        final org.apache.commons.codec.binary.BaseNCodec codec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|10", org.apache.commons.codec.binary.Base32.class, new org.apache.commons.codec.binary.Base32());
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|11", i)) <= 150; i++) {
            final byte[][] randomData = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|14", byte[][].class, org.apache.commons.codec.binary.Base32TestData.randomData(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|12", org.apache.commons.codec.binary.BaseNCodec.class, codec), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|13", i)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|16", byte[].class, (encoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|15", byte[][].class, randomData)[1]));
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|18", byte[].class, (decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[][]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|17", byte[][].class, randomData)[0]));
            testByteByByte(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|19", byte[].class, encoded), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|20", byte[].class, decoded), 0, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testBase32InputStreamByteByByte()|21", byte[].class, org.apache.commons.codec.binary.Base32InputStreamTest.LF));
        }
    }

    /**
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     *
     * @param encoded
     * 		base32 encoded data
     * @param decoded
     * 		the data from above, but decoded
     * @param chunkSize
     * 		chunk size (line-length) of the base32 encoded data.
     * @param separator
     * 		Line separator in the base32 encoded data.
     * @throws Exception
     * 		Usually signifies a bug in the Base32 commons-codec implementation.
     */
    private void testByChunk(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws java.lang.Exception {
        // Start with encode.
        java.io.InputStream in;
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|4", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|0", byte[].class, decoded))), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|2", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|3", byte[].class, separator))));
        byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|6", byte[].class, org.apache.commons.codec.binary.Base32TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|5", java.io.InputStream.class, in)));
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|7", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|9", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base32 encode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|13", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|11", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|12", byte[].class, encoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|16", java.io.InputStream.class, // Now let's try decode.
        (in = new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|15", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|14", byte[].class, encoded))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|18", byte[].class, (output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|17", java.io.InputStream.class, in))));
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|20", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|19", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|22", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|21", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base32 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|25", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|23", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|24", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|27", java.io.InputStream.class, // I always wanted to do this! (wrap encoder with decoder etc etc).
        (in = new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|26", byte[].class, decoded))));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|28", i)) < 10; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|32", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|29", java.io.InputStream.class, in), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|30", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|31", byte[].class, separator))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|34", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|33", java.io.InputStream.class, in), false)));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|36", byte[].class, (output = org.apache.commons.codec.binary.Base32TestData.streamToBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|35", java.io.InputStream.class, in))));
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|38", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|37", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|40", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|39", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base32 wrap-wrap-wrap!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|43", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|41", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|42", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByChunk(byte[],byte[],int,byte[])|44", java.io.InputStream.class, in).close();
    }

    /**
     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--> decoded 2. decoded ---[ENCODE]--> encoded 3. decoded
     * ---[WRAP-WRAP-WRAP-etc...] --> decoded
     * <p/>
     * By "[WRAP-WRAP-WRAP-etc...]" we mean situation where the Base32InputStream wraps itself in encode and decode mode over and over
     * again.
     *
     * @param encoded
     * 		base32 encoded data
     * @param decoded
     * 		the data from above, but decoded
     * @param chunkSize
     * 		chunk size (line-length) of the base32 encoded data.
     * @param separator
     * 		Line separator in the base32 encoded data.
     * @throws Exception
     * 		Usually signifies a bug in the Base32 commons-codec implementation.
     */
    private void testByteByByte(final byte[] encoded, final byte[] decoded, final int chunkSize, final byte[] separator) throws java.lang.Exception {
        // Start with encode.
        java.io.InputStream in;
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|4", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|0", byte[].class, decoded))), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|2", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|3", byte[].class, separator))));
        byte[] output = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|7", byte[].class, new byte[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|6", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|5", byte[].class, encoded).length)]);
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|8", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|10", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|9", byte[].class, output).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|14", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|11", byte[].class, output)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|12", i)] = ((byte) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|13", java.io.InputStream.class, in).read()))));
        }
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|16", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|15", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|18", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|17", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base32 encode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|21", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|19", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|20", byte[].class, encoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|22", java.io.InputStream.class, in).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|25", java.io.InputStream.class, // Now let's try decode.
        (in = new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|24", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|23", byte[].class, encoded))))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|28", byte[].class, (output = new byte[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|27", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|26", byte[].class, decoded).length)]));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|29", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|31", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|30", byte[].class, output).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|35", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|32", byte[].class, output)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|33", i)] = ((byte) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|34", java.io.InputStream.class, in).read()))));
        }
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|37", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|36", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|39", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|38", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base32 decode", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|42", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|40", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|41", byte[].class, decoded))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|43", java.io.InputStream.class, in).close();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|45", java.io.InputStream.class, // I always wanted to do this! (wrap encoder with decoder etc etc).
        (in = new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|44", byte[].class, decoded))));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|46", i)) < 10; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|50", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|47", java.io.InputStream.class, in), true, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|48", chunkSize), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|49", byte[].class, separator))));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|52", java.io.InputStream.class, (in = new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|51", java.io.InputStream.class, in), false)));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|55", byte[].class, (output = new byte[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|54", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|53", byte[].class, decoded).length)]));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|56", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|58", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|57", byte[].class, output).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|62", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|59", byte[].class, output)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|60", i)] = ((byte) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|61", java.io.InputStream.class, in).read()))));
        }
        org.junit.Assert.assertEquals("EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|64", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|63", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertEquals("Still EOF", (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|66", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|65", java.io.InputStream.class, in).read()));
        org.junit.Assert.assertTrue("Streaming base32 wrap-wrap-wrap!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|69", java.util.Arrays.equals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|67", byte[].class, output), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testByteByByte(byte[],byte[],int,byte[])|68", byte[].class, decoded))));
    }

    /**
     * Tests markSupported.
     *
     * @throws Exception
     * 		
     */
    @org.junit.Test
    public void testMarkSupported() throws java.lang.Exception {
        final byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testMarkSupported()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE));
        final java.io.ByteArrayInputStream bin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testMarkSupported()|2", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testMarkSupported()|1", byte[].class, decoded)));
        try (final org.apache.commons.codec.binary.Base32InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testMarkSupported()|5", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testMarkSupported()|3", java.io.ByteArrayInputStream.class, bin), true, 4, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testMarkSupported()|4", byte[].class, new byte[]{ 0, 0, 0 })))) {
            // Always returns false for now.
            org.junit.Assert.assertFalse("Base32InputStream.markSupported() is false", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testMarkSupported()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testMarkSupported()|6", org.apache.commons.codec.binary.Base32InputStream.class, in).markSupported()));
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
        final byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE));
        final byte[] buf = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|1", byte[].class, new byte[1024]);
        int bytesRead = 0;
        final java.io.ByteArrayInputStream bin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|3", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|2", byte[].class, decoded)));
        try (final org.apache.commons.codec.binary.Base32InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|6", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|4", java.io.ByteArrayInputStream.class, bin), true, 4, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|5", byte[].class, new byte[]{ 0, 0, 0 })))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|9", (bytesRead = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|7", org.apache.commons.codec.binary.Base32InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|8", byte[].class, buf), 0, 0)));
            org.junit.Assert.assertEquals("Base32InputStream.read(buf, 0, 0) returns 0", 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testRead0()|10", bytesRead));
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
        final byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadNull()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE));
        final java.io.ByteArrayInputStream bin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadNull()|2", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadNull()|1", byte[].class, decoded)));
        try (final org.apache.commons.codec.binary.Base32InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadNull()|5", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadNull()|3", java.io.ByteArrayInputStream.class, bin), true, 4, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadNull()|4", byte[].class, new byte[]{ 0, 0, 0 })))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testReadNull()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadNull()|6", org.apache.commons.codec.binary.Base32InputStream.class, in).read(null, 0, 0));
            org.junit.Assert.fail("Base32InputStream.read(null, 0, 0) to throw a NullPointerException");
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
        final byte[] decoded = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(org.apache.commons.codec.binary.Base32TestData.STRING_FIXTURE));
        final byte[] buf = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|1", byte[].class, new byte[1024]);
        final java.io.ByteArrayInputStream bin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|3", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|2", byte[].class, decoded)));
        try (final org.apache.commons.codec.binary.Base32InputStream in = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|6", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|4", java.io.ByteArrayInputStream.class, bin), true, 4, eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|5", byte[].class, new byte[]{ 0, 0, 0 })))) {
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|7", org.apache.commons.codec.binary.Base32InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|8", byte[].class, buf), (-1), 0));
                org.junit.Assert.fail("Expected Base32InputStream.read(buf, -1, 0) to throw IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException e) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|10", org.apache.commons.codec.binary.Base32InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|11", byte[].class, buf), 0, (-1)));
                org.junit.Assert.fail("Expected Base32InputStream.read(buf, 0, -1) to throw IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException e) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|13", org.apache.commons.codec.binary.Base32InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|14", byte[].class, buf), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|15", byte[].class, buf).length)) + 1), 0));
                org.junit.Assert.fail("Base32InputStream.read(buf, buf.length + 1, 0) throws IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException e) {
                // Expected
            }
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|18", org.apache.commons.codec.binary.Base32InputStream.class, in).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|19", byte[].class, buf), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testReadOutOfBounds()|20", byte[].class, buf).length)) - 1), 2));
                org.junit.Assert.fail("Base32InputStream.read(buf, buf.length - 1, 2) throws IndexOutOfBoundsException");
            } catch (final java.lang.IndexOutOfBoundsException e) {
                // Expected
            }
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
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base32InputStreamTest.ENCODED_FOO))));
        try (final org.apache.commons.codec.binary.Base32InputStream b32stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|3", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|2", java.io.InputStream.class, ins)))) {
            final byte[] actualBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|4", byte[].class, new byte[6]);
            org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|5", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).skip(0)));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|7", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|8", byte[].class, actualBytes), 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|9", byte[].class, actualBytes).length)));
            org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|12", byte[].class, actualBytes), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|13", byte[].class, new byte[]{ 102, 111, 111, 0, 0, 0 }));
            // End of stream reached
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipNone()|14", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
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
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base32InputStreamTest.ENCODED_FOO))));
        try (final org.apache.commons.codec.binary.Base32InputStream b32stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|3", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|2", java.io.InputStream.class, ins)))) {
            org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|4", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).skip(1024)));
            // End of stream reached
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|6", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipBig()|8", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
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
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base32InputStreamTest.ENCODED_FOO))));
        try (final org.apache.commons.codec.binary.Base32InputStream b32stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|3", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|2", java.io.InputStream.class, ins)))) {
            // due to CODEC-130, skip now skips correctly decoded characters rather than encoded
            org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|4", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).skip(10)));
            // End of stream reached
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|6", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipPastEnd()|8", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
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
        final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base32InputStreamTest.ENCODED_FOO))));
        try (final org.apache.commons.codec.binary.Base32InputStream b32stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|3", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|2", java.io.InputStream.class, ins)))) {
            // due to CODEC-130, skip now skips correctly decoded characters rather than encoded
            org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|4", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).skip(3)));
            // End of stream reached
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|6", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
            org.junit.Assert.assertEquals((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipToEnd()|8", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).read()));
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
            final java.io.InputStream ins = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipWrongArgument()|1", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipWrongArgument()|0", byte[].class, org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(org.apache.commons.codec.binary.Base32InputStreamTest.ENCODED_FOO))));
            try (final org.apache.commons.codec.binary.Base32InputStream b32stream = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipWrongArgument()|3", org.apache.commons.codec.binary.Base32InputStream.class, new org.apache.commons.codec.binary.Base32InputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipWrongArgument()|2", java.io.InputStream.class, ins)))) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipWrongArgument()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.Base32InputStream>observeState("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipWrongArgument()|4", org.apache.commons.codec.binary.Base32InputStream.class, b32stream).skip((-10)));
            }
        } catch (java.lang.IllegalArgumentException a1553628733365) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.binary.Base32InputStreamTest|testSkipWrongArgument()|!", a1553628733365);
            throw a1553628733365;
        }
    }
}

