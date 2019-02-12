**Method:** `joptsimple.util.InetAddressConverter.message(Ljava/lang/String;)Ljava/lang/String;`
**Transformations:** `"", "A", null`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `""`            | Y         | N           | A        |
| `"A"`           | Y         | N           | A        |
| `null`          | Y         | N           | A        |

# Environment

Covered by  test classes.

## Method

```Java
public class InetAddressConverter implements ValueConverter<InetAddress> {
    
    @Override
    public InetAddress convert( String value ) {
        try {
            return InetAddress.getByName( value );
        }
        catch ( UnknownHostException e ) {
            throw new ValueConversionException( message( value ) );
        }
    }
    
    private String message( String value ) {
        return Messages.message(
            Locale.getDefault(),
            "joptsimple.ExceptionMessages",
            InetAddressConverter.class,
            "message",
            value );
    }
}
```

## Tests

```Java
public class InetAddressConverterTest {
    private InetAddressConverter converter;

    @Test( expected = ValueConversionException.class )
    public void unknownHost() {
        converter.convert( "!(@&#()!*@&#" );
    }
}
```

## Observations

It is a similar case as the `EnumConverted.message` issue. It is the same code and 
testing patterns.
However, this time the test uses `@Test`. In this case there is no way to assert
the message.
Can be tested with rules or the good old ways.

