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
    public void testAmbiguousPartialLongOption1_literalMutationString19_mg665_failAssert0() throws Exception {
        try {
            String __DSPOT_description_347 = "rnF[yh@xl+Y)]GWMwTIP";
            boolean __DSPOT_hasArg_346 = true;
            String __DSPOT_longOpt_345 = "G+fP|@!d;|P&{iJ2? u&";
            String __DSPOT_opt_344 = "gPN-lk(zs@cJk3*}f-((";
            final String[] args = new String[]{ "Gdhsc" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString19__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString19__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString19__12 = this.parser.parse(options, args);
            }
            o_testAmbiguousPartialLongOption1_literalMutationString19__4.addRequiredOption(__DSPOT_opt_344, __DSPOT_longOpt_345, __DSPOT_hasArg_346, __DSPOT_description_347);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString19_mg665 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testAmbiguousPartialLongOption1_literalMutationString15_add1647() throws Exception {
        final String[] args = new String[]{ "" };
        final Options options = new Options();
        Assert.assertTrue(((Options) (options)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (options)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {} ] [ long {} ]", ((Options) (options)).toString());
        Options o_testAmbiguousPartialLongOption1_literalMutationString15__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).toString());
        Option o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9 = OptionBuilder.withLongOpt("verbose").create();
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getDescription());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasValueSeparator());
        Assert.assertEquals(-1, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getArgs())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasOptionalArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasArgs());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).isRequired());
        Assert.assertTrue(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasLongOpt());
        Assert.assertTrue(((Collection) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getValuesList())).isEmpty());
        Assert.assertEquals('\u0000', ((char) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getValueSeparator())));
        Assert.assertEquals("verbose", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getLongOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasArgName());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getArgName());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getValues());
        Assert.assertEquals("[ option: null verbose  :: null :: class java.lang.String ]", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).toString());
        Assert.assertEquals(351107458, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hashCode())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getValue());
        Assert.assertEquals(118, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getId())));
        Options o_testAmbiguousPartialLongOption1_literalMutationString15__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).toString());
        boolean caught = false;
        {
            CommandLine o_testAmbiguousPartialLongOption1_literalMutationString15__12 = this.parser.parse(options, args);
            Assert.assertTrue(((org.apache.commons.cli.CommandLine)o_testAmbiguousPartialLongOption1_literalMutationString15__12).getArgList().contains(""));
        }
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (options)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (options)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).toString());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getDescription());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasValueSeparator());
        Assert.assertEquals(-1, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getArgs())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasOptionalArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasArgs());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).isRequired());
        Assert.assertTrue(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasLongOpt());
        Assert.assertTrue(((Collection) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getValuesList())).isEmpty());
        Assert.assertEquals('\u0000', ((char) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getValueSeparator())));
        Assert.assertEquals("verbose", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getLongOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hasArgName());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getArgName());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getValues());
        Assert.assertEquals("[ option: null verbose  :: null :: class java.lang.String ]", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).toString());
        Assert.assertEquals(351107458, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).hashCode())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getValue());
        Assert.assertEquals(118, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add1647__9)).getId())));
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).toString());
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

