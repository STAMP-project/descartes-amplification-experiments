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
public class CronDescriptorQuartzIntegrationTest {
    private com.cronutils.descriptor.CronDescriptor descriptor;

    private com.cronutils.parser.CronParser parser;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|setUp()|1", com.cronutils.descriptor.CronDescriptor.class, (descriptor = com.cronutils.descriptor.CronDescriptor.instance(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|setUp()|0", java.util.Locale.class, java.util.Locale.UK))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|setUp()|4", com.cronutils.parser.CronParser.class, (parser = new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|setUp()|3", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|setUp()|2", com.cronutils.model.CronType.class, com.cronutils.model.CronType.QUARTZ))))));
    }

    @org.junit.Test
    public void testCronWithAndHours() {
        assertExpression("* * 1,2,3,4 * * ? *", "at 1, 2, 3 and 4 hours");
    }

    @org.junit.Test
    public void testCronAndWithRangeHours() {
        assertExpression("* * 1,2,3,4,6-9 * * ? *", "at 1, 2, 3 and 4 hours and every hour between 6 and 9");
    }

    @org.junit.Test
    public void testCronAndWithRangesAndEveryExpressions() {
        assertExpression("0 2-59/3 1,9,22 11-26 1-6 ?", ("every 3 minutes between 2 and 59 at 1, 9 " + "and 22 hours every day between 11 and 26 every month between January and June"));
    }

    @org.junit.Test
    public void testEverySecond() {
        assertExpression("* * * * * ?", "every second");
    }

    @org.junit.Test
    public void testEvery45Seconds() {
        assertExpression("*/45 * * * * ?", "every 45 seconds");
    }

    @org.junit.Test
    public void testEveryHour() {
        assertExpression("0 0 * * * ?", "every hour");
        assertExpression("0 0 0/1 * * ?", "every hour");
    }

    /* Examples exposed at cron documentations */
    @org.junit.Test
    public void testEveryDayFireAtNoon() throws java.lang.Exception {
        assertExpression("0 0 12 * * ?", "at 12:00");
    }

    @org.junit.Test
    public void testEveryDayFireAtTenFifteen() throws java.lang.Exception {
        java.lang.String description = "at 10:15";
        assertExpression("0 15 10 ? * *", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|testEveryDayFireAtTenFifteen()|0", description));
        assertExpression("0 15 10 * * ?", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|testEveryDayFireAtTenFifteen()|1", description));
        assertExpression("0 15 10 * * ? *", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|testEveryDayFireAtTenFifteen()|2", description));
    }

    @org.junit.Test
    public void testEveryDayFireAtTenFifteenYear2005() throws java.lang.Exception {
        assertExpression("0 15 10 * * ? 2005", "at 10:15 at 2005 year");
    }

    @org.junit.Test
    public void testEveryMinuteBetween14and15EveryDay() throws java.lang.Exception {
        assertExpression("0 * 14 * * ?", "at 14 hour");
    }

    @org.junit.Test
    public void testEveryFiveMinutesBetween14and15EveryDay() throws java.lang.Exception {
        assertExpression("0 0/5 14 * * ?", "every 5 minutes at 14 hour");
    }

    @org.junit.Test
    public void testEveryFiveMinutesBetween14and15AndBetween18And19EveryDay() throws java.lang.Exception {
        assertExpression("0 0/5 14,18 * * ?", "every 5 minutes at 14 and 18 hours");
    }

    /**
     * Issue #43: getting bad description for expression
     *
     * @throws Exception
     * 		
     */
    @org.junit.Test
    public void testEveryDayEveryFourHoursFromHour2() throws java.lang.Exception {
        assertExpression("0 0 2/4 * * ?", "every 4 hours at minute 0");
    }

    /* Issue #103 */
    // TODO enable
    public void testDescriptionDayOfWeek() {
        assertExpression("* 0/1 * ? * TUE", "every minute at Tuesday day");
    }

    /**
     * Issue #105
     */
    @org.junit.Test
    public void testDoWRange() {
        assertExpression("0 0 0 ? * MON-FRI *", "at 00:00 every day between Monday and Friday");
    }

    private void assertExpression(java.lang.String cron, java.lang.String description) {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|assertExpression(java.lang.String,java.lang.String)|0", description), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|assertExpression(java.lang.String,java.lang.String)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|assertExpression(java.lang.String,java.lang.String)|1", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|assertExpression(java.lang.String,java.lang.String)|4", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|assertExpression(java.lang.String,java.lang.String)|2", com.cronutils.parser.CronParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.CronDescriptorQuartzIntegrationTest|assertExpression(java.lang.String,java.lang.String)|3", cron))))));
    }
}

