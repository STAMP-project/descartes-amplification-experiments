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


public class BugCLI266Test {
    private final java.util.List<java.lang.String> insertedOrder = java.util.Arrays.asList("h", "d", "f", "x", "s", "p", "t", "w", "o");

    private final java.util.List<java.lang.String> sortOrder = java.util.Arrays.asList("d", "f", "h", "o", "p", "s", "t", "w", "x");

    @org.junit.Test
    public void testOptionComparatorDefaultOrder() throws org.apache.commons.cli.ParseException {
        final org.apache.commons.cli.HelpFormatter formatter = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.HelpFormatter>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|0", org.apache.commons.cli.HelpFormatter.class, new org.apache.commons.cli.HelpFormatter());
        final java.util.List<org.apache.commons.cli.Option> options = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.ArrayList<org.apache.commons.cli.Option>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|3", java.util.ArrayList.class, new java.util.ArrayList<org.apache.commons.cli.Option>(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<org.apache.commons.cli.Option>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|2", java.util.Collection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|1", org.apache.commons.cli.Options.class, getOptions()).getOptions())));
        java.util.Collections.sort(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.apache.commons.cli.Option>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|4", java.util.List.class, options), eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Comparator<org.apache.commons.cli.Option>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|6", java.util.Comparator.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.HelpFormatter>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|5", org.apache.commons.cli.HelpFormatter.class, formatter).getOptionComparator()));
        int i = 0;
        for (final org.apache.commons.cli.Option o : eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<org.apache.commons.cli.Option>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|7", java.util.List.class, options)) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|8", org.apache.commons.cli.Option.class, o).getOpt()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|10", java.util.List.class, sortOrder).get(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorDefaultOrder()|11", i))));
            i++;
        }
    }

    @org.junit.Test
    public void testOptionComparatorInsertedOrder() throws org.apache.commons.cli.ParseException {
        final java.util.Collection<org.apache.commons.cli.Option> options = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<org.apache.commons.cli.Option>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorInsertedOrder()|1", java.util.Collection.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorInsertedOrder()|0", org.apache.commons.cli.Options.class, getOptions()).getOptions());
        int i = 0;
        for (final org.apache.commons.cli.Option o : eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<org.apache.commons.cli.Option>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorInsertedOrder()|2", java.util.Collection.class, options)) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorInsertedOrder()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorInsertedOrder()|3", org.apache.commons.cli.Option.class, o).getOpt()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorInsertedOrder()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<java.lang.String>>observeState("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorInsertedOrder()|5", java.util.List.class, insertedOrder).get(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.bug.BugCLI266Test|testOptionComparatorInsertedOrder()|6", i))));
            i++;
        }
    }

    private org.apache.commons.cli.Options getOptions() {
        final org.apache.commons.cli.Options options = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|0", org.apache.commons.cli.Options.class, new org.apache.commons.cli.Options());
        final org.apache.commons.cli.Option help = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|4", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|3", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|2", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|1", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("h")).longOpt("help")).desc("Prints this help message")).build());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|7", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|5", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|6", org.apache.commons.cli.Option.class, help)));
        buildOptionsGroup(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|8", org.apache.commons.cli.Options.class, options));
        final org.apache.commons.cli.Option t = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|13", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|12", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|11", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|10", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|9", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("t")).required()).hasArg()).argName("file")).build());
        final org.apache.commons.cli.Option w = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|18", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|17", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|16", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|15", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|14", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("w")).required()).hasArg()).argName("word")).build());
        final org.apache.commons.cli.Option o = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|22", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|21", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|20", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|19", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("o")).hasArg()).argName("directory")).build());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|25", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|23", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|24", org.apache.commons.cli.Option.class, t)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|28", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|26", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|27", org.apache.commons.cli.Option.class, w)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|31", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|29", org.apache.commons.cli.Options.class, options).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|30", org.apache.commons.cli.Option.class, o)));
        return eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|getOptions()|32", org.apache.commons.cli.Options.class, options);
    }

    private void buildOptionsGroup(final org.apache.commons.cli.Options options) {
        final org.apache.commons.cli.OptionGroup firstGroup = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|0", org.apache.commons.cli.OptionGroup.class, new org.apache.commons.cli.OptionGroup());
        final org.apache.commons.cli.OptionGroup secondGroup = eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|1", org.apache.commons.cli.OptionGroup.class, new org.apache.commons.cli.OptionGroup());
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|2", org.apache.commons.cli.OptionGroup.class, firstGroup).setRequired(true);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|3", org.apache.commons.cli.OptionGroup.class, secondGroup).setRequired(true);
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|10", org.apache.commons.cli.OptionGroup.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|4", org.apache.commons.cli.OptionGroup.class, firstGroup).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|9", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|8", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|7", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|6", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|5", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("d")).longOpt("db")).hasArg()).argName("table-name")).build())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|17", org.apache.commons.cli.OptionGroup.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|11", org.apache.commons.cli.OptionGroup.class, firstGroup).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|16", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|15", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|14", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|13", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|12", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("f")).longOpt("flat-file")).hasArg()).argName("input.csv")).build())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|20", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|18", org.apache.commons.cli.Options.class, options).addOptionGroup(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|19", org.apache.commons.cli.OptionGroup.class, firstGroup)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|26", org.apache.commons.cli.OptionGroup.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|21", org.apache.commons.cli.OptionGroup.class, secondGroup).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|25", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|24", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|23", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|22", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("x")).hasArg()).argName("arg1")).build())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|30", org.apache.commons.cli.OptionGroup.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|27", org.apache.commons.cli.OptionGroup.class, secondGroup).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|29", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|28", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("s")).build())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|36", org.apache.commons.cli.OptionGroup.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|31", org.apache.commons.cli.OptionGroup.class, secondGroup).addOption(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|35", org.apache.commons.cli.Option.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|34", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|33", org.apache.commons.cli.Option.Builder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Option.Builder>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|32", org.apache.commons.cli.Option.Builder.class, org.apache.commons.cli.Option.builder("p")).hasArg()).argName("arg1")).build())));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|39", org.apache.commons.cli.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.Options>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|37", org.apache.commons.cli.Options.class, options).addOptionGroup(eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.OptionGroup>observeState("org.apache.commons.cli.bug.BugCLI266Test|buildOptionsGroup(org.apache.commons.cli.Options)|38", org.apache.commons.cli.OptionGroup.class, secondGroup)));
    }
}
