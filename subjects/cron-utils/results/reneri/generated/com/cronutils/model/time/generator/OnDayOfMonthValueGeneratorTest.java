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
public class OnDayOfMonthValueGeneratorTest {
    private com.cronutils.model.time.generator.OnDayOfMonthValueGenerator fieldValueGenerator;

    private com.cronutils.model.field.constraint.FieldConstraints constraints;

    private int year = 2015;

    private int month = 2;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|1", com.cronutils.model.field.constraint.FieldConstraints.class, (constraints = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|0", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).createConstraintsInstance()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|9", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, (fieldValueGenerator = new com.cronutils.model.time.generator.OnDayOfMonthValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|6", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|2", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_MONTH), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|4", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|3", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(3)))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|5", com.cronutils.model.field.constraint.FieldConstraints.class, constraints))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|7", year), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|setUp()|8", month))));
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValue() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testGenerateNextValue()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testGenerateNextValue()|0", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testGenerateNextValue()|1", randomNumber())));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205532) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testGenerateNextValue()|!", a1552674205532);
            throw a1552674205532;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValue() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testGeneratePreviousValue()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testGeneratePreviousValue()|0", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).generatePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testGeneratePreviousValue()|1", randomNumber())));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205533) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testGeneratePreviousValue()|!", a1552674205533);
            throw a1552674205533;
        }
    }

    @org.junit.Test
    public void testMatchesFieldExpressionClass() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testMatchesFieldExpressionClass()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testMatchesFieldExpressionClass()|0", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testMatchesFieldExpressionClass()|1", com.cronutils.model.field.expression.On.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.On.class)))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testMatchesFieldExpressionClass()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testMatchesFieldExpressionClass()|3", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testMatchesFieldExpressionClass()|4", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)))));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testConstructorNotMatchesOn() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfMonthValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testConstructorNotMatchesOn()|6", com.cronutils.model.time.generator.OnDayOfMonthValueGenerator.class, new com.cronutils.model.time.generator.OnDayOfMonthValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testConstructorNotMatchesOn()|3", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testConstructorNotMatchesOn()|0", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.YEAR), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testConstructorNotMatchesOn()|1", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testConstructorNotMatchesOn()|2", com.cronutils.model.field.constraint.FieldConstraints.class, constraints))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testConstructorNotMatchesOn()|4", year), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testConstructorNotMatchesOn()|5", month)));
        } catch (java.lang.IllegalArgumentException a1552674205532) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|testConstructorNotMatchesOn()|!", a1552674205532);
            throw a1552674205532;
        }
    }

    private int randomNumber() {
        return ((int) (10 * (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfMonthValueGeneratorTest|randomNumber()|0", java.lang.Math.random()))));
    }
}

