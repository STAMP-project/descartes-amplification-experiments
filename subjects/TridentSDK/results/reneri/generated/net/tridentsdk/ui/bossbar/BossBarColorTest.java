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
public class BossBarColorTest {
    @org.junit.Test
    public void testColors() {
        for (net.tridentsdk.ui.bossbar.BossBarColor color : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor[]>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testColors()|0", net.tridentsdk.ui.bossbar.BossBarColor[].class, net.tridentsdk.ui.bossbar.BossBarColor.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testColors()|1", net.tridentsdk.ui.bossbar.BossBarColor.class, color), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testColors()|3", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testColors()|2", net.tridentsdk.ui.bossbar.BossBarColor.class, color).getId())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        org.junit.Assert.assertEquals(7, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.bossbar.BossBarColorTest|testIndex()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor[]>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIndex()|0", net.tridentsdk.ui.bossbar.BossBarColor[].class, net.tridentsdk.ui.bossbar.BossBarColor.values()).length));
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.bossbar.BossBarColorTest|testIndex()|2", i)) <= 6; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIndex()|4", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.bossbar.BossBarColorTest|testIndex()|3", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testError()|0", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(7));
        } catch (java.lang.IllegalArgumentException a1554201309858) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.ui.bossbar.BossBarColorTest|testError()|!", a1554201309858);
            throw a1554201309858;
        }
    }

    @org.junit.Test
    public void testIDs() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|0", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.PINK), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|1", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|2", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.BLUE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|3", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|4", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.RED), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|5", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|6", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.GREEN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|7", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|8", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.YELLOW), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|9", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(4)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|10", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.PURPLE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|11", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(5)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|12", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.WHITE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBarColor>observeState("net.tridentsdk.ui.bossbar.BossBarColorTest|testIDs()|13", net.tridentsdk.ui.bossbar.BossBarColor.class, net.tridentsdk.ui.bossbar.BossBarColor.of(6)));
    }
}

