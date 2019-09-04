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
public class CronParserQuartzIntegrationTest {
    private com.cronutils.parser.CronParser parser;

    @org.junit.Rule
    public org.junit.rules.ExpectedException thrown = org.junit.rules.ExpectedException.none();

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|setUp()|2", com.cronutils.parser.CronParser.class, (parser = new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|setUp()|1", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|setUp()|0", com.cronutils.model.CronType.class, com.cronutils.model.CronType.QUARTZ))))));
    }

    /**
     * Corresponds to issue#11
     * https://github.com/jmrozanec/cron-utils/issues/11
     * Reported case:
     * when parsing: "* * * * $ ?"
     * we receive: NumberFormatException
     * Expected: throw IllegalArgumentException notifying invalid char was used
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testInvalidCharsDetected() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetected()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetected()|0", com.cronutils.parser.CronParser.class, parser).parse("* * * * $ ?"));
        } catch (java.lang.IllegalArgumentException a1552674205790) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetected()|!", a1552674205790);
            throw a1552674205790;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testInvalidCharsDetectedWithSingleSpecialChar() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithSingleSpecialChar()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithSingleSpecialChar()|0", com.cronutils.parser.CronParser.class, parser).parse("* * * * $W ?"));
        } catch (java.lang.IllegalArgumentException a1552674205791) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithSingleSpecialChar()|!", a1552674205791);
            throw a1552674205791;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testInvalidCharsDetectedWithHashExpression1() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithHashExpression1()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithHashExpression1()|0", com.cronutils.parser.CronParser.class, parser).parse("* * * * $#3 ?"));
        } catch (java.lang.IllegalArgumentException a1552674205790) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithHashExpression1()|!", a1552674205790);
            throw a1552674205790;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testInvalidCharsDetectedWithHashExpression2() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithHashExpression2()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithHashExpression2()|0", com.cronutils.parser.CronParser.class, parser).parse("* * * * 3#$ ?"));
        } catch (java.lang.IllegalArgumentException a1552674205791) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserQuartzIntegrationTest|testInvalidCharsDetectedWithHashExpression2()|!", a1552674205791);
            throw a1552674205791;
        }
    }

    /**
     * Issue #15: we should support L in range (ex.: L-3)
     */
    @org.junit.Test
    public void testLSupportedInDoMRange() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRange()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRange()|0", com.cronutils.parser.CronParser.class, parser).parse("* * * L-3 * ?"));
    }

    /**
     * Issue #15: we should support L in range (ex.: L-3), but not other special chars
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testLSupportedInRange() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInRange()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInRange()|0", com.cronutils.parser.CronParser.class, parser).parse("* * * W-3 * ?"));
        } catch (java.lang.IllegalArgumentException a1552674205792) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInRange()|!", a1552674205792);
            throw a1552674205792;
        }
    }

    @org.junit.Test
    public void testNLSupported() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testNLSupported()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testNLSupported()|0", com.cronutils.parser.CronParser.class, parser).parse("* * * 3L * ?"));
    }

    /**
     * Issue #23: we should support L in DoM
     */
    @org.junit.Test
    public void testLSupportedInDoM() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoM()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoM()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0/10 22 L * ?"));
    }

    /**
     * Issue #27: month ranges string mapping
     */
    @org.junit.Test
    public void testMonthRangeStringMapping() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMonthRangeStringMapping()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMonthRangeStringMapping()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 * JUL-AUG ? *"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMonthRangeStringMapping()|3", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMonthRangeStringMapping()|2", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 * JAN-FEB ? *"));
    }

    /**
     * Issue #27: month string mapping
     */
    @org.junit.Test
    public void testSingleMonthStringMapping() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testSingleMonthStringMapping()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testSingleMonthStringMapping()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 * JAN ? *"));
    }

    /**
     * Issue #27: day of week string ranges mapping
     */
    @org.junit.Test
    public void testDoWRangeStringMapping() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDoWRangeStringMapping()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDoWRangeStringMapping()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 ? * MON-FRI *"));
    }

    /**
     * Issue #27: day of week string mapping
     */
    @org.junit.Test
    public void testSingleDoWStringMapping() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testSingleDoWStringMapping()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testSingleDoWStringMapping()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 ? * MON *"));
    }

    /**
     * Issue #27: July month as string is parsed as some special char occurrence
     */
    @org.junit.Test
    public void testJulyMonthAsStringConsideredSpecialChar() {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testJulyMonthAsStringConsideredSpecialChar()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testJulyMonthAsStringConsideredSpecialChar()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 * JUL ? *")));
    }

    /**
     * Issue #35: A>B in range considered invalid expression for Quartz.
     */
    @org.junit.Test
    public void testSunToSat() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testSunToSat()|1", com.cronutils.model.Cron.class, // FAILS SUN-SAT: SUN = 7 and SAT = 6
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testSunToSat()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 12 ? * SUN-SAT"));
    }

    /**
     * Issue #39: reported issue about exception being raised on parse.
     */
    @org.junit.Test
    public void testParseExpressionWithQuestionMarkAndWeekdays() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testParseExpressionWithQuestionMarkAndWeekdays()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testParseExpressionWithQuestionMarkAndWeekdays()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 ? * MON,TUE *"));
    }

    /**
     * Issue #39: reported issue about exception being raised on parse.
     */
    @org.junit.Test
    public void testDescribeExpressionWithQuestionMarkAndWeekdays() {
        com.cronutils.model.Cron quartzCron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpressionWithQuestionMarkAndWeekdays()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpressionWithQuestionMarkAndWeekdays()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0 0 ? * MON,TUE *"));
        com.cronutils.descriptor.CronDescriptor descriptor = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpressionWithQuestionMarkAndWeekdays()|3", com.cronutils.descriptor.CronDescriptor.class, com.cronutils.descriptor.CronDescriptor.instance(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpressionWithQuestionMarkAndWeekdays()|2", java.util.Locale.class, java.util.Locale.ENGLISH)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpressionWithQuestionMarkAndWeekdays()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpressionWithQuestionMarkAndWeekdays()|4", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpressionWithQuestionMarkAndWeekdays()|5", com.cronutils.model.Cron.class, quartzCron)));
    }

    /**
     * Issue #60: Parser exception when parsing cron:
     */
    @org.junit.Test
    public void testDescribeExpression() {
        java.lang.String expression = "0 * * ? * 1,5";
        com.cronutils.model.definition.CronDefinition definition = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|1", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|0", com.cronutils.model.CronType.class, com.cronutils.model.CronType.QUARTZ)));
        com.cronutils.parser.CronParser parser = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|3", com.cronutils.parser.CronParser.class, new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|2", com.cronutils.model.definition.CronDefinition.class, definition)));
        com.cronutils.model.Cron c = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|6", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|4", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|5", expression)));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|8", com.cronutils.descriptor.CronDescriptor.class, com.cronutils.descriptor.CronDescriptor.instance(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|7", java.util.Locale.class, java.util.Locale.GERMAN))).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDescribeExpression()|9", com.cronutils.model.Cron.class, c)));
    }

    /**
     * Issue #63: Parser exception when parsing cron:
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testDoMAndDoWParametersInvalidForQuartz() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDoMAndDoWParametersInvalidForQuartz()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testDoMAndDoWParametersInvalidForQuartz()|0", com.cronutils.parser.CronParser.class, parser).parse("0 30 17 4 1 * 2016"));
        } catch (java.lang.IllegalArgumentException a1552674205784) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserQuartzIntegrationTest|testDoMAndDoWParametersInvalidForQuartz()|!", a1552674205784);
            throw a1552674205784;
        }
    }

    /**
     * Issue #78: ExecutionTime.forCron fails on intervals
     */
    @org.junit.Test
    public void testIntervalSeconds() {
        com.cronutils.model.time.ExecutionTime executionTime = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|2", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|0", com.cronutils.parser.CronParser.class, parser).parse("0/20 * * * * ?"))));
        org.threeten.bp.ZonedDateTime now = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|3", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.parse("2005-08-09T18:32:42Z"));
        org.threeten.bp.ZonedDateTime lastExecution = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|7", org.threeten.bp.ZonedDateTime.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Optional<org.threeten.bp.ZonedDateTime>>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|6", com.google.common.base.Optional.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|4", com.cronutils.model.time.ExecutionTime.class, executionTime).lastExecution(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|5", org.threeten.bp.ZonedDateTime.class, now))).get());
        org.threeten.bp.ZonedDateTime assertDate = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|8", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.parse("2005-08-09T18:32:40Z"));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|9", org.threeten.bp.ZonedDateTime.class, assertDate), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalSeconds()|10", org.threeten.bp.ZonedDateTime.class, lastExecution));
    }

    /**
     * Issue #78: ExecutionTime.forCron fails on intervals
     */
    @org.junit.Test
    public void testIntervalMinutes() {
        com.cronutils.model.time.ExecutionTime executionTime = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|2", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|0", com.cronutils.parser.CronParser.class, parser).parse("0 0/7 * * * ?"))));
        org.threeten.bp.ZonedDateTime now = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|3", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.parse("2005-08-09T18:32:42Z"));
        org.threeten.bp.ZonedDateTime lastExecution = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|7", org.threeten.bp.ZonedDateTime.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Optional<org.threeten.bp.ZonedDateTime>>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|6", com.google.common.base.Optional.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|4", com.cronutils.model.time.ExecutionTime.class, executionTime).lastExecution(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|5", org.threeten.bp.ZonedDateTime.class, now))).get());
        org.threeten.bp.ZonedDateTime assertDate = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|8", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.parse("2005-08-09T18:28:00Z"));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|9", org.threeten.bp.ZonedDateTime.class, assertDate), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testIntervalMinutes()|10", org.threeten.bp.ZonedDateTime.class, lastExecution));
    }

    /**
     * Issue #89: regression - NumberFormatException: For input string: "$"
     */
    @org.junit.Test
    public void testRegressionDifferentMessageForException() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRegressionDifferentMessageForException()|0", org.junit.rules.ExpectedException.class, thrown).expect(java.lang.IllegalArgumentException.class);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRegressionDifferentMessageForException()|1", org.junit.rules.ExpectedException.class, thrown).expectMessage("Invalid chars in expression! Expression: $ Invalid chars: $");
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRegressionDifferentMessageForException()|4", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRegressionDifferentMessageForException()|3", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRegressionDifferentMessageForException()|2", com.cronutils.parser.CronParser.class, parser).parse("* * * * $ ?")))));
    }

    /**
     * Issue #90: Reported error contains other expression than the one provided
     */
    @org.junit.Test
    public void testReportedErrorContainsSameExpressionAsProvided() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testReportedErrorContainsSameExpressionAsProvided()|0", org.junit.rules.ExpectedException.class, thrown).expect(java.lang.IllegalArgumentException.class);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testReportedErrorContainsSameExpressionAsProvided()|1", org.junit.rules.ExpectedException.class, thrown).expectMessage("Invalid cron expression: 0/1 * * * * *. Both, a day-of-week AND a day-of-month parameter, are not supported.");
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testReportedErrorContainsSameExpressionAsProvided()|4", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testReportedErrorContainsSameExpressionAsProvided()|3", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testReportedErrorContainsSameExpressionAsProvided()|2", com.cronutils.parser.CronParser.class, parser).parse("0/1 * * * * *")))));
    }

    /**
     * Issue #109: Missing expression and invalid chars in error message
     * https://github.com/jmrozanec/cron-utils/issues/109
     */
    @org.junit.Test
    public void testMissingExpressionAndInvalidCharsInErrorMessage() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMissingExpressionAndInvalidCharsInErrorMessage()|0", org.junit.rules.ExpectedException.class, thrown).expect(java.lang.IllegalArgumentException.class);
        java.lang.String cronexpression = "* * -1 * * ?";
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMissingExpressionAndInvalidCharsInErrorMessage()|1", org.junit.rules.ExpectedException.class, thrown).expectMessage(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserQuartzIntegrationTest|testMissingExpressionAndInvalidCharsInErrorMessage()|3", java.lang.String.format("Failed to parse '%s'. Invalid expression! Expression: -1 does not describe a range. Negative numbers are not allowed.", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserQuartzIntegrationTest|testMissingExpressionAndInvalidCharsInErrorMessage()|2", cronexpression))));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMissingExpressionAndInvalidCharsInErrorMessage()|7", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMissingExpressionAndInvalidCharsInErrorMessage()|6", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testMissingExpressionAndInvalidCharsInErrorMessage()|4", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserQuartzIntegrationTest|testMissingExpressionAndInvalidCharsInErrorMessage()|5", cronexpression))))));
    }

    /**
     * Issue #148: Cron Builder/Parser fails on Every X years
     */
    @org.junit.Test
    public void testEveryXYears() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|17", com.cronutils.builder.CronBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|15", com.cronutils.builder.CronBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|13", com.cronutils.builder.CronBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|11", com.cronutils.builder.CronBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|9", com.cronutils.builder.CronBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|6", com.cronutils.builder.CronBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|4", com.cronutils.builder.CronBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|2", com.cronutils.builder.CronBuilder.class, com.cronutils.builder.CronBuilder.cron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|1", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|0", com.cronutils.model.CronType.class, com.cronutils.model.CronType.QUARTZ))))).withDoM(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|3", com.cronutils.model.field.expression.On.class, com.cronutils.model.field.expression.FieldExpressionFactory.on(1)))).withDoW(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.QuestionMark>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|5", com.cronutils.model.field.expression.QuestionMark.class, com.cronutils.model.field.expression.FieldExpressionFactory.questionMark()))).withYear(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Every>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|8", com.cronutils.model.field.expression.Every.class, com.cronutils.model.field.expression.FieldExpressionFactory.every(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Between>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|7", com.cronutils.model.field.expression.Between.class, com.cronutils.model.field.expression.FieldExpressionFactory.between(1970, 2099)), 4)))).withMonth(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|10", com.cronutils.model.field.expression.On.class, com.cronutils.model.field.expression.FieldExpressionFactory.on(1)))).withHour(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|12", com.cronutils.model.field.expression.On.class, com.cronutils.model.field.expression.FieldExpressionFactory.on(0)))).withMinute(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|14", com.cronutils.model.field.expression.On.class, com.cronutils.model.field.expression.FieldExpressionFactory.on(0)))).withSecond(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testEveryXYears()|16", com.cronutils.model.field.expression.On.class, com.cronutils.model.field.expression.FieldExpressionFactory.on(0))));
    }

    @org.junit.Test
    public void testRejectIllegalMonthArgument() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRejectIllegalMonthArgument()|0", org.junit.rules.ExpectedException.class, thrown).expect(java.lang.IllegalArgumentException.class);
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRejectIllegalMonthArgument()|5", com.cronutils.builder.CronBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.builder.CronBuilder>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRejectIllegalMonthArgument()|3", com.cronutils.builder.CronBuilder.class, com.cronutils.builder.CronBuilder.cron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRejectIllegalMonthArgument()|2", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRejectIllegalMonthArgument()|1", com.cronutils.model.CronType.class, com.cronutils.model.CronType.QUARTZ))))).withMonth(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testRejectIllegalMonthArgument()|4", com.cronutils.model.field.expression.On.class, com.cronutils.model.field.expression.FieldExpressionFactory.on(0))));
    }

    /**
     * Issue #151: L-7 in day of month should work to find the day 7 days prior to the last day of the month.
     */
    @org.junit.Test
    public void testLSupportedInDoMRangeNextExecutionCalculation() {
        com.cronutils.model.time.ExecutionTime executionTime = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|2", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|0", com.cronutils.parser.CronParser.class, parser).parse("0 15 10 L-7 * ?"))));
        org.threeten.bp.ZonedDateTime now = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|3", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.parse("2017-01-31T10:00:00Z"));
        org.threeten.bp.ZonedDateTime nextExecution = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|7", org.threeten.bp.ZonedDateTime.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Optional<org.threeten.bp.ZonedDateTime>>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|6", com.google.common.base.Optional.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|4", com.cronutils.model.time.ExecutionTime.class, executionTime).nextExecution(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|5", org.threeten.bp.ZonedDateTime.class, now))).get());
        org.threeten.bp.ZonedDateTime assertDate = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|8", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.parse("2017-02-21T10:15:00Z"));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|9", org.threeten.bp.ZonedDateTime.class, assertDate), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testLSupportedInDoMRangeNextExecutionCalculation()|10", org.threeten.bp.ZonedDateTime.class, nextExecution));
    }

    /**
     * Issue #154: Quartz Cron Year Pattern is not fully supported - i.e. increments on years are not supported
     * https://github.com/jmrozanec/cron-utils/issues/154
     * Duplicate of #148
     */
    @org.junit.Test
    public void supportQuartzCronExpressionIncrementsOnYears() {
        final java.lang.String[] sampleCronExpressions = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|0", java.lang.String[].class, new java.lang.String[]{ "0 0 0 1 * ? 2017/2", "0 0 0 1 * ? 2017/3", "0 0 0 1 * ? 2017/10", "0 0 0 1 * ? 2017-2047/2" });
        final com.cronutils.parser.CronParser quartzCronParser = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|3", com.cronutils.parser.CronParser.class, new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|2", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|1", com.cronutils.model.CronType.class, com.cronutils.model.CronType.QUARTZ)))));
        for (final java.lang.String cronExpression : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|4", java.lang.String[].class, sampleCronExpressions)) {
            final com.cronutils.model.Cron quartzCron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|7", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|5", com.cronutils.parser.CronParser.class, quartzCronParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|6", cronExpression)));
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|9", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|supportQuartzCronExpressionIncrementsOnYears()|8", com.cronutils.model.Cron.class, quartzCron).validate());
        }
    }

    @org.junit.Test
    public void testErrorAbout2Parts() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAbout2Parts()|0", org.junit.rules.ExpectedException.class, thrown).expect(java.lang.IllegalArgumentException.class);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAbout2Parts()|1", org.junit.rules.ExpectedException.class, thrown).expectMessage("Cron expression contains 2 parts but we expect one of [6, 7]");
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAbout2Parts()|4", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAbout2Parts()|3", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAbout2Parts()|2", com.cronutils.parser.CronParser.class, parser).parse("* *")))));
    }

    @org.junit.Test
    public void testErrorAboutMissingSteps() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAboutMissingSteps()|0", org.junit.rules.ExpectedException.class, thrown).expect(java.lang.IllegalArgumentException.class);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.junit.rules.ExpectedException>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAboutMissingSteps()|1", org.junit.rules.ExpectedException.class, thrown).expectMessage("Missing steps for expression: */");
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAboutMissingSteps()|4", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAboutMissingSteps()|3", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserQuartzIntegrationTest|testErrorAboutMissingSteps()|2", com.cronutils.parser.CronParser.class, parser).parse("*/ * * * * ?")))));
    }
}

