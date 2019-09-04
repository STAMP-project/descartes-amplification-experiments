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
 * Tests PhoneticEngine.
 *
 * @since 1.6
 */
@org.junit.runner.RunWith(org.junit.runners.Parameterized.class)
public class PhoneticEngineTest {
    private static final java.lang.Integer TEN = java.lang.Integer.valueOf(10);

    @org.junit.runners.Parameterized.Parameters(name = "{0}-{1}-{2}-{3}")
    public static java.util.List<java.lang.Object[]> data() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Object[]>>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|40", java.util.List.class, java.util.Arrays.asList(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|4", java.lang.Object[].class, new java.lang.Object[]{ "Renault", "rinD|rinDlt|rina|rinalt|rino|rinolt|rinu|rinult", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|0", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|1", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.APPROX), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|2", java.lang.Boolean.TRUE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|3", org.apache.commons.codec.language.bm.PhoneticEngineTest.TEN) }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|9", java.lang.Object[].class, new java.lang.Object[]{ "Renault", "rYnDlt|rYnalt|rYnult|rinDlt|rinalt|rinolt|rinult", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|5", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.ASHKENAZI), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|6", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.APPROX), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|7", java.lang.Boolean.TRUE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|8", org.apache.commons.codec.language.bm.PhoneticEngineTest.TEN) }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|14", java.lang.Object[].class, new java.lang.Object[]{ "Renault", "rinDlt", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|10", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.ASHKENAZI), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|11", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.APPROX), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|12", java.lang.Boolean.TRUE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|13", java.lang.Integer.valueOf(1)) }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|19", java.lang.Object[].class, new java.lang.Object[]{ "Renault", "rinDlt", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|15", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.SEPHARDIC), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|16", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.APPROX), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|17", java.lang.Boolean.TRUE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|18", org.apache.commons.codec.language.bm.PhoneticEngineTest.TEN) }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|24", java.lang.Object[].class, new java.lang.Object[]{ "SntJohn-Smith", "sntjonsmit", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|20", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|21", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.EXACT), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|22", java.lang.Boolean.TRUE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|23", org.apache.commons.codec.language.bm.PhoneticEngineTest.TEN) }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|29", java.lang.Object[].class, new java.lang.Object[]{ "d'ortley", "(ortlaj|ortlej)-(dortlaj|dortlej)", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|25", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|26", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.EXACT), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|27", java.lang.Boolean.TRUE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|28", org.apache.commons.codec.language.bm.PhoneticEngineTest.TEN) }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|34", java.lang.Object[].class, new java.lang.Object[]{ "van helsing", "(elSink|elsink|helSink|helsink|helzink|xelsink)-(banhelsink|fanhelsink|fanhelzink|vanhelsink|vanhelzink|vanjelsink)", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|30", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|31", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.EXACT), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|32", java.lang.Boolean.FALSE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|33", org.apache.commons.codec.language.bm.PhoneticEngineTest.TEN) }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|39", java.lang.Object[].class, new java.lang.Object[]{ "Judenburg", "iudnbYrk|iudnbirk|iudnburk|xudnbirk|xudnburk|zudnbirk|zudnburk", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|35", org.apache.commons.codec.language.bm.NameType.class, org.apache.commons.codec.language.bm.NameType.GENERIC), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|36", org.apache.commons.codec.language.bm.RuleType.class, org.apache.commons.codec.language.bm.RuleType.APPROX), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|37", java.lang.Boolean.TRUE), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|data()|38", org.apache.commons.codec.language.bm.PhoneticEngineTest.TEN) })));
    }

    private final boolean concat;

    private final java.lang.String name;

    private final org.apache.commons.codec.language.bm.NameType nameType;

    private final java.lang.String phoneticExpected;

    private final org.apache.commons.codec.language.bm.RuleType ruleType;

    private final int maxPhonemes;

    public PhoneticEngineTest(final java.lang.String name, final java.lang.String phoneticExpected, final org.apache.commons.codec.language.bm.NameType nameType, final org.apache.commons.codec.language.bm.RuleType ruleType, final boolean concat, final int maxPhonemes) {
        this.name = name;
        this.phoneticExpected = phoneticExpected;
        this.nameType = nameType;
        this.ruleType = ruleType;
        this.concat = concat;
        this.maxPhonemes = maxPhonemes;
    }

    @org.junit.Test
    public void testEncode() {
        final org.apache.commons.codec.language.bm.PhoneticEngine engine = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.PhoneticEngine>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|4", org.apache.commons.codec.language.bm.PhoneticEngine.class, new org.apache.commons.codec.language.bm.PhoneticEngine(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.NameType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|0", org.apache.commons.codec.language.bm.NameType.class, this.nameType), eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.RuleType>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|1", org.apache.commons.codec.language.bm.RuleType.class, this.ruleType), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|2", this.concat), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|3", this.maxPhonemes)));
        final java.lang.String phoneticActual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.PhoneticEngine>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|5", org.apache.commons.codec.language.bm.PhoneticEngine.class, engine).encode(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|6", this.name)));
        // System.err.println("expecting: " + this.phoneticExpected);
        // System.err.println("actual:    " + phoneticActual);
        org.junit.Assert.assertEquals("phoneme incorrect", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|8", this.phoneticExpected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|9", phoneticActual));
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|10", this.concat)) {
            final java.lang.String[] split = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|12", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|11", phoneticActual).split("\\|"));
            org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|13", java.lang.String[].class, split).length)) <= (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|15", this.maxPhonemes))));
        }else {
            final java.lang.String[] words = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|17", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|16", phoneticActual).split("-"));
            for (final java.lang.String word : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|18", java.lang.String[].class, words)) {
                final java.lang.String[] split = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|20", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|19", word).split("\\|"));
                org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|21", java.lang.String[].class, split).length)) <= (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.PhoneticEngineTest|testEncode()|23", this.maxPhonemes))));
            }
        }
    }
}
