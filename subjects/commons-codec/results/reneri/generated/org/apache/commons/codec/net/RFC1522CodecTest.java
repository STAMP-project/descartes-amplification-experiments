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
 * RFC 1522 compliant codec test cases
 *
 * @version $Id$
 */
public class RFC1522CodecTest {
    static class RFC1522TestCodec extends org.apache.commons.codec.net.RFC1522Codec {
        @java.lang.Override
        protected byte[] doDecoding(final byte[] bytes) {
            return bytes;
        }

        @java.lang.Override
        protected byte[] doEncoding(final byte[] bytes) {
            return bytes;
        }

        @java.lang.Override
        protected java.lang.String getEncoding() {
            return "T";
        }
    }

    @org.junit.Test
    public void testNullInput() throws java.lang.Exception {
        final org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec testcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec>observeState("org.apache.commons.codec.net.RFC1522CodecTest|testNullInput()|0", org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec.class, new org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec());
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.RFC1522CodecTest|testNullInput()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec>observeState("org.apache.commons.codec.net.RFC1522CodecTest|testNullInput()|1", org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec.class, testcodec).decodeText(null)));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.RFC1522CodecTest|testNullInput()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec>observeState("org.apache.commons.codec.net.RFC1522CodecTest|testNullInput()|3", org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec.class, testcodec).encodeText(null, org.apache.commons.codec.CharEncoding.UTF_8)));
    }

    private void assertExpectedDecoderException(final java.lang.String s) throws java.lang.Exception {
        final org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec testcodec = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec>observeState("org.apache.commons.codec.net.RFC1522CodecTest|assertExpectedDecoderException(java.lang.String)|0", org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec.class, new org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec());
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.RFC1522CodecTest|assertExpectedDecoderException(java.lang.String)|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec>observeState("org.apache.commons.codec.net.RFC1522CodecTest|assertExpectedDecoderException(java.lang.String)|1", org.apache.commons.codec.net.RFC1522CodecTest.RFC1522TestCodec.class, testcodec).decodeText(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.net.RFC1522CodecTest|assertExpectedDecoderException(java.lang.String)|2", s)));
            org.junit.Assert.fail("DecoderException should have been thrown");
        } catch (final org.apache.commons.codec.DecoderException e) {
            // Expected.
        }
    }

    @org.junit.Test
    public void testDecodeInvalid() throws java.lang.Exception {
        assertExpectedDecoderException("whatever");
        assertExpectedDecoderException("=?");
        assertExpectedDecoderException("?=");
        assertExpectedDecoderException("==");
        assertExpectedDecoderException("=??=");
        assertExpectedDecoderException("=?stuff?=");
        assertExpectedDecoderException("=?UTF-8??=");
        assertExpectedDecoderException("=?UTF-8?stuff?=");
        assertExpectedDecoderException("=?UTF-8?T?stuff");
        assertExpectedDecoderException("=??T?stuff?=");
        assertExpectedDecoderException("=?UTF-8??stuff?=");
        assertExpectedDecoderException("=?UTF-8?W?stuff?=");
    }
}

