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
public class VillagerProfessionTest {
    @org.junit.Test
    public void testTypes() {
        for (net.tridentsdk.meta.entity.living.VillagerProfession type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession[]>observeState("net.tridentsdk.base.VillagerProfessionTest|testTypes()|0", net.tridentsdk.meta.entity.living.VillagerProfession[].class, net.tridentsdk.meta.entity.living.VillagerProfession.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testTypes()|1", net.tridentsdk.meta.entity.living.VillagerProfession.class, type), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testTypes()|3", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testTypes()|2", net.tridentsdk.meta.entity.living.VillagerProfession.class, type).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VillagerProfessionTest|testIndex()|0", i)) <= 4; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testIndex()|2", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VillagerProfessionTest|testIndex()|1", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testError()|0", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(5));
        } catch (java.lang.IllegalArgumentException a1554201309824) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.VillagerProfessionTest|testError()|!", a1554201309824);
            throw a1554201309824;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|0", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.FARMER), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|1", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|2", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.LIBRARIAN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|3", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|4", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.PRIEST), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|5", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|6", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.BLACKSMITH), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|7", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|8", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.BUTCHER), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testData()|9", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(4)));
    }

    @org.junit.Test
    public void testZombies() {
        for (net.tridentsdk.meta.entity.living.VillagerProfession type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession[]>observeState("net.tridentsdk.base.VillagerProfessionTest|testZombies()|0", net.tridentsdk.meta.entity.living.VillagerProfession[].class, net.tridentsdk.meta.entity.living.VillagerProfession.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.VillagerProfessionTest|testZombies()|2", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(((eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testZombies()|1", net.tridentsdk.meta.entity.living.VillagerProfession.class, type).getData()) + 1))), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.VillagerProfessionTest|testZombies()|5", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.valueOf(("VILLAGER_" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VillagerProfessionTest|testZombies()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.VillagerProfessionTest|testZombies()|3", net.tridentsdk.meta.entity.living.VillagerProfession.class, type).name()))))));
        }
    }
}

