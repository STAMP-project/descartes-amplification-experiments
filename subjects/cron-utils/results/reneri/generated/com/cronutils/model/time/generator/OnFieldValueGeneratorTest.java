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
public class OnFieldValueGeneratorTest {
    private com.cronutils.model.time.generator.OnFieldValueGenerator fieldValueGenerator;

    private int day = 3;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|setUp()|7", com.cronutils.model.time.generator.OnFieldValueGenerator.class, (fieldValueGenerator = new com.cronutils.model.time.generator.OnFieldValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|setUp()|6", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|setUp()|0", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.HOUR), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|setUp()|2", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|setUp()|1", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(3)))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|setUp()|5", com.cronutils.model.field.constraint.FieldConstraints.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|setUp()|4", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraintsBuilder>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|setUp()|3", com.cronutils.model.field.constraint.FieldConstraintsBuilder.class, com.cronutils.model.field.constraint.FieldConstraintsBuilder.instance()).addLSupport()).createConstraintsInstance()))))));
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValue() throws java.lang.Exception {
        try {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateNextValue()|0", day), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateNextValue()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateNextValue()|1", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).generateNextValue(1)));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateNextValue()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateNextValue()|3", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).generateNextValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateNextValue()|4", day)));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205573) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateNextValue()|!", a1552674205573);
            throw a1552674205573;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValue() throws java.lang.Exception {
        try {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGeneratePreviousValue()|0", day), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGeneratePreviousValue()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGeneratePreviousValue()|1", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).generatePreviousValue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGeneratePreviousValue()|2", day)) + 1))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGeneratePreviousValue()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGeneratePreviousValue()|4", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).generatePreviousValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGeneratePreviousValue()|5", day)));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205573) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGeneratePreviousValue()|!", a1552674205573);
            throw a1552674205573;
        }
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremes() throws java.lang.Exception {
        java.util.List<java.lang.Integer> candidates = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|1", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|0", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).generateCandidatesNotIncludingIntervalExtremes(1, 32));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|2", java.util.List.class, candidates).size()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|4", day), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|5", java.util.List.class, candidates).get(0)), 0);
    }

    @org.junit.Test
    public void testIsMatch() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testIsMatch()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testIsMatch()|0", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).isMatch(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testIsMatch()|1", day))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testIsMatch()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testIsMatch()|3", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).isMatch(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testIsMatch()|4", day)) - 1))));
    }

    @org.junit.Test
    public void testMatchesFieldExpressionClass() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testMatchesFieldExpressionClass()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testMatchesFieldExpressionClass()|0", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testMatchesFieldExpressionClass()|1", com.cronutils.model.field.expression.On.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.On.class)))));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testMatchesFieldExpressionClass()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testMatchesFieldExpressionClass()|3", com.cronutils.model.time.generator.OnFieldValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testMatchesFieldExpressionClass()|4", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)))));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testConstructorNotMatchesOn() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.OnFieldValueGenerator>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testConstructorNotMatchesOn()|1", com.cronutils.model.time.generator.OnFieldValueGenerator.class, new com.cronutils.model.time.generator.OnFieldValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testConstructorNotMatchesOn()|0", com.cronutils.model.field.CronField.class, org.mockito.Mockito.mock(com.cronutils.model.field.CronField.class))));
        } catch (java.lang.IllegalArgumentException a1552674205571) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.OnFieldValueGeneratorTest|testConstructorNotMatchesOn()|!", a1552674205571);
            throw a1552674205571;
        }
    }
}

