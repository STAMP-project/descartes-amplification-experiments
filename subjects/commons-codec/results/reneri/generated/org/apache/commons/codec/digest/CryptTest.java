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


public class CryptTest {
    @org.junit.Test
    public void testCrypt() {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.Crypt>observeState("org.apache.commons.codec.digest.CryptTest|testCrypt()|0", org.apache.commons.codec.digest.Crypt.class, new org.apache.commons.codec.digest.Crypt()));// just for Test Coverage

    }

    @org.junit.Test
    public void testDefaultCryptVariant() {
        // If salt is null or completely omitted, a random "$6$" is used.
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testDefaultCryptVariant()|1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testDefaultCryptVariant()|0", org.apache.commons.codec.digest.Crypt.crypt("secret")).startsWith("$6$")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testDefaultCryptVariant()|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testDefaultCryptVariant()|2", org.apache.commons.codec.digest.Crypt.crypt("secret", null)).startsWith("$6$")));
    }

    @org.junit.Test
    public void testCryptWithBytes() {
        final byte[] keyBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.CryptTest|testCryptWithBytes()|0", byte[].class, new byte[]{ 'b', 'y', 't', 'e' });
        final java.lang.String hash = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testCryptWithBytes()|2", org.apache.commons.codec.digest.Crypt.crypt(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.CryptTest|testCryptWithBytes()|1", byte[].class, keyBytes)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testCryptWithBytes()|3", hash), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testCryptWithBytes()|5", org.apache.commons.codec.digest.Crypt.crypt("byte", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testCryptWithBytes()|4", hash))));
    }

    /**
     * An empty string as salt is invalid.
     *
     * The C and Perl implementations return an empty string, PHP threads it
     * as NULL. Our implementation should throw an Exception as any resulting
     * hash would not be verifyable with other implementations of crypt().
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testCryptWithEmptySalt() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.CryptTest|testCryptWithEmptySalt()|0", org.apache.commons.codec.digest.Crypt.crypt("secret", ""));
        } catch (java.lang.IllegalArgumentException a1553628734127) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.CryptTest|testCryptWithEmptySalt()|!", a1553628734127);
            throw a1553628734127;
        }
    }
}

