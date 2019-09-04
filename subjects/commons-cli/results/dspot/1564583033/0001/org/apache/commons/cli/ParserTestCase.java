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
    public void testAmbiguousPartialLongOption1_literalMutationString16_add585() throws Exception {
        final String[] args = new String[]{ "  -n,--new            Create NLT cache entries only for new items" };
        final Options options = new Options();
        Assert.assertEquals("[ Options: [ short {} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((Options) (options)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (options)).getRequiredOptions())).isEmpty());
        Options o_testAmbiguousPartialLongOption1_literalMutationString16__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).getRequiredOptions())).isEmpty());
        Option o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9 = OptionBuilder.withLongOpt("verbose").create();
        Assert.assertEquals("[ option: null verbose  :: null :: class java.lang.String ]", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).toString());
        Assert.assertEquals(351107458, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hashCode())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getValue());
        Assert.assertEquals(118, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getId())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getArgName());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasArgName());
        Assert.assertEquals('\u0000', ((char) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getValueSeparator())));
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasValueSeparator());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getValues());
        Assert.assertEquals(-1, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getArgs())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasOptionalArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasArgs());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).isRequired());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getDescription());
        Assert.assertTrue(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasLongOpt());
        Assert.assertEquals("verbose", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getLongOpt());
        Assert.assertTrue(((Collection) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getValuesList())).isEmpty());
        Options o_testAmbiguousPartialLongOption1_literalMutationString16__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).getRequiredOptions())).isEmpty());
        boolean caught = false;
        {
            CommandLine o_testAmbiguousPartialLongOption1_literalMutationString16__12 = this.parser.parse(options, args);
            Assert.assertTrue(((org.apache.commons.cli.CommandLine)o_testAmbiguousPartialLongOption1_literalMutationString16__12).getArgList().contains("  -n,--new            Create NLT cache entries only for new items"));
        }
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (options)).toString());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (options)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__4)).getRequiredOptions())).isEmpty());
        Assert.assertEquals("[ option: null verbose  :: null :: class java.lang.String ]", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).toString());
        Assert.assertEquals(351107458, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hashCode())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getValue());
        Assert.assertEquals(118, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getId())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getArgName());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasArgName());
        Assert.assertEquals('\u0000', ((char) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getValueSeparator())));
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasValueSeparator());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getValues());
        Assert.assertEquals(-1, ((int) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getArgs())));
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getOpt());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasOptionalArg());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasArgs());
        Assert.assertFalse(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).isRequired());
        Assert.assertNull(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getDescription());
        Assert.assertTrue(((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).hasLongOpt());
        Assert.assertEquals("verbose", ((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getLongOpt());
        Assert.assertTrue(((Collection) (((Option) (o_testAmbiguousPartialLongOption1_literalMutationString16_add585__9)).getValuesList())).isEmpty());
        Assert.assertEquals("[ Options: [ short {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ] [ long {version=[ option: null version  :: null :: class java.lang.String ], verbose=[ option: null verbose  :: null :: class java.lang.String ]} ]", ((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).toString());
        Assert.assertFalse(((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).getOptions().isEmpty());
        Assert.assertTrue(((Collection) (((Options) (o_testAmbiguousPartialLongOption1_literalMutationString16__7)).getRequiredOptions())).isEmpty());
    }

    @Test(timeout = 10000)
    public void testAmbiguousPartialLongOption1_literalMutationString15_mg2503_failAssert0() throws Exception {
        try {
            String __DSPOT_description_1776 = "WNW?/n6nafz9U$xX9TWh";
            String __DSPOT_opt_1775 = "gzH,eMfnA(A[UrF(%&F-";
            final String[] args = new String[]{ "" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString15__12 = this.parser.parse(options, args);
            }
            options.addOption(__DSPOT_opt_1775, __DSPOT_description_1776);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString15_mg2503 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The option \'gzH,eMfnA(A[UrF(%&F-\' contains an illegal character : \',\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAmbiguousPartialLongOption1_literalMutationString19_mg1293_failAssert0() throws Exception {
        try {
            String __DSPOT_description_832 = "6H4wQ*Z#c&J6Wjy.w$rr";
            boolean __DSPOT_hasArg_831 = false;
            String __DSPOT_longOpt_830 = "ab%fd,d$J/RjBDm.T/Ag";
            String __DSPOT_opt_829 = "}oiplPbds>H3!m8pr>^f";
            final String[] args = new String[]{ "Gdhsc" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString19__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString19__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString19__12 = this.parser.parse(options, args);
            }
            o_testAmbiguousPartialLongOption1_literalMutationString19__7.addRequiredOption(__DSPOT_opt_829, __DSPOT_longOpt_830, __DSPOT_hasArg_831, __DSPOT_description_832);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString19_mg1293 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The option \'}oiplPbds>H3!m8pr>^f\' contains an illegal character : \'}\'", expected.getMessage());
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

