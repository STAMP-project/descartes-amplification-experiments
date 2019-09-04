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
 * Tests {@link DecoderException}.
 *
 * @version $Id$
 */
public class DecoderExceptionTest {
    private static final java.lang.String MSG = "TEST";

    private static final java.lang.Throwable t = new java.lang.Exception();

    @org.junit.Test
    public void testConstructor0() {
        final org.apache.commons.codec.DecoderException e = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructor0()|0", org.apache.commons.codec.DecoderException.class, new org.apache.commons.codec.DecoderException());
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.DecoderExceptionTest|testConstructor0()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructor0()|1", org.apache.commons.codec.DecoderException.class, e).getMessage()));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructor0()|4", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructor0()|3", org.apache.commons.codec.DecoderException.class, e).getCause()));
    }

    @org.junit.Test
    public void testConstructorString() {
        final org.apache.commons.codec.DecoderException e = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorString()|0", org.apache.commons.codec.DecoderException.class, new org.apache.commons.codec.DecoderException(org.apache.commons.codec.DecoderExceptionTest.MSG));
        org.junit.Assert.assertEquals(org.apache.commons.codec.DecoderExceptionTest.MSG, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.DecoderExceptionTest|testConstructorString()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorString()|1", org.apache.commons.codec.DecoderException.class, e).getMessage()));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorString()|4", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorString()|3", org.apache.commons.codec.DecoderException.class, e).getCause()));
    }

    @org.junit.Test
    public void testConstructorStringThrowable() {
        final org.apache.commons.codec.DecoderException e = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorStringThrowable()|1", org.apache.commons.codec.DecoderException.class, new org.apache.commons.codec.DecoderException(org.apache.commons.codec.DecoderExceptionTest.MSG, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorStringThrowable()|0", java.lang.Throwable.class, org.apache.commons.codec.DecoderExceptionTest.t)));
        org.junit.Assert.assertEquals(org.apache.commons.codec.DecoderExceptionTest.MSG, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.DecoderExceptionTest|testConstructorStringThrowable()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorStringThrowable()|2", org.apache.commons.codec.DecoderException.class, e).getMessage()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorStringThrowable()|4", java.lang.Throwable.class, org.apache.commons.codec.DecoderExceptionTest.t), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorStringThrowable()|6", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorStringThrowable()|5", org.apache.commons.codec.DecoderException.class, e).getCause()));
    }

    @org.junit.Test
    public void testConstructorThrowable() {
        final org.apache.commons.codec.DecoderException e = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|1", org.apache.commons.codec.DecoderException.class, new org.apache.commons.codec.DecoderException(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|0", java.lang.Throwable.class, org.apache.commons.codec.DecoderExceptionTest.t)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|2", java.lang.Throwable.class, org.apache.commons.codec.DecoderExceptionTest.t).getClass().getName()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|4", org.apache.commons.codec.DecoderException.class, e).getMessage()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|6", java.lang.Throwable.class, org.apache.commons.codec.DecoderExceptionTest.t), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Throwable>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|8", java.lang.Throwable.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.DecoderException>observeState("org.apache.commons.codec.DecoderExceptionTest|testConstructorThrowable()|7", org.apache.commons.codec.DecoderException.class, e).getCause()));
    }
}

