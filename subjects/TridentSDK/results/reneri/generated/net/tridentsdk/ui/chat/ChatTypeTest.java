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
public class ChatTypeTest {
    @org.junit.Test
    public void testChatTypes() {
        net.tridentsdk.ui.chat.ChatType[] types = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType[]>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|0", net.tridentsdk.ui.chat.ChatType[].class, net.tridentsdk.ui.chat.ChatType.values());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|2", net.tridentsdk.ui.chat.ChatType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType[]>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|1", net.tridentsdk.ui.chat.ChatType[].class, types)[0]), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|3", net.tridentsdk.ui.chat.ChatType.class, net.tridentsdk.ui.chat.ChatType.CHAT));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|5", net.tridentsdk.ui.chat.ChatType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType[]>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|4", net.tridentsdk.ui.chat.ChatType[].class, types)[1]), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|6", net.tridentsdk.ui.chat.ChatType.class, net.tridentsdk.ui.chat.ChatType.SYSTEM));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|8", net.tridentsdk.ui.chat.ChatType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType[]>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|7", net.tridentsdk.ui.chat.ChatType[].class, types)[2]), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testChatTypes()|9", net.tridentsdk.ui.chat.ChatType.class, net.tridentsdk.ui.chat.ChatType.ABOVE_HOTBAR));
    }

    @org.junit.Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.chat.ChatTypeTest|testError()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testError()|1", net.tridentsdk.ui.chat.ChatType.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType[]>observeState("net.tridentsdk.ui.chat.ChatTypeTest|testError()|0", net.tridentsdk.ui.chat.ChatType[].class, net.tridentsdk.ui.chat.ChatType.values())[3]).toString());
        } catch (java.lang.ArrayIndexOutOfBoundsException a1554201309910) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.ui.chat.ChatTypeTest|testError()|!", a1554201309910);
            throw a1554201309910;
        }
    }
}

