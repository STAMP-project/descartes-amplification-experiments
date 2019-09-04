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
public class RabbitTypeTest {
    @org.junit.Test
    public void testTypes() {
        for (net.tridentsdk.meta.entity.living.animal.RabbitType type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType[]>observeState("net.tridentsdk.base.RabbitTypeTest|testTypes()|0", net.tridentsdk.meta.entity.living.animal.RabbitType[].class, net.tridentsdk.meta.entity.living.animal.RabbitType.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testTypes()|1", net.tridentsdk.meta.entity.living.animal.RabbitType.class, type), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testTypes()|3", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testTypes()|2", net.tridentsdk.meta.entity.living.animal.RabbitType.class, type).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.RabbitTypeTest|testIndex()|0", i)) <= 5; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testIndex()|2", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.RabbitTypeTest|testIndex()|1", i)));
        }
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testIndex()|3", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(99));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testError()|0", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(6));
        } catch (java.lang.IllegalArgumentException a1554201309774) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.RabbitTypeTest|testError()|!", a1554201309774);
            throw a1554201309774;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|0", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.BROWN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|1", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|2", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.WHITE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|3", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|4", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.BLACK), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|5", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|6", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.BLACK_AND_WHITE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|7", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|8", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.GOLD), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|9", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(4)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|10", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.SALT_AND_PEPPER), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|11", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(5)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|12", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.KILLER_BUNNY), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.RabbitType>observeState("net.tridentsdk.base.RabbitTypeTest|testData()|13", net.tridentsdk.meta.entity.living.animal.RabbitType.class, net.tridentsdk.meta.entity.living.animal.RabbitType.of(99)));
    }
}

