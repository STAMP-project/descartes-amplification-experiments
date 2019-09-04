package com.cronutils.mapper;


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
public class WeekDayTest {
    private com.cronutils.mapper.WeekDay source;

    private int mondayDoWValue = 1;

    private boolean firstDayIsZero = false;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|setUp()|2", com.cronutils.mapper.WeekDay.class, (this.source = new com.cronutils.mapper.WeekDay(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|setUp()|0", mondayDoWValue), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|setUp()|1", firstDayIsZero))));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testConstructorFailsIfMondayDoWNegative() throws java.lang.Exception {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testConstructorFailsIfMondayDoWNegative()|1", com.cronutils.mapper.WeekDay.class, new com.cronutils.mapper.WeekDay((-1), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testConstructorFailsIfMondayDoWNegative()|0", firstDayIsZero)));
        } catch (java.lang.IllegalArgumentException a1552674205181) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("com.cronutils.mapper.WeekDayTest|testConstructorFailsIfMondayDoWNegative()|!", a1552674205181);
            throw a1552674205181;
        }
    }

    @org.junit.Test
    public void testGetMondayDoWValue() throws java.lang.Exception {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testGetMondayDoWValue()|0", mondayDoWValue), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testGetMondayDoWValue()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testGetMondayDoWValue()|1", com.cronutils.mapper.WeekDay.class, source).getMondayDoWValue()));
    }

    @org.junit.Test
    public void testMapIntervalWithZeroNotStartingMonday() throws java.lang.Exception {
        com.cronutils.mapper.WeekDay target = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithZeroNotStartingMonday()|0", com.cronutils.mapper.WeekDay.class, new com.cronutils.mapper.WeekDay(1, true));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testMapIntervalWithZeroNotStartingMonday()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithZeroNotStartingMonday()|1", com.cronutils.mapper.WeekDay.class, source).mapTo(7, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithZeroNotStartingMonday()|2", com.cronutils.mapper.WeekDay.class, target))));
    }

    @org.junit.Test
    public void testMapIntervalWithZeroStartingMonday() throws java.lang.Exception {
        com.cronutils.mapper.WeekDay target = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithZeroStartingMonday()|0", com.cronutils.mapper.WeekDay.class, new com.cronutils.mapper.WeekDay(0, true));
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testMapIntervalWithZeroStartingMonday()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithZeroStartingMonday()|1", com.cronutils.mapper.WeekDay.class, source).mapTo(1, eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithZeroStartingMonday()|2", com.cronutils.mapper.WeekDay.class, target))));
    }

    @org.junit.Test
    public void testMapIntervalWithoutZeroStartingMonday() throws java.lang.Exception {
        int value = 7;
        com.cronutils.mapper.WeekDay target = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingMonday()|0", com.cronutils.mapper.WeekDay.class, new com.cronutils.mapper.WeekDay(1, false));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingMonday()|1", value), eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingMonday()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingMonday()|2", com.cronutils.mapper.WeekDay.class, source).mapTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingMonday()|3", value), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingMonday()|4", com.cronutils.mapper.WeekDay.class, target))));
    }

    @org.junit.Test
    public void testMapIntervalWithoutZeroStartingSunday() throws java.lang.Exception {
        int value = 7;
        com.cronutils.mapper.WeekDay target = eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingSunday()|0", com.cronutils.mapper.WeekDay.class, new com.cronutils.mapper.WeekDay(2, false));
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingSunday()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingSunday()|1", com.cronutils.mapper.WeekDay.class, source).mapTo(eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingSunday()|2", value), eu.stamp_project.reneri.instrumentation.StateObserver.<com.cronutils.mapper.WeekDay>observeState("com.cronutils.mapper.WeekDayTest|testMapIntervalWithoutZeroStartingSunday()|3", com.cronutils.mapper.WeekDay.class, target))));
    }
}

