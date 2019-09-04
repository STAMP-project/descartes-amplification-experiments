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
public class HorseTypeTest {
    @org.junit.Test
    public void testTypes() {
        for (net.tridentsdk.meta.entity.living.animal.HorseType type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType[]>observeState("net.tridentsdk.base.HorseTypeTest|testTypes()|0", net.tridentsdk.meta.entity.living.animal.HorseType[].class, net.tridentsdk.meta.entity.living.animal.HorseType.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testTypes()|1", net.tridentsdk.meta.entity.living.animal.HorseType.class, type), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testTypes()|3", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testTypes()|2", net.tridentsdk.meta.entity.living.animal.HorseType.class, type).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.HorseTypeTest|testIndex()|0", i)) <= 4; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testIndex()|2", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.HorseTypeTest|testIndex()|1", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testError()|0", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.of(5));
        } catch (java.lang.IllegalArgumentException a1554201309739) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.HorseTypeTest|testError()|!", a1554201309739);
            throw a1554201309739;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|0", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.HORSE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|1", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|2", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.DONKEY), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|3", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|4", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.MULE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|5", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|6", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.ZOMBIE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|7", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|8", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.SKELETON), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseType>observeState("net.tridentsdk.base.HorseTypeTest|testData()|9", net.tridentsdk.meta.entity.living.animal.HorseType.class, net.tridentsdk.meta.entity.living.animal.HorseType.of(4)));
    }
}

