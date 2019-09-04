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


public class Apr1CryptTest {
    @org.junit.Test
    public void testApr1CryptStrings() {
        // A random example using htpasswd
        org.junit.Assert.assertEquals("$apr1$TqI9WECO$LHZB2DqRlk9nObiB6vJG9.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptStrings()|0", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$TqI9WECO")));
        // empty data
        org.junit.Assert.assertEquals("$apr1$foo$P27KyD1htb4EllIPEYhqi0", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptStrings()|1", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("", "$apr1$foo")));
        // salt gets cut at dollar sign
        org.junit.Assert.assertEquals("$apr1$1234$mAlH7FRST6FiRZ.kcYL.j1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptStrings()|2", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$1234")));
        org.junit.Assert.assertEquals("$apr1$1234$mAlH7FRST6FiRZ.kcYL.j1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptStrings()|3", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$1234$567")));
        org.junit.Assert.assertEquals("$apr1$1234$mAlH7FRST6FiRZ.kcYL.j1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptStrings()|4", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$1234$567$890")));
        // salt gets cut at maximum length
        org.junit.Assert.assertEquals("$apr1$12345678$0lqb/6VUFP8JY/s/jTrIk0", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptStrings()|5", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$1234567890123456")));
        org.junit.Assert.assertEquals("$apr1$12345678$0lqb/6VUFP8JY/s/jTrIk0", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptStrings()|6", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$123456789012345678")));
    }

    @org.junit.Test
    public void testApr1CryptBytes() {
        // random salt
        final byte[] keyBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|0", byte[].class, new byte[]{ '!', 'b', 'c', '.' });
        final java.lang.String hash = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|2", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|1", byte[].class, keyBytes)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|3", hash), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|5", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("!bc.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|4", hash))));
        // An empty Bytearray equals an empty String
        org.junit.Assert.assertEquals("$apr1$foo$P27KyD1htb4EllIPEYhqi0", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|7", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|6", byte[].class, new byte[0]), "$apr1$foo")));
        // UTF-8 stores \u00e4 "a with diaeresis" as two bytes 0xc3 0xa4.
        org.junit.Assert.assertEquals("$apr1$./$EeFrYzWWbmTyGdf4xULYc.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|8", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("t\u00e4st", "$apr1$./$")));
        // ISO-8859-1 stores "a with diaeresis" as single byte 0xe4.
        org.junit.Assert.assertEquals("$apr1$./$kCwT1pY9qXAJElYG9q1QE1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|11", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|10", byte[].class, "t\u00e4st".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptBytes()|9", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.ISO_8859_1))), "$apr1$./$")));
    }

    @org.junit.Test
    public void testApr1CryptExplicitCall() {
        // When explicitly called the prefix is optional
        org.junit.Assert.assertEquals("$apr1$1234$mAlH7FRST6FiRZ.kcYL.j1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptExplicitCall()|0", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "1234")));
        // When explicitly called without salt, a random one will be used.
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptExplicitCall()|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptExplicitCall()|2", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptExplicitCall()|1", byte[].class, "secret".getBytes()))).matches("^\\$apr1\\$[a-zA-Z0-9./]{0,8}\\$.{1,}$")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptExplicitCall()|6", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptExplicitCall()|5", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptExplicitCall()|4", byte[].class, "secret".getBytes()), null)).matches("^\\$apr1\\$[a-zA-Z0-9./]{0,8}\\$.{1,}$")));
    }

    @org.junit.Test
    public void testApr1LongSalt() {
        org.junit.Assert.assertEquals("$apr1$12345678$0lqb/6VUFP8JY/s/jTrIk0", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1LongSalt()|0", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "12345678901234567890")));
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testApr1CryptNullData() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptNullData()|0", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(((byte[]) (null))));
        } catch (java.lang.NullPointerException a1553628734121) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptNullData()|!", a1553628734121);
            throw a1553628734121;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testApr1CryptWithEmptySalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithEmptySalt()|1", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithEmptySalt()|0", byte[].class, "secret".getBytes()), ""));
        } catch (java.lang.IllegalArgumentException a1553628734123) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithEmptySalt()|!", a1553628734123);
            throw a1553628734123;
        }
    }

    @org.junit.Test
    public void testApr1CryptWithoutSalt() {
        // Without salt, a random is generated
        final java.lang.String hash = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithoutSalt()|0", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithoutSalt()|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithoutSalt()|1", hash).matches("^\\$apr1\\$[a-zA-Z0-9\\./]{8}\\$[a-zA-Z0-9\\./]{22}$")));
        final java.lang.String hash2 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithoutSalt()|3", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret"));
        org.junit.Assert.assertNotSame(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithoutSalt()|4", hash), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithoutSalt()|5", hash2));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testApr1CryptWithInvalidSalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithInvalidSalt()|1", org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithInvalidSalt()|0", byte[].class, new byte[0]), "!"));
        } catch (java.lang.IllegalArgumentException a1553628734123) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Apr1CryptTest|testApr1CryptWithInvalidSalt()|!", a1553628734123);
            throw a1553628734123;
        }
    }
}

