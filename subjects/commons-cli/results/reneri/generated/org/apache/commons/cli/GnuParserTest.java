/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.cli;


// tests some deprecated classes
@java.lang.SuppressWarnings("deprecation")
public class GnuParserTest extends org.apache.commons.cli.ParserTestCase {
    @org.junit.Before
    public void setUp() {
        super.setUp();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.GnuParserTest|setUp()|0", org.apache.commons.cli.CommandLineParser.class, (parser = new org.apache.commons.cli.GnuParser()));
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testDoubleDash2() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testLongWithoutEqualSingleDash() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testAmbiguousLongWithoutEqualSingleDash() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser (CLI-184)")
    public void testNegativeOption() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testLongWithUnexpectedArgument1() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testLongWithUnexpectedArgument2() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testShortWithUnexpectedArgument() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testUnambiguousPartialLongOption1() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testUnambiguousPartialLongOption2() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testUnambiguousPartialLongOption3() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testUnambiguousPartialLongOption4() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testAmbiguousPartialLongOption1() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testAmbiguousPartialLongOption2() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testAmbiguousPartialLongOption3() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testAmbiguousPartialLongOption4() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testPartialLongOptionSingleDash() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testBursting() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testUnrecognizedOptionWithBursting() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testMissingArgWithBursting() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testStopBursting() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the GnuParser")
    public void testStopBursting2() throws java.lang.Exception {
    }
}

