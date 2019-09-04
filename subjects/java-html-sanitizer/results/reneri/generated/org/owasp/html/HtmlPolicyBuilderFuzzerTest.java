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


/**
 * Throws random policy calls to find evidence against the claim that the
 * security of the policy is decoupled from that of the parser.
 * This test is stochastic -- not guaranteed to pass or fail consistently.
 * If you see a failure, please report it along with the seed from the output.
 * If you want to repeat a failure, set the system property "junit.seed".
 *
 * @author Mike Samuel (mikesamuel@gmail.com)
 */
@java.lang.SuppressWarnings("javadoc")
public class HtmlPolicyBuilderFuzzerTest extends org.owasp.html.FuzzyTestCase {
    final com.google.common.base.Function<org.owasp.html.HtmlStreamEventReceiver, org.owasp.html.HtmlSanitizer.Policy> policyFactory = new org.owasp.html.HtmlPolicyBuilder().allowElements("a", "b", "xmp", "pre").allowAttributes("href").onElements("a").allowAttributes("title").globally().allowStandardUrlProtocols().toFactory();

    static final java.lang.String[] CHUNKS = new java.lang.String[]{ "Hello, World!", "<b>", "</b>", "<a onclick='doEvil()' href=javascript:alert(1337)>", "</a>", "<script>", "</script>", "<xmp>", "</xmp>", "javascript:alert(1337)", "<style>", "</style>", "<plaintext>", "<!--", "-->", "<![CDATA[", "]]>" };

    static final java.lang.String[] ELEMENT_NAMES = new java.lang.String[]{ "a", "A", "b", "B", "script", "SCRipT", "style", "STYLE", "object", "Object", "noscript", "noScript", "xmp", "XMP" };

    static final java.lang.String[] ATTR_NAMES = new java.lang.String[]{ "href", "id", "class", "onclick", "checked", "style" };

