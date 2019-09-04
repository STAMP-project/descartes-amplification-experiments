/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.codec.digest;


/**
 * Unit test to verify that the pure-Java CRC32 algorithm gives
 * the same results as the built-in implementation.
 *
 * Copied from Hadoop 2.6.3 (Renamed TestPureJavaCrc32 to PureJavaCrc32Test).
 *
 * @since 1.11
 */
public class PureJavaCrc32Test {
    private final java.util.zip.CRC32 theirs = new java.util.zip.CRC32();

    private final org.apache.commons.codec.digest.PureJavaCrc32 ours = new org.apache.commons.codec.digest.PureJavaCrc32();

    @org.junit.Test
    public void testCorrectness() throws java.lang.Exception {
        checkSame();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|0", java.util.zip.CRC32.class, theirs).update(104);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|1", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).update(104);
        checkSame();
        checkOnBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|2", byte[].class, new byte[]{ 40, 60, 97, -70 }), false);
        checkOnBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|3", byte[].class, "hello world!".getBytes("UTF-8")), false);
        final java.util.Random random1 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|4", java.util.Random.class, new java.util.Random());
        final java.util.Random random2 = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|5", java.util.Random.class, new java.util.Random());
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|6", i)) < 10000; i++) {
            final byte[] randomBytes = eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|9", byte[].class, new byte[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|7", java.util.Random.class, random1).nextInt(2048))]);
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|10", java.util.Random.class, random2).nextBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|11", byte[].class, randomBytes));
            checkOnBytes(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|testCorrectness()|12", byte[].class, randomBytes), false);
        }
    }

    private void checkOnBytes(final byte[] bytes, final boolean print) {
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|0", java.util.zip.CRC32.class, theirs).reset();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|1", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).reset();
        checkSame();
        for (final byte b : eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|2", byte[].class, bytes)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|3", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).update(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|4", b));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|5", java.util.zip.CRC32.class, theirs).update(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|6", b));
            checkSame();
        }
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|7", print)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|8", java.io.PrintStream.class, java.lang.System.out).println(((("theirs:\t" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|11", java.lang.Long.toHexString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|9", java.util.zip.CRC32.class, theirs).getValue()))))) + "\nours:\t") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|14", java.lang.Long.toHexString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|12", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).getValue()))))));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|15", java.util.zip.CRC32.class, theirs).reset();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|16", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).reset();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|17", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).update(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|18", byte[].class, bytes), 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|20", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|19", byte[].class, bytes).length));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|21", java.util.zip.CRC32.class, theirs).update(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|22", byte[].class, bytes), 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|24", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|23", byte[].class, bytes).length));
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|25", print)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|26", java.io.PrintStream.class, java.lang.System.out).println(((("theirs:\t" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|29", java.lang.Long.toHexString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|28", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|27", java.util.zip.CRC32.class, theirs).getValue()))))) + "\nours:\t") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|32", java.lang.Long.toHexString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|31", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|30", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).getValue()))))));
        }
        checkSame();
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|34", eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|33", byte[].class, bytes).length)) >= 10) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|35", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).update(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|36", byte[].class, bytes), 5, 5);
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|37", java.util.zip.CRC32.class, theirs).update(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkOnBytes(byte[],boolean)|38", byte[].class, bytes), 5, 5);
            checkSame();
        }
    }

    private void checkSame() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkSame()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.zip.CRC32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkSame()|0", java.util.zip.CRC32.class, theirs).getValue()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.PureJavaCrc32Test|checkSame()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.PureJavaCrc32>observeState("org.apache.commons.codec.digest.PureJavaCrc32Test|checkSame()|2", org.apache.commons.codec.digest.PureJavaCrc32.class, ours).getValue()));
    }

    /**
     * Generate a table to perform checksums based on the same CRC-32 polynomial
     * that java.util.zip.CRC32 uses.
     */
    public static class Table {
        private final int[][] tables;

        private Table(final int nBits, final int nTables, final long polynomial) {
            tables = new int[nTables][];
            final int size = 1 << nBits;
            for (int i = 0; i < (tables.length); i++) {
                tables[i] = new int[size];
            }
            // compute the first table
            final int[] first = tables[0];
            for (int i = 0; i < (first.length); i++) {
                int crc = i;
                for (int j = 0; j < nBits; j++) {
                    if ((crc & 1) == 1) {
                        crc >>>= 1;
                        crc ^= polynomial;
                    }else {
                        crc >>>= 1;
                    }
                }
                first[i] = crc;
            }
            // compute the remaining tables
            final int mask = (first.length) - 1;
            for (int j = 1; j < (tables.length); j++) {
                final int[] previous = tables[(j - 1)];
                final int[] current = tables[j];
                for (int i = 0; i < (current.length); i++) {
                    current[i] = ((previous[i]) >>> nBits) ^ (first[((previous[i]) & mask)]);
                }
            }
        }

        java.lang.String[] toStrings(final java.lang.String nameformat) {
            final java.lang.String[] s = new java.lang.String[tables.length];
            for (int j = 0; j < (tables.length); j++) {
                final int[] t = tables[j];
                final java.lang.StringBuilder b = new java.lang.StringBuilder();
                b.append(java.lang.String.format((("    /* " + nameformat) + " */"), j));
                for (int i = 0; i < (t.length);) {
                    b.append("\n    ");
                    for (int k = 0; k < 4; k++) {
                        b.append(java.lang.String.format("0x%08X, ", t[(i++)]));
                    }
                }
                s[j] = b.toString();
            }
            return s;
        }

        @java.lang.Override
        public java.lang.String toString() {
            final java.lang.StringBuilder b = new java.lang.StringBuilder();
            final java.lang.String tableFormat = (java.lang.String.format("T%d_", java.lang.Integer.numberOfTrailingZeros(tables[0].length))) + "%d";
            final java.lang.String startFormat = ("  private static final int " + tableFormat) + "_start = %d*256;";
            for (int j = 0; j < (tables.length); j++) {
                b.append(java.lang.String.format(startFormat, j, j));
                b.append("\n");
            }
            b.append("  private static final int[] T = new int[] {");
            for (final java.lang.String s : toStrings(tableFormat)) {
                b.append("\n");
                b.append(s);
            }
            b.setCharAt(((b.length()) - 2), '\n');
            b.append(" };\n");
            return b.toString();
        }

        /**
         * Generate CRC-32 lookup tables
         */
        public static void main(final java.lang.String[] args) throws java.io.FileNotFoundException {
            if ((args.length) != 1) {
                java.lang.System.err.println((("Usage: " + (org.apache.commons.codec.digest.PureJavaCrc32Test.Table.class.getName())) + " <polynomial>"));
                java.lang.System.exit(1);
            }
            final long polynomial = java.lang.Long.parseLong(args[0], 16);
            final int i = 8;
            final org.apache.commons.codec.digest.PureJavaCrc32Test.Table t = new org.apache.commons.codec.digest.PureJavaCrc32Test.Table(i, 16, polynomial);
            final java.lang.String s = t.toString();
            java.lang.System.out.println(s);
            // print to a file
            try (final java.io.PrintStream out = new java.io.PrintStream(new java.io.FileOutputStream((("table" + i) + ".txt")), true)) {
                out.println(s);
            }
        }
    }

    /**
     * Performance tests to compare performance of the Pure Java implementation
     * to the built-in java.util.zip implementation. This can be run from the
     * command line with:
     *
     *   java -cp path/to/test/classes:path/to/common/classes \
     *      'org.apache.hadoop.util.TestPureJavaCrc32$PerformanceTest'
     *
     * The output is in JIRA table format.
     */
    public static class PerformanceTest {
        public static final int MAX_LEN = (32 * 1024) * 1024;// up to 32MB chunks


        public static final int BYTES_PER_SIZE = (org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.MAX_LEN) * 4;

        static final java.lang.Class<? extends java.util.zip.Checksum> zip = java.util.zip.CRC32.class;

        static final java.util.List<java.lang.Class<? extends java.util.zip.Checksum>> CRCS = new java.util.ArrayList<>();

        static {
            org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.CRCS.add(org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.zip);
            org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.CRCS.add(org.apache.commons.codec.digest.PureJavaCrc32.class);
        }

        public static void main(final java.lang.String[] args) throws java.lang.Exception {
            org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printSystemProperties(java.lang.System.out);
            org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.doBench(org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.CRCS, java.lang.System.out);
        }

        private static void printCell(final java.lang.String s, final int width, final java.io.PrintStream out) {
            final int w = ((s.length()) > width) ? s.length() : width;
            out.printf(((" %" + w) + "s |"), s);
        }

        private static void doBench(final java.util.List<java.lang.Class<? extends java.util.zip.Checksum>> crcs, final java.io.PrintStream out) throws java.lang.Exception {
            final byte[] bytes = new byte[org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.MAX_LEN];
            new java.util.Random().nextBytes(bytes);
            // Print header
            out.printf("\nPerformance Table (The unit is MB/sec; #T = #Theads)\n");
            // Warm up implementations to get jit going.
            for (final java.lang.Class<? extends java.util.zip.Checksum> c : crcs) {
                org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.doBench(c, 1, bytes, 2);
                org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.doBench(c, 1, bytes, 2101);
            }
            // Test on a variety of sizes with different number of threads
            for (int size = 32; size <= (org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.MAX_LEN); size <<= 1) {
                org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.doBench(crcs, bytes, size, out);
            }
        }

        private static void doBench(final java.util.List<java.lang.Class<? extends java.util.zip.Checksum>> crcs, final byte[] bytes, final int size, final java.io.PrintStream out) throws java.lang.Exception {
            final java.lang.String numBytesStr = " #Bytes ";
            final java.lang.String numThreadsStr = "#T";
            final java.lang.String diffStr = "% diff";
            out.print('|');
            org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(numBytesStr, 0, out);
            org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(numThreadsStr, 0, out);
            for (int i = 0; i < (crcs.size()); i++) {
                final java.lang.Class<? extends java.util.zip.Checksum> c = crcs.get(i);
                out.print('|');
                org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(c.getSimpleName(), 8, out);
                for (int j = 0; j < i; j++) {
                    org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(diffStr, diffStr.length(), out);
                }
            }
            out.printf("\n");
            for (int numThreads = 1; numThreads <= 16; numThreads <<= 1) {
                out.printf("|");
                org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(java.lang.String.valueOf(size), numBytesStr.length(), out);
                org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(java.lang.String.valueOf(numThreads), numThreadsStr.length(), out);
                org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult expected = null;
                final java.util.List<org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult> previous = new java.util.ArrayList<>();
                for (final java.lang.Class<? extends java.util.zip.Checksum> c : crcs) {
                    java.lang.System.gc();
                    final org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult result = org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.doBench(c, numThreads, bytes, size);
                    org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(java.lang.String.format("%9.1f", result.mbps), ((c.getSimpleName().length()) + 1), out);
                    // check result
                    if (c == (org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.zip)) {
                        expected = result;
                    }else
                        if (expected == null) {
                            throw new java.lang.RuntimeException(((("The first class is " + (c.getName())) + " but not ") + (org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.zip.getName())));
                        }else
                            if ((result.value) != (expected.value)) {
                                throw new java.lang.RuntimeException((c + " has bugs!"));
                            }


                    // compare result with previous
                    for (final org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult p : previous) {
                        final double diff = (((result.mbps) - (p.mbps)) / (p.mbps)) * 100;
                        org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(java.lang.String.format("%5.1f%%", diff), diffStr.length(), out);
                    }
                    previous.add(result);
                }
                out.printf("\n");
            }
        }

        private static org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult doBench(final java.lang.Class<? extends java.util.zip.Checksum> clazz, final int numThreads, final byte[] bytes, final int size) throws java.lang.Exception {
            final java.lang.Thread[] threads = new java.lang.Thread[numThreads];
            final org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult[] results = new org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult[threads.length];
            {
                final int trials = (org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BYTES_PER_SIZE) / size;
                final double mbProcessed = ((trials * size) / 1024.0) / 1024.0;
                final java.lang.reflect.Constructor<? extends java.util.zip.Checksum> ctor = clazz.getConstructor();
                for (int i = 0; i < (threads.length); i++) {
                    final int index = i;
                    threads[i] = new java.lang.Thread() {
                        final java.util.zip.Checksum crc = ctor.newInstance();

                        @java.lang.Override
                        public void run() {
                            final long st = java.lang.System.nanoTime();
                            crc.reset();
                            for (int trialIndex = 0; trialIndex < trials; trialIndex++) {
                                crc.update(bytes, 0, size);
                            }
                            final long et = java.lang.System.nanoTime();
                            final double secsElapsed = (et - st) / 1.0E9;
                            results[index] = new org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult(crc.getValue(), (mbProcessed / secsElapsed));
                        }
                    };
                }
            }
            for (final java.lang.Thread thread : threads) {
                thread.start();
            }
            for (final java.lang.Thread thread : threads) {
                thread.join();
            }
            final long expected = results[0].value;
            double sum = results[0].mbps;
            for (int i = 1; i < (results.length); i++) {
                if ((results[i].value) != expected) {
                    throw new java.lang.AssertionError(((clazz.getSimpleName()) + " results not matched."));
                }
                sum += results[i].mbps;
            }
            return new org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult(expected, (sum / (results.length)));
        }

        private static class BenchResult {
            /**
             * CRC value
             */
            final long value;

            /**
             * Speed (MB per second)
             */
            final double mbps;

            BenchResult(final long value, final double mbps) {
                this.value = value;
                this.mbps = mbps;
            }
        }

        private static void printSystemProperties(final java.io.PrintStream out) {
            final java.lang.String[] names = new java.lang.String[]{ "java.version", "java.runtime.name", "java.runtime.version", "java.vm.version", "java.vm.vendor", "java.vm.name", "java.vm.specification.version", "java.specification.version", "os.arch", "os.name", "os.version" };
            final java.util.Properties p = java.lang.System.getProperties();
            for (final java.lang.String n : names) {
                out.println(((n + " = ") + (p.getProperty(n))));
            }
        }
    }
}

