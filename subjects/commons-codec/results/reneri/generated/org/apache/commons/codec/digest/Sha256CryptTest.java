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


public class Sha256CryptTest {
    @org.junit.Test
    public void testSha256CryptStrings() {
        // empty data
        org.junit.Assert.assertEquals("$5$foo$Fq9CX624QIfnCAmlGiPKLlAasdacKCRxZztPoeo7o0B", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptStrings()|0", org.apache.commons.codec.digest.Crypt.crypt("", "$5$foo")));
        // salt gets cut at dollar sign
        org.junit.Assert.assertEquals("$5$45678$LulJuUIJIn.1uU.KPV9x92umMYFopzVDD.o2ZqA1i2/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptStrings()|1", org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$45678")));
        org.junit.Assert.assertEquals("$5$45678$LulJuUIJIn.1uU.KPV9x92umMYFopzVDD.o2ZqA1i2/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptStrings()|2", org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$45678$012")));
        org.junit.Assert.assertEquals("$5$45678$LulJuUIJIn.1uU.KPV9x92umMYFopzVDD.o2ZqA1i2/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptStrings()|3", org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$45678$012$456")));
        // salt gets cut at maximum length
        org.junit.Assert.assertEquals("$5$1234567890123456$GUiFKBSTUAGvcK772ulTDPltkTOLtFvPOmp9o.9FNPB", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptStrings()|4", org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$1234567890123456")));
        org.junit.Assert.assertEquals("$5$1234567890123456$GUiFKBSTUAGvcK772ulTDPltkTOLtFvPOmp9o.9FNPB", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptStrings()|5", org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$1234567890123456789")));
    }

    @org.junit.Test
    public void testSha256CryptBytes() {
        // An empty Bytearray equals an empty String
        org.junit.Assert.assertEquals("$5$foo$Fq9CX624QIfnCAmlGiPKLlAasdacKCRxZztPoeo7o0B", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptBytes()|1", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptBytes()|0", byte[].class, new byte[0]), "$5$foo")));
        // UTF-8 stores \u00e4 "a with diaeresis" as two bytes 0xc3 0xa4.
        org.junit.Assert.assertEquals("$5$./$iH66LwY5sTDTdHeOxq5nvNDVAxuoCcyH/y6Ptte82P8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptBytes()|2", org.apache.commons.codec.digest.Crypt.crypt("t\u00e4st", "$5$./$")));
        // ISO-8859-1 stores "a with diaeresis" as single byte 0xe4.
        org.junit.Assert.assertEquals("$5$./$qx5gFfCzjuWUOvsDDy.5Nor3UULPIqLVBZhgGNS0c14", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptBytes()|5", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptBytes()|4", byte[].class, "t\u00e4st".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptBytes()|3", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.ISO_8859_1))), "$5$./$")));
    }

    @org.junit.Test
    public void testSha2CryptRounds() {
        // minimum rounds?
        org.junit.Assert.assertEquals("$5$rounds=1000$abcd$b8MCU4GEeZIekOy5ahQ8EWfT330hvYGVeDYkBxXBva.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|2", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|1", byte[].class, "secret".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))), "$5$rounds=50$abcd$")));
        org.junit.Assert.assertEquals("$5$rounds=1001$abcd$SQsJZs7KXKdd2DtklI3TY3tkD7UYA99RD0FBLm4Sk48", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|5", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|4", byte[].class, "secret".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|3", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))), "$5$rounds=1001$abcd$")));
        org.junit.Assert.assertEquals("$5$rounds=9999$abcd$Rh/8ngVh9oyuS6lL3.fsq.9xbvXJsfyKWxSjO2mPIa7", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|8", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|7", byte[].class, "secret".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha2CryptRounds()|6", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))), "$5$rounds=9999$abcd")));
    }

    @org.junit.Test
    public void testSha256CryptExplicitCall() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptExplicitCall()|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptExplicitCall()|1", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptExplicitCall()|0", byte[].class, "secret".getBytes()))).matches("^\\$5\\$[a-zA-Z0-9./]{0,16}\\$.{1,}$")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptExplicitCall()|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptExplicitCall()|4", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptExplicitCall()|3", byte[].class, "secret".getBytes()), null)).matches("^\\$5\\$[a-zA-Z0-9./]{0,16}\\$.{1,}$")));
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testSha256CryptNullData() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptNullData()|0", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(((byte[]) (null))));
        } catch (java.lang.NullPointerException a1553628734256) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptNullData()|!", a1553628734256);
            throw a1553628734256;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testSha256CryptWithEmptySalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptWithEmptySalt()|1", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptWithEmptySalt()|0", byte[].class, "secret".getBytes()), ""));
        } catch (java.lang.IllegalArgumentException a1553628734257) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Sha256CryptTest|testSha256CryptWithEmptySalt()|!", a1553628734257);
            throw a1553628734257;
        }
    }

    @org.junit.Test
    public void testSha256LargetThanBlocksize() {
        final byte[] buffer = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256LargetThanBlocksize()|0", byte[].class, new byte[200]);
        java.util.Arrays.fill(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256LargetThanBlocksize()|1", byte[].class, buffer), 0, 200, ((byte) ('A')));
        org.junit.Assert.assertEquals("$5$abc$HbF3RRc15OwNKB/RZZ5F.1I6zsLcKXHQoSdB9Owx/Q8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha256CryptTest|testSha256LargetThanBlocksize()|3", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha256CryptTest|testSha256LargetThanBlocksize()|2", byte[].class, buffer), "$5$abc")));
    }
}

