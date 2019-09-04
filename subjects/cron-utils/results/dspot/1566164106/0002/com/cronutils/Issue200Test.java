package com.cronutils;


import com.cronutils.model.Cron;
import com.cronutils.model.CronType;
import com.cronutils.model.definition.CronDefinition;
import com.cronutils.model.definition.CronDefinitionBuilder;
import com.cronutils.model.time.ExecutionTime;
import com.cronutils.parser.CronParser;
import org.junit.Assert;
import org.junit.Test;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;


public class Issue200Test {
    @Test(timeout = 10000)
    public void testMatchExact_literalMutationString9_failAssert0() throws Exception {
        try {
            CronDefinition cronDefinition = CronDefinitionBuilder.instanceDefinitionFor(CronType.QUARTZ);
            CronParser parser = new CronParser(cronDefinition);
            Cron quartzCron = parser.parse("");
            quartzCron.validate();
            ZonedDateTime zdt = ZonedDateTime.of(1999, 7, 18, 10, 0, 0, 0, ZoneId.systemDefault());
            ExecutionTime.forCron(quartzCron).isMatch(zdt);
            org.junit.Assert.fail("testMatchExact_literalMutationString9 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Empty expression!", expected.getMessage());
        }
    }
}

