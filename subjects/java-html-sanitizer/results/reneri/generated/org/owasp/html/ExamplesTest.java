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
public class ExamplesTest extends junit.framework.TestCase {
    @org.junit.Test
    public static final void testExamplesRun() throws java.lang.Exception {
        java.io.InputStream stdin = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|0", java.io.InputStream.class, java.lang.System.in);
        java.io.PrintStream stdout = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|1", java.io.PrintStream.class, java.lang.System.out);
        java.io.PrintStream stderr = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|2", java.io.PrintStream.class, java.lang.System.err);
        for (java.lang.Class<?> exampleClass : org.owasp.html.AllExamples.CLASSES) {
            java.io.InputStream emptyIn = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayInputStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|4", java.io.ByteArrayInputStream.class, new java.io.ByteArrayInputStream(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|3", byte[].class, new byte[0])));
            java.io.ByteArrayOutputStream captured = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|5", java.io.ByteArrayOutputStream.class, new java.io.ByteArrayOutputStream());
            java.io.PrintStream capturingOut = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|7", java.io.PrintStream.class, new java.io.PrintStream(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|6", java.io.ByteArrayOutputStream.class, captured), true, "UTF-8"));
            java.lang.System.setIn(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|8", java.io.InputStream.class, emptyIn));
            java.lang.System.setOut(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|9", java.io.PrintStream.class, capturingOut));
            java.lang.System.setErr(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|10", java.io.PrintStream.class, capturingOut));
            java.lang.reflect.Method main;
            try {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Method>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|11", java.lang.reflect.Method.class, (main = exampleClass.getDeclaredMethod("main", java.lang.String[].class)));
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|15", java.lang.Object.class, // Invoke with no arguments to sanitize empty input stream to output.
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.reflect.Method>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|12", java.lang.reflect.Method.class, main).invoke(null, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object[]>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|14", java.lang.Object[].class, new java.lang.Object[]{ eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|13", java.lang.String[].class, new java.lang.String[0]) })));
            } catch (java.lang.Exception ex) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|16", java.io.PrintStream.class, capturingOut).flush();
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|17", java.io.PrintStream.class, java.lang.System.err).println(((("Example " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testExamplesRun()|18", exampleClass.getSimpleName()))) + "\n") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testExamplesRun()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.ByteArrayOutputStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|19", java.io.ByteArrayOutputStream.class, captured).toString("UTF-8")))));
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.RuntimeException>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|22", java.lang.RuntimeException.class, com.google.common.base.Throwables.propagate(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Exception>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|21", java.lang.Exception.class, ex)));
            } finally {
                java.lang.System.setIn(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.InputStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|23", java.io.InputStream.class, stdin));
                java.lang.System.setOut(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|24", java.io.PrintStream.class, stdout));
                java.lang.System.setErr(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.ExamplesTest|testExamplesRun()|25", java.io.PrintStream.class, stderr));
            }
        }
    }

    @org.junit.Test
    public static final void testSanitizeRemovesScripts() {
        java.lang.String input = "<p>Hello World</p>" + "<script language=\"text/javascript\">alert(\"bad\");</script>";
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testSanitizeRemovesScripts()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.ExamplesTest|testSanitizeRemovesScripts()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.examples.EbayPolicyExample.POLICY_DEFINITION).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testSanitizeRemovesScripts()|1", input)));
        junit.framework.TestCase.assertEquals("<p>Hello World</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testSanitizeRemovesScripts()|3", sanitized));
    }

    @org.junit.Test
    public static final void testSanitizeRemovesOnclick() {
        java.lang.String input = "<p onclick=\"alert(\"bad\");\">Hello World</p>";
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testSanitizeRemovesOnclick()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.ExamplesTest|testSanitizeRemovesOnclick()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.examples.EbayPolicyExample.POLICY_DEFINITION).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testSanitizeRemovesOnclick()|1", input)));
        junit.framework.TestCase.assertEquals("<p>Hello World</p>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testSanitizeRemovesOnclick()|3", sanitized));
    }

    @org.junit.Test
    public static final void testTextAllowedInLinks() {
        java.lang.String input = "<a href=\"../good.html\">click here</a>";
        java.lang.String sanitized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testTextAllowedInLinks()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.PolicyFactory>observeState("org.owasp.html.ExamplesTest|testTextAllowedInLinks()|0", org.owasp.html.PolicyFactory.class, org.owasp.html.examples.EbayPolicyExample.POLICY_DEFINITION).sanitize(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testTextAllowedInLinks()|1", input)));
        junit.framework.TestCase.assertEquals("<a href=\"../good.html\" rel=\"nofollow\">click here</a>", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.ExamplesTest|testTextAllowedInLinks()|3", sanitized));
    }
}

