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
 * Tests the <code>ColognePhonetic</code> class.
 *
 * <p>Keep this file in UTF-8 encoding for proper Javadoc processing.</p>
 */
public class ColognePhoneticTest extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.ColognePhonetic> {
    private static final java.util.Set<java.lang.String> TESTSET = new java.util.HashSet<java.lang.String>();

    private static boolean hasTestCase(java.lang.String re) {
        for (java.lang.String s : eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("org.apache.commons.codec.language.ColognePhoneticTest|hasTestCase(java.lang.String)|0", java.util.Set.class, org.apache.commons.codec.language.ColognePhoneticTest.TESTSET)) {
            if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|hasTestCase(java.lang.String)|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|hasTestCase(java.lang.String)|1", s).matches(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|hasTestCase(java.lang.String)|2", re)))) {
                return true;
            }
        }
        return false;
    }

    // Character sequences to be tested by the code
    private static final java.lang.String[] MATCHES = new java.lang.String[]{ ".*[AEIOUJY].*"// A, E, I, J, O, U, Y
    , ".*H.*", // H
    ".*B.*", // B
    ".*P[^H].*", // P not before H
    ".*[DT][^CSZ].*"// D,T not before C,S,Z
    , ".*[FVW].*", // F,V,W
    ".*PH.*", // P before H
    ".*[GKQ].*", // G,K,Q
    "C[AHKLOQRUX].*"// Initial C before A, H, K, L, O, Q, R, U, X
    , ".*[^SZ]C[AHKLOQRUX].*"// C before A, H, K, L, O, Q, R, U, X but not after S, Z
    , ".*[^CKQ]X.*"// X not after C,K,Q
    , ".*L.*", // L
    ".*[MN].*", // M,N
    ".*R.*", // R
    ".*[SZ].*", // S,Z
    ".*[SZ]C.*", // C after S,Z
    "C[^AHKLOQRUX].*"// Initial C except before A, H, K, L, O, Q, R, U, X
    , ".+C[^AHKLOQRUX].*"// C except before A, H, K, L, O, Q, R, U, X
    , ".*[DT][CSZ].*"// D,T before C,S,Z
    , ".*[CKQ]X.*"// X after C,K,Q
     };

    // Check that all possible input sequence conditions are represented
    @org.junit.AfterClass
    public static void finishTests() {
        int errors = 0;
        for (java.lang.String m : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|finishTests()|0", java.lang.String[].class, org.apache.commons.codec.language.ColognePhoneticTest.MATCHES)) {
            if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|finishTests()|2", org.apache.commons.codec.language.ColognePhoneticTest.hasTestCase(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|finishTests()|1", m))))) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.language.ColognePhoneticTest|finishTests()|3", java.io.PrintStream.class, java.lang.System.out).println(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|finishTests()|4", m)) + " has no test case"));
                errors++;
            }
        }
        org.junit.Assert.assertEquals("Not expecting any missing test cases", 0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|finishTests()|5", errors));
    }

    // Capture test strings for later checking
    @java.lang.Override
    public void checkEncoding(java.lang.String expected, java.lang.String source) throws org.apache.commons.codec.EncoderException {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|7", // Note that the German letter Eszett is converted to SS by toUpperCase, so we don't need to replace it
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|0", java.util.Set.class, org.apache.commons.codec.language.ColognePhoneticTest.TESTSET).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|6", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|4", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|1", source).toUpperCase(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|2", java.util.Locale.class, java.util.Locale.GERMAN))).replace('Ä', 'A')).replace('Ö', 'O')).replace('Ü', 'U'))));
        super.checkEncoding(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|8", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|checkEncoding(java.lang.String,java.lang.String)|9", source));
    }

    @java.lang.Override
    protected org.apache.commons.codec.language.ColognePhonetic createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.ColognePhonetic>observeState("org.apache.commons.codec.language.ColognePhoneticTest|createStringEncoder()|0", org.apache.commons.codec.language.ColognePhonetic.class, new org.apache.commons.codec.language.ColognePhonetic());
    }

    // Ensure that override still allows tests to work
    @org.junit.Test(expected = org.junit.ComparisonFailure.class)
    public void testCanFail() throws org.apache.commons.codec.EncoderException {
        try {
            this.checkEncoding("/", "Fehler");
        } catch (org.junit.ComparisonFailure a1553628734430) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.language.ColognePhoneticTest|testCanFail()|!", a1553628734430);
            throw a1553628734430;
        }
    }

    @org.junit.Test
    public void testAabjoe() throws org.apache.commons.codec.EncoderException {
        this.checkEncoding("01", "Aabjoe");
    }

    @org.junit.Test
    public void testAaclan() throws org.apache.commons.codec.EncoderException {
        this.checkEncoding("0856", "Aaclan");
    }

    /**
     * Tests [CODEC-122]
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testAychlmajrForCodec122() throws org.apache.commons.codec.EncoderException {
        this.checkEncoding("04567", "Aychlmajr");
    }

    @org.junit.Test
    public void testEdgeCases() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|31", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|0", java.lang.String[].class, new java.lang.String[]{ "a", "0" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|1", java.lang.String[].class, new java.lang.String[]{ "e", "0" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|2", java.lang.String[].class, new java.lang.String[]{ "i", "0" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|3", java.lang.String[].class, new java.lang.String[]{ "o", "0" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|4", java.lang.String[].class, new java.lang.String[]{ "u", "0" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|5", java.lang.String[].class, new java.lang.String[]{ "\u00e4", "0" }// a-umlaut
        // a-umlaut
        // a-umlaut
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|6", java.lang.String[].class, new java.lang.String[]{ "\u00f6", "0" }// o-umlaut
        // o-umlaut
        // o-umlaut
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|7", java.lang.String[].class, new java.lang.String[]{ "\u00fc", "0" }// u-umlaut
        // u-umlaut
        // u-umlaut
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|8", java.lang.String[].class, new java.lang.String[]{ "\u00df", "8" }// small sharp s
        // small sharp s
        // small sharp s
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|9", java.lang.String[].class, new java.lang.String[]{ "aa", "0" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|10", java.lang.String[].class, new java.lang.String[]{ "ha", "0" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|11", java.lang.String[].class, new java.lang.String[]{ "h", "" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|12", java.lang.String[].class, new java.lang.String[]{ "aha", "0" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|13", java.lang.String[].class, new java.lang.String[]{ "b", "1" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|14", java.lang.String[].class, new java.lang.String[]{ "p", "1" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|15", java.lang.String[].class, new java.lang.String[]{ "ph", "3" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|16", java.lang.String[].class, new java.lang.String[]{ "f", "3" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|17", java.lang.String[].class, new java.lang.String[]{ "v", "3" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|18", java.lang.String[].class, new java.lang.String[]{ "w", "3" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|19", java.lang.String[].class, new java.lang.String[]{ "g", "4" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|20", java.lang.String[].class, new java.lang.String[]{ "k", "4" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|21", java.lang.String[].class, new java.lang.String[]{ "q", "4" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|22", java.lang.String[].class, new java.lang.String[]{ "x", "48" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|23", java.lang.String[].class, new java.lang.String[]{ "ax", "048" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|24", java.lang.String[].class, new java.lang.String[]{ "cx", "48" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|25", java.lang.String[].class, new java.lang.String[]{ "l", "5" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|26", java.lang.String[].class, new java.lang.String[]{ "cl", "45" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|27", java.lang.String[].class, new java.lang.String[]{ "acl", "085" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|28", java.lang.String[].class, new java.lang.String[]{ "mn", "6" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|29", java.lang.String[].class, new java.lang.String[]{ "{mn}", "6" }// test chars above Z
        // test chars above Z
        // test chars above Z
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|30", java.lang.String[].class, new java.lang.String[]{ "r", "7" }) });
        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testEdgeCases()|32", java.lang.String[][].class, data));
    }

    @org.junit.Test
    public void testExamples() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|32", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|0", java.lang.String[].class, new java.lang.String[]{ "m\u00dcller", "657" }// mÜller - why upper case U-umlaut?
        // mÜller - why upper case U-umlaut?
        // mÜller - why upper case U-umlaut?
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|1", java.lang.String[].class, new java.lang.String[]{ "m\u00fcller", "657" }// müller - add equivalent lower-case
        // müller - add equivalent lower-case
        // müller - add equivalent lower-case
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|2", java.lang.String[].class, new java.lang.String[]{ "schmidt", "862" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|3", java.lang.String[].class, new java.lang.String[]{ "schneider", "8627" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|4", java.lang.String[].class, new java.lang.String[]{ "fischer", "387" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|5", java.lang.String[].class, new java.lang.String[]{ "weber", "317" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|6", java.lang.String[].class, new java.lang.String[]{ "wagner", "3467" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|7", java.lang.String[].class, new java.lang.String[]{ "becker", "147" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|8", java.lang.String[].class, new java.lang.String[]{ "hoffmann", "0366" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|9", java.lang.String[].class, new java.lang.String[]{ "sch\u00c4fer", "837" }// schÄfer - why upper case A-umlaut ?
        // schÄfer - why upper case A-umlaut ?
        // schÄfer - why upper case A-umlaut ?
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|10", java.lang.String[].class, new java.lang.String[]{ "sch\u00e4fer", "837" }// schäfer - add equivalent lower-case
        // schäfer - add equivalent lower-case
        // schäfer - add equivalent lower-case
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|11", java.lang.String[].class, new java.lang.String[]{ "Breschnew", "17863" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|12", java.lang.String[].class, new java.lang.String[]{ "Wikipedia", "3412" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|13", java.lang.String[].class, new java.lang.String[]{ "peter", "127" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|14", java.lang.String[].class, new java.lang.String[]{ "pharma", "376" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|15", java.lang.String[].class, new java.lang.String[]{ "m\u00f6nchengladbach", "664645214" }// mönchengladbach
        // mönchengladbach
        // mönchengladbach
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|16", java.lang.String[].class, new java.lang.String[]{ "deutsch", "28" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|17", java.lang.String[].class, new java.lang.String[]{ "deutz", "28" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|18", java.lang.String[].class, new java.lang.String[]{ "hamburg", "06174" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|19", java.lang.String[].class, new java.lang.String[]{ "hannover", "0637" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|20", java.lang.String[].class, new java.lang.String[]{ "christstollen", "478256" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|21", java.lang.String[].class, new java.lang.String[]{ "Xanthippe", "48621" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|22", java.lang.String[].class, new java.lang.String[]{ "Zacharias", "8478" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|23", java.lang.String[].class, new java.lang.String[]{ "Holzbau", "0581" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|24", java.lang.String[].class, new java.lang.String[]{ "matsch", "68" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|25", java.lang.String[].class, new java.lang.String[]{ "matz", "68" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|26", java.lang.String[].class, new java.lang.String[]{ "Arbeitsamt", "071862" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|27", java.lang.String[].class, new java.lang.String[]{ "Eberhard", "01772" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|28", java.lang.String[].class, new java.lang.String[]{ "Eberhardt", "01772" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|29", java.lang.String[].class, new java.lang.String[]{ "Celsius", "8588" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|30", java.lang.String[].class, new java.lang.String[]{ "Ace", "08" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|31", java.lang.String[].class, new java.lang.String[]{ "heithabu", "021" }) });
        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testExamples()|33", java.lang.String[][].class, data));
    }

    @org.junit.Test
    public void testHyphen() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testHyphen()|2", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testHyphen()|0", java.lang.String[].class, new java.lang.String[]{ "bergisch-gladbach", "174845214" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testHyphen()|1", java.lang.String[].class, new java.lang.String[]{ "M\u00fcller-L\u00fcdenscheidt", "65752682" }) });// Müller-Lüdenscheidt

        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testHyphen()|3", java.lang.String[][].class, data));
    }

    @org.junit.Test
    public void testIsEncodeEquals() {
        // @formatter:off
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|8", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|0", java.lang.String[].class, new java.lang.String[]{ "Muller", "M\u00fcller" }// Müller
        // Müller
        // Müller
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|1", java.lang.String[].class, new java.lang.String[]{ "Meyer", "Mayr" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|2", java.lang.String[].class, new java.lang.String[]{ "house", "house" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|3", java.lang.String[].class, new java.lang.String[]{ "House", "house" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|4", java.lang.String[].class, new java.lang.String[]{ "Haus", "house" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|5", java.lang.String[].class, new java.lang.String[]{ "ganz", "Gans" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|6", java.lang.String[].class, new java.lang.String[]{ "ganz", "G\u00e4nse" }// Gänse
        // Gänse
        // Gänse
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|7", java.lang.String[].class, new java.lang.String[]{ "Miyagi", "Miyako" }) });
        // @formatter:on
        for (final java.lang.String[] element : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|9", java.lang.String[][].class, data)) {
            final boolean encodeEqual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.ColognePhonetic>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|10", org.apache.commons.codec.language.ColognePhonetic.class, this.getStringEncoder()).isEncodeEqual(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|11", java.lang.String[].class, element)[1]), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|13", java.lang.String[].class, element)[0])));
            org.junit.Assert.assertTrue((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|16", java.lang.String[].class, element)[1])) + " != ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|18", java.lang.String[].class, element)[0]))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|testIsEncodeEquals()|20", encodeEqual));
        }
    }

    @org.junit.Test
    public void testVariationsMella() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testVariationsMella()|0", java.lang.String[].class, new java.lang.String[]{ "mella", "milah", "moulla", "mellah", "muehle", "mule" });
        this.checkEncodingVariations("65", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testVariationsMella()|1", java.lang.String[].class, data));
    }

    @org.junit.Test
    public void testVariationsMeyer() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testVariationsMeyer()|0", java.lang.String[].class, new java.lang.String[]{ "Meier", "Maier", "Mair", "Meyer", "Meyr", "Mejer", "Major" });
        this.checkEncodingVariations("67", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testVariationsMeyer()|1", java.lang.String[].class, data));
    }

    @org.junit.Test
    public void testSpecialCharsBetweenSameLetters() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testSpecialCharsBetweenSameLetters()|0", java.lang.String[].class, new java.lang.String[]{ "Test test", "Testtest", "Test-test", "TesT#Test", "TesT?test" });
        this.checkEncodingVariations("28282", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|testSpecialCharsBetweenSameLetters()|1", java.lang.String[].class, data));
    }

    // Allow command-line testing
    public static void main(java.lang.String[] args) {
        org.apache.commons.codec.language.ColognePhonetic coder = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.ColognePhonetic>observeState("org.apache.commons.codec.language.ColognePhoneticTest|main(java.lang.String[])|0", org.apache.commons.codec.language.ColognePhonetic.class, new org.apache.commons.codec.language.ColognePhonetic());
        for (java.lang.String arg : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.ColognePhoneticTest|main(java.lang.String[])|1", java.lang.String[].class, args)) {
            java.lang.String code = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|main(java.lang.String[])|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.ColognePhonetic>observeState("org.apache.commons.codec.language.ColognePhoneticTest|main(java.lang.String[])|2", org.apache.commons.codec.language.ColognePhonetic.class, coder).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|main(java.lang.String[])|3", arg)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.apache.commons.codec.language.ColognePhoneticTest|main(java.lang.String[])|5", java.io.PrintStream.class, java.lang.System.out).println((((("'" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|main(java.lang.String[])|6", arg))) + "' = '") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.ColognePhoneticTest|main(java.lang.String[])|7", code))) + "'"));
        }
    }
}

