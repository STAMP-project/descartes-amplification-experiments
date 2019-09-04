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
package net.tridentsdk.inventory;


public class InventoryTypeTest {
    @org.junit.Test
    public void testTypes() {
        java.lang.String types = "Player\n" + ((((((((((((("minecraft:container\n" + "minecraft:chest\n") + "minecraft:crafting_table\n") + "minecraft:furnace\n") + "minecraft:dispenser\n") + "minecraft:enchanting_table\n") + "minecraft:brewing_stand\n") + "minecraft:villager\n") + "minecraft:beacon\n") + "minecraft:anvil\n") + "minecraft:hopper\n") + "minecraft:dropper\n") + "minecraft:shulker_box\n") + "EntityHorse");
        for (net.tridentsdk.inventory.InventoryType type : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.InventoryType[]>observeState("net.tridentsdk.inventory.InventoryTypeTest|testTypes()|0", net.tridentsdk.inventory.InventoryType[].class, net.tridentsdk.inventory.InventoryType.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.inventory.InventoryTypeTest|testTypes()|5", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.String[]>observeState("net.tridentsdk.inventory.InventoryTypeTest|testTypes()|2", java.lang.String[].class, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.inventory.InventoryTypeTest|testTypes()|1", types).split("\n"))[eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.inventory.InventoryTypeTest|testTypes()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.InventoryType>observeState("net.tridentsdk.inventory.InventoryTypeTest|testTypes()|3", net.tridentsdk.inventory.InventoryType.class, type).ordinal())]), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.inventory.InventoryTypeTest|testTypes()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.InventoryType>observeState("net.tridentsdk.inventory.InventoryTypeTest|testTypes()|6", net.tridentsdk.inventory.InventoryType.class, type).toString()));
        }
    }
}

