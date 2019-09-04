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
public class HorseColorTest {
    @org.junit.Test
    public void testColors() {
        for (net.tridentsdk.meta.entity.living.animal.HorseColor color : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor[]>observeState("net.tridentsdk.base.HorseColorTest|testColors()|0", net.tridentsdk.meta.entity.living.animal.HorseColor[].class, net.tridentsdk.meta.entity.living.animal.HorseColor.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testColors()|1", net.tridentsdk.meta.entity.living.animal.HorseColor.class, color), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testColors()|3", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testColors()|2", net.tridentsdk.meta.entity.living.animal.HorseColor.class, color).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.HorseColorTest|testIndex()|0", i)) <= 4; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testIndex()|2", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.HorseColorTest|testIndex()|1", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testError()|0", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.of(5));
        } catch (java.lang.IllegalArgumentException a1554201309731) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.HorseColorTest|testError()|!", a1554201309731);
            throw a1554201309731;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|0", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.NONE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|1", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|2", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.WHITE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|3", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|4", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.WHITE_FIELD), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|5", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|6", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.WHITE_DOTS), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|7", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|8", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.BLACK_DOTS), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseColor>observeState("net.tridentsdk.base.HorseColorTest|testData()|9", net.tridentsdk.meta.entity.living.animal.HorseColor.class, net.tridentsdk.meta.entity.living.animal.HorseColor.of(4)));
    }
}

