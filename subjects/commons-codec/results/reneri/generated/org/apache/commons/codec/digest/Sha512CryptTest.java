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


public class Sha512CryptTest {
    @org.junit.Test
    public void testSha512CryptStrings() {
        // empty data
        org.junit.Assert.assertEquals("$6$foo$Nywkte7LPWjaJhWjNeGJN.dFdY3pN1wYlGifyRLYOVlGS9EMSiZaDDe/BGSOYQ327q9.32I4UqQ5odsqvsBLX/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptStrings()|0", org.apache.commons.codec.digest.Crypt.crypt("", "$6$foo")));
        // salt gets cut at dollar sign
        org.junit.Assert.assertEquals("$6$45678$f2en/Y053Knir/wu/T8DQKSbiUGcPcbXKsmyVlP820dIpXoY0KlqgUqRVFfavdRXwDMUZYsxPOymA4zgX0qE5.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptStrings()|1", org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$45678")));
        org.junit.Assert.assertEquals("$6$45678$f2en/Y053Knir/wu/T8DQKSbiUGcPcbXKsmyVlP820dIpXoY0KlqgUqRVFfavdRXwDMUZYsxPOymA4zgX0qE5.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptStrings()|2", org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$45678$012")));
        org.junit.Assert.assertEquals("$6$45678$f2en/Y053Knir/wu/T8DQKSbiUGcPcbXKsmyVlP820dIpXoY0KlqgUqRVFfavdRXwDMUZYsxPOymA4zgX0qE5.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptStrings()|3", org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$45678$012$456")));
        // salt gets cut at maximum length
        org.junit.Assert.assertEquals("$6$1234567890123456$d2HCAnimIF5VMqUnwaZ/4JhNDJ.ttsjm0nbbmc9eE7xUYiw79GMvXUc5ZqG5BlqkXSbASZxrvR0QefAgdLbeH.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptStrings()|4", org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$1234567890123456")));
        org.junit.Assert.assertEquals("$6$1234567890123456$d2HCAnimIF5VMqUnwaZ/4JhNDJ.ttsjm0nbbmc9eE7xUYiw79GMvXUc5ZqG5BlqkXSbASZxrvR0QefAgdLbeH.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptStrings()|5", org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$1234567890123456789")));
    }

    @org.junit.Test
    public void testSha512CryptBytes() {
        // An empty Bytearray equals an empty String
        org.junit.Assert.assertEquals("$6$foo$Nywkte7LPWjaJhWjNeGJN.dFdY3pN1wYlGifyRLYOVlGS9EMSiZaDDe/BGSOYQ327q9.32I4UqQ5odsqvsBLX/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptBytes()|1", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptBytes()|0", byte[].class, new byte[0]), "$6$foo")));
        // UTF-8 stores \u00e4 "a with diaeresis" as two bytes 0xc3 0xa4.
        org.junit.Assert.assertEquals("$6$./$fKtWqslQkwI8ZxjdWoeS.jHHrte97bZxiwB5gwCRHX6LG62fUhT6Bb5MRrjWvieh0C/gxh8ItFuTsVy80VrED1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptBytes()|2", org.apache.commons.codec.digest.Crypt.crypt("t\u00e4st", "$6$./$")));
        // ISO-8859-1 stores "a with diaeresis" as single byte 0xe4.
        org.junit.Assert.assertEquals("$6$./$L49DSK.d2df/LxGLJQMyS5A/Um.TdHqgc46j5FpScEPlqQHP5dEazltaDNDZ6UEs2mmNI6kPwtH/rsP9g5zBI.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptBytes()|5", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptBytes()|4", byte[].class, "t\u00e4st".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptBytes()|3", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.ISO_8859_1))), "$6$./$")));
    }

    @org.junit.Test
    public void testSha512CryptExplicitCall() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptExplicitCall()|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptExplicitCall()|1", org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptExplicitCall()|0", byte[].class, "secret".getBytes()))).matches("^\\$6\\$[a-zA-Z0-9./]{0,16}\\$.{1,}$")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptExplicitCall()|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptExplicitCall()|4", org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptExplicitCall()|3", byte[].class, "secret".getBytes()), null)).matches("^\\$6\\$[a-zA-Z0-9./]{0,16}\\$.{1,}$")));
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testSha512CryptNullData() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptNullData()|0", org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(((byte[]) (null))));
        } catch (java.lang.NullPointerException a1553628734265) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptNullData()|!", a1553628734265);
            throw a1553628734265;
        }
    }

    @org.junit.Ignore
    public void testSha512CryptNullSalt() {
        // cannot be tested as sha512Crypt() with all params is private and
        // all public methods check for salt==null.
    }

    @org.junit.Test
    public void testSha2CryptRounds() {
        // minimum rounds?
        org.junit.Assert.assertEquals("$5$rounds=1000$abcd$b8MCU4GEeZIekOy5ahQ8EWfT330hvYGVeDYkBxXBva.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|2", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|1", byte[].class, "secret".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))), "$5$rounds=50$abcd$")));
        org.junit.Assert.assertEquals("$5$rounds=1001$abcd$SQsJZs7KXKdd2DtklI3TY3tkD7UYA99RD0FBLm4Sk48", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|5", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|4", byte[].class, "secret".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|3", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))), "$5$rounds=1001$abcd$")));
        org.junit.Assert.assertEquals("$5$rounds=9999$abcd$Rh/8ngVh9oyuS6lL3.fsq.9xbvXJsfyKWxSjO2mPIa7", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|8", org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|7", byte[].class, "secret".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptRounds()|6", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))), "$5$rounds=9999$abcd")));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testSha2CryptWrongSalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptWrongSalt()|2", org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptWrongSalt()|1", byte[].class, "secret".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptWrongSalt()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8))), "xx"));
        } catch (java.lang.IllegalArgumentException a1553628734263) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Sha512CryptTest|testSha2CryptWrongSalt()|!", a1553628734263);
            throw a1553628734263;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testSha512CryptWithEmptySalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptWithEmptySalt()|1", org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptWithEmptySalt()|0", byte[].class, "secret".getBytes()), ""));
        } catch (java.lang.IllegalArgumentException a1553628734266) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Sha512CryptTest|testSha512CryptWithEmptySalt()|!", a1553628734266);
            throw a1553628734266;
        }
    }

    @org.junit.Test
    public void testSha256LargetThanBlocksize() {
        final byte[] buffer = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha256LargetThanBlocksize()|0", byte[].class, new byte[200]);
        java.util.Arrays.fill(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha256LargetThanBlocksize()|1", byte[].class, buffer), 0, 200, ((byte) ('A')));
        org.junit.Assert.assertEquals("$6$abc$oP/h8PRhCKIA66KSTjGwNsQMSLLZnuFOTjOhrqNrDkKgjTlpePSqibB0qtmDapMbP/zN1cUEYSeHFrpgqZ.GG1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Sha512CryptTest|testSha256LargetThanBlocksize()|3", org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Sha512CryptTest|testSha256LargetThanBlocksize()|2", byte[].class, buffer), "$6$abc")));
    }
}

