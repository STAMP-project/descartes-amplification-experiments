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
public class HtmlChangeReporterTest extends junit.framework.TestCase {
    // Opaque test value compared via equality.
    static class Context {}

    @org.junit.Test
    public static final void testChangeReporting() {
        final org.owasp.html.HtmlChangeReporterTest.Context testContext = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporterTest.Context>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|0", org.owasp.html.HtmlChangeReporterTest.Context.class, new org.owasp.html.HtmlChangeReporterTest.Context());
        java.lang.StringBuilder out = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|1", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        final java.lang.StringBuilder log = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|2", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.HtmlStreamRenderer renderer = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|4", org.owasp.html.HtmlStreamRenderer.class, org.owasp.html.HtmlStreamRenderer.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|3", java.lang.StringBuilder.class, out), org.owasp.html.Handler.DO_NOTHING));
        org.owasp.html.HtmlChangeListener<org.owasp.html.HtmlChangeReporterTest.Context> listener = new org.owasp.html.HtmlChangeListener<org.owasp.html.HtmlChangeReporterTest.Context>() {
            public void discardedTag(org.owasp.html.HtmlChangeReporterTest.Context context, java.lang.String elementName) {
                junit.framework.TestCase.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporterTest.Context>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|6", org.owasp.html.HtmlChangeReporterTest.Context.class, testContext), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporterTest.Context>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|7", org.owasp.html.HtmlChangeReporterTest.Context.class, context));
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|12", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|11", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|9", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|8", java.lang.StringBuilder.class, log).append('<')).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|10", elementName))).append("> "));
            }

            public void discardedAttributes(org.owasp.html.HtmlChangeReporterTest.Context context, java.lang.String tagName, java.lang.String... attributeNames) {
                junit.framework.TestCase.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporterTest.Context>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|13", org.owasp.html.HtmlChangeReporterTest.Context.class, testContext), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporterTest.Context>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|14", org.owasp.html.HtmlChangeReporterTest.Context.class, context));
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|18", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|16", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|15", java.lang.StringBuilder.class, log).append('<')).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|17", tagName)));
                for (java.lang.String attributeName : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|19", java.lang.String[].class, attributeNames)) {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|23", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|21", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|20", java.lang.StringBuilder.class, log).append(' ')).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|22", attributeName)));
                }
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|25", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|24", java.lang.StringBuilder.class, log).append("> "));
            }
        };
        org.owasp.html.HtmlChangeReporter<org.owasp.html.HtmlChangeReporterTest.Context> hcr = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporter<org.owasp.html.HtmlChangeReporterTest.Context>>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|29", org.owasp.html.HtmlChangeReporter.class, new org.owasp.html.HtmlChangeReporter<org.owasp.html.HtmlChangeReporterTest.Context>(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|26", org.owasp.html.HtmlStreamRenderer.class, renderer), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeListener<org.owasp.html.HtmlChangeReporterTest.Context>>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|27", org.owasp.html.HtmlChangeListener.class, listener), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporterTest.Context>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|28", org.owasp.html.HtmlChangeReporterTest.Context.class, testContext)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporter<org.owasp.html.HtmlChangeReporterTest.Context>>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|30", org.owasp.html.HtmlChangeReporter.class, hcr).setPolicy(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|34", org.owasp.html.HtmlSanitizer.Policy.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|31", org.owasp.html.PolicyFactory.class, org.owasp.html.Sanitizers.FORMATTING).apply(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamEventReceiver>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|33", org.owasp.html.HtmlStreamEventReceiver.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporter<org.owasp.html.HtmlChangeReporterTest.Context>>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|32", org.owasp.html.HtmlChangeReporter.class, hcr).getWrappedRenderer()))));
        java.lang.String html = "<textarea>Hello</textarea>,<b onclick=alert(42)>World</B>!" + "<Script type=text/javascript>doEvil()</script><PLAINTEXT>";
        org.owasp.html.HtmlSanitizer.sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|35", html), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|37", org.owasp.html.HtmlSanitizer.Policy.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlChangeReporter<org.owasp.html.HtmlChangeReporterTest.Context>>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|36", org.owasp.html.HtmlChangeReporter.class, hcr).getWrappedPolicy()));
        junit.framework.TestCase.assertEquals("Hello,<b>World</b>!", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|39", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|38", java.lang.StringBuilder.class, out).toString()));
        junit.framework.TestCase.assertEquals("<textarea> <b onclick> <script> <plaintext> ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|41", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlChangeReporterTest|testChangeReporting()|40", java.lang.StringBuilder.class, log).toString()));
    }
}

