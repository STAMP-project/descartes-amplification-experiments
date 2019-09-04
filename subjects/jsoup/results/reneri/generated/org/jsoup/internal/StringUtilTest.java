package org.jsoup.internal;


public class StringUtilTest {
    @org.junit.Test
    public void join() {
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|join()|1", org.jsoup.internal.StringUtil.join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.jsoup.internal.StringUtilTest|join()|0", java.util.List.class, java.util.Arrays.asList("")), " ")));
        org.junit.Assert.assertEquals("one", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|join()|3", org.jsoup.internal.StringUtil.join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.jsoup.internal.StringUtilTest|join()|2", java.util.List.class, java.util.Arrays.asList("one")), " ")));
        org.junit.Assert.assertEquals("one two three", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|join()|5", org.jsoup.internal.StringUtil.join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.jsoup.internal.StringUtilTest|join()|4", java.util.List.class, java.util.Arrays.asList("one", "two", "three")), " ")));
    }

    @org.junit.Test
    public void padding() {
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|padding()|0", org.jsoup.internal.StringUtil.padding(0)));
        org.junit.Assert.assertEquals(" ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|padding()|1", org.jsoup.internal.StringUtil.padding(1)));
        org.junit.Assert.assertEquals("  ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|padding()|2", org.jsoup.internal.StringUtil.padding(2)));
        org.junit.Assert.assertEquals("               ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|padding()|3", org.jsoup.internal.StringUtil.padding(15)));
        org.junit.Assert.assertEquals("                                             ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|padding()|4", org.jsoup.internal.StringUtil.padding(45)));
    }

    @org.junit.Test
    public void paddingInACan() {
        java.lang.String[] padding = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.internal.StringUtilTest|paddingInACan()|0", java.lang.String[].class, org.jsoup.internal.StringUtil.padding);
        org.junit.Assert.assertEquals(21, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|paddingInACan()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.internal.StringUtilTest|paddingInACan()|1", java.lang.String[].class, padding).length));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|paddingInACan()|3", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|paddingInACan()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.internal.StringUtilTest|paddingInACan()|4", java.lang.String[].class, padding).length)); i++) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|paddingInACan()|6", i), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|paddingInACan()|10", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|paddingInACan()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.jsoup.internal.StringUtilTest|paddingInACan()|7", java.lang.String[].class, padding)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|paddingInACan()|8", i)]).length()));
        }
    }

    @org.junit.Test
    public void isBlank() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isBlank()|0", org.jsoup.internal.StringUtil.isBlank(null)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isBlank()|1", org.jsoup.internal.StringUtil.isBlank("")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isBlank()|2", org.jsoup.internal.StringUtil.isBlank("      ")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isBlank()|3", org.jsoup.internal.StringUtil.isBlank("   \r\n  ")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isBlank()|4", org.jsoup.internal.StringUtil.isBlank("hello")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isBlank()|5", org.jsoup.internal.StringUtil.isBlank("   hello   ")));
    }

    @org.junit.Test
    public void isNumeric() {
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isNumeric()|0", org.jsoup.internal.StringUtil.isNumeric(null)));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isNumeric()|1", org.jsoup.internal.StringUtil.isNumeric(" ")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isNumeric()|2", org.jsoup.internal.StringUtil.isNumeric("123 546")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isNumeric()|3", org.jsoup.internal.StringUtil.isNumeric("hello")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isNumeric()|4", org.jsoup.internal.StringUtil.isNumeric("123.334")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isNumeric()|5", org.jsoup.internal.StringUtil.isNumeric("1")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isNumeric()|6", org.jsoup.internal.StringUtil.isNumeric("1234")));
    }

    @org.junit.Test
    public void isWhitespace() {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isWhitespace()|0", org.jsoup.internal.StringUtil.isWhitespace('\t')));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isWhitespace()|1", org.jsoup.internal.StringUtil.isWhitespace('\n')));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isWhitespace()|2", org.jsoup.internal.StringUtil.isWhitespace('\r')));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isWhitespace()|3", org.jsoup.internal.StringUtil.isWhitespace('\f')));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isWhitespace()|4", org.jsoup.internal.StringUtil.isWhitespace(' ')));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isWhitespace()|5", org.jsoup.internal.StringUtil.isWhitespace('\u00a0')));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isWhitespace()|6", org.jsoup.internal.StringUtil.isWhitespace('\u2000')));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|isWhitespace()|7", org.jsoup.internal.StringUtil.isWhitespace('\u3000')));
    }

    @org.junit.Test
    public void normaliseWhiteSpace() {
        org.junit.Assert.assertEquals(" ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpace()|0", org.jsoup.internal.StringUtil.normaliseWhitespace("    \r \n \r\n")));
        org.junit.Assert.assertEquals(" hello there ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpace()|1", org.jsoup.internal.StringUtil.normaliseWhitespace("   hello   \r \n  there    \n")));
        org.junit.Assert.assertEquals("hello", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpace()|2", org.jsoup.internal.StringUtil.normaliseWhitespace("hello")));
        org.junit.Assert.assertEquals("hello there", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpace()|3", org.jsoup.internal.StringUtil.normaliseWhitespace("hello\nthere")));
    }

    @org.junit.Test
    public void normaliseWhiteSpaceHandlesHighSurrogates() {
        java.lang.String test71540chars = "\ud869\udeb2\u304b\u309a  1";
        java.lang.String test71540charsExpectedSingleWhitespace = "\ud869\udeb2\u304b\u309a 1";
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpaceHandlesHighSurrogates()|0", test71540charsExpectedSingleWhitespace), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpaceHandlesHighSurrogates()|2", org.jsoup.internal.StringUtil.normaliseWhitespace(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpaceHandlesHighSurrogates()|1", test71540chars))));
        java.lang.String extractedText = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpaceHandlesHighSurrogates()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.internal.StringUtilTest|normaliseWhiteSpaceHandlesHighSurrogates()|4", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpaceHandlesHighSurrogates()|3", test71540chars))).text());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpaceHandlesHighSurrogates()|6", test71540charsExpectedSingleWhitespace), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|normaliseWhiteSpaceHandlesHighSurrogates()|7", extractedText));
    }

    @org.junit.Test
    public void resolvesRelativeUrls() {
        org.junit.Assert.assertEquals("http://example.com/one/two?three", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|0", org.jsoup.internal.StringUtil.resolve("http://example.com", "./one/two?three")));
        org.junit.Assert.assertEquals("http://example.com/one/two?three", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|1", org.jsoup.internal.StringUtil.resolve("http://example.com?one", "./one/two?three")));
        org.junit.Assert.assertEquals("http://example.com/one/two?three#four", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|2", org.jsoup.internal.StringUtil.resolve("http://example.com", "./one/two?three#four")));
        org.junit.Assert.assertEquals("https://example.com/one", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|3", org.jsoup.internal.StringUtil.resolve("http://example.com/", "https://example.com/one")));
        org.junit.Assert.assertEquals("http://example.com/one/two.html", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|4", org.jsoup.internal.StringUtil.resolve("http://example.com/two/", "../one/two.html")));
        org.junit.Assert.assertEquals("https://example2.com/one", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|5", org.jsoup.internal.StringUtil.resolve("https://example.com/", "//example2.com/one")));
        org.junit.Assert.assertEquals("https://example.com:8080/one", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|6", org.jsoup.internal.StringUtil.resolve("https://example.com:8080", "./one")));
        org.junit.Assert.assertEquals("https://example2.com/one", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|7", org.jsoup.internal.StringUtil.resolve("http://example.com/", "https://example2.com/one")));
        org.junit.Assert.assertEquals("https://example.com/one", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|8", org.jsoup.internal.StringUtil.resolve("wrong", "https://example.com/one")));
        org.junit.Assert.assertEquals("https://example.com/one", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|9", org.jsoup.internal.StringUtil.resolve("https://example.com/one", "")));
        org.junit.Assert.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|10", org.jsoup.internal.StringUtil.resolve("wrong", "also wrong")));
        org.junit.Assert.assertEquals("ftp://example.com/one", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|11", org.jsoup.internal.StringUtil.resolve("ftp://example.com/two/", "../one")));
        org.junit.Assert.assertEquals("ftp://example.com/one/two.c", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|12", org.jsoup.internal.StringUtil.resolve("ftp://example.com/one/", "./two.c")));
        org.junit.Assert.assertEquals("ftp://example.com/one/two.c", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.internal.StringUtilTest|resolvesRelativeUrls()|13", org.jsoup.internal.StringUtil.resolve("ftp://example.com/one/", "two.c")));
    }
}

