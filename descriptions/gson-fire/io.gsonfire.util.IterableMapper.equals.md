**Method:** `io.gsonfire.util.IterableMapper.equals(Ljava/lang/Object;)Z`
**Transformations:** `true`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| N         | N           | I        |

# Environment

Covered by 1 test class.

## Method

```Java
public class IterableMapper<F, T> implements Iterable<T> {
    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof Iterable) {
            Iterator otherIterator = ((Iterable) o).iterator();
            Iterator thisIterator = this.iterator();
            while(thisIterator.hasNext()) {
                if(otherIterator.hasNext()) {
                    Object thisNext = thisIterator.next();
                    Object otherNext = otherIterator.next();
                    if(!areObjectEquals(thisNext, otherNext)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            return !otherIterator.hasNext();
        } else {
            return false;
        }
    }
}
```

## Tests

```Java
@Test
public void testEqualsWithNull() throws Exception {
    Iterable<Integer> integerIterable = SimpleIterable.of((Integer)null, 1);
    Iterable<String> iterableMapper1 = IterableMapper.create(
        integerIterable,
        new IntegerToStringMapper()
    );
    Iterable<String> iterableMapper2 = IterableMapper.create(
        integerIterable,
        new IntegerToStringMapper()
    );

    assertEquals(iterableMapper1, iterableMapper2);
}
```

## Observations
The method is suppose to return `true` the 3 times it is executed by the test suite.
