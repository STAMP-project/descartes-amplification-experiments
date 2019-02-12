**Method:** `joptsimple.util.EnumConverter.message(Ljava/lang/String;)Ljava/lang/String;`
**Transformations:** `""`, `"A"`, `null`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `""`            | Y         | N           | A        |
| `"A"`           | Y         | N           | A        |
| `null`          | Y         | N           | A        |

# Environment

Covered by 1 test classes.

## Method

```Java
public abstract class EnumConverter<E extends Enum<E>> implements ValueConverter<E> {

    @Override
    public E convert( String value ) {
        for ( E each : valueType().getEnumConstants() ) {
            if ( each.name().equalsIgnoreCase( value ) ) {
                return each;
            }
        }

        throw new ValueConversionException( message( value ) );
    }

    private String message( String value ) {
        ResourceBundle bundle = ResourceBundle.getBundle( "joptsimple.ExceptionMessages" );
        Object[] arguments = new Object[] { value, valuePattern() };
        String template = bundle.getString( EnumConverter.class.getName() + ".message" );
        return new MessageFormat( template ).format( arguments );
    }
}
```

## Test

```Java
public class EnumConverterTest {
    
    @Rule
    public final ExpectedException thrown = none();

    @Test
    public void rejectsNonEnumeratedValues() {
        thrown.expect( ValueConversionException.class );

        converter.convert( "Z" );
    }
}

```

# Observations

The method is called at the end of `convert` to format the exception message.
All transformations produce an immediate program state infection.
The infection is not propagated to the test case for technical reasons.
The test uses a *JUnit* rule and thus the change is not noted at the test case 
level with our method.
However, the transformations can be tested, since the rule as a `expectedMessage`
functionality.



