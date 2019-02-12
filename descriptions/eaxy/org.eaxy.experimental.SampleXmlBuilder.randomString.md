
**Method:** `org.eaxy.experimental.SampleXmlBuilder.randomString(II)Ljava/lang/String;`
**Transformations:** `"A"`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| Y         | N           | I        |

# Environment

Covered by 2 test classes.

## Method

```Java
private String randomString(int lowerBound, int upperBound) {
    int length = random(lowerBound, upperBound);
    StringBuilder result = new StringBuilder();
    result.append(pickOne(SAMPLE_WORDS));
    for (int i = 0; i < length; i++) {
        result.append(" ").append(pickOne(SAMPLE_WORDS));
    }
    return result.toString();
}
```

## Tests

```Java
@RunWith(Parameterized.class)
public class SoapXmlBuilderDirectoryTest {
@Test
    public void shouldGenerateInput() throws IOException {
        Element msg = operation.randomInput("m");
        operation.getValidator().validate(msg);
    }
}
```

## Observations
One easy way to test this method is to call it two times and check that the 
result is not the same. This is not rigorous. However, the random string picks
words from a fixed list. The method is far from a public entry point to the class
but could be tested by generating two random elements requiring this method.
This is not intuitive, though.
The current test case only checks that there are no exceptions.
Since the other two transformations (`""` and `null`) are detected, this seems
that they produce an exception.