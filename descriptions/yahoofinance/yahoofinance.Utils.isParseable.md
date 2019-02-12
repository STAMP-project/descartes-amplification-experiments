**Method:** `yahoofinance.Utils.isParseable(Ljava/lang/String;)Z`
**Transformations:** `true`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `true`          | Y         | N           | N        |

# Environment

Covered by 4 test classes.

## Method

```Java
public class Utils {
    private static boolean isParseable(String data) {
        return !(data == null || data.equals("N/A") || data.equals("-") 
                || data.equals("") || data.equals("nan"));
    }

    //Used in 9 other methods similar to the one below
    public static BigDecimal getBigDecimal(String data) {
        BigDecimal result = null;
        if (!Utils.isParseable(data)) {
            return result;
        }
        try {
            data = Utils.cleanNumberString(data);
            char lastChar = data.charAt(data.length() - 1);
            BigDecimal multiplier = BigDecimal.ONE;
            switch (lastChar) {
                case 'B':
                    data = data.substring(0, data.length() - 1);
                    multiplier = BILLION;
                    break;
                case 'M':
                    data = data.substring(0, data.length() - 1);
                    multiplier = MILLION;
                    break;
                case 'K':
                    data = data.substring(0, data.length() - 1);
                    multiplier = THOUSAND;
                    break;
            }
            result = new BigDecimal(data).multiply(multiplier);
        } catch (NumberFormatException e) {
            log.warn("Failed to parse: " + data);
            log.debug("Failed to parse: " + data, e);
        }
        return result;
    }
}
```

## Tests

```Java

```

## Observations
If the result is not parseable as per the method's implementation then a default
value is returned. When the transformation takes place, then an exception is
thrown and caught and the return value is the same. 
There is no way to solve this issue also, there is no way to test this directly
as the method is private.