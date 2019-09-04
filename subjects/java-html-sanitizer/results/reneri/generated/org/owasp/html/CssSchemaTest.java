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
public final class CssSchemaTest extends junit.framework.TestCase {
    @org.junit.Test
    public static final void testDangerousProperties() {
        for (java.lang.String key : eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.owasp.html.CssSchemaTest|testDangerousProperties()|0", java.lang.String[].class, new java.lang.String[]{ // May allow escaping informal visual containment when embedders are
        // not particular about establishing a clipping region.
        "display", "float", "clear", "left", "right", // May ease trusted path violations by allowing links to impersonate
        // controls in the embedding page.
        "cursor", // Allows code execution.
        "-moz-binding", // Prefix corner cases.
        "-", "-moz-" })) {
            junit.framework.TestCase.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousProperties()|1", key), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testDangerousProperties()|2", org.owasp.html.CssSchema.Property.class, org.owasp.html.CssSchema.DISALLOWED), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testDangerousProperties()|5", org.owasp.html.CssSchema.Property.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.CssSchemaTest|testDangerousProperties()|3", org.owasp.html.CssSchema.class, org.owasp.html.CssSchema.DEFAULT).forKey(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousProperties()|4", key))));
        }
    }

    @org.junit.Test
    public static final void testDangerousTokens() {
        for (java.lang.String propName : eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableSet<java.lang.String>>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|0", com.google.common.collect.ImmutableSet.class, org.owasp.html.CssSchema.DEFAULT_WHITELIST)) {
            org.owasp.html.CssSchema.Property property = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|3", org.owasp.html.CssSchema.Property.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|1", org.owasp.html.CssSchema.class, org.owasp.html.CssSchema.DEFAULT).forKey(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|2", propName)));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|4", propName), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableSet<java.lang.String>>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|6", com.google.common.collect.ImmutableSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|5", org.owasp.html.CssSchema.Property.class, property).literals).contains("expression")));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|8", propName), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String>>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|10", com.google.common.collect.ImmutableMap.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|9", org.owasp.html.CssSchema.Property.class, property).fnKeys).containsKey("expression(")));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|12", propName), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableSet<java.lang.String>>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|14", com.google.common.collect.ImmutableSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|13", org.owasp.html.CssSchema.Property.class, property).literals).contains("url")));
            junit.framework.TestCase.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|16", propName), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testDangerousTokens()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String>>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|18", com.google.common.collect.ImmutableMap.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testDangerousTokens()|17", org.owasp.html.CssSchema.Property.class, property).fnKeys).containsKey("url(")));
        }
    }

    @org.junit.Test
    public static final void testCustom() {
        org.owasp.html.CssSchema custom = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.CssSchemaTest|testCustom()|3", org.owasp.html.CssSchema.class, org.owasp.html.CssSchema.union(eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.CssSchemaTest|testCustom()|0", org.owasp.html.CssSchema.class, org.owasp.html.CssSchema.DEFAULT), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.CssSchemaTest|testCustom()|2", org.owasp.html.CssSchema.class, org.owasp.html.CssSchema.withProperties(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Set<java.lang.String>>observeState("org.owasp.html.CssSchemaTest|testCustom()|1", java.util.Set.class, java.util.Collections.singleton("float"))))));
        for (java.lang.String key : eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableSet<java.lang.String>>observeState("org.owasp.html.CssSchemaTest|testCustom()|5", com.google.common.collect.ImmutableSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableMap<java.lang.String, org.owasp.html.CssSchema.Property>>observeState("org.owasp.html.CssSchemaTest|testCustom()|4", com.google.common.collect.ImmutableMap.class, org.owasp.html.CssSchema.DEFINITIONS).keySet())) {
            if (!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testCustom()|7", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testCustom()|6", key).equals("float")))) {
                junit.framework.TestCase.assertSame(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testCustom()|8", key), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testCustom()|11", org.owasp.html.CssSchema.Property.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.CssSchemaTest|testCustom()|9", org.owasp.html.CssSchema.class, custom).forKey(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testCustom()|10", key))), eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testCustom()|14", org.owasp.html.CssSchema.Property.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.CssSchemaTest|testCustom()|12", org.owasp.html.CssSchema.class, org.owasp.html.CssSchema.DEFAULT).forKey(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testCustom()|13", key))));
            }
        }
        org.owasp.html.CssSchema.Property cssFloat = eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testCustom()|16", org.owasp.html.CssSchema.Property.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema>observeState("org.owasp.html.CssSchemaTest|testCustom()|15", org.owasp.html.CssSchema.class, custom).forKey("float"));
        junit.framework.TestCase.assertTrue("left in float", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.CssSchemaTest|testCustom()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<com.google.common.collect.ImmutableSet<java.lang.String>>observeState("org.owasp.html.CssSchemaTest|testCustom()|18", com.google.common.collect.ImmutableSet.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.owasp.html.CssSchema.Property>observeState("org.owasp.html.CssSchemaTest|testCustom()|17", org.owasp.html.CssSchema.Property.class, cssFloat).literals).contains("left")));
    }
}

