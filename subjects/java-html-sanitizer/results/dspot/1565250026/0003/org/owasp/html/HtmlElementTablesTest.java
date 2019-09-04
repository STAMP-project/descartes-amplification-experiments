package org.owasp.html;


import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


@SuppressWarnings("javadoc")
public final class HtmlElementTablesTest extends TestCase {
    HtmlElementTables t;

    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
        t = HtmlElementTables.get();
    }

    @Test
    public void testElementNames_add1() throws Exception {
        int o_testElementNames_add1__1 = t.indexForName("a");
        TestCase.assertEquals(0, ((int) (o_testElementNames_add1__1)));
        boolean boolean_3 = (t.indexForName("a")) != (t.indexForName("b"));
        boolean boolean_4 = (t.indexForName("p")) != (t.indexForName("q"));
        boolean boolean_5 = (t.indexForName("customclass")) >= 0;
        for (int ei = 0, nei = this.t.nElementTypes(); ei < nei; ++ei) {
            String s = this.t.canonNameForIndex(ei);
            this.t.indexForName(s);
            ++ei;
        }
        TestCase.assertEquals(0, ((int) (o_testElementNames_add1__1)));
    }

    @Test
    public void testElementNames_add4() throws Exception {
        boolean boolean_12 = (t.indexForName("a")) != (t.indexForName("b"));
        int o_testElementNames_add4__4 = t.indexForName("q");
        TestCase.assertEquals(103, ((int) (o_testElementNames_add4__4)));
        boolean boolean_13 = (t.indexForName("p")) != (t.indexForName("q"));
        boolean boolean_14 = (t.indexForName("customclass")) >= 0;
        for (int ei = 0, nei = this.t.nElementTypes(); ei < nei; ++ei) {
            String s = this.t.canonNameForIndex(ei);
            this.t.indexForName(s);
            ++ei;
        }
        TestCase.assertEquals(103, ((int) (o_testElementNames_add4__4)));
    }

    private int ix(String nm) {
        return t.indexForName(nm);
    }
}

