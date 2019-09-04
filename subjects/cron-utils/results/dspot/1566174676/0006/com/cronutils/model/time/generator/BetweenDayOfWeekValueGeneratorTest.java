package com.cronutils.model.time.generator;


import com.cronutils.mapper.WeekDay;
import com.cronutils.model.field.CronField;
import com.cronutils.model.field.CronFieldName;
import com.cronutils.model.field.constraint.FieldConstraintsBuilder;
import com.cronutils.model.field.expression.Between;
import com.cronutils.model.field.value.IntegerFieldValue;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.threeten.bp.DateTimeException;


public class BetweenDayOfWeekValueGeneratorTest {
    @Test(timeout = 10000)
    public void testGenerateCandidatesNotIncludingIntervalExtremes_literalMutationNumber36_failAssert0() throws Exception {
        try {
            CronField cronField = new CronField(CronFieldName.DAY_OF_WEEK, new Between(new IntegerFieldValue(1), new IntegerFieldValue(5)), FieldConstraintsBuilder.instance().createConstraintsInstance());
            BetweenDayOfWeekValueGenerator generator = new BetweenDayOfWeekValueGenerator(cronField, 2016, 2, new WeekDay(1, true));
            List<Integer> values = generator.generateCandidates(1, 30);
            values.contains(29);
            org.junit.Assert.fail("testGenerateCandidatesNotIncludingIntervalExtremes_literalMutationNumber36 should have thrown DateTimeException");
        } catch (DateTimeException expected) {
            Assert.assertEquals("Invalid date \'FEBRUARY 30\'", expected.getMessage());
        }
    }

    private void validateInterval(int start, int end, List<Integer> values) {
        for (int j = start; j < (end + 1); j++) {
            Assert.assertTrue(String.format("%s not contained in values", j), values.contains(j));
        }
    }
}

