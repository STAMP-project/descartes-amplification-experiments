/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.codec.binary;


public class BaseNCodecTest {
    org.apache.commons.codec.binary.BaseNCodec codec;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|setUp()|7", org.apache.commons.codec.binary.BaseNCodec.class, (codec = new org.apache.commons.codec.binary.BaseNCodec(0, 0, 0, 0) {
            @java.lang.Override
            protected boolean isInAlphabet(final byte b) {
                return ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|setUp()|5", b)) == 'O') || ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|setUp()|6", b)) == 'K');// allow OK

            }

            @java.lang.Override
            void encode(final byte[] pArray, final int i, final int length, final org.apache.commons.codec.binary.BaseNCodec.Context context) {
            }

            @java.lang.Override
            void decode(final byte[] pArray, final int i, final int length, final org.apache.commons.codec.binary.BaseNCodec.Context context) {
            }
        }));
    }

    @org.junit.Test
    public void testBaseNCodec() {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testBaseNCodec()|0", org.apache.commons.codec.binary.BaseNCodec.class, codec));
    }

    // @Test
    // public void testHasData() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testAvail() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testEnsureBufferSize() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testReadResults() {
    // fail("Not yet implemented");
    // }
    // 
    @org.junit.Test
    public void testIsWhiteSpace() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsWhiteSpace()|0", org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(((byte) (' ')))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsWhiteSpace()|1", org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(((byte) ('\n')))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsWhiteSpace()|2", org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(((byte) ('\r')))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsWhiteSpace()|3", org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(((byte) ('\t')))));
    }

    // 
    // @Test
    // public void testEncodeObject() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testEncodeToString() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testDecodeObject() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testDecodeString() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testDecodeByteArray() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testEncodeByteArray() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testEncodeAsString() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testEncodeByteArrayIntInt() {
    // fail("Not yet implemented");
    // }
    // 
    // @Test
    // public void testDecodeByteArrayIntInt() {
    // fail("Not yet implemented");
    // }
    // 
    @org.junit.Test
    public void testIsInAlphabetByte() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByte()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByte()|0", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(((byte) (0)))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByte()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByte()|2", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(((byte) ('a')))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByte()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByte()|4", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(((byte) ('O')))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByte()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByte()|6", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(((byte) ('K')))));
    }

    @org.junit.Test
    public void testIsInAlphabetByteArrayBoolean() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|0", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|1", byte[].class, new byte[]{  }), false)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|3", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|4", byte[].class, new byte[]{ 'O' }), false)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|6", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|7", byte[].class, new byte[]{ 'O', ' ' }), false)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|9", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|10", byte[].class, new byte[]{ ' ' }), false)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|12", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|13", byte[].class, new byte[]{  }), true)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|15", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|16", byte[].class, new byte[]{ 'O' }), true)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|18", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|19", byte[].class, new byte[]{ 'O', ' ' }), true)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|21", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetByteArrayBoolean()|22", byte[].class, new byte[]{ ' ' }), true)));
    }

    @org.junit.Test
    public void testIsInAlphabetString() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetString()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetString()|0", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet("OK")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetString()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testIsInAlphabetString()|2", org.apache.commons.codec.binary.BaseNCodec.class, codec).isInAlphabet("O=K= \t\n\r")));
    }

    @org.junit.Test
    public void testContainsAlphabetOrPad() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|0", org.apache.commons.codec.binary.BaseNCodec.class, codec).containsAlphabetOrPad(null)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|2", org.apache.commons.codec.binary.BaseNCodec.class, codec).containsAlphabetOrPad(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|3", byte[].class, new byte[]{  }))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|5", org.apache.commons.codec.binary.BaseNCodec.class, codec).containsAlphabetOrPad(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|6", byte[].class, "OK".getBytes()))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|8", org.apache.commons.codec.binary.BaseNCodec.class, codec).containsAlphabetOrPad(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|9", byte[].class, "OK ".getBytes()))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|11", org.apache.commons.codec.binary.BaseNCodec.class, codec).containsAlphabetOrPad(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|12", byte[].class, "ok ".getBytes()))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|14", org.apache.commons.codec.binary.BaseNCodec.class, codec).containsAlphabetOrPad(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|17", byte[].class, new byte[]{ eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testContainsAlphabetOrPad()|15", org.apache.commons.codec.binary.BaseNCodec.class, codec).pad) }))));
    }

    // @Test
    // public void testGetEncodedLength() {
    // fail("Not yet implemented");
    // }
    @org.junit.Test
    public void testProvidePaddingByte() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testProvidePaddingByte()|8", org.apache.commons.codec.binary.BaseNCodec.class, // Given
        (codec = new org.apache.commons.codec.binary.BaseNCodec(0, 0, 0, 0, ((byte) (37))) {
            @java.lang.Override
            protected boolean isInAlphabet(final byte b) {
                return ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testProvidePaddingByte()|6", b)) == 'O') || ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testProvidePaddingByte()|7", b)) == 'K');// allow OK

            }

            @java.lang.Override
            void encode(final byte[] pArray, final int i, final int length, final org.apache.commons.codec.binary.BaseNCodec.Context context) {
            }

            @java.lang.Override
            void decode(final byte[] pArray, final int i, final int length, final org.apache.commons.codec.binary.BaseNCodec.Context context) {
            }
        }));
        // When
        final byte actualPaddingByte = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testProvidePaddingByte()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.binary.BaseNCodec>observeState("org.apache.commons.codec.binary.BaseNCodecTest|testProvidePaddingByte()|9", org.apache.commons.codec.binary.BaseNCodec.class, codec).pad);
        // Then
        org.junit.Assert.assertEquals(37, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.binary.BaseNCodecTest|testProvidePaddingByte()|11", actualPaddingByte));
    }
}

