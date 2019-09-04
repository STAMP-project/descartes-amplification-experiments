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
 * Tests Caverphone2.
 *
 * @version $Id$
 * @since 1.5
 */
public class Caverphone2Test extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.Caverphone2> {
    @java.lang.Override
    protected org.apache.commons.codec.language.Caverphone2 createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Caverphone2>observeState("org.apache.commons.codec.language.Caverphone2Test|createStringEncoder()|0", org.apache.commons.codec.language.Caverphone2.class, new org.apache.commons.codec.language.Caverphone2());
    }

    /**
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     *
     * AT11111111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testCaverphoneRevisitedCommonCodeAT11111111() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("AT11111111", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedCommonCodeAT11111111()|0", java.lang.String[].class, new java.lang.String[]{ "add", "aid", "at", "art", "eat", "earth", "head", "hit", "hot", "hold", "hard", "heart", "it", "out", "old" }));
    }

    /**
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testCaverphoneRevisitedExamples() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedExamples()|2", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedExamples()|0", java.lang.String[].class, new java.lang.String[]{ "Stevenson", "STFNSN1111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedExamples()|1", java.lang.String[].class, new java.lang.String[]{ "Peter", "PTA1111111" }) });
        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedExamples()|3", java.lang.String[][].class, data));
    }

    /**
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testCaverphoneRevisitedRandomNameKLN1111111() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("KLN1111111", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedRandomNameKLN1111111()|0", java.lang.String[].class, new java.lang.String[]{ "Cailean", "Calan", "Calen", "Callahan", "Callan", "Callean", "Carleen", "Carlen", "Carlene", "Carlin", "Carline", "Carlyn", "Carlynn", "Carlynne", "Charlean", "Charleen", "Charlene", "Charline", "Cherlyn", "Chirlin", "Clein", "Cleon", "Cline", "Cohleen", "Colan", "Coleen", "Colene", "Colin", "Colleen", "Collen", "Collin", "Colline", "Colon", "Cullan", "Cullen", "Cullin", "Gaelan", "Galan", "Galen", "Garlan", "Garlen", "Gaulin", "Gayleen", "Gaylene", "Giliane", "Gillan", "Gillian", "Glen", "Glenn", "Glyn", "Glynn", "Gollin", "Gorlin", "Kalin", "Karlan", "Karleen", "Karlen", "Karlene", "Karlin", "Karlyn", "Kaylyn", "Keelin", "Kellen", "Kellene", "Kellyann", "Kellyn", "Khalin", "Kilan", "Kilian", "Killen", "Killian", "Killion", "Klein", "Kleon", "Kline", "Koerlin", "Kylen", "Kylynn", "Quillan", "Quillon", "Qulllon", "Xylon" }));
    }

    /**
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testCaverphoneRevisitedRandomNameTN11111111() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("TN11111111", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedRandomNameTN11111111()|0", java.lang.String[].class, new java.lang.String[]{ "Dan", "Dane", "Dann", "Darn", "Daune", "Dawn", "Ddene", "Dean", "Deane", "Deanne", "DeeAnn", "Deeann", "Deeanne", "Deeyn", "Den", "Dene", "Denn", "Deonne", "Diahann", "Dian", "Diane", "Diann", "Dianne", "Diannne", "Dine", "Dion", "Dione", "Dionne", "Doane", "Doehne", "Don", "Donn", "Doone", "Dorn", "Down", "Downe", "Duane", "Dun", "Dunn", "Duyne", "Dyan", "Dyane", "Dyann", "Dyanne", "Dyun", "Tan", "Tann", "Teahan", "Ten", "Tenn", "Terhune", "Thain", "Thaine", "Thane", "Thanh", "Thayne", "Theone", "Thin", "Thorn", "Thorne", "Thun", "Thynne", "Tien", "Tine", "Tjon", "Town", "Towne", "Turne", "Tyne" }));
    }

    /**
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testCaverphoneRevisitedRandomNameTTA1111111() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("TTA1111111", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedRandomNameTTA1111111()|0", java.lang.String[].class, new java.lang.String[]{ "Darda", "Datha", "Dedie", "Deedee", "Deerdre", "Deidre", "Deirdre", "Detta", "Didi", "Didier", "Dido", "Dierdre", "Dieter", "Dita", "Ditter", "Dodi", "Dodie", "Dody", "Doherty", "Dorthea", "Dorthy", "Doti", "Dotti", "Dottie", "Dotty", "Doty", "Doughty", "Douty", "Dowdell", "Duthie", "Tada", "Taddeo", "Tadeo", "Tadio", "Tati", "Teador", "Tedda", "Tedder", "Teddi", "Teddie", "Teddy", "Tedi", "Tedie", "Teeter", "Teodoor", "Teodor", "Terti", "Theda", "Theodor", "Theodore", "Theta", "Thilda", "Thordia", "Tilda", "Tildi", "Tildie", "Tildy", "Tita", "Tito", "Tjader", "Toddie", "Toddy", "Torto", "Tuddor", "Tudor", "Turtle", "Tuttle", "Tutto" }));
    }

    /**
     * See http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testCaverphoneRevisitedRandomWords() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("RTA1111111", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedRandomWords()|0", java.lang.String[].class, new java.lang.String[]{ "rather", "ready", "writer" }));
        this.checkEncoding("SSA1111111", "social");
        this.checkEncodingVariations("APA1111111", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testCaverphoneRevisitedRandomWords()|1", java.lang.String[].class, new java.lang.String[]{ "able", "appear" }));
    }

    @org.junit.Test
    public void testEndMb() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone2Test|testEndMb()|2", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testEndMb()|0", java.lang.String[].class, new java.lang.String[]{ "mb", "M111111111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testEndMb()|1", java.lang.String[].class, new java.lang.String[]{ "mbmb", "MPM1111111" }) });
        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone2Test|testEndMb()|3", java.lang.String[][].class, data));
    }

    // Caverphone Revisited
    @org.junit.Test
    public void testIsCaverphoneEquals() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.Caverphone2 caverphone = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Caverphone2>observeState("org.apache.commons.codec.language.Caverphone2Test|testIsCaverphoneEquals()|0", org.apache.commons.codec.language.Caverphone2.class, new org.apache.commons.codec.language.Caverphone2());
        org.junit.Assert.assertFalse("Caverphone encodings should not be equal", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.Caverphone2Test|testIsCaverphoneEquals()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Caverphone2>observeState("org.apache.commons.codec.language.Caverphone2Test|testIsCaverphoneEquals()|1", org.apache.commons.codec.language.Caverphone2.class, caverphone).isEncodeEqual("Peter", "Stevenson")));
        org.junit.Assert.assertTrue("Caverphone encodings should be equal", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.Caverphone2Test|testIsCaverphoneEquals()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Caverphone2>observeState("org.apache.commons.codec.language.Caverphone2Test|testIsCaverphoneEquals()|3", org.apache.commons.codec.language.Caverphone2.class, caverphone).isEncodeEqual("Peter", "Peady")));
    }

    @org.junit.Test
    public void testSpecificationExamples() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|7", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|0", java.lang.String[].class, new java.lang.String[]{ "Peter", "PTA1111111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|1", java.lang.String[].class, new java.lang.String[]{ "ready", "RTA1111111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|2", java.lang.String[].class, new java.lang.String[]{ "social", "SSA1111111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|3", java.lang.String[].class, new java.lang.String[]{ "able", "APA1111111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|4", java.lang.String[].class, new java.lang.String[]{ "Tedder", "TTA1111111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|5", java.lang.String[].class, new java.lang.String[]{ "Karleen", "KLN1111111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|6", java.lang.String[].class, new java.lang.String[]{ "Dyun", "TN11111111" }) });
        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone2Test|testSpecificationExamples()|8", java.lang.String[][].class, data));
    }
}

