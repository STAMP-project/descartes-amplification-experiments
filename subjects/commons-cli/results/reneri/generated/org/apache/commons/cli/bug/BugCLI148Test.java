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
package org.apache.commons.cli.bug;


/**
 * http://issues.apache.org/jira/browse/CLI-148
 */
// tests some deprecated classes
@java.lang.SuppressWarnings("deprecation")
public class BugCLI148Test {
    private org.apache.commons.cli.Options options;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|0", org.apache.commons.cli.Options.class, (options = new org.apache.commons.cli.Options()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|4", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|1", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|3", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|2", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.hasArg()).create('t'))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|8", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|5", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|7", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionBuilder>observeState("org.apache.commons.cli.bug.BugCLI148Test|setUp()|6", org.apache.commons.cli.OptionBuilder.class, org.apache.commons.cli.OptionBuilder.hasArg()).create('s'))));
    }

    @org.junit.Test
    public void testWorkaround1() throws java.lang.Exception {
        final org.apache.commons.cli.CommandLineParser parser = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.PosixParser>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround1()|0", org.apache.commons.cli.PosixParser.class, new org.apache.commons.cli.PosixParser());
        final java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround1()|1", java.lang.String[].class, new java.lang.String[]{ "-t-something" });
        final org.apache.commons.cli.CommandLine commandLine = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround1()|5", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround1()|2", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround1()|3", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround1()|4", java.lang.String[].class, args)));
        org.junit.Assert.assertEquals("-something", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround1()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround1()|6", org.apache.commons.cli.CommandLine.class, commandLine).getOptionValue('t')));
    }

    @org.junit.Test
    public void testWorkaround2() throws java.lang.Exception {
        final org.apache.commons.cli.CommandLineParser parser = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.PosixParser>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround2()|0", org.apache.commons.cli.PosixParser.class, new org.apache.commons.cli.PosixParser());
        final java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround2()|1", java.lang.String[].class, new java.lang.String[]{ "-t", "\"-something\"" });
        final org.apache.commons.cli.CommandLine commandLine = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround2()|5", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround2()|2", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround2()|3", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround2()|4", java.lang.String[].class, args)));
        org.junit.Assert.assertEquals("-something", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround2()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI148Test|testWorkaround2()|6", org.apache.commons.cli.CommandLine.class, commandLine).getOptionValue('t')));
    }
}

