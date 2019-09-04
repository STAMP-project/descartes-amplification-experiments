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
public class CronDefinitionIssue25IntegrationTest {
    private com.cronutils.model.definition.CronDefinition cronDefinition;

    final java.lang.String CRON_EXPRESSION = "0 18 1";

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|setUp()|7", com.cronutils.model.definition.CronDefinition.class, (cronDefinition = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|setUp()|6", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDayOfWeekDefinitionBuilder>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|setUp()|5", com.cronutils.model.field.definition.FieldDayOfWeekDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|setUp()|4", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinitionBuilder>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|setUp()|3", com.cronutils.model.field.definition.FieldDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|setUp()|2", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinitionBuilder>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|setUp()|1", com.cronutils.model.field.definition.FieldDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|setUp()|0", com.cronutils.model.definition.CronDefinitionBuilder.class, com.cronutils.model.definition.CronDefinitionBuilder.defineCron()).withMinutes()).and()).withHours()).and()).withDayOfWeek()).and()).instance()));
    }

    @org.junit.Test
    public void testParser() {
        com.cronutils.parser.CronParser parser = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|1", com.cronutils.parser.CronParser.class, new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|0", com.cronutils.model.definition.CronDefinition.class, cronDefinition)));
        com.cronutils.model.Cron cron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|4", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|2", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|3", CRON_EXPRESSION)));
        org.junit.Assert.assertEquals("0", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|8", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|7", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|5", com.cronutils.model.Cron.class, cron).retrieve(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|6", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.MINUTE))).getExpression()).asString()));
        org.junit.Assert.assertEquals("18", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|13", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|12", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|10", com.cronutils.model.Cron.class, cron).retrieve(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|11", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.HOUR))).getExpression()).asString()));
        org.junit.Assert.assertEquals("1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|18", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|17", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|15", com.cronutils.model.Cron.class, cron).retrieve(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testParser()|16", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_WEEK))).getExpression()).asString()));
    }

    /**
     * Issue #25: next execution time produces NullPointerException for custom cron definitions.
     */
    @org.junit.Test
    public void testExecutionTime() {
        com.cronutils.parser.CronParser parser = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testExecutionTime()|1", com.cronutils.parser.CronParser.class, new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testExecutionTime()|0", com.cronutils.model.definition.CronDefinition.class, cronDefinition)));
        com.cronutils.model.Cron cron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testExecutionTime()|4", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testExecutionTime()|2", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testExecutionTime()|3", CRON_EXPRESSION)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testExecutionTime()|6", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.model.definition.CronDefinitionIssue25IntegrationTest|testExecutionTime()|5", com.cronutils.model.Cron.class, cron)));
    }
}
