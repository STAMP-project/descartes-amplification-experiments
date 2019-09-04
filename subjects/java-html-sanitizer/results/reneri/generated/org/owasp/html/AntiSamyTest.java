/**
 * Copyright (c) 2007-2010, Arshan Dabirsiaghi, Jason Li
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of OWASP nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.owasp.html;


/**
 * This class tests AntiSamy functionality and the basic policy file which
 * should be immune to XSS and CSS phishing attacks.
 *
 * @author Arshan Dabirsiaghi
 */
@java.lang.SuppressWarnings("javadoc")
public class AntiSamyTest extends junit.framework.TestCase {
    static final boolean RUN_KNOWN_FAILURES = false;

    private static org.owasp.html.HtmlSanitizer.Policy makePolicy(java.lang.Appendable buffer) {
        final org.owasp.html.HtmlStreamRenderer renderer = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|9", org.owasp.html.HtmlStreamRenderer.class, org.owasp.html.HtmlStreamRenderer.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Appendable>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|0", java.lang.Appendable.class, buffer), new org.owasp.html.Handler<java.io.IOException>() {
            public void handle(java.io.IOException ex) {
                junit.framework.AssertionFailedError failure = eu.stamp_project.reneri.instrumentation.StateObserver.<junit.framework.AssertionFailedError>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|2", junit.framework.AssertionFailedError.class, new junit.framework.AssertionFailedError());
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|5", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<junit.framework.AssertionFailedError>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|3", junit.framework.AssertionFailedError.class, failure).initCause(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.IOException>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|4", java.io.IOException.class, ex)));
                throw eu.stamp_project.reneri.instrumentation.StateObserver.<junit.framework.AssertionFailedError>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|6", junit.framework.AssertionFailedError.class, failure);
            }
        }, new org.owasp.html.Handler<java.lang.String>() {
            public void handle(java.lang.String errorMessage) {
                junit.framework.TestCase.fail(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|8", errorMessage));
            }
        }));
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|34", org.owasp.html.HtmlSanitizer.Policy.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|32", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|31", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|30", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|29", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|28", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|22", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|21", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|20", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|19", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|18", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|17", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|16", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|15", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|14", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|13", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder.AttributeBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|12", org.owasp.html.HtmlPolicyBuilder.AttributeBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|11", org.owasp.html.HtmlPolicyBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlPolicyBuilder>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|10", org.owasp.html.HtmlPolicyBuilder.class, new org.owasp.html.HtmlPolicyBuilder()).allowElements("a", "b", "br", "div", "font", "i", "img", "input", "li", "ol", "p", "span", "td", "ul")).allowAttributes("checked", "type")).onElements("input")).allowAttributes("color")).onElements("font")).allowAttributes("href")).onElements("a")).allowAttributes("src")).onElements("img")).allowAttributes("class", "id", "title")).globally()).allowAttributes("char")).matching(new org.owasp.html.AttributePolicy() {
            public java.lang.String apply(java.lang.String elementName, java.lang.String attributeName, java.lang.String value) {
                return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|27", ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|25", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|24", value).length())) == 1 ? eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|26", value) : null));
            }
        })).onElements("td")).allowStandardUrlProtocols()).requireRelNofollowOnLinks()).allowStyling()).build(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.AntiSamyTest|makePolicy(java.lang.Appendable)|33", org.owasp.html.HtmlStreamRenderer.class, renderer)));
    }

    static java.lang.String sanitize(java.lang.String html) {
        java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.AntiSamyTest|sanitize(java.lang.String)|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.HtmlSanitizer.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|sanitize(java.lang.String)|1", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.AntiSamyTest|sanitize(java.lang.String)|3", org.owasp.html.HtmlSanitizer.Policy.class, org.owasp.html.AntiSamyTest.makePolicy(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.AntiSamyTest|sanitize(java.lang.String)|2", java.lang.StringBuilder.class, sb))));
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|sanitize(java.lang.String)|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.AntiSamyTest|sanitize(java.lang.String)|4", java.lang.StringBuilder.class, sb).toString());
    }

    private static final java.lang.String[] BASE64_BAD_XML_STRINGS = new java.lang.String[]{ // first string is
    // "<a - href=\"http://www.owasp.org\">click here</a>"
    "PGEgLSBocmVmPSJodHRwOi8vd3d3Lm93YXNwLm9yZyI+Y2xpY2sgaGVyZTwvYT4=", // the rest are randomly generated 300 byte sequences which generate
    // parser errors, turned into Strings
    "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" };

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
    }

    @java.lang.Override
    protected void tearDown() throws java.lang.Exception {
        super.tearDown();
    }

    public static junit.framework.Test suite() {
        junit.framework.TestSuite suite = eu.stamp_project.reneri.instrumentation.StateObserver.<junit.framework.TestSuite>observeState("org.owasp.html.AntiSamyTest|suite()|0", junit.framework.TestSuite.class, new junit.framework.TestSuite(org.owasp.html.AntiSamyTest.class));
        return eu.stamp_project.reneri.instrumentation.StateObserver.<junit.framework.TestSuite>observeState("org.owasp.html.AntiSamyTest|suite()|1", junit.framework.TestSuite.class, suite);
    }

    /* Test basic XSS cases. */
    public static void testScriptAttacks() {
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("test<script>alert(document.cookie)</script>", "script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("test<script>alert(document.cookie)</script>", "script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<<<><<script src=http://fake-evil.ru/test.js>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<<<><<script src=http://fake-evil.ru/test.js>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<script<script src=http://fake-evil.ru/test.js>>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<script<script src=http://fake-evil.ru/test.js>>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT/XSS SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT/XSS SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BODY onload!#$%&()*~+-_.,:;?@[/|\\]^`=alert(\"XSS\")>", "onload");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BODY onload!#$%&()*~+-_.,:;?@[/|\\]^`=alert(\"XSS\")>", "onload");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BODY ONLOAD=alert('XSS')>", "alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BODY ONLOAD=alert('XSS')>", "alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<iframe src=http://ha.ckers.org/scriptlet.html <", "<iframe");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<iframe src=http://ha.ckers.org/scriptlet.html <", "<iframe");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<INPUT TYPE=\"IMAGE\" SRC=\"javascript:alert(\'XSS\');\">", "src");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<INPUT TYPE=\"IMAGE\" SRC=\"javascript:alert(\'XSS\');\">", "src");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<a onblur=\"alert(secret)\" href=\"http://www.google.com\">Google</a>", "alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<a onblur=\"alert(secret)\" href=\"http://www.google.com\">Google</a>", "alert");
    }

    public static void testImgAttacks() {
        org.owasp.html.AntiSamyTest.assertSanitizedDoesContain("<img src=\"http://www.myspace.com/img.gif\"/>", "<img");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesContain("<img src=\"http://www.myspace.com/img.gif\"/>", "<img");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<img src=javascript:alert(document.cookie)>", "<img");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC=&#106;&#97;&#118;&#97;&#115;&#99;&#114;&#105;&#112;&#116;&#58;&#97;&#108;&#101;&#114;&#116;&#40;&#39;&#88;&#83;&#83;&#39;&#41;>", "<img");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC=&#106;&#97;&#118;&#97;&#115;&#99;&#114;&#105;&#112;&#116;&#58;&#97;&#108;&#101;&#114;&#116;&#40;&#39;&#88;&#83;&#83;&#39;&#41;>", "<img");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC='&#0000106&#0000097&#0000118&#0000097&#0000115&#0000099&#0000114&#0000105&#0000112&#0000116&#0000058&#0000097&#0000108&#0000101&#0000114&#0000116&#0000040&#0000039&#0000088&#0000083&#0000083&#0000039&#0000041'>", "src");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC='&#0000106&#0000097&#0000118&#0000097&#0000115&#0000099&#0000114&#0000105&#0000112&#0000116&#0000058&#0000097&#0000108&#0000101&#0000114&#0000116&#0000040&#0000039&#0000088&#0000083&#0000083&#0000039&#0000041'>", "src");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC=\"jav&#x0D;ascript:alert(\'XSS\');\">", "alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC=\"jav&#x0D;ascript:alert(\'XSS\');\">", "alert");
        java.lang.String s = "<IMG SRC=&#0000106&#0000097&#0000118&#0000097&#0000115&#0000099&#0000114&#0000105&#0000112&#0000116&#0000058&#0000097&#0000108&#0000101&#0000114&#0000116&#0000040&#0000039&#0000088&#0000083&#0000083&#0000039&#0000041>";
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|2", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|1", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|0", s))).length())) != 0) {
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|3", s), "&amp;");
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|4", (s = "<IMG SRC=&#0000106&#0000097&#0000118&#0000097&#0000115&#0000099&#0000114&#0000105&#0000112&#0000116&#0000058&#0000097&#0000108&#0000101&#0000114&#0000116&#0000040&#0000039&#0000088&#0000083&#0000083&#0000039&#0000041>"));
        if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|7", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|6", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|5", s))).length())) != 0) {
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|8", s), "&amp;");
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|9", org.owasp.html.AntiSamyTest.sanitize("<IMG SRC=&#x6A&#x61&#x76&#x61&#x73&#x63&#x72&#x69&#x70&#x74&#x3A&#x61&#x6C&#x65&#x72&#x74&#x28&#x27&#x58&#x53&#x53&#x27&#x29>"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testImgAttacks()|10", org.owasp.html.AntiSamyTest.sanitize("<IMG SRC=&#x6A&#x61&#x76&#x61&#x73&#x63&#x72&#x69&#x70&#x74&#x3A&#x61&#x6C&#x65&#x72&#x74&#x28&#x27&#x58&#x53&#x53&#x27&#x29>"));
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC=\"javascript:alert(\'XSS\')\"", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC=\"javascript:alert(\'XSS\')\"", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG LOWSRC=\"javascript:alert(\'XSS\')\">", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG LOWSRC=\"javascript:alert(\'XSS\')\">", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BGSOUND SRC=\"javascript:alert(\'XSS\');\">", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BGSOUND SRC=\"javascript:alert(\'XSS\');\">", "javascript");
    }

    public static void testHrefAttacks() {
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<LINK REL=\"stylesheet\" HREF=\"javascript:alert(\'XSS\');\">", "href");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<LINK REL=\"stylesheet\" HREF=\"javascript:alert(\'XSS\');\">", "href");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<LINK REL=\"stylesheet\" HREF=\"http://ha.ckers.org/xss.css\">", "href");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<LINK REL=\"stylesheet\" HREF=\"http://ha.ckers.org/xss.css\">", "href");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<STYLE>@import'http://ha.ckers.org/xss.css';</STYLE>", "ha.ckers.org");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<STYLE>@import'http://ha.ckers.org/xss.css';</STYLE>", "ha.ckers.org");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<STYLE>BODY{-moz-binding:url(\"http://ha.ckers.org/xssmoz.xml#xss\")}</STYLE>", "ha.ckers.org");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<STYLE>BODY{-moz-binding:url(\"http://ha.ckers.org/xssmoz.xml#xss\")}</STYLE>", "ha.ckers.org");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<STYLE>li {list-style-image: url(\"javascript:alert(\'XSS\')\");}</STYLE><UL><LI>XSS", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<STYLE>li {list-style-image: url(\"javascript:alert(\'XSS\')\");}</STYLE><UL><LI>XSS", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC=\'vbscript:msgbox(\"XSS\")\'>", "vbscript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG SRC=\'vbscript:msgbox(\"XSS\")\'>", "vbscript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<META HTTP-EQUIV=\"refresh\" CONTENT=\"0; URL=http://;URL=javascript:alert(\'XSS\');\">", "<meta");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<META HTTP-EQUIV=\"refresh\" CONTENT=\"0; URL=http://;URL=javascript:alert(\'XSS\');\">", "<meta");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<META HTTP-EQUIV=\"refresh\" CONTENT=\"0;url=javascript:alert(\'XSS\');\">", "<meta");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<META HTTP-EQUIV=\"refresh\" CONTENT=\"0;url=javascript:alert(\'XSS\');\">", "<meta");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<META HTTP-EQUIV=\"refresh\" CONTENT=\"0;url=data:text/html;base64,PHNjcmlwdD5hbGVydCgnWFNTJyk8L3NjcmlwdD4K\">", "<meta");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<META HTTP-EQUIV=\"refresh\" CONTENT=\"0;url=data:text/html;base64,PHNjcmlwdD5hbGVydCgnWFNTJyk8L3NjcmlwdD4K\">", "<meta");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IFRAME SRC=\"javascript:alert(\'XSS\');\"></IFRAME>", "iframe");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IFRAME SRC=\"javascript:alert(\'XSS\');\"></IFRAME>", "iframe");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<FRAMESET><FRAME SRC=\"javascript:alert(\'XSS\');\"></FRAMESET>", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<FRAMESET><FRAME SRC=\"javascript:alert(\'XSS\');\"></FRAMESET>", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<TABLE BACKGROUND=\"javascript:alert(\'XSS\')\">", "background");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<TABLE BACKGROUND=\"javascript:alert(\'XSS\')\">", "background");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<TABLE><TD BACKGROUND=\"javascript:alert(\'XSS\')\">", "background");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<TABLE><TD BACKGROUND=\"javascript:alert(\'XSS\')\">", "background");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<DIV STYLE=\"background-image: url(javascript:alert(\'XSS\'))\">", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<DIV STYLE=\"background-image: url(javascript:alert(\'XSS\'))\">", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<DIV STYLE=\"width: expression(alert(\'XSS\'));\">", "alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<DIV STYLE=\"width: expression(alert(\'XSS\'));\">", "alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG STYLE=\"xss:expr/*XSS*/ession(alert(\'XSS\'))\">", "alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<IMG STYLE=\"xss:expr/*XSS*/ession(alert(\'XSS\'))\">", "alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<STYLE>@im\\port\'\\ja\\vasc\\ript:alert(\"XSS\")\';</STYLE>", "ript:alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<STYLE>@im\\port\'\\ja\\vasc\\ript:alert(\"XSS\")\';</STYLE>", "ript:alert");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BASE HREF=\"javascript:alert(\'XSS\');//\">", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BASE HREF=\"javascript:alert(\'XSS\');//\">", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BaSe hReF=\"http://arbitrary.com/\">", "<base");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<BaSe hReF=\"http://arbitrary.com/\">", "<base");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<OBJECT TYPE=\"text/x-scriptlet\" DATA=\"http://ha.ckers.org/scriptlet.html\"></OBJECT>", "<object");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<OBJECT TYPE=\"text/x-scriptlet\" DATA=\"http://ha.ckers.org/scriptlet.html\"></OBJECT>", "<object");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<OBJECT classid=clsid:ae24fdae-03c6-11d1-8b76-0080c744f389><param name=url value=javascript:alert('XSS')></OBJECT>", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<OBJECT classid=clsid:ae24fdae-03c6-11d1-8b76-0080c744f389><param name=url value=javascript:alert('XSS')></OBJECT>", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<EMBED SRC=\"http://ha.ckers.org/xss.swf\" AllowScriptAccess=\"always\"></EMBED>", "<embed");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<EMBED SRC=\"http://ha.ckers.org/xss.swf\" AllowScriptAccess=\"always\"></EMBED>", "<embed");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<EMBED SRC=\"data:image/svg+xml;base64,PHN2ZyB4bWxuczpzdmc9Imh0dH A6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcv MjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hs aW5rIiB2ZXJzaW9uPSIxLjAiIHg9IjAiIHk9IjAiIHdpZHRoPSIxOTQiIGhlaWdodD0iMjAw IiBpZD0ieHNzIj48c2NyaXB0IHR5cGU9InRleHQvZWNtYXNjcmlwdCI+YWxlcnQoIlh TUyIpOzwvc2NyaXB0Pjwvc3ZnPg==\" type=\"image/svg+xml\" AllowScriptAccess=\"always\"></EMBED>", "<embed");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<EMBED SRC=\"data:image/svg+xml;base64,PHN2ZyB4bWxuczpzdmc9Imh0dH A6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcv MjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hs aW5rIiB2ZXJzaW9uPSIxLjAiIHg9IjAiIHk9IjAiIHdpZHRoPSIxOTQiIGhlaWdodD0iMjAw IiBpZD0ieHNzIj48c2NyaXB0IHR5cGU9InRleHQvZWNtYXNjcmlwdCI+YWxlcnQoIlh TUyIpOzwvc2NyaXB0Pjwvc3ZnPg==\" type=\"image/svg+xml\" AllowScriptAccess=\"always\"></EMBED>", "<embed");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT a=\">\" SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT a=\">\" SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT a=\">\" \'\' SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT a=\">\" \'\' SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT a=`>` SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT a=`>` SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT a=\">\'>\" SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT a=\">\'>\" SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT>document.write(\"<SCRI\");</SCRIPT>PT SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT>document.write(\"<SCRI\");</SCRIPT>PT SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>", "script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT SRC=http://ha.ckers.org/xss.js", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<SCRIPT SRC=http://ha.ckers.org/xss.js", "<script");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<div/style=&#92&#45&#92&#109&#111&#92&#122&#92&#45&#98&#92&#105&#92&#110&#100&#92&#105&#110&#92&#103:&#92&#117&#114&#108&#40&#47&#47&#98&#117&#115&#105&#110&#101&#115&#115&#92&#105&#92&#110&#102&#111&#46&#99&#111&#46&#117&#107&#92&#47&#108&#97&#98&#115&#92&#47&#120&#98&#108&#92&#47&#120&#98&#108&#92&#46&#120&#109&#108&#92&#35&#120&#115&#115&#41&>", "style");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<div/style=&#92&#45&#92&#109&#111&#92&#122&#92&#45&#98&#92&#105&#92&#110&#100&#92&#105&#110&#92&#103:&#92&#117&#114&#108&#40&#47&#47&#98&#117&#115&#105&#110&#101&#115&#115&#92&#105&#92&#110&#102&#111&#46&#99&#111&#46&#117&#107&#92&#47&#108&#97&#98&#115&#92&#47&#120&#98&#108&#92&#47&#120&#98&#108&#92&#46&#120&#109&#108&#92&#35&#120&#115&#115&#41&>", "style");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<a href=\'aim: &c:\\windows\\system32\\calc.exe\' ini=\'C:\\Documents and Settings\\All Users\\Start Menu\\Programs\\Startup\\pwnd.bat\'>", "aim.exe");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<a href=\'aim: &c:\\windows\\system32\\calc.exe\' ini=\'C:\\Documents and Settings\\All Users\\Start Menu\\Programs\\Startup\\pwnd.bat\'>", "aim.exe");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<!--\n<A href=\n- --><a href=javascript:alert:document.domain>test-->", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<!--\n<A href=\n- --><a href=javascript:alert:document.domain>test-->", "javascript");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<a></a style=\"\"xx:expr/**/ession(document.appendChild(document.createElement(\'script\')).src=\'http://h4k.in/i.js\')\">", "document");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<a></a style=\"\"xx:expr/**/ession(document.appendChild(document.createElement(\'script\')).src=\'http://h4k.in/i.js\')\">", "document");
    }

    /* Test CSS protections. */
    public static void testCssAttacks() {
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<div style=\"position:absolute\">", "position");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<div style=\"position:absolute\">", "position");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<style>b { position:absolute }</style>", "position");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<style>b { position:absolute }</style>", "position");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<div style=\"z-index:25\">test</div>", "z-index");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<div style=\"z-index:25\">test</div>", "z-index");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<style>z-index:25</style>", "z-index");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<style>z-index:25</style>", "z-index");
    }

    /* Test a bunch of strings that have tweaked the XML parsing capabilities of
    NekoHTML.
     */
    public static void testIllegalXML() throws java.lang.Exception {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|0", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.AntiSamyTest|testIllegalXML()|1", java.lang.String[].class, org.owasp.html.AntiSamyTest.BASE64_BAD_XML_STRINGS).length)); i++) {
            java.lang.String testStr = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|7", new java.lang.String(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.owasp.html.AntiSamyTest|testIllegalXML()|6", byte[].class, org.apache.commons.codec.binary.Base64.decodeBase64(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.AntiSamyTest|testIllegalXML()|3", java.lang.String[].class, org.owasp.html.AntiSamyTest.BASE64_BAD_XML_STRINGS)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|4", i)]))), "UTF-8"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|9", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|8", testStr)));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|11", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|10", testStr)));
        }
        // These fail in AntiSamy due to a bug in NekoHTML
        junit.framework.TestCase.assertEquals("<a href=\"http://www.test.com\" rel=\"nofollow\"></a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|12", org.owasp.html.AntiSamyTest.sanitize("<a . href=\"http://www.test.com\">")));
        junit.framework.TestCase.assertEquals("<a href=\"http://www.test.com\" rel=\"nofollow\"></a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|13", org.owasp.html.AntiSamyTest.sanitize("<a - href=\"http://www.test.com\">")));
        junit.framework.TestCase.assertTrue(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testIllegalXML()|14", org.owasp.html.AntiSamyTest.sanitize("<style>"))) != null));
    }

    public static void testPreviousBugs() {
        /* issues 12 (and 36, which was similar). empty tags cause display
        problems/"formjacking"
         */
        {
            java.util.regex.Pattern p = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|0", java.util.regex.Pattern.class, java.util.regex.Pattern.compile(".*<strong(\\s*)/>.*", java.util.regex.Pattern.DOTALL));
            java.lang.String s1 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|1", org.owasp.html.AntiSamyTest.sanitize("<br ><strong></strong><a>hello world</a><b /><i/><hr>"));
            java.lang.String s2 = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|2", org.owasp.html.AntiSamyTest.sanitize("<br ><strong></strong><a>hello world</a><b /><i/><hr>"));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Matcher>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|5", java.util.regex.Matcher.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|3", java.util.regex.Pattern.class, p).matcher(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|4", s1))).matches()));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|7", java.util.regex.Pattern.class, (p = java.util.regex.Pattern.compile(".*<b(\\s*)/>.*")));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Matcher>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|10", java.util.regex.Matcher.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|8", java.util.regex.Pattern.class, p).matcher(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|9", s1))).matches()));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Matcher>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|14", java.util.regex.Matcher.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|12", java.util.regex.Pattern.class, p).matcher(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|13", s2))).matches()));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|16", java.util.regex.Pattern.class, (p = java.util.regex.Pattern.compile(".*<i(\\s*)/>.*")));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Matcher>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|19", java.util.regex.Matcher.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|17", java.util.regex.Pattern.class, p).matcher(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|18", s1))).matches()));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|24", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Matcher>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|23", java.util.regex.Matcher.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|21", java.util.regex.Pattern.class, p).matcher(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|22", s2))).matches()));
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|25", java.util.regex.Pattern.class, (p = java.util.regex.Pattern.compile(".*<hr(\\s*)/>.*")));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|29", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Matcher>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|28", java.util.regex.Matcher.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|26", java.util.regex.Pattern.class, p).matcher(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|27", s1))).matches()));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|33", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Matcher>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|32", java.util.regex.Matcher.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|30", java.util.regex.Pattern.class, p).matcher(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|31", s2))).matches()));
        }
        /* issue #20 */
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<b><i>Some Text</b></i>", "<i />");
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<b><i>Some Text</b></i>", "<i />");
        /* issue #25 */
        junit.framework.TestCase.assertEquals("<div>Test</div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|34", org.owasp.html.AntiSamyTest.sanitize("<div style=\"margin: -5em\">Test</div>")));
        /* issue #28 */
        org.owasp.html.AntiSamyTest.assertSanitizedDoesContain("<div style=\"font-family: Geneva, Arial, courier new, sans-serif\">Test</div>", "font-family:&#39;geneva&#39; , &#39;arial&#39; , &#39;courier new&#39; , sans-serif");
        /* issue #29 - missing quotes around properties with spaces */
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            java.lang.String s = "<style type=\"text/css\"><![CDATA[P {\n     font-family: \"Arial Unicode MS\";\n}\n]]></style>";
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|35", s), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|37", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|36", s))));
        }
        /* issue #30 */
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            java.lang.String s = "<style type=\"text/css\"><![CDATA[P { margin-bottom: 0.08in; } ]]></style>";
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|39", (s = org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|38", s))));
            // followup - does the patch fix multiline CSS?
            java.lang.String s2 = "<style type=\"text/css\"><![CDATA[\r\nP {\r\n margin-bottom: 0.08in;\r\n}\r\n]]></style>";
            junit.framework.TestCase.assertEquals("<style type=\"text/css\"><![CDATA[P {\n\tmargin-bottom: 0.08in;\n}\n]]></style>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|41", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|40", s2))));
            // next followup - does non-CDATA parsing still work?
            java.lang.String s3 = "<style>P {\n\tmargin-bottom: 0.08in;\n}\n";
            junit.framework.TestCase.assertEquals("<style>P {\n\tmargin-bottom: 0.08in;\n}\n</style>\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|43", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|42", s3))));
            // for other
            // tests
        }
        /* issue #32 - nekos problem */
        {
            java.lang.String s = "<SCRIPT =\">\" SRC=\"\"></SCRIPT>";
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|45", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|44", s)));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|47", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|46", s)));
        }
        /* issue #37 - OOM */
        {
            java.lang.String dirty = "<a onblur=\"try {parent.deselectBloggerImageGracefully();}" + (((((((((((("catch(e) {}\"" + "href=\"http://www.charityadvantage.com/ChildrensmuseumEaston/images/BookswithBill.jpg\"><img") + "style=\"FLOAT: right; MARGIN: 0px 0px 10px 10px; WIDTH: 150px; CURSOR:") + "hand; HEIGHT: 100px\" alt=\"\"") + "src=\"http://www.charityadvantage.com/ChildrensmuseumEaston/images/BookswithBill.jpg\"") + "border=\"0\" /></a><br />Poor Bill, couldn\'t make it to the Museum\'s <span") + "class=\"blsp-spelling-corrected\" id=\"SPELLING_ERROR_0\">story time</span>") + "today, he was so busy shoveling! Well, we sure missed you Bill! So since") + "ou were busy moving snow we read books about snow. We found a clue in one") + "book which revealed a snowplow at the end of the story - we wish it had") + "driven to your driveway Bill. We also read a story which shared fourteen") + "<em>Names For Snow. </em>We'll catch up with you next week....wonder which") + "hat Bill will wear?<br />Jane");
            java.lang.String s = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|49", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|48", dirty)));
            junit.framework.TestCase.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|50", s));
        }
        /* issue #38 - color problem/color combinations */
        {
            java.lang.String s = "<font color=\"#fff\">Test</font>";
            java.lang.String expected = "<font color=\"#fff\">Test</font>";
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|51", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|53", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|52", s))));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|54", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|56", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|55", s))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|57", (s = "<div style=\"color: #fff\">Test 3 letter code</div>"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|58", (expected = "<div style=\"color:#fff\">Test 3 letter code</div>"));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|59", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|61", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|60", s))));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|62", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|64", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|63", s))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|65", (s = "<font color=\"red\">Test</font>"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|66", (expected = "<font color=\"red\">Test</font>"));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|67", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|69", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|68", s))));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|70", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|72", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|71", s))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|73", (s = "<font color=\"neonpink\">Test</font>"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|74", (expected = s));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|75", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|77", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|76", s))));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|78", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|80", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|79", s))));
            if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|81", (s = "<font color=\"#0000\">Test</font>"));
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|82", (expected = "<font>Test</font>"));
                junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|83", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|85", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|84", s))));
                junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|86", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|88", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|87", s))));
            }
            if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|89", (s = "<div style=\"color: #0000\">Test</div>"));
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|90", (expected = "<div>Test</div>"));
                junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|91", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|93", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|92", s))));
                junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|94", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|96", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|95", s))));
            }
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|97", (s = "<font color=\"#000000\">Test</font>"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|98", (expected = "<font color=\"#000000\">Test</font>"));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|99", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|101", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|100", s))));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|102", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|104", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|103", s))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|105", (s = "<div style=\"color: #000000\">Test</div>"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|106", (expected = "<div style=\"color:#000000\">Test</div>"));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|107", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|109", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|108", s))));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|110", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|112", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|111", s))));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|113", (s = "<b><u>foo<style><script>alert(1)</script></style>@import 'x';</u>bar"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|115", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|114", s)));
        }
        /* issue #40 - handling <style> media attributes right */
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain("<style media=\"print, projection, screen\"> P { margin: 1em; }</style>", "print, projection, screen");
        }
        /* issue #41 - comment handling */
        {
            junit.framework.TestCase.assertEquals("text ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|116", org.owasp.html.AntiSamyTest.sanitize("text <!-- comment -->")));
            junit.framework.TestCase.assertEquals("text ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|117", org.owasp.html.AntiSamyTest.sanitize("text <!-- comment -->")));
            junit.framework.TestCase.assertEquals("<div>text </div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|118", org.owasp.html.AntiSamyTest.sanitize("<div>text <!-- comment --></div>")));
            junit.framework.TestCase.assertEquals("<div>text </div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|119", org.owasp.html.AntiSamyTest.sanitize("<div>text <!-- comment --></div>")));
            junit.framework.TestCase.assertEquals("<div>text </div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|120", org.owasp.html.AntiSamyTest.sanitize("<div>text <!--[if IE]> comment <[endif]--></div>")));
            junit.framework.TestCase.assertEquals("<div>text </div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|121", org.owasp.html.AntiSamyTest.sanitize("<div>text <!--[if IE]> comment <[endif]--></div>")));
            /* Check to see how nested conditional comments are handled. This is
            not very clean but the main goal is to avoid any tags. Not sure
            on encodings allowed in comments.
             */
            java.lang.String input = "<div>text <!--[if IE]> <!--[if gte 6]> comment <[endif]--><[endif]--></div>";
            java.lang.String expected = "<div>text &lt;[endif]--&gt;</div>";
            java.lang.String output = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|123", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|122", input)));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|124", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|125", output));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|126", (input = "<div>text <!--[if IE]> <!--[if gte 6]> comment <[endif]--><[endif]--></div>"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|127", (expected = "<div>text &lt;[endif]--&gt;</div>"));
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|129", (output = org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|128", input))));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|130", expected), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|131", output));
            /* Regular comment nested inside conditional comment. Test makes
            sure
             */
            junit.framework.TestCase.assertEquals("<div>text  comment &lt;[endif]--&gt;</div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|132", org.owasp.html.AntiSamyTest.sanitize("<div>text <!--[if IE]> <!-- IE specific --> comment <[endif]--></div>")));
            /* These play with whitespace and have invalid comment syntax. */
            junit.framework.TestCase.assertEquals("<div>text </div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|133", org.owasp.html.AntiSamyTest.sanitize("<div>text <!-- [ if lte 6 ]>\ncomment <[ endif\n]--></div>")));
            junit.framework.TestCase.assertEquals("<div>text  comment </div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|134", org.owasp.html.AntiSamyTest.sanitize("<div>text <![if !IE]> comment <![endif]></div>")));
            junit.framework.TestCase.assertEquals("<div>text  comment </div>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|135", org.owasp.html.AntiSamyTest.sanitize("<div>text <![ if !IE]> comment <![endif]></div>")));
            java.lang.String attack = "[if lte 8]<script>";
            java.lang.String spacer = "<![if IE]>";
            java.lang.StringBuffer sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|136", java.lang.StringBuffer.class, new java.lang.StringBuffer());
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|138", java.lang.StringBuffer.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|137", java.lang.StringBuffer.class, sb).append("<div>text<!"));
            for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|139", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|141", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|140", attack).length())); i++) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|146", java.lang.StringBuffer.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|142", java.lang.StringBuffer.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|145", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|143", attack).charAt(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|144", i)))));
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|149", java.lang.StringBuffer.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|147", java.lang.StringBuffer.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|148", spacer)));
            }
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|151", java.lang.StringBuffer.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|150", java.lang.StringBuffer.class, sb).append("<![endif]>"));
            java.lang.String s = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|153", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuffer>observeState("org.owasp.html.AntiSamyTest|testPreviousBugs()|152", java.lang.StringBuffer.class, sb).toString());
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|154", s), "<script");
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|155", s), "<script");
        }
        /* issue #44 - childless nodes of non-allowed elements won't cause an error */
        {
            java.lang.String s = "<iframe src='http://foo.com/'></iframe>" + ("<script src=''></script>" + "<link href='/foo.css'>");
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|156", s), "", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|158", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|157", s))));
        }
        /* issue #51 - offsite urls with () are found to be invalid */
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("<a href='http://subdomain.domain/(S(ke0lpq54bw0fvp53a10e1a45))/MyPage.aspx'>test</a>", "(");
        /* issue #56 - unnecessary spaces */
        {
            java.lang.String s = "<SPAN style='font-weight: bold;'>Hello World!</SPAN>";
            junit.framework.TestCase.assertEquals("<span style=\"font-weight:bold\">Hello World!</span>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|160", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|159", s))));
        }
        /* issue #58 - input not in list of allowed-to-be-empty tags */
        {
            java.lang.String s = "tgdan <input/> g  h";
            junit.framework.TestCase.assertEquals("tgdan  g  h", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|162", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|161", s))));
        }
        /* issue #61 - input has newline appended if ends with an accepted tag */
        {
            java.lang.String dirtyInput = "blah <b>blah</b>.";
            java.lang.String s = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|164", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|163", dirtyInput)));
            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|165", dirtyInput), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|166", s));
        }
        /* issue #69 - char attribute should allow single char or entity ref */
        {
            java.lang.String s = "<td char='.'>test</td>";
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|167", s), "char");
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|168", s), "char");
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|169", (s = "<td char='..'>test</td>"));
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|170", s), "char");
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|171", s), "char");
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|172", (s = "<td char='&quot;'>test</td>"));
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|173", s), "char");
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|174", s), "char");
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|175", (s = "<td char='&quot;a'>test</td>"));
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|176", s), "char");
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|177", s), "char");
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|178", (s = "<td char='&quot;&amp;'>test</td>"));
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|179", s), "char");
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|180", s), "char");
        }
        /* privately disclosed issue - cdata bypass */
        {
            java.lang.String malInput = "<![CDATA[]><script>alert(1)</script>]]>";
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|181", malInput), "<script");
        }
        /* this test is for confirming literal-lists work as
        advertised. it turned out to be an invalid / non-
        reproducible bug report but the test seemed useful
        enough to keep.
         */
        {
            java.lang.String malInput = "hello<p align='invalid'>world</p>";
            org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|182", malInput), "invalid");
            java.lang.String goodInput = "hello<p align='left'>world</p>";
            if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
                org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testPreviousBugs()|183", goodInput), "left");
            }
        }
    }

    /* Tests cases dealing with nofollowAnchors directive. Assumes anchor tags
    have an action set to "validate" (may be implicit) in the policy file.
     */
    public static void testNofollowAnchors() {
        // adds when not present
        org.owasp.html.AntiSamyTest.assertSanitized("<a href=\"blah\">link</a>", "<a href=\"blah\" rel=\"nofollow\">link</a>");
        // adds properly even with bad attr
        org.owasp.html.AntiSamyTest.assertSanitized("<a href=\"blah\" bad=\"true\">link</a>", "<a href=\"blah\" rel=\"nofollow\">link</a>");
        // rel with bad value gets corrected
        org.owasp.html.AntiSamyTest.assertSanitized("<a href=\"blah\" rel=\"blh\">link</a>", "<a href=\"blah\" rel=\"nofollow\">link</a>");
        // correct attribute doesnt get messed with
        org.owasp.html.AntiSamyTest.assertSanitized("<a href=\"blah\" rel=\"nofollow\">link</a>", "<a href=\"blah\" rel=\"nofollow\">link</a>");
        // if two correct attributes, only one remaining after scan
        org.owasp.html.AntiSamyTest.assertSanitized("<a href=\"blah\" rel=\"nofollow\" rel=\"nofollow\">link</a>", "<a href=\"blah\" rel=\"nofollow\">link</a>");
        // test if value is off - does it add?
        org.owasp.html.AntiSamyTest.assertSanitizedDoesNotContain("a href=\"blah\">link</a>", "nofollow");
    }

    public static void testValidateParamAsEmbed() {
        // let's start with a YouTube embed
        java.lang.String input = "<object width=\"560\" height=\"340\"><param name=\"movie\" value=\"http://www.youtube.com/v/IyAyd4WnvhU&hl=en&fs=1&\"></param><param name=\"allowFullScreen\" value=\"true\"></param><param name=\"allowscriptaccess\" value=\"always\"></param><embed src=\"http://www.youtube.com/v/IyAyd4WnvhU&hl=en&fs=1&\" type=\"application/x-shockwave-flash\" allowscriptaccess=\"always\" allowfullscreen=\"true\" width=\"560\" height=\"340\"></embed></object>";
        java.lang.String expectedOutput = "<object height=\"340\" width=\"560\"><param name=\"movie\" value=\"http://www.youtube.com/v/IyAyd4WnvhU&amp;hl=en&amp;fs=1&amp;\" /><param name=\"allowFullScreen\" value=\"true\" /><param name=\"allowscriptaccess\" value=\"always\" /><embed allowfullscreen=\"true\" allowscriptaccess=\"always\" height=\"340\" src=\"http://www.youtube.com/v/IyAyd4WnvhU&amp;hl=en&amp;fs=1&amp;\" type=\"application/x-shockwave-flash\" width=\"560\" /></object>";
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|0", input), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|1", expectedOutput));
        }else {
            org.owasp.html.AntiSamyTest.assertSanitized(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|2", input), "");
        }
        java.lang.String saxExpectedOutput = "<object width=\"560\" height=\"340\"><param name=\"movie\" value=\"http://www.youtube.com/v/IyAyd4WnvhU&amp;hl=en&amp;fs=1&amp;\"><param name=\"allowFullScreen\" value=\"true\"><param name=\"allowscriptaccess\" value=\"always\"><embed src=\"http://www.youtube.com/v/IyAyd4WnvhU&amp;hl=en&amp;fs=1&amp;\" type=\"application/x-shockwave-flash\" allowscriptaccess=\"always\" allowfullscreen=\"true\" width=\"560\" height=\"340\"></embed></object>";
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|3", input), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|4", saxExpectedOutput));
        }else {
            org.owasp.html.AntiSamyTest.assertSanitized(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|5", input), "");
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|6", // now what if someone sticks malicious URL in the value of the
        // value attribute in the param tag? remove that param tag
        (input = "<object width=\"560\" height=\"340\"><param name=\"movie\" value=\"http://supermaliciouscode.com/badstuff.swf\"></param><param name=\"allowFullScreen\" value=\"true\"></param><param name=\"allowscriptaccess\" value=\"always\"></param><embed src=\"http://www.youtube.com/v/IyAyd4WnvhU&hl=en&fs=1&\" type=\"application/x-shockwave-flash\" allowscriptaccess=\"always\" allowfullscreen=\"true\" width=\"560\" height=\"340\"></embed></object>"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|7", (expectedOutput = "<object height=\"340\" width=\"560\"><param name=\"allowFullScreen\" value=\"true\" /><param name=\"allowscriptaccess\" value=\"always\" /><embed allowfullscreen=\"true\" allowscriptaccess=\"always\" height=\"340\" src=\"http://www.youtube.com/v/IyAyd4WnvhU&amp;hl=en&amp;fs=1&amp;\" type=\"application/x-shockwave-flash\" width=\"560\" /></object>"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|8", (saxExpectedOutput = "<object width=\"560\" height=\"340\"><param name=\"allowFullScreen\" value=\"true\"><param name=\"allowscriptaccess\" value=\"always\"><embed src=\"http://www.youtube.com/v/IyAyd4WnvhU&amp;hl=en&amp;fs=1&amp;\" type=\"application/x-shockwave-flash\" allowscriptaccess=\"always\" allowfullscreen=\"true\" width=\"560\" height=\"340\"></embed></object>"));
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|9", input), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|10", expectedOutput));
        }else {
            org.owasp.html.AntiSamyTest.assertSanitized(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|11", input), "");
        }
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            junit.framework.TestCase.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|15", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|13", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|12", input))).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|14", saxExpectedOutput))));
        }else {
            org.owasp.html.AntiSamyTest.assertSanitized(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|16", input), "");
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|17", // now what if someone sticks malicious URL in the value of the src
        // attribute in the embed tag? remove that embed tag
        (input = "<object width=\"560\" height=\"340\"><param name=\"movie\" value=\"http://www.youtube.com/v/IyAyd4WnvhU&hl=en&fs=1&\"></param><param name=\"allowFullScreen\" value=\"true\"></param><param name=\"allowscriptaccess\" value=\"always\"></param><embed src=\"http://hereswhereikeepbadcode.com/ohnoscary.swf\" type=\"application/x-shockwave-flash\" allowscriptaccess=\"always\" allowfullscreen=\"true\" width=\"560\" height=\"340\"></embed></object>"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|18", (expectedOutput = "<object height=\"340\" width=\"560\"><param name=\"movie\" value=\"http://www.youtube.com/v/IyAyd4WnvhU&amp;hl=en&amp;fs=1&amp;\" /><param name=\"allowFullScreen\" value=\"true\" /><param name=\"allowscriptaccess\" value=\"always\" /></object>"));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|19", (saxExpectedOutput = "<object width=\"560\" height=\"340\"><param name=\"movie\" value=\"http://www.youtube.com/v/IyAyd4WnvhU&amp;hl=en&amp;fs=1&amp;\"><param name=\"allowFullScreen\" value=\"true\"><param name=\"allowscriptaccess\" value=\"always\"></object>"));
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|20", input), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|21", expectedOutput));
        }else {
            org.owasp.html.AntiSamyTest.assertSanitized(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|22", input), "");
        }
        if (org.owasp.html.AntiSamyTest.RUN_KNOWN_FAILURES) {
            org.owasp.html.AntiSamyTest.assertSanitizedDoesContain(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|23", input), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|24", saxExpectedOutput));
        }else {
            org.owasp.html.AntiSamyTest.assertSanitized(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|testValidateParamAsEmbed()|25", input), "");
        }
    }

    private static void assertSanitizedDoesNotContain(java.lang.String html, java.lang.String dangerousContent) {
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|1", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|0", html)));
        int index = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|6", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|3", org.owasp.html.Strings.toLowerCase(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|2", sanitized))).indexOf(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|5", org.owasp.html.Strings.toLowerCase(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|4", dangerousContent)))));
        junit.framework.TestCase.assertEquals((((((("`" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|7", sanitized))) + "` from `") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|8", html))) + "` contains `") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|9", dangerousContent))) + "`"), (-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesNotContain(java.lang.String,java.lang.String)|10", index));
    }

    private static void assertSanitizedDoesContain(java.lang.String html, java.lang.String dangerousContent) {
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|1", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|0", html)));
        int index = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|6", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|3", org.owasp.html.Strings.toLowerCase(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|2", sanitized))).indexOf(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|5", org.owasp.html.Strings.toLowerCase(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|4", dangerousContent)))));
        junit.framework.TestCase.assertTrue((((((("`" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|7", sanitized))) + "` from `") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|8", html))) + "` does not contain `") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|9", dangerousContent))) + "`"), ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitizedDoesContain(java.lang.String,java.lang.String)|10", index)) >= 0));
    }

    private static void assertSanitized(java.lang.String html, java.lang.String sanitized) {
        junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitized(java.lang.String,java.lang.String)|0", sanitized), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitized(java.lang.String,java.lang.String)|2", org.owasp.html.AntiSamyTest.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.AntiSamyTest|assertSanitized(java.lang.String,java.lang.String)|1", html))));
    }
}

