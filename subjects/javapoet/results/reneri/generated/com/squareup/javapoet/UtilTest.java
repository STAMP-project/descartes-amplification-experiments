/**
 * Copyright (C) 2016 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.javapoet;


public class UtilTest {
    @org.junit.Test
    public void characterLiteral() {
        org.junit.Assert.assertEquals("a", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|0", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('a')));
        org.junit.Assert.assertEquals("b", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|1", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('b')));
        org.junit.Assert.assertEquals("c", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|2", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('c')));
        org.junit.Assert.assertEquals("%", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|3", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('%')));
        // common escapes
        org.junit.Assert.assertEquals("\\b", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|4", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\b')));
        org.junit.Assert.assertEquals("\\t", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|5", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\t')));
        org.junit.Assert.assertEquals("\\n", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|6", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\n')));
        org.junit.Assert.assertEquals("\\f", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|7", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\f')));
        org.junit.Assert.assertEquals("\\r", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|8", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\r')));
        org.junit.Assert.assertEquals("\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|9", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('"')));
        org.junit.Assert.assertEquals("\\\'", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|10", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\'')));
        org.junit.Assert.assertEquals("\\\\", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|11", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\\')));
        // octal escapes
        org.junit.Assert.assertEquals("\\u0000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|12", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u0000')));
        org.junit.Assert.assertEquals("\\u0007", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|13", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u0007')));
        org.junit.Assert.assertEquals("?", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|14", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('?')));
        org.junit.Assert.assertEquals("\\u007f", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|15", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u007f')));
        org.junit.Assert.assertEquals("¿", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|16", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u00bf')));
        org.junit.Assert.assertEquals("ÿ", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|17", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u00ff')));
        // unicode escapes
        org.junit.Assert.assertEquals("\\u0000", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|18", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u0000')));
        org.junit.Assert.assertEquals("\\u0001", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|19", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u0001')));
        org.junit.Assert.assertEquals("\\u0002", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|20", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u0002')));
        org.junit.Assert.assertEquals("€", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|21", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u20ac')));
        org.junit.Assert.assertEquals("☃", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|22", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u2603')));
        org.junit.Assert.assertEquals("♠", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|23", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u2660')));
        org.junit.Assert.assertEquals("♣", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|24", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u2663')));
        org.junit.Assert.assertEquals("♥", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|25", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u2665')));
        org.junit.Assert.assertEquals("♦", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|26", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u2666')));
        org.junit.Assert.assertEquals("✵", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|27", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u2735')));
        org.junit.Assert.assertEquals("✺", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|28", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\u273a')));
        org.junit.Assert.assertEquals("／", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|characterLiteral()|29", com.squareup.javapoet.Util.characterLiteralWithoutSingleQuotes('\uff0f')));
    }

    @org.junit.Test
    public void stringLiteral() {
        stringLiteral("abc");
        stringLiteral("♦♥♠♣");
        stringLiteral("\u20ac\\t@\\t$", "\u20ac\t@\t$", " ");
        stringLiteral("abc();\\n\"\n  + \"def();", "abc();\ndef();", " ");
        stringLiteral("This is \\\"quoted\\\"!", "This is \"quoted\"!", " ");
        stringLiteral("e^{i\\\\pi}+1=0", "e^{i\\pi}+1=0", " ");
    }

    void stringLiteral(java.lang.String string) {
        stringLiteral(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|stringLiteral(java.lang.String)|0", string), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|stringLiteral(java.lang.String)|1", string), " ");
    }

    void stringLiteral(java.lang.String expected, java.lang.String value, java.lang.String indent) {
        org.junit.Assert.assertEquals((("\"" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|stringLiteral(java.lang.String,java.lang.String,java.lang.String)|0", expected))) + "\""), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|stringLiteral(java.lang.String,java.lang.String,java.lang.String)|3", com.squareup.javapoet.Util.stringLiteralWithDoubleQuotes(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|stringLiteral(java.lang.String,java.lang.String,java.lang.String)|1", value), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.squareup.javapoet.UtilTest|stringLiteral(java.lang.String,java.lang.String,java.lang.String)|2", indent))));
    }
}

