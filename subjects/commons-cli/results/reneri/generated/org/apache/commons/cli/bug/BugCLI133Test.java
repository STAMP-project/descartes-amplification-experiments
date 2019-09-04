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


// tests some deprecated classes
@java.lang.SuppressWarnings("deprecation")
public class BugCLI133Test {
    @org.junit.Test
    public void testOrder() throws org.apache.commons.cli.ParseException {
        final org.apache.commons.cli.Option optionA = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|0", org.apache.commons.cli.Option.class, new org.apache.commons.cli.Option("a", "first"));
        final org.apache.commons.cli.Options opts = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|1", org.apache.commons.cli.Options.class, new org.apache.commons.cli.Options());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|4", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|2", org.apache.commons.cli.Options.class, opts).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|3", org.apache.commons.cli.Option.class, optionA)));
        final org.apache.commons.cli.PosixParser posixParser = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.PosixParser>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|5", org.apache.commons.cli.PosixParser.class, new org.apache.commons.cli.PosixParser());
        final org.apache.commons.cli.CommandLine line = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|8", org.apache.commons.cli.CommandLine.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.PosixParser>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|6", org.apache.commons.cli.PosixParser.class, posixParser).parse(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|7", org.apache.commons.cli.Options.class, opts), null));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLine>observeState("org.apache.commons.cli.bug.BugCLI133Test|testOrder()|9", org.apache.commons.cli.CommandLine.class, line).hasOption(((java.lang.String) (null)))));
    }
}

