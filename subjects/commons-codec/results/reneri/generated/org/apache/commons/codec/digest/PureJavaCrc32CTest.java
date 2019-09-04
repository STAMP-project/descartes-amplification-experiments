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


/**
 * Test class for PureJavaCrc32C.
 * Test data was derived from
 * https://tools.ietf.org/html/rfc3720#appendix-B.4
 */
public class PureJavaCrc32CTest {
    private final org.apache.commons.codec.digest.PureJavaCrc32C crc = new org.apache.commons.codec.digest.PureJavaCrc32C();

    private final byte[] data = new byte[32];

    @org.junit.Test
    public void testZeros() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testZeros()|0", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testZeros()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|testZeros()|1", byte[].class, data).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testZeros()|5", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|testZeros()|3", byte[].class, data)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testZeros()|4", i)] = ((byte) (0))));
        }
        check(-1970194774);// aa 36 91 8a

    }

    @org.junit.Test
    public void testOnes() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testOnes()|0", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testOnes()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|testOnes()|1", byte[].class, data).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testOnes()|5", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|testOnes()|3", byte[].class, data)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testOnes()|4", i)] = ((byte) (255))));
        }
        check(1655221059);// 43 ab a8 62

    }

    @org.junit.Test
    public void testIncreasing() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testIncreasing()|0", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testIncreasing()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|testIncreasing()|1", byte[].class, data).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testIncreasing()|5", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|testIncreasing()|3", byte[].class, data)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testIncreasing()|4", i)] = ((byte) (i))));
        }
        check(1188919630);// 4e 79 dd 46

    }

    @org.junit.Test
    public void testDecreasing() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testDecreasing()|0", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testDecreasing()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|testDecreasing()|1", byte[].class, data).length)); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testDecreasing()|6", (eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|testDecreasing()|3", byte[].class, data)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testDecreasing()|4", i)] = ((byte) (31 - (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|testDecreasing()|5", i))))));
        }
        check(289397596);// 5c db 3f 11

    }

    // Using int because only want 32 bits
    private void check(final int expected) {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32C>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|0", org.apache.commons.codec.digest.PureJavaCrc32C.class, crc).reset();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32C>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|1", org.apache.commons.codec.digest.PureJavaCrc32C.class, crc).update(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|2", byte[].class, data), 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|4", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|3", byte[].class, data).length));
        final int actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|6", ((int) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32C>observeState("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|5", org.apache.commons.codec.digest.PureJavaCrc32C.class, crc).getValue())));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|8", java.lang.Integer.toHexString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|7", expected))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|10", java.lang.Integer.toHexString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32CTest|check(int)|9", actual))));
    }
}

