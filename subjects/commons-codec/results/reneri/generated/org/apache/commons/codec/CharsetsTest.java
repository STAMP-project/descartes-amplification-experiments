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
 * Sanity checks for {@link Charsets}.
 *
 * @version $Id: CharEncodingTest.java 1298985 2012-03-09 19:12:49Z ggregory $
 */
public class CharsetsTest {
    @org.junit.Test
    public void testToCharset() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|0", java.nio.charset.Charset.class, java.nio.charset.Charset.defaultCharset()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|1", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.toCharset(((java.lang.String) (null)))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|2", java.nio.charset.Charset.class, java.nio.charset.Charset.defaultCharset()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|3", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.toCharset(((java.nio.charset.Charset) (null)))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|4", java.nio.charset.Charset.class, java.nio.charset.Charset.defaultCharset()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|6", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.toCharset(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|5", java.nio.charset.Charset.class, java.nio.charset.Charset.defaultCharset()))));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|7", java.nio.charset.Charset.class, java.nio.charset.Charset.forName("UTF-8")), eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|9", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.toCharset(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testToCharset()|8", java.nio.charset.Charset.class, java.nio.charset.Charset.forName("UTF-8")))));
    }

    @org.junit.Test
    public void testIso8859_1() {
        org.junit.Assert.assertEquals("ISO-8859-1", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.CharsetsTest|testIso8859_1()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testIso8859_1()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.ISO_8859_1).name()));
    }

    @org.junit.Test
    public void testUsAscii() {
        org.junit.Assert.assertEquals("US-ASCII", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.CharsetsTest|testUsAscii()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testUsAscii()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.US_ASCII).name()));
    }

    @org.junit.Test
    public void testUtf16() {
        org.junit.Assert.assertEquals("UTF-16", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.CharsetsTest|testUtf16()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testUtf16()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_16).name()));
    }

    @org.junit.Test
    public void testUtf16Be() {
        org.junit.Assert.assertEquals("UTF-16BE", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.CharsetsTest|testUtf16Be()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testUtf16Be()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_16BE).name()));
    }

    @org.junit.Test
    public void testUtf16Le() {
        org.junit.Assert.assertEquals("UTF-16LE", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.CharsetsTest|testUtf16Le()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testUtf16Le()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_16LE).name()));
    }

    @org.junit.Test
    public void testUtf8() {
        org.junit.Assert.assertEquals("UTF-8", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.codec.CharsetsTest|testUtf8()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.charset.Charset>observeState("org.apache.commons.codec.CharsetsTest|testUtf8()|0", java.nio.charset.Charset.class, org.apache.commons.codec.Charsets.UTF_8).name()));
    }
}

