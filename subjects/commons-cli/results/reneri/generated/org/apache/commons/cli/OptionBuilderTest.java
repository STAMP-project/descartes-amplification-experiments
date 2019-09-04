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


// OptionBuilder is marked deprecated
@java.lang.SuppressWarnings("deprecation")
public class OptionBuilderTest {
    @org.junit.Test
    public void testCompleteOption() {
        final org.apache.commons.cli.Option simple = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|6", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|5", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|4", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|3", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|2", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|1", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withLongOpt("simple option")).hasArg()).isRequired()).hasArgs()).withType(java.lang.Float.class)).withDescription("this is a simple option")).create('s'));
        org.junit.Assert.assertEquals("s", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|7", org.apache.commons.cli.Option.class, simple).getOpt()));
        org.junit.Assert.assertEquals("simple option", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|9", org.apache.commons.cli.Option.class, simple).getLongOpt()));
        org.junit.Assert.assertEquals("this is a simple option", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|11", org.apache.commons.cli.Option.class, simple).getDescription()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|14", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|13", org.apache.commons.cli.Option.class, simple).getType()), java.lang.Float.class);
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|15", org.apache.commons.cli.Option.class, simple).hasArg()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|17", org.apache.commons.cli.Option.class, simple).isRequired()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCompleteOption()|19", org.apache.commons.cli.Option.class, simple).hasArgs()));
    }

    @org.junit.Test
    public void testTwoCompleteOptions() {
        org.apache.commons.cli.Option simple = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|6", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|5", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|4", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|3", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|2", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|1", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withLongOpt("simple option")).hasArg()).isRequired()).hasArgs()).withType(java.lang.Float.class)).withDescription("this is a simple option")).create('s'));
        org.junit.Assert.assertEquals("s", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|7", org.apache.commons.cli.Option.class, simple).getOpt()));
        org.junit.Assert.assertEquals("simple option", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|9", org.apache.commons.cli.Option.class, simple).getLongOpt()));
        org.junit.Assert.assertEquals("this is a simple option", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|11", org.apache.commons.cli.Option.class, simple).getDescription()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|14", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|13", org.apache.commons.cli.Option.class, simple).getType()), java.lang.Float.class);
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|16", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|15", org.apache.commons.cli.Option.class, simple).hasArg()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|18", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|17", org.apache.commons.cli.Option.class, simple).isRequired()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|20", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|19", org.apache.commons.cli.Option.class, simple).hasArgs()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|24", org.apache.commons.cli.Option.class, (simple = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|23", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|22", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|21", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withLongOpt("dimple option")).hasArg()).withDescription("this is a dimple option")).create('d')));
        org.junit.Assert.assertEquals("d", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|26", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|25", org.apache.commons.cli.Option.class, simple).getOpt()));
        org.junit.Assert.assertEquals("dimple option", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|28", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|27", org.apache.commons.cli.Option.class, simple).getLongOpt()));
        org.junit.Assert.assertEquals("this is a dimple option", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|30", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|29", org.apache.commons.cli.Option.class, simple).getDescription()));
        org.junit.Assert.assertEquals(java.lang.String.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|32", java.lang.Object.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|31", org.apache.commons.cli.Option.class, simple).getType()));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|34", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|33", org.apache.commons.cli.Option.class, simple).hasArg()));
        org.junit.Assert.assertTrue((!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|36", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|35", org.apache.commons.cli.Option.class, simple).isRequired()))));
        org.junit.Assert.assertTrue((!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|38", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testTwoCompleteOptions()|37", org.apache.commons.cli.Option.class, simple).hasArgs()))));
    }

    @org.junit.Test
    public void testBaseOptionCharOpt() {
        final org.apache.commons.cli.Option base = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionCharOpt()|1", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionCharOpt()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withDescription("option description")).create('o'));
        org.junit.Assert.assertEquals("o", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testBaseOptionCharOpt()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionCharOpt()|2", org.apache.commons.cli.Option.class, base).getOpt()));
        org.junit.Assert.assertEquals("option description", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testBaseOptionCharOpt()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionCharOpt()|4", org.apache.commons.cli.Option.class, base).getDescription()));
        org.junit.Assert.assertTrue((!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testBaseOptionCharOpt()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionCharOpt()|6", org.apache.commons.cli.Option.class, base).hasArg()))));
    }

    @org.junit.Test
    public void testBaseOptionStringOpt() {
        final org.apache.commons.cli.Option base = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionStringOpt()|1", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionStringOpt()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withDescription("option description")).create("o"));
        org.junit.Assert.assertEquals("o", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testBaseOptionStringOpt()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionStringOpt()|2", org.apache.commons.cli.Option.class, base).getOpt()));
        org.junit.Assert.assertEquals("option description", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testBaseOptionStringOpt()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionStringOpt()|4", org.apache.commons.cli.Option.class, base).getDescription()));
        org.junit.Assert.assertTrue((!(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testBaseOptionStringOpt()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBaseOptionStringOpt()|6", org.apache.commons.cli.Option.class, base).hasArg()))));
    }

    @org.junit.Test
    public void testSpecialOptChars() throws java.lang.Exception {
        // '?'
        final org.apache.commons.cli.Option opt1 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|1", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withDescription("help options")).create('?'));
        org.junit.Assert.assertEquals("?", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|2", org.apache.commons.cli.Option.class, opt1).getOpt()));
        // '@'
        final org.apache.commons.cli.Option opt2 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|5", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|4", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withDescription("read from stdin")).create('@'));
        org.junit.Assert.assertEquals("@", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|6", org.apache.commons.cli.Option.class, opt2).getOpt()));
        // ' '
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testSpecialOptChars()|8", org.apache.commons.cli.Option.class, org.apache.commons.cli.OptionBuilder.create(' '));
            org.junit.Assert.fail("IllegalArgumentException not caught");
        } catch (final java.lang.IllegalArgumentException e) {
            // success
        }
    }

    @org.junit.Test
    public void testOptionArgNumbers() {
        final org.apache.commons.cli.Option opt = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testOptionArgNumbers()|2", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testOptionArgNumbers()|1", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testOptionArgNumbers()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withDescription("option description")).hasArgs(2)).create('o'));
        org.junit.Assert.assertEquals(2, eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testOptionArgNumbers()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testOptionArgNumbers()|3", org.apache.commons.cli.Option.class, opt).getArgs()));
    }

    @org.junit.Test
    public void testIllegalOptions() {
        // bad single character option
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testIllegalOptions()|1", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testIllegalOptions()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withDescription("option description")).create('"'));
            org.junit.Assert.fail("IllegalArgumentException not caught");
        } catch (final java.lang.IllegalArgumentException exp) {
            // success
        }
        // bad character in option string
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testIllegalOptions()|2", org.apache.commons.cli.Option.class, org.apache.commons.cli.OptionBuilder.create("opt`"));
            org.junit.Assert.fail("IllegalArgumentException not caught");
        } catch (final java.lang.IllegalArgumentException exp) {
            // success
        }
        // valid option
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testIllegalOptions()|3", org.apache.commons.cli.Option.class, org.apache.commons.cli.OptionBuilder.create("opt"));
            // success
        } catch (final java.lang.IllegalArgumentException exp) {
            org.junit.Assert.fail("IllegalArgumentException caught");
        }
    }

    @org.junit.Test
    public void testCreateIncompleteOption() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCreateIncompleteOption()|1", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testCreateIncompleteOption()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.hasArg()).create());
            org.junit.Assert.fail("Incomplete option should be rejected");
        } catch (final java.lang.IllegalArgumentException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testCreateIncompleteOption()|2", org.apache.commons.cli.Option.class, // expected
            // implicitly reset the builder
            org.apache.commons.cli.OptionBuilder.create("opt"));
        }
    }

    @org.junit.Test
    public void testBuilderIsResettedAlways() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBuilderIsResettedAlways()|1", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testBuilderIsResettedAlways()|0", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withDescription("JUnit")).create('"'));
            org.junit.Assert.fail("IllegalArgumentException expected");
        } catch (final java.lang.IllegalArgumentException e) {
            // expected
        }
        org.junit.Assert.assertNull("we inherited a description", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testBuilderIsResettedAlways()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBuilderIsResettedAlways()|2", org.apache.commons.cli.Option.class, org.apache.commons.cli.OptionBuilder.create('x')).getDescription()));
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBuilderIsResettedAlways()|5", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.OptionBuilderTest|testBuilderIsResettedAlways()|4", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withDescription("JUnit")).create());
            org.junit.Assert.fail("IllegalArgumentException expected");
        } catch (final java.lang.IllegalArgumentException e) {
            // expected
        }
        org.junit.Assert.assertNull("we inherited a description", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.OptionBuilderTest|testBuilderIsResettedAlways()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.OptionBuilderTest|testBuilderIsResettedAlways()|6", org.apache.commons.cli.Option.class, org.apache.commons.cli.OptionBuilder.create('x')).getDescription()));
    }
}

