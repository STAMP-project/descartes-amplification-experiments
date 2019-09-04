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
public class AlwaysFieldValueGeneratorTest {
    private com.cronutils.model.time.generator.AlwaysFieldValueGenerator fieldValueGenerator;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.AlwaysFieldValueGenerator>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|setUp()|5", com.cronutils.model.time.generator.AlwaysFieldValueGenerator.class, (fieldValueGenerator = new com.cronutils.model.time.generator.AlwaysFieldValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|setUp()|4", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|setUp()|0", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.HOUR), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Always>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|setUp()|1", com.cronutils.model.field.expression.Always.class, new com.cronutils.model.field.expression.Always()), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|setUp()|3", com.cronutils.model.field.constraint.FieldConstraints.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|setUp()|2", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).createConstraintsInstance()))))));
    }

    @org.junit.Test
    public void testGenerateNextValue() throws java.lang.Exception {
        for (int j = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateNextValue()|0", j)) < 10; j++) {
            org.junit.Assert.assertEquals(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateNextValue()|1", j)) + 1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateNextValue()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.AlwaysFieldValueGenerator>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateNextValue()|2", com.cronutils.model.time.generator.AlwaysFieldValueGenerator.class, fieldValueGenerator).generateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateNextValue()|3", j))));
        }
    }

    @org.junit.Test
    public void testGeneratePreviousValue() throws java.lang.Exception {
        for (int j = 1; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGeneratePreviousValue()|0", j)) < 10; j++) {
            org.junit.Assert.assertEquals(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGeneratePreviousValue()|1", j)) - 1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGeneratePreviousValue()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.AlwaysFieldValueGenerator>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGeneratePreviousValue()|2", com.cronutils.model.time.generator.AlwaysFieldValueGenerator.class, fieldValueGenerator).generatePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGeneratePreviousValue()|3", j))));
        }
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremes() throws java.lang.Exception {
        java.util.List<java.lang.Integer> values = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|1", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.AlwaysFieldValueGenerator>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|0", com.cronutils.model.time.generator.AlwaysFieldValueGenerator.class, fieldValueGenerator).generateCandidatesNotIncludingIntervalExtremes(0, 10));
        for (int j = 1; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|2", j)) < 10; j++) {
            org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|3", java.util.List.class, values).contains(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|4", j))));
        }
        org.junit.Assert.assertEquals(9, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|6", java.util.List.class, values).size()));
    }

    @org.junit.Test
    public void testIsMatch() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testIsMatch()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.AlwaysFieldValueGenerator>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testIsMatch()|0", com.cronutils.model.time.generator.AlwaysFieldValueGenerator.class, fieldValueGenerator).isMatch(((int) (10 * (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testIsMatch()|1", java.lang.Math.random())))))));
    }

    @org.junit.Test
    public void testMatchesFieldExpressionClass() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testMatchesFieldExpressionClass()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.AlwaysFieldValueGenerator>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testMatchesFieldExpressionClass()|0", com.cronutils.model.time.generator.AlwaysFieldValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Always>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testMatchesFieldExpressionClass()|1", com.cronutils.model.field.expression.Always.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.Always.class)))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testMatchesFieldExpressionClass()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.AlwaysFieldValueGenerator>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testMatchesFieldExpressionClass()|3", com.cronutils.model.time.generator.AlwaysFieldValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testMatchesFieldExpressionClass()|4", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)))));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testConstructorNotMatchesAlways() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.AlwaysFieldValueGenerator>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testConstructorNotMatchesAlways()|5", com.cronutils.model.time.generator.AlwaysFieldValueGenerator.class, new com.cronutils.model.time.generator.AlwaysFieldValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testConstructorNotMatchesAlways()|4", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testConstructorNotMatchesAlways()|0", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.HOUR), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testConstructorNotMatchesAlways()|1", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testConstructorNotMatchesAlways()|3", com.cronutils.model.field.constraint.FieldConstraints.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testConstructorNotMatchesAlways()|2", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).createConstraintsInstance())))));
        } catch (java.lang.IllegalArgumentException a1552674205415) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.AlwaysFieldValueGeneratorTest|testConstructorNotMatchesAlways()|!", a1552674205415);
            throw a1552674205415;
        }
    }
}

