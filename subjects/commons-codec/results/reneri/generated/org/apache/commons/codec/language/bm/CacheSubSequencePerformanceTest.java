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
package org.apache.commons.codec.language.bm;


public class CacheSubSequencePerformanceTest {
    @org.junit.Test
    public void test() {
        final int times = 10000000;
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|0", java.io.PrintStream.class, java.lang.System.out).print("Test with String : ");
        test("Angelo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|1", times));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|2", java.io.PrintStream.class, java.lang.System.out).print("Test with StringBuilder : ");
        test(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|3", java.lang.StringBuilder.class, new java.lang.StringBuilder("Angelo")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|4", times));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|5", java.io.PrintStream.class, java.lang.System.out).print("Test with cached String : ");
        test(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|6", java.lang.CharSequence.class, cacheSubSequence("Angelo")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|7", times));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|8", java.io.PrintStream.class, java.lang.System.out).print("Test with cached StringBuilder : ");
        test(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|10", java.lang.CharSequence.class, cacheSubSequence(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|9", java.lang.StringBuilder.class, new java.lang.StringBuilder("Angelo")))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test()|11", times));
    }

    private void test(final java.lang.CharSequence input, final int times) {
        final long beginTime = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence,int)|0", java.lang.System.currentTimeMillis());
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence,int)|1", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence,int)|2", times)); i++) {
            test(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence,int)|3", java.lang.CharSequence.class, input));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence,int)|4", java.io.PrintStream.class, java.lang.System.out).println((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence,int)|5", java.lang.System.currentTimeMillis())) - (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence,int)|6", beginTime))) + " millis"));
    }

    private void test(final java.lang.CharSequence input) {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|0", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|2", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|1", java.lang.CharSequence.class, input).length())); i++) {
            for (int j = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|3", i); (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|4", j)) <= (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|5", java.lang.CharSequence.class, input).length())); j++) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|10", java.lang.CharSequence.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|7", java.lang.CharSequence.class, input).subSequence(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|8", i), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|test(java.lang.CharSequence)|9", j)));
            }
        }
    }

    private java.lang.CharSequence cacheSubSequence(final java.lang.CharSequence cached) {
        final java.lang.CharSequence[][] cache = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence[][]>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|4", java.lang.CharSequence[][].class, new java.lang.CharSequence[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|0", java.lang.CharSequence.class, cached).length())][eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|2", java.lang.CharSequence.class, cached).length())]);
        return new java.lang.CharSequence() {
            @java.lang.Override
            public char charAt(final int index) {
                return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|6", java.lang.CharSequence.class, cached).charAt(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|7", index)));
            }

            @java.lang.Override
            public int length() {
                return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|9", java.lang.CharSequence.class, cached).length());
            }

            @java.lang.Override
            public java.lang.CharSequence subSequence(final int start, final int end) {
                if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|11", start)) == (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|12", end))) {
                    return "";
                }
                java.lang.CharSequence res = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|17", java.lang.CharSequence.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence[]>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|15", java.lang.CharSequence[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence[][]>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|13", java.lang.CharSequence[][].class, cache)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|14", start)])[((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|16", end)) - 1)]);
                if ((eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|18", java.lang.CharSequence.class, res)) == null) {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|22", java.lang.CharSequence.class, (res = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|19", java.lang.CharSequence.class, cached).subSequence(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|20", start), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|21", end))));
                    eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|27", java.lang.CharSequence.class, (eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence[]>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|25", java.lang.CharSequence[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence[][]>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|23", java.lang.CharSequence[][].class, cache)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|24", start)])[((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|26", end)) - 1)] = res));
                }
                return eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.CacheSubSequencePerformanceTest|cacheSubSequence(java.lang.CharSequence)|28", java.lang.CharSequence.class, res);
            }
        };
    }
}

