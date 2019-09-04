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
public class SanitizersTest extends junit.framework.TestCase {
    @org.junit.Test
    public static final void testFormatting() {
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testFormatting()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testFormatting()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).sanitize(null)));
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testFormatting()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testFormatting()|2", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).sanitize("")));
        junit.framework.TestCase.assertEquals("Hello, World!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testFormatting()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testFormatting()|4", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).sanitize("Hello, World!")));
        junit.framework.TestCase.assertEquals("Hello, <b>World</b>!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testFormatting()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testFormatting()|6", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).sanitize("Hello, <b>World</b>!")));
        junit.framework.TestCase.assertEquals("Hello, <b>World</b>!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testFormatting()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testFormatting()|8", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).sanitize("<p>Hello, <b onclick=alert(1337)>World</b>!</p>")));
    }

    @org.junit.Test
    public static final void testBlockElements() {
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testBlockElements()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockElements()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).sanitize(null)));
        junit.framework.TestCase.assertEquals("Hello, World!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testBlockElements()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockElements()|2", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).sanitize("Hello, World!")));
        junit.framework.TestCase.assertEquals("Hello, World!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testBlockElements()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockElements()|4", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).sanitize("Hello, <b>World</b>!")));
        junit.framework.TestCase.assertEquals("<p>Hello, World!</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testBlockElements()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockElements()|6", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).sanitize("<p onclick=alert(1337)>Hello, <b>World</b>!</p>")));
    }

    @org.junit.Test
    public static final void testBlockAndFormattingElements() {
        org.owasp.html.PolicyFactory s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|2", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|1", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING)));
        org.owasp.html.PolicyFactory r1 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|7", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|5", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|3", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|4", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|6", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS)));
        org.owasp.html.PolicyFactory r2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|12", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|10", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|8", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|9", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|11", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING)));
        for (org.owasp.html.PolicyFactory f : eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory[]>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|16", org.owasp.html.PolicyFactory[].class, new org.owasp.html.PolicyFactory[]{ eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|13", org.owasp.html.PolicyFactory.class, s), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|14", org.owasp.html.PolicyFactory.class, r1), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|15", org.owasp.html.PolicyFactory.class, r2) })) {
            junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|17", org.owasp.html.PolicyFactory.class, f).sanitize(null)));
            junit.framework.TestCase.assertEquals("Hello, World!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|19", org.owasp.html.PolicyFactory.class, f).sanitize("Hello, World!")));
            junit.framework.TestCase.assertEquals("Hello, <b>World</b>!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|21", org.owasp.html.PolicyFactory.class, f).sanitize("Hello, <b>World</b>!")));
            junit.framework.TestCase.assertEquals("<p>Hello, <b>World</b>!</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|24", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testBlockAndFormattingElements()|23", org.owasp.html.PolicyFactory.class, f).sanitize("<p onclick=alert(1337)>Hello, <b>World</b>!</p>")));
        }
    }

    @org.junit.Test
    public static final void testStylesAndFormatting() {
        org.owasp.html.PolicyFactory sanitizer = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStylesAndFormatting()|6", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStylesAndFormatting()|4", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStylesAndFormatting()|2", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStylesAndFormatting()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStylesAndFormatting()|1", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStylesAndFormatting()|3", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.STYLES))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStylesAndFormatting()|5", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.LINKS)));
        java.lang.String input = "<span style=\"font-weight:bold;" + ("text-decoration:underline;background-color:yellow\"" + ">aaaaaaaaaaaaaaaaaaaaaaa</span>");
        java.lang.String got = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testStylesAndFormatting()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStylesAndFormatting()|7", org.owasp.html.PolicyFactory.class, sanitizer).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testStylesAndFormatting()|8", input)));
        java.lang.String want = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testStylesAndFormatting()|10", input);
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testStylesAndFormatting()|11", want), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testStylesAndFormatting()|12", got));
    }

    @org.junit.Test
    public static final void testAndIntersects() {
        org.owasp.html.PolicyFactory restrictedLink = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|5", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|4", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|3", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|2", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|1", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|0", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowElements("a")).allowUrlProtocols("https")).allowAttributes("href", "title")).onElements("a")).toFactory());
        org.owasp.html.PolicyFactory inline = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|8", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|6", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|7", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.LINKS)));
        java.lang.String inputHtml = "<a href='http://foo.com/'>Hello, <b>World</b></a>" + "<a title='!' href='https://foo.com/#!'>!</a>";
        org.owasp.html.PolicyFactory and1 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|11", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|9", org.owasp.html.PolicyFactory.class, restrictedLink).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|10", org.owasp.html.PolicyFactory.class, inline)));
        org.owasp.html.PolicyFactory and2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|14", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|12", org.owasp.html.PolicyFactory.class, inline).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|13", org.owasp.html.PolicyFactory.class, restrictedLink)));
        junit.framework.TestCase.assertEquals("https-only links", "Hello, World<a title=\"!\" href=\"https://foo.com/#!\">!</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndIntersects()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|15", org.owasp.html.PolicyFactory.class, restrictedLink).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndIntersects()|16", inputHtml))));
        junit.framework.TestCase.assertEquals("inline els", ("<a href=\"http://foo.com/\" rel=\"nofollow\">Hello, <b>World</b></a>" + "<a href=\"https://foo.com/#!\" rel=\"nofollow\">!</a>"), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndIntersects()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|18", org.owasp.html.PolicyFactory.class, inline).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndIntersects()|19", inputHtml))));
        junit.framework.TestCase.assertEquals("https-only links and inline els", ("Hello, <b>World</b>" + "<a title=\"!\" href=\"https://foo.com/#!\" rel=\"nofollow\">!</a>"), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndIntersects()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|21", org.owasp.html.PolicyFactory.class, and1).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndIntersects()|22", inputHtml))));
        junit.framework.TestCase.assertEquals("inline els and https-only links", ("Hello, <b>World</b>" + "<a title=\"!\" href=\"https://foo.com/#!\" rel=\"nofollow\">!</a>"), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndIntersects()|26", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndIntersects()|24", org.owasp.html.PolicyFactory.class, and2).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndIntersects()|25", inputHtml))));
    }

    @org.junit.Test
    public static final void testImages() {
        org.owasp.html.PolicyFactory s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testImages()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.IMAGES);
        junit.framework.TestCase.assertEquals("foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testImages()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testImages()|1", org.owasp.html.PolicyFactory.class, s).sanitize("<a href=\"javascript:alert(1337)\">foo</a>")));
        junit.framework.TestCase.assertEquals("<img src=\"foo.gif\" />", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testImages()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testImages()|3", org.owasp.html.PolicyFactory.class, s).sanitize("<img src=\"foo.gif\">")));
        junit.framework.TestCase.assertEquals("", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testImages()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testImages()|5", org.owasp.html.PolicyFactory.class, s).sanitize("<img src=\"javascript://alert(1337)\">")));
        junit.framework.TestCase.assertEquals(("<img src=\"x.gif\" alt=\"y\"" + " width=\"96\" height=\"64\" border=\"0\" />"), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testImages()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testImages()|7", org.owasp.html.PolicyFactory.class, s).sanitize("<img src=\"x.gif\" alt=\"y\" width=96 height=64 border=0>")));
        junit.framework.TestCase.assertEquals("<img src=\"x.png\" alt=\"y\" height=\"64\" border=\"0\" />", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testImages()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testImages()|9", org.owasp.html.PolicyFactory.class, s).sanitize("<img src=\"x.png\" alt=\"y\" width=\"widgy\" height=64 border=0>")));
    }

    @org.junit.Test
    public static final void testLinks() {
        org.owasp.html.PolicyFactory s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.LINKS);
        junit.framework.TestCase.assertEquals("<a href=\"foo.html\" rel=\"nofollow\">Link text</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testLinks()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|1", org.owasp.html.PolicyFactory.class, s).sanitize("<a href=\"foo.html\">Link text</a>")));
        junit.framework.TestCase.assertEquals("<a href=\"foo.html\" rel=\"nofollow\">Link text</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testLinks()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|3", org.owasp.html.PolicyFactory.class, s).sanitize("<a href=\"foo.html\" onclick=\"alert(1337)\">Link text</a>")));
        junit.framework.TestCase.assertEquals("<a href=\"http://example.com/x.html\" rel=\"nofollow\">Link text</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testLinks()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|5", org.owasp.html.PolicyFactory.class, s).sanitize(("<a href=\"http://example.com/x.html\"" + " onclick=\"alert(1337)\">Link text</a>"))));
        junit.framework.TestCase.assertEquals("<a href=\"https://example.com/x.html\" rel=\"nofollow\">Link text</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testLinks()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|7", org.owasp.html.PolicyFactory.class, s).sanitize(("<a href=\"https://example.com/x.html\"" + " onclick=\"alert(1337)\">Link text</a>"))));
        junit.framework.TestCase.assertEquals("<a href=\"HTTPS://example.com/x.html\" rel=\"nofollow\">Link text</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testLinks()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|9", org.owasp.html.PolicyFactory.class, s).sanitize(("<a href=\"HTTPS://example.com/x.html\"" + " onclick=\"alert(1337)\">Link text</a>"))));
        junit.framework.TestCase.assertEquals("<a href=\"//example.com/x.html\" rel=\"nofollow\">Link text</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testLinks()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|11", org.owasp.html.PolicyFactory.class, s).sanitize(("<a href=\"//example.com/x.html\"" + " onclick=\"alert(1337)\">Link text</a>"))));
        junit.framework.TestCase.assertEquals("Link text", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testLinks()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|13", org.owasp.html.PolicyFactory.class, s).sanitize(("<a href=\"javascript:alert(1337).html\"" + " onclick=\"alert(1337)\">Link text</a>"))));
        // Not a link.  Instead, an attempt to intercept URL references that has
        // not been explicitly allowed.
        junit.framework.TestCase.assertEquals("Header text", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testLinks()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testLinks()|15", org.owasp.html.PolicyFactory.class, s).sanitize("<a name=\"header\" id=\"header\">Header text</a>")));
    }

    @org.junit.Test
    public static final void testExplicitlyAllowedProtocolsAreCaseInsensitive() {
        // Issue 24.
        org.owasp.html.PolicyFactory s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|6", org.owasp.html.PolicyFactory.class, // Don't try this at home
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|5", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|4", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|3", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|2", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|1", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|0", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowElements("a")).allowAttributes("href")).onElements("a")).allowStandardUrlProtocols()).allowUrlProtocols("file")).toFactory());
        java.lang.String input = "<a href='file:///etc/passwd'>Copy and paste this into email</a>" + (("<a href='FILE:///etc/passwd'>Or this one</a>" + "<a href=\'F\u0130LE:///etc/passwd\'>not with Turkish dotted I\'s</a>") + "<a href='fail:///etc/passed'>The fail protocol needs to happen</a>");
        java.lang.String want = "<a href=\"file:///etc/passwd\">Copy and paste this into email</a>" + (("<a href=\"FILE:///etc/passwd\">Or this one</a>" + "not with Turkish dotted I&#39;s") + "The fail protocol needs to happen");
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|7", want), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|8", org.owasp.html.PolicyFactory.class, s).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testExplicitlyAllowedProtocolsAreCaseInsensitive()|9", input))));
    }

    @org.junit.Test
    public static final void testIssue9StylesInTables() {
        java.lang.String input = "" + ((((((((((((((("<table style=\"color: rgb(0, 0, 0);" + " font-family: Arial, Geneva, sans-serif;\">") + "<tbody>") + "<tr>") + "<th>Column One</th><th>Column Two</th>") + "</tr>") + "<tr>") + "<td align=\"center\"") + " style=\"background-color: rgb(255, 255, 254);\">") + "<font size=\"2\">Size 2</font></td>") + "<td align=\"center\"") + " style=\"background-color: rgb(255, 255, 254);\">") + "<font size=\"7\">Size 7</font></td>") + "</tr>") + "</tbody>") + "</table>");
        org.owasp.html.PolicyFactory s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|10", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|9", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|8", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|7", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|6", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|5", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|4", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|3", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|2", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|1", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|0", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowElements("table", "tbody", "thead", "tr", "td", "th")).allowCommonBlockElements()).allowCommonInlineFormattingElements()).allowStyling()).allowAttributes("align")).matching(true, "left", "center", "right")).onElements("table", "tr", "td", "th")).allowAttributes("size")).onElements("font", "img")).toFactory());
        java.lang.String sanitized = "" + ((((((((((((((("<table style=\"color:rgb( 0 , 0 , 0 );" + "font-family:&#39;arial&#39; , &#39;geneva&#39; , sans-serif\">") + "<tbody>") + "<tr>") + "<th>Column One</th><th>Column Two</th>") + "</tr>") + "<tr>") + "<td align=\"center\"") + " style=\"background-color:rgb( 255 , 255 , 254 )\">") + "<font size=\"2\">Size 2</font></td>") + "<td align=\"center\"") + " style=\"background-color:rgb( 255 , 255 , 254 )\">") + "<font size=\"7\">Size 7</font></td>") + "</tr>") + "</tbody>") + "</table>");
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|11", sanitized), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|12", org.owasp.html.PolicyFactory.class, s).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue9StylesInTables()|13", input))));
    }

    @org.junit.Test
    public static final void testSkipIfEmptyUnionsProperly() {
        // Issue 23
        org.owasp.html.PolicyFactory extras = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|6", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|5", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|4", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|3", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, // This is not the proper way to require the attribute disabled on
        // textareas.  This is a test.  This is only a test.
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|2", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|1", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|0", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowWithoutAttributes("span", "div")).allowElements("span", "div", "textarea")).allowAttributes("disabled")).onElements("textarea")).disallowWithoutAttributes("textarea")).toFactory());
        org.owasp.html.PolicyFactory policy = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|15", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|13", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|11", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|9", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|7", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|8", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|10", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.IMAGES))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|12", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.STYLES))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|14", org.owasp.html.PolicyFactory.class, extras)));
        java.lang.String input = "<textarea>text</textarea><textarea disabled></textarea>" + "<div onclick='redirect()'><span>Styled by span</span></div>";
        java.lang.String want = "text<textarea disabled=\"disabled\"></textarea>" + "<div><span>Styled by span</span></div>";
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|16", want), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|17", org.owasp.html.PolicyFactory.class, policy).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testSkipIfEmptyUnionsProperly()|18", input))));
    }

    @org.junit.Test
    public static final void testIssue30() {
        java.lang.String test = "&nbsp;&gt;";
        org.owasp.html.PolicyFactory policy = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue30()|4", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue30()|2", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue30()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue30()|1", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue30()|3", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.STYLES)));
        java.lang.String safeHTML = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue30()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue30()|5", org.owasp.html.PolicyFactory.class, policy).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue30()|6", test)));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue30()|8", test), "\u00a0&gt;", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue30()|9", safeHTML));
    }

    @org.junit.Test
    public static final void testScriptInTable() {
        java.lang.String input = "<table>Hallo\r\n<script>SCRIPT</script>\nEnde\n\r";
        org.owasp.html.PolicyFactory pf = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|10", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|8", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|6", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|4", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|2", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|1", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|3", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.LINKS))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|5", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.STYLES))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|7", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.IMAGES))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|9", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.TABLES)));
        junit.framework.TestCase.assertEquals("<table></table>Hallo\r\n\nEnde\n\r", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testScriptInTable()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testScriptInTable()|11", org.owasp.html.PolicyFactory.class, pf).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testScriptInTable()|12", input))));
    }

    @org.junit.Test
    public static final void testAndOrdering() {
        java.lang.String input = "" + ((("xss<a href=\"http://www.google.de\" style=\"color:red\"" + " onmouseover=alert(1) onmousemove=\"alert(2)\" onclick=alert(3)>") + "g") + "<img src=\"http://example.org\"/>oogle</a>");
        java.lang.String want = "" + ((("xss<a href=\"http://www.google.de\" style=\"color:red\"" + " rel=\"nofollow\">") + "g") + "<img src=\"http://example.org\" />oogle</a>");
        for (java.util.List<org.owasp.html.PolicyFactory> permutation : eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.SanitizersTest.Permutations<org.owasp.html.PolicyFactory>>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|4", org.owasp.html.SanitizersTest.Permutations.class, new org.owasp.html.SanitizersTest.Permutations<org.owasp.html.PolicyFactory>(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|1", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.IMAGES), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|2", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.STYLES), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|3", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.LINKS)))) {
            org.owasp.html.PolicyFactory policyFactory = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|6", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.owasp.html.PolicyFactory>>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|5", java.util.List.class, permutation).get(0));
            for (org.owasp.html.PolicyFactory p : eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.owasp.html.PolicyFactory>>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|10", java.util.List.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.owasp.html.PolicyFactory>>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|7", java.util.List.class, permutation).subList(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndOrdering()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.owasp.html.PolicyFactory>>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|8", java.util.List.class, permutation).size())))) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|13", org.owasp.html.PolicyFactory.class, (policyFactory = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|11", org.owasp.html.PolicyFactory.class, policyFactory).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|12", org.owasp.html.PolicyFactory.class, p))));
            }
            java.lang.String got = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndOrdering()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|14", org.owasp.html.PolicyFactory.class, policyFactory).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndOrdering()|15", input)));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndOrdering()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.owasp.html.PolicyFactory>>observeState("org.owasp.html.SanitizersTest|testAndOrdering()|17", java.util.List.class, permutation).toString()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndOrdering()|19", want), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAndOrdering()|20", got));
        }
    }

    @org.junit.Test
    public static final void testAngularBindingsInSanitizedCode() {
        org.owasp.html.PolicyFactory s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|7", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|6", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|5", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|4", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|3", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|2", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|1", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|0", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowElements("a", "b", "title")).allowAttributes("href")).onElements("a")).allowAttributes("title")).globally()).allowStandardUrlProtocols()).toFactory());
        java.lang.String unsafe = "" + ((((((("<title>\n" + "Prevent Side Effects Due to {{expressions}} in angle brackets\n") + "</title>\n") + "<b>Also in {{regularTextNodes}}</b>\n") + "<b>Text nodes can be {<!-- split -->{Sneaky}}</b>\n") + "<b>Elided {<tags>{CanSplitToo}<span></span>}</b>\n") + "<a href=\'/{{path}}\'>link</a>\n") + "<b title=\'{{title}}\'>tag with title</b>\n");
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|8", org.owasp.html.PolicyFactory.class, s).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|9", unsafe)));
        java.lang.String safe = "" + (((((((("<title>\n" + "Prevent Side Effects Due to") + " {\u200b{expressions}} in angle brackets\n") + "</title>\n") + "<b>Also in {<!-- -->{regularTextNodes}}</b>\n") + "<b>Text nodes can be {<!-- -->{Sneaky}}</b>\n") + "<b>Elided {<!-- -->{CanSplitToo}}</b>\n") + "<a href=\"/%7b%7bpath%7d%7d\">link</a>\n") + "<b title=\"{\u200b{title}}\">tag with title</b>\n");
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|11", safe), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testAngularBindingsInSanitizedCode()|12", sanitized));
    }

    @org.junit.Test
    public static final void testIssue46() {
        org.owasp.html.PolicyFactory s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue46()|3", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue46()|2", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue46()|1", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testIssue46()|0", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowWithoutAttributes("span")).allowElements("span")).toFactory());
        java.lang.String unsafe = "<span onclick=alert(1337)>Foo</span>";
        java.lang.String safe = "<span>Foo</span>";
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue46()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testIssue46()|4", org.owasp.html.PolicyFactory.class, s).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue46()|5", unsafe)));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue46()|7", safe), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testIssue46()|8", sanitized));
    }

    @org.junit.Test
    public static final void testSpacesAroundURLAttributeValues() {
        org.owasp.html.PolicyFactory s = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|5", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|4", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|3", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|2", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|1", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|0", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowStandardUrlProtocols()).allowElements("a")).allowAttributes("href")).onElements("a")).toFactory());
        java.lang.String unsafe = "<a href=\" http://example.com/ foo \t \">text</a>";
        java.lang.String safe = "<a href=\"http://example.com/%20foo\">text</a>";
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|6", org.owasp.html.PolicyFactory.class, s).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|7", unsafe)));
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|9", safe), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testSpacesAroundURLAttributeValues()|10", sanitized));
    }

    @org.junit.Test
    public static final void testStyleTagInTable() {
        java.lang.String input = "" + (((("<table>" + "<style></style>") + "<tr><td>Foo</td></tr>") + "<tr><td>Bar</td></tr>") + "</table>");
        org.owasp.html.PolicyFactory pf = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStyleTagInTable()|4", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStyleTagInTable()|2", org.owasp.html.PolicyFactory.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStyleTagInTable()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.BLOCKS).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStyleTagInTable()|1", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING))).and(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStyleTagInTable()|3", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.TABLES)));
        junit.framework.TestCase.assertEquals(("<table><tbody>" + (("<tr><td>Foo</td></tr>" + "<tr><td>Bar</td></tr>") + "</tbody></table>")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testStyleTagInTable()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.SanitizersTest|testStyleTagInTable()|5", org.owasp.html.PolicyFactory.class, pf).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|testStyleTagInTable()|6", input))));
    }

    static int fac(int n) {
        int ifac = 1;
        for (int i = 1; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|fac(int)|0", i)) <= (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|fac(int)|1", n)); ++i) {
            int ifacp = (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|fac(int)|2", ifac)) * (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|fac(int)|3", i));
            if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|fac(int)|4", ifacp)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|fac(int)|5", ifac))) {
                throw eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.IllegalArgumentException>observeState("org.owasp.html.SanitizersTest|fac(int)|6", java.lang.IllegalArgumentException.class, new java.lang.IllegalArgumentException("undeflow"));
            }
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|fac(int)|7", (ifac = ifacp));
        }
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.SanitizersTest|fac(int)|8", ifac);
    }

    /**
     * An iterable over the length k partial permutations of elements where all
     * elements are assumed distinct.
     */
    private static class Permutations<T> implements java.lang.Iterable<java.util.List<T>> {
        final com.google.common.collect.ImmutableList<T> elements;

        /**
         * Permutation size.
         */
        final int k;

        Permutations(T... elements) {
            this(elements.length, elements);
        }

        Permutations(int k, T... elements) {
            this.k = k;
            this.elements = com.google.common.collect.ImmutableList.copyOf(elements);
        }

        public java.util.Iterator<java.util.List<T>> iterator() {
            return new java.util.Iterator<java.util.List<T>>() {
                private int i;

                private final int limit;

                private final java.util.BitSet mask;

                private java.util.List<T> pending;

                {
                    this.limit = (org.owasp.html.SanitizersTest.fac(elements.size())) / (org.owasp.html.SanitizersTest.fac(((elements.size()) - (k))));
                    this.mask = new java.util.BitSet(k);
                }

                public void remove() {
                    throw new java.lang.UnsupportedOperationException();
                }

                public boolean hasNext() {
                    fill();
                    return (pending) != null;
                }

                public java.util.List<T> next() {
                    fill();
                    java.util.List<T> result = pending;
                    if (result == null) {
                        throw new java.util.NoSuchElementException();
                    }
                    pending = null;
                    return result;
                }

                private void fill() {
                    if (((pending) != null) || ((i) == (limit))) {
                        return;
                    }
                    java.util.List<T> permutation = com.google.common.collect.Lists.newArrayListWithCapacity(k);
                    mask.clear();
                    for (int j = 0, p = i; j < (k); ++j) {
                        int m = (k) - j;// Number of remaining elements.

                        int x = p % m;
                        p /= m;
                        // x is now an index into an els but without any elements indexed by
                        // indices[0:j] so find the x-th unfilled spot.
                        int unfilled = -1;
                        while (true) {
                            unfilled = mask.nextClearBit((unfilled + 1));
                            if (x == 0) {
                                break;
                            }
                            --x;
                        } 
                        mask.set(unfilled);
                        permutation.add(elements.get(unfilled));
                    }
                    pending = permutation;
                    ++(i);
                }
            };
        }
    }
}

