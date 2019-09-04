package joptsimple.util;


import joptsimple.ValueConversionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class InetAddressConverterTest {
    private InetAddressConverter converter;

    @Before
    public void setUp() {
        converter = new InetAddressConverter();
    }

    @Test(timeout = 10000)
    public void unknownHost_failAssert0() throws Exception {
        try {
            converter.convert("!(@&#()!*@&#");
            org.junit.Assert.fail("unknownHost should have thrown ValueConversionException");
        } catch (ValueConversionException expected) {
            Assert.assertEquals("Cannot convert value [!(@&#()!*@&#] into an InetAddress", expected.getMessage());
        }
    }
}

