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
 * Tests guessLanguages API.
 *
 * @since 1.6
 */
@org.junit.runner.RunWith(org.junit.runners.Parameterized.class)
public class LanguageGuessingTest {
    @org.junit.runners.Parameterized.Parameters(name = "{0}-{1}-{2}")
    public static java.util.List<java.lang.Object[]> data() {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Object[]>>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|19", java.util.List.class, java.util.Arrays.asList(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[][]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|18", java.lang.Object[][].class, new java.lang.Object[][]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|0", java.lang.Object[].class, new java.lang.Object[]{ "Renault", "french" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|1", java.lang.Object[].class, new java.lang.Object[]{ "Mickiewicz", "polish" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|2", java.lang.Object[].class, new java.lang.Object[]{ "Thompson", "english" }// this also hits german and greeklatin
        // this also hits german and greeklatin
        // this also hits german and greeklatin
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|3", java.lang.Object[].class, new java.lang.Object[]{ "Nu\u00f1ez", "spanish" }// Nuñez
        // Nuñez
        // Nuñez
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|4", java.lang.Object[].class, new java.lang.Object[]{ "Carvalho", "portuguese" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|5", java.lang.Object[].class, new java.lang.Object[]{ "\u010capek", "czech" }// Čapek
        // Čapek
        // Čapek
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|6", java.lang.Object[].class, new java.lang.Object[]{ "Sjneijder", "dutch" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|7", java.lang.Object[].class, new java.lang.Object[]{ "Klausewitz", "german" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|8", java.lang.Object[].class, new java.lang.Object[]{ "K\u00fc\u00e7\u00fck", "turkish" }// Küçük
        // Küçük
        // Küçük
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|9", java.lang.Object[].class, new java.lang.Object[]{ "Giacometti", "italian" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|10", java.lang.Object[].class, new java.lang.Object[]{ "Nagy", "hungarian" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|11", java.lang.Object[].class, new java.lang.Object[]{ "Ceau\u015fescu", "romanian" }// Ceauşescu
        // Ceauşescu
        // Ceauşescu
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|12", java.lang.Object[].class, new java.lang.Object[]{ "Angelopoulos", "greeklatin" }), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|13", java.lang.Object[].class, new java.lang.Object[]{ "\u0391\u03b3\u03b3\u03b5\u03bb\u03cc\u03c0\u03bf\u03c5\u03bb\u03bf\u03c2", "greek" }// Αγγελόπουλος
        // Αγγελόπουλος
        // Αγγελόπουλος
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|14", java.lang.Object[].class, new java.lang.Object[]{ "\u041f\u0443\u0448\u043a\u0438\u043d", "cyrillic" }// Пушкин
        // Пушкин
        // Пушкин
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|15", java.lang.Object[].class, new java.lang.Object[]{ "\u05db\u05d4\u05df", "hebrew" }// כהן
        // כהן
        // כהן
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|16", java.lang.Object[].class, new java.lang.Object[]{ "\u00e1cz", "any" }// ácz
        // ácz
        // ácz
        ), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|data()|17", java.lang.Object[].class, new java.lang.Object[]{ "\u00e1tz", "any" }) })));// átz

    }

    private final org.apache.commons.codec.language.bm.Lang lang = org.apache.commons.codec.language.bm.Lang.instance(org.apache.commons.codec.language.bm.NameType.GENERIC);

    private final java.lang.String language;

    private final java.lang.String name;

    public LanguageGuessingTest(final java.lang.String name, final java.lang.String language) {
        this.name = name;
        this.language = language;
    }

    @org.junit.Test
    public void testLanguageGuessing() {
        final org.apache.commons.codec.language.bm.Languages.LanguageSet guesses = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Languages.LanguageSet>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|2", org.apache.commons.codec.language.bm.Languages.LanguageSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Lang>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|0", org.apache.commons.codec.language.bm.Lang.class, this.lang).guessLanguages(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|1", this.name)));
        org.junit.Assert.assertTrue((((((("language predicted for name '" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|3", this.name))) + "' is wrong: ") + (eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Languages.LanguageSet>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|4", org.apache.commons.codec.language.bm.Languages.LanguageSet.class, guesses))) + " should contain '") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|5", this.language))) + "'"), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.language.bm.Languages.LanguageSet>observeState("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|6", org.apache.commons.codec.language.bm.Languages.LanguageSet.class, guesses).contains(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.language.bm.LanguageGuessingTest|testLanguageGuessing()|7", this.language))));
    }
}

