package com.cronutils;


public class OpenIssuesTest {
    private org.threeten.bp.format.DateTimeFormatter dfSimple = org.threeten.bp.format.DateTimeFormatter.ofPattern("hh:mm:ss MM/dd/yyyy a X");

    private org.threeten.bp.format.DateTimeFormatter df = org.threeten.bp.format.DateTimeFormatter.ofPattern("hh:mm:ss EEE, MMM dd yyyy a X");

    @org.junit.Test
    public void testBasicCron() throws java.text.ParseException {
        printDate("03:15:00 11/20/2015 PM Z");
        printDate("03:15:00 11/27/2015 PM Z");
        // printDate("3:15:00 11/29/2015 PM");
        // printDate("3:15:00 11/30/2015 PM");
        // printDate("3:15:00 12/01/2015 PM");
        // printDate("3:15:00 12/02/2015 PM");
        // printDate("3:15:00 12/29/2015 PM");
        // printDate("3:15:00 12/30/2015 PM");
        // printDate("3:15:00 12/31/2015 PM");
    }

    private void printDate(java.lang.String startDate) throws java.text.ParseException {
        org.threeten.bp.ZonedDateTime now = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|2", org.threeten.bp.ZonedDateTime.class, org.threeten.bp.ZonedDateTime.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|0", startDate), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.format.DateTimeFormatter>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|1", org.threeten.bp.format.DateTimeFormatter.class, dfSimple)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|3", java.io.PrintStream.class, java.lang.System.out).println(("Starting: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.format.DateTimeFormatter>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|4", org.threeten.bp.format.DateTimeFormatter.class, df).format(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|5", org.threeten.bp.ZonedDateTime.class, now))))));
        printNextDate(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|7", org.threeten.bp.ZonedDateTime.class, now), "0 6 * * 0");// Sunday

        printNextDate(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|8", org.threeten.bp.ZonedDateTime.class, now), "0 6 * * 1");
        printNextDate(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|9", org.threeten.bp.ZonedDateTime.class, now), "0 6 * * 2");
        printNextDate(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|10", org.threeten.bp.ZonedDateTime.class, now), "0 6 * * 3");
        printNextDate(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|11", org.threeten.bp.ZonedDateTime.class, now), "0 6 * * 4");
        printNextDate(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|12", org.threeten.bp.ZonedDateTime.class, now), "0 6 * * 5");
        printNextDate(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printDate(java.lang.String)|13", org.threeten.bp.ZonedDateTime.class, now), "0 6 * * 6");
    }

    private void printNextDate(org.threeten.bp.ZonedDateTime now, java.lang.String cronString) {
        org.threeten.bp.ZonedDateTime date = eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printNextDate(org.threeten.bp.ZonedDateTime,java.lang.String)|2", org.threeten.bp.ZonedDateTime.class, com.cronutils.OpenIssuesTest.nextSchedule(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.OpenIssuesTest|printNextDate(org.threeten.bp.ZonedDateTime,java.lang.String)|0", cronString), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printNextDate(org.threeten.bp.ZonedDateTime,java.lang.String)|1", org.threeten.bp.ZonedDateTime.class, now)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("com.cronutils.OpenIssuesTest|printNextDate(org.threeten.bp.ZonedDateTime,java.lang.String)|3", java.io.PrintStream.class, java.lang.System.out).println(("Next time: " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.OpenIssuesTest|printNextDate(org.threeten.bp.ZonedDateTime,java.lang.String)|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.format.DateTimeFormatter>observeState("com.cronutils.OpenIssuesTest|printNextDate(org.threeten.bp.ZonedDateTime,java.lang.String)|4", org.threeten.bp.format.DateTimeFormatter.class, df).format(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|printNextDate(org.threeten.bp.ZonedDateTime,java.lang.String)|5", org.threeten.bp.ZonedDateTime.class, date))))));
    }

    private static org.threeten.bp.ZonedDateTime nextSchedule(java.lang.String cronString, org.threeten.bp.ZonedDateTime lastExecution) {
        com.cronutils.parser.CronParser cronParser = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|2", com.cronutils.parser.CronParser.class, new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|1", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|0", com.cronutils.model.CronType.class, com.cronutils.model.CronType.UNIX)))));
        com.cronutils.model.Cron cron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|5", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|3", com.cronutils.parser.CronParser.class, cronParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|4", cronString)));
        com.cronutils.model.time.ExecutionTime executionTime = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|7", com.cronutils.model.time.ExecutionTime.class, com.cronutils.model.time.ExecutionTime.forCron(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|6", com.cronutils.model.Cron.class, cron)));
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|11", org.threeten.bp.ZonedDateTime.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Optional<org.threeten.bp.ZonedDateTime>>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|10", com.google.common.base.Optional.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.ExecutionTime>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|8", com.cronutils.model.time.ExecutionTime.class, executionTime).nextExecution(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.OpenIssuesTest|nextSchedule(java.lang.String,org.threeten.bp.ZonedDateTime)|9", org.threeten.bp.ZonedDateTime.class, lastExecution))).get());
    }
}

