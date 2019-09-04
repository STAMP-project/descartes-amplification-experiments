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
public class HorseArmorTest {
    @org.junit.Test
    public void testArmors() {
        org.junit.Assert.assertEquals(3, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseArmor>observeState("net.tridentsdk.base.HorseArmorTest|testArmors()|0", net.tridentsdk.meta.entity.living.animal.HorseArmor.class, net.tridentsdk.meta.entity.living.animal.HorseArmor.LEATHER).getArmor());
        org.junit.Assert.assertEquals(5, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseArmor>observeState("net.tridentsdk.base.HorseArmorTest|testArmors()|1", net.tridentsdk.meta.entity.living.animal.HorseArmor.class, net.tridentsdk.meta.entity.living.animal.HorseArmor.IRON).getArmor());
        org.junit.Assert.assertEquals(7, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseArmor>observeState("net.tridentsdk.base.HorseArmorTest|testArmors()|2", net.tridentsdk.meta.entity.living.animal.HorseArmor.class, net.tridentsdk.meta.entity.living.animal.HorseArmor.GOLD).getArmor());
        org.junit.Assert.assertEquals(11, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.entity.living.animal.HorseArmor>observeState("net.tridentsdk.base.HorseArmorTest|testArmors()|3", net.tridentsdk.meta.entity.living.animal.HorseArmor.class, net.tridentsdk.meta.entity.living.animal.HorseArmor.DIAMOND).getArmor());
    }
}

