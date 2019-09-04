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


public class ItemTest {
    static {
        net.tridentsdk.Impl.setImpl(org.mockito.Mockito.mock(net.tridentsdk.Impl.Provider.class));
        org.mockito.Mockito.when(net.tridentsdk.Impl.get().newItem(org.mockito.Matchers.eq(net.tridentsdk.base.Substance.AIR), org.mockito.Matchers.eq(1), org.mockito.Matchers.eq(((byte) (0))), org.mockito.Matchers.any(net.tridentsdk.meta.ItemMeta.class))).thenReturn(org.mockito.Mockito.mock(net.tridentsdk.inventory.Item.class));
    }

    @org.junit.Test
    public void newItem() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.Item>observeState("net.tridentsdk.inventory.ItemTest|newItem()|1", net.tridentsdk.inventory.Item.class, net.tridentsdk.inventory.Item.newItem(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.inventory.ItemTest|newItem()|0", net.tridentsdk.base.Substance.class, net.tridentsdk.base.Substance.AIR))));
    }

    @org.junit.Test
    public void newItem1() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.Item>observeState("net.tridentsdk.inventory.ItemTest|newItem1()|1", net.tridentsdk.inventory.Item.class, net.tridentsdk.inventory.Item.newItem(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.inventory.ItemTest|newItem1()|0", net.tridentsdk.base.Substance.class, net.tridentsdk.base.Substance.AIR), 1)));
    }

    @org.junit.Test
    public void newItem2() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.Item>observeState("net.tridentsdk.inventory.ItemTest|newItem2()|1", net.tridentsdk.inventory.Item.class, net.tridentsdk.inventory.Item.newItem(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.inventory.ItemTest|newItem2()|0", net.tridentsdk.base.Substance.class, net.tridentsdk.base.Substance.AIR), 1, ((byte) (0)))));
    }

    @org.junit.Test
    public void newItem3() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.Item>observeState("net.tridentsdk.inventory.ItemTest|newItem3()|2", net.tridentsdk.inventory.Item.class, net.tridentsdk.inventory.Item.newItem(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.inventory.ItemTest|newItem3()|0", net.tridentsdk.base.Substance.class, net.tridentsdk.base.Substance.AIR), 1, ((byte) (0)), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.meta.ItemMeta>observeState("net.tridentsdk.inventory.ItemTest|newItem3()|1", net.tridentsdk.meta.ItemMeta.class, new net.tridentsdk.meta.ItemMeta()))));
    }
}

