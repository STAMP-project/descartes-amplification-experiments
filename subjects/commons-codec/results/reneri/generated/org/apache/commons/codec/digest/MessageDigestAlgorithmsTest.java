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
 * Tests {@link MessageDigestAlgorithms}.
 *
 * @since 1.11
 */
@org.junit.runner.RunWith(org.junit.runners.Parameterized.class)
public class MessageDigestAlgorithmsTest {
    @org.junit.runners.Parameterized.Parameters(name = "{0}")
    public static java.lang.Object[] data() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|data()|0", java.lang.String[].class, org.apache.commons.codec.digest.MessageDigestAlgorithms.values());
    }

    private static boolean contains(final java.lang.String key) {
        for (final java.lang.String s : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|contains(java.lang.String)|0", java.lang.String[].class, org.apache.commons.codec.digest.MessageDigestAlgorithms.values())) {
            if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|contains(java.lang.String)|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|contains(java.lang.String)|1", s).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|contains(java.lang.String)|2", key)))) {
                return true;
            }
        }
        return false;
    }

    @org.junit.BeforeClass
    public static void checkValues() throws java.lang.Exception {
        final java.lang.reflect.Field[] fields = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Field[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|0", java.lang.reflect.Field[].class, org.apache.commons.codec.digest.MessageDigestAlgorithms.class.getDeclaredFields());
        boolean ok = true;
        int psf = 0;
        for (final java.lang.reflect.Field f : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Field[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|1", java.lang.reflect.Field[].class, fields)) {
            // Only interested in public fields
            final int modifiers = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Field>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|2", java.lang.reflect.Field.class, f).getModifiers());
            if (((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|5", java.lang.reflect.Modifier.isPublic(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|4", modifiers)))) && (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|7", java.lang.reflect.Modifier.isStatic(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|6", modifiers))))) && (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|9", java.lang.reflect.Modifier.isFinal(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|8", modifiers))))) {
                psf++;
                if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|12", org.apache.commons.codec.digest.MessageDigestAlgorithmsTest.contains(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|11", ((java.lang.String) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Field>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|10", java.lang.reflect.Field.class, f).get(null)))))))) {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|13", java.io.PrintStream.class, java.lang.System.out).println(("Not found in MessageDigestAlgorithms.values(): " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Field>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|14", java.lang.reflect.Field.class, f).getName()))));
                    eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|16", (ok = false));
                }
            }
        }
        if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|17", ok))) {
            org.junit.Assert.fail("One or more entries are missing from the MessageDigestAlgorithms.values() array");
        }
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|18", psf)) != (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|checkValues()|19", java.lang.String[].class, org.apache.commons.codec.digest.MessageDigestAlgorithms.values()).length))) {
            org.junit.Assert.fail("One or more unexpected entries found in the MessageDigestAlgorithms.values() array");
        }
    }

    private org.apache.commons.codec.digest.DigestUtilsTest digestUtilsTest;

    private final java.lang.String messageDigestAlgorithm;

    public MessageDigestAlgorithmsTest(final java.lang.String messageDigestAlgorithm) {
        this.messageDigestAlgorithm = messageDigestAlgorithm;
    }

    private byte[] digestTestData() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|digestTestData()|3", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|digestTestData()|1", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|digestTestData()|0", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|digestTestData()|2", byte[].class, getTestData())));
    }

    private byte[] getTestData() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|getTestData()|1", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|getTestData()|0", org.apache.commons.codec.digest.DigestUtilsTest.class, digestUtilsTest).getTestData());
    }

    private java.io.File getTestFile() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|getTestFile()|1", java.io.File.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|getTestFile()|0", org.apache.commons.codec.digest.DigestUtilsTest.class, digestUtilsTest).getTestFile());
    }

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|setUp()|0", org.apache.commons.codec.digest.DigestUtilsTest.class, (digestUtilsTest = new org.apache.commons.codec.digest.DigestUtilsTest()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|setUp()|1", org.apache.commons.codec.digest.DigestUtilsTest.class, digestUtilsTest).setUp();
    }

    @org.junit.After
    public void tearDown() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|tearDown()|0", org.apache.commons.codec.digest.DigestUtilsTest.class, digestUtilsTest).tearDown();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.DigestUtilsTest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|tearDown()|1", org.apache.commons.codec.digest.DigestUtilsTest.class, (digestUtilsTest = null));
    }

    @org.junit.Test
    public void testAlgorithm() throws java.security.NoSuchAlgorithmException {
        final java.lang.String algorithm = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testAlgorithm()|0", messageDigestAlgorithm);
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testAlgorithm()|1", algorithm));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testAlgorithm()|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testAlgorithm()|2", algorithm).isEmpty()));
        org.junit.Assume.assumeTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testAlgorithm()|5", org.apache.commons.codec.digest.DigestUtils.isAvailable(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testAlgorithm()|4", messageDigestAlgorithm))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testAlgorithm()|7", java.security.MessageDigest.class, java.security.MessageDigest.getInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testAlgorithm()|6", algorithm)));
    }

    @org.junit.Test
    public void testDigestByteArray() {
        org.junit.Assume.assumeTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|1", org.apache.commons.codec.digest.DigestUtils.isAvailable(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|0", messageDigestAlgorithm))));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|2", byte[].class, digestTestData()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|6", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|4", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|3", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|5", byte[].class, getTestData()))));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|7", byte[].class, digestTestData()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|11", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|9", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|8", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteArray()|10", byte[].class, getTestData()))));
    }

    @org.junit.Test
    public void testDigestByteBuffer() {
        org.junit.Assume.assumeTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|1", org.apache.commons.codec.digest.DigestUtils.isAvailable(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|0", messageDigestAlgorithm))));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|2", byte[].class, digestTestData()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|7", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|4", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|3", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|6", java.nio.ByteBuffer.class, java.nio.ByteBuffer.wrap(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|5", byte[].class, getTestData()))))));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|8", byte[].class, digestTestData()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|13", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|10", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|9", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.ByteBuffer>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|12", java.nio.ByteBuffer.class, java.nio.ByteBuffer.wrap(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestByteBuffer()|11", byte[].class, getTestData()))))));
    }

    @org.junit.Test
    public void testDigestFile() throws java.io.IOException {
        org.junit.Assume.assumeTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|1", org.apache.commons.codec.digest.DigestUtils.isAvailable(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|0", messageDigestAlgorithm))));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|2", byte[].class, digestTestData()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|6", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|4", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|3", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|5", java.io.File.class, getTestFile()))));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|7", byte[].class, digestTestData()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|11", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|9", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|8", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestFile()|10", java.io.File.class, getTestFile()))));
    }

    @org.junit.Test
    public void testDigestInputStream() throws java.io.IOException {
        org.junit.Assume.assumeTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|1", org.apache.commons.codec.digest.DigestUtils.isAvailable(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|0", messageDigestAlgorithm))));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|2", byte[].class, digestTestData()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|7", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|4", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|3", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|6", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|5", byte[].class, getTestData()))))));
        org.junit.Assert.assertArrayEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|8", byte[].class, digestTestData()), eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|13", byte[].class, org.apache.commons.codec.digest.DigestUtils.digest(eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|10", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|9", messageDigestAlgorithm))), eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|12", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testDigestInputStream()|11", byte[].class, getTestData()))))));
    }

    @org.junit.Test
    public void testGetMessageDigest() {
        org.junit.Assume.assumeTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testGetMessageDigest()|1", org.apache.commons.codec.digest.DigestUtils.isAvailable(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testGetMessageDigest()|0", messageDigestAlgorithm))));
        final java.security.MessageDigest messageDigest = eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testGetMessageDigest()|3", java.security.MessageDigest.class, org.apache.commons.codec.digest.DigestUtils.getDigest(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testGetMessageDigest()|2", messageDigestAlgorithm)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testGetMessageDigest()|4", messageDigestAlgorithm), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testGetMessageDigest()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.security.MessageDigest>observeState("org.apache.commons.codec.digest.MessageDigestAlgorithmsTest|testGetMessageDigest()|5", java.security.MessageDigest.class, messageDigest).getAlgorithm()));
    }
}

