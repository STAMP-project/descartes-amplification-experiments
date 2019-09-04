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
    public void testAmbiguousPartialLongOption1_literalMutationString15_mg1952_failAssert0() throws Exception {
        try {
            String __DSPOT_description_1308 = "s%<lL2 qFGM(`F>11g@_";
            String __DSPOT_opt_1307 = "J74Mj>t1-EZ;[WIgM>D#";
            final String[] args = new String[]{ "" };
            final Options options = new Options();
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__4 = options.addOption(OptionBuilder.withLongOpt("version").create());
            Options o_testAmbiguousPartialLongOption1_literalMutationString15__7 = options.addOption(OptionBuilder.withLongOpt("verbose").create());
            boolean caught = false;
            {
                CommandLine o_testAmbiguousPartialLongOption1_literalMutationString15__12 = this.parser.parse(options, args);
            }
            options.addOption(__DSPOT_opt_1307, __DSPOT_description_1308);
            org.junit.Assert.fail("testAmbiguousPartialLongOption1_literalMutationString15_mg1952 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("The option \'J74Mj>t1-EZ;[WIgM>D#\' contains an illegal character : \'>\'", expected.getMessage());
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

