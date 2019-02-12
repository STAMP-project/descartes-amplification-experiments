**Method:** `joptsimple.internal.Reflection.meetsConverterRequirements(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z`
**Transformations:** `true`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| N         | N           | Y        |

# Environment

Covered by 16 test classes.

## Method

```Java
public final class Reflection {

    private static boolean meetsConverterRequirements( Method method, Class<?> expectedReturnType ) {
        int modifiers = method.getModifiers();
        return isPublic( modifiers ) && isStatic( modifiers ) && expectedReturnType.equals( method.getReturnType() );
    }

    private static <V> ValueConverter<V> valueOfConverter( Class<V> clazz ) {
        try {
            Method valueOf = clazz.getMethod( "valueOf", String.class );
            if ( meetsConverterRequirements( valueOf, clazz ) )
                return new MethodInvokingValueConverter<>( valueOf, clazz );

            return null;
        } catch ( NoSuchMethodException ignored ) {
            return null;
        }
    }

    public static <V> ValueConverter<V> findConverter( Class<V> clazz ) {
        Class<V> maybeWrapper = wrapperOf( clazz );

        ValueConverter<V> valueOf = valueOfConverter( maybeWrapper );
        if ( valueOf != null )
            return valueOf;

        ValueConverter<V> constructor = constructorConverter( maybeWrapper );
        if ( constructor != null )
            return constructor;

        throw new IllegalArgumentException( clazz + " is not a value type" );
    }
}
```

## Observations

No test case is accessing the `Reflection` class directly except `ReflectionTest` which is testing a different set of functionalities.
The method could be easily tested as it is public. A new test case could be created.
This is a case that Evosuite should be able to solve.

