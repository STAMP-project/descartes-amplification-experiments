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
package org.apache.commons.codec.digest;


public class UnixCryptTest {
    @org.junit.Test
    public void testCtor() {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.UnixCrypt>observeState("org.apache.commons.codec.digest.UnixCryptTest|testCtor()|0", org.apache.commons.codec.digest.UnixCrypt.class, new org.apache.commons.codec.digest.UnixCrypt()));
    }

    @org.junit.Test
    public void testUnixCryptStrings() {
        // trivial test
        org.junit.Assert.assertEquals("xxWAum7tHdIUw", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptStrings()|0", org.apache.commons.codec.digest.Crypt.crypt("secret", "xx")));
        // empty data
        org.junit.Assert.assertEquals("12UFlHxel6uMM", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptStrings()|1", org.apache.commons.codec.digest.Crypt.crypt("", "12")));
        // salt gets cut at maximum length
        org.junit.Assert.assertEquals("12FJgqDtVOg7Q", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptStrings()|2", org.apache.commons.codec.digest.Crypt.crypt("secret", "12")));
        org.junit.Assert.assertEquals("12FJgqDtVOg7Q", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptStrings()|3", org.apache.commons.codec.digest.Crypt.crypt("secret", "12345678")));
    }

    @org.junit.Test
    public void testUnixCryptBytes() {
        // An empty Bytearray equals an empty String
        org.junit.Assert.assertEquals("12UFlHxel6uMM", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptBytes()|1", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptBytes()|0", byte[].class, new byte[0]), "12")));
        // UTF-8 stores \u00e4 "a with diaeresis" as two bytes 0xc3 0xa4.
        org.junit.Assert.assertEquals("./287bds2PjVw", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptBytes()|2", org.apache.commons.codec.digest.Crypt.crypt("t\u00e4st", "./")));
        // ISO-8859-1 stores "a with diaeresis" as single byte 0xe4.
        org.junit.Assert.assertEquals("./bLIFNqo9XKQ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptBytes()|5", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptBytes()|4", byte[].class, "t\u00e4st".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptBytes()|3", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.ISO_8859_1))), "./")));
        org.junit.Assert.assertEquals("./bLIFNqo9XKQ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptBytes()|7", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptBytes()|6", byte[].class, new byte[]{ ((byte) (116)), ((byte) (228)), ((byte) (115)), ((byte) (116)) }), "./")));
    }

    /**
     * Some salts are invalid for crypt(3) but not for unixCrypt().
     */
    @org.junit.Test
    public void testUnixCryptExplicitCall() {
        // A call to crypt() with an empty salt would result in a "$6$" hash.
        // Using unixCrypt() explicitly results in a random salt.
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptExplicitCall()|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptExplicitCall()|1", org.apache.commons.codec.digest.UnixCrypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptExplicitCall()|0", byte[].class, "secret".getBytes()))).matches("^[a-zA-Z0-9./]{13}$")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptExplicitCall()|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptExplicitCall()|4", org.apache.commons.codec.digest.UnixCrypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptExplicitCall()|3", byte[].class, "secret".getBytes()), null)).matches("^[a-zA-Z0-9./]{13}$")));
    }

    /**
     * Single character salts are illegal!
     * E.g. with glibc 2.13, crypt("secret", "x") = "xxZREZpkHZpkI" but
     * crypt("secret", "xx") = "xxWAum7tHdIUw" which makes it unverifyable.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testUnixCryptWithHalfSalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithHalfSalt()|0", org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "x"));
        } catch (java.lang.IllegalArgumentException a1553628734270) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithHalfSalt()|!", a1553628734270);
            throw a1553628734270;
        }
    }

    /**
     * Unimplemented "$foo$" salt prefixes would be threated as UnixCrypt salt.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testUnicCryptInvalidSalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnicCryptInvalidSalt()|0", org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "$a"));
        } catch (java.lang.IllegalArgumentException a1553628734268) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.UnixCryptTest|testUnicCryptInvalidSalt()|!", a1553628734268);
            throw a1553628734268;
        }
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testUnixCryptNullData() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptNullData()|0", org.apache.commons.codec.digest.UnixCrypt.crypt(((byte[]) (null))));
        } catch (java.lang.NullPointerException a1553628734270) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptNullData()|!", a1553628734270);
            throw a1553628734270;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testUnixCryptWithEmptySalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithEmptySalt()|0", org.apache.commons.codec.digest.UnixCrypt.crypt("secret", ""));
        } catch (java.lang.IllegalArgumentException a1553628734270) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithEmptySalt()|!", a1553628734270);
            throw a1553628734270;
        }
    }

    @org.junit.Test
    public void testUnixCryptWithoutSalt() {
        final java.lang.String hash = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithoutSalt()|0", org.apache.commons.codec.digest.UnixCrypt.crypt("foo"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithoutSalt()|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithoutSalt()|1", hash).matches("^[a-zA-Z0-9./]{13}$")));
        final java.lang.String hash2 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithoutSalt()|3", org.apache.commons.codec.digest.UnixCrypt.crypt("foo"));
        org.junit.Assert.assertNotSame(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithoutSalt()|4", hash), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.UnixCryptTest|testUnixCryptWithoutSalt()|5", hash2));
    }
}

