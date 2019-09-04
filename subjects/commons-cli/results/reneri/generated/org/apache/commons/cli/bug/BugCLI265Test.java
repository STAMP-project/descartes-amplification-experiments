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
package org.apache.commons.cli.bug;


/**
 * Test for CLI-265.
 * <p>
 * The issue is that a short option with an optional value will use whatever comes next as value.
 */
public class BugCLI265Test {
    private org.apache.commons.cli.DefaultParser parser;

    private org.apache.commons.cli.Options options;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.DefaultParser>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|0", org.apache.commons.cli.DefaultParser.class, (parser = new org.apache.commons.cli.DefaultParser()));
        final org.apache.commons.cli.Option optionT1 = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|6", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|5", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|4", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|3", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|2", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|1", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("t1")).hasArg()).numberOfArgs(1)).optionalArg(true)).argName("t1_path")).build());
        final org.apache.commons.cli.Option optionA = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|9", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|8", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|7", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("a")).hasArg(false)).build());
        final org.apache.commons.cli.Option optionB = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|12", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|11", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|10", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("b")).hasArg(false)).build());
        final org.apache.commons.cli.Option optionLast = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|15", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|14", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|13", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("last")).hasArg(false)).build());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|24", org.apache.commons.cli.Options.class, (options = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|22", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|20", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|18", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|16", org.apache.commons.cli.Options.class, new org.apache.commons.cli.Options()).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|17", org.apache.commons.cli.Option.class, optionT1))).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|19", org.apache.commons.cli.Option.class, optionA))).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|21", org.apache.commons.cli.Option.class, optionB))).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI265Test|setUp()|23", org.apache.commons.cli.Option.class, optionLast))));
    }

    @org.junit.Test
    public void shouldParseShortOptionWithValue() throws java.lang.Exception {
        final java.lang.String[] shortOptionWithValue = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|0", java.lang.String[].class, new java.lang.String[]{ "-t1", "path/to/my/db" });
        final org.apache.commons.cli.CommandLine commandLine = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.DefaultParser>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|1", org.apache.commons.cli.DefaultParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|3", java.lang.String[].class, shortOptionWithValue)));
        org.junit.Assert.assertEquals("path/to/my/db", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|5", org.apache.commons.cli.CommandLine.class, commandLine).getOptionValue("t1")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithValue()|7", org.apache.commons.cli.CommandLine.class, commandLine).hasOption("last")));
    }

    @org.junit.Test
    public void shouldParseShortOptionWithoutValue() throws java.lang.Exception {
        final java.lang.String[] twoShortOptions = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|0", java.lang.String[].class, new java.lang.String[]{ "-t1", "-last" });
        final org.apache.commons.cli.CommandLine commandLine = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.DefaultParser>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|1", org.apache.commons.cli.DefaultParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|3", java.lang.String[].class, twoShortOptions)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|5", org.apache.commons.cli.CommandLine.class, commandLine).hasOption("t1")));
        org.junit.Assert.assertNotEquals("Second option has been used as value for first option", "-last", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|7", org.apache.commons.cli.CommandLine.class, commandLine).getOptionValue("t1")));
        org.junit.Assert.assertTrue("Second option has not been detected", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseShortOptionWithoutValue()|9", org.apache.commons.cli.CommandLine.class, commandLine).hasOption("last")));
    }

    @org.junit.Test
    public void shouldParseConcatenatedShortOptions() throws java.lang.Exception {
        final java.lang.String[] concatenatedShortOptions = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|0", java.lang.String[].class, new java.lang.String[]{ "-t1", "-ab" });
        final org.apache.commons.cli.CommandLine commandLine = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.DefaultParser>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|1", org.apache.commons.cli.DefaultParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|3", java.lang.String[].class, concatenatedShortOptions)));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|5", org.apache.commons.cli.CommandLine.class, commandLine).hasOption("t1")));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|7", org.apache.commons.cli.CommandLine.class, commandLine).getOptionValue("t1")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|9", org.apache.commons.cli.CommandLine.class, commandLine).hasOption("a")));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|11", org.apache.commons.cli.CommandLine.class, commandLine).hasOption("b")));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|14", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI265Test|shouldParseConcatenatedShortOptions()|13", org.apache.commons.cli.CommandLine.class, commandLine).hasOption("last")));
    }
}

