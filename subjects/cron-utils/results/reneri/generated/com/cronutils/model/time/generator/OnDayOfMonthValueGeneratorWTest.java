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
public class OnDayOfMonthValueGeneratorWTest {
    private com.cronutils.model.field.constraint.FieldConstraints constraints;

    private com.cronutils.model.time.generator.OnDayOfMonthValueGenerator fieldValueGenerator;

    private static final int YEAR = 2015;

    private static final int SUNDAY_VALUE_MONTH = 2;

    private int sundayValueDay = 15;

    private int sundayValueWeekday = 16;

    private int saturdayValueMonth = 2;

    private int saturdayValueDay = 7;

    private int saturdayValueWeekday = 6;

    private int firstDaySaturdayValueMonth = 8;

    private int firstDaySaturdayValueDay = 1;

    private int firstDaySaturdayValueWeekday = 3;

    private int outOfScopeValue = 18;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|setUp()|2", com.cronutils.model.field.constraint.FieldConstraints.class, (constraints = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|setUp()|1", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|setUp()|0", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).addWSupport()).createConstraintsInstance()));
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValueSundayValue() throws java.lang.Exception {
        try {
            testGenerateNextValue(com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest.SUNDAY_VALUE_MONTH, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueSundayValue()|0", sundayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueSundayValue()|1", sundayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205538) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueSundayValue()|!", a1552674205538);
            throw a1552674205538;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValueSaturdayValue() throws java.lang.Exception {
        try {
            testGenerateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueSaturdayValue()|0", saturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueSaturdayValue()|1", saturdayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueSaturdayValue()|2", saturdayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205538) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueSaturdayValue()|!", a1552674205538);
            throw a1552674205538;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValueFirstDaySaturdayValue() throws java.lang.Exception {
        try {
            testGenerateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueFirstDaySaturdayValue()|0", firstDaySaturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueFirstDaySaturdayValue()|1", firstDaySaturdayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueFirstDaySaturdayValue()|2", firstDaySaturdayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205538) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValueFirstDaySaturdayValue()|!", a1552674205538);
            throw a1552674205538;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValueSundayValue() throws java.lang.Exception {
        try {
            testGeneratePreviousValue(com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest.SUNDAY_VALUE_MONTH, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueSundayValue()|0", sundayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueSundayValue()|1", sundayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205540) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueSundayValue()|!", a1552674205540);
            throw a1552674205540;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValueSaturdayValue() throws java.lang.Exception {
        try {
            testGeneratePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueSaturdayValue()|0", saturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueSaturdayValue()|1", saturdayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueSaturdayValue()|2", saturdayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205539) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueSaturdayValue()|!", a1552674205539);
            throw a1552674205539;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValueFirstDaySaturdayValue() throws java.lang.Exception {
        try {
            testGeneratePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueFirstDaySaturdayValue()|0", firstDaySaturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueFirstDaySaturdayValue()|1", firstDaySaturdayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueFirstDaySaturdayValue()|2", firstDaySaturdayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205539) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValueFirstDaySaturdayValue()|!", a1552674205539);
            throw a1552674205539;
        }
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremesSundayValue() throws java.lang.Exception {
        testGenerateCandidatesNotIncludingIntervalExtremes(com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest.SUNDAY_VALUE_MONTH, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremesSundayValue()|0", sundayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremesSundayValue()|1", sundayValueWeekday));
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremesSaturdayValue() throws java.lang.Exception {
        testGenerateCandidatesNotIncludingIntervalExtremes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremesSaturdayValue()|0", saturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremesSaturdayValue()|1", saturdayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremesSaturdayValue()|2", saturdayValueWeekday));
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremesFirstDaySaturdayValue() throws java.lang.Exception {
        testGenerateCandidatesNotIncludingIntervalExtremes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremesFirstDaySaturdayValue()|0", firstDaySaturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremesFirstDaySaturdayValue()|1", firstDaySaturdayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremesFirstDaySaturdayValue()|2", firstDaySaturdayValueWeekday));
    }

    @org.junit.Test
    public void testIsMatchSundayValue() throws java.lang.Exception {
        testIsMatch(com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest.SUNDAY_VALUE_MONTH, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatchSundayValue()|0", sundayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatchSundayValue()|1", sundayValueWeekday));
    }

    @org.junit.Test
    public void testIsMatchSaturdayValue() throws java.lang.Exception {
        testIsMatch(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatchSaturdayValue()|0", saturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatchSaturdayValue()|1", saturdayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatchSaturdayValue()|2", saturdayValueWeekday));
    }

    @org.junit.Test
    public void testIsMatchFirstDaySaturdayValue() throws java.lang.Exception {
        testIsMatch(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatchFirstDaySaturdayValue()|0", firstDaySaturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatchFirstDaySaturdayValue()|1", firstDaySaturdayValueDay), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatchFirstDaySaturdayValue()|2", firstDaySaturdayValueWeekday));
    }

    private void testGenerateNextValue(int month, int day, int weekday) throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|2", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = createFieldValueGeneratorInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|0", month), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|1", day))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|3", weekday), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|4", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateNextValue(1)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|8", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|6", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateNextValue(int,int,int)|7", outOfScopeValue)));
    }

    public void testGeneratePreviousValue(int month, int day, int weekday) throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|2", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = createFieldValueGeneratorInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|0", month), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|1", day))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|3", weekday), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|4", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generatePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|5", outOfScopeValue))));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|8", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGeneratePreviousValue(int,int,int)|7", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generatePreviousValue(1));
    }

    public void testGenerateCandidatesNotIncludingIntervalExtremes(int month, int day, int weekday) throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|2", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = createFieldValueGeneratorInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|0", month), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|1", day))));
        java.util.List<java.lang.Integer> candidates = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|4", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|3", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateCandidatesNotIncludingIntervalExtremes(1, 32));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|5", java.util.List.class, candidates).size()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|7", weekday), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int,int)|8", java.util.List.class, candidates).get(0)), 0);
    }

    public void testIsMatch(int month, int day, int weekday) throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|2", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = createFieldValueGeneratorInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|0", month), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|1", day))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|3", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).isMatch(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|4", weekday))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|8", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|6", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).isMatch(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|testIsMatch(int,int,int)|7", weekday)) - 1))));
    }

    private com.cronutils.model.time.generator.OnDayOfMonthValueGenerator createFieldValueGeneratorInstance(int month, int day) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|10", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, new com.cronutils.model.time.generator.OnDayOfMonthValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|8", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|0", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_MONTH), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|6", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|2", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|1", day))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|4", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|3", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.W))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|5", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue((-1))))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|7", com.cronutils.model.field.constraint.FieldConstraints.class, constraints))), com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest.YEAR, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorWTest|createFieldValueGeneratorInstance(int,int)|9", month)));
    }
}

