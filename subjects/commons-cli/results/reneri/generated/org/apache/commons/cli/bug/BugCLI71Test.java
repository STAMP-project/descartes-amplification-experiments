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
public class BugCLI71Test {
    private org.apache.commons.cli.Options options;

    private org.apache.commons.cli.CommandLineParser parser;

    @org.junit.Before
    public void setUp() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|0", org.apache.commons.cli.Options.class, (options = new org.apache.commons.cli.Options()));
        final org.apache.commons.cli.Option algorithm = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|1", org.apache.commons.cli.Option.class, new org.apache.commons.cli.Option("a", "algo", true, "the algorithm which it to perform executing"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|2", org.apache.commons.cli.Option.class, algorithm).setArgName("algorithm name");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|5", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|3", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|4", org.apache.commons.cli.Option.class, algorithm)));
        final org.apache.commons.cli.Option key = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|6", org.apache.commons.cli.Option.class, new org.apache.commons.cli.Option("k", "key", true, "the key the setted algorithm uses to process"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|7", org.apache.commons.cli.Option.class, algorithm).setArgName("value");
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|10", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|8", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|9", org.apache.commons.cli.Option.class, key)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.bug.BugCLI71Test|setUp()|11", org.apache.commons.cli.CommandLineParser.class, (parser = new org.apache.commons.cli.PosixParser()));
    }

    @org.junit.Test
    public void testBasic() throws java.lang.Exception {
        final java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|0", java.lang.String[].class, new java.lang.String[]{ "-a", "Caesar", "-k", "A" });
        final org.apache.commons.cli.CommandLine line = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|1", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|3", java.lang.String[].class, args)));
        org.junit.Assert.assertEquals("Caesar", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|5", org.apache.commons.cli.CommandLine.class, line).getOptionValue("a")));
        org.junit.Assert.assertEquals("A", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testBasic()|7", org.apache.commons.cli.CommandLine.class, line).getOptionValue("k")));
    }

    @org.junit.Test
    public void testMistakenArgument() throws java.lang.Exception {
        java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|0", java.lang.String[].class, new java.lang.String[]{ "-a", "Caesar", "-k", "A" });
        org.apache.commons.cli.CommandLine line = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|1", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|3", java.lang.String[].class, args)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|5", java.lang.String[].class, (args = new java.lang.String[]{ "-a", "Caesar", "-k", "a" }));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|9", org.apache.commons.cli.CommandLine.class, (line = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|6", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|7", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|8", java.lang.String[].class, args))));
        org.junit.Assert.assertEquals("Caesar", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|10", org.apache.commons.cli.CommandLine.class, line).getOptionValue("a")));
        org.junit.Assert.assertEquals("a", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testMistakenArgument()|12", org.apache.commons.cli.CommandLine.class, line).getOptionValue("k")));
    }

    @org.junit.Test
    public void testLackOfError() throws java.lang.Exception {
        final java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testLackOfError()|0", java.lang.String[].class, new java.lang.String[]{ "-k", "-a", "Caesar" });
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testLackOfError()|4", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.bug.BugCLI71Test|testLackOfError()|1", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|testLackOfError()|2", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testLackOfError()|3", java.lang.String[].class, args)));
            org.junit.Assert.fail("MissingArgumentException expected");
        } catch (final org.apache.commons.cli.MissingArgumentException e) {
            org.junit.Assert.assertEquals("option missing an argument", "k", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI71Test|testLackOfError()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI71Test|testLackOfError()|6", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.MissingArgumentException>observeState("org.apache.commons.cli.bug.BugCLI71Test|testLackOfError()|5", org.apache.commons.cli.MissingArgumentException.class, e).getOption()).getOpt()));
        }
    }

    @org.junit.Test
    public void testGetsDefaultIfOptional() throws java.lang.Exception {
        final java.lang.String[] args = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|0", java.lang.String[].class, new java.lang.String[]{ "-k", "-a", "Caesar" });
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|2", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|1", org.apache.commons.cli.Options.class, options).getOption("k")).setOptionalArg(true);
        final org.apache.commons.cli.CommandLine line = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|6", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|3", org.apache.commons.cli.CommandLineParser.class, parser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|4", org.apache.commons.cli.Options.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|5", java.lang.String[].class, args)));
        org.junit.Assert.assertEquals("Caesar", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|7", org.apache.commons.cli.CommandLine.class, line).getOptionValue("a")));
        org.junit.Assert.assertEquals("a", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI71Test|testGetsDefaultIfOptional()|9", org.apache.commons.cli.CommandLine.class, line).getOptionValue('k', "a")));
    }
}

