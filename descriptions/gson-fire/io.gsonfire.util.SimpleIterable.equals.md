**Method:** `io.gsonfire.util.SimpleIterable.equals(Ljava/lang/Object;)Z`
**Transformations:** `true`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `true`          | N         | N           | I        |

# Environment

Covered by 1 test class.

## Method

```Java
public class SimpleIterable<T> implements Iterable<T> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleIterable<?> that = (SimpleIterable<?>) o;

        return !(iterable != null ? !iterable.equals(that.iterable) : that.iterable != null);
    }
}
```

## Tests

```Java
@Test
public void testSimpleIterated() {
    Gson gson = new GsonFireBuilder()
        .createGson();

    SimpleIterable<Integer> originalIterable = SimpleIterable.of(1, 2, 3);
    String json = gson.toJson(originalIterable);
    assertEquals("[1,2,3]", json);

    SimpleIterable<Integer> deserializedIterable = gson.fromJson(json, new TypeToken<SimpleIterable<Integer>>(){}.getType());
    assertEquals(originalIterable, deserializedIterable);
}
```

## Observations
The method is suppose to return `true` the 4 times it is executed by the test suite.