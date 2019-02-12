
**Method:** `org.eaxy.experimental.SampleXmlBuilder.chance(D)Z`
**Transformations:** `false`, `true`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| Y         | N           | Y        |

# Environment

Covered by 1 test classes.

## Method

```Java
private boolean chance(double p) {
    return random.nextDouble() < p;
}

private boolean shouldIncludeAttribute(Element attrDef) {
    return "required".equals(attrDef.attr("use")) || full || (!minimal && chance(.50));
}
```

## Tests

```Java
@RunWith(Parameterized.class)
public class SoapXmlBuilderDirectoryTest {

```

## Observations
No other side effect than the return value. Infections are observed but so
would be the same execution several times. It might produce a side effect
for `shouldIncludeAttribute`, but the tests are not checking this and the side
effect would be too deep to catch with the current technique.
A way to check this is to execute the generation several times and see that 
the attributes have been included with a 50% chance approx. but this is not
trivial.
