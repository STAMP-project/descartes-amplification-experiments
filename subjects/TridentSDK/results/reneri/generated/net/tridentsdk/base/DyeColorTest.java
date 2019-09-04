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


/**
 *
 *
 * @author Nick Robson
 */
public class DyeColorTest {
    @org.junit.Test
    public void testColors() {
        for (net.tridentsdk.base.DyeColor color : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor[]>observeState("net.tridentsdk.base.DyeColorTest|testColors()|0", net.tridentsdk.base.DyeColor[].class, net.tridentsdk.base.DyeColor.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testColors()|1", net.tridentsdk.base.DyeColor.class, color), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testColors()|3", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testColors()|2", net.tridentsdk.base.DyeColor.class, color).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.DyeColorTest|testIndex()|0", i)) <= 15; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testIndex()|2", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.DyeColorTest|testIndex()|1", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testError()|0", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(16));
        } catch (java.lang.IllegalArgumentException a1554201309726) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.DyeColorTest|testError()|!", a1554201309726);
            throw a1554201309726;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|0", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.BLACK), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|1", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|2", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.RED), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|3", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|4", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.DARK_GREEN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|5", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|6", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.BROWN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|7", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|8", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.DARK_BLUE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|9", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(4)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|10", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.DARK_PURPLE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|11", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(5)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|12", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.CYAN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|13", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(6)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|14", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.LIGHT_GRAY), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|15", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(7)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|16", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.DARK_GRAY), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|17", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(8)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|18", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.PINK), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|19", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(9)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|20", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.LIGHT_GREEN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|21", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(10)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|22", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.YELLOW), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|23", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(11)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|24", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.LIGHT_BLUE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|25", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(12)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|26", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.MAGENTA), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|27", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(13)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|28", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.ORANGE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|29", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(14)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|30", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.WHITE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.DyeColor>observeState("net.tridentsdk.base.DyeColorTest|testData()|31", net.tridentsdk.base.DyeColor.class, net.tridentsdk.base.DyeColor.of(15)));
    }
}

