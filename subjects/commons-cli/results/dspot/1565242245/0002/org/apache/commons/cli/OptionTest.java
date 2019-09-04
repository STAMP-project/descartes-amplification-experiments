package org.apache.commons.cli;


import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;


public class OptionTest {
    private static class TestOption extends Option {
        private static final long serialVersionUID = 1L;

        public TestOption(final String opt, final boolean hasArg, final String description) throws IllegalArgumentException {
            super(opt, hasArg, description);
        }

        @Override
        public boolean addValue(final String value) {
            addValueForProcessing(value);
            return true;
        }
    }

    private static class DefaultOption extends Option {
        private static final long serialVersionUID = 1L;

        private final String defaultValue;

        public DefaultOption(final String opt, final String description, final String defaultValue) throws IllegalArgumentException {
            super(opt, true, description);
            this.defaultValue = defaultValue;
        }

        @Override
        public String getValue() {
            return (super.getValue()) != null ? super.getValue() : defaultValue;
        }
    }

    @Test(timeout = 10000)
    public void testGetValue() throws Exception {
        final Option option = new Option("f", null);
        Assert.assertNull(((Option) (option)).getDescription());
        Assert.assertTrue(((Collection) (((Option) (option)).getValuesList())).isEmpty());
        Assert.assertEquals(-1, ((int) (((Option) (option)).getArgs())));
        Assert.assertNull(((Option) (option)).getValues());
        Assert.assertFalse(((Option) (option)).hasArgName());
        Assert.assertFalse(((Option) (option)).hasArgs());
        Assert.assertFalse(((Option) (option)).hasArg());
        Assert.assertEquals("f", ((Option) (option)).getOpt());
        Assert.assertNull(((Option) (option)).getLongOpt());
        Assert.assertNull(((Option) (option)).getArgName());
        Assert.assertFalse(((Option) (option)).isRequired());
        Assert.assertFalse(((Option) (option)).hasOptionalArg());
        Assert.assertEquals('\u0000', ((char) (((Option) (option)).getValueSeparator())));
        Assert.assertFalse(((Option) (option)).hasLongOpt());
        Assert.assertFalse(((Option) (option)).hasValueSeparator());
        Assert.assertEquals("[ option: f  :: null :: class java.lang.String ]", ((Option) (option)).toString());
        Assert.assertEquals(3162, ((int) (((Option) (option)).hashCode())));
        Assert.assertNull(((Option) (option)).getValue());
        Assert.assertEquals(102, ((int) (((Option) (option)).getId())));
        option.setArgs(Option.UNLIMITED_VALUES);
        String o_testGetValue__4 = option.getValue("default");
        Assert.assertEquals("default", o_testGetValue__4);
        String o_testGetValue__5 = option.getValue(0);
        Assert.assertNull(o_testGetValue__5);
        option.addValueForProcessing("foo");
        option.getValue();
        String o_testGetValue__8 = option.getValue(0);
        Assert.assertEquals("foo", o_testGetValue__8);
        String o_testGetValue__9 = option.getValue("default");
        Assert.assertEquals("foo", o_testGetValue__9);
        Assert.assertNull(((Option) (option)).getDescription());
        Assert.assertTrue(((org.apache.commons.cli.Option)option).getValuesList().contains("foo"));
        Assert.assertEquals(-2, ((int) (((Option) (option)).getArgs())));
        Assert.assertFalse(((Option) (option)).hasArgName());
        Assert.assertTrue(((Option) (option)).hasArgs());
        Assert.assertTrue(((Option) (option)).hasArg());
        Assert.assertEquals("f", ((Option) (option)).getOpt());
        Assert.assertNull(((Option) (option)).getLongOpt());
        Assert.assertNull(((Option) (option)).getArgName());
        Assert.assertFalse(((Option) (option)).isRequired());
        Assert.assertFalse(((Option) (option)).hasOptionalArg());
        Assert.assertEquals('\u0000', ((char) (((Option) (option)).getValueSeparator())));
        Assert.assertFalse(((Option) (option)).hasLongOpt());
        Assert.assertFalse(((Option) (option)).hasValueSeparator());
        Assert.assertEquals("[ option: f [ARG...] :: null :: class java.lang.String ]", ((Option) (option)).toString());
        Assert.assertEquals(3162, ((int) (((Option) (option)).hashCode())));
        Assert.assertEquals("foo", ((Option) (option)).getValue());
        Assert.assertEquals(102, ((int) (((Option) (option)).getId())));
        Assert.assertEquals("default", o_testGetValue__4);
        Assert.assertNull(o_testGetValue__5);
        Assert.assertEquals("foo", o_testGetValue__8);
    }

    private static void checkOption(final Option option, final String opt, final String description, final String longOpt, final int numArgs, final String argName, final boolean required, final boolean optionalArg, final char valueSeparator, final Class<?> cls) {
        Assert.assertEquals(opt, option.getOpt());
        Assert.assertEquals(description, option.getDescription());
        Assert.assertEquals(longOpt, option.getLongOpt());
        Assert.assertEquals(numArgs, option.getArgs());
        Assert.assertEquals(argName, option.getArgName());
        Assert.assertEquals(required, option.isRequired());
        Assert.assertEquals(optionalArg, option.hasOptionalArg());
        Assert.assertEquals(valueSeparator, option.getValueSeparator());
        Assert.assertEquals(cls, option.getType());
    }
}

