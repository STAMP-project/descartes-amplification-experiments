package com.cronutils.parser;


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
@org.junit.runner.RunWith(org.powermock.modules.junit4.PowerMockRunner.class)
@org.powermock.core.classloader.annotations.PrepareForTest({ com.cronutils.parser.CronParserField.class, com.cronutils.parser.CronParser.class })
public class CronParserFieldTest {
    private com.cronutils.model.field.CronFieldName testFieldName;

    @org.mockito.Mock
    private com.cronutils.parser.FieldParser mockParser;

    @org.mockito.Mock
    private com.cronutils.model.field.expression.FieldExpression mockParseResponse;

    private com.cronutils.parser.CronParserField cronParserField;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        org.mockito.MockitoAnnotations.initMocks(this);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|0", com.cronutils.model.field.CronFieldName.class, (testFieldName = com.cronutils.model.field.CronFieldName.SECOND));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.expression.FieldExpression>>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|6", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.model.field.expression.FieldExpression>>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|4", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|3", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.FieldParser>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|1", com.cronutils.parser.FieldParser.class, mockParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserFieldTest|setUp()|2", org.mockito.Matchers.anyString()))))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|5", com.cronutils.model.field.expression.FieldExpression.class, mockParseResponse)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.parser.FieldParser>>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|11", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<com.cronutils.parser.FieldParser>>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|9", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.powermock.api.mockito.expectation.ConstructorExpectationSetup<com.cronutils.parser.FieldParser>>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|7", org.powermock.api.mockito.expectation.ConstructorExpectationSetup.class, org.powermock.api.mockito.PowerMockito.whenNew(com.cronutils.parser.FieldParser.class)).withArguments(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|8", com.cronutils.model.field.constraint.FieldConstraints.class, org.mockito.Matchers.any(com.cronutils.model.field.constraint.FieldConstraints.class)))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.FieldParser>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|10", com.cronutils.parser.FieldParser.class, mockParser)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParserField>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|14", com.cronutils.parser.CronParserField.class, (cronParserField = new com.cronutils.parser.CronParserField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|12", com.cronutils.model.field.CronFieldName.class, testFieldName), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.parser.CronParserFieldTest|setUp()|13", com.cronutils.model.field.constraint.FieldConstraints.class, org.mockito.Mockito.mock(com.cronutils.model.field.constraint.FieldConstraints.class)))));
    }

    @org.junit.Test
    public void testGetField() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.parser.CronParserFieldTest|testGetField()|0", com.cronutils.model.field.CronFieldName.class, testFieldName), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.parser.CronParserFieldTest|testGetField()|2", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParserField>observeState("com.cronutils.parser.CronParserFieldTest|testGetField()|1", com.cronutils.parser.CronParserField.class, cronParserField).getField()));
    }

    @org.junit.Test
    public void testParse() throws java.lang.Exception {
        java.lang.String cron = eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserFieldTest|testParse()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.UUID>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|0", java.util.UUID.class, java.util.UUID.randomUUID()).toString());
        com.cronutils.model.field.CronField result = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|4", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParserField>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|2", com.cronutils.parser.CronParserField.class, cronParserField).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserFieldTest|testParse()|3", cron)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|5", com.cronutils.model.field.expression.FieldExpression.class, mockParseResponse), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|7", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|6", com.cronutils.model.field.CronField.class, result).getExpression()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|8", com.cronutils.model.field.CronFieldName.class, testFieldName), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|10", com.cronutils.model.field.CronFieldName.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|9", com.cronutils.model.field.CronField.class, result).getField()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|14", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.FieldParser>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|12", com.cronutils.parser.FieldParser.class, org.mockito.Mockito.verify(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.FieldParser>observeState("com.cronutils.parser.CronParserFieldTest|testParse()|11", com.cronutils.parser.FieldParser.class, mockParser))).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserFieldTest|testParse()|13", cron)));
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testConstructorNameNull() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParserField>observeState("com.cronutils.parser.CronParserFieldTest|testConstructorNameNull()|1", com.cronutils.parser.CronParserField.class, new com.cronutils.parser.CronParserField(null, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.constraint.FieldConstraints>observeState("com.cronutils.parser.CronParserFieldTest|testConstructorNameNull()|0", com.cronutils.model.field.constraint.FieldConstraints.class, org.mockito.Mockito.mock(com.cronutils.model.field.constraint.FieldConstraints.class))));
        } catch (java.lang.NullPointerException a1552674205779) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserFieldTest|testConstructorNameNull()|!", a1552674205779);
            throw a1552674205779;
        }
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void testConstructorConstraintsNull() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParserField>observeState("com.cronutils.parser.CronParserFieldTest|testConstructorConstraintsNull()|1", com.cronutils.parser.CronParserField.class, new com.cronutils.parser.CronParserField(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.parser.CronParserFieldTest|testConstructorConstraintsNull()|0", com.cronutils.model.field.CronFieldName.class, testFieldName), null));
        } catch (java.lang.NullPointerException a1552674205778) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserFieldTest|testConstructorConstraintsNull()|!", a1552674205778);
            throw a1552674205778;
        }
    }
}

