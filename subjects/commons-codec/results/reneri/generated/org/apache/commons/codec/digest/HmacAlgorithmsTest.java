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
 * Tests {@link HmacAlgorithms}.
 *
 * @since 1.11
 */
@org.junit.runner.RunWith(org.junit.runners.Parameterized.class)
public class HmacAlgorithmsTest {
    static final java.lang.String STANDARD_KEY_STRING = "key";

    static final byte[] STANDARD_KEY_BYTES = org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_STRING.getBytes();

    static final byte[] STANDARD_MD5_RESULT_BYTES = new byte[]{ -128, 7, 7, 19, 70, 62, 119, 73, -71, 12, 45, -62, 73, 17, -30, 117 };

    static final java.lang.String STANDARD_MD5_RESULT_STRING = "80070713463e7749b90c2dc24911e275";

    static final java.lang.String STANDARD_PHRASE_STRING = "The quick brown fox jumps over the lazy dog";

    static final byte[] STANDARD_PHRASE_BYTES = org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_STRING.getBytes();

    static final byte[] STANDARD_SHA1_RESULT_BYTES = new byte[]{ -34, 124, -101, -123, -72, -73, -118, -90, -68, -118, 122, 54, -9, 10, -112, 112, 28, -99, -76, -39 };

    static final java.lang.String STANDARD_SHA1_RESULT_STRING = "de7c9b85b8b78aa6bc8a7a36f70a90701c9db4d9";

    static final byte[] STANDARD_SHA224_RESULT_BYTES = new byte[]{ -120, -1, -117, 84, 103, 93, 57, -72, -9, 35, 34, -26, 95, -7, 69, -59, 45, -106, 55, -103, -120, -83, -94, 86, 57, 116, 126, 105 };

    static final java.lang.String STANDARD_SHA224_RESULT_STRING = "88ff8b54675d39b8f72322e65ff945c52d96379988ada25639747e69";

    static final byte[] STANDARD_SHA256_RESULT_BYTES = new byte[]{ -9, -68, -125, -12, 48, 83, -124, 36, -79, 50, -104, -26, -86, 111, -79, 67, -17, 77, 89, -95, 73, 70, 23, 89, -105, 71, -99, -68, 45, 26, 60, -40 };

    static final java.lang.String STANDARD_SHA256_RESULT_STRING = "f7bc83f430538424b13298e6aa6fb143ef4d59a14946175997479dbc2d1a3cd8";

    static final byte[] STANDARD_SHA384_RESULT_BYTES = new byte[]{ -41, -12, 114, 126, 44, 11, 57, -82, 15, 30, 64, -52, -106, -10, 2, 66, -43, -73, -128, 24, 65, -50, -90, -4, 89, 44, 93, 62, 26, -27, 7, 0, 88, 42, -106, -49, 53, -31, -27, 84, -103, 95, -28, -32, 51, -127, -62, 55 };

    static final java.lang.String STANDARD_SHA384_RESULT_STRING = "D7F4727E2C0B39AE0F1E40CC96F60242D5B7801841CEA6FC592C5D3E1AE50700582A96CF35E1E554995FE4E03381C237".toLowerCase();

    static final byte[] STANDARD_SHA512_RESULT_BYTES = new byte[]{ -76, 42, -16, -112, 87, -70, -63, -30, -44, 23, 8, -28, -118, -112, 46, 9, -75, -1, 127, 18, -85, 66, -118, 79, -24, 102, 83, -57, 61, -46, 72, -5, -126, -7, 72, -91, 73, -9, -73, -111, -91, -76, 25, 21, -18, 77, 30, -61, -109, 83, 87, -28, -30, 49, 114, 80, -48, 55, 42, -6, 46, -66, -21, 58 };

    static final java.lang.String STANDARD_SHA512_RESULT_STRING = "B42AF09057BAC1E2D41708E48A902E09B5FF7F12AB428A4FE86653C73DD248FB82F948A549F7B791A5B41915EE4D1EC3935357E4E2317250D0372AFA2EBEEB3A".toLowerCase();

    private static final byte[] EMPTY_BYTE_ARRAY = new byte[]{  };

