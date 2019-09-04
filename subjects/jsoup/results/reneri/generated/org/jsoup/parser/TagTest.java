package org.jsoup.parser;


/**
 * Tag tests.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class TagTest {
    @org.junit.Rule
    public org.jsoup.MultiLocaleRule rule = new org.jsoup.MultiLocaleRule();

    @org.junit.Test
    public void isCaseSensitive() {
        org.jsoup.parser.Tag p1 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|isCaseSensitive()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("P"));
        org.jsoup.parser.Tag p2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|isCaseSensitive()|1", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("p"));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|isCaseSensitive()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|isCaseSensitive()|2", org.jsoup.parser.Tag.class, p1).equals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|isCaseSensitive()|3", org.jsoup.parser.Tag.class, p2))));
    }

    @org.junit.Test
    @org.jsoup.MultiLocaleRule.MultiLocaleTest
    public void canBeInsensitive() {
        org.jsoup.parser.Tag script1 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|canBeInsensitive()|1", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("script", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.TagTest|canBeInsensitive()|0", org.jsoup.parser.ParseSettings.class, org.jsoup.parser.ParseSettings.htmlDefault)));
        org.jsoup.parser.Tag script2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|canBeInsensitive()|3", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("SCRIPT", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.ParseSettings>observeState("org.jsoup.parser.TagTest|canBeInsensitive()|2", org.jsoup.parser.ParseSettings.class, org.jsoup.parser.ParseSettings.htmlDefault)));
        org.junit.Assert.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|canBeInsensitive()|4", org.jsoup.parser.Tag.class, script1), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|canBeInsensitive()|5", org.jsoup.parser.Tag.class, script2));
    }

    @org.junit.Test
    public void trims() {
        org.jsoup.parser.Tag p1 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|trims()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("p"));
        org.jsoup.parser.Tag p2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|trims()|1", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf(" p "));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|trims()|2", org.jsoup.parser.Tag.class, p1), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|trims()|3", org.jsoup.parser.Tag.class, p2));
    }

    @org.junit.Test
    public void equality() {
        org.jsoup.parser.Tag p1 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|equality()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("p"));
        org.jsoup.parser.Tag p2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|equality()|1", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("p"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|equality()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|equality()|2", org.jsoup.parser.Tag.class, p1).equals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|equality()|3", org.jsoup.parser.Tag.class, p2))));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|equality()|5", org.jsoup.parser.Tag.class, p1)) == (eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|equality()|6", org.jsoup.parser.Tag.class, p2))));
    }

    @org.junit.Test
    public void divSemantics() {
        org.jsoup.parser.Tag div = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|divSemantics()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("div"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|divSemantics()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|divSemantics()|1", org.jsoup.parser.Tag.class, div).isBlock()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|divSemantics()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|divSemantics()|3", org.jsoup.parser.Tag.class, div).formatAsBlock()));
    }

    @org.junit.Test
    public void pSemantics() {
        org.jsoup.parser.Tag p = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|pSemantics()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("p"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|pSemantics()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|pSemantics()|1", org.jsoup.parser.Tag.class, p).isBlock()));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|pSemantics()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|pSemantics()|3", org.jsoup.parser.Tag.class, p).formatAsBlock()));
    }

    @org.junit.Test
    public void imgSemantics() {
        org.jsoup.parser.Tag img = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|imgSemantics()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("img"));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|imgSemantics()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|imgSemantics()|1", org.jsoup.parser.Tag.class, img).isInline()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|imgSemantics()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|imgSemantics()|3", org.jsoup.parser.Tag.class, img).isSelfClosing()));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|imgSemantics()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|imgSemantics()|5", org.jsoup.parser.Tag.class, img).isBlock()));
    }

    @org.junit.Test
    public void defaultSemantics() {
        org.jsoup.parser.Tag foo = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|defaultSemantics()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("FOO"));// not defined

        org.jsoup.parser.Tag foo2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|defaultSemantics()|1", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf("FOO"));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|defaultSemantics()|2", org.jsoup.parser.Tag.class, foo), eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|defaultSemantics()|3", org.jsoup.parser.Tag.class, foo2));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|defaultSemantics()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|defaultSemantics()|4", org.jsoup.parser.Tag.class, foo).isInline()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TagTest|defaultSemantics()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|defaultSemantics()|6", org.jsoup.parser.Tag.class, foo).formatAsBlock()));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void valueOfChecksNotNull() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|valueOfChecksNotNull()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf(null));
        } catch (java.lang.IllegalArgumentException a1552755453165) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.jsoup.parser.TagTest|valueOfChecksNotNull()|!", a1552755453165);
            throw a1552755453165;
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void valueOfChecksNotEmpty() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.Tag>observeState("org.jsoup.parser.TagTest|valueOfChecksNotEmpty()|0", org.jsoup.parser.Tag.class, org.jsoup.parser.Tag.valueOf(" "));
        } catch (java.lang.IllegalArgumentException a1552755453165) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.jsoup.parser.TagTest|valueOfChecksNotEmpty()|!", a1552755453165);
            throw a1552755453165;
        }
    }
}

