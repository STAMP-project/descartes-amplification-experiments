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
package net.tridentsdk.ui.bossbar;


/**
 *
 *
 * @author Nick Robson
 */
public class BossBarDivisionTest {
    @org.junit.Test
    public void testDivisions() {
        for (net.tridentsdk.ui.bossbar.BossBarDivision division : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision[]>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testDivisions()|0", net.tridentsdk.ui.bossbar.BossBarDivision[].class, net.tridentsdk.ui.bossbar.BossBarDivision.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testDivisions()|1", net.tridentsdk.ui.bossbar.BossBarDivision.class, division), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testDivisions()|3", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testDivisions()|2", net.tridentsdk.ui.bossbar.BossBarDivision.class, division).getId())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        org.junit.Assert.assertEquals(5, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIndex()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision[]>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIndex()|0", net.tridentsdk.ui.bossbar.BossBarDivision[].class, net.tridentsdk.ui.bossbar.BossBarDivision.values()).length));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIndex()|2", i)) <= 4; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIndex()|4", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIndex()|3", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testError()|0", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.of(5));
        } catch (java.lang.IllegalArgumentException a1554201309864) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testError()|!", a1554201309864);
            throw a1554201309864;
        }
    }

    @org.junit.Test
    public void testIDs() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|0", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NO_DIVISION), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|1", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|2", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NOTCHES_6), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|3", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|4", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NOTCHES_10), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|5", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|6", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NOTCHES_12), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|7", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|8", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NOTCHES_20), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testIDs()|9", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.of(4)));
    }

    @org.junit.Test
    public void testNotches() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testNotches()|0", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NO_DIVISION).getNotches(), 0);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testNotches()|1", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NOTCHES_6).getNotches(), 6);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testNotches()|2", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NOTCHES_10).getNotches(), 10);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testNotches()|3", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NOTCHES_12).getNotches(), 12);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarDivision>observeState("net.tridentsdk.ui.bossbar.BossBarDivisionTest|testNotches()|4", net.tridentsdk.ui.bossbar.BossBarDivision.class, net.tridentsdk.ui.bossbar.BossBarDivision.NOTCHES_20).getNotches(), 20);
    }
}

