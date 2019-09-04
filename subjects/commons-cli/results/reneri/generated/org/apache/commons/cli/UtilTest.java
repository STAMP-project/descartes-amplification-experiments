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


public class UtilTest {
    @org.junit.Test
    public void testStripLeadingHyphens() {
        org.junit.Assert.assertEquals("f", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingHyphens()|0", org.apache.commons.cli.Util.stripLeadingHyphens("-f")));
        org.junit.Assert.assertEquals("foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingHyphens()|1", org.apache.commons.cli.Util.stripLeadingHyphens("--foo")));
        org.junit.Assert.assertEquals("-foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingHyphens()|2", org.apache.commons.cli.Util.stripLeadingHyphens("---foo")));
        org.junit.Assert.assertNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingHyphens()|3", org.apache.commons.cli.Util.stripLeadingHyphens(null)));
    }

    @org.junit.Test
    public void testStripLeadingAndTrailingQuotes() {
        org.junit.Assert.assertEquals("foo", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingAndTrailingQuotes()|0", org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes("\"foo\"")));
        org.junit.Assert.assertEquals("foo \"bar\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingAndTrailingQuotes()|1", org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes("foo \"bar\"")));
        org.junit.Assert.assertEquals("\"foo\" bar", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingAndTrailingQuotes()|2", org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes("\"foo\" bar")));
        org.junit.Assert.assertEquals("\"foo\" and \"bar\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingAndTrailingQuotes()|3", org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes("\"foo\" and \"bar\"")));
        org.junit.Assert.assertEquals("\"", eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.apache.commons.cli.UtilTest|testStripLeadingAndTrailingQuotes()|4", org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes("\"")));
    }
}

