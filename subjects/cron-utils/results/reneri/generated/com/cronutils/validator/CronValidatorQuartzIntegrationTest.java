package com.cronutils.validator;


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
public class CronValidatorQuartzIntegrationTest {
    private com.cronutils.parser.CronParser parser;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|setUp()|2", com.cronutils.parser.CronParser.class, (parser = new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|setUp()|1", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|setUp()|0", com.cronutils.model.CronType.class, com.cronutils.model.CronType.QUARTZ))))));
    }

    /**
     * Issue #27: month range string mapping is valid
     */
    @org.junit.Test
    public void testMonthRangeMappingIsValid() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testMonthRangeMappingIsValid()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testMonthRangeMappingIsValid()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testMonthRangeMappingIsValid()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 * JUL-AUG ? *")).validate());
    }

    /**
     * Issue #27: single month string mapping is valid
     */
    @org.junit.Test
    public void testSingleMonthMappingIsValid() {
        org.threeten.bp.LocalDate date = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.LocalDate>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|0", org.threeten.bp.LocalDate.class, org.threeten.bp.LocalDate.of(2015, 1, 1));
        for (int j = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|1", j)) < 12; j++) {
            java.lang.String expression = eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|9", java.lang.String.format("0 0 0 * %s ? *", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.LocalDate>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|4", org.threeten.bp.LocalDate.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.LocalDate>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|2", org.threeten.bp.LocalDate.class, date).plusMonths(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|3", j))).format(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.format.DateTimeFormatter>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|6", org.threeten.bp.format.DateTimeFormatter.class, org.threeten.bp.format.DateTimeFormatter.ofPattern("MMM", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|5", java.util.Locale.class, java.util.Locale.US))))).toUpperCase())));
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|12", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|10", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testSingleMonthMappingIsValid()|11", expression)));
        }
    }

    /**
     * Issue #27: day of week range string mapping is valid
     */
    @org.junit.Test
    public void testDayOfWeekRangeMappingIsValid() {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testDayOfWeekRangeMappingIsValid()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testDayOfWeekRangeMappingIsValid()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 ? * MON-FRI *")));
    }

    /**
     * Issue #27: single day of week string mapping is valid
     */
    @org.junit.Test
    public void testDayOfWeekMappingIsValid() {
        for (java.lang.String dow : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testDayOfWeekMappingIsValid()|0", java.lang.String[].class, new java.lang.String[]{ "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" })) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testDayOfWeekMappingIsValid()|4", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testDayOfWeekMappingIsValid()|1", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testDayOfWeekMappingIsValid()|3", java.lang.String.format("0 0 0 ? * %s *", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testDayOfWeekMappingIsValid()|2", dow)))));
        }
    }

    /**
     * Issue #31: expressions
     * "0 10,44 14 ? 3 WED" and "0 0 12 ? * SAT-SUN"
     * considered invalid when replacing '?' for '*'
     * Fixed by adding support for question mark character.
     */
    @org.junit.Test
    public void testQuestionMarkSupport() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testQuestionMarkSupport()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testQuestionMarkSupport()|0", com.cronutils.parser.CronParser.class, parser).parse("0 10,44 14 ? 3 WED"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testQuestionMarkSupport()|3", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testQuestionMarkSupport()|2", com.cronutils.parser.CronParser.class, parser).parse("0 0 12 ? * FRI-SAT"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testQuestionMarkSupport()|5", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.validator.CronValidatorQuartzIntegrationTest|testQuestionMarkSupport()|4", com.cronutils.parser.CronParser.class, parser).parse("0 0 12 ? * SAT-SUN"));
    }
}

