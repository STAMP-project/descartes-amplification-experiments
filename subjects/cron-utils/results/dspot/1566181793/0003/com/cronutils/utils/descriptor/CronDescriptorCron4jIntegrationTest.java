package com.cronutils.utils.descriptor;


import com.cronutils.descriptor.CronDescriptor;
import com.cronutils.model.CronType;
import com.cronutils.model.definition.CronDefinitionBuilder;
import com.cronutils.parser.CronParser;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CronDescriptorCron4jIntegrationTest {
    private CronDescriptor descriptor;

    private CronParser parser;

    @Before
    public void setUp() throws Exception {
        descriptor = CronDescriptor.instance(Locale.UK);
        parser = new CronParser(CronDefinitionBuilder.instanceDefinitionFor(CronType.CRON4J));
    }

    @Test(timeout = 10000)
    public void testEveryFiveMinutes_literalMutationString5_failAssert0() throws Exception {
        try {
            descriptor.describe(parser.parse(""));
            descriptor.describe(parser.parse("0/5 * * * *"));
            org.junit.Assert.fail("testEveryFiveMinutes_literalMutationString5 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Empty expression!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testEveryFiveMinutes_literalMutationString16() throws Exception {
        String o_testEveryFiveMinutes_literalMutationString16__1 = descriptor.describe(parser.parse("*/5 * * * *"));
        Assert.assertEquals("every 5 minutes", o_testEveryFiveMinutes_literalMutationString16__1);
        String o_testEveryFiveMinutes_literalMutationString16__3 = this.descriptor.describe(this.parser.parse("05 * * * *"));
        Assert.assertEquals("every hour at minute 5", o_testEveryFiveMinutes_literalMutationString16__3);
        Assert.assertEquals("every 5 minutes", o_testEveryFiveMinutes_literalMutationString16__1);
    }
}

