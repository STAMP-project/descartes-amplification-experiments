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
/**
 * (FYI: Formatted and sorted with Eclipse)
 */
package org.apache.commons.codec.language;


/**
 * Tests {@link Soundex}.
 *
 * <p>Keep this file in UTF-8 encoding for proper Javadoc processing.</p>
 *
 * @version $Id$
 */
public class SoundexTest extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.Soundex> {
    @java.lang.Override
    protected org.apache.commons.codec.language.Soundex createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|createStringEncoder()|0", org.apache.commons.codec.language.Soundex.class, new org.apache.commons.codec.language.Soundex());
    }

    @org.junit.Test
    public void testB650() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("B650", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.SoundexTest|testB650()|0", java.lang.String[].class, new java.lang.String[]{ "BARHAM", "BARONE", "BARRON", "BERNA", "BIRNEY", "BIRNIE", "BOOROM", "BOREN", "BORN", "BOURN", "BOURNE", "BOWRON", "BRAIN", "BRAME", "BRANN", "BRAUN", "BREEN", "BRIEN", "BRIM", "BRIMM", "BRINN", "BRION", "BROOM", "BROOME", "BROWN", "BROWNE", "BRUEN", "BRUHN", "BRUIN", "BRUMM", "BRUN", "BRUNO", "BRYAN", "BURIAN", "BURN", "BURNEY", "BYRAM", "BYRNE", "BYRON", "BYRUM" }));
    }

    @org.junit.Test
    public void testBadCharacters() {
        org.junit.Assert.assertEquals("H452", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testBadCharacters()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testBadCharacters()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("HOL>MES")));
    }

    @org.junit.Test
    public void testDifference() throws org.apache.commons.codec.EncoderException {
        // Edge cases
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference(null, null)));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("", "")));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|4", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference(" ", " ")));
        // Normal cases
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|6", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Smith", "Smythe")));
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|8", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Ann", "Andrew")));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|10", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Margaret", "Andrew")));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|12", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Janet", "Margaret")));
        // Examples from http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_de-dz_8co5.asp
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|14", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Green", "Greene")));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|16", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Blotchet-Halls", "Greene")));
        // Examples from http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_setu-sus_3o6w.asp
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|18", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Smith", "Smythe")));
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|20", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Smithers", "Smythers")));
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testDifference()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testDifference()|22", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).difference("Anothers", "Brothers")));
    }

    @org.junit.Test
    public void testEncodeBasic() {
        org.junit.Assert.assertEquals("T235", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("testing")));
        org.junit.Assert.assertEquals("T000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("The")));
        org.junit.Assert.assertEquals("Q200", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|4", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("quick")));
        org.junit.Assert.assertEquals("B650", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|6", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("brown")));
        org.junit.Assert.assertEquals("F200", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|8", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("fox")));
        org.junit.Assert.assertEquals("J513", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|10", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("jumped")));
        org.junit.Assert.assertEquals("O160", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|12", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("over")));
        org.junit.Assert.assertEquals("T000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|14", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("the")));
        org.junit.Assert.assertEquals("L200", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|16", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("lazy")));
        org.junit.Assert.assertEquals("D200", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBasic()|18", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("dogs")));
    }

    /**
     * Examples from http://www.bradandkathy.com/genealogy/overviewofsoundex.html
     */
    @org.junit.Test
    public void testEncodeBatch2() {
        org.junit.Assert.assertEquals("A462", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Allricht")));
        org.junit.Assert.assertEquals("E166", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Eberhard")));
        org.junit.Assert.assertEquals("E521", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|4", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Engebrethson")));
        org.junit.Assert.assertEquals("H512", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|6", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Heimbach")));
        org.junit.Assert.assertEquals("H524", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|8", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Hanselmann")));
        org.junit.Assert.assertEquals("H431", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|10", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Hildebrand")));
        org.junit.Assert.assertEquals("K152", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|12", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Kavanagh")));
        org.junit.Assert.assertEquals("L530", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|14", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Lind")));
        org.junit.Assert.assertEquals("L222", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|16", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Lukaschowsky")));
        org.junit.Assert.assertEquals("M235", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|18", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("McDonnell")));
        org.junit.Assert.assertEquals("M200", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|20", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("McGee")));
        org.junit.Assert.assertEquals("O155", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|22", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Opnian")));
        org.junit.Assert.assertEquals("O155", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|24", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Oppenheimer")));
        org.junit.Assert.assertEquals("R355", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|27", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|26", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Riedemanas")));
        org.junit.Assert.assertEquals("Z300", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|29", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|28", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Zita")));
        org.junit.Assert.assertEquals("Z325", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|31", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch2()|30", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Zitzmeinn")));
    }

    /**
     * Examples from http://www.archives.gov/research_room/genealogy/census/soundex.html
     */
    @org.junit.Test
    public void testEncodeBatch3() {
        org.junit.Assert.assertEquals("W252", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Washington")));
        org.junit.Assert.assertEquals("L000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Lee")));
        org.junit.Assert.assertEquals("G362", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|4", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Gutierrez")));
        org.junit.Assert.assertEquals("P236", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|6", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Pfister")));
        org.junit.Assert.assertEquals("J250", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|8", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Jackson")));
        org.junit.Assert.assertEquals("T522", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|10", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Tymczak")));
        // For VanDeusen: D-250 (D, 2 for the S, 5 for the N, 0 added) is also
        // possible.
        org.junit.Assert.assertEquals("V532", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch3()|12", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("VanDeusen")));
    }

    /**
     * Examples from: http://www.myatt.demon.co.uk/sxalg.htm
     */
    @org.junit.Test
    public void testEncodeBatch4() {
        org.junit.Assert.assertEquals("H452", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("HOLMES")));
        org.junit.Assert.assertEquals("A355", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("ADOMOMI")));
        org.junit.Assert.assertEquals("V536", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|4", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("VONDERLEHR")));
        org.junit.Assert.assertEquals("B400", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|6", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("BALL")));
        org.junit.Assert.assertEquals("S000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|8", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("SHAW")));
        org.junit.Assert.assertEquals("J250", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|10", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("JACKSON")));
        org.junit.Assert.assertEquals("S545", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|12", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("SCANLON")));
        org.junit.Assert.assertEquals("S532", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeBatch4()|14", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("SAINTJOHN")));
    }

    @org.junit.Test
    public void testEncodeIgnoreApostrophes() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("O165", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeIgnoreApostrophes()|0", java.lang.String[].class, new java.lang.String[]{ "OBrien", "'OBrien", "O'Brien", "OB'rien", "OBr'ien", "OBri'en", "OBrie'n", "OBrien'" }));
    }

    /**
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testEncodeIgnoreHyphens() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("K525", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeIgnoreHyphens()|0", java.lang.String[].class, new java.lang.String[]{ "KINGSMITH", "-KINGSMITH", "K-INGSMITH", "KI-NGSMITH", "KIN-GSMITH", "KING-SMITH", "KINGS-MITH", "KINGSM-ITH", "KINGSMI-TH", "KINGSMIT-H", "KINGSMITH-" }));
    }

    @org.junit.Test
    public void testEncodeIgnoreTrimmable() {
        org.junit.Assert.assertEquals("W252", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testEncodeIgnoreTrimmable()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testEncodeIgnoreTrimmable()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode(" \t\n\r Washington \t\n\r ")));
    }

    /**
     * Consonants from the same code group separated by W or H are treated as one.
     */
    @org.junit.Test
    public void testHWRuleEx1() {
        // From
        // http://www.archives.gov/research_room/genealogy/census/soundex.html:
        // Ashcraft is coded A-261 (A, 2 for the S, C ignored, 6 for the R, 1
        // for the F). It is not coded A-226.
        org.junit.Assert.assertEquals("A261", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testHWRuleEx1()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx1()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Ashcraft")));
        org.junit.Assert.assertEquals("A261", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testHWRuleEx1()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx1()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Ashcroft")));
        org.junit.Assert.assertEquals("Y330", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testHWRuleEx1()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx1()|4", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("yehudit")));
        org.junit.Assert.assertEquals("Y330", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testHWRuleEx1()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx1()|6", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("yhwdyt")));
    }

    /**
     * Consonants from the same code group separated by W or H are treated as one.
     *
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     */
    @org.junit.Test
    public void testHWRuleEx2() {
        org.junit.Assert.assertEquals("B312", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testHWRuleEx2()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx2()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("BOOTHDAVIS")));
        org.junit.Assert.assertEquals("B312", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testHWRuleEx2()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx2()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("BOOTH-DAVIS")));
    }

    /**
     * Consonants from the same code group separated by W or H are treated as one.
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testHWRuleEx3() throws org.apache.commons.codec.EncoderException {
        org.junit.Assert.assertEquals("S460", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testHWRuleEx3()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx3()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Sgler")));
        org.junit.Assert.assertEquals("S460", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testHWRuleEx3()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx3()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Swhgler")));
        // Also S460:
        this.checkEncodingVariations("S460", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.SoundexTest|testHWRuleEx3()|4", java.lang.String[].class, new java.lang.String[]{ "SAILOR", "SALYER", "SAYLOR", "SCHALLER", "SCHELLER", "SCHILLER", "SCHOOLER", "SCHULER", "SCHUYLER", "SEILER", "SEYLER", "SHOLAR", "SHULER", "SILAR", "SILER", "SILLER" }));
    }

    /**
     * Examples for MS SQLServer from
     * http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_setu-sus_3o6w.asp
     */
    @org.junit.Test
    public void testMsSqlServer1() {
        org.junit.Assert.assertEquals("S530", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer1()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer1()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Smith")));
        org.junit.Assert.assertEquals("S530", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer1()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer1()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Smythe")));
    }

    /**
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support
     * /kb/articles/Q100/3/65.asp&NoWebContent=1
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testMsSqlServer2() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("E625", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer2()|0", java.lang.String[].class, new java.lang.String[]{ "Erickson", "Erickson", "Erikson", "Ericson", "Ericksen", "Ericsen" }));
    }

    /**
     * Examples for MS SQLServer from http://databases.about.com/library/weekly/aa042901a.htm
     */
    @org.junit.Test
    public void testMsSqlServer3() {
        org.junit.Assert.assertEquals("A500", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Ann")));
        org.junit.Assert.assertEquals("A536", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Andrew")));
        org.junit.Assert.assertEquals("J530", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|4", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Janet")));
        org.junit.Assert.assertEquals("M626", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|6", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Margaret")));
        org.junit.Assert.assertEquals("S315", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|8", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Steven")));
        org.junit.Assert.assertEquals("M240", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|10", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Michael")));
        org.junit.Assert.assertEquals("R163", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|12", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Robert")));
        org.junit.Assert.assertEquals("L600", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|14", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Laura")));
        org.junit.Assert.assertEquals("A500", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testMsSqlServer3()|16", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Anne")));
    }

    /**
     * https://issues.apache.org/jira/browse/CODEC-54 https://issues.apache.org/jira/browse/CODEC-56
     */
    @org.junit.Test
    public void testNewInstance() {
        org.junit.Assert.assertEquals("W452", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testNewInstance()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testNewInstance()|0", org.apache.commons.codec.language.Soundex.class, new org.apache.commons.codec.language.Soundex()).soundex("Williams")));
    }

    @org.junit.Test
    public void testNewInstance2() {
        org.junit.Assert.assertEquals("W452", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testNewInstance2()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testNewInstance2()|1", org.apache.commons.codec.language.Soundex.class, new org.apache.commons.codec.language.Soundex(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.language.SoundexTest|testNewInstance2()|0", char[].class, org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING_STRING.toCharArray()))).soundex("Williams")));
    }

    @org.junit.Test
    public void testNewInstance3() {
        org.junit.Assert.assertEquals("W452", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testNewInstance3()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testNewInstance3()|0", org.apache.commons.codec.language.Soundex.class, new org.apache.commons.codec.language.Soundex(org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING_STRING)).soundex("Williams")));
    }

    @org.junit.Test
    public void testSoundexUtilsConstructable() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.SoundexUtils>observeState("org.apache.commons.codec.language.SoundexTest|testSoundexUtilsConstructable()|0", org.apache.commons.codec.language.SoundexUtils.class, new org.apache.commons.codec.language.SoundexUtils());
    }

    @org.junit.Test
    public void testSoundexUtilsNullBehaviour() {
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSoundexUtilsNullBehaviour()|0", org.apache.commons.codec.language.SoundexUtils.clean(null)));
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSoundexUtilsNullBehaviour()|1", org.apache.commons.codec.language.SoundexUtils.clean("")));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSoundexUtilsNullBehaviour()|2", org.apache.commons.codec.language.SoundexUtils.differenceEncoded(null, "")));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSoundexUtilsNullBehaviour()|3", org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", null)));
    }

    /**
     * https://issues.apache.org/jira/browse/CODEC-54 https://issues.apache.org/jira/browse/CODEC-56
     */
    @org.junit.Test
    public void testUsEnglishStatic() {
        org.junit.Assert.assertEquals("W452", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsEnglishStatic()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testUsEnglishStatic()|0", org.apache.commons.codec.language.Soundex.class, org.apache.commons.codec.language.Soundex.US_ENGLISH).soundex("Williams")));
    }

    /**
     * Fancy characters are not mapped by the default US mapping.
     *
     * https://issues.apache.org/jira/browse/CODEC-30
     */
    @org.junit.Test
    public void testUsMappingEWithAcute() {
        org.junit.Assert.assertEquals("E000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsMappingEWithAcute()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testUsMappingEWithAcute()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("e")));
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsMappingEWithAcute()|2", java.lang.Character.isLetter('\u00e9'))) {
            // e-acute
            try {
                // uppercase E-acute
                org.junit.Assert.assertEquals("\u00c9000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsMappingEWithAcute()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testUsMappingEWithAcute()|3", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("\u00e9")));
                org.junit.Assert.fail("Expected IllegalArgumentException not thrown");
            } catch (final java.lang.IllegalArgumentException e) {
                // expected
            }
        }else {
            org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsMappingEWithAcute()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testUsMappingEWithAcute()|5", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("\u00e9")));
        }
    }

    /**
     * Fancy characters are not mapped by the default US mapping.
     *
     * https://issues.apache.org/jira/browse/CODEC-30
     */
    @org.junit.Test
    public void testUsMappingOWithDiaeresis() {
        org.junit.Assert.assertEquals("O000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsMappingOWithDiaeresis()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testUsMappingOWithDiaeresis()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("o")));
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsMappingOWithDiaeresis()|2", java.lang.Character.isLetter('\u00f6'))) {
            // o-umlaut
            try {
                // uppercase O-umlaut
                org.junit.Assert.assertEquals("\u00d6000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsMappingOWithDiaeresis()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testUsMappingOWithDiaeresis()|3", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("\u00f6")));
                org.junit.Assert.fail("Expected IllegalArgumentException not thrown");
            } catch (final java.lang.IllegalArgumentException e) {
                // expected
            }
        }else {
            org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testUsMappingOWithDiaeresis()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testUsMappingOWithDiaeresis()|5", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("\u00f6")));
        }
    }

    /**
     * Tests example from http://en.wikipedia.org/wiki/Soundex#American_Soundex as of 2015-03-22.
     */
    @org.junit.Test
    public void testWikipediaAmericanSoundex() {
        org.junit.Assert.assertEquals("R163", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|0", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Robert")));
        org.junit.Assert.assertEquals("R163", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|2", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Rupert")));
        org.junit.Assert.assertEquals("A261", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|4", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Ashcraft")));
        org.junit.Assert.assertEquals("A261", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|6", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Ashcroft")));
        org.junit.Assert.assertEquals("T522", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|8", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Tymczak")));
        org.junit.Assert.assertEquals("P236", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testWikipediaAmericanSoundex()|10", org.apache.commons.codec.language.Soundex.class, this.getStringEncoder()).encode("Pfister")));
    }

    // examples and algorithm rules from:  http://www.genealogy.com/articles/research/00000060.html
    @org.junit.Test
    public void testGenealogy() {
        // treat vowels and HW as silent
        final org.apache.commons.codec.language.Soundex s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testGenealogy()|0", org.apache.commons.codec.language.Soundex.class, org.apache.commons.codec.language.Soundex.US_ENGLISH_GENEALOGY);
        org.junit.Assert.assertEquals("H251", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testGenealogy()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testGenealogy()|1", org.apache.commons.codec.language.Soundex.class, s).encode("Heggenburger")));
        org.junit.Assert.assertEquals("B425", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testGenealogy()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testGenealogy()|3", org.apache.commons.codec.language.Soundex.class, s).encode("Blackman")));
        org.junit.Assert.assertEquals("S530", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testGenealogy()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testGenealogy()|5", org.apache.commons.codec.language.Soundex.class, s).encode("Schmidt")));
        org.junit.Assert.assertEquals("L150", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testGenealogy()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testGenealogy()|7", org.apache.commons.codec.language.Soundex.class, s).encode("Lippmann")));
        // Additional local example
        org.junit.Assert.assertEquals("D200", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testGenealogy()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testGenealogy()|9", org.apache.commons.codec.language.Soundex.class, s).encode("Dodds")));// 'o' is not a separator here - it is silent

        org.junit.Assert.assertEquals("D200", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testGenealogy()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testGenealogy()|11", org.apache.commons.codec.language.Soundex.class, s).encode("Dhdds")));// 'h' is silent

        org.junit.Assert.assertEquals("D200", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testGenealogy()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testGenealogy()|13", org.apache.commons.codec.language.Soundex.class, s).encode("Dwdds")));// 'w' is silent

    }

    // examples and algorithm rules from:  http://west-penwith.org.uk/misc/soundex.htm
    @org.junit.Test
    public void testSimplifiedSoundex() {
        // treat vowels and HW as separators
        final org.apache.commons.codec.language.Soundex s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|0", org.apache.commons.codec.language.Soundex.class, org.apache.commons.codec.language.Soundex.US_ENGLISH_SIMPLIFIED);
        org.junit.Assert.assertEquals("W452", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|1", org.apache.commons.codec.language.Soundex.class, s).encode("WILLIAMS")));
        org.junit.Assert.assertEquals("B625", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|3", org.apache.commons.codec.language.Soundex.class, s).encode("BARAGWANATH")));
        org.junit.Assert.assertEquals("D540", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|5", org.apache.commons.codec.language.Soundex.class, s).encode("DONNELL")));
        org.junit.Assert.assertEquals("L300", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|7", org.apache.commons.codec.language.Soundex.class, s).encode("LLOYD")));
        org.junit.Assert.assertEquals("W422", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|9", org.apache.commons.codec.language.Soundex.class, s).encode("WOOLCOCK")));
        // Additional local examples
        org.junit.Assert.assertEquals("D320", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|11", org.apache.commons.codec.language.Soundex.class, s).encode("Dodds")));
        org.junit.Assert.assertEquals("D320", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|13", org.apache.commons.codec.language.Soundex.class, s).encode("Dwdds")));// w is a separator

        org.junit.Assert.assertEquals("D320", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Soundex>observeState("org.apache.commons.codec.language.SoundexTest|testSimplifiedSoundex()|15", org.apache.commons.codec.language.Soundex.class, s).encode("Dhdds")));// h is a separator

    }
}

