/**
 * Copyright (c) 2013, Mike Samuel
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
public class CssFuzzerTest extends org.owasp.html.FuzzyTestCase {
    private static final java.lang.String[] TOKEN_PARTS = new java.lang.String[]{ "'", "\"", "<!--", "-->", "/*", "*/", "***", "//", "\r", "\n", "<", ">", "/", ",", ";", ":", "(", "url", "Url", ")", "[", "]", "{", "}", "\\", "\\a", "\\d", "\\0", " ", "\t", "42", ".", "ex", "auto", "foo", "BAr", "important", "!", "\ufeff", "\u0000", "\u00a0", "\ufffd", "\ud801\udc02", "\u007f", "\f", "CDATA", "style" };

    private static final java.lang.String[] FREQUENT_TOKEN_PARTS = new java.lang.String[]{ "*/", " ", "\t", "\r", "\n" };

    private static final java.lang.String[] DISALLOWED_IN_OUTPUT = new java.lang.String[]{ "</style", "<![CDATA[", "]]>", "\r", "\n" };

    final class Watcher implements java.lang.Runnable {
        java.lang.String input;

        long started;

        public void run() {
            synchronized(this) {
                try {
                    while ((input) == null) {
                        /* ms = 1s */
                        this.wait(1000);
                        long now = java.lang.System.nanoTime();
                        /* ns = 1s */
                        if ((now - (started)) >= 1000000000L) {
                            java.lang.System.err.println(((("`" + (input)) + "` is slow. seed=") + (org.owasp.html.CssFuzzerTest.this.seed)));
                        }
                    } 
                } catch (java.lang.InterruptedException ex) {
                    // Done
                    org.owasp.html.CssFuzzerTest.ignore(ex);
                }
            }
        }
    }

    @org.junit.Test
    public final void testUnderStress() {
        java.util.Random r = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|0", java.util.Random.class, this.rnd);
        org.owasp.html.CssFuzzerTest.Watcher watcher = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssFuzzerTest.Watcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|1", org.owasp.html.CssFuzzerTest.Watcher.class, new org.owasp.html.CssFuzzerTest.Watcher());
        java.lang.Thread watcherThread = null;
        for (int run = 0, nRuns = 1 << 16; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|2", run)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|3", nRuns)); ++run) {
            // Compose a random string from token parts.
            java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|4", java.lang.StringBuilder.class, new java.lang.StringBuilder());
            int nParts = (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|5", java.util.Random.class, r).nextInt(64))) + 16;
            for (int j = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|7", nParts); (--j) >= 0;) {
                int die = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|8", java.util.Random.class, r).nextInt(32));
                switch (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|10", die)) {
                    case 0 :
                        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|11", java.lang.StringBuilder.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|13", ((char) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|12", java.util.Random.class, rnd).nextInt(128)))));
                        break;
                    case 1 :
                        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|14", java.lang.StringBuilder.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|16", ((char) (eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|15", java.util.Random.class, rnd).nextInt(6144)))));
                        break;
                    default :
                        java.lang.String[] arr = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|20", java.lang.String[].class, (((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|17", die)) & 1) != 0 ? eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|18", java.lang.String[].class, org.owasp.html.CssFuzzerTest.TOKEN_PARTS) : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|19", java.lang.String[].class, org.owasp.html.CssFuzzerTest.FREQUENT_TOKEN_PARTS)));
                        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|21", java.lang.StringBuilder.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|27", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|22", java.lang.String[].class, arr)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|26", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|23", java.util.Random.class, rnd).nextInt(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|25", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|24", java.lang.String[].class, arr).length)))]));
                        break;
                }
            }
            java.lang.String randomCss = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|29", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|28", java.lang.StringBuilder.class, sb).toString());
            synchronized(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssFuzzerTest.Watcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|30", org.owasp.html.CssFuzzerTest.Watcher.class, watcher)) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|32", (eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssFuzzerTest.Watcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|31", org.owasp.html.CssFuzzerTest.Watcher.class, watcher).input = randomCss));
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|34", (eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssFuzzerTest.Watcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|33", org.owasp.html.CssFuzzerTest.Watcher.class, watcher).started = java.lang.System.nanoTime()));
            }
            if ((eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Thread>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|35", java.lang.Thread.class, watcherThread)) == null) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Thread>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|37", java.lang.Thread.class, (watcherThread = new java.lang.Thread(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssFuzzerTest.Watcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|36", org.owasp.html.CssFuzzerTest.Watcher.class, watcher))));
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Thread>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|38", java.lang.Thread.class, watcherThread).setDaemon(true);
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Thread>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|39", java.lang.Thread.class, watcherThread).start();
            }
            java.lang.String msg = ((("seed=" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|40", this.seed))) + ", css=`") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|41", randomCss))) + "`";
            org.owasp.html.CssTokens tokens = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|43", org.owasp.html.CssTokens.class, org.owasp.html.CssTokens.lex(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|42", randomCss)));
            // Test idempotent
            java.lang.String renormalized = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|47", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|46", org.owasp.html.CssTokens.class, org.owasp.html.CssTokens.lex(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|45", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|44", org.owasp.html.CssTokens.class, tokens).normalizedCss))).normalizedCss);
            if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|51", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|48", renormalized).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|50", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|49", org.owasp.html.CssTokens.class, tokens).normalizedCss))))) {
                if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|55", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|52", renormalized).equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|54", org.owasp.html.CssFuzzerTest.fixDigitSpaceUnit(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|53", org.owasp.html.CssTokens.class, tokens))))))) {
                    for (org.owasp.html.CssTokens.TokenIterator it = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|57", org.owasp.html.CssTokens.TokenIterator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|56", org.owasp.html.CssTokens.class, tokens).iterator()); eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|59", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|58", org.owasp.html.CssTokens.TokenIterator.class, it).hasNext()); eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|60", org.owasp.html.CssTokens.TokenIterator.class, it).advance()) {
                        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|61", java.io.PrintStream.class, java.lang.System.err).println((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|63", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|62", org.owasp.html.CssTokens.TokenIterator.class, it).token())) + ":") + (eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|65", org.owasp.html.CssTokens.TokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|64", org.owasp.html.CssTokens.TokenIterator.class, it).type()))));
                    }
                    junit.framework.TestCase.assertEquals(("not idempotent, " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|66", msg))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|68", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|67", org.owasp.html.CssTokens.class, tokens).normalizedCss), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|69", renormalized));
                }
            }
            // Test normalized CSS does not contain HTML/XML breaking tokens.
            for (java.lang.String disallowed : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|70", java.lang.String[].class, org.owasp.html.CssFuzzerTest.DISALLOWED_IN_OUTPUT)) {
                junit.framework.TestCase.assertFalse(((("contains " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|71", disallowed))) + ", ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|72", msg))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|76", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|74", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|73", org.owasp.html.CssTokens.class, tokens).normalizedCss).contains(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|75", disallowed))));
            }
            // Test that tokens are roughly well-formed.
            int nTokens = 0;
            for (org.owasp.html.CssTokens.TokenIterator it = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|78", org.owasp.html.CssTokens.TokenIterator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|77", org.owasp.html.CssTokens.class, tokens).iterator()); eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|80", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|79", org.owasp.html.CssTokens.TokenIterator.class, it).hasNext());) {
                org.owasp.html.CssTokens.TokenType type = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|82", org.owasp.html.CssTokens.TokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|81", org.owasp.html.CssTokens.TokenIterator.class, it).type());
                java.lang.String token = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|84", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|83", org.owasp.html.CssTokens.TokenIterator.class, it).next());
                java.util.regex.Pattern filter = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|87", java.util.regex.Pattern.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.EnumMap<org.owasp.html.CssTokens.TokenType, java.util.regex.Pattern>>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|85", java.util.EnumMap.class, org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS).get(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|86", org.owasp.html.CssTokens.TokenType.class, type)));
                if (((eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|88", java.util.regex.Pattern.class, filter)) != null) && (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|92", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Matcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|91", java.util.regex.Matcher.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.regex.Pattern>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|89", java.util.regex.Pattern.class, filter).matcher(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|90", token))).matches())))) {
                    junit.framework.TestCase.fail((((((eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|93", org.owasp.html.CssTokens.TokenType.class, type)) + " `") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|94", token))) + "`, ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|95", msg))));
                }
                ++nTokens;
            }
            // Test that walking the bracket list works.
            int[] reverse = eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|97", int[].class, new int[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|96", nTokens)]);
            java.util.Arrays.fill(eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|98", int[].class, reverse), (-1));
            for (int j = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|99", j)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|100", nTokens)); ++j) {
                int partner = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|104", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.Brackets>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|102", org.owasp.html.CssTokens.Brackets.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|101", org.owasp.html.CssTokens.class, tokens).brackets).partner(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|103", j)));
                if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|105", partner)) != (-1)) {
                    eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|108", (eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|106", int[].class, reverse)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|107", partner)] = j));
                }
            }
            for (int j = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|109", j)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|110", nTokens)); ++j) {
                if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|113", eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|111", int[].class, reverse)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|112", j)])) != (-1)) {
                    junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|114", msg), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|119", eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|115", int[].class, reverse)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|118", eu.stamp_project.reneri.instrumentation.StateObserver.<int[]>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|116", int[].class, reverse)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|117", j)])]), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|120", j));
                }
            }
        }
        synchronized(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssFuzzerTest.Watcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|121", org.owasp.html.CssFuzzerTest.Watcher.class, watcher)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|testUnderStress()|123", (eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssFuzzerTest.Watcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|122", org.owasp.html.CssFuzzerTest.Watcher.class, watcher).input = null));
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssFuzzerTest.Watcher>observeState("org.owasp.html.CssFuzzerTest|testUnderStress()|124", org.owasp.html.CssFuzzerTest.Watcher.class, watcher).notifyAll();
        }
    }

    private static final java.util.EnumMap<org.owasp.html.CssTokens.TokenType, java.util.regex.Pattern> TOKEN_TYPE_FILTERS = com.google.common.collect.Maps.newEnumMap(org.owasp.html.CssTokens.TokenType.class);

    static {
        java.lang.String NUMBER = "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]*[1-9])?(?:e-?[1-9][0-9]*)?";
        java.lang.String IDENT_START = "[a-zA-Z_\\u0080-\udbff\udfff\\-]";
        java.lang.String IDENT_PART = ("(?:" + IDENT_START) + "|[0-9])";
        java.lang.String IDENT = (IDENT_START + IDENT_PART) + "*";
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.AT, java.util.regex.Pattern.compile(("@" + IDENT)));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.COLON, java.util.regex.Pattern.compile(":"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.COLUMN, java.util.regex.Pattern.compile("\\|\\|"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.COMMA, java.util.regex.Pattern.compile(","));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.DELIM, java.util.regex.Pattern.compile("[^\\w\u0000- \u0080-\uffff\\-]"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.DIMENSION, java.util.regex.Pattern.compile((NUMBER + "[a-z]+")));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.DOT_IDENT, java.util.regex.Pattern.compile(("\\." + IDENT)));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.FUNCTION, java.util.regex.Pattern.compile((IDENT + "[(]")));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.HASH_ID, java.util.regex.Pattern.compile((("#" + IDENT_PART) + "+")));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.HASH_UNRESTRICTED, java.util.regex.Pattern.compile("#[a-fA-F0-9]+"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.IDENT, java.util.regex.Pattern.compile(IDENT));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.LEFT_CURLY, java.util.regex.Pattern.compile("[{]"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.LEFT_PAREN, java.util.regex.Pattern.compile("[(]"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.LEFT_SQUARE, java.util.regex.Pattern.compile("[\\[]"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.MATCH, java.util.regex.Pattern.compile("[~^$|*]="));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.NUMBER, java.util.regex.Pattern.compile(NUMBER));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.PERCENTAGE, java.util.regex.Pattern.compile((NUMBER + "%")));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.RIGHT_CURLY, java.util.regex.Pattern.compile("[}]"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.RIGHT_PAREN, java.util.regex.Pattern.compile("[)]"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.RIGHT_SQUARE, java.util.regex.Pattern.compile("[\\]]"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.SEMICOLON, java.util.regex.Pattern.compile(";"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.STRING, java.util.regex.Pattern.compile("\'(?:[^\'\r\n\\\\]|\\\\[^\r\n])*\'"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.UNICODE_RANGE, java.util.regex.Pattern.compile("U\\+[0-9a-f]{1,6}(?:-[0-9a-f]{1,6}|\\?{0,5})?"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.URL, java.util.regex.Pattern.compile("url\\(\'[0-9A-Za-z\\-_.~:/?#\\[\\]@!$&+,;=%]*\'\\)"));
        org.owasp.html.CssFuzzerTest.TOKEN_TYPE_FILTERS.put(org.owasp.html.CssTokens.TokenType.WHITESPACE, java.util.regex.Pattern.compile(" "));
    }

    /**
     * "1:NUMBER ex:IDENT" -> "1ex:DIMENSION" is a common source source of
     * a-idempotency, but not one that causes problems in practice.
     * This hack helps ignore it.
     */
    static java.lang.String fixDigitSpaceUnit(org.owasp.html.CssTokens tokens) {
        java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        for (org.owasp.html.CssTokens.TokenIterator it = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|2", org.owasp.html.CssTokens.TokenIterator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|1", org.owasp.html.CssTokens.class, tokens).iterator()); eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|3", org.owasp.html.CssTokens.TokenIterator.class, it).hasNext());) {
            if ((eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|6", org.owasp.html.CssTokens.TokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|5", org.owasp.html.CssTokens.TokenIterator.class, it).type())) != (eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|7", org.owasp.html.CssTokens.TokenType.class, org.owasp.html.CssTokens.TokenType.NUMBER))) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|11", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|8", java.lang.StringBuilder.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|9", org.owasp.html.CssTokens.TokenIterator.class, it).next())));
            }else {
                do {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|20", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|17", java.lang.StringBuilder.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|18", org.owasp.html.CssTokens.TokenIterator.class, it).next())));
                } while ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|12", org.owasp.html.CssTokens.TokenIterator.class, it).hasNext())) && ((eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|15", org.owasp.html.CssTokens.TokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|14", org.owasp.html.CssTokens.TokenIterator.class, it).type())) == (eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|16", org.owasp.html.CssTokens.TokenType.class, org.owasp.html.CssTokens.TokenType.NUMBER))) );
                if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|21", org.owasp.html.CssTokens.TokenIterator.class, it).hasNext())) && ((eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|24", org.owasp.html.CssTokens.TokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|23", org.owasp.html.CssTokens.TokenIterator.class, it).type())) == (eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|25", org.owasp.html.CssTokens.TokenType.class, org.owasp.html.CssTokens.TokenType.WHITESPACE)))) {
                    eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|26", org.owasp.html.CssTokens.TokenIterator.class, it).advance();
                    java.lang.String numberFollower = null;
                    if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|28", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|27", org.owasp.html.CssTokens.TokenIterator.class, it).hasNext())) {
                        java.lang.String token = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|30", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|29", org.owasp.html.CssTokens.TokenIterator.class, it).token());
                        switch (eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenType>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|32", org.owasp.html.CssTokens.TokenType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|31", org.owasp.html.CssTokens.TokenIterator.class, it).type())) {
                            case IDENT :
                                if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|34", org.owasp.html.CssTokens.isWellKnownUnit(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|33", token)))) {
                                    eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|35", (numberFollower = token));
                                    eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|36", org.owasp.html.CssTokens.TokenIterator.class, it).advance();
                                    if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|38", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|37", org.owasp.html.CssTokens.TokenIterator.class, it).hasNext())) && (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|41", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|40", eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|39", org.owasp.html.CssTokens.TokenIterator.class, it).token()).startsWith(".")))) {
                                        eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|42", (numberFollower += " "));
                                    }
                                    eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|43", org.owasp.html.CssTokens.TokenIterator.class, it).backup();
                                }
                                break;
                            case FUNCTION :
                                java.lang.String name = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|47", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|44", token).substring(0, ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|46", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|45", token).length())) - 1)));
                                if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|49", org.owasp.html.CssTokens.isWellKnownUnit(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|48", name)))) {
                                    eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|50", (numberFollower = token));
                                }
                                break;
                            case DELIM :
                                if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|52", "%".equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|51", token)))) {
                                    eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|53", (numberFollower = token));
                                }
                                break;
                            default :
                                break;
                        }
                    }
                    if ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|54", numberFollower)) == null) {
                        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|56", java.lang.StringBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|55", java.lang.StringBuilder.class, sb).append(' '));
                    }else {
                        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|60", java.lang.StringBuilder.class, // Drop the space and append a lower-case version of the unit.
                        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|57", java.lang.StringBuilder.class, sb).append(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|59", org.owasp.html.Strings.toLowerCase(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|58", numberFollower)))));
                        eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssTokens.TokenIterator>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|61", org.owasp.html.CssTokens.TokenIterator.class, it).advance();
                    }
                }
            }
        }
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|63", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.CssFuzzerTest|fixDigitSpaceUnit(org.owasp.html.CssTokens)|62", java.lang.StringBuilder.class, sb).toString());
    }

    /**
     *
     *
     * @param o
     * 		ignored
     */
    static void ignore(java.lang.Object o) {
        // Do nothing.
    }
}

