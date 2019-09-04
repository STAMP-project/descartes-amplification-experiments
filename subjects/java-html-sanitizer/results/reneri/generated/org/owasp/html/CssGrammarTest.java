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
public class CssGrammarTest extends junit.framework.TestCase {
    @org.junit.Test
    public static final void testLex() {
        org.owasp.html.CssTokens tokens = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssGrammarTest|testLex()|2", org.owasp.html.CssTokens.class, org.owasp.html.CssTokens.lex(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.CssGrammarTest|testLex()|0", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join("/* A comment */", "words with-dashes #hashes .dots. -and-leading-dashes", "quantities: 3px 4ex -.5pt 12.5%", "punctuation: { ( } / , ;", "[ url( http://example.com )", "rgb(255, 127, 127)", "\'strings\' \"oh \\\"my\" \'foo bar\'", "color:blue!important", ""))));
        java.util.List<java.lang.String> actualTokens = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<java.lang.String>>observeState("org.owasp.html.CssGrammarTest|testLex()|3", java.util.ArrayList.class, com.google.common.collect.Lists.newArrayList());
        for (org.owasp.html.CssTokens.TokenIterator it = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssGrammarTest|testLex()|5", org.owasp.html.CssTokens.TokenIterator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssGrammarTest|testLex()|4", org.owasp.html.CssTokens.class, tokens).iterator()); eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssGrammarTest|testLex()|6", org.owasp.html.CssTokens.TokenIterator.class, it).hasNext());) {
            org.owasp.html.CssTokens.TokenType type = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssGrammarTest|testLex()|9", org.owasp.html.CssTokens.TokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssGrammarTest|testLex()|8", org.owasp.html.CssTokens.TokenIterator.class, it).type());
            java.lang.String token = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssGrammarTest|testLex()|10", org.owasp.html.CssTokens.TokenIterator.class, it).next());
            if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|13", " ".equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|12", token))))) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.CssGrammarTest|testLex()|14", java.util.List.class, actualTokens).add((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|15", token)) + ":") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssGrammarTest|testLex()|16", org.owasp.html.CssTokens.TokenType.class, type).name())))));
            }
        }
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|20", // "/* A comment */",  // Comments are elided.
        // Explicit
        // Implicit closing bracket to keep balance.
        // Manufactured due to unmatched '['.
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.CssGrammarTest|testLex()|19", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join("words:IDENT", "with-dashes:IDENT", "#hashes:HASH_ID", ".dots:DOT_IDENT", ".:DELIM", "-and-leading-dashes:IDENT", "quantities:IDENT", "::COLON", "3px:DIMENSION", "4ex:DIMENSION", "-0.5pt:DIMENSION", "12.5%:PERCENTAGE", "punctuation:IDENT", "::COLON", "{:LEFT_CURLY", "(:LEFT_PAREN", "):RIGHT_PAREN", "}:RIGHT_CURLY", "/:DELIM", ",:COMMA", ";:SEMICOLON", "[:LEFT_SQUARE", "url('http://example.com'):URL", "rgb(:FUNCTION", "255:NUMBER", ",:COMMA", "127:NUMBER", ",:COMMA", "127:NUMBER", "):RIGHT_PAREN", "'strings':STRING", "\'oh \\22my\':STRING", "'foo bar':STRING", "color:IDENT", "::COLON", "blue:IDENT", "!:DELIM", "important:IDENT", "]:RIGHT_SQUARE")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testLex()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.CssGrammarTest|testLex()|21", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.CssGrammarTest|testLex()|22", java.util.List.class, actualTokens))));
    }

    @org.junit.Test
    public static final void testCssContent() {
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|0", org.owasp.html.CssGrammar.cssContent("")));
        junit.framework.TestCase.assertEquals("azimuth", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|1", org.owasp.html.CssGrammar.cssContent("\\61zimuth")));
        junit.framework.TestCase.assertEquals("table-cell", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|2", org.owasp.html.CssGrammar.cssContent("t\\61\tble-cell")));
        junit.framework.TestCase.assertEquals("foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|3", org.owasp.html.CssGrammar.cssContent("foo")));
        junit.framework.TestCase.assertEquals("foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|4", org.owasp.html.CssGrammar.cssContent("'foo'")));
        junit.framework.TestCase.assertEquals("foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|5", org.owasp.html.CssGrammar.cssContent("\"foo\"")));
        junit.framework.TestCase.assertEquals("'", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|6", org.owasp.html.CssGrammar.cssContent("'")));
        junit.framework.TestCase.assertEquals("\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|7", org.owasp.html.CssGrammar.cssContent("\"")));
        junit.framework.TestCase.assertEquals("\"\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|8", org.owasp.html.CssGrammar.cssContent("\"\\22\\22\"")));
        junit.framework.TestCase.assertEquals("\"\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|9", org.owasp.html.CssGrammar.cssContent("\"\\22 \\22\"")));
        junit.framework.TestCase.assertEquals("\"\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|10", org.owasp.html.CssGrammar.cssContent("\\22\\22")));
        junit.framework.TestCase.assertEquals("\\", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|11", org.owasp.html.CssGrammar.cssContent("\'\\\\\'")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssGrammarTest|testCssContent()|12", org.owasp.html.CssGrammar.cssContent("\'\\a\'")));
    }
}

