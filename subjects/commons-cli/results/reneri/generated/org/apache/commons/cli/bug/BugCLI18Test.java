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
 * http://issues.apache.org/jira/browse/CLI-18
 */
public class BugCLI18Test {
    @org.junit.Test
    public void testCLI18() {
        final org.apache.commons.cli.Options options = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|0", org.apache.commons.cli.Options.class, new org.apache.commons.cli.Options());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|3", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|1", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|2", org.apache.commons.cli.Option.class, new org.apache.commons.cli.Option("a", "aaa", false, "aaaaaaa"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|6", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|4", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|5", org.apache.commons.cli.Option.class, new org.apache.commons.cli.Option(null, "bbb", false, "bbbbbbb dksh fkshd fkhs dkfhsdk fhskd hksdks dhfowehfsdhfkjshf skfhkshf sf jkshfk sfh skfh skf f"))));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|9", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|7", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|8", org.apache.commons.cli.Option.class, new org.apache.commons.cli.Option("c", null, false, "ccccccc"))));
        final org.apache.commons.cli.HelpFormatter formatter = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.HelpFormatter>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|10", org.apache.commons.cli.HelpFormatter.class, new org.apache.commons.cli.HelpFormatter());
        final java.io.StringWriter out = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.StringWriter>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|11", java.io.StringWriter.class, new java.io.StringWriter());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.HelpFormatter>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|12", org.apache.commons.cli.HelpFormatter.class, formatter).printHelp(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintWriter>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|14", java.io.PrintWriter.class, new java.io.PrintWriter(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.StringWriter>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|13", java.io.StringWriter.class, out))), 80, "foobar", "dsfkfsh kdh hsd hsdh fkshdf ksdh fskdh fsdh fkshfk sfdkjhskjh fkjh fkjsh khsdkj hfskdhf skjdfh ksf khf s", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI18Test|testCLI18()|15", org.apache.commons.cli.Options.class, options), 2, 2, ((("blort j jgj j jg jhghjghjgjhgjhg jgjhgj jhg jhg hjg jgjhghjg jhg hjg jhgjg jgjhghjg jg jgjhgjgjg jhg jhgjh" + '\r') + '\n') + "rarrr"), true);
    }
}

