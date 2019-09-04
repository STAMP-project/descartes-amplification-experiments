/**
 * Copyright (c) 2012, Mike Samuel
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
public final class EncodingTest extends junit.framework.TestCase {
    @org.junit.Test
    public static final void testDecodeHtml() {
        java.lang.String html = "The quick&nbsp;brown fox&#xa;jumps over&#xd;&#10;the lazy dog&#x000a;";
        // 1         2         3         4         5         6
        // 123456789012345678901234567890123456789012345678901234567890123456789
        java.lang.String golden = "The quick\u00a0brown fox\njumps over\r\nthe lazy dog\n";
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|0", golden), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|2", org.owasp.html.Encoding.decodeHtml(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|1", html))));
        // Don't allocate a new string when no entities.
        junit.framework.TestCase.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|3", golden), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|5", org.owasp.html.Encoding.decodeHtml(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|4", golden))));
        // test interrupted escapes and escapes at end of file handled gracefully
        junit.framework.TestCase.assertEquals("\\\\u000a", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|6", org.owasp.html.Encoding.decodeHtml("\\\\u000a")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|7", org.owasp.html.Encoding.decodeHtml("&#x000a;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|8", org.owasp.html.Encoding.decodeHtml("&#x00a;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|9", org.owasp.html.Encoding.decodeHtml("&#x0a;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|10", org.owasp.html.Encoding.decodeHtml("&#xa;")));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|12", java.lang.String.valueOf(eu.stamp_project.reneri.instrumentation.StateObserver.<char[]>observeState("org.owasp.html.EncodingTest|testDecodeHtml()|11", char[].class, java.lang.Character.toChars(65536)))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|13", org.owasp.html.Encoding.decodeHtml("&#x10000;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|14", org.owasp.html.Encoding.decodeHtml("&#xa")));
        junit.framework.TestCase.assertEquals("&#x00ziggy", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|15", org.owasp.html.Encoding.decodeHtml("&#x00ziggy")));
        junit.framework.TestCase.assertEquals("&#xa00z;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|16", org.owasp.html.Encoding.decodeHtml("&#xa00z;")));
        junit.framework.TestCase.assertEquals("&#\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|17", org.owasp.html.Encoding.decodeHtml("&#&#x000a;")));
        junit.framework.TestCase.assertEquals("&#x\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|18", org.owasp.html.Encoding.decodeHtml("&#x&#x000a;")));
        junit.framework.TestCase.assertEquals("\n\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|19", org.owasp.html.Encoding.decodeHtml("&#xa&#x000a;")));
        junit.framework.TestCase.assertEquals("&#\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|20", org.owasp.html.Encoding.decodeHtml("&#&#xa;")));
        junit.framework.TestCase.assertEquals("&#x", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|21", org.owasp.html.Encoding.decodeHtml("&#x")));
        // NUL elided.
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|22", org.owasp.html.Encoding.decodeHtml("&#x0")));
        junit.framework.TestCase.assertEquals("&#", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|23", org.owasp.html.Encoding.decodeHtml("&#")));
        junit.framework.TestCase.assertEquals("\\", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|24", org.owasp.html.Encoding.decodeHtml("\\")));
        junit.framework.TestCase.assertEquals("&", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|25", org.owasp.html.Encoding.decodeHtml("&")));
        junit.framework.TestCase.assertEquals("&#000a;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|26", org.owasp.html.Encoding.decodeHtml("&#000a;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|27", org.owasp.html.Encoding.decodeHtml("&#10;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|28", org.owasp.html.Encoding.decodeHtml("&#010;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|29", org.owasp.html.Encoding.decodeHtml("&#0010;")));
        junit.framework.TestCase.assertEquals("\t", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|30", org.owasp.html.Encoding.decodeHtml("&#9;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|31", org.owasp.html.Encoding.decodeHtml("&#10")));
        junit.framework.TestCase.assertEquals("&#00ziggy", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|32", org.owasp.html.Encoding.decodeHtml("&#00ziggy")));
        junit.framework.TestCase.assertEquals("&#\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|33", org.owasp.html.Encoding.decodeHtml("&#&#010;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|34", org.owasp.html.Encoding.decodeHtml("&#0&#010;")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|35", org.owasp.html.Encoding.decodeHtml("&#01&#10;")));
        junit.framework.TestCase.assertEquals("&#\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|36", org.owasp.html.Encoding.decodeHtml("&#&#10;")));
        // Invalid XML char elided.
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|37", org.owasp.html.Encoding.decodeHtml("&#1")));
        junit.framework.TestCase.assertEquals("\t", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|38", org.owasp.html.Encoding.decodeHtml("&#9")));
        junit.framework.TestCase.assertEquals("\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|39", org.owasp.html.Encoding.decodeHtml("&#10")));
        // test the named escapes
        junit.framework.TestCase.assertEquals("<", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|40", org.owasp.html.Encoding.decodeHtml("&lt;")));
        junit.framework.TestCase.assertEquals(">", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|41", org.owasp.html.Encoding.decodeHtml("&gt;")));
        junit.framework.TestCase.assertEquals("\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|42", org.owasp.html.Encoding.decodeHtml("&quot;")));
        junit.framework.TestCase.assertEquals("'", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|43", org.owasp.html.Encoding.decodeHtml("&apos;")));
        junit.framework.TestCase.assertEquals("'", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|44", org.owasp.html.Encoding.decodeHtml("&#39;")));
        junit.framework.TestCase.assertEquals("'", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|45", org.owasp.html.Encoding.decodeHtml("&#x27;")));
        junit.framework.TestCase.assertEquals("&", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|46", org.owasp.html.Encoding.decodeHtml("&amp;")));
        junit.framework.TestCase.assertEquals("&lt;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|47", org.owasp.html.Encoding.decodeHtml("&amp;lt;")));
        junit.framework.TestCase.assertEquals("&", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|48", org.owasp.html.Encoding.decodeHtml("&AMP;")));
        junit.framework.TestCase.assertEquals("&", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|49", org.owasp.html.Encoding.decodeHtml("&AMP")));
        junit.framework.TestCase.assertEquals("&", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|50", org.owasp.html.Encoding.decodeHtml("&AmP;")));
        junit.framework.TestCase.assertEquals("\u0391", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|51", org.owasp.html.Encoding.decodeHtml("&Alpha;")));
        junit.framework.TestCase.assertEquals("\u03b1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|52", org.owasp.html.Encoding.decodeHtml("&alpha;")));
        junit.framework.TestCase.assertEquals("&;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|53", org.owasp.html.Encoding.decodeHtml("&;")));
        junit.framework.TestCase.assertEquals("&bogus;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testDecodeHtml()|54", org.owasp.html.Encoding.decodeHtml("&bogus;")));
    }

    @org.junit.Test
    public static final void testAppendNumericEntityAndEncodeOnto() throws java.lang.Exception {
        java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        java.lang.StringBuilder cps = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|1", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        for (int codepoint : eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|2", int[].class, new int[]{ 0, 9, '\n', '@', 128, 255, 256, 4095, 4096, 4666, 65535, 65536, java.lang.Character.MAX_CODE_POINT })) {
            org.owasp.html.Encoding.appendNumericEntity(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|3", codepoint), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|4", java.lang.StringBuilder.class, sb));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|6", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|5", java.lang.StringBuilder.class, sb).append(' '));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|10", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|9", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|7", java.lang.StringBuilder.class, cps).appendCodePoint(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|8", codepoint))).append(' '));
        }
        junit.framework.TestCase.assertEquals(("&#0; &#9; &#10; &#64; &#x80; &#xff; &#x100; &#xfff; &#x1000; " + "&#x123a; &#xffff; &#x10000; &#x10ffff; "), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|11", java.lang.StringBuilder.class, sb).toString()));
        java.lang.StringBuilder out = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|13", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.Encoding.encodeHtmlAttribOnto(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|14", java.lang.StringBuilder.class, cps).toString()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|16", java.lang.StringBuilder.class, out));
        junit.framework.TestCase.assertEquals((" \t \n &#64; \u0080 \u00ff \u0100 \u0fff \u1000 " + "\u123a  &#x10000; &#x10ffff; "), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAppendNumericEntityAndEncodeOnto()|17", java.lang.StringBuilder.class, out).toString()));
    }

    @org.junit.Test
    public static final void testAngularJsBracesInTextNode() throws java.lang.Exception {
        java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.Encoding.encodePcdataOnto("{{angularVariable}}", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|1", java.lang.StringBuilder.class, sb));
        junit.framework.TestCase.assertEquals("{<!-- -->{angularVariable}}", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|2", java.lang.StringBuilder.class, sb).toString()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|4", java.lang.StringBuilder.class, sb).setLength(0);
        org.owasp.html.Encoding.encodePcdataOnto("{", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|5", java.lang.StringBuilder.class, sb));
        org.owasp.html.Encoding.encodePcdataOnto("{angularVariable}}", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|6", java.lang.StringBuilder.class, sb));
        junit.framework.TestCase.assertEquals("{<!-- -->{angularVariable}}", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testAngularJsBracesInTextNode()|7", java.lang.StringBuilder.class, sb).toString()));
    }

    private static final void assertStripped(java.lang.String stripped, java.lang.String orig) {
        java.lang.String actual = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|1", org.owasp.html.Encoding.stripBannedCodeunits(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|0", orig)));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|2", orig), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|3", stripped), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|4", actual));
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|7", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|5", stripped).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|6", orig)))) {
            junit.framework.TestCase.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|8", actual), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|9", orig));
        }
        java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|11", java.lang.StringBuilder.class, new java.lang.StringBuilder(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|10", orig)));
        org.owasp.html.Encoding.stripBannedCodeunits(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|12", java.lang.StringBuilder.class, sb));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|13", orig), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|14", stripped), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|16", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|assertStripped(java.lang.String,java.lang.String)|15", java.lang.StringBuilder.class, sb).toString()));
    }

    @org.junit.Test
    public static final void testStripBannedCodeunits() {
        org.owasp.html.EncodingTest.assertStripped("", "");
        org.owasp.html.EncodingTest.assertStripped("foo", "foo");
        org.owasp.html.EncodingTest.assertStripped("foobar", "foo\u0000bar");
        org.owasp.html.EncodingTest.assertStripped("foobar", "foo\u0000bar\u0000");
        org.owasp.html.EncodingTest.assertStripped("foobar", "foo\ufffebar\b");
        org.owasp.html.EncodingTest.assertStripped("foobar", "foo\ud800bar\udc00");
        org.owasp.html.EncodingTest.assertStripped("foo\ud800\udc00bar", "foo\ud800\ud800\udc00bar");
        org.owasp.html.EncodingTest.assertStripped("foo\ud800\udc00bar", "foo\ud800\udc00\ud800bar");
        org.owasp.html.EncodingTest.assertStripped("foo\ud800\udc00bar", "foo\ud800\udc00\udc00bar");
        org.owasp.html.EncodingTest.assertStripped("foo\ud800\udc00bar", "foo\udc00\ud800\udc00bar");
        org.owasp.html.EncodingTest.assertStripped("foo\ud834\udd1ebar", "foo\ud834\udd1ebar");
        org.owasp.html.EncodingTest.assertStripped("foo\ud834\udd1e", "foo\ud834\udd1e");
        org.owasp.html.EncodingTest.assertStripped("\uffef\ufffd", "\uffef\ufffd\ufffe\uffff");
    }

    @org.junit.Test
    public static final void testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes() throws java.lang.Exception {
        // Some clients do ad-hoc post processing of the output.
        // String replace of {{...}} shouldn't turn
        // <span title="{{">}} <br class="a nonce=xyz "></span>
        // into
        // <span title="x <br class="a nonce=xyz "></span>
        // which contains CSP directives.
        // We prevent this by being strict about quotes to prevent ending an
        // attribute with quotes about strict mode, and being strict about equals
        // signs to prevent text nodes or attribute values from introducing an
        // attribute with a value.
        java.lang.StringBuilder pcdata = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.Encoding.encodePcdataOnto("\" nonce=xyz", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|1", java.lang.StringBuilder.class, pcdata));
        junit.framework.TestCase.assertEquals("&#34; nonce&#61;xyz", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|2", java.lang.StringBuilder.class, pcdata).toString()));
        java.lang.StringBuilder rcdata = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|4", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.Encoding.encodeRcdataOnto("\" nonce=xyz", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|5", java.lang.StringBuilder.class, rcdata));
        junit.framework.TestCase.assertEquals("&#34; nonce&#61;xyz", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|6", java.lang.StringBuilder.class, rcdata).toString()));
        java.lang.StringBuilder attrib = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|8", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.Encoding.encodeHtmlAttribOnto("a nonce=xyz ", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|9", java.lang.StringBuilder.class, attrib));
        junit.framework.TestCase.assertEquals("a nonce&#61;xyz ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.EncodingTest|testBadlyDonePostProcessingWillnotAllowInsertingNonceAttributes()|10", java.lang.StringBuilder.class, attrib).toString()));
    }
}

