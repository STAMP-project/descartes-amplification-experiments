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
public class HorseMarkingsTest {
    @org.junit.Test
    public void testMarkings() {
        for (net.tridentsdk.meta.entity.living.animal.HorseMarkings markings : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings[]>observeState("net.tridentsdk.base.HorseMarkingsTest|testMarkings()|0", net.tridentsdk.meta.entity.living.animal.HorseMarkings[].class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testMarkings()|1", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, markings), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testMarkings()|3", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testMarkings()|2", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, markings).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.HorseMarkingsTest|testIndex()|0", i)) <= 6; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testIndex()|2", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.HorseMarkingsTest|testIndex()|1", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testError()|0", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(7));
        } catch (java.lang.IllegalArgumentException a1554201309735) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.HorseMarkingsTest|testError()|!", a1554201309735);
            throw a1554201309735;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|0", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.WHITE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|1", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|2", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.CREAMY), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|3", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|4", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.CHESTNUT), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|5", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|6", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.BROWN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|7", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|8", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.BLACK), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|9", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(4)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|10", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.GRAY), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|11", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(5)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|12", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.DARK_BROWN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseMarkings>observeState("net.tridentsdk.base.HorseMarkingsTest|testData()|13", net.tridentsdk.meta.entity.living.animal.HorseMarkings.class, net.tridentsdk.meta.entity.living.animal.HorseMarkings.of(6)));
    }
}

