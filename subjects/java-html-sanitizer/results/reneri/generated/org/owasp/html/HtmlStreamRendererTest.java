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
public class HtmlStreamRendererTest extends junit.framework.TestCase {
    private final java.util.List<java.lang.String> errors = com.google.common.collect.Lists.newArrayList();

    private final java.lang.StringBuilder rendered = new java.lang.StringBuilder();

    private final org.owasp.html.HtmlStreamRenderer renderer = org.owasp.html.HtmlStreamRenderer.create(rendered, new org.owasp.html.Handler<java.lang.String>() {
        public void handle(java.lang.String errorMessage) {
            @java.lang.SuppressWarnings({ "hiding", "synthetic-access" })
            java.util.List<java.lang.String> errors = org.owasp.html.HtmlStreamRendererTest.this.errors;
            errors.add(errorMessage);
        }
    });

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|setUp()|0", java.util.List.class, errors).clear();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|setUp()|1", java.lang.StringBuilder.class, rendered).setLength(0);
    }

    @java.lang.Override
    protected void tearDown() throws java.lang.Exception {
        super.tearDown();
        junit.framework.TestCase.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|tearDown()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|tearDown()|0", java.util.List.class, errors).isEmpty()));// Catch any tests that don't check errors.

    }

    public final void testEmptyDocument() throws java.lang.Exception {
        assertNormalized("", "");
    }

    public final void testElementNamesNormalized() throws java.lang.Exception {
        assertNormalized("<br />", "<br>");
        assertNormalized("<br />", "<BR>");
        assertNormalized("<br />", "<Br />");
        assertNormalized("<br />", "<br\n>");
    }

    public final void testAttributeNamesNormalized() throws java.lang.Exception {
        assertNormalized("<input id=\"foo\" />", "<input  id=foo>");
        assertNormalized("<input id=\"foo\" />", "<input id=\"foo\">");
        assertNormalized("<input id=\"foo\" />", "<input  ID='foo'>");
        assertNormalized("<input id=\"foo\" />", "<input\nid=\'foo\'>");
        assertNormalized("<input id=\"foo\" />", "<input\nid=foo\'>");
    }

    public final void testAttributeValuesEscaped() throws java.lang.Exception {
        assertNormalized("<div title=\"a&lt;b\"></div>", "<div title=a<b></div>");
    }

    public final void testRcdataEscaped() throws java.lang.Exception {
        assertNormalized("<title>I &lt;3 PONIES, OMG!!!</title>", "<TITLE>I <3 PONIES, OMG!!!</TITLE>");
    }

    public final void testCdataNotEscaped() throws java.lang.Exception {
        assertNormalized("<script>I <3\n!!!PONIES, OMG</script>", "<script>I <3\n!!!PONIES, OMG</script>");
    }

    public final void testIllegalElementName() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag(":svg", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("svg:", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|4", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("-1", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|6", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|7", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("svg::svg", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|8", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|9", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("a@b", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|10", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|11", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        java.lang.String output = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|12", java.lang.StringBuilder.class, rendered).toString());
        junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|14", output), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|16", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|15", output).contains("<")));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|17", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join("Invalid element name : :svg", "Invalid element name : svg:", "Invalid element name : -1", "Invalid element name : svg::svg", "Invalid element name : a@b")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|19", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|20", java.util.List.class, errors))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalElementName()|22", java.util.List.class, errors).clear();
    }

    public final void testIllegalAttributeName() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("div", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.of(":svg", "x")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("div", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|4", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.of("svg:", "x")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("div", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|6", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.of("-1", "x")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|7", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("div", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|8", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.of("svg::svg", "x")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|9", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("div", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|10", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.of("a@b", "x")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|11", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        java.lang.String output = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|12", java.lang.StringBuilder.class, rendered).toString());
        junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|14", output), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|16", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|15", output).contains("=")));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|17", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join("Invalid attr name : :svg", "Invalid attr name : svg:", "Invalid attr name : -1", "Invalid attr name : svg::svg", "Invalid attr name : a@b")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|19", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|20", java.util.List.class, errors))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testIllegalAttributeName()|22", java.util.List.class, errors).clear();
    }

    public final void testCdataContainsEndTag1() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("script", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.of("type", "text/javascript")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("document.write('<SCRIPT>alert(42)</SCRIPT>')");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("script");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<script type=\"text/javascript\"></script>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|6", java.lang.StringBuilder.class, rendered).toString()));
        junit.framework.TestCase.assertEquals("Invalid CDATA text content : </SCRIPT>'", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|8", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|9", java.util.List.class, errors))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag1()|11", java.util.List.class, errors).clear();
    }

    public final void testCdataContainsEndTag2() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("style", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.of("type", "text/css")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("/* </St");
        // Split into two text chunks, and insert NULs.
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).text("\u0000yle> */");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("style");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|6", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<style type=\"text/css\"></style>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|7", java.lang.StringBuilder.class, rendered).toString()));
        junit.framework.TestCase.assertEquals("Invalid CDATA text content : </Style> *", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|9", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|10", java.util.List.class, errors))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testCdataContainsEndTag2()|12", java.util.List.class, errors).clear();
    }

    public final void testRcdataContainsEndTag() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testRcdataContainsEndTag()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testRcdataContainsEndTag()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("textarea", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testRcdataContainsEndTag()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testRcdataContainsEndTag()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("<textarea></textarea>");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testRcdataContainsEndTag()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("textarea");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testRcdataContainsEndTag()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<textarea>&lt;textarea&gt;&lt;/textarea&gt;</textarea>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testRcdataContainsEndTag()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testRcdataContainsEndTag()|6", java.lang.StringBuilder.class, rendered).toString()));
    }

    public final void testCdataContainsEndTagInEscapingSpan() throws java.lang.Exception {
        assertNormalized("<script><!--document.write('<SCRIPT>alert(42)</SCRIPT>')--></script>", "<script><!--document.write('<SCRIPT>alert(42)</SCRIPT>')--></script>");
    }

    public final void testTagInCdata() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("script", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("alert('");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("b", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|5", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|6", org.owasp.html.HtmlStreamRenderer.class, renderer).text("foo");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|7", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("b");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|8", org.owasp.html.HtmlStreamRenderer.class, renderer).text("')");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|9", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("script");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|10", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<script>alert('foo')</script>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|11", java.lang.StringBuilder.class, rendered).toString()));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|13", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join("Tag content cannot appear inside CDATA element : b", "Tag content cannot appear inside CDATA element : b")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|15", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|16", java.util.List.class, errors))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testTagInCdata()|18", java.util.List.class, errors).clear();
    }

    public final void testUnclosedEscapingTextSpan() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("script", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("<!--alert('</script>')");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("script");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<script></script>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|6", java.lang.StringBuilder.class, rendered).toString()));
        junit.framework.TestCase.assertEquals("Invalid CDATA text content : <!--alert(", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Joiner>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|8", com.google.common.base.Joiner.class, com.google.common.base.Joiner.on('\n')).join(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|9", java.util.List.class, errors))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testUnclosedEscapingTextSpan()|11", java.util.List.class, errors).clear();
    }

    public final void testSupplementaryCodepoints() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testSupplementaryCodepoints()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testSupplementaryCodepoints()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).text("\ud87e\udc1a");// Supplementary codepoint U+2F81A

        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testSupplementaryCodepoints()|2", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("&#x2f81a;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testSupplementaryCodepoints()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testSupplementaryCodepoints()|3", java.lang.StringBuilder.class, rendered).toString()));
    }

    // Test that policies that naively allow <xmp>, <listing>, or <plaintext>
    // on XHTML don't shoot themselves in the foot.
    public final void testPreSubstitutes1() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes1()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes1()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("Xmp", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes1()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes1()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("<form>Hello, World</form>");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes1()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("Xmp");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes1()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<pre>&lt;form&gt;Hello, World&lt;/form&gt;</pre>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes1()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes1()|6", java.lang.StringBuilder.class, rendered).toString()));
    }

    public final void testPreSubstitutes2() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes2()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes2()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("xmp", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes2()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes2()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("<form>Hello, World</form>");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes2()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("xmp");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes2()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<pre>&lt;form&gt;Hello, World&lt;/form&gt;</pre>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes2()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes2()|6", java.lang.StringBuilder.class, rendered).toString()));
    }

    public final void testPreSubstitutes3() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes3()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes3()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("LISTING", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes3()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes3()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("<form>Hello, World</form>");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes3()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag("LISTING");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes3()|5", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<pre>&lt;form&gt;Hello, World&lt;/form&gt;</pre>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes3()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes3()|6", java.lang.StringBuilder.class, rendered).toString()));
    }

    public final void testPreSubstitutes4() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes4()|0", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes4()|1", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag("plaintext", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableList<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes4()|2", com.google.common.collect.ImmutableList.class, com.google.common.collect.ImmutableList.<java.lang.String>of()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes4()|3", org.owasp.html.HtmlStreamRenderer.class, renderer).text("<form>Hello, World</form>");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes4()|4", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
        junit.framework.TestCase.assertEquals("<pre>&lt;form&gt;Hello, World&lt;/form&gt;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes4()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|testPreSubstitutes4()|5", java.lang.StringBuilder.class, rendered).toString()));
    }

    private void assertNormalized(java.lang.String golden, java.lang.String htmlInput) throws java.lang.Exception {
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|assertNormalized(java.lang.String,java.lang.String)|0", golden), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|assertNormalized(java.lang.String,java.lang.String)|2", normalize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|assertNormalized(java.lang.String,java.lang.String)|1", htmlInput))));
        // Check that normalization is idempotent.
        if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|assertNormalized(java.lang.String,java.lang.String)|5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|assertNormalized(java.lang.String,java.lang.String)|3", golden).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|assertNormalized(java.lang.String,java.lang.String)|4", htmlInput))))) {
            assertNormalized(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|assertNormalized(java.lang.String,java.lang.String)|6", golden), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|assertNormalized(java.lang.String,java.lang.String)|7", golden));
        }
    }

    private java.lang.String normalize(java.lang.String htmlInput) {
        @java.lang.SuppressWarnings("hiding")
        final org.owasp.html.HtmlStreamRenderer renderer = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|0", org.owasp.html.HtmlStreamRenderer.class, this.renderer);
        // Use a permissive sanitizer to generate the events.
        org.owasp.html.HtmlSanitizer.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|1", htmlInput), new org.owasp.html.HtmlSanitizer.Policy() {
            public void openTag(java.lang.String elementName, java.util.List<java.lang.String> attrs) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|3", org.owasp.html.HtmlStreamRenderer.class, renderer).openTag(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|4", elementName), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|5", java.util.List.class, attrs));
            }

            public void closeTag(java.lang.String elementName) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|6", org.owasp.html.HtmlStreamRenderer.class, renderer).closeTag(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|7", elementName));
            }

            public void text(java.lang.String textChunk) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|8", org.owasp.html.HtmlStreamRenderer.class, renderer).text(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|9", textChunk));
            }

            public void openDocument() {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|10", org.owasp.html.HtmlStreamRenderer.class, renderer).openDocument();
            }

            public void closeDocument() {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|11", org.owasp.html.HtmlStreamRenderer.class, renderer).closeDocument();
            }
        });
        java.lang.String result = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|12", java.lang.StringBuilder.class, rendered).toString());
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|14", java.lang.StringBuilder.class, rendered).setLength(0);
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlStreamRendererTest|normalize(java.lang.String)|15", result);
    }
}

