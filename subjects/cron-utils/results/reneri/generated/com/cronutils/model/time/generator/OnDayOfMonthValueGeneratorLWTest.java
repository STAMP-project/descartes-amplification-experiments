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
public class OnDayOfMonthValueGeneratorLWTest {
    private com.cronutils.model.field.constraint.FieldConstraints constraints;

    private com.cronutils.model.time.generator.OnDayOfMonthValueGenerator fieldValueGenerator;

    private static final int YEAR = 2015;

    private static final int SUNDAY_VALUE_MONTH = 5;// last day in month is Sunday (weekend)


    private int sundayValueWeekday = 29;

    private int saturdayValueMonth = 2;// last day in month is Saturday (weekend)


    private int saturdayValueWeekday = 27;

    private int fridayValueMonth = 8;// last day in month is Friday (weekday)


    private int fridayValueWeekday = 31;

    private int outOfScopeValue = 31;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|setUp()|2", com.cronutils.model.field.constraint.FieldConstraints.class, (constraints = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|setUp()|1", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|setUp()|0", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).addLWSupport()).createConstraintsInstance()));
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValueSundayValue() throws java.lang.Exception {
        try {
            testGenerateNextValue(com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest.SUNDAY_VALUE_MONTH, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValueSundayValue()|0", sundayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205527) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValueSundayValue()|!", a1552674205527);
            throw a1552674205527;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValueSaturdayValue() throws java.lang.Exception {
        try {
            testGenerateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValueSaturdayValue()|0", saturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValueSaturdayValue()|1", saturdayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205527) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValueSaturdayValue()|!", a1552674205527);
            throw a1552674205527;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValueFridayValue() throws java.lang.Exception {
        try {
            testGenerateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValueFridayValue()|0", fridayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValueFridayValue()|1", fridayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205527) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValueFridayValue()|!", a1552674205527);
            throw a1552674205527;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValueSundayValue() throws java.lang.Exception {
        try {
            testGeneratePreviousValue(com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest.SUNDAY_VALUE_MONTH, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValueSundayValue()|0", sundayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205529) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValueSundayValue()|!", a1552674205529);
            throw a1552674205529;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValueSaturdayValue() throws java.lang.Exception {
        try {
            testGeneratePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValueSaturdayValue()|0", saturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValueSaturdayValue()|1", saturdayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205528) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValueSaturdayValue()|!", a1552674205528);
            throw a1552674205528;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValueFridayValue() throws java.lang.Exception {
        try {
            testGeneratePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValueFridayValue()|0", fridayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValueFridayValue()|1", fridayValueWeekday));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205528) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValueFridayValue()|!", a1552674205528);
            throw a1552674205528;
        }
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremesSundayValue() throws java.lang.Exception {
        testGenerateCandidatesNotIncludingIntervalExtremes(com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest.SUNDAY_VALUE_MONTH, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremesSundayValue()|0", sundayValueWeekday));
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremesSaturdayValue() throws java.lang.Exception {
        testGenerateCandidatesNotIncludingIntervalExtremes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremesSaturdayValue()|0", saturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremesSaturdayValue()|1", saturdayValueWeekday));
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremesFridayValue() throws java.lang.Exception {
        testGenerateCandidatesNotIncludingIntervalExtremes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremesFridayValue()|0", fridayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremesFridayValue()|1", fridayValueWeekday));
    }

    @org.junit.Test
    public void testIsMatchSundayValue() throws java.lang.Exception {
        testIsMatch(com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest.SUNDAY_VALUE_MONTH, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatchSundayValue()|0", sundayValueWeekday));
    }

    @org.junit.Test
    public void testIsMatchSaturdayValue() throws java.lang.Exception {
        testIsMatch(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatchSaturdayValue()|0", saturdayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatchSaturdayValue()|1", saturdayValueWeekday));
    }

    @org.junit.Test
    public void testIsMatchFridayValue() throws java.lang.Exception {
        testIsMatch(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatchFridayValue()|0", fridayValueMonth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatchFridayValue()|1", fridayValueWeekday));
    }

    private void testGenerateNextValue(int month, int weekday) throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValue(int,int)|1", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = createFieldValueGeneratorInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValue(int,int)|0", month))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValue(int,int)|2", weekday), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValue(int,int)|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValue(int,int)|3", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateNextValue(1)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValue(int,int)|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValue(int,int)|5", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateNextValue(int,int)|6", outOfScopeValue)));
    }

    public void testGeneratePreviousValue(int month, int weekday) throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValue(int,int)|1", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = createFieldValueGeneratorInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValue(int,int)|0", month))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValue(int,int)|2", weekday), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValue(int,int)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValue(int,int)|3", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generatePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValue(int,int)|4", outOfScopeValue))));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValue(int,int)|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGeneratePreviousValue(int,int)|6", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generatePreviousValue(1));
    }

    public void testGenerateCandidatesNotIncludingIntervalExtremes(int month, int weekday) throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|1", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = createFieldValueGeneratorInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|0", month))));
        java.util.List<java.lang.Integer> candidates = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|3", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|2", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateCandidatesNotIncludingIntervalExtremes(1, 32));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|4", java.util.List.class, candidates).size()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|6", weekday), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testGenerateCandidatesNotIncludingIntervalExtremes(int,int)|7", java.util.List.class, candidates).get(0)), 0);
    }

    public void testIsMatch(int month, int weekday) throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatch(int,int)|1", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = createFieldValueGeneratorInstance(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatch(int,int)|0", month))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatch(int,int)|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatch(int,int)|2", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).isMatch(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatch(int,int)|3", weekday))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatch(int,int)|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatch(int,int)|5", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).isMatch(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|testIsMatch(int,int)|6", weekday)) - 1))));
    }

    private com.cronutils.model.time.generator.OnDayOfMonthValueGenerator createFieldValueGeneratorInstance(int month) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|createFieldValueGeneratorInstance(int)|7", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, new com.cronutils.model.time.generator.OnDayOfMonthValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|createFieldValueGeneratorInstance(int)|5", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|createFieldValueGeneratorInstance(int)|0", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_MONTH), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|createFieldValueGeneratorInstance(int)|3", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|createFieldValueGeneratorInstance(int)|2", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|createFieldValueGeneratorInstance(int)|1", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.LW))))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|createFieldValueGeneratorInstance(int)|4", com.cronutils.model.field.constraint.FieldConstraints.class, constraints))), com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest.YEAR, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorLWTest|createFieldValueGeneratorInstance(int)|6", month)));
    }
}

