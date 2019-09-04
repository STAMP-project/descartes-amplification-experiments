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


public class InventoryTest {
    static {
        net.tridentsdk.Impl.setImpl(org.mockito.Mockito.mock(net.tridentsdk.Impl.Provider.class));
        org.mockito.Mockito.when(net.tridentsdk.Impl.get().newInventory(net.tridentsdk.inventory.InventoryType.PLAYER, 49)).thenReturn(org.mockito.Mockito.mock(net.tridentsdk.inventory.Inventory.class));
    }

    @org.junit.Test
    public void newInventory() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.Inventory>observeState("net.tridentsdk.inventory.InventoryTest|newInventory()|1", net.tridentsdk.inventory.Inventory.class, net.tridentsdk.inventory.Inventory.newInventory(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.InventoryType>observeState("net.tridentsdk.inventory.InventoryTest|newInventory()|0", net.tridentsdk.inventory.InventoryType.class, net.tridentsdk.inventory.InventoryType.PLAYER), 49)));
    }
}

