package org.apache.commons.codec.language.bm;


import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.StringEncoderAbstractTest;
import org.junit.Assert;
import org.junit.Test;


public class BeiderMorseEncoderTest extends StringEncoderAbstractTest<StringEncoder> {
    private static final char[] TEST_CHARS = new char[]{ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'o', 'u' };

    private void assertNotEmpty(final BeiderMorseEncoder bmpm, final String value) throws EncoderException {
        Assert.assertFalse(value, bmpm.encode(value).equals(""));
    }

    private BeiderMorseEncoder createGenericApproxEncoder() {
        final BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(NameType.GENERIC);
        encoder.setRuleType(RuleType.APPROX);
        return encoder;
    }

    @Override
    protected StringEncoder createStringEncoder() {
        return new BeiderMorseEncoder();
    }

    @Test(timeout = 10000)
    public void testAsciiEncodeNotEmpty2Letters_mg28() throws EncoderException {
        String __DSPOT_source_1 = "GdhscbCS@!x*zH_,y(q2";
        final BeiderMorseEncoder bmpm = createGenericApproxEncoder();
        Assert.assertTrue(((BeiderMorseEncoder) (bmpm)).isConcat());
        Assert.assertEquals("gen", ((NameType) (((BeiderMorseEncoder) (bmpm)).getNameType())).getName());
        Assert.assertEquals("approx", ((RuleType) (((BeiderMorseEncoder) (bmpm)).getRuleType())).getName());
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            for (char c2 = 'a'; c2 <= 'z'; c2++) {
                final String value = new String(new char[]{ c1, c2 });
                final String valueU = value.toUpperCase();
            }
        }
        String o_testAsciiEncodeNotEmpty2Letters_mg28__16 = bmpm.encode(__DSPOT_source_1);
        Assert.assertEquals("gdskfksgzik|gdskfkskzik|gdskfkzik|gdskpksgzik|gdskpkskzik|gdskpkzik|gdxskfksgzik|gdxskfkskzik|gdxskfkzik|gdxskpksgzik|gdxskpkskzik|gdxskpkzik", o_testAsciiEncodeNotEmpty2Letters_mg28__16);
        Assert.assertTrue(((BeiderMorseEncoder) (bmpm)).isConcat());
        Assert.assertEquals("gen", ((NameType) (((BeiderMorseEncoder) (bmpm)).getNameType())).getName());
        Assert.assertEquals("approx", ((RuleType) (((BeiderMorseEncoder) (bmpm)).getRuleType())).getName());
    }
}

