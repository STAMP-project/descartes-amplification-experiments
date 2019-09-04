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
 *
 *
 * @version $Id$
 */
public abstract class BinaryEncoderAbstractTest {
    protected abstract org.apache.commons.codec.BinaryEncoder makeEncoder();

    @org.junit.Test
    public void testEncodeEmpty() throws java.lang.Exception {
        final org.apache.commons.codec.BinaryEncoder encoder = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.BinaryEncoder>observeState("org.apache.commons.codec.BinaryEncoderAbstractTest|testEncodeEmpty()|0", org.apache.commons.codec.BinaryEncoder.class, makeEncoder());
        eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.BinaryEncoderAbstractTest|testEncodeEmpty()|3", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.BinaryEncoder>observeState("org.apache.commons.codec.BinaryEncoderAbstractTest|testEncodeEmpty()|1", org.apache.commons.codec.BinaryEncoder.class, encoder).encode(eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.BinaryEncoderAbstractTest|testEncodeEmpty()|2", byte[].class, new byte[0])));
    }

    @org.junit.Test
    public void testEncodeNull() throws java.lang.Exception {
        final org.apache.commons.codec.BinaryEncoder encoder = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.BinaryEncoder>observeState("org.apache.commons.codec.BinaryEncoderAbstractTest|testEncodeNull()|0", org.apache.commons.codec.BinaryEncoder.class, makeEncoder());
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<byte[]>observeState("org.apache.commons.codec.BinaryEncoderAbstractTest|testEncodeNull()|2", byte[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.codec.BinaryEncoder>observeState("org.apache.commons.codec.BinaryEncoderAbstractTest|testEncodeNull()|1", org.apache.commons.codec.BinaryEncoder.class, encoder).encode(null));
            org.junit.Assert.fail("EncoderException exptected");
        } catch (final org.apache.commons.codec.EncoderException ee) {
            // An exception should be thrown
        }
    }
}

