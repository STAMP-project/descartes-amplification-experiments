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
public class NullFieldValueGeneratorTest {
    private com.cronutils.model.time.generator.NullFieldValueGenerator fieldValueGenerator;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.NullFieldValueGenerator>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|setUp()|1", com.cronutils.model.time.generator.NullFieldValueGenerator.class, (fieldValueGenerator = new com.cronutils.model.time.generator.NullFieldValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|setUp()|0", com.cronutils.model.field.CronField.class, org.mockito.Mockito.mock(com.cronutils.model.field.CronField.class)))));
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGenerateNextValue() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGenerateNextValue()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.NullFieldValueGenerator>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGenerateNextValue()|0", com.cronutils.model.time.generator.NullFieldValueGenerator.class, fieldValueGenerator).generateNextValue(((int) (10 * (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGenerateNextValue()|1", java.lang.Math.random()))))));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205519) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGenerateNextValue()|!", a1552674205519);
            throw a1552674205519;
        }
    }

    @org.junit.Test(expected = com.cronutils.model.time.generator.NoSuchValueException.class)
    public void testGeneratePreviousValue() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGeneratePreviousValue()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.NullFieldValueGenerator>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGeneratePreviousValue()|0", com.cronutils.model.time.generator.NullFieldValueGenerator.class, fieldValueGenerator).generatePreviousValue(((int) (10 * (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGeneratePreviousValue()|1", java.lang.Math.random()))))));
        } catch (com.cronutils.model.time.generator.NoSuchValueException a1552674205519) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGeneratePreviousValue()|!", a1552674205519);
            throw a1552674205519;
        }
    }

    @org.junit.Test
    public void testGenerateCandidatesNotIncludingIntervalExtremes() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|1", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.NullFieldValueGenerator>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testGenerateCandidatesNotIncludingIntervalExtremes()|0", com.cronutils.model.time.generator.NullFieldValueGenerator.class, fieldValueGenerator).generateCandidatesNotIncludingIntervalExtremes(0, java.lang.Integer.MAX_VALUE)).isEmpty()));
    }

    @org.junit.Test
    public void testIsMatch() throws java.lang.Exception {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testIsMatch()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.NullFieldValueGenerator>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testIsMatch()|0", com.cronutils.model.time.generator.NullFieldValueGenerator.class, fieldValueGenerator).isMatch(((int) (10 * (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testIsMatch()|1", java.lang.Math.random())))))));
    }

    @org.junit.Test
    public void testMatchesFieldExpressionClass() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testMatchesFieldExpressionClass()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.NullFieldValueGenerator>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testMatchesFieldExpressionClass()|0", com.cronutils.model.time.generator.NullFieldValueGenerator.class, fieldValueGenerator).matchesFieldExpressionClass(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testMatchesFieldExpressionClass()|1", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)))));
    }

    @org.junit.Test
    public void testConstructorNotMatchesNull() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.NullFieldValueGenerator>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testConstructorNotMatchesNull()|1", com.cronutils.model.time.generator.NullFieldValueGenerator.class, new com.cronutils.model.time.generator.NullFieldValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.NullFieldValueGeneratorTest|testConstructorNotMatchesNull()|0", com.cronutils.model.field.CronField.class, org.mockito.Mockito.mock(com.cronutils.model.field.CronField.class)))));
    }
}

