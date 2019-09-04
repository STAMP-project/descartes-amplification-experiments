package org.jsoup.parser;


/**
 * Token queue tests.
 */
public class TokenQueueTest {
    @org.junit.Test
    public void chompBalanced() {
        org.jsoup.parser.TokenQueue tq = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompBalanced()|0", org.jsoup.parser.TokenQueue.class, new org.jsoup.parser.TokenQueue(":contains(one (two) three) four"));
        java.lang.String pre = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalanced()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompBalanced()|1", org.jsoup.parser.TokenQueue.class, tq).consumeTo("("));
        java.lang.String guts = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalanced()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompBalanced()|3", org.jsoup.parser.TokenQueue.class, tq).chompBalanced('(', ')'));
        java.lang.String remainder = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalanced()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompBalanced()|5", org.jsoup.parser.TokenQueue.class, tq).remainder());
        org.junit.Assert.assertEquals(":contains", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalanced()|7", pre));
        org.junit.Assert.assertEquals("one (two) three", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalanced()|8", guts));
        org.junit.Assert.assertEquals(" four", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalanced()|9", remainder));
    }

    @org.junit.Test
    public void chompEscapedBalanced() {
        org.jsoup.parser.TokenQueue tq = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|0", org.jsoup.parser.TokenQueue.class, new org.jsoup.parser.TokenQueue(":contains(one (two) \\( \\) \\) three) four"));
        java.lang.String pre = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|1", org.jsoup.parser.TokenQueue.class, tq).consumeTo("("));
        java.lang.String guts = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|3", org.jsoup.parser.TokenQueue.class, tq).chompBalanced('(', ')'));
        java.lang.String remainder = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|5", org.jsoup.parser.TokenQueue.class, tq).remainder());
        org.junit.Assert.assertEquals(":contains", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|7", pre));
        org.junit.Assert.assertEquals("one (two) \\( \\) \\) three", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|8", guts));
        org.junit.Assert.assertEquals("one (two) ( ) ) three", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|10", org.jsoup.parser.TokenQueue.unescape(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|9", guts))));
        org.junit.Assert.assertEquals(" four", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompEscapedBalanced()|11", remainder));
    }

    @org.junit.Test
    public void chompBalancedMatchesAsMuchAsPossible() {
        org.jsoup.parser.TokenQueue tq = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompBalancedMatchesAsMuchAsPossible()|0", org.jsoup.parser.TokenQueue.class, new org.jsoup.parser.TokenQueue("unbalanced(something(or another)) else"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalancedMatchesAsMuchAsPossible()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompBalancedMatchesAsMuchAsPossible()|1", org.jsoup.parser.TokenQueue.class, tq).consumeTo("("));
        java.lang.String match = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalancedMatchesAsMuchAsPossible()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompBalancedMatchesAsMuchAsPossible()|3", org.jsoup.parser.TokenQueue.class, tq).chompBalanced('(', ')'));
        org.junit.Assert.assertEquals("something(or another)", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompBalancedMatchesAsMuchAsPossible()|5", match));
    }

    @org.junit.Test
    public void unescape() {
        org.junit.Assert.assertEquals("one ( ) \\", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|unescape()|0", org.jsoup.parser.TokenQueue.unescape("one \\( \\) \\\\")));
    }

    @org.junit.Test
    public void chompToIgnoreCase() {
        java.lang.String t = "<textarea>one < two </TEXTarea>";
        org.jsoup.parser.TokenQueue tq = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|1", org.jsoup.parser.TokenQueue.class, new org.jsoup.parser.TokenQueue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|0", t)));
        java.lang.String data = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|2", org.jsoup.parser.TokenQueue.class, tq).chompToIgnoreCase("</textarea"));
        org.junit.Assert.assertEquals("<textarea>one < two ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|4", data));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|5", org.jsoup.parser.TokenQueue.class, (tq = new org.jsoup.parser.TokenQueue("<textarea> one two < three </oops>")));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|7", (data = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|6", org.jsoup.parser.TokenQueue.class, tq).chompToIgnoreCase("</textarea")));
        org.junit.Assert.assertEquals("<textarea> one two < three </oops>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|chompToIgnoreCase()|8", data));
    }

