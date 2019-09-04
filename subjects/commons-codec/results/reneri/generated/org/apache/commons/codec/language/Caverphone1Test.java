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
 * Tests Caverphone1.
 *
 * @version $Id: CaverphoneTest.java 1075947 2011-03-01 17:56:14Z ggregory $
 * @since 1.5
 */
public class Caverphone1Test extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.Caverphone1> {
    @java.lang.Override
    protected org.apache.commons.codec.language.Caverphone1 createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Caverphone1>observeState("org.apache.commons.codec.language.Caverphone1Test|createStringEncoder()|0", org.apache.commons.codec.language.Caverphone1.class, new org.apache.commons.codec.language.Caverphone1());
    }

    /**
     * Tests example adapted from version 2.0  http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     *
     * AT1111 words: add, aid, at, art, eat, earth, head, hit, hot, hold, hard, heart, it, out, old
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testCaverphoneRevisitedCommonCodeAT1111() throws org.apache.commons.codec.EncoderException {
        this.checkEncodingVariations("AT1111", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone1Test|testCaverphoneRevisitedCommonCodeAT1111()|0", java.lang.String[].class, new java.lang.String[]{ "add", "aid", "at", "art", "eat", "earth", "head", "hit", "hot", "hold", "hard", "heart", "it", "out", "old" }));
    }

    @org.junit.Test
    public void testEndMb() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone1Test|testEndMb()|2", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone1Test|testEndMb()|0", java.lang.String[].class, new java.lang.String[]{ "mb", "M11111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone1Test|testEndMb()|1", java.lang.String[].class, new java.lang.String[]{ "mbmb", "MPM111" }) });
        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone1Test|testEndMb()|3", java.lang.String[][].class, data));
    }

    /**
     * Tests some examples from version 2.0 http://caversham.otago.ac.nz/files/working/ctp150804.pdf
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testIsCaverphoneEquals() throws org.apache.commons.codec.EncoderException {
        final org.apache.commons.codec.language.Caverphone1 caverphone = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Caverphone1>observeState("org.apache.commons.codec.language.Caverphone1Test|testIsCaverphoneEquals()|0", org.apache.commons.codec.language.Caverphone1.class, new org.apache.commons.codec.language.Caverphone1());
        org.junit.Assert.assertFalse("Caverphone encodings should not be equal", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.Caverphone1Test|testIsCaverphoneEquals()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Caverphone1>observeState("org.apache.commons.codec.language.Caverphone1Test|testIsCaverphoneEquals()|1", org.apache.commons.codec.language.Caverphone1.class, caverphone).isEncodeEqual("Peter", "Stevenson")));
        org.junit.Assert.assertTrue("Caverphone encodings should be equal", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.Caverphone1Test|testIsCaverphoneEquals()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Caverphone1>observeState("org.apache.commons.codec.language.Caverphone1Test|testIsCaverphoneEquals()|3", org.apache.commons.codec.language.Caverphone1.class, caverphone).isEncodeEqual("Peter", "Peady")));
    }

    /**
     * Tests example from http://caversham.otago.ac.nz/files/working/ctp060902.pdf
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testSpecificationV1Examples() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone1Test|testSpecificationV1Examples()|2", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone1Test|testSpecificationV1Examples()|0", java.lang.String[].class, new java.lang.String[]{ "David", "TFT111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone1Test|testSpecificationV1Examples()|1", java.lang.String[].class, new java.lang.String[]{ "Whittle", "WTL111" }) });
        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone1Test|testSpecificationV1Examples()|3", java.lang.String[][].class, data));
    }

    /**
     * Tests examples from http://en.wikipedia.org/wiki/Caverphone
     *
     * @throws EncoderException
     * 		
     */
    @org.junit.Test
    public void testWikipediaExamples() throws org.apache.commons.codec.EncoderException {
        final java.lang.String[][] data = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone1Test|testWikipediaExamples()|2", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone1Test|testWikipediaExamples()|0", java.lang.String[].class, new java.lang.String[]{ "Lee", "L11111" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.Caverphone1Test|testWikipediaExamples()|1", java.lang.String[].class, new java.lang.String[]{ "Thompson", "TMPSN1" }) });
        this.checkEncodings(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.Caverphone1Test|testWikipediaExamples()|3", java.lang.String[][].class, data));
    }
}

