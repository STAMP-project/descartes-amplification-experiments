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
package org.apache.commons.codec;


/**
 * Test cases for the StingEncoderComparator.
 *
 * @version $Id$
 */
public class StringEncoderComparatorTest {
    @org.junit.Test
    public void testComparatorWithSoundex() throws java.lang.Exception {
        final org.apache.commons.codec.StringEncoderComparator sCompare = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.StringEncoderComparator>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithSoundex()|1", org.apache.commons.codec.StringEncoderComparator.class, new org.apache.commons.codec.StringEncoderComparator(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithSoundex()|0", org.apache.commons.codec.language.Soundex.class, new org.apache.commons.codec.language.Soundex())));
        org.junit.Assert.assertTrue(("O'Brien and O'Brian didn't come out with " + "the same Soundex, something must be wrong here"), (0 == (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithSoundex()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.StringEncoderComparator>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithSoundex()|2", org.apache.commons.codec.StringEncoderComparator.class, sCompare).compare("O'Brien", "O'Brian")))));
    }

    // cannot easily avoid this warning
    @java.lang.SuppressWarnings("unchecked")
    @org.junit.Test
    public void testComparatorWithDoubleMetaphone() throws java.lang.Exception {
        final org.apache.commons.codec.StringEncoderComparator sCompare = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.StringEncoderComparator>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|1", org.apache.commons.codec.StringEncoderComparator.class, new org.apache.commons.codec.StringEncoderComparator(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.DoubleMetaphone>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|0", org.apache.commons.codec.language.DoubleMetaphone.class, new org.apache.commons.codec.language.DoubleMetaphone())));
        final java.lang.String[] testArray = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|2", java.lang.String[].class, new java.lang.String[]{ "Jordan", "Sosa", "Prior", "Pryor" });
        final java.util.List<java.lang.String> testList = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|4", java.util.List.class, java.util.Arrays.asList(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|3", java.lang.String[].class, testArray)));
        final java.lang.String[] controlArray = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|5", java.lang.String[].class, new java.lang.String[]{ "Jordan", "Prior", "Pryor", "Sosa" });
        java.util.Collections.sort(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|6", java.util.List.class, testList), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.StringEncoderComparator>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|7", org.apache.commons.codec.StringEncoderComparator.class, sCompare));// unchecked

        final java.lang.String[] resultArray = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|10", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|8", java.util.List.class, testList).toArray(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|9", java.lang.String[].class, new java.lang.String[0])));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|11", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|12", java.lang.String[].class, resultArray).length)); i++) {
            org.junit.Assert.assertEquals(("Result Array not Equal to Control Array at index: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|14", i))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|15", java.lang.String[].class, controlArray)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|16", i)]), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|18", java.lang.String[].class, resultArray)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphone()|19", i)]));
        }
    }

    @org.junit.Test
    public void testComparatorWithDoubleMetaphoneAndInvalidInput() throws java.lang.Exception {
        final org.apache.commons.codec.StringEncoderComparator sCompare = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.StringEncoderComparator>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphoneAndInvalidInput()|1", org.apache.commons.codec.StringEncoderComparator.class, new org.apache.commons.codec.StringEncoderComparator(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.DoubleMetaphone>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphoneAndInvalidInput()|0", org.apache.commons.codec.language.DoubleMetaphone.class, new org.apache.commons.codec.language.DoubleMetaphone())));
        final int compare = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphoneAndInvalidInput()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.StringEncoderComparator>observeState("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphoneAndInvalidInput()|2", org.apache.commons.codec.StringEncoderComparator.class, sCompare).compare(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphoneAndInvalidInput()|3", new java.lang.Double(3.0)), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphoneAndInvalidInput()|4", java.lang.Long.valueOf(3))));
        org.junit.Assert.assertEquals("Trying to compare objects that make no sense to the underlying encoder should return a zero compare code", 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.StringEncoderComparatorTest|testComparatorWithDoubleMetaphoneAndInvalidInput()|6", compare));
    }
}

