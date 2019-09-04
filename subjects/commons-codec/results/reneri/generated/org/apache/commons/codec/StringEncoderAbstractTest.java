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
public abstract class StringEncoderAbstractTest<T extends org.apache.commons.codec.StringEncoder> {
    protected T stringEncoder = this.createStringEncoder();

    public void checkEncoding(final java.lang.String expected, final java.lang.String source) throws org.apache.commons.codec.EncoderException {
        org.junit.Assert.assertEquals(("Source: " + source), expected, this.getStringEncoder().encode(source));
    }

    protected void checkEncodings(final java.lang.String[][] data) throws org.apache.commons.codec.EncoderException {
        for (final java.lang.String[] element : data) {
            this.checkEncoding(element[1], element[0]);
        }
    }

    protected void checkEncodingVariations(final java.lang.String expected, final java.lang.String[] data) throws org.apache.commons.codec.EncoderException {
        for (final java.lang.String element : data) {
            this.checkEncoding(expected, element);
        }
    }

    protected abstract T createStringEncoder();

    public T getStringEncoder() {
        return this.stringEncoder;
    }

    @org.junit.Test
    public void testEncodeEmpty() throws java.lang.Exception {
        final org.apache.commons.codec.Encoder encoder = this.getStringEncoder();
        encoder.encode("");
        encoder.encode(" ");
        encoder.encode("\t");
    }

    @org.junit.Test
    public void testEncodeNull() throws java.lang.Exception {
        final org.apache.commons.codec.StringEncoder encoder = this.getStringEncoder();
        try {
            encoder.encode(null);
        } catch (final org.apache.commons.codec.EncoderException ee) {
            // An exception should be thrown
        }
    }

    @org.junit.Test
    public void testEncodeWithInvalidObject() throws java.lang.Exception {
        boolean exceptionThrown = false;
        try {
            final org.apache.commons.codec.StringEncoder encoder = this.getStringEncoder();
            encoder.encode(new java.lang.Float(3.4));
        } catch (final java.lang.Exception e) {
            exceptionThrown = true;
        }
        org.junit.Assert.assertTrue(("An exception was not thrown when we tried to encode " + "a Float object"), exceptionThrown);
    }

    @org.junit.Test
    public void testLocaleIndependence() throws java.lang.Exception {
        final org.apache.commons.codec.StringEncoder encoder = this.getStringEncoder();
        final java.lang.String[] data = new java.lang.String[]{ "I", "i" };
        final java.util.Locale orig = java.util.Locale.getDefault();
        final java.util.Locale[] locales = new java.util.Locale[]{ java.util.Locale.ENGLISH, new java.util.Locale("tr"), java.util.Locale.getDefault() };
        try {
            for (final java.lang.String element : data) {
                java.lang.String ref = null;
                for (int j = 0; j < (locales.length); j++) {
                    java.util.Locale.setDefault(locales[j]);
                    if (j <= 0) {
                        ref = encoder.encode(element);
                    }else {
                        java.lang.String cur = null;
                        try {
                            cur = encoder.encode(element);
                        } catch (final java.lang.Exception e) {
                            org.junit.Assert.fail((((java.util.Locale.getDefault().toString()) + ": ") + (e.getMessage())));
                        }
                        org.junit.Assert.assertEquals(((java.util.Locale.getDefault().toString()) + ": "), ref, cur);
                    }
                }
            }
        } finally {
            java.util.Locale.setDefault(orig);
        }
    }
}