    public final void testFuzzedOutput() throws java.io.IOException, org.xml.sax.SAXException {
        boolean passed = false;
        try {
            for (int i = 1000; (--i) >= 0;) {
                java.lang.StringBuilder sb = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
                org.owasp.html.HtmlSanitizer.Policy policy = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|4", org.owasp.html.HtmlSanitizer.Policy.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.base.Function<org.owasp.html.HtmlStreamEventReceiver, org.owasp.html.HtmlSanitizer.Policy>>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|1", com.google.common.base.Function.class, policyFactory).apply(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlStreamRenderer>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|3", org.owasp.html.HtmlStreamRenderer.class, org.owasp.html.HtmlStreamRenderer.create(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|2", java.lang.StringBuilder.class, sb), org.owasp.html.Handler.DO_NOTHING))));
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|5", org.owasp.html.HtmlSanitizer.Policy.class, policy).openDocument();
                java.util.List<java.lang.String> attributes = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<java.lang.String>>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|6", java.util.ArrayList.class, com.google.common.collect.Lists.newArrayList());
                for (int j = 50; (--j) >= 0;) {
                    int r = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|7", java.util.Random.class, rnd).nextInt(3));
                    switch (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|9", r)) {
                        case 0 :
                            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|10", java.util.List.class, attributes).clear();
                            if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|11", java.util.Random.class, rnd).nextBoolean())) {
                                for (int k = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|13", java.util.Random.class, rnd).nextInt(4)); (--k) >= 0;) {
                                    eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|15", java.util.List.class, attributes).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|18", org.owasp.html.HtmlPolicyBuilderFuzzerTest.pick(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|16", java.util.Random.class, rnd), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|17", java.lang.String[].class, org.owasp.html.HtmlPolicyBuilderFuzzerTest.ATTR_NAMES)))));
                                    eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|23", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|20", java.util.List.class, attributes).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|22", org.owasp.html.HtmlPolicyBuilderFuzzerTest.pickChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|21", java.util.Random.class, rnd)))));
                                }
                            }
                            eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|24", org.owasp.html.HtmlSanitizer.Policy.class, policy).openTag(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|27", org.owasp.html.HtmlPolicyBuilderFuzzerTest.pick(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|25", java.util.Random.class, rnd), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|26", java.lang.String[].class, org.owasp.html.HtmlPolicyBuilderFuzzerTest.ELEMENT_NAMES))), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|28", java.util.List.class, attributes));
                            break;
                        case 1 :
                            eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|29", org.owasp.html.HtmlSanitizer.Policy.class, policy).closeTag(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|32", org.owasp.html.HtmlPolicyBuilderFuzzerTest.pick(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|30", java.util.Random.class, rnd), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|31", java.lang.String[].class, org.owasp.html.HtmlPolicyBuilderFuzzerTest.ELEMENT_NAMES))));
                            break;
                        case 2 :
                            eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|33", org.owasp.html.HtmlSanitizer.Policy.class, policy).text(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|35", org.owasp.html.HtmlPolicyBuilderFuzzerTest.pickChunk(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|34", java.util.Random.class, rnd))));
                            break;
                        default :
                            throw eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.AssertionError>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|37", java.lang.AssertionError.class, new java.lang.AssertionError(("Randomly chosen number in [0-3) was " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|36", r)))));
                    }
                }
                eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.HtmlSanitizer.Policy>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|38", org.owasp.html.HtmlSanitizer.Policy.class, policy).closeDocument();
                java.lang.String html = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|40", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|39", java.lang.StringBuilder.class, sb).toString());
                nu.validator.htmlparser.dom.HtmlDocumentBuilder parser = eu.stamp_project.reneri.instrumentation.StateObserver.<nu.validator.htmlparser.dom.HtmlDocumentBuilder>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|41", nu.validator.htmlparser.dom.HtmlDocumentBuilder.class, new nu.validator.htmlparser.dom.HtmlDocumentBuilder());
                org.w3c.dom.Node node = eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.DocumentFragment>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|46", org.w3c.dom.DocumentFragment.class, eu.stamp_project.reneri.instrumentation.StateObserver.<nu.validator.htmlparser.dom.HtmlDocumentBuilder>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|42", nu.validator.htmlparser.dom.HtmlDocumentBuilder.class, parser).parseFragment(eu.stamp_project.reneri.instrumentation.StateObserver.<org.xml.sax.InputSource>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|45", org.xml.sax.InputSource.class, new org.xml.sax.InputSource(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.StringReader>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|44", java.io.StringReader.class, new java.io.StringReader(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|43", html))))), "body"));
                org.owasp.html.HtmlPolicyBuilderFuzzerTest.checkSafe(eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|47", org.w3c.dom.Node.class, node), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|48", html));
            }
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|49", (passed = true));
        } finally {
            if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|50", passed))) {
                eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|51", java.io.PrintStream.class, java.lang.System.err).println((("Using seed " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|testFuzzedOutput()|52", seed))) + "L"));
            }
        }
    }

    private static void checkSafe(org.w3c.dom.Node node, java.lang.String html) {
        switch (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|1", eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|0", org.w3c.dom.Node.class, node).getNodeType())) {
            case org.w3c.dom.Node.ELEMENT_NODE :
                java.lang.String name = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|2", org.w3c.dom.Node.class, node).getNodeName());
                if (((!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|5", "a".equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|4", name))))) && (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|7", "b".equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|6", name)))))) && (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|9", "pre".equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|8", name)))))) {
                    junit.framework.TestCase.fail(((("Illegal element name " + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|10", name))) + " : ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|11", html))));
                }
                org.w3c.dom.NamedNodeMap attrs = eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.NamedNodeMap>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|13", org.w3c.dom.NamedNodeMap.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|12", org.w3c.dom.Node.class, node).getAttributes());
                for (int i = 0, n = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|15", eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.NamedNodeMap>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|14", org.w3c.dom.NamedNodeMap.class, attrs).getLength()); (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|16", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|17", n)); ++i) {
                    org.w3c.dom.Attr a = eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Attr>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|20", org.w3c.dom.Attr.class, ((org.w3c.dom.Attr) (eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.NamedNodeMap>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|18", org.w3c.dom.NamedNodeMap.class, attrs).item(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|19", i)))));
                    if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|23", "title".equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|22", eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Attr>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|21", org.w3c.dom.Attr.class, a).getName())))) {
                        // ok
                    }else
                        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|26", "href".equals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|25", eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Attr>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|24", org.w3c.dom.Attr.class, a).getName())))) {
                            junit.framework.TestCase.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|27", html), "a", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|28", name));
                            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|29", html), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|33", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|32", org.owasp.html.Strings.toLowerCase(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|31", eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Attr>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|30", org.w3c.dom.Attr.class, a).getValue()))).contains("script:")));
                        }

                }
                break;
        }
        for (org.w3c.dom.Node child = eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|35", org.w3c.dom.Node.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|34", org.w3c.dom.Node.class, node).getFirstChild()); (eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|36", org.w3c.dom.Node.class, child)) != null; eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|38", org.w3c.dom.Node.class, (child = eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|37", org.w3c.dom.Node.class, child).getNextSibling()))) {
            org.owasp.html.HtmlPolicyBuilderFuzzerTest.checkSafe(eu.stamp_project.reneri.instrumentation.StateObserver.<org.w3c.dom.Node>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|39", org.w3c.dom.Node.class, child), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|checkSafe(org.w3c.dom.Node,java.lang.String)|40", html));
        }
    }

    private static java.lang.String pick(java.util.Random rnd, java.lang.String[] choices) {
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pick(java.util.Random,java.lang.String[])|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pick(java.util.Random,java.lang.String[])|0", java.lang.String[].class, choices)[eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pick(java.util.Random,java.lang.String[])|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pick(java.util.Random,java.lang.String[])|1", java.util.Random.class, rnd).nextInt(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pick(java.util.Random,java.lang.String[])|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pick(java.util.Random,java.lang.String[])|2", java.lang.String[].class, choices).length)))]);
    }

    private static java.lang.String pickChunk(java.util.Random rnd) {
        java.lang.String chunk = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|2", org.owasp.html.HtmlPolicyBuilderFuzzerTest.pick(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|0", java.util.Random.class, rnd), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|1", java.lang.String[].class, org.owasp.html.HtmlPolicyBuilderFuzzerTest.CHUNKS)));
        int start = 0;
        int end = eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|4", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|3", chunk).length());
        if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|5", java.util.Random.class, rnd).nextBoolean())) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|9", (start = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|7", java.util.Random.class, rnd).nextInt(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|8", end)) - 1))));
        }
        if ((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|10", end)) - (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|11", start))) < 2) && (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|13", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|12", java.util.Random.class, rnd).nextBoolean()))) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|19", (end = (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|14", start)) + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|18", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|15", java.util.Random.class, rnd).nextInt(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|16", end)) - (eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|17", start))))))));
        }
        return eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|23", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|20", chunk).substring(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|21", start), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.HtmlPolicyBuilderFuzzerTest|pickChunk(java.util.Random)|22", end)));
    }
}

