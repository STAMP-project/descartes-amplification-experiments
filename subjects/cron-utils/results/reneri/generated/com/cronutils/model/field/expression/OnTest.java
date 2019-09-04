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
public class OnTest {
    private int time;

    private int nth;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|setUp()|0", (time = 5));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|setUp()|1", (nth = 3));
    }

    @org.junit.Test
    public void testGetTime() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testGetTime()|0", time), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testGetTime()|5", ((int) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testGetTime()|4", com.cronutils.model.field.value.IntegerFieldValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.field.expression.OnTest|testGetTime()|3", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testGetTime()|2", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testGetTime()|1", time))))).getTime()).getValue()))));
    }

    @org.junit.Test
    public void testGetNth() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testGetNth()|0", nth), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testGetNth()|9", ((int) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testGetNth()|8", com.cronutils.model.field.value.IntegerFieldValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.field.expression.OnTest|testGetNth()|7", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testGetNth()|2", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testGetNth()|1", time))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testGetNth()|4", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.OnTest|testGetNth()|3", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.HASH))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testGetNth()|6", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testGetNth()|5", nth))))).getNth()).getValue()))));
    }

    @org.junit.Test(expected = java.lang.RuntimeException.class)
    public void testOnlyNthFails() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.field.expression.OnTest|testOnlyNthFails()|4", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(null, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testOnlyNthFails()|1", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.OnTest|testOnlyNthFails()|0", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.HASH))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testOnlyNthFails()|3", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testOnlyNthFails()|2", nth)))));
        } catch (java.lang.RuntimeException a1552674205389) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.model.field.expression.OnTest|testOnlyNthFails()|!", a1552674205389);
            throw a1552674205389;
        }
    }

    @org.junit.Test
    public void testAsStringJustNumber() {
        int expression = 3;
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringJustNumber()|1", java.lang.String.format("%s", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringJustNumber()|0", expression))), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringJustNumber()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.field.expression.OnTest|testAsStringJustNumber()|4", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testAsStringJustNumber()|3", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringJustNumber()|2", expression))))).asString()));
    }

    @org.junit.Test
    public void testAsStringSpecialCharW() {
        java.lang.String expression = "1W";
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharW()|0", expression), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharW()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharW()|4", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharW()|1", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(1)), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharW()|3", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharW()|2", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.W))))).asString()));
    }

    @org.junit.Test
    public void testAsStringSpecialCharL() {
        java.lang.String expression = "L";
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharL()|0", expression), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharL()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharL()|3", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharL()|2", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.OnTest|testAsStringSpecialCharL()|1", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.L))))).asString()));
    }

    @org.junit.Test
    public void testAsStringWithNth() {
        int first = 3;
        int second = 4;
        java.lang.String expression = eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|2", java.lang.String.format("%s#%s", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|0", first), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|1", second)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|3", expression), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|10", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|5", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|4", first))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialCharFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|7", com.cronutils.model.field.value.SpecialCharFieldValue.class, new com.cronutils.model.field.value.SpecialCharFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.SpecialChar>observeState("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|6", com.cronutils.model.field.value.SpecialChar.class, com.cronutils.model.field.value.SpecialChar.HASH))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|9", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.OnTest|testAsStringWithNth()|8", second))))).asString()));
    }
}

