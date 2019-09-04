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
    public void testAmbiguousPartialLongOption1_literalMutationString15_mg1919_failAssert0() throws Exception {
        try {
            String __DSPOT_description_1322 = "iYeyQf] zgFt67%U@u5&";
            boolean __DSPOT_hasArg_1321 = true;
            String __DSPOT_longOpt_1320 = "kk^[rd7Yp]`FR3gIv=]j";
            String __DSPOT_opt_1319 = "rf]gqVA(=^=1WHsd&&^c";
            final String[] args = new String[]{ "" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString15__12 = this.parser.parse(options, args);
            }
            o_testAmbiguousPartialLongOption1_literalMutationString15__7.addRequiredOption(__DSPOT_opt_1319, __DSPOT_longOpt_1320, __DSPOT_hasArg_1321, __DSPOT_description_1322);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString15_mg1919 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The option \'rf]gqVA(=^=1WHsd&&^c\' contains an illegal character : \']\'", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAmbiguousPartialLongOption1_literalMutationString15_mg1902_failAssert0() throws Exception {
        try {
            String __DSPOT_description_1296 = "x:1(>_qm[,bHduuI&i@,";
            String __DSPOT_opt_1295 = "lZ2z9UC0C<a}l%e|TpG]";
            final String[] args = new String[]{ "" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString15__12 = this.parser.parse(options, args);
            }
            o_testAmbiguousPartialLongOption1_literalMutationString15__7.addOption(__DSPOT_opt_1295, __DSPOT_description_1296);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString15_mg1902 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The option \'lZ2z9UC0C<a}l%e|TpG]\' contains an illegal character : \'<\'", expected.getMessage());
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

