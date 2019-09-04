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


// tests some deprecated classes
@java.lang.SuppressWarnings("deprecation")
public class BugCLI13Test {
    @org.junit.Test
    public void testCLI13() throws org.apache.commons.cli.ParseException {
        final java.lang.String debugOpt = "debug";
        @java.lang.SuppressWarnings("static-access")
        final org.apache.commons.cli.Option debug = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|6", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|5", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|4", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|2", org.apache.commons.cli.OptionBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|1", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.withArgName(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|0", debugOpt))).withDescription("turn on debugging")).withLongOpt(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|3", debugOpt))).hasArg()).create('d'));
        final org.apache.commons.cli.Options options = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|7", org.apache.commons.cli.Options.class, new org.apache.commons.cli.Options());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|10", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|8", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|9", org.apache.commons.cli.Option.class, debug)));
        final org.apache.commons.cli.CommandLine commandLine = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|14", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.PosixParser>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|11", org.apache.commons.cli.PosixParser.class, new org.apache.commons.cli.PosixParser()).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|12", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|13", java.lang.String[].class, new java.lang.String[]{ "-d", "true" })));
        org.junit.Assert.assertEquals("true", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|17", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|15", org.apache.commons.cli.CommandLine.class, commandLine).getOptionValue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|16", debugOpt))));
        org.junit.Assert.assertEquals("true", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|19", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|18", org.apache.commons.cli.CommandLine.class, commandLine).getOptionValue('d')));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|20", org.apache.commons.cli.CommandLine.class, commandLine).hasOption('d')));
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|24", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|22", org.apache.commons.cli.CommandLine.class, commandLine).hasOption(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI13Test|testCLI13()|23", debugOpt))));
    }
}

