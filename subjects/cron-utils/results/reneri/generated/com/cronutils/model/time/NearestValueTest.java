package com.cronutils.model.time;


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
public class NearestValueTest {
    private int value;

    private int shifts;

    private com.cronutils.model.time.NearestValue nearestValue;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.NearestValueTest|setUp()|0", (value = 1));
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.NearestValueTest|setUp()|1", (shifts = 1));
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.NearestValue>observeState("com.cronutils.model.time.NearestValueTest|setUp()|4", com.cronutils.model.time.NearestValue.class, (nearestValue = new com.cronutils.model.time.NearestValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.NearestValueTest|setUp()|2", value), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.NearestValueTest|setUp()|3", shifts))));
    }

    @org.junit.Test
    public void testGetValue() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.NearestValueTest|testGetValue()|0", value), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.NearestValueTest|testGetValue()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.NearestValue>observeState("com.cronutils.model.time.NearestValueTest|testGetValue()|1", com.cronutils.model.time.NearestValue.class, nearestValue).getValue()));
    }

    @org.junit.Test
    public void testGetShifts() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.NearestValueTest|testGetShifts()|0", shifts), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.model.time.NearestValueTest|testGetShifts()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.model.time.NearestValue>observeState("com.cronutils.model.time.NearestValueTest|testGetShifts()|1", com.cronutils.model.time.NearestValue.class, nearestValue).getShifts()));
    }
}

