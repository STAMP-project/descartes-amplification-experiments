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
 * Sanity checks for {@link CharEncoding}.
 *
 * @version $Id$
 */
public class CharEncodingTest {
    /**
     * We could make the constructor private in the future, it's a matter a style.
     */
    @org.junit.Test
    public void testConstructor() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.CharEncoding>observeState("org.apache.commons.codec.CharEncodingTest|testConstructor()|0", org.apache.commons.codec.CharEncoding.class, new org.apache.commons.codec.CharEncoding());
    }

    @org.junit.Test
    public void testIso8859_1() {
        org.junit.Assert.assertEquals("ISO-8859-1", org.apache.commons.codec.CharEncoding.ISO_8859_1);
    }

    @org.junit.Test
    public void testUsAscii() {
        org.junit.Assert.assertEquals("US-ASCII", org.apache.commons.codec.CharEncoding.US_ASCII);
    }

    @org.junit.Test
    public void testUtf16() {
        org.junit.Assert.assertEquals("UTF-16", org.apache.commons.codec.CharEncoding.UTF_16);
    }

    @org.junit.Test
    public void testUtf16Be() {
        org.junit.Assert.assertEquals("UTF-16BE", org.apache.commons.codec.CharEncoding.UTF_16BE);
    }

    @org.junit.Test
    public void testUtf16Le() {
        org.junit.Assert.assertEquals("UTF-16LE", org.apache.commons.codec.CharEncoding.UTF_16LE);
    }

    @org.junit.Test
    public void testUtf8() {
        org.junit.Assert.assertEquals("UTF-8", org.apache.commons.codec.CharEncoding.UTF_8);
    }
}

