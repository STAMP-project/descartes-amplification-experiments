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
public class EveryTest {
    @org.junit.Test
    public void testGetTime() throws java.lang.Exception {
        int every = 5;
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.EveryTest|testGetTime()|0", every), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.EveryTest|testGetTime()|5", ((int) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.EveryTest|testGetTime()|4", com.cronutils.model.field.value.IntegerFieldValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Every>observeState("com.cronutils.model.field.expression.EveryTest|testGetTime()|3", com.cronutils.model.field.expression.Every.class, new com.cronutils.model.field.expression.Every(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.EveryTest|testGetTime()|2", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.EveryTest|testGetTime()|1", every))))).getPeriod()).getValue()))));
    }

    @org.junit.Test
    public void testGetTimeNull() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.EveryTest|testGetTimeNull()|2", ((int) (eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.EveryTest|testGetTimeNull()|1", com.cronutils.model.field.value.IntegerFieldValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Every>observeState("com.cronutils.model.field.expression.EveryTest|testGetTimeNull()|0", com.cronutils.model.field.expression.Every.class, new com.cronutils.model.field.expression.Every(null)).getPeriod()).getValue()))));
    }

    // issue #180
    @org.junit.Test
    public void testAsString() throws java.lang.Exception {
        org.junit.Assert.assertEquals("0/1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.field.expression.EveryTest|testAsString()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.Every>observeState("com.cronutils.model.field.expression.EveryTest|testAsString()|3", com.cronutils.model.field.expression.Every.class, new com.cronutils.model.field.expression.Every(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.expression.On>observeState("com.cronutils.model.field.expression.EveryTest|testAsString()|1", com.cronutils.model.field.expression.On.class, new com.cronutils.model.field.expression.On(eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.EveryTest|testAsString()|0", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(0)))), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.field.value.IntegerFieldValue>observeState("com.cronutils.model.field.expression.EveryTest|testAsString()|2", com.cronutils.model.field.value.IntegerFieldValue.class, new com.cronutils.model.field.value.IntegerFieldValue(1)))).asString()));
    }
}

