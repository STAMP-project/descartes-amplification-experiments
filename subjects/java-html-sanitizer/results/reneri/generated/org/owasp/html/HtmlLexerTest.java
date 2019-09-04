/**
 * Copyright (c) 2011, Mike Samuel
 */
/**
 * All rights reserved.
 */
/**
 *
 */
/**
 * Redistribution and use in source and binary forms, with or without
 */
/**
 * modification, are permitted provided that the following conditions
 */
/**
 * are met:
 */
/**
 *
 */
/**
 * Redistributions of source code must retain the above copyright
 */
/**
 * notice, this list of conditions and the following disclaimer.
 */
/**
 * Redistributions in binary form must reproduce the above copyright
 */
/**
 * notice, this list of conditions and the following disclaimer in the
 */
/**
 * documentation and/or other materials provided with the distribution.
 */
/**
 * Neither the name of the OWASP nor the names of its contributors may
 */
/**
 * be used to endorse or promote products derived from this software
 */
/**
 * without specific prior written permission.
 */
/**
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 */
/**
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 */
/**
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 */
/**
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 */
/**
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 */
/**
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 */
/**
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 */
/**
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 */
/**
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 */
/**
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 */
/**
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 */
/**
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.owasp.html;


@java.lang.SuppressWarnings("javadoc")
public class HtmlLexerTest extends junit.framework.TestCase {
    @org.junit.Test
    public final void testHtmlLexer() throws java.lang.Exception {
        // Do the lexing.
        java.lang.String input = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|testHtmlLexer()|2", com.google.common.io.Resources.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.owasp.html.HtmlLexerTest|testHtmlLexer()|0", java.net.URL.class, com.google.common.io.Resources.getResource(getClass(), "htmllexerinput1.html")), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.owasp.html.HtmlLexerTest|testHtmlLexer()|1", java.nio.charset.Charset.class, com.google.common.base.Charsets.UTF_8)));
        java.lang.StringBuilder actual = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlLexerTest|testHtmlLexer()|3", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.HtmlLexerTest.lex(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|testHtmlLexer()|4", input), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlLexerTest|testHtmlLexer()|5", java.lang.StringBuilder.class, actual));
        // Get the golden.
        java.lang.String golden = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|testHtmlLexer()|8", com.google.common.io.Resources.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<java.net.URL>observeState("org.owasp.html.HtmlLexerTest|testHtmlLexer()|6", java.net.URL.class, com.google.common.io.Resources.getResource(getClass(), "htmllexergolden1.txt")), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.owasp.html.HtmlLexerTest|testHtmlLexer()|7", java.nio.charset.Charset.class, com.google.common.base.Charsets.UTF_8)));
        // Compare.
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|testHtmlLexer()|9", golden), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|testHtmlLexer()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlLexerTest|testHtmlLexer()|10", java.lang.StringBuilder.class, actual).toString()));
    }

    @org.junit.Test
    public static final void testEofInTag() {
        org.owasp.html.HtmlLexerTest.assertTokens("<div", "TAGBEGIN: <div");
        org.owasp.html.HtmlLexerTest.assertTokens("</div", "TAGBEGIN: </div");
        org.owasp.html.HtmlLexerTest.assertTokens("<div\n", "TAGBEGIN: <div");
        org.owasp.html.HtmlLexerTest.assertTokens("</div\n", "TAGBEGIN: </div");
        org.owasp.html.HtmlLexerTest.assertTokens("<div", "TAGBEGIN: <div");
        org.owasp.html.HtmlLexerTest.assertTokens("</div", "TAGBEGIN: </div");
        org.owasp.html.HtmlLexerTest.assertTokens("<div\n", "TAGBEGIN: <div");
        org.owasp.html.HtmlLexerTest.assertTokens("</div\n", "TAGBEGIN: </div");
    }

    @org.junit.Test
    public static final void testPartialTagInCData() {
        org.owasp.html.HtmlLexerTest.assertTokens("<script>w('</b')</script>", "TAGBEGIN: <script", "TAGEND: >", "UNESCAPED: w('</b')", "TAGBEGIN: </script", "TAGEND: >");
    }

    @org.junit.Test
    public static final void testUrlEndingInSlashOutsideQuotes() {
        org.owasp.html.HtmlLexerTest.assertTokens("<a href=http://foo.com/>Clicky</a>", "TAGBEGIN: <a", "ATTRNAME: href", "ATTRVALUE: http://foo.com/", "TAGEND: >", "TEXT: Clicky", "TAGBEGIN: </a", "TAGEND: >");
    }

    @org.junit.Test
    public static final void testShortTags() {
        // See comments in html-sanitizer-test.js as to why we don't bother with
        // short tags.  In short, they are not in HTML5 and not implemented properly
        // in existing HTML4 clients.
        org.owasp.html.HtmlLexerTest.assertTokens("<p<a href=\"/\">first part of the text</> second part", "TAGBEGIN: <p", "ATTRNAME: <a", "ATTRNAME: href", "ATTRVALUE: \"/\"", "TAGEND: >", "TEXT: first part of the text</> second part");
        org.owasp.html.HtmlLexerTest.assertTokens("<p/b/", "TAGBEGIN: <p", "ATTRNAME: /", "ATTRNAME: b/");
        org.owasp.html.HtmlLexerTest.assertTokens("<p<b>", "TAGBEGIN: <p", "ATTRNAME: <b", "TAGEND: >");
    }

    private static void lex(java.lang.String input, java.lang.Appendable out) throws java.lang.Exception {
        org.owasp.html.HtmlLexer lexer = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlLexer>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|1", org.owasp.html.HtmlLexer.class, new org.owasp.html.HtmlLexer(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|0", input)));
        int maxTypeLength = 0;
        for (org.owasp.html.HtmlTokenType t : eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlTokenType[]>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|2", org.owasp.html.HtmlTokenType[].class, org.owasp.html.HtmlTokenType.values())) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|7", (maxTypeLength = java.lang.Math.max(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|3", maxTypeLength), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|6", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlTokenType>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|4", org.owasp.html.HtmlTokenType.class, t).name()).length()))));
        }
        while (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlLexer>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|8", org.owasp.html.HtmlLexer.class, lexer).hasNext())) {
            org.owasp.html.HtmlToken t = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|11", org.owasp.html.HtmlToken.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlLexer>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|10", org.owasp.html.HtmlLexer.class, lexer).next());
            // Do C style escaping of the token text so that each token in the golden
            // file can fit on one line.
            java.lang.String escaped = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|19", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|18", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|17", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|12", input).substring(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|13", org.owasp.html.HtmlToken.class, t).start), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|15", org.owasp.html.HtmlToken.class, t).end))).replace("\\", "\\\\")).replace("\n", "\\n"));
            java.lang.String type = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlTokenType>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|21", org.owasp.html.HtmlTokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|20", org.owasp.html.HtmlToken.class, t).type).toString());
            int nPadding = (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|23", maxTypeLength)) - (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|25", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|24", type).length()));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|28", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|26", java.lang.Appendable.class, out).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|27", type)));
            while ((--nPadding) >= 0) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|30", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|29", java.lang.Appendable.class, out).append(' '));
            } 
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|45", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|44", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|40", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|39", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|35", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|34", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|32", java.lang.Appendable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|31", java.lang.Appendable.class, out).append(" [")).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|33", escaped))).append("]  :  ")).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|38", java.lang.String.valueOf(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|37", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|36", org.owasp.html.HtmlToken.class, t).start))))).append('-')).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|43", java.lang.String.valueOf(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|42", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|lex(java.lang.String,java.lang.Appendable)|41", org.owasp.html.HtmlToken.class, t).end))))).append("\n"));
        } 
    }

    private static void assertTokens(java.lang.String markup, java.lang.String... golden) {
        org.owasp.html.HtmlLexer lexer = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlLexer>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|1", org.owasp.html.HtmlLexer.class, new org.owasp.html.HtmlLexer(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|0", markup)));
        java.util.List<java.lang.String> actual = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<java.lang.String>>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|2", java.util.ArrayList.class, com.google.common.collect.Lists.newArrayList());
        while (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlLexer>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|3", org.owasp.html.HtmlLexer.class, lexer).hasNext())) {
            org.owasp.html.HtmlToken t = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|6", org.owasp.html.HtmlToken.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlLexer>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|5", org.owasp.html.HtmlLexer.class, lexer).next());
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|16", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|7", java.util.List.class, actual).add((((eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlTokenType>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|9", org.owasp.html.HtmlTokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|8", org.owasp.html.HtmlToken.class, t).type)) + ": ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|15", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|10", markup).substring(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|11", org.owasp.html.HtmlToken.class, t).start), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlToken>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|13", org.owasp.html.HtmlToken.class, t).end)))))));
        } 
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|18", java.util.List.class, java.util.Arrays.asList(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|17", java.lang.String[].class, golden))), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlLexerTest|assertTokens(java.lang.String,java.lang.String[])|19", java.util.List.class, actual));
    }
}

