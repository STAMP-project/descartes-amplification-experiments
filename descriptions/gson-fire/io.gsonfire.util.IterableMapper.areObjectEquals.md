**Method:** `io.gsonfire.util.IterableMapper.areObjectsEqual(Ljava/lang/Object;)Z`
**Transformations:** `true`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| N         | N           | I        |

# Environment

Covered by 1 test class.

## Method

```Java
public class IterableMapper<F, T> implements Iterable<T> {
    
    private static boolean areObjectEquals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

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

## Observations
The method is suppose to return `true` the 5 times it is executed by the test suite.