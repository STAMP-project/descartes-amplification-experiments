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


public class Md5CryptTest {
    @org.junit.Test
    public void testCtor() {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.Md5Crypt>observeState("org.apache.commons.codec.digest.Md5CryptTest|testCtor()|0", org.apache.commons.codec.digest.Md5Crypt.class, new org.apache.commons.codec.digest.Md5Crypt()));// for code-coverage

    }

    @org.junit.Test
    public void testMd5CryptStrings() {
        // empty data
        org.junit.Assert.assertEquals("$1$foo$9mS5ExwgIECGE5YKlD5o91", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptStrings()|0", org.apache.commons.codec.digest.Crypt.crypt("", "$1$foo")));
        // salt gets cut at dollar sign
        org.junit.Assert.assertEquals("$1$1234$ImZYBLmYC.rbBKg9ERxX70", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptStrings()|1", org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$1234")));
        org.junit.Assert.assertEquals("$1$1234$ImZYBLmYC.rbBKg9ERxX70", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptStrings()|2", org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$1234$567")));
        org.junit.Assert.assertEquals("$1$1234$ImZYBLmYC.rbBKg9ERxX70", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptStrings()|3", org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$1234$567$890")));
        // salt gets cut at maximum length
        org.junit.Assert.assertEquals("$1$12345678$hj0uLpdidjPhbMMZeno8X/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptStrings()|4", org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$1234567890123456")));
        org.junit.Assert.assertEquals("$1$12345678$hj0uLpdidjPhbMMZeno8X/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptStrings()|5", org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$123456789012345678")));
    }

    @org.junit.Test
    public void testMd5CryptBytes() {
        // An empty Bytearray equals an empty String
        org.junit.Assert.assertEquals("$1$foo$9mS5ExwgIECGE5YKlD5o91", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptBytes()|1", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptBytes()|0", byte[].class, new byte[0]), "$1$foo")));
        // UTF-8 stores \u00e4 "a with diaeresis" as two bytes 0xc3 0xa4.
        org.junit.Assert.assertEquals("$1$./$52agTEQZs877L9jyJnCNZ1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptBytes()|2", org.apache.commons.codec.digest.Crypt.crypt("t\u00e4st", "$1$./$")));
        // ISO-8859-1 stores "a with diaeresis" as single byte 0xe4.
        org.junit.Assert.assertEquals("$1$./$J2UbKzGe0Cpe63WZAt6p//", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptBytes()|5", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptBytes()|4", byte[].class, "t\u00e4st".getBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptBytes()|3", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.ISO_8859_1))), "$1$./$")));
    }

    @org.junit.Test
    public void testMd5CryptExplicitCall() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptExplicitCall()|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptExplicitCall()|1", org.apache.commons.codec.digest.Md5Crypt.md5Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptExplicitCall()|0", byte[].class, "secret".getBytes()))).matches("^\\$1\\$[a-zA-Z0-9./]{0,8}\\$.{1,}$")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptExplicitCall()|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptExplicitCall()|4", org.apache.commons.codec.digest.Md5Crypt.md5Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptExplicitCall()|3", byte[].class, "secret".getBytes()), null)).matches("^\\$1\\$[a-zA-Z0-9./]{0,8}\\$.{1,}$")));
    }

    @org.junit.Test
    public void testMd5CryptLongInput() {
        org.junit.Assert.assertEquals("$1$1234$MoxekaNNUgfPRVqoeYjCD/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptLongInput()|0", org.apache.commons.codec.digest.Crypt.crypt("12345678901234567890", "$1$1234")));
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testMd5CryptNullData() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptNullData()|0", org.apache.commons.codec.digest.Md5Crypt.md5Crypt(((byte[]) (null))));
        } catch (java.lang.NullPointerException a1553628734228) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptNullData()|!", a1553628734228);
            throw a1553628734228;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testMd5CryptWithEmptySalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptWithEmptySalt()|1", org.apache.commons.codec.digest.Md5Crypt.md5Crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptWithEmptySalt()|0", byte[].class, "secret".getBytes()), ""));
        } catch (java.lang.IllegalArgumentException a1553628734229) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.Md5CryptTest|testMd5CryptWithEmptySalt()|!", a1553628734229);
            throw a1553628734229;
        }
    }
}

