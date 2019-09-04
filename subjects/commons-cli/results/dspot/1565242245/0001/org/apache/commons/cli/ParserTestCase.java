package org.apache.commons.cli;


import java.util.Collection;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public abstract class ParserTestCase {
    protected CommandLineParser parser;

    protected Options options;

    @Before
    public void setUp() {
        options = new Options().addOption("a", "enable-a", false, "turn [a] on or off").addOption("b", "bfile", true, "set the value of [b]").addOption("c", "copt", false, "turn [c] on or off");
    }

    @Test(timeout = 10000)
    public void testAmbiguousPartialLongOption1_literalMutationString16_add1201() throws Exception {
        final String[] args = new String[]{ "  -n,--new            Create NLT cache entries only for new items" };
        final Options options = new Options();
        Assert.assertTrue(((Options) (options)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (options)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {} ] [ long {} ]", ((Options) (options)).toString());
        Option o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4 = OptionBuilder.withLongOpt("version").create();
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getDescription());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasValueSeparator());
        Assert.assertEquals(-1, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getArgs())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasOptionalArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasArgs());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).isRequired());
        Assert.assertTrue(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasLongOpt());
        Assert.assertEquals("version", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getLongOpt());
        Assert.assertTrue(((Collection) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getValuesList())).isEmpty());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getArgName());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasArgName());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getValues());
        Assert.assertEquals('\u0000', ((char) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getValueSeparator())));
        Assert.assertEquals("[ option: null version  :: null :: class java.lang.String ]", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).toString());
        Assert.assertEquals(351608024, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hashCode())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getValue());
        Assert.assertEquals(118, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getId())));
        Options o_testAmbiguousPartialLongOption1_literalMutationString16__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).toString());
        Options o_testAmbiguousPartialLongOption1_literalMutationString16__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).toString());
        boolean caught = false;
        {
            CommandLine o_testAmbiguousPartialLongOption1_literalMutationString16__12 = this.parser.parse(options, args);
            Assert.assertTrue(((org.apache.commons.cli.CommandLine)o_testAmbiguousPartialLongOption1_literalMutationString16__12).getArgList().contains("  -n,--new            Create NLT cache entries only for new items"));
        }
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (options)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (options)).toString());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getDescription());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasValueSeparator());
        Assert.assertEquals(-1, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getArgs())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasOptionalArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasArgs());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).isRequired());
        Assert.assertTrue(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasLongOpt());
        Assert.assertEquals("version", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getLongOpt());
        Assert.assertTrue(((Collection) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getValuesList())).isEmpty());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getArgName());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hasArgName());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getValues());
        Assert.assertEquals('\u0000', ((char) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getValueSeparator())));
        Assert.assertEquals("[ option: null version  :: null :: class java.lang.String ]", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).toString());
        Assert.assertEquals(351608024, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).hashCode())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getValue());
        Assert.assertEquals(118, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add1201__4)).getId())));
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).toString());
    }

    @SuppressWarnings("deprecation")
    private CommandLine parse(final CommandLineParser parser, final Options opts, final String[] args, final Properties properties) throws ParseException {
        if (parser instanceof Parser) {
            return ((Parser) (parser)).parse(opts, args, properties);
        } else {
            if (parser instanceof DefaultParser) {
                return ((DefaultParser) (parser)).parse(opts, args, properties);
            } else {
                throw new UnsupportedOperationException("Default options not supported by this parser");
            }
        }
    }
}

