package com.cronutils.parser;


public class CronParserCron4JIntegrationTest {
    private com.cronutils.parser.CronParser cron4jParser;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        com.cronutils.model.definition.CronDefinition cronDefinition = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|setUp()|1", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|setUp()|0", com.cronutils.model.CronType.class, com.cronutils.model.CronType.CRON4J)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|setUp()|3", com.cronutils.parser.CronParser.class, (cron4jParser = new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|setUp()|2", com.cronutils.model.definition.CronDefinition.class, cronDefinition))));
    }

    @org.junit.Test
    public void testParseIssue32Expression01() throws java.lang.Exception {
        java.lang.String cronExpr = "* 1,2,3,4,5,6 * 1,2,3 *";
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseIssue32Expression01()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseIssue32Expression01()|0", com.cronutils.parser.CronParser.class, cron4jParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseIssue32Expression01()|1", cronExpr)));
    }

    @org.junit.Test
    public void testParseIssue32Expression02() throws java.lang.Exception {
        java.lang.String cronExpr = "* 1 1,2 * 4";
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseIssue32Expression02()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseIssue32Expression02()|0", com.cronutils.parser.CronParser.class, cron4jParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseIssue32Expression02()|1", cronExpr)));
    }

    @org.junit.Test
    public void testParseStrictRangeEnforced01() throws java.lang.Exception {
        java.lang.String cronExpr = "* 1 1-2 * 4";
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseStrictRangeEnforced01()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseStrictRangeEnforced01()|0", com.cronutils.parser.CronParser.class, cron4jParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseStrictRangeEnforced01()|1", cronExpr)));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testParseStrictRangeEnforced02() throws java.lang.Exception {
        try {
            java.lang.String cronExpr = "* 1 5-2 * 4";
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseStrictRangeEnforced02()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseStrictRangeEnforced02()|0", com.cronutils.parser.CronParser.class, cron4jParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseStrictRangeEnforced02()|1", cronExpr)));
        } catch (java.lang.IllegalArgumentException a1552674205776) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseStrictRangeEnforced02()|!", a1552674205776);
            throw a1552674205776;
        }
    }

    @org.junit.Test
    public void testParseLastDayOfMonth() throws java.lang.Exception {
        java.lang.String cronExpr = "* * L * *";
        com.cronutils.model.Cron cron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseLastDayOfMonth()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseLastDayOfMonth()|0", com.cronutils.parser.CronParser.class, cron4jParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseLastDayOfMonth()|1", cronExpr)));
        org.junit.Assert.assertThat(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseLastDayOfMonth()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseLastDayOfMonth()|3", com.cronutils.model.Cron.class, cron).asString()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hamcrest.Matcher<java.lang.String>>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseLastDayOfMonth()|5", org.hamcrest.Matcher.class, org.hamcrest.core.Is.is("* * L * *")));
    }

    // issue 202
    @org.junit.Test
    public void testParseSunday() {
        java.lang.String cronExpr = "* * * * sun";
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseSunday()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseSunday()|0", com.cronutils.parser.CronParser.class, cron4jParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.parser.CronParserCron4JIntegrationTest|testParseSunday()|1", cronExpr)));
    }
}

