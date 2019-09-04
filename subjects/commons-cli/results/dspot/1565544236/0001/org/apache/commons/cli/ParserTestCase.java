package org.apache.commons.cli;


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
    public void testAmbiguousPartialLongOption1_literalMutationString16_mg2010_failAssert0() throws Exception {
        try {
            String __DSPOT_description_1402 = "bOt9[B:){=Q3-2RDALTd";
            boolean __DSPOT_hasArg_1401 = false;
            String __DSPOT_longOpt_1400 = "ju|P$jHU0]R`(xr#Y4j^";
            String __DSPOT_opt_1399 = "(P|FB;^9|HPsQwsV7EE+";
            final String[] args = new String[]{ "  -n,--new            Create NLT cache entries only for new items" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString16__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString16__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString16__12 = this.parser.parse(options, args);
            }
            o_testAmbiguousPartialLongOption1_literalMutationString16__4.addRequiredOption(__DSPOT_opt_1399, __DSPOT_longOpt_1400, __DSPOT_hasArg_1401, __DSPOT_description_1402);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString16_mg2010 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The option \'(P|FB;^9|HPsQwsV7EE+\' contains an illegal character : \'(\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAmbiguousPartialLongOption1_literalMutationString19_mg770_failAssert0() throws Exception {
        try {
            String __DSPOT_description_382 = "T}!G30F*uc([}!2XbQs ";
            String __DSPOT_opt_381 = "kqC{WfY|n}KRY;#EivvS";
            final String[] args = new String[]{ "Gdhsc" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString19__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString19__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString19__12 = this.parser.parse(options, args);
            }
            o_testAmbiguousPartialLongOption1_literalMutationString19__7.addOption(__DSPOT_opt_381, __DSPOT_description_382);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString19_mg770 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The option \'kqC{WfY|n}KRY;#EivvS\' contains an illegal character : \'{\'", expected.getMessage());
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

