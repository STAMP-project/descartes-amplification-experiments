package com.cronutils.model.time.generator;


/* Copyright 2015 jmrozanec
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
public class OnDayOfMonthValueGeneratorLTest {
    private com.cronutils.model.time.generator.OnDayOfMonthValueGenerator fieldValueGenerator;

    private int year = 2015;

    private int month = 2;

    private int lastDayInMonth = org.threeten.bp.LocalDate.of(2015, 2, 1).lengthOfMonth();

    @org.junit.Before
    public void setUp() {
        com.cronutils.model.field.constraint.FieldConstraints constraints = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|2", com.cronutils.model.field.constraint.FieldConstraints.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|1", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|0", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).addLSupport()).createConstraintsInstance());
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|11", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = new com.cronutils.model.time.generator.OnDayOfMonthValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|8", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|3", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_MONTH), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|6", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|5", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|4", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.L))))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|7", com.cronutils.model.field.constraint.FieldConstraints.class, constraints))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|9", year), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|setUp()|10", month))));
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValue() throws java.lang.Exception {
        try {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateNextValue()|0", lastDayInMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateNextValue()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateNextValue()|1", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateNextValue(1)));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateNextValue()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateNextValue()|3", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateNextValue()|4", lastDayInMonth)));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205522) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateNextValue()|!", a1552674205522);
            throw a1552674205522;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValue() throws java.lang.Exception {
        try {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGeneratePreviousValue()|0", lastDayInMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGeneratePreviousValue()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGeneratePreviousValue()|1", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generatePreviousValue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGeneratePreviousValue()|2", lastDayInMonth)) + 1))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGeneratePreviousValue()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGeneratePreviousValue()|4", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generatePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGeneratePreviousValue()|5", lastDayInMonth)));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205523) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGeneratePreviousValue()|!", a1552674205523);
            throw a1552674205523;
        }
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremes() throws java.lang.Exception {
        java.util.List<java.lang.Integer> candidates = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateCandidatesNotIncludingIntervalExtremes()|1", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateCandidatesNotIncludingIntervalExtremes()|0", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateCandidatesNotIncludingIntervalExtremes(1, 32));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateCandidatesNotIncludingIntervalExtremes()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateCandidatesNotIncludingIntervalExtremes()|2", java.util.List.class, candidates).size()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateCandidatesNotIncludingIntervalExtremes()|4", lastDayInMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateCandidatesNotIncludingIntervalExtremes()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testGenerateCandidatesNotIncludingIntervalExtremes()|5", java.util.List.class, candidates).get(0)), 0);
    }

    @org.junit.Test
    public void testIsMatch() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testIsMatch()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testIsMatch()|0", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).isMatch(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testIsMatch()|1", lastDayInMonth))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testIsMatch()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testIsMatch()|3", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).isMatch(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLTest|testIsMatch()|4", lastDayInMonth)) - 1))));
    }
}

