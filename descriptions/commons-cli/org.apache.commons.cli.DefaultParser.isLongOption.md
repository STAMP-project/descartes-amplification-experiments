**Method:** `org.apache.commons.cli	DefaultParser.isLongOption.(Ljava/lang/String;)Z`
**Transformations:** `false`

| Infection | Propagation | Testable |
|-----------|-------------|----------|
| Y         | N           | ?        |

# Environment

Covered by 7 test classes.

## Method

```Java
public class DefaultParser implements CommandLineParser
{

    private boolean isLongOption(final String token)
    {
        if (!token.startsWith("-") || token.length() == 1)
        {
            return false;
        }

        final int pos = token.indexOf("=");
        final String t = pos == -1 ? token : token.substring(0, pos);

        if (!getMatchingLongOptions(t).isEmpty())
        {
            // long or partial long options (--L, -L, --L=V, -L=V, --l, --l=V)
            return true;
        }
        else if (getLongPrefix(token) != null && !token.startsWith("--"))
        {
            // -LV
            return true;
        }

        return false;
    }

    private boolean isOption(final String token) { return isLongOption(token) || isShortOption(token); }
    
    private boolean isArgument(final String token)
    {
        return !isOption(token) || isNegativeNumber(token);
    }

    private void handleToken(final String token) throws ParseException
    {
        currentToken = token;

        if (skipParsing)
        {
            cmd.addArg(token);
        }
        else if ("--".equals(token))
        {
            skipParsing = true;
        }
        else if (currentOption != null && currentOption.acceptsArg() && isArgument(token))
        {
            currentOption.addValueForProcessing(Util.stripLeadingAndTrailingQuotes(token));
        }
        else if (token.startsWith("--"))
        {
            handleLongOption(token);
        }
        else if (token.startsWith("-") && !"-".equals(token))
        {
            handleShortAndLongOption(token);
        }
        else
        {
            handleUnknownToken(token);
        }

        if (currentOption != null && !currentOption.acceptsArg())
        {
            currentOption = null;
        }
    }

     public CommandLine parse(final Options options, final String[] arguments, final Properties properties, final boolean stopAtNonOption)
            throws ParseException
    {
        this.options = options;
        this.stopAtNonOption = stopAtNonOption;
        skipParsing = false;
        currentOption = null;
        expectedOpts = new ArrayList(options.getRequiredOptions());

        // clear the data from the groups
        for (final OptionGroup group : options.getOptionGroups())
        {
            group.setSelected(null);
        }

        cmd = new CommandLine();

        if (arguments != null)
        {
            for (final String argument : arguments)
            {
                handleToken(argument);
            }
        }

        // check the arguments of the last option
        checkRequiredArgs();

        // add the default options
        handleProperties(properties);

        checkRequiredOptions();

        return cmd;
    }


}

```

## Tests

```Java
@Test
public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
{
    final String[] args = new String[] { "-b", "-foobar" };

    final Options options = new Options();
    options.addOption(OptionBuilder.withLongOpt("foo").hasOptionalArg().create('f'));
    options.addOption(OptionBuilder.withLongOpt("bar").hasOptionalArg().create('b'));

    final CommandLine cl = parser.parse(options, args);

    assertTrue(cl.hasOption("b"));
    assertTrue(cl.hasOption("f"));
    assertEquals("bar", cl.getOptionValue("foo"));
}
```

## Observations

The only test case that manifests an infection is the one above. Our tool detected
that the return value should have been `true` instead of `false`. It seems that
with a `false` result, then, the execution invokes `handleShortAndLongOption`
and this method ends up doing just the same.
So, is the `isLongOption` method actually needed?
For this case we don't know for sure if there is an input that can detect the 
transformation.