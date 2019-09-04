package com.cronutils.utils.descriptor;


/**
 *
 *
 * @author minidmnv
 */
public class Issue227Test {
    /**
     * Issue #227 - Getting a leaking "%s" in description output
     */
    private com.cronutils.parser.CronParser parser;

    private org.threeten.bp.ZonedDateTime currentDateTime;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZonedDateTime>observeState("com.cronutils.utils.descriptor.Issue227Test|setUp()|2", org.threeten.bp.ZonedDateTime.class, (currentDateTime = org.threeten.bp.ZonedDateTime.of(eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.LocalDateTime>observeState("com.cronutils.utils.descriptor.Issue227Test|setUp()|0", org.threeten.bp.LocalDateTime.class, org.threeten.bp.LocalDateTime.of(2016, 12, 20, 12, 0)), eu.stamp_project.reneri.instrumentation.StateObserver.<org.threeten.bp.ZoneId>observeState("com.cronutils.utils.descriptor.Issue227Test|setUp()|1", org.threeten.bp.ZoneId.class, org.threeten.bp.ZoneId.systemDefault()))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.Issue227Test|setUp()|5", com.cronutils.parser.CronParser.class, (parser = new com.cronutils.parser.CronParser(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.definition.CronDefinition>observeState("com.cronutils.utils.descriptor.Issue227Test|setUp()|4", com.cronutils.model.definition.CronDefinition.class, com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.CronType>observeState("com.cronutils.utils.descriptor.Issue227Test|setUp()|3", com.cronutils.model.CronType.class, com.cronutils.model.CronType.QUARTZ))))));
    }

    @org.junit.Test
    public void testProperDescriptorOutput() {
        com.cronutils.model.Cron cron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutput()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutput()|0", com.cronutils.parser.CronParser.class, parser).parse("0 5-35/30 * * * ?"));
        com.cronutils.descriptor.CronDescriptor descriptor = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutput()|3", com.cronutils.descriptor.CronDescriptor.class, com.cronutils.descriptor.CronDescriptor.instance(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutput()|2", java.util.Locale.class, java.util.Locale.US)));
        java.lang.String description = eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutput()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutput()|4", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutput()|5", com.cronutils.model.Cron.class, cron)));
        org.junit.Assert.assertEquals("every 30 minutes between 5 and 35", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutput()|7", description));
    }

    @org.junit.Test
    public void testProperDescriptorOutputWithSeconds() {
        com.cronutils.model.Cron cron = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutputWithSeconds()|1", com.cronutils.model.Cron.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.parser.CronParser>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutputWithSeconds()|0", com.cronutils.parser.CronParser.class, parser).parse("5-35/30 * * * * ?"));
        com.cronutils.descriptor.CronDescriptor descriptor = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutputWithSeconds()|3", com.cronutils.descriptor.CronDescriptor.class, com.cronutils.descriptor.CronDescriptor.instance(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Locale>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutputWithSeconds()|2", java.util.Locale.class, java.util.Locale.US)));
        java.lang.String description = eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutputWithSeconds()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.descriptor.CronDescriptor>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutputWithSeconds()|4", com.cronutils.descriptor.CronDescriptor.class, descriptor).describe(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.Cron>observeState("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutputWithSeconds()|5", com.cronutils.model.Cron.class, cron)));
        org.junit.Assert.assertEquals("every 30 seconds between 5 and 35", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.utils.descriptor.Issue227Test|testProperDescriptorOutputWithSeconds()|7", description));
    }
}

