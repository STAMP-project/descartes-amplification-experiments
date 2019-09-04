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
package org.apache.commons.codec.digest;


public class B64Test {
    @org.junit.Test
    public void testB64T() {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.digest.B64>observeState("org.apache.commons.codec.digest.B64Test|testB64T()|0", org.apache.commons.codec.digest.B64.class, new org.apache.commons.codec.digest.B64()));// for the 100% code coverage :)

        org.junit.Assert.assertEquals(64, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.B64Test|testB64T()|1", org.apache.commons.codec.digest.B64.B64T.length()));
    }

    @org.junit.Test
    public void testB64from24bit() {
        final java.lang.StringBuilder buffer = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.digest.B64Test|testB64from24bit()|0", java.lang.StringBuilder.class, new java.lang.StringBuilder(""));
        org.apache.commons.codec.digest.B64.b64from24bit(((byte) (8)), ((byte) (16)), ((byte) (64)), 2, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.digest.B64Test|testB64from24bit()|1", java.lang.StringBuilder.class, buffer));
        org.apache.commons.codec.digest.B64.b64from24bit(((byte) (7)), ((byte) (77)), ((byte) (120)), 4, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.digest.B64Test|testB64from24bit()|2", java.lang.StringBuilder.class, buffer));
        org.junit.Assert.assertEquals("./spo/", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.digest.B64Test|testB64from24bit()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.apache.commons.codec.digest.B64Test|testB64from24bit()|3", java.lang.StringBuilder.class, buffer).toString()));
    }
}

