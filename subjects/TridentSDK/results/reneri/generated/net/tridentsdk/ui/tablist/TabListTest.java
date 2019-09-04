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
package net.tridentsdk.ui.tablist;


public class TabListTest {
    static {
        net.tridentsdk.Impl.setImpl(org.mockito.Mockito.mock(net.tridentsdk.Impl.Provider.class));
        org.mockito.Mockito.when(net.tridentsdk.Impl.get().getGlobalTabList()).thenReturn(org.mockito.Mockito.mock(net.tridentsdk.ui.tablist.TabList.class));
        org.mockito.Mockito.when(net.tridentsdk.Impl.get().newTabList()).thenReturn(org.mockito.Mockito.mock(net.tridentsdk.ui.tablist.TabList.class));
    }

    @org.junit.Test
    public void getGlobal() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.tablist.TabList>observeState("net.tridentsdk.ui.tablist.TabListTest|getGlobal()|0", net.tridentsdk.ui.tablist.TabList.class, net.tridentsdk.ui.tablist.TabList.getGlobalTabList()));
    }

    @org.junit.Test
    public void newTabList() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.tablist.TabList>observeState("net.tridentsdk.ui.tablist.TabListTest|newTabList()|0", net.tridentsdk.ui.tablist.TabList.class, net.tridentsdk.ui.tablist.TabList.newTabList()));
    }
}