    // TODO HMAC_SHA_224
    @org.junit.runners.Parameterized.Parameters(name = "{0}")
    public static java.util.Collection<java.lang.Object[]> data() {
        java.util.List<java.lang.Object[]> list = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Object[]>>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|16", java.util.List.class, // @formatter:off
        java.util.Arrays.asList(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[][]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|15", java.lang.Object[][].class, new java.lang.Object[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|2", java.lang.Object[].class, new java.lang.Object[]{ eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|1", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_MD5_RESULT_BYTES), org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_MD5_RESULT_STRING }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|5", java.lang.Object[].class, new java.lang.Object[]{ eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|3", org.apache.commons.codec.digest.HmacAlgorithms.class, org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_1), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|4", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA1_RESULT_BYTES), org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA1_RESULT_STRING }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|8", java.lang.Object[].class, new java.lang.Object[]{ eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|6", org.apache.commons.codec.digest.HmacAlgorithms.class, org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_256), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|7", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA256_RESULT_BYTES), org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA256_RESULT_STRING }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|11", java.lang.Object[].class, new java.lang.Object[]{ eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|9", org.apache.commons.codec.digest.HmacAlgorithms.class, org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_384), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|10", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA384_RESULT_BYTES), org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA384_RESULT_STRING }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|14", java.lang.Object[].class, new java.lang.Object[]{ eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|12", org.apache.commons.codec.digest.HmacAlgorithms.class, org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_512), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|13", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA512_RESULT_BYTES), org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA512_RESULT_STRING }) })));
        // @formatter:on
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|18", org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.lang3.JavaVersion>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|17", org.apache.commons.lang3.JavaVersion.class, org.apache.commons.lang3.JavaVersion.JAVA_1_8)))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Object[]>>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|20", java.util.List.class, (list = new java.util.ArrayList<>(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Object[]>>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|19", java.util.List.class, list))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Object[]>>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|21", java.util.List.class, list).add(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|24", java.lang.Object[].class, new java.lang.Object[]{ eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|22", org.apache.commons.codec.digest.HmacAlgorithms.class, org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_224), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|23", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA224_RESULT_BYTES), org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_SHA224_RESULT_STRING })));
        }
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Object[]>>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|data()|26", java.util.List.class, list);
    }

    private org.apache.commons.codec.digest.DigestUtilsTest digestUtilsTest;

    private final org.apache.commons.codec.digest.HmacAlgorithms hmacAlgorithm;

    private final byte[] standardResultBytes;

    private final java.lang.String standardResultString;

    public HmacAlgorithmsTest(final org.apache.commons.codec.digest.HmacAlgorithms hmacAlgorithm, final byte[] standardResultBytes, final java.lang.String standardResultString) {
        org.junit.Assume.assumeTrue(org.apache.commons.codec.digest.HmacUtils.isAvailable(hmacAlgorithm));
        this.hmacAlgorithm = hmacAlgorithm;
        this.standardResultBytes = standardResultBytes;
        this.standardResultString = standardResultString;
    }

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|setUp()|0", org.apache.commons.codec.digest.DigestUtilsTest.class, (digestUtilsTest = new org.apache.commons.codec.digest.DigestUtilsTest()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|setUp()|1", org.apache.commons.codec.digest.DigestUtilsTest.class, digestUtilsTest).setUp();
    }

    @org.junit.After
    public void tearDown() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|tearDown()|0", org.apache.commons.codec.digest.DigestUtilsTest.class, digestUtilsTest).tearDown();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|tearDown()|1", org.apache.commons.codec.digest.DigestUtilsTest.class, (digestUtilsTest = null));
    }

    @org.junit.Test
    public void testAlgorithm() throws java.security.NoSuchAlgorithmException {
        final java.lang.String algorithm = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm).getName());
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|2", algorithm));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|4", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|3", algorithm).isEmpty()));
        org.junit.Assume.assumeTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|6", org.apache.commons.codec.digest.HmacUtils.isAvailable(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|5", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|8", javax.crypto.Mac.class, javax.crypto.Mac.getInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testAlgorithm()|7", algorithm)));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testGetHmacEmptyKey() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testGetHmacEmptyKey()|2", javax.crypto.Mac.class, org.apache.commons.codec.digest.HmacUtils.getInitializedMac(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testGetHmacEmptyKey()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testGetHmacEmptyKey()|1", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.EMPTY_BYTE_ARRAY)));
        } catch (java.lang.IllegalArgumentException a1553628734183) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.HmacAlgorithmsTest|testGetHmacEmptyKey()|!", a1553628734183);
            throw a1553628734183;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testGetHmacNullKey() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testGetHmacNullKey()|1", javax.crypto.Mac.class, org.apache.commons.codec.digest.HmacUtils.getInitializedMac(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testGetHmacNullKey()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), null));
        } catch (java.lang.IllegalArgumentException a1553628734183) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.HmacAlgorithmsTest|testGetHmacNullKey()|!", a1553628734183);
            throw a1553628734183;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testHmacFailByteArray() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailByteArray()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailByteArray()|1", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailByteArray()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), ((byte[]) (null)))).hmac(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailByteArray()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_BYTES)));
        } catch (java.lang.IllegalArgumentException a1553628734184) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailByteArray()|!", a1553628734184);
            throw a1553628734184;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testHmacFailInputStream() throws java.io.IOException {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailInputStream()|4", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailInputStream()|1", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailInputStream()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), ((byte[]) (null)))).hmac(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailInputStream()|3", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailInputStream()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_BYTES)))));
        } catch (java.lang.IllegalArgumentException a1553628734186) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailInputStream()|!", a1553628734186);
            throw a1553628734186;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testHmacFailString() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailString()|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailString()|1", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailString()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), ((java.lang.String) (null)))).hmac(org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_STRING));
        } catch (java.lang.IllegalArgumentException a1553628734186) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacFailString()|!", a1553628734186);
            throw a1553628734186;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testHmacHexFailByteArray() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailByteArray()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailByteArray()|1", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailByteArray()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), ((byte[]) (null)))).hmac(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailByteArray()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_BYTES)));
        } catch (java.lang.IllegalArgumentException a1553628734187) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailByteArray()|!", a1553628734187);
            throw a1553628734187;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testHmacHexFailInputStream() throws java.io.IOException {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailInputStream()|4", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailInputStream()|1", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailInputStream()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), ((byte[]) (null)))).hmac(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailInputStream()|3", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailInputStream()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_BYTES)))));
        } catch (java.lang.IllegalArgumentException a1553628734188) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailInputStream()|!", a1553628734188);
            throw a1553628734188;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testHmacHexFailString() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailString()|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailString()|1", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailString()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), ((java.lang.String) (null)))).hmac(org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_STRING));
        } catch (java.lang.IllegalArgumentException a1553628734188) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.digest.HmacAlgorithmsTest|testHmacHexFailString()|!", a1553628734188);
            throw a1553628734188;
        }
    }

    @org.junit.Test
    public void testInitializedMac() {
        final javax.crypto.Mac mac = eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|2", javax.crypto.Mac.class, org.apache.commons.codec.digest.HmacUtils.getInitializedMac(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|0", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|1", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_BYTES)));
        final javax.crypto.Mac mac2 = eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|6", javax.crypto.Mac.class, org.apache.commons.codec.digest.HmacUtils.getInitializedMac(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|3", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm).getName()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|5", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_BYTES)));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|7", byte[].class, standardResultBytes), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|10", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|9", javax.crypto.Mac.class, org.apache.commons.codec.digest.HmacUtils.updateHmac(eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|8", javax.crypto.Mac.class, mac), org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_STRING)).doFinal()));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|11", byte[].class, standardResultBytes), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|14", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|13", javax.crypto.Mac.class, org.apache.commons.codec.digest.HmacUtils.updateHmac(eu.stamp_project.reneri.instrumentation.StateObserver.<javax.crypto.Mac>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testInitializedMac()|12", javax.crypto.Mac.class, mac2), org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_STRING)).doFinal()));
    }

    @org.junit.Test
    public void testMacByteArary() {
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacByteArary()|0", byte[].class, standardResultBytes), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacByteArary()|5", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacByteArary()|3", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacByteArary()|1", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacByteArary()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_BYTES))).hmac(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacByteArary()|4", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_BYTES))));
    }

    @org.junit.Test
    public void testMacHexByteArray() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexByteArray()|0", standardResultString), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexByteArray()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexByteArray()|3", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexByteArray()|1", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexByteArray()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_BYTES))).hmacHex(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexByteArray()|4", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_BYTES))));
    }

    @org.junit.Test
    public void testMacHexInputStream() throws java.io.IOException {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexInputStream()|0", standardResultString), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexInputStream()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexInputStream()|3", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexInputStream()|1", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexInputStream()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_BYTES))).hmacHex(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexInputStream()|5", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexInputStream()|4", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_BYTES))))));
    }

    @org.junit.Test
    public void testMacHexString() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexString()|0", standardResultString), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexString()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexString()|3", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexString()|1", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacHexString()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_BYTES))).hmacHex(org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_STRING)));
    }

    @org.junit.Test
    public void testMacInputStream() throws java.io.IOException {
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacInputStream()|0", byte[].class, standardResultBytes), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacInputStream()|6", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacInputStream()|3", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacInputStream()|1", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacInputStream()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_BYTES))).hmac(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacInputStream()|5", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacInputStream()|4", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_BYTES))))));
    }

    @org.junit.Test
    public void testMacString() {
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacString()|0", byte[].class, standardResultBytes), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacString()|4", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacUtils>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacString()|3", org.apache.commons.codec.digest.HmacUtils.class, new org.apache.commons.codec.digest.HmacUtils(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.HmacAlgorithms>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacString()|1", org.apache.commons.codec.digest.HmacAlgorithms.class, hmacAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.HmacAlgorithmsTest|testMacString()|2", byte[].class, org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_KEY_BYTES))).hmac(org.apache.commons.codec.digest.HmacAlgorithmsTest.STANDARD_PHRASE_STRING)));
    }
}

