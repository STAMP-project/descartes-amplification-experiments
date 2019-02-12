**Method:** `yahoofinance.Utils.unescape(Ljava/lang/String;)Ljava/lang/String;`
**Transformations:** `"", "A", null`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| Y         | N           | I        |

# Environment

Covered by  test classes.

## Method

```Java

public class Utils {
    public static String unescape(String data) {
        StringBuilder buffer = new StringBuilder(data.length());
        for (int i = 0; i < data.length(); i++) {
            if ((int) data.charAt(i) > 256) {
                buffer.append("\\u").append(Integer.toHexString((int) data.charAt(i)));
            } else {
                if (data.charAt(i) == '\n') {
                    buffer.append("\\n");
                } else if (data.charAt(i) == '\t') {
                    buffer.append("\\t");
                } else if (data.charAt(i) == '\r') {
                    buffer.append("\\r");
                } else if (data.charAt(i) == '\b') {
                    buffer.append("\\b");
                } else if (data.charAt(i) == '\f') {
                    buffer.append("\\f");
                } else if (data.charAt(i) == '\'') {
                    buffer.append("\\'");
                } else if (data.charAt(i) == '\"') {
                    buffer.append("\\\"");
                } else if (data.charAt(i) == '\\') {
                    buffer.append("\\\\");
                } else {
                    buffer.append(data.charAt(i));
                }
            }
        }
        return buffer.toString();
    }
}

```
```Java

log.info("Parsing CSV line: " + Utils.unescape(line));

```

## Observations
The method is only used to format a log message. It can be tested directly with
new input.

