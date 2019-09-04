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
 * Tests {@link DaitchMokotoffSoundex}.
 * <p>
 * Keep this file in UTF-8 encoding for proper Javadoc processing.
 * </p>
 *
 * @since 1.10
 */
public class DaitchMokotoffSoundexTest extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.DaitchMokotoffSoundex> {
    @java.lang.Override
    protected org.apache.commons.codec.language.DaitchMokotoffSoundex createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.DaitchMokotoffSoundex>observeState("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|createStringEncoder()|0", org.apache.commons.codec.language.DaitchMokotoffSoundex.class, new org.apache.commons.codec.language.DaitchMokotoffSoundex());
    }

    private java.lang.String soundex(final java.lang.String source) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|soundex(java.lang.String)|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.DaitchMokotoffSoundex>observeState("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|soundex(java.lang.String)|0", org.apache.commons.codec.language.DaitchMokotoffSoundex.class, getStringEncoder()).soundex(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|soundex(java.lang.String)|1", source)));
    }

    private java.lang.String encode(final java.lang.String source) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|encode(java.lang.String)|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.DaitchMokotoffSoundex>observeState("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|encode(java.lang.String)|0", org.apache.commons.codec.language.DaitchMokotoffSoundex.class, getStringEncoder()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|encode(java.lang.String)|1", source)));
    }

    @org.junit.Test
    public void testAccentedCharacterFolding() {
        org.junit.Assert.assertEquals("294795", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testAccentedCharacterFolding()|0", soundex("Straßburg")));
        org.junit.Assert.assertEquals("294795", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testAccentedCharacterFolding()|1", soundex("Strasburg")));
        org.junit.Assert.assertEquals("095600", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testAccentedCharacterFolding()|2", soundex("Éregon")));
        org.junit.Assert.assertEquals("095600", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testAccentedCharacterFolding()|3", soundex("Eregon")));
    }

    @org.junit.Test
    public void testAdjacentCodes() {
        // AKSSOL
        // A-KS-S-O-L
        // 0-54-4---8 -> wrong
        // 0-54-----8 -> correct
        org.junit.Assert.assertEquals("054800", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testAdjacentCodes()|0", soundex("AKSSOL")));
        // GERSCHFELD
        // G-E-RS-CH-F-E-L-D
        // 5--4/94-5/4-7-8-3 -> wrong
        // 5--4/94-5/--7-8-3 -> correct
        org.junit.Assert.assertEquals("547830|545783|594783|594578", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testAdjacentCodes()|1", soundex("GERSCHFELD")));
    }

    public void testEncodeBasic() {
        // same as above, but without branching
        org.junit.Assert.assertEquals("097400", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeBasic()|0", encode("AUERBACH")));
        org.junit.Assert.assertEquals("097400", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeBasic()|1", encode("OHRBACH")));
        org.junit.Assert.assertEquals("874400", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeBasic()|2", encode("LIPSHITZ")));
        org.junit.Assert.assertEquals("874400", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeBasic()|3", encode("LIPPSZYC")));
        org.junit.Assert.assertEquals("876450", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeBasic()|4", encode("LEWINSKY")));
        org.junit.Assert.assertEquals("876450", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeBasic()|5", encode("LEVINSKI")));
        org.junit.Assert.assertEquals("486740", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeBasic()|6", encode("SZLAMAWICZ")));
        org.junit.Assert.assertEquals("486740", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeBasic()|7", encode("SHLAMOVITZ")));
    }

    @org.junit.Test
    public void testEncodeIgnoreApostrophes() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("079600", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeIgnoreApostrophes()|0", java.lang.String[].class, new java.lang.String[]{ "OBrien", "'OBrien", "O'Brien", "OB'rien", "OBr'ien", "OBri'en", "OBrie'n", "OBrien'" }));
    }

    /**
     * Test data from http://www.myatt.demon.co.uk/sxalg.htm
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testEncodeIgnoreHyphens() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("565463", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeIgnoreHyphens()|0", java.lang.String[].class, new java.lang.String[]{ "KINGSMITH", "-KINGSMITH", "K-INGSMITH", "KI-NGSMITH", "KIN-GSMITH", "KING-SMITH", "KINGS-MITH", "KINGSM-ITH", "KINGSMI-TH", "KINGSMIT-H", "KINGSMITH-" }));
    }

    @org.junit.Test
    public void testEncodeIgnoreTrimmable() {
        org.junit.Assert.assertEquals("746536", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeIgnoreTrimmable()|0", encode(" \t\n\r Washington \t\n\r ")));
        org.junit.Assert.assertEquals("746536", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testEncodeIgnoreTrimmable()|1", encode("Washington")));
    }

    /**
     * Examples from http://www.jewishgen.org/infofiles/soundex.html
     */
    @org.junit.Test
    public void testSoundexBasic() {
        org.junit.Assert.assertEquals("583600", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|0", soundex("GOLDEN")));
        org.junit.Assert.assertEquals("087930", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|1", soundex("Alpert")));
        org.junit.Assert.assertEquals("791900", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|2", soundex("Breuer")));
        org.junit.Assert.assertEquals("579000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|3", soundex("Haber")));
        org.junit.Assert.assertEquals("665600", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|4", soundex("Mannheim")));
        org.junit.Assert.assertEquals("664000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|5", soundex("Mintz")));
        org.junit.Assert.assertEquals("370000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|6", soundex("Topf")));
        org.junit.Assert.assertEquals("586660", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|7", soundex("Kleinmann")));
        org.junit.Assert.assertEquals("769600", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|8", soundex("Ben Aron")));
        org.junit.Assert.assertEquals("097400|097500", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|9", soundex("AUERBACH")));
        org.junit.Assert.assertEquals("097400|097500", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|10", soundex("OHRBACH")));
        org.junit.Assert.assertEquals("874400", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|11", soundex("LIPSHITZ")));
        org.junit.Assert.assertEquals("874400|874500", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|12", soundex("LIPPSZYC")));
        org.junit.Assert.assertEquals("876450", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|13", soundex("LEWINSKY")));
        org.junit.Assert.assertEquals("876450", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|14", soundex("LEVINSKI")));
        org.junit.Assert.assertEquals("486740", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|15", soundex("SZLAMAWICZ")));
        org.junit.Assert.assertEquals("486740", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic()|16", soundex("SHLAMOVITZ")));
    }

    /**
     * Examples from http://www.avotaynu.com/soundex.htm
     */
    @org.junit.Test
    public void testSoundexBasic2() {
        org.junit.Assert.assertEquals("467000|567000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic2()|0", soundex("Ceniow")));
        org.junit.Assert.assertEquals("467000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic2()|1", soundex("Tsenyuv")));
        org.junit.Assert.assertEquals("587400|587500", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic2()|2", soundex("Holubica")));
        org.junit.Assert.assertEquals("587400", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic2()|3", soundex("Golubitsa")));
        org.junit.Assert.assertEquals("746480|794648", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic2()|4", soundex("Przemysl")));
        org.junit.Assert.assertEquals("746480", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic2()|5", soundex("Pshemeshil")));
        org.junit.Assert.assertEquals("944744|944745|944754|944755|945744|945745|945754|945755", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic2()|6", soundex("Rosochowaciec")));
        org.junit.Assert.assertEquals("945744", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic2()|7", soundex("Rosokhovatsets")));
    }

    /**
     * Examples from http://en.wikipedia.org/wiki/Daitch%E2%80%93Mokotoff_Soundex
     */
    @org.junit.Test
    public void testSoundexBasic3() {
        org.junit.Assert.assertEquals("734000|739400", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic3()|0", soundex("Peters")));
        org.junit.Assert.assertEquals("734600|739460", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic3()|1", soundex("Peterson")));
        org.junit.Assert.assertEquals("645740", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic3()|2", soundex("Moskowitz")));
        org.junit.Assert.assertEquals("645740", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic3()|3", soundex("Moskovitz")));
        org.junit.Assert.assertEquals("154600|145460|454600|445460", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic3()|4", soundex("Jackson")));
        org.junit.Assert.assertEquals("154654|154645|154644|145465|145464|454654|454645|454644|445465|445464", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSoundexBasic3()|5", soundex("Jackson-Jackson")));
    }

    @org.junit.Test
    public void testSpecialRomanianCharacters() {
        org.junit.Assert.assertEquals("364000|464000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSpecialRomanianCharacters()|0", soundex("ţamas")));// t-cedilla

        org.junit.Assert.assertEquals("364000|464000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.DaitchMokotoffSoundexTest|testSpecialRomanianCharacters()|1", soundex("țamas")));// t-comma

    }
}

