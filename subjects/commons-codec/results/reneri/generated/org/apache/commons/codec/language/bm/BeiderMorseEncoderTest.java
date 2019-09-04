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


/**
 * Tests BeiderMorseEncoder.
 *
 * @since 1.6
 */
public class BeiderMorseEncoderTest extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.StringEncoder> {
    private static final char[] TEST_CHARS = new char[]{ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'o', 'u' };

    private void assertNotEmpty(final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm, final java.lang.String value) throws org.apache.commons.codec.EncoderException {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|assertNotEmpty(org.apache.commons.codec.language.bm.BeiderMorseEncoder,java.lang.String)|0", value), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|assertNotEmpty(org.apache.commons.codec.language.bm.BeiderMorseEncoder,java.lang.String)|4", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|assertNotEmpty(org.apache.commons.codec.language.bm.BeiderMorseEncoder,java.lang.String)|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|assertNotEmpty(org.apache.commons.codec.language.bm.BeiderMorseEncoder,java.lang.String)|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|assertNotEmpty(org.apache.commons.codec.language.bm.BeiderMorseEncoder,java.lang.String)|2", value))).equals("")));
    }

    private org.apache.commons.codec.language.bm.BeiderMorseEncoder createGenericApproxEncoder() {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder encoder = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|createGenericApproxEncoder()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, new org.apache.commons.codec.language.bm.BeiderMorseEncoder());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|createGenericApproxEncoder()|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, encoder).setNameType(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|createGenericApproxEncoder()|2", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|createGenericApproxEncoder()|3", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, encoder).setRuleType(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|createGenericApproxEncoder()|4", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.APPROX));
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|createGenericApproxEncoder()|5", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, encoder);
    }

    @java.lang.Override
    protected org.apache.commons.codec.StringEncoder createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|createStringEncoder()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, new org.apache.commons.codec.language.bm.BeiderMorseEncoder());
    }

    /**
     * Tests we do not blow up.
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testAllChars() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAllChars()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, createGenericApproxEncoder());
        for (char c = java.lang.Character.MIN_VALUE; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAllChars()|1", c)) < (java.lang.Character.MAX_VALUE); c++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAllChars()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAllChars()|2", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAllChars()|4", java.lang.Character.toString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAllChars()|3", c)))));
        }
    }

    @org.junit.Test
    public void testAsciiEncodeNotEmpty1Letter() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, createGenericApproxEncoder());
        for (char c = 'a'; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|1", c)) <= 'z'; c++) {
            final java.lang.String value = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|3", java.lang.Character.toString(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|2", c)));
            final java.lang.String valueU = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|4", value).toUpperCase());
            assertNotEmpty(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|6", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|7", value));
            assertNotEmpty(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|8", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty1Letter()|9", valueU));
        }
    }

    @org.junit.Test
    public void testAsciiEncodeNotEmpty2Letters() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, createGenericApproxEncoder());
        for (char c1 = 'a'; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|1", c1)) <= 'z'; c1++) {
            for (char c2 = 'a'; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|2", c2)) <= 'z'; c2++) {
                final java.lang.String value = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|6", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|5", char[].class, new char[]{ eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|3", c1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|4", c2) })));
                final java.lang.String valueU = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|7", value).toUpperCase());
                assertNotEmpty(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|9", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|10", value));
                assertNotEmpty(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|11", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testAsciiEncodeNotEmpty2Letters()|12", valueU));
            }
        }
    }

    @org.junit.Test
    public void testEncodeAtzNotEmpty() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testEncodeAtzNotEmpty()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, createGenericApproxEncoder());
        // String[] names = { "ácz", "átz", "Ignácz", "Ignátz", "Ignác" };
        final java.lang.String[] names = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testEncodeAtzNotEmpty()|1", java.lang.String[].class, new java.lang.String[]{ "\u00e1cz", "\u00e1tz", "Ign\u00e1cz", "Ign\u00e1tz", "Ign\u00e1c" });
        for (final java.lang.String name : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testEncodeAtzNotEmpty()|2", java.lang.String[].class, names)) {
            assertNotEmpty(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testEncodeAtzNotEmpty()|3", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testEncodeAtzNotEmpty()|4", name));
        }
    }

    /**
     * Tests https://issues.apache.org/jira/browse/CODEC-125?focusedCommentId=13071566&page=com.atlassian.jira.plugin.system.issuetabpanels:
     * comment-tabpanel#comment-13071566
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testEncodeGna() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testEncodeGna()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, createGenericApproxEncoder());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testEncodeGna()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testEncodeGna()|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).encode("gna"));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testInvalidLangIllegalArgumentException() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.apache.commons.codec.language.bm.Rule>>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLangIllegalArgumentException()|2", java.util.List.class, org.apache.commons.codec.language.bm.Rule.getInstance(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLangIllegalArgumentException()|0", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLangIllegalArgumentException()|1", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.APPROX), "noSuchLanguage"));
        } catch (java.lang.IllegalArgumentException a1553628734279) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLangIllegalArgumentException()|!", a1553628734279);
            throw a1553628734279;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalStateException.class)
    public void testInvalidLangIllegalStateException() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Lang>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLangIllegalStateException()|2", org.apache.commons.codec.language.bm.Lang.class, org.apache.commons.codec.language.bm.Lang.loadFromResource("thisIsAMadeUpResourceName", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Languages>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLangIllegalStateException()|1", org.apache.commons.codec.language.bm.Languages.class, org.apache.commons.codec.language.bm.Languages.getInstance(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLangIllegalStateException()|0", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC)))));
        } catch (java.lang.IllegalStateException a1553628734280) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLangIllegalStateException()|!", a1553628734280);
            throw a1553628734280;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testInvalidLanguageIllegalArgumentException() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Languages>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLanguageIllegalArgumentException()|0", org.apache.commons.codec.language.bm.Languages.class, org.apache.commons.codec.language.bm.Languages.getInstance("thereIsNoSuchLanguage"));
        } catch (java.lang.IllegalArgumentException a1553628734280) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testInvalidLanguageIllegalArgumentException()|!", a1553628734280);
            throw a1553628734280;
        }
    }

    @org.junit.Test
    public void testLongestEnglishSurname() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testLongestEnglishSurname()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, createGenericApproxEncoder());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testLongestEnglishSurname()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testLongestEnglishSurname()|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).encode("MacGhilleseatheanaich"));
    }

    @org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void testNegativeIndexForRuleMatchIndexOutOfBoundsException() {
        try {
            final org.apache.commons.codec.language.bm.Rule r = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Rule>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testNegativeIndexForRuleMatchIndexOutOfBoundsException()|2", org.apache.commons.codec.language.bm.Rule.class, new org.apache.commons.codec.language.bm.Rule("a", "", "", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Rule.Phoneme>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testNegativeIndexForRuleMatchIndexOutOfBoundsException()|1", org.apache.commons.codec.language.bm.Rule.Phoneme.class, new org.apache.commons.codec.language.bm.Rule.Phoneme("", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Languages.LanguageSet>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testNegativeIndexForRuleMatchIndexOutOfBoundsException()|0", org.apache.commons.codec.language.bm.Languages.LanguageSet.class, org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE)))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testNegativeIndexForRuleMatchIndexOutOfBoundsException()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Rule>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testNegativeIndexForRuleMatchIndexOutOfBoundsException()|3", org.apache.commons.codec.language.bm.Rule.class, r).patternAndContextMatches("bob", (-1)));
        } catch (java.lang.IndexOutOfBoundsException a1553628734281) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testNegativeIndexForRuleMatchIndexOutOfBoundsException()|!", a1553628734281);
            throw a1553628734281;
        }
    }

    @org.junit.Test
    public void testOOM() throws org.apache.commons.codec.EncoderException {
        final java.lang.String phrase = "200697900\'-->&#1913348150;</  bceaeef >aadaabcf\"aedfbff<!--\'-->?>cae" + ("cfaaa><?&#<!--</script>&lang&fc;aadeaf?>>&bdquo<    cc =\"abff\"    /></   afe  >" + "<script><!-- f(\';<    cf aefbeef = \"bfabadcf\" ebbfeedd = fccabeb >");
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder encoder = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, new org.apache.commons.codec.language.bm.BeiderMorseEncoder());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, encoder).setNameType(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|2", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|3", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, encoder).setRuleType(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|4", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.EXACT));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|5", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, encoder).setMaxPhonemes(10);
        final java.lang.String phonemes = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|6", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, encoder).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|7", phrase)));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|10", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|9", phonemes).length())) > 0));
        final java.lang.String[] phonemeArr = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|12", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|11", phonemes).split("\\|"));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testOOM()|13", java.lang.String[].class, phonemeArr).length)) <= 10));
    }

    @org.junit.Test
    public void testSetConcat() {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetConcat()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, new org.apache.commons.codec.language.bm.BeiderMorseEncoder());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetConcat()|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).setConcat(false);
        org.junit.Assert.assertFalse("Should be able to set concat to false", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetConcat()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetConcat()|2", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).isConcat()));
    }

    @org.junit.Test
    public void testSetNameTypeAsh() {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetNameTypeAsh()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, new org.apache.commons.codec.language.bm.BeiderMorseEncoder());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetNameTypeAsh()|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).setNameType(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetNameTypeAsh()|2", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.ASHKENAZI));
        org.junit.Assert.assertEquals("Name type should have been set to ash", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetNameTypeAsh()|3", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.ASHKENAZI), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetNameTypeAsh()|5", org.apache.commons.codec.language.bm.NameType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetNameTypeAsh()|4", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).getNameType()));
    }

    @org.junit.Test
    public void testSetRuleTypeExact() {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeExact()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, new org.apache.commons.codec.language.bm.BeiderMorseEncoder());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeExact()|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).setRuleType(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeExact()|2", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.EXACT));
        org.junit.Assert.assertEquals("Rule type should have been set to exact", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeExact()|3", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.EXACT), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeExact()|5", org.apache.commons.codec.language.bm.RuleType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeExact()|4", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).getRuleType()));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testSetRuleTypeToRulesIllegalArgumentException() {
        try {
            final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeToRulesIllegalArgumentException()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, new org.apache.commons.codec.language.bm.BeiderMorseEncoder());
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeToRulesIllegalArgumentException()|1", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).setRuleType(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeToRulesIllegalArgumentException()|2", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.RULES));
        } catch (java.lang.IllegalArgumentException a1553628734284) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSetRuleTypeToRulesIllegalArgumentException()|!", a1553628734284);
            throw a1553628734284;
        }
    }

    /**
     * (Un)luckily, the worse performing test because of the data in {@link #TEST_CHARS}
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testSpeedCheck() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, this.createGenericApproxEncoder());
        final java.lang.StringBuilder stringBuffer = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|1", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|5", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|2", java.lang.StringBuilder.class, stringBuffer).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|3", char[].class, org.apache.commons.codec.language.bm.BeiderMorseEncoderTest.TEST_CHARS)[0])));
        for (int i = 0, j = 1; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|6", i)) < 40; i++ , j++) {
            if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|7", j)) == (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|8", char[].class, org.apache.commons.codec.language.bm.BeiderMorseEncoderTest.TEST_CHARS).length))) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|10", (j = 0));
            }
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|11", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|12", java.lang.StringBuilder.class, stringBuffer).toString())));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|19", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|15", java.lang.StringBuilder.class, stringBuffer).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|16", char[].class, org.apache.commons.codec.language.bm.BeiderMorseEncoderTest.TEST_CHARS)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck()|17", j)])));
        }
    }

    @org.junit.Test
    public void testSpeedCheck2() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, this.createGenericApproxEncoder());
        final java.lang.String phrase = "ItstheendoftheworldasweknowitandIfeelfine";
        for (int i = 1; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|1", i)) <= (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|2", phrase).length())); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|8", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|4", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|7", java.lang.CharSequence.class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|5", phrase).subSequence(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck2()|6", i)))));
        }
    }

    @org.junit.Test
    public void testSpeedCheck3() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.bm.BeiderMorseEncoder bmpm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|0", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, this.createGenericApproxEncoder());
        final java.lang.String phrase = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        for (int i = 1; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|1", i)) <= (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|3", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|2", phrase).length())); i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|8", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.BeiderMorseEncoder>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|4", org.apache.commons.codec.language.bm.BeiderMorseEncoder.class, bmpm).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.CharSequence>observeState("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|7", java.lang.CharSequence.class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|5", phrase).subSequence(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.BeiderMorseEncoderTest|testSpeedCheck3()|6", i)))));
        }
    }
}

