/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.codec.language;


/**
 * Series of tests for the Match Rating Approach algorithm.
 *
 * General naming nomenclature for the test is of the form:
 * GeneralMetadataOnTheTestArea_ActualTestValues_ExpectedResult
 *
 * An unusual value is indicated by the term "corner case"
 */
// ***** END REGION - TEST GET MRA COMPARISONS
public class MatchRatingApproachEncoderTest extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.MatchRatingApproachEncoder> {
    // ********** BEGIN REGION - TEST SUPPORT METHODS
    @org.junit.Test
    public final void testAccentRemoval_AllLower_SuccessfullyRemoved() {
        org.junit.Assert.assertEquals("aeiou", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_AllLower_SuccessfullyRemoved()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_AllLower_SuccessfullyRemoved()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents("áéíóú")));
    }

    @org.junit.Test
    public final void testAccentRemoval_WithSpaces_SuccessfullyRemovedAndSpacesInvariant() {
        org.junit.Assert.assertEquals("ae io  u", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_WithSpaces_SuccessfullyRemovedAndSpacesInvariant()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_WithSpaces_SuccessfullyRemovedAndSpacesInvariant()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents("áé íó  ú")));
    }

    @org.junit.Test
    public final void testAccentRemoval_UpperandLower_SuccessfullyRemovedAndCaseInvariant() {
        org.junit.Assert.assertEquals("AeiOuu", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_UpperandLower_SuccessfullyRemovedAndCaseInvariant()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_UpperandLower_SuccessfullyRemovedAndCaseInvariant()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents("ÁeíÓuu")));
    }

    @org.junit.Test
    public final void testAccentRemoval_MixedWithUnusualChars_SuccessfullyRemovedAndUnusualcharactersInvariant() {
        org.junit.Assert.assertEquals("A-e'i.,o&u", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_MixedWithUnusualChars_SuccessfullyRemovedAndUnusualcharactersInvariant()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_MixedWithUnusualChars_SuccessfullyRemovedAndUnusualcharactersInvariant()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents("Á-e'í.,ó&ú")));
    }

    @org.junit.Test
    public final void testAccentRemoval_GerSpanFrenMix_SuccessfullyRemoved() {
        org.junit.Assert.assertEquals("aeoußAEOUnNa", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_GerSpanFrenMix_SuccessfullyRemoved()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_GerSpanFrenMix_SuccessfullyRemoved()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents("äëöüßÄËÖÜñÑà")));
    }

    @org.junit.Test
    public final void testAccentRemoval_ComprehensiveAccentMix_AllSuccessfullyRemoved() {
        org.junit.Assert.assertEquals("E,E,E,E,U,U,I,I,A,A,O,e,e,e,e,u,u,i,i,a,a,o,c", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_ComprehensiveAccentMix_AllSuccessfullyRemoved()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_ComprehensiveAccentMix_AllSuccessfullyRemoved()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents("È,É,Ê,Ë,Û,Ù,Ï,Î,À,Â,Ô,è,é,ê,ë,û,ù,ï,î,à,â,ô,ç")));
    }

    @org.junit.Test
    public final void testAccentRemovalNormalString_NoChange() {
        org.junit.Assert.assertEquals("Colorless green ideas sleep furiously", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemovalNormalString_NoChange()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemovalNormalString_NoChange()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents("Colorless green ideas sleep furiously")));
    }

    @org.junit.Test
    public final void testAccentRemoval_NINO_NoChange() {
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_NINO_NoChange()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_NINO_NoChange()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents("")));
    }

    @org.junit.Test
    public final void testAccentRemoval_NullValue_ReturnNullSuccessfully() {
        org.junit.Assert.assertEquals(null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_NullValue_ReturnNullSuccessfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testAccentRemoval_NullValue_ReturnNullSuccessfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeAccents(null)));
    }

    @org.junit.Test
    public final void testRemoveSingleDoubleConsonants_BUBLE_RemovedSuccessfully() {
        org.junit.Assert.assertEquals("BUBLE", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveSingleDoubleConsonants_BUBLE_RemovedSuccessfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveSingleDoubleConsonants_BUBLE_RemovedSuccessfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeDoubleConsonants("BUBBLE")));
    }

    @org.junit.Test
    public final void testRemoveDoubleConsonants_MISSISSIPPI_RemovedSuccessfully() {
        org.junit.Assert.assertEquals("MISISIPI", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveDoubleConsonants_MISSISSIPPI_RemovedSuccessfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveDoubleConsonants_MISSISSIPPI_RemovedSuccessfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeDoubleConsonants("MISSISSIPPI")));
    }

    @org.junit.Test
    public final void testRemoveDoubleDoubleVowel_BEETLE_NotRemoved() {
        org.junit.Assert.assertEquals("BEETLE", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveDoubleDoubleVowel_BEETLE_NotRemoved()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveDoubleDoubleVowel_BEETLE_NotRemoved()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeDoubleConsonants("BEETLE")));
    }

    @org.junit.Test
    public final void testIsVowel_CapitalA_ReturnsTrue() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testIsVowel_CapitalA_ReturnsTrue()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testIsVowel_CapitalA_ReturnsTrue()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isVowel("A")));
    }

    @org.junit.Test
    public final void testIsVowel_SmallD_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testIsVowel_SmallD_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testIsVowel_SmallD_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isVowel("d")));
    }

    @org.junit.Test
    public final void testRemoveVowel_ALESSANDRA_Returns_ALSSNDR() {
        org.junit.Assert.assertEquals("ALSSNDR", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveVowel_ALESSANDRA_Returns_ALSSNDR()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveVowel_ALESSANDRA_Returns_ALSSNDR()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeVowels("ALESSANDRA")));
    }

    @org.junit.Test
    public final void testRemoveVowel__AIDAN_Returns_ADN() {
        org.junit.Assert.assertEquals("ADN", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveVowel__AIDAN_Returns_ADN()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveVowel__AIDAN_Returns_ADN()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeVowels("AIDAN")));
    }

    @org.junit.Test
    public final void testRemoveVowel__DECLAN_Returns_DCLN() {
        org.junit.Assert.assertEquals("DCLN", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveVowel__DECLAN_Returns_DCLN()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testRemoveVowel__DECLAN_Returns_DCLN()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).removeVowels("DECLAN")));
    }

    @org.junit.Test
    public final void testGetFirstLast3__ALEXANDER_Returns_Aleder() {
        org.junit.Assert.assertEquals("Aleder", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetFirstLast3__ALEXANDER_Returns_Aleder()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetFirstLast3__ALEXANDER_Returns_Aleder()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getFirst3Last3("Alexzander")));
    }

    @org.junit.Test
    public final void testGetFirstLast3_PETE_Returns_PETE() {
        org.junit.Assert.assertEquals("PETE", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetFirstLast3_PETE_Returns_PETE()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetFirstLast3_PETE_Returns_PETE()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getFirst3Last3("PETE")));
    }

    @org.junit.Test
    public final void testleftTorightThenRightToLeft_ALEXANDER_ALEXANDRA_Returns4() {
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testleftTorightThenRightToLeft_ALEXANDER_ALEXANDRA_Returns4()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testleftTorightThenRightToLeft_ALEXANDER_ALEXANDRA_Returns4()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).leftToRightThenRightToLeftProcessing("ALEXANDER", "ALEXANDRA")));
    }

    @org.junit.Test
    public final void testleftTorightThenRightToLeft_EINSTEIN_MICHAELA_Returns0() {
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testleftTorightThenRightToLeft_EINSTEIN_MICHAELA_Returns0()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testleftTorightThenRightToLeft_EINSTEIN_MICHAELA_Returns0()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).leftToRightThenRightToLeftProcessing("EINSTEIN", "MICHAELA")));
    }

    @org.junit.Test
    public final void testGetMinRating_7_Return4_Successfully() {
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetMinRating_7_Return4_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetMinRating_7_Return4_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(7)));
    }

    @org.junit.Test
    public final void testGetMinRating_1_Returns5_Successfully() {
        org.junit.Assert.assertEquals(5, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetMinRating_1_Returns5_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetMinRating_1_Returns5_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(1)));
    }

    @org.junit.Test
    public final void testGetMinRating_2_Returns5_Successfully() {
        org.junit.Assert.assertEquals(5, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetMinRating_2_Returns5_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetMinRating_2_Returns5_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(2)));
    }

    @org.junit.Test
    public final void testgetMinRating_5_Returns4_Successfully() {
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_5_Returns4_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_5_Returns4_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(5)));
    }

    @org.junit.Test
    public final void testgetMinRating_5_Returns4_Successfully2() {
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_5_Returns4_Successfully2()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_5_Returns4_Successfully2()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(5)));
    }

    @org.junit.Test
    public final void testgetMinRating_6_Returns4_Successfully() {
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_6_Returns4_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_6_Returns4_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(6)));
    }

    @org.junit.Test
    public final void testgetMinRating_7_Returns4_Successfully() {
        org.junit.Assert.assertEquals(4, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_7_Returns4_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_7_Returns4_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(7)));
    }

    @org.junit.Test
    public final void testgetMinRating_8_Returns3_Successfully() {
        org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_8_Returns3_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_8_Returns3_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(8)));
    }

    @org.junit.Test
    public final void testgetMinRating_10_Returns3_Successfully() {
        org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_10_Returns3_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_10_Returns3_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(10)));
    }

    @org.junit.Test
    public final void testgetMinRating_11_Returns_3_Successfully() {
        org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_11_Returns_3_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testgetMinRating_11_Returns_3_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(11)));
    }

    @org.junit.Test
    public final void testGetMinRating_13_Returns_1_Successfully() {
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetMinRating_13_Returns_1_Successfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetMinRating_13_Returns_1_Successfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).getMinRating(13)));
    }

    @org.junit.Test
    public final void testcleanName_SuccessfullyClean() {
        org.junit.Assert.assertEquals("THISISATEST", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testcleanName_SuccessfullyClean()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testcleanName_SuccessfullyClean()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).cleanName("This-ís   a t.,es &t")));
    }

    @org.junit.Test
    public final void testisVowel_SingleVowel_ReturnsTrue() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisVowel_SingleVowel_ReturnsTrue()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisVowel_SingleVowel_ReturnsTrue()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isVowel("I")));
    }

    @org.junit.Test
    public final void testisEncodeEquals_CornerCase_SecondNameNothing_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_SecondNameNothing_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_SecondNameNothing_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("test", "")));
    }

    @org.junit.Test
    public final void testisEncodeEquals_CornerCase_FirstNameNothing_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_FirstNameNothing_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_FirstNameNothing_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("", "test")));
    }

    @org.junit.Test
    public final void testisEncodeEquals_CornerCase_SecondNameJustSpace_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_SecondNameJustSpace_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_SecondNameJustSpace_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("test", " ")));
    }

    @org.junit.Test
    public final void testisEncodeEquals_CornerCase_FirstNameJustSpace_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_FirstNameJustSpace_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_FirstNameJustSpace_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals(" ", "test")));
    }

    @org.junit.Test
    public final void testisEncodeEquals_CornerCase_SecondNameNull_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_SecondNameNull_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_SecondNameNull_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("test", null)));
    }

    @org.junit.Test
    public final void testisEncodeEquals_CornerCase_FirstNameNull_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_FirstNameNull_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_FirstNameNull_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals(null, "test")));
    }

    @org.junit.Test
    public final void testisEncodeEquals_CornerCase_FirstNameJust1Letter_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_FirstNameJust1Letter_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEquals_CornerCase_FirstNameJust1Letter_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("t", "test")));
    }

    @org.junit.Test
    public final void testisEncodeEqualsSecondNameJust1Letter_ReturnsFalse() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEqualsSecondNameJust1Letter_ReturnsFalse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testisEncodeEqualsSecondNameJust1Letter_ReturnsFalse()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("test", "t")));
    }

    // ***** END REGION - TEST SUPPORT METHODS
    // ***** BEGIN REGION - TEST GET MRA ENCODING
    @org.junit.Test
    public final void testGetEncoding_HARPER_HRPR() {
        org.junit.Assert.assertEquals("HRPR", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_HARPER_HRPR()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_HARPER_HRPR()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).encode("HARPER")));
    }

    @org.junit.Test
    public final void testGetEncoding_SMITH_to_SMTH() {
        org.junit.Assert.assertEquals("SMTH", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_SMITH_to_SMTH()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_SMITH_to_SMTH()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).encode("Smith")));
    }

    @org.junit.Test
    public final void testGetEncoding_SMYTH_to_SMYTH() {
        org.junit.Assert.assertEquals("SMYTH", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_SMYTH_to_SMYTH()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_SMYTH_to_SMYTH()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).encode("Smyth")));
    }

    @org.junit.Test
    public final void testGetEncoding_Space_to_Nothing() {
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_Space_to_Nothing()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_Space_to_Nothing()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).encode(" ")));
    }

    @org.junit.Test
    public final void testGetEncoding_NoSpace_to_Nothing() {
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_NoSpace_to_Nothing()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_NoSpace_to_Nothing()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).encode("")));
    }

    @org.junit.Test
    public final void testGetEncoding_Null_to_Nothing() {
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_Null_to_Nothing()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_Null_to_Nothing()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).encode(null)));
    }

    @org.junit.Test
    public final void testGetEncoding_One_Letter_to_Nothing() {
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_One_Letter_to_Nothing()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testGetEncoding_One_Letter_to_Nothing()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).encode("E")));
    }

    @org.junit.Test
    public final void testCompareNameNullSpace_ReturnsFalseSuccessfully() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompareNameNullSpace_ReturnsFalseSuccessfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompareNameNullSpace_ReturnsFalseSuccessfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, getStringEncoder()).isEncodeEquals(null, " ")));
    }

    @org.junit.Test
    public final void testCompareNameSameNames_ReturnsFalseSuccessfully() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompareNameSameNames_ReturnsFalseSuccessfully()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompareNameSameNames_ReturnsFalseSuccessfully()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, getStringEncoder()).isEncodeEquals("John", "John")));
    }

    // ***** END REGION - TEST GET MRA ENCODING
    // ***** BEGIN REGION - TEST GET MRA COMPARISONS
    @org.junit.Test
    public final void testCompare_SMITH_SMYTH_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SMITH_SMYTH_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SMITH_SMYTH_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("smith", "smyth")));
    }

    @org.junit.Test
    public final void testCompare_BURNS_BOURNE_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_BURNS_BOURNE_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_BURNS_BOURNE_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Burns", "Bourne")));
    }

    @org.junit.Test
    public final void testCompare_ShortNames_AL_ED_WorksButNoMatch() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_ShortNames_AL_ED_WorksButNoMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_ShortNames_AL_ED_WorksButNoMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Al", "Ed")));
    }

    @org.junit.Test
    public final void testCompare_CATHERINE_KATHRYN_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_CATHERINE_KATHRYN_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_CATHERINE_KATHRYN_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Catherine", "Kathryn")));
    }

    @org.junit.Test
    public final void testCompare_BRIAN_BRYAN_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_BRIAN_BRYAN_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_BRIAN_BRYAN_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Brian", "Bryan")));
    }

    @org.junit.Test
    public final void testCompare_SEAN_SHAUN_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SEAN_SHAUN_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SEAN_SHAUN_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Séan", "Shaun")));
    }

    @org.junit.Test
    public final void testCompare_COLM_COLIN_WithAccentsAndSymbolsAndSpaces_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_COLM_COLIN_WithAccentsAndSymbolsAndSpaces_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_COLM_COLIN_WithAccentsAndSymbolsAndSpaces_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Cólm.   ", "C-olín")));
    }

    @org.junit.Test
    public final void testCompare_STEPHEN_STEVEN_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_STEPHEN_STEVEN_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_STEPHEN_STEVEN_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Stephen", "Steven")));
    }

    @org.junit.Test
    public final void testCompare_STEVEN_STEFAN_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_STEVEN_STEFAN_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_STEVEN_STEFAN_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Steven", "Stefan")));
    }

    @org.junit.Test
    public final void testCompare_STEPHEN_STEFAN_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_STEPHEN_STEFAN_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_STEPHEN_STEFAN_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Stephen", "Stefan")));
    }

    @org.junit.Test
    public final void testCompare_SAM_SAMUEL_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SAM_SAMUEL_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SAM_SAMUEL_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Sam", "Samuel")));
    }

    @org.junit.Test
    public final void testCompare_MICKY_MICHAEL_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_MICKY_MICHAEL_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_MICKY_MICHAEL_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Micky", "Michael")));
    }

    @org.junit.Test
    public final void testCompare_OONA_OONAGH_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_OONA_OONAGH_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_OONA_OONAGH_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Oona", "Oonagh")));
    }

    @org.junit.Test
    public final void testCompare_SOPHIE_SOFIA_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SOPHIE_SOFIA_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SOPHIE_SOFIA_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Sophie", "Sofia")));
    }

    @org.junit.Test
    public final void testCompare_FRANCISZEK_FRANCES_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_FRANCISZEK_FRANCES_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_FRANCISZEK_FRANCES_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Franciszek", "Frances")));
    }

    @org.junit.Test
    public final void testCompare_TOMASZ_TOM_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_TOMASZ_TOM_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_TOMASZ_TOM_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Tomasz", "tom")));
    }

    @org.junit.Test
    public final void testCompare_SmallInput_CARK_Kl_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SmallInput_CARK_Kl_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SmallInput_CARK_Kl_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Kl", "Karl")));
    }

    @org.junit.Test
    public final void testCompareNameToSingleLetter_KARL_C_DoesNotMatch() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompareNameToSingleLetter_KARL_C_DoesNotMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompareNameToSingleLetter_KARL_C_DoesNotMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Karl", "C")));
    }

    @org.junit.Test
    public final void testCompare_ZACH_ZAKARIA_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_ZACH_ZAKARIA_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_ZACH_ZAKARIA_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Zach", "Zacharia")));
    }

    @org.junit.Test
    public final void testCompare_KARL_ALESSANDRO_DoesNotMatch() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_KARL_ALESSANDRO_DoesNotMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_KARL_ALESSANDRO_DoesNotMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Karl", "Alessandro")));
    }

    @org.junit.Test
    public final void testCompare_Forenames_UNA_OONAGH_ShouldSuccessfullyMatchButDoesNot() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Forenames_UNA_OONAGH_ShouldSuccessfullyMatchButDoesNot()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Forenames_UNA_OONAGH_ShouldSuccessfullyMatchButDoesNot()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Úna", "Oonagh")));// Disappointing

    }

    // ***** Begin Region - Test Get Encoding - Surnames
    @org.junit.Test
    public final void testCompare_Surname_OSULLIVAN_OSUILLEABHAIN_SuccessfulMatch() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_OSULLIVAN_OSUILLEABHAIN_SuccessfulMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_OSULLIVAN_OSUILLEABHAIN_SuccessfulMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("O'Sullivan", "Ó ' Súilleabháin")));
    }

    @org.junit.Test
    public final void testCompare_LongSurnames_MORIARTY_OMUIRCHEARTAIGH_DoesNotSuccessfulMatch() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_LongSurnames_MORIARTY_OMUIRCHEARTAIGH_DoesNotSuccessfulMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_LongSurnames_MORIARTY_OMUIRCHEARTAIGH_DoesNotSuccessfulMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Moriarty", "OMuircheartaigh")));
    }

    @org.junit.Test
    public final void testCompare_LongSurnames_OMUIRCHEARTAIGH_OMIREADHAIGH_SuccessfulMatch() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_LongSurnames_OMUIRCHEARTAIGH_OMIREADHAIGH_SuccessfulMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_LongSurnames_OMUIRCHEARTAIGH_OMIREADHAIGH_SuccessfulMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("o'muireadhaigh", "Ó 'Muircheartaigh ")));
    }

    @org.junit.Test
    public final void testCompare_Surname_COOPERFLYNN_SUPERLYN_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_COOPERFLYNN_SUPERLYN_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_COOPERFLYNN_SUPERLYN_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Cooper-Flynn", "Super-Lyn")));
    }

    @org.junit.Test
    public final void testCompare_Surname_HAILEY_HALLEY_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_HAILEY_HALLEY_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_HAILEY_HALLEY_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Hailey", "Halley")));
    }

    // **** BEGIN YIDDISH/SLAVIC SECTION ****
    @org.junit.Test
    public final void testCompare_Surname_AUERBACH_UHRBACH_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_AUERBACH_UHRBACH_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_AUERBACH_UHRBACH_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Auerbach", "Uhrbach")));
    }

    @org.junit.Test
    public final void testCompare_Surname_MOSKOWITZ_MOSKOVITZ_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_MOSKOWITZ_MOSKOVITZ_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_MOSKOWITZ_MOSKOVITZ_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Moskowitz", "Moskovitz")));
    }

    @org.junit.Test
    public final void testCompare_Surname_LIPSHITZ_LIPPSZYC_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_LIPSHITZ_LIPPSZYC_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_LIPSHITZ_LIPPSZYC_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("LIPSHITZ", "LIPPSZYC")));
    }

    @org.junit.Test
    public final void testCompare_Surname_LEWINSKY_LEVINSKI_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_LEWINSKY_LEVINSKI_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_LEWINSKY_LEVINSKI_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("LEWINSKY", "LEVINSKI")));
    }

    @org.junit.Test
    public final void testCompare_Surname_SZLAMAWICZ_SHLAMOVITZ_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_SZLAMAWICZ_SHLAMOVITZ_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_SZLAMAWICZ_SHLAMOVITZ_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("SZLAMAWICZ", "SHLAMOVITZ")));
    }

    @org.junit.Test
    public final void testCompare_Surname_ROSOCHOWACIEC_ROSOKHOVATSETS_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_ROSOCHOWACIEC_ROSOKHOVATSETS_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_ROSOCHOWACIEC_ROSOKHOVATSETS_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("R o s o ch o w a c ie c", " R o s o k ho v a ts e ts")));
    }

    @org.junit.Test
    public final void testCompare_Surname_PRZEMYSL_PSHEMESHIL_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_PRZEMYSL_PSHEMESHIL_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surname_PRZEMYSL_PSHEMESHIL_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals(" P rz e m y s l", " P sh e m e sh i l")));
    }

    // **** END YIDDISH/SLAVIC SECTION ****
    @org.junit.Test
    public final void testCompare_PETERSON_PETERS_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_PETERSON_PETERS_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_PETERSON_PETERS_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Peterson", "Peters")));
    }

    @org.junit.Test
    public final void testCompare_MCGOWAN_MCGEOGHEGAN_SuccessfullyMatched() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_MCGOWAN_MCGEOGHEGAN_SuccessfullyMatched()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_MCGOWAN_MCGEOGHEGAN_SuccessfullyMatched()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("McGowan", "Mc Geoghegan")));
    }

    @org.junit.Test
    public final void testCompare_SurnamesCornerCase_MURPHY_Space_NoMatch() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SurnamesCornerCase_MURPHY_Space_NoMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SurnamesCornerCase_MURPHY_Space_NoMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Murphy", " ")));
    }

    @org.junit.Test
    public final void testCompare_SurnamesCornerCase_MURPHY_NoSpace_NoMatch() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SurnamesCornerCase_MURPHY_NoSpace_NoMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SurnamesCornerCase_MURPHY_NoSpace_NoMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Murphy", "")));
    }

    @org.junit.Test
    public final void testCompare_SurnameCornerCase_Nulls_NoMatch() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SurnameCornerCase_Nulls_NoMatch()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_SurnameCornerCase_Nulls_NoMatch()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals(null, null)));
    }

    @org.junit.Test
    public final void testCompare_Surnames_MURPHY_LYNCH_NoMatchExpected() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surnames_MURPHY_LYNCH_NoMatchExpected()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Surnames_MURPHY_LYNCH_NoMatchExpected()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Murphy", "Lynch")));
    }

    @org.junit.Test
    public final void testCompare_Forenames_SEAN_JOHN_MatchExpected() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Forenames_SEAN_JOHN_MatchExpected()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Forenames_SEAN_JOHN_MatchExpected()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Sean", "John")));
    }

    @org.junit.Test
    public final void testCompare_Forenames_SEAN_PETE_NoMatchExpected() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Forenames_SEAN_PETE_NoMatchExpected()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|testCompare_Forenames_SEAN_PETE_NoMatchExpected()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, this.getStringEncoder()).isEncodeEquals("Sean", "Pete")));
    }

    @java.lang.Override
    protected org.apache.commons.codec.language.MatchRatingApproachEncoder createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.MatchRatingApproachEncoder>observeState("org.apache.commons.codec.language.MatchRatingApproachEncoderTest|createStringEncoder()|0", org.apache.commons.codec.language.MatchRatingApproachEncoder.class, new org.apache.commons.codec.language.MatchRatingApproachEncoder());
    }
}

