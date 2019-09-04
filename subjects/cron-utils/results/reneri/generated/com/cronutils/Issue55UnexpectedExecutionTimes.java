package com.cronutils;


public class Issue55UnexpectedExecutionTimes {
    private com.cronutils.model.definition.CronDefinition cronDefinition;

    /**
     * Setup.
     */
    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|38", com.cronutils.model.definition.CronDefinition.class, (cronDefinition = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|37", com.cronutils.model.definition.CronDefinitionBuilder.class, // both a day-of-week AND a day-of-month parameter should fail for this case; otherwise returned values are correct
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|22", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|21", com.cronutils.model.field.definition.FieldDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|20", com.cronutils.model.field.definition.FieldDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|19", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldQuestionMarkDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|18", com.cronutils.model.field.definition.FieldQuestionMarkDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|17", com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|16", com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|15", com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder.class, // we support non-standard non-zero-based numbers!
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDayOfWeekDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|14", com.cronutils.model.field.definition.FieldDayOfWeekDefinitionBuilder.class, // Monday=1
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDayOfWeekDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|13", com.cronutils.model.field.definition.FieldDayOfWeekDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|12", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|11", com.cronutils.model.field.definition.FieldDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|10", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldQuestionMarkDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|9", com.cronutils.model.field.definition.FieldQuestionMarkDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|8", com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|7", com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|6", com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|5", com.cronutils.model.field.definition.FieldSpecialCharsDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|4", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|3", com.cronutils.model.field.definition.FieldDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|2", com.cronutils.model.definition.CronDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.definition.FieldDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|1", com.cronutils.model.field.definition.FieldDefinitionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinitionBuilder>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|0", com.cronutils.model.definition.CronDefinitionBuilder.class, com.cronutils.model.definition.CronDefinitionBuilder.defineCron()).withMinutes()).and()).withHours()).and()).withDayOfMonth()).supportsHash()).supportsL()).supportsW()).supportsQuestionMark()).and()).withMonth()).and()).withDayOfWeek()).withIntMapping(7, 0)).supportsHash()).supportsL()).supportsW()).supportsQuestionMark()).and()).withYear()).optional()).and()).withCronValidation(new com.cronutils.model.definition.CronConstraint("Both, a day-of-week AND a day-of-month parameter, are not supported.") {
            @java.lang.Override
            public boolean validate(com.cronutils.model.Cron cron) {
                if (!((eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|28", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|27", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|25", com.cronutils.model.Cron.class, cron).retrieve(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|26", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_MONTH))).getExpression())) instanceof com.cronutils.model.field.expression.QuestionMark)) {
                    return (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|32", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|31", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|29", com.cronutils.model.Cron.class, cron).retrieve(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|30", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_WEEK))).getExpression())) instanceof com.cronutils.model.field.expression.QuestionMark;
                }else {
                    return !((eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.FieldExpression>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|36", com.cronutils.model.field.expression.FieldExpression.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronField>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|35", com.cronutils.model.field.CronField.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|33", com.cronutils.model.Cron.class, cron).retrieve(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.CronFieldName>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|setUp()|34", com.cronutils.model.field.CronFieldName.class, com.cronutils.model.field.CronFieldName.DAY_OF_WEEK))).getExpression())) instanceof com.cronutils.model.field.expression.QuestionMark);
                }
            }
        })).instance()));
    }

    /**
     * Test.
     */
    @org.junit.Test
    public void testOnceEveryThreeDaysNoInstantsWithinTwoDays() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|0", java.io.PrintStream.class, java.lang.System.out).println();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|1", java.io.PrintStream.class, java.lang.System.out).println("TEST1 - expecting 0 instants");
        org.threeten.bp.ZonedDateTime startTime = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|3", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.of(0, 1, 1, 0, 0, 0, 0, eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZoneOffset>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|2", org.threeten.bp.ZoneOffset.class, org.threeten.bp.ZoneOffset.UTC)));
        final org.threeten.bp.ZonedDateTime endTime = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|5", org.threeten.bp.ZonedDateTime.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|4", org.threeten.bp.ZonedDateTime.class, startTime).plusDays(2));
        final com.cronutils.parser.CronParser parser = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|7", com.cronutils.parser.CronParser.class, new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|6", com.cronutils.model.definition.CronDefinition.class, cronDefinition)));
        final com.cronutils.model.Cron cron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|9", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|8", com.cronutils.parser.CronParser.class, parser).parse("0 0 */3 * ?"));
        final com.cronutils.model.time.ExecutionTime executionTime = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|11", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|10", com.cronutils.model.Cron.class, cron)));
        java.util.List<org.threeten.bp.Instant> instants = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|15", java.util.List.class, getInstants(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|12", com.cronutils.model.time.ExecutionTime.class, executionTime), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|13", org.threeten.bp.ZonedDateTime.class, startTime), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|14", org.threeten.bp.ZonedDateTime.class, endTime)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|16", java.io.PrintStream.class, java.lang.System.out).println(("instants.size() == " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|17", java.util.List.class, instants).size()))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|19", java.io.PrintStream.class, java.lang.System.out).println(("instants: " + (eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|20", java.util.List.class, instants))));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceEveryThreeDaysNoInstantsWithinTwoDays()|21", java.util.List.class, instants).size()));
    }

    /**
     * Test.
     */
    @org.junit.Test
    public void testOnceAMonthTwelveInstantsInYear() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|0", java.io.PrintStream.class, java.lang.System.out).println();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|1", java.io.PrintStream.class, java.lang.System.out).println("TEST2 - expecting 12 instants");
        org.threeten.bp.ZonedDateTime startTime = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|3", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.of(0, 1, 1, 0, 0, 0, 0, eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZoneOffset>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|2", org.threeten.bp.ZoneOffset.class, org.threeten.bp.ZoneOffset.UTC)));
        final org.threeten.bp.ZonedDateTime endTime = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|5", org.threeten.bp.ZonedDateTime.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|4", org.threeten.bp.ZonedDateTime.class, startTime).plusYears(1));
        final com.cronutils.parser.CronParser parser = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|7", com.cronutils.parser.CronParser.class, new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|6", com.cronutils.model.definition.CronDefinition.class, cronDefinition)));
        final com.cronutils.model.Cron cron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|9", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|8", com.cronutils.parser.CronParser.class, parser).parse("0 12 L * ?"));
        final com.cronutils.model.time.ExecutionTime executionTime = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|11", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|10", com.cronutils.model.Cron.class, cron)));
        java.util.List<org.threeten.bp.Instant> instants = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|15", java.util.List.class, getInstants(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|12", com.cronutils.model.time.ExecutionTime.class, executionTime), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|13", org.threeten.bp.ZonedDateTime.class, startTime), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|14", org.threeten.bp.ZonedDateTime.class, endTime)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|16", java.io.PrintStream.class, java.lang.System.out).println(("instants.size() == " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|17", java.util.List.class, instants).size()))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|19", java.io.PrintStream.class, java.lang.System.out).println(("instants: " + (eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|20", java.util.List.class, instants))));
        org.junit.Assert.assertEquals(12, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|testOnceAMonthTwelveInstantsInYear()|21", java.util.List.class, instants).size()));
    }

    private java.util.List<org.threeten.bp.Instant> getInstants(com.cronutils.model.time.ExecutionTime executionTime, org.threeten.bp.ZonedDateTime startTime, org.threeten.bp.ZonedDateTime endTime) {
        java.util.List<org.threeten.bp.Instant> instantList = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|0", java.util.ArrayList.class, new java.util.ArrayList<>());
        org.threeten.bp.ZonedDateTime next = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|4", org.threeten.bp.ZonedDateTime.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Optional<org.threeten.bp.ZonedDateTime>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|3", com.google.common.base.Optional.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|1", com.cronutils.model.time.ExecutionTime.class, executionTime).nextExecution(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|2", org.threeten.bp.ZonedDateTime.class, startTime))).get());
        while (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|5", org.threeten.bp.ZonedDateTime.class, next).isBefore(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|6", org.threeten.bp.ZonedDateTime.class, endTime)))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|8", java.util.List.class, instantList).add(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.Instant>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|10", org.threeten.bp.Instant.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|9", org.threeten.bp.ZonedDateTime.class, next).toInstant())));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|15", org.threeten.bp.ZonedDateTime.class, (next = eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Optional<org.threeten.bp.ZonedDateTime>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|14", com.google.common.base.Optional.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|12", com.cronutils.model.time.ExecutionTime.class, executionTime).nextExecution(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|13", org.threeten.bp.ZonedDateTime.class, next))).get()));
        } 
        return eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.threeten.bp.Instant>>observeState("com.cronutils.Issue55UnexpectedExecutionTimes|getInstants(com.cronutils.model.time.ExecutionTime,org.threeten.bp.ZonedDateTime,org.threeten.bp.ZonedDateTime)|16", java.util.List.class, instantList);
    }
}

