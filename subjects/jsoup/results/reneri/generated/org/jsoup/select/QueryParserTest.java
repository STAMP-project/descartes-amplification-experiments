package org.jsoup.select;


/**
 * Tests for the Selector Query Parser.
 *
 * @author Jonathan Hedley
 */
public class QueryParserTest {
    @org.junit.Test
    public void testOrGetsCorrectPrecedence() {
        // tests that a selector "a b, c d, e f" evals to (a AND b) OR (c AND d) OR (e AND f)"
        // top level or, three child ands
        org.jsoup.select.Evaluator eval = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|0", org.jsoup.select.Evaluator.class, org.jsoup.select.QueryParser.parse("a b, c d, e f"));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|1", org.jsoup.select.Evaluator.class, eval)) instanceof org.jsoup.select.CombiningEvaluator.Or));
        org.jsoup.select.CombiningEvaluator.Or or = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.Or>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|2", org.jsoup.select.CombiningEvaluator.Or.class, ((org.jsoup.select.CombiningEvaluator.Or) (eval)));
        org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|4", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.Or>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|3", org.jsoup.select.CombiningEvaluator.Or.class, or).evaluators).size()));
        for (org.jsoup.select.Evaluator innerEval : eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|7", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.Or>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|6", org.jsoup.select.CombiningEvaluator.Or.class, or).evaluators)) {
            org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|8", org.jsoup.select.Evaluator.class, innerEval)) instanceof org.jsoup.select.CombiningEvaluator.And));
            org.jsoup.select.CombiningEvaluator.And and = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|9", org.jsoup.select.CombiningEvaluator.And.class, ((org.jsoup.select.CombiningEvaluator.And) (innerEval)));
            org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|11", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|10", org.jsoup.select.CombiningEvaluator.And.class, and).evaluators).size()));
            org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|15", org.jsoup.select.Evaluator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|14", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|13", org.jsoup.select.CombiningEvaluator.And.class, and).evaluators).get(0))) instanceof org.jsoup.select.Evaluator.Tag));
            org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|18", org.jsoup.select.Evaluator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|17", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testOrGetsCorrectPrecedence()|16", org.jsoup.select.CombiningEvaluator.And.class, and).evaluators).get(1))) instanceof org.jsoup.select.StructuralEvaluator.Parent));
        }
    }

    @org.junit.Test
    public void testParsesMultiCorrectly() {
        org.jsoup.select.Evaluator eval = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|0", org.jsoup.select.Evaluator.class, org.jsoup.select.QueryParser.parse(".foo > ol, ol > li + li"));
        org.junit.Assert.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|1", org.jsoup.select.Evaluator.class, eval)) instanceof org.jsoup.select.CombiningEvaluator.Or));
        org.jsoup.select.CombiningEvaluator.Or or = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.Or>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|2", org.jsoup.select.CombiningEvaluator.Or.class, ((org.jsoup.select.CombiningEvaluator.Or) (eval)));
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|4", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.Or>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|3", org.jsoup.select.CombiningEvaluator.Or.class, or).evaluators).size()));
        org.jsoup.select.CombiningEvaluator.And andLeft = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|8", org.jsoup.select.CombiningEvaluator.And.class, ((org.jsoup.select.CombiningEvaluator.And) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|7", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.Or>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|6", org.jsoup.select.CombiningEvaluator.Or.class, or).evaluators).get(0))));
        org.jsoup.select.CombiningEvaluator.And andRight = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|11", org.jsoup.select.CombiningEvaluator.And.class, ((org.jsoup.select.CombiningEvaluator.And) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|10", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.Or>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|9", org.jsoup.select.CombiningEvaluator.Or.class, or).evaluators).get(1))));
        org.junit.Assert.assertEquals("ol :ImmediateParent.foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|12", org.jsoup.select.CombiningEvaluator.And.class, andLeft).toString()));
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|15", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|14", org.jsoup.select.CombiningEvaluator.And.class, andLeft).evaluators).size()));
        org.junit.Assert.assertEquals("li :prevli :ImmediateParentol", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|17", org.jsoup.select.CombiningEvaluator.And.class, andRight).toString()));
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.jsoup.select.Evaluator>>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|20", java.util.ArrayList.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.CombiningEvaluator.And>observeState("org.jsoup.select.QueryParserTest|testParsesMultiCorrectly()|19", org.jsoup.select.CombiningEvaluator.And.class, andLeft).evaluators).size()));
    }

    @org.junit.Test(expected = org.jsoup.select.Selector.SelectorParseException.class)
    public void exceptionOnUncloseAttribute() {
        try {
            org.jsoup.select.Evaluator parse = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|exceptionOnUncloseAttribute()|0", org.jsoup.select.Evaluator.class, org.jsoup.select.QueryParser.parse("section > a[href=\"]"));
        } catch (org.jsoup.select.Selector.SelectorParseException a1552755453374) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.jsoup.select.QueryParserTest|exceptionOnUncloseAttribute()|!", a1552755453374);
            throw a1552755453374;
        }
    }

    @org.junit.Test(expected = org.jsoup.select.Selector.SelectorParseException.class)
    public void testParsesSingleQuoteInContains() {
        try {
            org.jsoup.select.Evaluator parse = eu.stamp_project.reneri.instrumentation.StateObserver.<org.jsoup.select.Evaluator>observeState("org.jsoup.select.QueryParserTest|testParsesSingleQuoteInContains()|0", org.jsoup.select.Evaluator.class, org.jsoup.select.QueryParser.parse("p:contains(One \" One)"));
        } catch (org.jsoup.select.Selector.SelectorParseException a1552755453381) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.jsoup.select.QueryParserTest|testParsesSingleQuoteInContains()|!", a1552755453381);
            throw a1552755453381;
        }
    }
}

