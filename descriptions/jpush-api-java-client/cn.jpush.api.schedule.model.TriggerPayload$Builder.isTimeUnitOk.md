**Method:** `cn.jpush.api.schedule.model.TriggerPayload$Builder.isTimeUnitOk(Lcn/jiguang/common/TimeUnit;)Z`
**Transformations:** `true`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `true`          | N         | N           | I        |

# Environment

Covered by 1 test class.

## Method

```Java

public class TriggerPayload implements IModel {

    public static class Builder{

        public TriggerPayload buildPeriodical() {
            Preconditions.checkArgument(StringUtils.isNotEmpty(start), "The start must not be empty.");
            Preconditions.checkArgument(StringUtils.isNotEmpty(end), "The end must not be empty.");
            Preconditions.checkArgument(StringUtils.isNotEmpty(time), "The time must not be empty.");

            Preconditions.checkArgument(TimeUtils.isDateFormat(start), "The start format is incorrect.");
            Preconditions.checkArgument(TimeUtils.isDateFormat(end), "The end format is incorrect.");
            Preconditions.checkArgument(TimeUtils.isTimeFormat(time), "The time format is incorrect.");

            Preconditions.checkNotNull(time_unit, "The time_unit must not be null.");
            Preconditions.checkArgument(isTimeUnitOk(time_unit), "The time unit must be DAY, WEEK or MONTH.");

            Preconditions.checkArgument(frequency > 0 && frequency < 101, "The frequency must be a int between 1 and 100.");

            return new TriggerPayload(start, end, time, time_unit, frequency, point);
        }

        private boolean isTimeUnitOk(TimeUnit timeUnit) {
            switch (timeUnit) {
                case HOUR:
                    return false;
                case DAY:
                case WEEK:
                case MONTH:
                    return true;
                default:
                    return false;
            }
        }
    }
}

```

## Tests

```Java
@Test
public void testBuildPeriodical() {
    String start = "2015-07-30 10:12:23";
    String end = "2015-08-30 10:12:23";
    String time = "10:12:00";
    String[] point = {"MON", "TUE"};

    TriggerPayload trigger = TriggerPayload.newBuilder()
            .setPeriodTime(start, end, time)
            .setTimeFrequency(TimeUnit.WEEK, 2, point)
            .buildPeriodical();

    JsonObject json = new JsonObject();
    JsonObject periodical = new JsonObject();
    periodical.addProperty("start", start);
    periodical.addProperty("end", end);
    periodical.addProperty("time", time);
    periodical.addProperty("time_unit", TimeUnit.WEEK.name().toLowerCase());
    periodical.addProperty("frequency", 2);
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("MON"));
    array.add(new JsonPrimitive("TUE"));
    periodical.add("point", array);
    json.add("periodical", periodical);

    Assert.assertEquals("", json, trigger.toJSON());

}
```

## Observations

The method is executed in only one test case, where it returns `true`.
Maybe not in the interest of developers as the method seems a safe-net.
`TimeUnit` is an enum from another project. Creating a new test case might not
be useful/feasible.

