
**Method:** `org.eaxy.ElementSet.checkMaxOneMatch()V`
**Transformations:** `void`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| N         | N           | I        |

# Environment

Covered by 6 test classes.

## Method

```Java
public class ElementSet {
    @Nonnull
    public Element single() {
        checkMaxOneMatch();
        return first();
    }

    @Nullable
    public Element singleOrDefault() {
        checkMaxOneMatch();
        return firstOrDefault();
    }

    private void checkMaxOneMatch() {
        if (size() <= 1) return;
        String message = "Too many matches for <" + filter + ">: " + elementPaths;
        throw new IllegalArgumentException(message);
    }
    @Nonnull
    public Element first() {
        return Objects.nonnull(firstPath(), "firstPath").leafElement();
    }

    @Nullable
    public Element firstOrDefault() {
        return isEmpty() ? null : first();
    }
}
```

## Observations
Used with random values. Can be easily tested. There is no test designed for `ElementSet`.
It seems that this project has many high level tests almost integration tests.