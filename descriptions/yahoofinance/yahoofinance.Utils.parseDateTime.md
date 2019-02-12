**Method:** `yahoofinance.Utils.parseDateTime(Ljava/lang/String;Ljava/lang/String;Ljava/util/TimeZone;)Ljava/util/Calendar;`
**Transformations:** `null`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `null`          | Y         | Y           | A        |

# Environment

Covered by 4 test classes.

## Method

```Java

public class Utils {
    
    public static Calendar parseDateTime(String date, String time, TimeZone timeZone) {
        String datetime = date + " " + time;
        SimpleDateFormat format = new SimpleDateFormat("M/d/yyyy h:mma", Locale.US);
        
        format.setTimeZone(timeZone);
        try {
            if (Utils.isParseable(date) && Utils.isParseable(time)) {
                Calendar c = Calendar.getInstance();
                c.setTime(format.parse(datetime));
                return c;
            }
        } catch (ParseException ex) {
            log.warn("Failed to parse datetime: " + datetime);
            log.debug("Failed to parse datetime: " + datetime, ex);
        }
        return null;
    }

}

```


## Observations

In this case, the value of the date should not be null and therefore could be 
asserted from the test case.
But this applies to this particular date. The implementation involves other dates
which are parsed differently and therefore the test case doesn't fail.
