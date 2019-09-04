package com.cronutils.model.field.expression;


/* Copyright 2015 jmrozanec
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
public class BetweenTest {
    private int from;

    private int to;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|setUp()|0", (from = 1));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|setUp()|1", (to = 5));
    }

    @org.junit.Test
    public void testGetFrom() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testGetFrom()|0", from), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Between>observeState("com.cronutils.model.field.expression.BetweenTest|testGetFrom()|5", com.cronutils.model.field.expression.Between.class, new com.cronutils.model.field.expression.Between(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.BetweenTest|testGetFrom()|2", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testGetFrom()|1", from))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.BetweenTest|testGetFrom()|4", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testGetFrom()|3", to))))).getFrom().getValue());
    }

    @org.junit.Test
    public void testGetTo() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testGetTo()|0", to), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Between>observeState("com.cronutils.model.field.expression.BetweenTest|testGetTo()|5", com.cronutils.model.field.expression.Between.class, new com.cronutils.model.field.expression.Between(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.BetweenTest|testGetTo()|2", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testGetTo()|1", from))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.BetweenTest|testGetTo()|4", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testGetTo()|3", to))))).getTo().getValue());
    }

    @org.junit.Test
    public void testNonNumericRangeSupported() throws java.lang.Exception {
        com.cronutils.model.field.value.SpecialChar specialChar = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|0", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.L);
        com.cronutils.model.field.expression.Between between = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Between>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|5", com.cronutils.model.field.expression.Between.class, new com.cronutils.model.field.expression.Between(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|2", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|1", com.cronutils.model.field.value.SpecialChar.class, specialChar))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|4", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|3", to)))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|6", com.cronutils.model.field.value.SpecialChar.class, specialChar), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Between>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|7", com.cronutils.model.field.expression.Between.class, between).getFrom().getValue());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|8", to), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Between>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|9", com.cronutils.model.field.expression.Between.class, between).getTo().getValue());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|12", java.lang.String.format("%s-%s", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|10", com.cronutils.model.field.value.SpecialChar.class, specialChar), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|11", to))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Between>observeState("com.cronutils.model.field.expression.BetweenTest|testNonNumericRangeSupported()|13", com.cronutils.model.field.expression.Between.class, between).asString()));
    }
}

