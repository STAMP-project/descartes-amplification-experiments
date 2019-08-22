**Method:** `org.apache.commons.cli.Option.hasValueSeparator.()Z`
**Transformations:** `true`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `true`          | Y         | N           | A        |

# Environment

Covered by 18 test classes.

## Method

```Java

public class Option {


    public boolean hasValueSeparator()
    {
        return valuesep > 0;
    }

    private void processValue(String value)
    {
        // this Option has a separator character
        if (hasValueSeparator())
        {
            // get the separator character
            final char sep = getValueSeparator();

            // store the index for the value separator
            int index = value.indexOf(sep);

            // while there are more value separators
            while (index != -1)
            {
                // next value to be added 
                if (values.size() == numberOfArgs - 1)
                {
                    break;
                }

                // store
                add(value.substring(0, index));

                // parse
                value = value.substring(index + 1);

                // get new index
                index = value.indexOf(sep);
            }
        }

        // store the actual value or the last value that has been parsed
        add(value);
    }

    void addValueForProcessing(final String value)
    {
        if (numberOfArgs == UNINITIALIZED)
        {
            throw new RuntimeException("NO_ARGS_ALLOWED");
        }
        processValue(value);
    }
    
    public char getValueSeparator()
    {
        return valuesep;
    }
}
```

## Observations
If the transformed method returns `false`. The block of code that is executed
ends up doing the same as before. The key is that after:

```Java
int index = value.indexOf(sep);
```

The value of `index` is `-1`, then the `while` loop is not executed and the result
is the same. This means that this call to `hasValueSeparator` is useless.
The method can be used as an accessor to the property (as a getter).
The transformation can be caught easily but it is probably not in the interest 
of the developers. The code could be refactored.

This is a read-only computed property. It is not being used directly in the test code.
To catch the transformation, it is only needed to invoke this method in a test case where
there is a separator, something like `assertTrue(obj.hasValueSeparator())`;

