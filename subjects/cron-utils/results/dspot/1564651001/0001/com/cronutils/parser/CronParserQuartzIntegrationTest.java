package com.cronutils.parser;


import com.cronutils.builder.CronBuilder;
import com.cronutils.model.Cron;
import com.cronutils.model.CronType;
import com.cronutils.model.definition.CronDefinition;
import com.cronutils.model.definition.CronDefinitionBuilder;
import com.cronutils.model.field.expression.FieldExpressionFactory;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class CronParserQuartzIntegrationTest {
    private CronParser parser;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        parser = new CronParser(CronDefinitionBuilder.instanceDefinitionFor(CronType.QUARTZ));
    }

    @Test(timeout = 10000)
    public void testEveryXYears_rv55() throws Exception {
        CronBuilder __DSPOT_invoc_1 = CronBuilder.cron(CronDefinitionBuilder.instanceDefinitionFor(CronType.QUARTZ)).withDoM(FieldExpressionFactory.on(1)).withDoW(FieldExpressionFactory.questionMark()).withYear(FieldExpressionFactory.every(FieldExpressionFactory.between(1970, 2099), 4)).withMonth(FieldExpressionFactory.on(1)).withHour(FieldExpressionFactory.on(0)).withMinute(FieldExpressionFactory.on(0)).withSecond(FieldExpressionFactory.on(0));
        Cron o_testEveryXYears_rv55__20 = __DSPOT_invoc_1.instance();
        Assert.assertFalse(((CronDefinition) (((Cron) (o_testEveryXYears_rv55__20)).getCronDefinition())).isStrictRanges());
        Assert.assertFalse(((CronDefinition) (((Cron) (o_testEveryXYears_rv55__20)).getCronDefinition())).isMatchDayOfWeekAndDayOfMonth());
        Assert.assertFalse(((Collection) (((CronDefinition) (((Cron) (o_testEveryXYears_rv55__20)).getCronDefinition())).getCronConstraints())).isEmpty());
        Assert.assertFalse(((Collection) (((CronDefinition) (((Cron) (o_testEveryXYears_rv55__20)).getCronDefinition())).getFieldDefinitions())).isEmpty());
    }
}

