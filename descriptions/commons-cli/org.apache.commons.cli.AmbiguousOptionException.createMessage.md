**Method:** `org.apache.commons.cli.AmbiguousOptionException.createMessage.(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;`
**Transformations:** `"", "A", null`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| YYY       | YYY         | AAA      |

# Environment

Covered by  test classes.

## Method

```Java
public class AmbiguousOptionException {

    public AmbiguousOptionException(final String option, final Collection<String> matchingOptions)
    {
        super(createMessage(option, matchingOptions), option);
        this.matchingOptions = matchingOptions;
    }

}

```

## Tests

```Java
 @Test
    public void testAmbiguousPartialLongOption1() throws Exception
    {
        final String[] args = new String[] { "--ver" };
        
        final Options options = new Options();
        options.addOption(OptionBuilder.withLongOpt("version").create());
        options.addOption(OptionBuilder.withLongOpt("verbose").create());
        
        boolean caught = false;
        
        try 
        {
            parser.parse(options, args);
        }
        catch (final AmbiguousOptionException e) 
        {
            caught = true;
            assertEquals("Partial option", "--ver", e.getOption());
            assertNotNull("Matching options null", e.getMatchingOptions());
            assertEquals("Matching options size", 2, e.getMatchingOptions().size());
        }
        
        assertTrue( "Confirm MissingArgumentException caught", caught );
    }
```

## Observations
The method itself is not relevant. An assertion on the message of the exception 
could be added to detect the transformation.