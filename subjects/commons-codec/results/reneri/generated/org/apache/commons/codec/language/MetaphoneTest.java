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
 *
 *
 * @version $Id$
 */
public class MetaphoneTest extends org.apache.commons.codec.StringEncoderAbstractTest<org.apache.commons.codec.language.Metaphone> {
    public void assertIsMetaphoneEqual(final java.lang.String source, final java.lang.String[] matches) {
        // match source to all matches
        for (final java.lang.String matche : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|0", java.lang.String[].class, matches)) {
            org.junit.Assert.assertTrue(((("Source: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|1", source))) + ", should have same Metaphone as: ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|2", matche))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|3", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).isMetaphoneEqual(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|4", source), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|5", matche))));
        }
        // match to each other
        for (final java.lang.String matche : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|7", java.lang.String[].class, matches)) {
            for (final java.lang.String matche2 : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|8", java.lang.String[].class, matches)) {
                org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|9", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).isMetaphoneEqual(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|10", matche), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertIsMetaphoneEqual(java.lang.String,java.lang.String[])|11", matche2))));
            }
        }
    }

    public void assertMetaphoneEqual(final java.lang.String[][] pairs) {
        this.validateFixture(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|0", java.lang.String[][].class, pairs));
        for (final java.lang.String[] pair : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|1", java.lang.String[][].class, pairs)) {
            final java.lang.String name0 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|2", java.lang.String[].class, pair)[0]);
            final java.lang.String name1 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|4", java.lang.String[].class, pair)[1]);
            final java.lang.String failMsg = (("Expected match between " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|6", name0))) + " and ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|7", name1));
            org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|8", failMsg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|9", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).isMetaphoneEqual(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|10", name0), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|11", name1))));
            org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|13", failMsg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|14", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).isMetaphoneEqual(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|15", name1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|assertMetaphoneEqual(java.lang.String[][])|16", name0))));
        }
    }

    @java.lang.Override
    protected org.apache.commons.codec.language.Metaphone createStringEncoder() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|createStringEncoder()|0", org.apache.commons.codec.language.Metaphone.class, new org.apache.commons.codec.language.Metaphone());
    }

    @org.junit.Test
    public void testIsMetaphoneEqual1() {
        this.assertMetaphoneEqual(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqual1()|4", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqual1()|0", java.lang.String[].class, new java.lang.String[]{ "Case", "case" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqual1()|1", java.lang.String[].class, new java.lang.String[]{ "CASE", "Case" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqual1()|2", java.lang.String[].class, new java.lang.String[]{ "caSe", "cAsE" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqual1()|3", java.lang.String[].class, new java.lang.String[]{ "quick", "cookie" }) }));
    }

    /**
     * Matches computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqual2() {
        this.assertMetaphoneEqual(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqual2()|2", java.lang.String[][].class, new java.lang.String[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqual2()|0", java.lang.String[].class, new java.lang.String[]{ "Lawrence", "Lorenza" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqual2()|1", java.lang.String[].class, new java.lang.String[]{ "Gary", "Cahra" }) }));
    }

    /**
     * Initial AE case.
     *
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualAero() {
        this.assertIsMetaphoneEqual("Aero", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualAero()|0", java.lang.String[].class, new java.lang.String[]{ "Eure" }));
    }

    /**
     * Initial WH case.
     *
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualWhite() {
        this.assertIsMetaphoneEqual("White", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualWhite()|0", java.lang.String[].class, new java.lang.String[]{ "Wade", "Wait", "Waite", "Wat", "Whit", "Wiatt", "Wit", "Wittie", "Witty", "Wood", "Woodie", "Woody" }));
    }

    /**
     * Initial A, not followed by an E case.
     *
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualAlbert() {
        this.assertIsMetaphoneEqual("Albert", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualAlbert()|0", java.lang.String[].class, new java.lang.String[]{ "Ailbert", "Alberik", "Albert", "Alberto", "Albrecht" }));
    }

    /**
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualGary() {
        this.assertIsMetaphoneEqual("Gary", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualGary()|0", java.lang.String[].class, new java.lang.String[]{ "Cahra", "Cara", "Carey", "Cari", "Caria", "Carie", "Caro", "Carree", "Carri", "Carrie", "Carry", "Cary", "Cora", "Corey", "Cori", "Corie", "Correy", "Corri", "Corrie", "Corry", "Cory", "Gray", "Kara", "Kare", "Karee", "Kari", "Karia", "Karie", "Karrah", "Karrie", "Karry", "Kary", "Keri", "Kerri", "Kerrie", "Kerry", "Kira", "Kiri", "Kora", "Kore", "Kori", "Korie", "Korrie", "Korry" }));
    }

    /**
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualJohn() {
        this.assertIsMetaphoneEqual("John", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualJohn()|0", java.lang.String[].class, new java.lang.String[]{ "Gena", "Gene", "Genia", "Genna", "Genni", "Gennie", "Genny", "Giana", "Gianna", "Gina", "Ginni", "Ginnie", "Ginny", "Jaine", "Jan", "Jana", "Jane", "Janey", "Jania", "Janie", "Janna", "Jany", "Jayne", "Jean", "Jeana", "Jeane", "Jeanie", "Jeanna", "Jeanne", "Jeannie", "Jen", "Jena", "Jeni", "Jenn", "Jenna", "Jennee", "Jenni", "Jennie", "Jenny", "Jinny", "Jo Ann", "Jo-Ann", "Jo-Anne", "Joan", "Joana", "Joane", "Joanie", "Joann", "Joanna", "Joanne", "Joeann", "Johna", "Johnna", "Joni", "Jonie", "Juana", "June", "Junia", "Junie" }));
    }

    /**
     * Initial KN case.
     *
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualKnight() {
        this.assertIsMetaphoneEqual("Knight", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualKnight()|0", java.lang.String[].class, new java.lang.String[]{ "Hynda", "Nada", "Nadia", "Nady", "Nat", "Nata", "Natty", "Neda", "Nedda", "Nedi", "Netta", "Netti", "Nettie", "Netty", "Nita", "Nydia" }));
    }

    /**
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualMary() {
        this.assertIsMetaphoneEqual("Mary", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualMary()|0", java.lang.String[].class, new java.lang.String[]{ "Mair", "Maire", "Mara", "Mareah", "Mari", "Maria", "Marie", "Mary", "Maura", "Maure", "Meara", "Merrie", "Merry", "Mira", "Moira", "Mora", "Moria", "Moyra", "Muire", "Myra", "Myrah" }));
    }

    /**
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualParis() {
        this.assertIsMetaphoneEqual("Paris", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualParis()|0", java.lang.String[].class, new java.lang.String[]{ "Pearcy", "Perris", "Piercy", "Pierz", "Pryse" }));
    }

    /**
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualPeter() {
        this.assertIsMetaphoneEqual("Peter", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualPeter()|0", java.lang.String[].class, new java.lang.String[]{ "Peadar", "Peder", "Pedro", "Peter", "Petr", "Peyter", "Pieter", "Pietro", "Piotr" }));
    }

    /**
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualRay() {
        this.assertIsMetaphoneEqual("Ray", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualRay()|0", java.lang.String[].class, new java.lang.String[]{ "Ray", "Rey", "Roi", "Roy", "Ruy" }));
    }

    /**
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualSusan() {
        this.assertIsMetaphoneEqual("Susan", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualSusan()|0", java.lang.String[].class, new java.lang.String[]{ "Siusan", "Sosanna", "Susan", "Susana", "Susann", "Susanna", "Susannah", "Susanne", "Suzann", "Suzanna", "Suzanne", "Zuzana" }));
    }

    /**
     * Initial WR case.
     *
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualWright() {
        this.assertIsMetaphoneEqual("Wright", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualWright()|0", java.lang.String[].class, new java.lang.String[]{ "Rota", "Rudd", "Ryde" }));
    }

    /**
     * Match data computed from http://www.lanw.com/java/phonetic/default.htm
     */
    @org.junit.Test
    public void testIsMetaphoneEqualXalan() {
        this.assertIsMetaphoneEqual("Xalan", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|testIsMetaphoneEqualXalan()|0", java.lang.String[].class, new java.lang.String[]{ "Celene", "Celina", "Celine", "Selena", "Selene", "Selina", "Seline", "Suellen", "Xylina" }));
    }

    @org.junit.Test
    public void testMetaphone() {
        org.junit.Assert.assertEquals("HL", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("howl")));
        org.junit.Assert.assertEquals("TSTN", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("testing")));
        org.junit.Assert.assertEquals("0", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|4", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("The")));
        org.junit.Assert.assertEquals("KK", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|6", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("quick")));
        org.junit.Assert.assertEquals("BRN", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|8", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("brown")));
        org.junit.Assert.assertEquals("FKS", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|10", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("fox")));
        org.junit.Assert.assertEquals("JMPT", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|12", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("jumped")));
        org.junit.Assert.assertEquals("OFR", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|14", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("over")));
        org.junit.Assert.assertEquals("0", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|16", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("the")));
        org.junit.Assert.assertEquals("LS", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|18", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("lazy")));
        org.junit.Assert.assertEquals("TKS", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testMetaphone()|20", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("dogs")));
    }

    @org.junit.Test
    public void testWordEndingInMB() {
        org.junit.Assert.assertEquals("KM", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testWordEndingInMB()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testWordEndingInMB()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("COMB")));
        org.junit.Assert.assertEquals("TM", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testWordEndingInMB()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testWordEndingInMB()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("TOMB")));
        org.junit.Assert.assertEquals("WM", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testWordEndingInMB()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testWordEndingInMB()|4", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("WOMB")));
    }

    @org.junit.Test
    public void testDiscardOfSCEOrSCIOrSCY() {
        org.junit.Assert.assertEquals("SNS", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSCEOrSCIOrSCY()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSCEOrSCIOrSCY()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("SCIENCE")));
        org.junit.Assert.assertEquals("SN", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSCEOrSCIOrSCY()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSCEOrSCIOrSCY()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("SCENE")));
        org.junit.Assert.assertEquals("S", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSCEOrSCIOrSCY()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSCEOrSCIOrSCY()|4", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("SCY")));
    }

    /**
     * Tests (CODEC-57) Metaphone.metaphone(String) returns an empty string when passed the word "why"
     */
    @org.junit.Test
    public void testWhy() {
        // PHP returns "H". The original metaphone returns an empty string.
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testWhy()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testWhy()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("WHY")));
    }

    @org.junit.Test
    public void testWordsWithCIA() {
        org.junit.Assert.assertEquals("XP", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testWordsWithCIA()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testWordsWithCIA()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("CIAPO")));
    }

    @org.junit.Test
    public void testTranslateOfSCHAndCH() {
        org.junit.Assert.assertEquals("SKTL", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTranslateOfSCHAndCH()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTranslateOfSCHAndCH()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("SCHEDULE")));
        org.junit.Assert.assertEquals("SKMT", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTranslateOfSCHAndCH()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTranslateOfSCHAndCH()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("SCHEMATIC")));
        org.junit.Assert.assertEquals("KRKT", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTranslateOfSCHAndCH()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTranslateOfSCHAndCH()|4", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("CHARACTER")));
        org.junit.Assert.assertEquals("TX", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTranslateOfSCHAndCH()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTranslateOfSCHAndCH()|6", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("TEACH")));
    }

    @org.junit.Test
    public void testTranslateToJOfDGEOrDGIOrDGY() {
        org.junit.Assert.assertEquals("TJ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTranslateToJOfDGEOrDGIOrDGY()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTranslateToJOfDGEOrDGIOrDGY()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("DODGY")));
        org.junit.Assert.assertEquals("TJ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTranslateToJOfDGEOrDGIOrDGY()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTranslateToJOfDGEOrDGIOrDGY()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("DODGE")));
        org.junit.Assert.assertEquals("AJMT", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTranslateToJOfDGEOrDGIOrDGY()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTranslateToJOfDGEOrDGIOrDGY()|4", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("ADGIEMTI")));
    }

    @org.junit.Test
    public void testDiscardOfSilentHAfterG() {
        org.junit.Assert.assertEquals("KNT", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSilentHAfterG()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSilentHAfterG()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("GHENT")));
        org.junit.Assert.assertEquals("B", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSilentHAfterG()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSilentHAfterG()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("BAUGH")));
    }

    @org.junit.Test
    public void testDiscardOfSilentGN() {
        // NOTE: This does not test for silent GN, but for starting with GN
        org.junit.Assert.assertEquals("N", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSilentGN()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSilentGN()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("GNU")));
        // NOTE: Trying to test for GNED, but expected code does not appear to execute
        org.junit.Assert.assertEquals("SNT", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSilentGN()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testDiscardOfSilentGN()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("SIGNED")));
    }

    @org.junit.Test
    public void testPHTOF() {
        org.junit.Assert.assertEquals("FX", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testPHTOF()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testPHTOF()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("PHISH")));
    }

    @org.junit.Test
    public void testSHAndSIOAndSIAToX() {
        org.junit.Assert.assertEquals("XT", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testSHAndSIOAndSIAToX()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testSHAndSIOAndSIAToX()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("SHOT")));
        org.junit.Assert.assertEquals("OTXN", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testSHAndSIOAndSIAToX()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testSHAndSIOAndSIAToX()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("ODSIAN")));
        org.junit.Assert.assertEquals("PLXN", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testSHAndSIOAndSIAToX()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testSHAndSIOAndSIAToX()|4", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("PULSION")));
    }

    @org.junit.Test
    public void testTIOAndTIAToX() {
        org.junit.Assert.assertEquals("OX", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTIOAndTIAToX()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTIOAndTIAToX()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("OTIA")));
        org.junit.Assert.assertEquals("PRXN", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTIOAndTIAToX()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTIOAndTIAToX()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("PORTION")));
    }

    @org.junit.Test
    public void testTCH() {
        org.junit.Assert.assertEquals("RX", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTCH()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTCH()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("RETCH")));
        org.junit.Assert.assertEquals("WX", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testTCH()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testTCH()|2", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("WATCH")));
    }

    @org.junit.Test
    public void testExceedLength() {
        // should be AKSKS, but istruncated by Max Code Length
        org.junit.Assert.assertEquals("AKSK", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testExceedLength()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testExceedLength()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("AXEAXE")));
    }

    @org.junit.Test
    public void testSetMaxLengthWithTruncation() {
        // should be AKSKS, but istruncated by Max Code Length
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testSetMaxLengthWithTruncation()|0", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).setMaxCodeLen(6);
        org.junit.Assert.assertEquals("AKSKSK", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|testSetMaxLengthWithTruncation()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.Metaphone>observeState("org.apache.commons.codec.language.MetaphoneTest|testSetMaxLengthWithTruncation()|1", org.apache.commons.codec.language.Metaphone.class, this.getStringEncoder()).metaphone("AXEAXEAXE")));
    }

    public void validateFixture(final java.lang.String[][] pairs) {
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|0", java.lang.String[][].class, pairs).length)) == 0) {
            org.junit.Assert.fail("Test fixture is empty");
        }
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|2", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|3", java.lang.String[][].class, pairs).length)); i++) {
            if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|7", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[][]>observeState("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|5", java.lang.String[][].class, pairs)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|6", i)]).length)) != 2) {
                org.junit.Assert.fail(("Error in test fixture in the data array at index " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.MetaphoneTest|validateFixture(java.lang.String[][])|9", i))));
            }
        }
    }
}

