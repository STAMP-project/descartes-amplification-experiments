package com.cronutils.mapper;


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
public class CronMapperTest {
    private com.cronutils.model.field.CronFieldName testCronFieldName;

    @org.mockito.Mock
    private com.cronutils.model.field.CronField mockCronField;

    private com.cronutils.Function<com.cronutils.model.Cron, com.cronutils.model.Cron> cronMapping = null;

    @org.junit.Before
    public void setUp() {
        org.mockito.MockitoAnnotations.initMocks(this);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.mapper.CronMapperTest|setUp()|0", com.cronutils.model.field.CronFieldName.class, (this.testCronFieldName = com.cronutils.model.field.CronFieldName.SECOND));
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testConstructorSourceDefinitionNull() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.CronMapper>observeState("com.cronutils.mapper.CronMapperTest|testConstructorSourceDefinitionNull()|2", com.cronutils.mapper.CronMapper.class, new com.cronutils.mapper.CronMapper(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.mapper.CronMapperTest|testConstructorSourceDefinitionNull()|0", com.cronutils.model.definition.CronDefinition.class, org.mockito.Mockito.mock(com.cronutils.model.definition.CronDefinition.class)), null, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.Cron, com.cronutils.model.Cron>>observeState("com.cronutils.mapper.CronMapperTest|testConstructorSourceDefinitionNull()|1", com.cronutils.Function.class, cronMapping)));
        } catch (java.lang.NullPointerException a1552674205173) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.mapper.CronMapperTest|testConstructorSourceDefinitionNull()|!", a1552674205173);
            throw a1552674205173;
        }
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testConstructorTargetDefinitionNull() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.CronMapper>observeState("com.cronutils.mapper.CronMapperTest|testConstructorTargetDefinitionNull()|2", com.cronutils.mapper.CronMapper.class, new com.cronutils.mapper.CronMapper(null, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.mapper.CronMapperTest|testConstructorTargetDefinitionNull()|0", com.cronutils.model.definition.CronDefinition.class, org.mockito.Mockito.mock(com.cronutils.model.definition.CronDefinition.class)), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.Cron, com.cronutils.model.Cron>>observeState("com.cronutils.mapper.CronMapperTest|testConstructorTargetDefinitionNull()|1", com.cronutils.Function.class, cronMapping)));
        } catch (java.lang.NullPointerException a1552674205174) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.mapper.CronMapperTest|testConstructorTargetDefinitionNull()|!", a1552674205174);
            throw a1552674205174;
        }
    }

    @org.junit.Test
    public void testReturnSameExpression() throws java.lang.Exception {
        com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField> function = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField>>observeState("com.cronutils.mapper.CronMapperTest|testReturnSameExpression()|0", com.cronutils.Function.class, com.cronutils.mapper.CronMapper.returnSameExpression());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnSameExpression()|1", com.cronutils.model.field.CronField.class, mockCronField), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnSameExpression()|4", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField>>observeState("com.cronutils.mapper.CronMapperTest|testReturnSameExpression()|2", com.cronutils.Function.class, function).apply(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnSameExpression()|3", com.cronutils.model.field.CronField.class, mockCronField))));
    }

    @org.junit.Test
    public void testReturnOnZeroExpression() throws java.lang.Exception {
        com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField> function = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField>>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|1", com.cronutils.Function.class, com.cronutils.mapper.CronMapper.returnOnZeroExpression(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|0", com.cronutils.model.field.CronFieldName.class, testCronFieldName)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|2", com.cronutils.model.field.CronFieldName.class, testCronFieldName), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|6", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|5", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField>>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|3", com.cronutils.Function.class, function).apply(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|4", com.cronutils.model.field.CronField.class, mockCronField))).getField()));
        com.cronutils.model.field.expression.On result = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|10", com.cronutils.model.field.expression.On.class, ((com.cronutils.model.field.expression.On) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|9", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField>>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|7", com.cronutils.Function.class, function).apply(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|8", com.cronutils.model.field.CronField.class, mockCronField))).getExpression())));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|13", ((int) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|12", com.cronutils.model.field.value.IntegerFieldValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.mapper.CronMapperTest|testReturnOnZeroExpression()|11", com.cronutils.model.field.expression.On.class, result).getTime()).getValue()))));
    }

    @org.junit.Test
    public void testReturnAlwaysExpression() throws java.lang.Exception {
        com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField> function = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField>>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|1", com.cronutils.Function.class, com.cronutils.mapper.CronMapper.returnAlwaysExpression(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|0", com.cronutils.model.field.CronFieldName.class, testCronFieldName)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|2", com.cronutils.model.field.CronFieldName.class, testCronFieldName), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|6", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|5", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField>>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|3", com.cronutils.Function.class, function).apply(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|4", com.cronutils.model.field.CronField.class, mockCronField))).getField()));
        org.junit.Assert.assertEquals(com.cronutils.model.field.expression.Always.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|10", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|9", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.Function<com.cronutils.model.field.CronField, com.cronutils.model.field.CronField>>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|7", com.cronutils.Function.class, function).apply(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.mapper.CronMapperTest|testReturnAlwaysExpression()|8", com.cronutils.model.field.CronField.class, mockCronField))).getExpression()).getClass());
    }
}

