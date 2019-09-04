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
public class ChatColorTest {
    @org.junit.Test
    public void testColorRegistration() {
        for (net.tridentsdk.ui.chat.ChatColor c : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor[]>observeState("net.tridentsdk.ui.chat.ChatColorTest|testColorRegistration()|0", net.tridentsdk.ui.chat.ChatColor[].class, net.tridentsdk.ui.chat.ChatColor.values())) {
            org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor>observeState("net.tridentsdk.ui.chat.ChatColorTest|testColorRegistration()|1", net.tridentsdk.ui.chat.ChatColor.class, c), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor>observeState("net.tridentsdk.ui.chat.ChatColorTest|testColorRegistration()|3", net.tridentsdk.ui.chat.ChatColor.class, net.tridentsdk.ui.chat.ChatColor.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor>observeState("net.tridentsdk.ui.chat.ChatColorTest|testColorRegistration()|2", net.tridentsdk.ui.chat.ChatColor.class, c).getColorChar())));
        }
    }

    @org.junit.Test
    public void testColorStrings() {
        java.lang.String colorChar = "\u00a7";
        for (net.tridentsdk.ui.chat.ChatColor c : eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor[]>observeState("net.tridentsdk.ui.chat.ChatColorTest|testColorStrings()|0", net.tridentsdk.ui.chat.ChatColor[].class, net.tridentsdk.ui.chat.ChatColor.values())) {
            org.junit.Assert.assertEquals(((eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.chat.ChatColorTest|testColorStrings()|1", colorChar)) + (eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor>observeState("net.tridentsdk.ui.chat.ChatColorTest|testColorStrings()|2", net.tridentsdk.ui.chat.ChatColor.class, c).getColorChar())), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.chat.ChatColorTest|testColorStrings()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor>observeState("net.tridentsdk.ui.chat.ChatColorTest|testColorStrings()|3", net.tridentsdk.ui.chat.ChatColor.class, c).toString()));
        }
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testError() {
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor>observeState("net.tridentsdk.ui.chat.ChatColorTest|testError()|0", net.tridentsdk.ui.chat.ChatColor.class, net.tridentsdk.ui.chat.ChatColor.of('g'));
        } catch (java.lang.IllegalArgumentException a1554201309871) {
            eu.stamp_project.reneri.instrumentation.StateObserver.observeThrownException("net.tridentsdk.ui.chat.ChatColorTest|testError()|!", a1554201309871);
            throw a1554201309871;
        }
    }
}

