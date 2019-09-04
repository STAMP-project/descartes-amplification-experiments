/**
 * Trident - A Multithreaded Server Alternative
 * Copyright 2017 The TridentSDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tridentsdk.base;


public class SubstanceTest {
    @org.junit.Test
    public void testToString() throws java.lang.Exception {
        for (net.tridentsdk.base.Substance substance : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance[]>observeState("net.tridentsdk.base.SubstanceTest|testToString()|0", net.tridentsdk.base.Substance[].class, net.tridentsdk.base.Substance.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.SubstanceTest|testToString()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.base.SubstanceTest|testToString()|1", net.tridentsdk.base.Substance.class, substance).toString()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.SubstanceTest|testToString()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.base.SubstanceTest|testToString()|3", net.tridentsdk.base.Substance.class, substance).getStringId()));
        }
    }

    @org.junit.Test
    public void testOf() throws java.lang.Exception {
        for (net.tridentsdk.base.Substance substance : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance[]>observeState("net.tridentsdk.base.SubstanceTest|testOf()|0", net.tridentsdk.base.Substance[].class, net.tridentsdk.base.Substance.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.base.SubstanceTest|testOf()|1", net.tridentsdk.base.Substance.class, substance), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.base.SubstanceTest|testOf()|4", net.tridentsdk.base.Substance.class, net.tridentsdk.base.Substance.fromNumericId(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.SubstanceTest|testOf()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.base.SubstanceTest|testOf()|2", net.tridentsdk.base.Substance.class, substance).getId()))));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testOobOf() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.base.SubstanceTest|testOobOf()|0", net.tridentsdk.base.Substance.class, net.tridentsdk.base.Substance.fromNumericId(java.lang.Integer.MAX_VALUE));
        } catch (java.lang.IllegalArgumentException a1554201309788) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.SubstanceTest|testOobOf()|!", a1554201309788);
            throw a1554201309788;
        }
    }
}

