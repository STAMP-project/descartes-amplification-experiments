package com.cronutils.utils.descriptor;


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
public class CronDescriptorCron4jIntegrationTest {
    private com.cronutils.descriptor.CronDescriptor descriptor;

    private com.cronutils.parser.CronParser parser;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|setUp()|1", com.cronutils.descriptor.CronDescriptor.class, (descriptor = com.cronutils.descriptor.CronDescriptor.instance(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|setUp()|0", java.util.Locale.class, java.util.Locale.UK))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|setUp()|4", com.cronutils.parser.CronParser.class, (parser = new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|setUp()|3", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|setUp()|2", com.cronutils.model.CronType.class, com.cronutils.model.CronType.CRON4J))))));
    }

    @org.junit.Test
    public void testEveryMinuteBetween1100And1110() {
        org.junit.Assert.assertEquals("every minute between 11:00 and 11:10", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinuteBetween1100And1110()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinuteBetween1100And1110()|0", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinuteBetween1100And1110()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinuteBetween1100And1110()|1", com.cronutils.parser.CronParser.class, parser).parse("0-10 11 * * *")))));
    }

    @org.junit.Test
    public void testEveryMinute() {
        org.junit.Assert.assertEquals("every minute", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|0", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|1", com.cronutils.parser.CronParser.class, parser).parse("* * * * *")))));
        org.junit.Assert.assertEquals("every minute", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|4", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|6", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|5", com.cronutils.parser.CronParser.class, parser).parse("*/1 * * * *")))));
        org.junit.Assert.assertEquals("every minute", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|8", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|10", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryMinute()|9", com.cronutils.parser.CronParser.class, parser).parse("0/1 * * * *")))));
    }

    @org.junit.Test
    public void testEveryFiveMinutes() {
        org.junit.Assert.assertEquals("every 5 minutes", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryFiveMinutes()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryFiveMinutes()|0", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryFiveMinutes()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryFiveMinutes()|1", com.cronutils.parser.CronParser.class, parser).parse("*/5 * * * *")))));
        org.junit.Assert.assertEquals("every 5 minutes", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryFiveMinutes()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryFiveMinutes()|4", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryFiveMinutes()|6", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testEveryFiveMinutes()|5", com.cronutils.parser.CronParser.class, parser).parse("0/5 * * * *")))));
    }

    @org.junit.Test
    public void testAtElevenThirty() {
        org.junit.Assert.assertEquals("at 11:30", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtElevenThirty()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtElevenThirty()|0", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtElevenThirty()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtElevenThirty()|1", com.cronutils.parser.CronParser.class, parser).parse("30 11 * * *")))));
    }

    @org.junit.Test
    public void testAtTwentyThreeFromMondayThroughFriday() {
        org.junit.Assert.assertEquals("at 23:00 every day between Monday and Friday", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtTwentyThreeFromMondayThroughFriday()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtTwentyThreeFromMondayThroughFriday()|0", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtTwentyThreeFromMondayThroughFriday()|2", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtTwentyThreeFromMondayThroughFriday()|1", com.cronutils.parser.CronParser.class, parser).parse("0 23 * * MON-FRI")))));
        org.junit.Assert.assertEquals("at 23:00 every day between Monday and Friday", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtTwentyThreeFromMondayThroughFriday()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtTwentyThreeFromMondayThroughFriday()|4", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtTwentyThreeFromMondayThroughFriday()|6", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testAtTwentyThreeFromMondayThroughFriday()|5", com.cronutils.parser.CronParser.class, parser).parse("0 23 * * 1-5")))));
    }

    /**
     * Issue #32: Exception thrown when requesting a description
     * java.util.UnknownFormatConversionException: Conversion = 'p'
     * Should not throw any exceptions!
     */
    @org.junit.Test
    public void testDescribeIssue32Expression01() {
        java.lang.String cronExpr = "* 1,2,3,4,5,6 * 1,2,3 *";
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression01()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression01()|0", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression01()|3", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression01()|1", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression01()|2", cronExpr)))));
    }

    /**
     * Issue #32: Exception thrown when requesting a description:
     * java.lang.ArrayIndexOutOfBoundsException: 1
     * Should not throw any exceptions!
     */
    @org.junit.Test
    public void testDescribeIssue32Expression02() {
        java.lang.String cronExpr = "* 1 1,2 * 4";
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression02()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression02()|0", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression02()|3", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression02()|1", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorCron4jIntegrationTest|testDescribeIssue32Expression02()|2", cronExpr)))));
    }
}

