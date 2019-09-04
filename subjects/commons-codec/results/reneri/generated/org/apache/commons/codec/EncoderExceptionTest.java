/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.codec;


/**
 * Tests {@link EncoderException}.
 *
 * @version $Id$
 */
public class EncoderExceptionTest {
    private static final java.lang.String MSG = "TEST";

    private static final java.lang.Throwable t = new java.lang.Exception();

    @org.junit.Test
    public void testConstructor0() {
        final org.apache.commons.codec.EncoderException e = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructor0()|0", org.apache.commons.codec.EncoderException.class, new org.apache.commons.codec.EncoderException());
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.EncoderExceptionTest|testConstructor0()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructor0()|1", org.apache.commons.codec.EncoderException.class, e).getMessage()));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructor0()|4", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructor0()|3", org.apache.commons.codec.EncoderException.class, e).getCause()));
    }

    @org.junit.Test
    public void testConstructorString() {
        final org.apache.commons.codec.EncoderException e = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorString()|0", org.apache.commons.codec.EncoderException.class, new org.apache.commons.codec.EncoderException(org.apache.commons.codec.EncoderExceptionTest.MSG));
        org.junit.Assert.assertEquals(org.apache.commons.codec.EncoderExceptionTest.MSG, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.EncoderExceptionTest|testConstructorString()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorString()|1", org.apache.commons.codec.EncoderException.class, e).getMessage()));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorString()|4", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorString()|3", org.apache.commons.codec.EncoderException.class, e).getCause()));
    }

    @org.junit.Test
    public void testConstructorStringThrowable() {
        final org.apache.commons.codec.EncoderException e = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorStringThrowable()|1", org.apache.commons.codec.EncoderException.class, new org.apache.commons.codec.EncoderException(org.apache.commons.codec.EncoderExceptionTest.MSG, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorStringThrowable()|0", java.lang.Throwable.class, org.apache.commons.codec.EncoderExceptionTest.t)));
        org.junit.Assert.assertEquals(org.apache.commons.codec.EncoderExceptionTest.MSG, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.EncoderExceptionTest|testConstructorStringThrowable()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorStringThrowable()|2", org.apache.commons.codec.EncoderException.class, e).getMessage()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorStringThrowable()|4", java.lang.Throwable.class, org.apache.commons.codec.EncoderExceptionTest.t), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorStringThrowable()|6", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorStringThrowable()|5", org.apache.commons.codec.EncoderException.class, e).getCause()));
    }

    @org.junit.Test
    public void testConstructorThrowable() {
        final org.apache.commons.codec.EncoderException e = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|1", org.apache.commons.codec.EncoderException.class, new org.apache.commons.codec.EncoderException(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|0", java.lang.Throwable.class, org.apache.commons.codec.EncoderExceptionTest.t)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|2", java.lang.Throwable.class, org.apache.commons.codec.EncoderExceptionTest.t).getClass().getName()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|4", org.apache.commons.codec.EncoderException.class, e).getMessage()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|6", java.lang.Throwable.class, org.apache.commons.codec.EncoderExceptionTest.t), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|8", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.EncoderException>observeState("org.apache.commons.codec.EncoderExceptionTest|testConstructorThrowable()|7", org.apache.commons.codec.EncoderException.class, e).getCause()));
    }
}

