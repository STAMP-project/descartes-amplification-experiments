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
    public void testAmbiguousPartialLongOption1_literalMutationString15_add2226() throws Exception {
        final String[] args = new String[]{ "" };
        final Options options = new Options();
        Assert.assertEquals("[ Options: [ short {} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((Options) (options)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (options)).getRequiredOptions())).isEmpty());
        Option o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4 = OptionBuilder.withLongOpt("version").create();
        Assert.assertEquals("[ option: null version  :: null :: class java.lang.String ]", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).toString());
        Assert.assertEquals(351608024, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hashCode())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getValue());
        Assert.assertEquals(118, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getId())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getDescription());
        Assert.assertEquals(-1, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getArgs())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasOptionalArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasArgs());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).isRequired());
        Assert.assertTrue(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasLongOpt());
        Assert.assertEquals("version", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getLongOpt());
        Assert.assertTrue(((Collection) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getValuesList())).isEmpty());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasArgName());
        Assert.assertEquals('\u0000', ((char) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getValueSeparator())));
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasValueSeparator());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getValues());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getArgName());
        Options o_testAmbiguousPartialLongOption1_literalMutationString15__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).getRequiredOptions())).isEmpty());
        Options o_testAmbiguousPartialLongOption1_literalMutationString15__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).getRequiredOptions())).isEmpty());
        boolean caught = false;
        {
            CommandLine o_testAmbiguousPartialLongOption1_literalMutationString15__12 = this.parser.parse(options, args);
            Assert.assertTrue(((org.apache.commons.cli.CommandLine)o_testAmbiguousPartialLongOption1_literalMutationString15__12).getArgList().contains(""));
        }
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (options)).toString());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (options)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ option: null version  :: null :: class java.lang.String ]", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).toString());
        Assert.assertEquals(351608024, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hashCode())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getValue());
        Assert.assertEquals(118, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getId())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getDescription());
        Assert.assertEquals(-1, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getArgs())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasOptionalArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasArgs());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).isRequired());
        Assert.assertTrue(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasLongOpt());
        Assert.assertEquals("version", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getLongOpt());
        Assert.assertTrue(((Collection) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getValuesList())).isEmpty());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasArgName());
        Assert.assertEquals('\u0000', ((char) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getValueSeparator())));
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).hasValueSeparator());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getValues());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString15_add2226__4)).getArgName());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__4)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString15__7)).getRequiredOptions())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testAmbiguousPartialLongOption1_literalMutationString15_mg2594_failAssert0() throws Exception {
        try {
            String __DSPOT_description_1872 = "TMoL!F;)+m$Z,ABmj}4`";
            String __DSPOT_opt_1871 = "uh(SN[lI!`JTTfk]AQ/Z";
            final String[] args = new String[]{ "" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString15__12 = this.parser.parse(options, args);
            }
            o_testAmbiguousPartialLongOption1_literalMutationString15__4.addOption(__DSPOT_opt_1871, __DSPOT_description_1872);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString15_mg2594 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testAmbiguousPartialLongOption1_literalMutationString16_mg1226_failAssert0() throws Exception {
        try {
            String __DSPOT_description_721 = "tc v@<AOgA9#59;D%ZDC";
            boolean __DSPOT_hasArg_720 = true;
            String __DSPOT_longOpt_719 = " s$Ug_Ng#jo{!RP*pC2G";
            String __DSPOT_opt_718 = "G>vb%*)9?CiJGi_04_3;";
            final String[] args = new String[]{ "  -n,--new            Create NLT cache entries only for new items" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString16__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString16__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString16__12 = this.parser.parse(options, args);
            }
            o_testAmbiguousPartialLongOption1_literalMutationString16__4.addRequiredOption(__DSPOT_opt_718, __DSPOT_longOpt_719, __DSPOT_hasArg_720, __DSPOT_description_721);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString16_mg1226 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The option \'G>vb%*)9?CiJGi_04_3;\' contains an illegal character : \'>\'", expected.getMessage());
        }
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

