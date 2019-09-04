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
package net.tridentsdk.ui.chat;


/**
 *
 *
 * @author Nick Robson
 */
public class ClientChatModeTest {
    @org.junit.Test
    public void testModeRegistration() {
        for (net.tridentsdk.ui.chat.ClientChatMode mode : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClientChatMode[]>observeState("net.tridentsdk.ui.chat.ClientChatModeTest|testModeRegistration()|0", net.tridentsdk.ui.chat.ClientChatMode[].class, net.tridentsdk.ui.chat.ClientChatMode.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClientChatMode>observeState("net.tridentsdk.ui.chat.ClientChatModeTest|testModeRegistration()|1", net.tridentsdk.ui.chat.ClientChatMode.class, mode), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClientChatMode>observeState("net.tridentsdk.ui.chat.ClientChatModeTest|testModeRegistration()|3", net.tridentsdk.ui.chat.ClientChatMode.class, net.tridentsdk.ui.chat.ClientChatMode.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClientChatMode>observeState("net.tridentsdk.ui.chat.ClientChatModeTest|testModeRegistration()|2", net.tridentsdk.ui.chat.ClientChatMode.class, mode).getData())));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClientChatMode>observeState("net.tridentsdk.ui.chat.ClientChatModeTest|testError()|0", net.tridentsdk.ui.chat.ClientChatMode.class, net.tridentsdk.ui.chat.ClientChatMode.of(3));
        } catch (java.lang.IllegalArgumentException a1554201309914) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.ui.chat.ClientChatModeTest|testError()|!", a1554201309914);
            throw a1554201309914;
        }
    }
}

