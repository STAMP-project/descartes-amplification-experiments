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
public class ArgumentIsOptionTest {
    private org.apache.commons.cli.Options options = null;

    private org.apache.commons.cli.CommandLineParser parser = null;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.ArgumentIsOptionTest|setUp()|2", org.apache.commons.cli.Options.class, (options = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.ArgumentIsOptionTest|setUp()|1", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.ArgumentIsOptionTest|setUp()|0", org.apache.commons.cli.Options.class, new org.apache.commons.cli.Options()).addOption("p", false, "Option p")).addOption("attr", true, "Option accepts argument")));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.ArgumentIsOptionTest|setUp()|3", org.apache.commons.cli.CommandLineParser.class, (parser = new org.apache.commons.cli.PosixParser()));
    }

    @org.junit.Test
    public void testOptionAndOptionWithArgument() throws java.lang.Exception {
        final java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|0", java.lang.String[].class, new java.lang.String[]{ "-p", "-attr", "p" });
        final org.apache.commons.cli.CommandLine cl = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|1", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|3", java.lang.String[].class, args)));
        org.junit.Assert.assertTrue("Confirm -p is set", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|5", org.apache.commons.cli.CommandLine.class, cl).hasOption("p")));
        org.junit.Assert.assertTrue("Confirm -attr is set", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|7", org.apache.commons.cli.CommandLine.class, cl).hasOption("attr")));
        org.junit.Assert.assertTrue("Confirm arg of -attr", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|11", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|9", org.apache.commons.cli.CommandLine.class, cl).getOptionValue("attr")).equals("p")));
        org.junit.Assert.assertTrue("Confirm all arguments recognized", ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|13", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionAndOptionWithArgument()|12", org.apache.commons.cli.CommandLine.class, cl).getArgs()).length)) == 0));
    }

    @org.junit.Test
    public void testOptionWithArgument() throws java.lang.Exception {
        final java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|0", java.lang.String[].class, new java.lang.String[]{ "-attr", "p" });
        final org.apache.commons.cli.CommandLine cl = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|1", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|3", java.lang.String[].class, args)));
        org.junit.Assert.assertFalse("Confirm -p is set", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|5", org.apache.commons.cli.CommandLine.class, cl).hasOption("p")));
        org.junit.Assert.assertTrue("Confirm -attr is set", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|7", org.apache.commons.cli.CommandLine.class, cl).hasOption("attr")));
        org.junit.Assert.assertTrue("Confirm arg of -attr", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|11", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|9", org.apache.commons.cli.CommandLine.class, cl).getOptionValue("attr")).equals("p")));
        org.junit.Assert.assertTrue("Confirm all arguments recognized", ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|13", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOptionWithArgument()|12", org.apache.commons.cli.CommandLine.class, cl).getArgs()).length)) == 0));
    }

    @org.junit.Test
    public void testOption() throws java.lang.Exception {
        final java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|0", java.lang.String[].class, new java.lang.String[]{ "-p" });
        final org.apache.commons.cli.CommandLine cl = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|1", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|3", java.lang.String[].class, args)));
        org.junit.Assert.assertTrue("Confirm -p is set", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|5", org.apache.commons.cli.CommandLine.class, cl).hasOption("p")));
        org.junit.Assert.assertFalse("Confirm -attr is not set", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|7", org.apache.commons.cli.CommandLine.class, cl).hasOption("attr")));
        org.junit.Assert.assertTrue("Confirm all arguments recognized", ((eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|10", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.ArgumentIsOptionTest|testOption()|9", org.apache.commons.cli.CommandLine.class, cl).getArgs()).length)) == 0));
    }
}

