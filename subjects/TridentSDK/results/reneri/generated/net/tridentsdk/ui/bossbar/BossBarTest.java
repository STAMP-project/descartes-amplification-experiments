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
package net.tridentsdk.ui.bossbar;


public class BossBarTest {
    static {
        net.tridentsdk.Impl.setImpl(org.mockito.Mockito.mock(net.tridentsdk.Impl.Provider.class));
        org.mockito.Mockito.when(net.tridentsdk.Impl.get().newBossBar()).thenReturn(org.mockito.Mockito.mock(net.tridentsdk.ui.bossbar.BossBar.class));
    }

    @org.junit.Test
    public void newBossBar() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.bossbar.BossBar>observeState("net.tridentsdk.ui.bossbar.BossBarTest|newBossBar()|0", net.tridentsdk.ui.bossbar.BossBar.class, net.tridentsdk.ui.bossbar.BossBar.newBossBar()));
    }
}

