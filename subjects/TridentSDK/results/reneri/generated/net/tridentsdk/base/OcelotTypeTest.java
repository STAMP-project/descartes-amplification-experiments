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
public class OcelotTypeTest {
    @org.junit.Test
    public void testTypes() {
        for (net.tridentsdk.meta.entity.living.animal.OcelotType type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType[]>observeState("net.tridentsdk.base.OcelotTypeTest|testTypes()|0", net.tridentsdk.meta.entity.living.animal.OcelotType[].class, net.tridentsdk.meta.entity.living.animal.OcelotType.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testTypes()|1", net.tridentsdk.meta.entity.living.animal.OcelotType.class, type), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testTypes()|3", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testTypes()|2", net.tridentsdk.meta.entity.living.animal.OcelotType.class, type).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.OcelotTypeTest|testIndex()|0", i)) <= 3; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testIndex()|2", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.OcelotTypeTest|testIndex()|1", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testError()|0", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.of(4));
        } catch (java.lang.IllegalArgumentException a1554201309743) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.OcelotTypeTest|testError()|!", a1554201309743);
            throw a1554201309743;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testData()|0", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.WILD), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testData()|1", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testData()|2", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.TUXEDO), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testData()|3", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testData()|4", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.TABBY), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testData()|5", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testData()|6", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.SIAMESE), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.OcelotType>observeState("net.tridentsdk.base.OcelotTypeTest|testData()|7", net.tridentsdk.meta.entity.living.animal.OcelotType.class, net.tridentsdk.meta.entity.living.animal.OcelotType.of(3)));
    }
}

