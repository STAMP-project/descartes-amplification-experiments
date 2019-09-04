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
package org.apache.commons.codec.language;


/**
 * Tests RefinedSoundex.
 *
 * @version $Id$
 */
public class RefinedSoundexTest extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.RefinedSoundex> {
    @java.lang.Override
    protected org.apache.commons.codec.language.RefinedSoundex createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|createStringEncoder()|0", org.apache.commons.codec.language.RefinedSoundex.class, new org.apache.commons.codec.language.RefinedSoundex());
    }

    @org.junit.Test
    public void testDifference() throws org.apache.commons.codec.EncoderException {
        // Edge cases
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|0", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference(null, null)));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|2", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("", "")));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|4", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference(" ", " ")));
        // Normal cases
        org.junit.Assert.assertEquals(6, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|6", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Smith", "Smythe")));
        org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|8", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Ann", "Andrew")));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|10", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Margaret", "Andrew")));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|12", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Janet", "Margaret")));
        // Examples from
        // http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_de-dz_8co5.asp
        org.junit.Assert.assertEquals(5, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|14", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Green", "Greene")));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|16", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Blotchet-Halls", "Greene")));
        // Examples from
        // http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_setu-sus_3o6w.asp
        org.junit.Assert.assertEquals(6, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|18", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Smith", "Smythe")));
        org.junit.Assert.assertEquals(8, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|20", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Smithers", "Smythers")));
        org.junit.Assert.assertEquals(5, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testDifference()|22", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).difference("Anothers", "Brothers")));
    }

    @org.junit.Test
    public void testEncode() {
        org.junit.Assert.assertEquals("T6036084", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|0", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("testing")));
        org.junit.Assert.assertEquals("T6036084", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|2", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("TESTING")));
        org.junit.Assert.assertEquals("T60", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|4", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("The")));
        org.junit.Assert.assertEquals("Q503", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|6", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("quick")));
        org.junit.Assert.assertEquals("B1908", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|8", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("brown")));
        org.junit.Assert.assertEquals("F205", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|10", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("fox")));
        org.junit.Assert.assertEquals("J408106", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|12", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("jumped")));
        org.junit.Assert.assertEquals("O0209", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|14", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("over")));
        org.junit.Assert.assertEquals("T60", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|16", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("the")));
        org.junit.Assert.assertEquals("L7050", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|18", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("lazy")));
        org.junit.Assert.assertEquals("D6043", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|20", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).encode("dogs")));
        // Testing CODEC-56
        org.junit.Assert.assertEquals("D6043", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testEncode()|22", org.apache.commons.codec.language.RefinedSoundex.class, org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH).encode("dogs")));
    }

    @org.junit.Test
    public void testGetMappingCodeNonLetter() {
        final char code = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testGetMappingCodeNonLetter()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testGetMappingCodeNonLetter()|0", org.apache.commons.codec.language.RefinedSoundex.class, this.getStringEncoder()).getMappingCode('#'));
        org.junit.Assert.assertEquals("Code does not equals zero", 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testGetMappingCodeNonLetter()|2", code));
    }

    @org.junit.Test
    public void testNewInstance() {
        org.junit.Assert.assertEquals("D6043", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testNewInstance()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testNewInstance()|0", org.apache.commons.codec.language.RefinedSoundex.class, new org.apache.commons.codec.language.RefinedSoundex()).soundex("dogs")));
    }

    @org.junit.Test
    public void testNewInstance2() {
        org.junit.Assert.assertEquals("D6043", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testNewInstance2()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testNewInstance2()|1", org.apache.commons.codec.language.RefinedSoundex.class, new org.apache.commons.codec.language.RefinedSoundex(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testNewInstance2()|0", char[].class, org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING_STRING.toCharArray()))).soundex("dogs")));
    }

    @org.junit.Test
    public void testNewInstance3() {
        org.junit.Assert.assertEquals("D6043", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.RefinedSoundexTest|testNewInstance3()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.RefinedSoundex>observeState("org.apache.commons.codec.language.RefinedSoundexTest|testNewInstance3()|0", org.apache.commons.codec.language.RefinedSoundex.class, new org.apache.commons.codec.language.RefinedSoundex(org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING_STRING)).soundex("dogs")));
    }
}

