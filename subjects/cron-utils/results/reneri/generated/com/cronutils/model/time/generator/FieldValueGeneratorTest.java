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
public class FieldValueGeneratorTest {
    private com.cronutils.model.time.generator.FieldValueGenerator fieldValueGenerator;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.FieldValueGenerator>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|setUp()|4", com.cronutils.model.time.generator.FieldValueGenerator.class, (fieldValueGenerator = new com.cronutils.model.time.generator.MockFieldValueGenerator(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|setUp()|3", com.cronutils.model.field.CronField.class, new com.cronutils.model.field.CronField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|setUp()|0", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.HOUR), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|setUp()|1", com.cronutils.model.field.expression.FieldExpression.class, org.mockito.Mockito.mock(com.cronutils.model.field.expression.FieldExpression.class)), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|setUp()|2", com.cronutils.model.field.constraint.FieldConstraints.class, org.mockito.Mockito.mock(com.cronutils.model.field.constraint.FieldConstraints.class)))))));
    }

    @org.junit.Test
    public void testGenerateCandidates() throws java.lang.Exception {
        int start = 1;
        int end = 2;
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|3", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.FieldValueGenerator>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|0", com.cronutils.model.time.generator.FieldValueGenerator.class, fieldValueGenerator).generateCandidatesNotIncludingIntervalExtremes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|1", start), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|2", end))).isEmpty()));
        java.util.List<java.lang.Integer> candidates = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|6", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.generator.FieldValueGenerator>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|5", com.cronutils.model.time.generator.FieldValueGenerator.class, fieldValueGenerator).generateCandidates(1, 2));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|7", java.util.List.class, candidates).isEmpty()));
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|9", java.util.List.class, candidates).size()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|11", java.util.List.class, candidates).contains(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|12", start))));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.Integer>>observeState("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|14", java.util.List.class, candidates).contains(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.generator.FieldValueGeneratorTest|testGenerateCandidates()|15", end))));
    }
}

