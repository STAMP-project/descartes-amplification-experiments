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
public class ZombieTypeTest {
    @org.junit.Test
    public void testTypes() {
        for (net.tridentsdk.meta.entity.living.monster.ZombieType type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType[]>observeState("net.tridentsdk.base.ZombieTypeTest|testTypes()|0", net.tridentsdk.meta.entity.living.monster.ZombieType[].class, net.tridentsdk.meta.entity.living.monster.ZombieType.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testTypes()|1", net.tridentsdk.meta.entity.living.monster.ZombieType.class, type), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testTypes()|3", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testTypes()|2", net.tridentsdk.meta.entity.living.monster.ZombieType.class, type).getData())));
        }
    }

    @org.junit.Test
    public void testIndex() {
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.ZombieTypeTest|testIndex()|0", i)) <= 6; i++) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testIndex()|2", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.ZombieTypeTest|testIndex()|1", i)));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testError()|0", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(7));
        } catch (java.lang.IllegalArgumentException a1554201309828) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.base.ZombieTypeTest|testError()|!", a1554201309828);
            throw a1554201309828;
        }
    }

    @org.junit.Test
    public void testData() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|0", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.NORMAL), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|1", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(0)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|2", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.VILLAGER_FARMER), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|3", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(1)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|4", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.VILLAGER_LIBRARIAN), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|5", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(2)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|6", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.VILLAGER_PRIEST), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|7", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(3)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|8", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.VILLAGER_BLACKSMITH), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|9", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(4)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|10", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.VILLAGER_BUTCHER), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|11", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(5)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|12", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.HUSK), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testData()|13", net.tridentsdk.meta.entity.living.monster.ZombieType.class, net.tridentsdk.meta.entity.living.monster.ZombieType.of(6)));
    }

    @org.junit.Test
    public void testVillagers() {
        for (net.tridentsdk.meta.entity.living.monster.ZombieType type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType[]>observeState("net.tridentsdk.base.ZombieTypeTest|testVillagers()|0", net.tridentsdk.meta.entity.living.monster.ZombieType[].class, net.tridentsdk.meta.entity.living.monster.ZombieType.values())) {
            if (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.ZombieTypeTest|testVillagers()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testVillagers()|1", net.tridentsdk.meta.entity.living.monster.ZombieType.class, type).isVillager())) {
                org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.ZombieTypeTest|testVillagers()|4", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.of(((eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testVillagers()|3", net.tridentsdk.meta.entity.living.monster.ZombieType.class, type).getData()) - 1))), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.VillagerProfession>observeState("net.tridentsdk.base.ZombieTypeTest|testVillagers()|8", net.tridentsdk.meta.entity.living.VillagerProfession.class, net.tridentsdk.meta.entity.living.VillagerProfession.valueOf(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.ZombieTypeTest|testVillagers()|7", eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.ZombieTypeTest|testVillagers()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.monster.ZombieType>observeState("net.tridentsdk.base.ZombieTypeTest|testVillagers()|5", net.tridentsdk.meta.entity.living.monster.ZombieType.class, type).name()).substring(9)))));
            }
        }
    }
}

