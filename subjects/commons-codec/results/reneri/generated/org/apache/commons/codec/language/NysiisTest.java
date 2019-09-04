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
 * Tests {@link Nysiis}
 *
 * @since 1.7
 * @version $Id$
 */
public class NysiisTest extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.Nysiis> {
    private final org.apache.commons.codec.language.Nysiis fullNysiis = new org.apache.commons.codec.language.Nysiis(false);

    /**
     * Takes an array of String pairs where each pair's first element is the input and the second element the expected
     * encoding.
     *
     * @param testValues
     * 		an array of String pairs where each pair's first element is the input and the second element the
     * 		expected encoding.
     * @throws EncoderException
     * 		
     */
    private void assertEncodings(final java.lang.String[]... testValues) throws org.apache.commons.codec.EncoderException {
        for (final java.lang.String[] arr : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|0", java.lang.String[][].class, testValues)) {
            org.junit.Assert.assertEquals(("Problem with " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|2", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|1", java.lang.String[].class, arr)[0]))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|3", java.lang.String[].class, arr)[1]), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Nysiis>observeState("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|5", org.apache.commons.codec.language.Nysiis.class, this.fullNysiis).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|assertEncodings(java.lang.String[][])|6", java.lang.String[].class, arr)[0]))));
        }
    }

    @java.lang.Override
    protected org.apache.commons.codec.language.Nysiis createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Nysiis>observeState("org.apache.commons.codec.language.NysiisTest|createStringEncoder()|0", org.apache.commons.codec.language.Nysiis.class, new org.apache.commons.codec.language.Nysiis());
    }

    private void encodeAll(final java.lang.String[] strings, final java.lang.String expectedEncoding) {
        for (final java.lang.String string : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|encodeAll(java.lang.String[],java.lang.String)|0", java.lang.String[].class, strings)) {
            org.junit.Assert.assertEquals(("Problem with " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|encodeAll(java.lang.String[],java.lang.String)|1", string))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|encodeAll(java.lang.String[],java.lang.String)|2", expectedEncoding), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|encodeAll(java.lang.String[],java.lang.String)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Nysiis>observeState("org.apache.commons.codec.language.NysiisTest|encodeAll(java.lang.String[],java.lang.String)|3", org.apache.commons.codec.language.Nysiis.class, getStringEncoder()).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|encodeAll(java.lang.String[],java.lang.String)|4", string))));
        }
    }

    @org.junit.Test
    public void testBran() {
        encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testBran()|0", java.lang.String[].class, new java.lang.String[]{ "Brian", "Brown", "Brun" }), "BRAN");
    }

    @org.junit.Test
    public void testCap() {
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testCap()|0", java.lang.String[].class, new java.lang.String[]{ "Capp", "Cope", "Copp", "Kipp" }), "CAP");
    }

    @org.junit.Test
    public void testDad() {
        // Data Quality and Record Linkage Techniques P.121 claims this is DAN,
        // but it should be DAD, verified also with dropby.com
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDad()|0", java.lang.String[].class, new java.lang.String[]{ "Dent" }), "DAD");
    }

    @org.junit.Test
    public void testDan() {
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDan()|0", java.lang.String[].class, new java.lang.String[]{ "Dane", "Dean", "Dionne" }), "DAN");
    }

    /**
     * Tests data gathered from around the internet.
     *
     * @see <a href="http://www.dropby.com/NYSIISTextStrings.html">http://www.dropby.com/NYSIISTextStrings.html</a>
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testDropBy() throws org.apache.commons.codec.EncoderException {
        // Explanation of differences between this implementation and the one at dropby.com is
        // prepended to the test string. The referenced rules refer to the outlined steps the
        // class description for Nysiis.
        // 1. Transcode first characters of name
        // violates 4j: the second N should not be added, as the first
        // key char is already a N
        // Original: NNAT; modified: NATH
        // O and E are transcoded to A because of rule 4a
        // H also to A because of rule 4h
        // the N gets mysteriously lost, maybe because of a wrongly implemented rule 4h
        // that skips the next char in such a case?
        // the remaining A is removed because of rule 7
        // Original: C
        // violates 4j: see also KNUTH
        // Original: FFALAP[SAN]
        // violates 4j: see also KNUTH
        // Original: FFASTA[R]
        // violates 4j: see also KNUTH
        // Original: SSANAF[T]
        // 2. Transcode last characters of name:
        // 4. Transcode remaining characters by following these rules,
        // incrementing by one character each time:
        // violates 5: the last S is not removed
        // when comparing to DEUTS, which is phonetically similar
        // the result it also DAT, which is correct for DEUTSCH too imo
        // Original: DATS
        // violates 4h: the H should be transcoded to S and thus ignored as
        // the first key character is also S
        // Original: SHRAVA[R]
        // same as KOEHN, the L gets mysteriously lost
        // Original: C
        // If last character is S, remove it
        // violates 6: if the last two characters are AY, remove A
        // Original: CARAY
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|0", java.lang.String[].class, new java.lang.String[]{ "MACINTOSH", "MCANT" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|1", java.lang.String[].class, new java.lang.String[]{ "KNUTH", "NAT" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|2", java.lang.String[].class, new java.lang.String[]{ "KOEHN", "CAN" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|3", java.lang.String[].class, new java.lang.String[]{ "PHILLIPSON", "FALAPSAN" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|4", java.lang.String[].class, new java.lang.String[]{ "PFEISTER", "FASTAR" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|5", java.lang.String[].class, new java.lang.String[]{ "SCHOENHOEFT", "SANAFT" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|6", java.lang.String[].class, new java.lang.String[]{ "MCKEE", "MCY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|7", java.lang.String[].class, new java.lang.String[]{ "MACKIE", "MCY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|8", java.lang.String[].class, new java.lang.String[]{ "HEITSCHMIDT", "HATSNAD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|9", java.lang.String[].class, new java.lang.String[]{ "BART", "BAD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|10", java.lang.String[].class, new java.lang.String[]{ "HURD", "HAD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|11", java.lang.String[].class, new java.lang.String[]{ "HUNT", "HAD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|12", java.lang.String[].class, new java.lang.String[]{ "WESTERLUND", "WASTARLAD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|13", java.lang.String[].class, new java.lang.String[]{ "CASSTEVENS", "CASTAFAN" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|14", java.lang.String[].class, new java.lang.String[]{ "VASQUEZ", "VASG" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|15", java.lang.String[].class, new java.lang.String[]{ "FRAZIER", "FRASAR" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|16", java.lang.String[].class, new java.lang.String[]{ "BOWMAN", "BANAN" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|17", java.lang.String[].class, new java.lang.String[]{ "MCKNIGHT", "MCNAGT" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|18", java.lang.String[].class, new java.lang.String[]{ "RICKERT", "RACAD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|19", java.lang.String[].class, new java.lang.String[]{ "DEUTSCH", "DAT" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|20", java.lang.String[].class, new java.lang.String[]{ "WESTPHAL", "WASTFAL" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|21", java.lang.String[].class, new java.lang.String[]{ "SHRIVER", "SRAVAR" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|22", java.lang.String[].class, new java.lang.String[]{ "KUHL", "CAL" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|23", java.lang.String[].class, new java.lang.String[]{ "RAWSON", "RASAN" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|24", java.lang.String[].class, new java.lang.String[]{ "JILES", "JAL" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|25", java.lang.String[].class, new java.lang.String[]{ "CARRAWAY", "CARY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testDropBy()|26", java.lang.String[].class, new java.lang.String[]{ "YAMADA", "YANAD" }));
    }

    @org.junit.Test
    public void testFal() {
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testFal()|0", java.lang.String[].class, new java.lang.String[]{ "Phil" }), "FAL");
    }

    /**
     * Tests data gathered from around the internets.
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testOthers() throws org.apache.commons.codec.EncoderException {
        // 
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testOthers()|0", java.lang.String[].class, new java.lang.String[]{ "O'Daniel", "ODANAL" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testOthers()|1", java.lang.String[].class, new java.lang.String[]{ "O'Donnel", "ODANAL" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testOthers()|2", java.lang.String[].class, new java.lang.String[]{ "Cory", "CARY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testOthers()|3", java.lang.String[].class, new java.lang.String[]{ "Corey", "CARY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testOthers()|4", java.lang.String[].class, new java.lang.String[]{ "Kory", "CARY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testOthers()|5", java.lang.String[].class, new java.lang.String[]{ "FUZZY", "FASY" }));
    }

    /**
     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testRule1() throws org.apache.commons.codec.EncoderException {
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule1()|0", java.lang.String[].class, new java.lang.String[]{ "MACX", "MCX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule1()|1", java.lang.String[].class, new java.lang.String[]{ "KNX", "NX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule1()|2", java.lang.String[].class, new java.lang.String[]{ "KX", "CX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule1()|3", java.lang.String[].class, new java.lang.String[]{ "PHX", "FX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule1()|4", java.lang.String[].class, new java.lang.String[]{ "PFX", "FX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule1()|5", java.lang.String[].class, new java.lang.String[]{ "SCHX", "SX" }));
    }

    /**
     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testRule2() throws org.apache.commons.codec.EncoderException {
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule2()|0", java.lang.String[].class, new java.lang.String[]{ "XEE", "XY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule2()|1", java.lang.String[].class, new java.lang.String[]{ "XIE", "XY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule2()|2", java.lang.String[].class, new java.lang.String[]{ "XDT", "XD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule2()|3", java.lang.String[].class, new java.lang.String[]{ "XRT", "XD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule2()|4", java.lang.String[].class, new java.lang.String[]{ "XRD", "XD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule2()|5", java.lang.String[].class, new java.lang.String[]{ "XNT", "XD" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule2()|6", java.lang.String[].class, new java.lang.String[]{ "XND", "XD" }));
    }

    /**
     * Tests rule 4.1: EV → AF else A, E, I, O, U → A
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testRule4Dot1() throws org.apache.commons.codec.EncoderException {
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot1()|0", java.lang.String[].class, new java.lang.String[]{ "XEV", "XAF" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot1()|1", java.lang.String[].class, new java.lang.String[]{ "XAX", "XAX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot1()|2", java.lang.String[].class, new java.lang.String[]{ "XEX", "XAX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot1()|3", java.lang.String[].class, new java.lang.String[]{ "XIX", "XAX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot1()|4", java.lang.String[].class, new java.lang.String[]{ "XOX", "XAX" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot1()|5", java.lang.String[].class, new java.lang.String[]{ "XUX", "XAX" }));
    }

    /**
     * Tests rule 4.2: Q → G, Z → S, M → N
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testRule4Dot2() throws org.apache.commons.codec.EncoderException {
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot2()|0", java.lang.String[].class, new java.lang.String[]{ "XQ", "XG" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot2()|1", java.lang.String[].class, new java.lang.String[]{ "XZ", "X" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule4Dot2()|2", java.lang.String[].class, new java.lang.String[]{ "XM", "XN" }));
    }

    /**
     * Tests rule 5: If last character is S, remove it.
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testRule5() throws org.apache.commons.codec.EncoderException {
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule5()|0", java.lang.String[].class, new java.lang.String[]{ "XS", "X" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule5()|1", java.lang.String[].class, new java.lang.String[]{ "XSS", "X" }));
    }

    /**
     * Tests rule 6: If last characters are AY, replace with Y.
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testRule6() throws org.apache.commons.codec.EncoderException {
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule6()|0", java.lang.String[].class, new java.lang.String[]{ "XAY", "XY" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule6()|1", java.lang.String[].class, new java.lang.String[]{ "XAYS", "XY" }));// Rules 5, 6

    }

    /**
     * Tests rule 7: If last character is A, remove it.
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testRule7() throws org.apache.commons.codec.EncoderException {
        this.assertEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule7()|0", java.lang.String[].class, new java.lang.String[]{ "XA", "X" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testRule7()|1", java.lang.String[].class, new java.lang.String[]{ "XAS", "X" }));// Rules 5, 7

    }

    @org.junit.Test
    public void testSnad() {
        // Data Quality and Record Linkage Techniques P.121 claims this is SNAT,
        // but it should be SNAD
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSnad()|0", java.lang.String[].class, new java.lang.String[]{ "Schmidt" }), "SNAD");
    }

    @org.junit.Test
    public void testSnat() {
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSnat()|0", java.lang.String[].class, new java.lang.String[]{ "Smith", "Schmit" }), "SNAT");
    }

    @org.junit.Test
    public void testSpecialBranches() {
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSpecialBranches()|0", java.lang.String[].class, new java.lang.String[]{ "Kobwick" }), "CABWAC");
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSpecialBranches()|1", java.lang.String[].class, new java.lang.String[]{ "Kocher" }), "CACAR");
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSpecialBranches()|2", java.lang.String[].class, new java.lang.String[]{ "Fesca" }), "FASC");
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSpecialBranches()|3", java.lang.String[].class, new java.lang.String[]{ "Shom" }), "SAN");
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSpecialBranches()|4", java.lang.String[].class, new java.lang.String[]{ "Ohlo" }), "OL");
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSpecialBranches()|5", java.lang.String[].class, new java.lang.String[]{ "Uhu" }), "UH");
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testSpecialBranches()|6", java.lang.String[].class, new java.lang.String[]{ "Um" }), "UN");
    }

    @org.junit.Test
    public void testTranan() {
        this.encodeAll(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.NysiisTest|testTranan()|0", java.lang.String[].class, new java.lang.String[]{ "Trueman", "Truman" }), "TRANAN");
    }

    @org.junit.Test
    public void testTrueVariant() {
        final org.apache.commons.codec.language.Nysiis encoder = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Nysiis>observeState("org.apache.commons.codec.language.NysiisTest|testTrueVariant()|0", org.apache.commons.codec.language.Nysiis.class, new org.apache.commons.codec.language.Nysiis(true));
        final java.lang.String encoded = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|testTrueVariant()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Nysiis>observeState("org.apache.commons.codec.language.NysiisTest|testTrueVariant()|1", org.apache.commons.codec.language.Nysiis.class, encoder).encode("WESTERLUND"));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|testTrueVariant()|4", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|testTrueVariant()|3", encoded).length())) <= 6));
        org.junit.Assert.assertEquals("WASTAR", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.NysiisTest|testTrueVariant()|5", encoded));
    }
}

