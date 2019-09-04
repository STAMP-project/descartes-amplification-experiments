package joptsimple.util;


import joptsimple.ValueConversionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class EnumConverterTest {
    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    private EnumConverter<EnumConverterTest.TestEnum> converter;

    @Before
    public void setUp() {
        converter = new EnumConverterTest.TestEnumConverter();
    }

    @Test(timeout = 10000)
    public void rejectsNonEnumeratedValues_remove3_failAssert0() throws Exception {
        try {
            converter.convert("Z");
            org.junit.Assert.fail("rejectsNonEnumeratedValues_remove3 should have thrown ValueConversionException");
        } catch (ValueConversionException expected) {
            Assert.assertEquals("Value [Z] is not one of [[A,B,C,D]]", expected.getMessage());
        }
    }

    private static class TestEnumConverter extends EnumConverter<EnumConverterTest.TestEnum> {
        TestEnumConverter() {
            super(EnumConverterTest.TestEnum.class);
        }
    }

    private static enum TestEnum {

        A,
        B,
        C,
        D;}
}

