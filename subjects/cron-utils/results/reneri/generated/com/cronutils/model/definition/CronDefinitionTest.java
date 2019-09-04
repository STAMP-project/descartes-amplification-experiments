package com.cronutils.model.definition;


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
public class CronDefinitionTest {
    private boolean enforceStrictRange;

    private boolean matchDayOfWeekAndDayOfMonth;

    private com.cronutils.model.field.CronFieldName testFieldName1;

    private com.cronutils.model.field.CronFieldName testFieldName2;

    private com.cronutils.model.field.CronFieldName testFieldName3;

    @org.mockito.Mock
    private com.cronutils.model.field.definition.FieldDefinition mockFieldDefinition1;

    @org.mockito.Mock
    private com.cronutils.model.field.definition.FieldDefinition mockFieldDefinition2;

    @org.mockito.Mock
    private com.cronutils.model.field.definition.FieldDefinition mockFieldDefinition3optional;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|0", com.cronutils.model.field.CronFieldName.class, (testFieldName1 = com.cronutils.model.field.CronFieldName.SECOND));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|1", com.cronutils.model.field.CronFieldName.class, (testFieldName2 = com.cronutils.model.field.CronFieldName.MINUTE));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|2", com.cronutils.model.field.CronFieldName.class, (testFieldName3 = com.cronutils.model.field.CronFieldName.HOUR));
        org.mockito.MockitoAnnotations.initMocks(this);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|7", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|5", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|4", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|3", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition1).getFieldName()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|6", com.cronutils.model.field.CronFieldName.class, testFieldName1)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|12", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|10", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|9", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|8", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition2).getFieldName()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|11", com.cronutils.model.field.CronFieldName.class, testFieldName2)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|17", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.CronFieldName>>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|15", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|14", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|13", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition3optional).getFieldName()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|16", com.cronutils.model.field.CronFieldName.class, testFieldName3)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.lang.Boolean>>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|22", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<java.lang.Boolean>>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|20", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|setUp()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|setUp()|18", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition3optional).isOptional()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|setUp()|21", java.lang.Boolean.TRUE)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|setUp()|23", (enforceStrictRange = false));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|setUp()|24", (matchDayOfWeekAndDayOfMonth = false));
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testConstructorNullFieldsParameter() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullFieldsParameter()|3", com.cronutils.model.definition.CronDefinition.class, new com.cronutils.model.definition.CronDefinition(null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<com.cronutils.model.definition.CronConstraint>>observeState("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullFieldsParameter()|0", java.util.HashSet.class, new java.util.HashSet<com.cronutils.model.definition.CronConstraint>()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullFieldsParameter()|1", enforceStrictRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullFieldsParameter()|2", matchDayOfWeekAndDayOfMonth)));
        } catch (java.lang.NullPointerException a1552674205233) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullFieldsParameter()|!", a1552674205233);
            throw a1552674205233;
        }
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testConstructorNullConstraintsParameter() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullConstraintsParameter()|3", com.cronutils.model.definition.CronDefinition.class, new com.cronutils.model.definition.CronDefinition(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullConstraintsParameter()|0", java.util.ArrayList.class, new java.util.ArrayList<com.cronutils.model.field.definition.FieldDefinition>()), null, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullConstraintsParameter()|1", enforceStrictRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullConstraintsParameter()|2", matchDayOfWeekAndDayOfMonth)));
        } catch (java.lang.NullPointerException a1552674205232) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.definition.CronDefinitionTest|testConstructorNullConstraintsParameter()|!", a1552674205232);
            throw a1552674205232;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testConstructorEmptyFieldsParameter() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testConstructorEmptyFieldsParameter()|4", com.cronutils.model.definition.CronDefinition.class, new com.cronutils.model.definition.CronDefinition(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testConstructorEmptyFieldsParameter()|0", java.util.ArrayList.class, new java.util.ArrayList<com.cronutils.model.field.definition.FieldDefinition>()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<com.cronutils.model.definition.CronConstraint>>observeState("com.cronutils.model.definition.CronDefinitionTest|testConstructorEmptyFieldsParameter()|1", java.util.HashSet.class, new java.util.HashSet<com.cronutils.model.definition.CronConstraint>()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testConstructorEmptyFieldsParameter()|2", enforceStrictRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testConstructorEmptyFieldsParameter()|3", matchDayOfWeekAndDayOfMonth)));
        } catch (java.lang.IllegalArgumentException a1552674205232) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.definition.CronDefinitionTest|testConstructorEmptyFieldsParameter()|!", a1552674205232);
            throw a1552674205232;
        }
    }

    @org.junit.Test
    public void testLastFieldOptionalTrueWhenSet() throws java.lang.Exception {
        java.util.List<com.cronutils.model.field.definition.FieldDefinition> fields = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|0", java.util.ArrayList.class, com.google.common.collect.Lists.newArrayList());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|1", java.util.List.class, fields).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|2", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition1)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|4", java.util.List.class, fields).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|5", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition2)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|7", java.util.List.class, fields).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|8", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition3optional)));
        java.util.Set<com.cronutils.model.field.definition.FieldDefinition> fieldDefinitions = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|15", java.util.Set.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|14", com.cronutils.model.definition.CronDefinition.class, new com.cronutils.model.definition.CronDefinition(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|10", java.util.List.class, fields), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<com.cronutils.model.definition.CronConstraint>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|11", java.util.HashSet.class, new java.util.HashSet<com.cronutils.model.definition.CronConstraint>()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|12", enforceStrictRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|13", matchDayOfWeekAndDayOfMonth))).getFieldDefinitions());
        java.util.List<com.cronutils.model.field.definition.FieldDefinition> sortedFieldDefinitions = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|17", java.util.ArrayList.class, new java.util.ArrayList<>(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|16", java.util.Set.class, fieldDefinitions)));
        java.util.Collections.sort(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|18", java.util.List.class, sortedFieldDefinitions), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Comparator<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|19", java.util.Comparator.class, com.cronutils.model.field.definition.FieldDefinition.createFieldDefinitionComparator()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|24", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|23", com.cronutils.model.field.definition.FieldDefinition.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|20", java.util.List.class, sortedFieldDefinitions).get(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalTrueWhenSet()|21", java.util.List.class, fields).size())) - 1))).isOptional()));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testLastFieldOptionalNotAllowedOnSingleFieldDefinition() throws java.lang.Exception {
        try {
            java.util.List<com.cronutils.model.field.definition.FieldDefinition> fields = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|0", java.util.ArrayList.class, com.google.common.collect.Lists.newArrayList());
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|1", java.util.List.class, fields).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|2", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition3optional)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|8", com.cronutils.model.definition.CronDefinition.class, new com.cronutils.model.definition.CronDefinition(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|4", java.util.List.class, fields), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<com.cronutils.model.definition.CronConstraint>>observeState("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|5", java.util.HashSet.class, new java.util.HashSet<com.cronutils.model.definition.CronConstraint>()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|6", enforceStrictRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|7", matchDayOfWeekAndDayOfMonth)));
        } catch (java.lang.IllegalArgumentException a1552674205236) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.definition.CronDefinitionTest|testLastFieldOptionalNotAllowedOnSingleFieldDefinition()|!", a1552674205236);
            throw a1552674205236;
        }
    }

    @org.junit.Test
    public void testGetFieldDefinitions() throws java.lang.Exception {
        java.util.List<com.cronutils.model.field.definition.FieldDefinition> fields = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|0", java.util.ArrayList.class, com.google.common.collect.Lists.newArrayList());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|1", java.util.List.class, fields).add(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|2", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition1)));
        com.cronutils.model.definition.CronDefinition cronDefinition = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|8", com.cronutils.model.definition.CronDefinition.class, new com.cronutils.model.definition.CronDefinition(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|4", java.util.List.class, fields), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.HashSet<com.cronutils.model.definition.CronConstraint>>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|5", java.util.HashSet.class, new java.util.HashSet<com.cronutils.model.definition.CronConstraint>()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|6", enforceStrictRange), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|7", matchDayOfWeekAndDayOfMonth)));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|10", java.util.Set.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|9", com.cronutils.model.definition.CronDefinition.class, cronDefinition).getFieldDefinitions()));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|12", java.util.Set.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|11", com.cronutils.model.definition.CronDefinition.class, cronDefinition).getFieldDefinitions()).size()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<com.cronutils.model.field.definition.FieldDefinition>>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|15", java.util.Set.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|14", com.cronutils.model.definition.CronDefinition.class, cronDefinition).getFieldDefinitions()).contains(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinition>observeState("com.cronutils.model.definition.CronDefinitionTest|testGetFieldDefinitions()|16", com.cronutils.model.field.definition.FieldDefinition.class, mockFieldDefinition1))));
    }
}
