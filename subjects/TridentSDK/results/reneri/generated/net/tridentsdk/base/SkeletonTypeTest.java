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
public class SkeletonTypeTest {
    @org.junit.Test
    public void testTypes() {
        for (net.tridentsdk.meta.entity.living.monster.SkeletonType type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType[]>observeState("net.tridentsdk.base.SkeletonTypeTest|testTypes()|0", net.tridentsdk.meta.entity.living.monster.SkeletonType[].class, net.tridentsdk.meta.entity.living.monster.SkeletonType.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testTypes()|1", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, type), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testTypes()|3", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testTypes()|2", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, type).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.SkeletonTypeTest|testIndex()|0", i)) <= 2; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testIndex()|2", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.SkeletonTypeTest|testIndex()|1", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testError()|0", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.of(3));
        } catch (java.lang.IllegalArgumentException a1554201309778) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.SkeletonTypeTest|testError()|!", a1554201309778);
            throw a1554201309778;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testData()|0", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.NORMAL), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testData()|1", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testData()|2", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.WITHER), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testData()|3", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testData()|4", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.STRAY), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.SkeletonType>observeState("net.tridentsdk.base.SkeletonTypeTest|testData()|5", net.tridentsdk.meta.entity.living.monster.SkeletonType.class, net.tridentsdk.meta.entity.living.monster.SkeletonType.of(2)));
    }
}