    @org.junit.Test
    public void addFirst() {
        org.jsoup.parser.TokenQueue tq = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|addFirst()|0", org.jsoup.parser.TokenQueue.class, new org.jsoup.parser.TokenQueue("One Two"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|addFirst()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|addFirst()|1", org.jsoup.parser.TokenQueue.class, tq).consumeWord());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|addFirst()|3", org.jsoup.parser.TokenQueue.class, tq).addFirst("Three");
        org.junit.Assert.assertEquals("Three Two", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|addFirst()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|addFirst()|4", org.jsoup.parser.TokenQueue.class, tq).remainder()));
    }

    @org.junit.Test
    public void consumeToIgnoreSecondCallTest() {
        java.lang.String t = "<textarea>one < two </TEXTarea> third </TEXTarea>";
        org.jsoup.parser.TokenQueue tq = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|consumeToIgnoreSecondCallTest()|1", org.jsoup.parser.TokenQueue.class, new org.jsoup.parser.TokenQueue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|consumeToIgnoreSecondCallTest()|0", t)));
        java.lang.String data = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|consumeToIgnoreSecondCallTest()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|consumeToIgnoreSecondCallTest()|2", org.jsoup.parser.TokenQueue.class, tq).chompToIgnoreCase("</textarea>"));
        org.junit.Assert.assertEquals("<textarea>one < two ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|consumeToIgnoreSecondCallTest()|4", data));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|consumeToIgnoreSecondCallTest()|6", (data = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.parser.TokenQueue>observeState("org.jsoup.parser.TokenQueueTest|consumeToIgnoreSecondCallTest()|5", org.jsoup.parser.TokenQueue.class, tq).chompToIgnoreCase("</textarea>")));
        org.junit.Assert.assertEquals(" third ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|consumeToIgnoreSecondCallTest()|7", data));
    }

    @org.junit.Test
    public void testNestedQuotes() {
        org.jsoup.parser.TokenQueueTest.validateNestedQuotes("<html><body><a id=\"identifier\" onclick=\"func(\'arg\')\" /></body></html>", "a[onclick*=\"(\'arg\"]");
        org.jsoup.parser.TokenQueueTest.validateNestedQuotes("<html><body><a id=\"identifier\" onclick=func(\'arg\') /></body></html>", "a[onclick*=\"(\'arg\"]");
        org.jsoup.parser.TokenQueueTest.validateNestedQuotes("<html><body><a id=\"identifier\" onclick=\'func(\"arg\")\' /></body></html>", "a[onclick*=\'(\"arg\']");
        org.jsoup.parser.TokenQueueTest.validateNestedQuotes("<html><body><a id=\"identifier\" onclick=func(\"arg\") /></body></html>", "a[onclick*=\'(\"arg\']");
    }

    private static void validateNestedQuotes(java.lang.String html, java.lang.String selector) {
        org.junit.Assert.assertEquals("#identifier", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|validateNestedQuotes(java.lang.String,java.lang.String)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Element>observeState("org.jsoup.parser.TokenQueueTest|validateNestedQuotes(java.lang.String,java.lang.String)|4", org.jsoup.nodes.Element.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Elements>observeState("org.jsoup.parser.TokenQueueTest|validateNestedQuotes(java.lang.String,java.lang.String)|3", org.jsoup.select.Elements.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.nodes.Document>observeState("org.jsoup.parser.TokenQueueTest|validateNestedQuotes(java.lang.String,java.lang.String)|1", org.jsoup.nodes.Document.class, org.jsoup.Jsoup.parse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|validateNestedQuotes(java.lang.String,java.lang.String)|0", html))).select(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.parser.TokenQueueTest|validateNestedQuotes(java.lang.String,java.lang.String)|2", selector))).first()).cssSelector()));
    }
}

