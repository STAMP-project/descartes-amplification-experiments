
**Method:** `org.eaxy.experimental.SampleXmlBuilder.pickOne([Ljava/lang/Object;)Ljava/lang/Object;`
**Transformations:** `null`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| Y         | N           | I        |

# Environment

Covered by 2 test classes.

## Method

```Java
private <T> T pickOne(T[] candidates) {
    return candidates[random(candidates.length)];
}

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

## Observations
As an interesting side note this method is overloaded with a version that
receives a list instead of an array. For this other variant the transformation
is detected.
The current variant is used in `randomString`. A `StringBuilder` appends `"null"`
when given the null value. Therefore the string is something like `"null null null"`.
Very similar to what could be normally generated.
Similar to other methods in this class, the functionality is tested only to check
that no exceptions are thrown.
