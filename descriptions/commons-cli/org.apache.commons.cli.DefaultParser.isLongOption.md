**Method:** `org.apache.commons.cli	DefaultParser.isLongOption.(Ljava/lang/String;)Z`
**Transformations:** `false`

| Transformations | Infection | Propagation | Testable |
|-----------------|-----------|-------------|----------|
| `false`         | Y         | N           | I        |

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

    private void handleShortAndLongOption(final String token) throws ParseException
    {
        final String t = Util.stripLeadingHyphens(token);

        final int pos = t.indexOf('=');

        if (t.length() == 1)
        {
            // -S
            if (options.hasShortOption(t))
            {
                handleOption(options.getOption(t));
            }
            else
            {
                handleUnknownToken(token);
            }
        }
        else if (pos == -1)
        {
            // no equal sign found (-xxx)
            if (options.hasShortOption(t))
            {
                handleOption(options.getOption(t));
            }
            else if (!getMatchingLongOptions(t).isEmpty())
            {
                // -L or -l
                handleLongOptionWithoutEqual(token);
            }
            else
            {
                // look for a long prefix (-Xmx512m)
                final String opt = getLongPrefix(t);

                if (opt != null && options.getOption(opt).acceptsArg())
                {
                    handleOption(options.getOption(opt));
                    currentOption.addValueForProcessing(t.substring(opt.length()));
                    currentOption = null;
                }
                else if (isJavaProperty(t))
                {
                    // -SV1 (-Dflag)
                    handleOption(options.getOption(t.substring(0, 1)));
                    currentOption.addValueForProcessing(t.substring(1));
                    currentOption = null;
                }
                else
                {
                    // -S1S2S3 or -S1S2V
                    handleConcatenatedOptions(token);
                }
            }
        }
        else
        {
            // equal sign found (-xxx=yyy)
            final String opt = t.substring(0, pos);
            final String value = t.substring(pos + 1);

            if (opt.length() == 1)
            {
                // -S=V
                final Option option = options.getOption(opt);
                if (option != null && option.acceptsArg())
                {
                    handleOption(option);
                    currentOption.addValueForProcessing(value);
                    currentOption = null;
                }
                else
                {
                    handleUnknownToken(token);
                }
            }
            else if (isJavaProperty(opt))
            {
                // -SV1=V2 (-Dkey=value)
                handleOption(options.getOption(opt.substring(0, 1)));
                currentOption.addValueForProcessing(opt.substring(1));
                currentOption.addValueForProcessing(value);
                currentOption = null;
            }
            else
            {
                // -L=V or -l=V
                handleLongOptionWithEqual(token);
            }
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


The `isLongOption` method is invoked 32 times when the entire test suite is executed.
It is expected to return `false` in 31 invocations and `true` in only one.

This method only affects a condition inside the `handleToken` method.
This condition includes an invocation to `isArgument`.

`isArgument` depends on `isOption` and `isNegativeNumber`. `isOption` depends on `isLongOptions` and `isShortOption`.
All these methods receive the same token as parameter.

In the invocation where `isLongOption` is supposed to return `true`, if the result is changed by `false` then `isShortOption` is evaluated and returns `true` therefore `isArgument` has the same result at the end.

The result of `isArgument` depends on the other methods as follows: 

    isArgument <=> not (isLongOption or isShortOption) or isNegativeNumber

The truth table is as follows:

| `isLongOption` | `isShortOption` | `isNevativeNumber` | `isArgument` |
|----------------|-----------------|--------------------|--------------|
| True           | True            | True               | True         |
| False          | True            | True               | True         |
| True           | True            | False              | False        |
| False          | True            | False              | False        |
| True           | False           | True               | True         |
| False          | False           | True               | True         |
| True           | False           | False              | False        |
| False          | False           | False              | True         |

From this table it can be seen that, if we change the value of `isLongOption`, and the other remains the same, the final result remains unchanged unless all the other values are `False`.

Then, to create a test case to catch the transformation, the input should make `isLongOption` return `true` and all the others must return `false`.

Such an input can be created from the test case above, the only one for which `isLongOption` returns `true`.

```Java
@Test
public void testAmbiguousLongWithoutEqualSingleDash() throws Exception
{
    final String[] args = new String[] { "-b", "-foobar" };

    final Options options = new Options();
    options.addOption(OptionBuilder.withLongOpt("foo").hasOptionalArg().create());
    options.addOption(OptionBuilder.withLongOpt("bar").hasOptionalArg().create('b'));

    final CommandLine cl = parser.parse(options, args);

    assertTrue(cl.hasOption("b"));
    assertTrue(cl.hasOption("foo"));
    assertEquals("bar", cl.getOptionValue("foo"));
}
```
The new test avoids the creation of a short option for the `foo` long option. The assertion then has to verify the `foo` option instead of `f`.
For `isLongOption` to be invoked, the long option should be parse in the second place. (Otherwise `currentOption` is `null`). 