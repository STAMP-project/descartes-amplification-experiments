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


public class BugCLI252Test {
    @org.junit.Test
    public void testExactOptionNameMatch() throws org.apache.commons.cli.ParseException {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI252Test|testExactOptionNameMatch()|3", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.DefaultParser>observeState("org.apache.commons.cli.bug.BugCLI252Test|testExactOptionNameMatch()|0", org.apache.commons.cli.DefaultParser.class, new org.apache.commons.cli.DefaultParser()).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI252Test|testExactOptionNameMatch()|1", org.apache.commons.cli.Options.class, getOptions()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI252Test|testExactOptionNameMatch()|2", java.lang.String[].class, new java.lang.String[]{ "--prefix" })));
    }

    @org.junit.Test(expected = org.apache.commons.cli.AmbiguousOptionException.class)
    public void testAmbiquousOptionName() throws org.apache.commons.cli.ParseException {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI252Test|testAmbiquousOptionName()|3", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.DefaultParser>observeState("org.apache.commons.cli.bug.BugCLI252Test|testAmbiquousOptionName()|0", org.apache.commons.cli.DefaultParser.class, new org.apache.commons.cli.DefaultParser()).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI252Test|testAmbiquousOptionName()|1", org.apache.commons.cli.Options.class, getOptions()), eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("org.apache.commons.cli.bug.BugCLI252Test|testAmbiquousOptionName()|2", java.lang.String[].class, new java.lang.String[]{ "--pref" })));
        } catch (org.apache.commons.cli.AmbiguousOptionException a1552645019669) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("org.apache.commons.cli.bug.BugCLI252Test|testAmbiquousOptionName()|!", a1552645019669);
            throw a1552645019669;
        }
    }

    private org.apache.commons.cli.Options getOptions() {
        final org.apache.commons.cli.Options options = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|0", org.apache.commons.cli.Options.class, new org.apache.commons.cli.Options());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|5", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|1", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|4", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|3", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|2", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder()).longOpt("prefix")).build())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|10", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|6", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|9", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|8", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|7", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder()).longOpt("prefixplusplus")).build())));
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI252Test|getOptions()|11", org.apache.commons.cli.Options.class, options);
    }
}

