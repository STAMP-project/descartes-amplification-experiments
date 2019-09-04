/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.codec.digest;


@org.junit.runner.RunWith(org.junit.runners.Parameterized.class)
public class XXHash32Test {
    private final java.io.File file;

    private final java.lang.String expectedChecksum;

    public XXHash32Test(final java.lang.String path, final java.lang.String c) throws java.io.IOException {
        final java.net.URL url = org.apache.commons.codec.digest.XXHash32Test.class.getClassLoader().getResource(path);
        if (url == null) {
            throw new java.io.FileNotFoundException(("couldn't find " + path));
        }
        java.net.URI uri = null;
        try {
            uri = url.toURI();
        } catch (final java.net.URISyntaxException ex) {
            throw new java.io.IOException(ex);
        }
        file = new java.io.File(uri);
        expectedChecksum = c;
    }

    @org.junit.runners.Parameterized.Parameters
    public static java.util.Collection<java.lang.Object[]> factory() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Object[]>>observeState("org.apache.commons.codec.digest.XXHash32Test|factory()|3", java.util.List.class, java.util.Arrays.asList(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[][]>observeState("org.apache.commons.codec.digest.XXHash32Test|factory()|2", java.lang.Object[][].class, new java.lang.Object[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.digest.XXHash32Test|factory()|0", java.lang.Object[].class, // reference checksums created with xxh32sum
        new java.lang.Object[]{ "bla.tar", "fbb5c8d1" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.digest.XXHash32Test|factory()|1", java.lang.Object[].class, new java.lang.Object[]{ "bla.tar.xz", "4106a208" }) })));
    }

    @org.junit.Test
    public void verifyChecksum() throws java.io.IOException {
        final org.apache.commons.codec.digest.XXHash32 h = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.XXHash32>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|0", org.apache.commons.codec.digest.XXHash32.class, new org.apache.commons.codec.digest.XXHash32());
        try (final java.io.FileInputStream s = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.FileInputStream>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|2", java.io.FileInputStream.class, new java.io.FileInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|1", java.io.File.class, file)))) {
            final byte[] b = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|4", byte[].class, org.apache.commons.codec.digest.XXHash32Test.toByteArray(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.FileInputStream>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|3", java.io.FileInputStream.class, s)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.XXHash32>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|5", org.apache.commons.codec.digest.XXHash32.class, h).update(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|6", byte[].class, b), 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|7", byte[].class, b).length));
        }
        org.junit.Assert.assertEquals(("checksum for " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|9", java.io.File.class, file).getName()))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|11", expectedChecksum), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|14", java.lang.Long.toHexString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.XXHash32>observeState("org.apache.commons.codec.digest.XXHash32Test|verifyChecksum()|12", org.apache.commons.codec.digest.XXHash32.class, h).getValue()))));
    }

    private static byte[] toByteArray(final java.io.InputStream input) throws java.io.IOException {
        final java.io.ByteArrayOutputStream output = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.digest.XXHash32Test|toByteArray(java.io.InputStream)|0", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|toByteArray(java.io.InputStream)|3", org.apache.commons.codec.digest.XXHash32Test.copy(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.digest.XXHash32Test|toByteArray(java.io.InputStream)|1", java.io.InputStream.class, input), eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.digest.XXHash32Test|toByteArray(java.io.InputStream)|2", java.io.ByteArrayOutputStream.class, output), 10240));
        return eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.XXHash32Test|toByteArray(java.io.InputStream)|5", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.apache.commons.codec.digest.XXHash32Test|toByteArray(java.io.InputStream)|4", java.io.ByteArrayOutputStream.class, output).toByteArray());
    }

    private static long copy(final java.io.InputStream input, final java.io.OutputStream output, final int buffersize) throws java.io.IOException {
        final byte[] buffer = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|1", byte[].class, new byte[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|0", buffersize)]);
        int n = 0;
        long count = 0;
        while ((-1) != (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|4", (n = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|2", java.io.InputStream.class, input).read(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|3", byte[].class, buffer)))))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.OutputStream>observeState("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|5", java.io.OutputStream.class, output).write(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|6", byte[].class, buffer), 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|7", n));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|8", (count += n));
        } 
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.XXHash32Test|copy(java.io.InputStream,java.io.OutputStream,int)|9", count);
    }
}

