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
public class OnDayOfWeekValueGeneratorTest {
    private com.cronutils.model.time.generator.OnDayOfWeekValueGenerator fieldValueGenerator;

    private com.cronutils.model.field.constraint.FieldConstraints constraints;

    private com.cronutils.mapper.WeekDay mondayDoWValue;

    private int year = 2015;

    private int month = 2;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|1", com.cronutils.model.field.constraint.FieldConstraints.class, (constraints = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|0", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).createConstraintsInstance()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|2", com.cronutils.mapper.WeekDay.class, (mondayDoWValue = new com.cronutils.mapper.WeekDay(1, false)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfWeekValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|11", com.cronutils.model.time.generator.OnDayOfWeekValueGenerator.class, (fieldValueGenerator = new com.cronutils.model.time.generator.OnDayOfWeekValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|7", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|3", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_WEEK), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|5", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|4", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(3)))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|6", com.cronutils.model.field.constraint.FieldConstraints.class, constraints))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|8", year), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|9", month), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|setUp()|10", com.cronutils.mapper.WeekDay.class, mondayDoWValue))));
    }

    @org.junit.Test
    public void testMatchesFieldExpressionClass() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testMatchesFieldExpressionClass()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfWeekValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testMatchesFieldExpressionClass()|0", com.cronutils.model.time.generator.OnDayOfWeekValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testMatchesFieldExpressionClass()|1", com.cronutils.model.field.expression.On.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.On.class)))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testMatchesFieldExpressionClass()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfWeekValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testMatchesFieldExpressionClass()|3", com.cronutils.model.time.generator.OnDayOfWeekValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testMatchesFieldExpressionClass()|4", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)))));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testConstructorNotMatchesOnDayOfWeekValueGenerator() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnDayOfWeekValueGenerator>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|7", com.cronutils.model.time.generator.OnDayOfWeekValueGenerator.class, new com.cronutils.model.time.generator.OnDayOfWeekValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|3", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|0", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.YEAR), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|1", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|2", com.cronutils.model.field.constraint.FieldConstraints.class, constraints))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|4", year), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|5", month), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|6", com.cronutils.mapper.WeekDay.class, mondayDoWValue)));
        } catch (java.lang.IllegalArgumentException a1552674205569) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnDayOfWeekValueGeneratorTest|testConstructorNotMatchesOnDayOfWeekValueGenerator()|!", a1552674205569);
            throw a1552674205569;
        }
    }
}

