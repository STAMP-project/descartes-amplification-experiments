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
public class HoverEventTest {
    @org.junit.Test
    public void testTextJson() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|0", org.hjson.JsonValue.class, org.hjson.JsonValue.readJSON("{\"action\":\"show_text\",\"value\":{\"text\":\"hello!\"}}")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|2", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|1", net.tridentsdk.ui.chat.HoverEvent.class, net.tridentsdk.ui.chat.HoverEvent.text("hello!")).asJson()));
        net.tridentsdk.ui.chat.ChatComponent cc = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|5", net.tridentsdk.ui.chat.ChatComponent.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|3", net.tridentsdk.ui.chat.ChatComponent.class, net.tridentsdk.ui.chat.ChatComponent.text("hi there")).setColor(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatColor>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|4", net.tridentsdk.ui.chat.ChatColor.class, net.tridentsdk.ui.chat.ChatColor.AQUA)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|6", org.hjson.JsonValue.class, org.hjson.JsonValue.readJSON("{\"action\":\"show_text\",\"value\":{\"text\":\"hi there\",\"color\":\"aqua\"}}")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|9", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|8", net.tridentsdk.ui.chat.HoverEvent.class, net.tridentsdk.ui.chat.HoverEvent.text(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testTextJson()|7", net.tridentsdk.ui.chat.ChatComponent.class, cc))).asJson()));
    }

    @org.junit.Test
    public void testAchievementJson() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testAchievementJson()|0", org.hjson.JsonValue.class, org.hjson.JsonValue.readJSON("{\"action\":\"show_achievement\",\"value\":\"the achievement\"}")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testAchievementJson()|2", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testAchievementJson()|1", net.tridentsdk.ui.chat.HoverEvent.class, net.tridentsdk.ui.chat.HoverEvent.achievement("the achievement")).asJson()));
    }

    @org.junit.Test
    public void testJsonValidity() {
        net.tridentsdk.ui.chat.HoverEvent event = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|0", net.tridentsdk.ui.chat.HoverEvent.class, net.tridentsdk.ui.chat.HoverEvent.text("hi there"));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverAction>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|2", net.tridentsdk.ui.chat.HoverAction.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|1", net.tridentsdk.ui.chat.HoverEvent.class, event).getAction()), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverAction>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|6", net.tridentsdk.ui.chat.HoverAction.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|5", net.tridentsdk.ui.chat.HoverEvent.class, net.tridentsdk.ui.chat.HoverEvent.fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|4", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|3", net.tridentsdk.ui.chat.HoverEvent.class, event).asJson()))).getAction()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|8", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|7", net.tridentsdk.ui.chat.HoverEvent.class, event).getValue()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|12", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|11", net.tridentsdk.ui.chat.HoverEvent.class, net.tridentsdk.ui.chat.HoverEvent.fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|10", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testJsonValidity()|9", net.tridentsdk.ui.chat.HoverEvent.class, event).asJson()))).getValue()));
    }

    @org.junit.Test
    public void testItem() {
        net.tridentsdk.inventory.Item item = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.Item>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|0", net.tridentsdk.inventory.Item.class, org.mockito.Mockito.mock(net.tridentsdk.inventory.Item.class));
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<net.tridentsdk.base.Substance>>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|5", org.mockito.stubbing.OngoingStubbing.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.mockito.stubbing.OngoingStubbing<net.tridentsdk.base.Substance>>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|3", org.mockito.stubbing.OngoingStubbing.class, org.mockito.Mockito.when(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|2", net.tridentsdk.base.Substance.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.Item>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|1", net.tridentsdk.inventory.Item.class, item).getSubstance()))).thenReturn(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Substance>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|4", net.tridentsdk.base.Substance.class, net.tridentsdk.base.Substance.AIR)));
        net.tridentsdk.ui.chat.HoverEvent event = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|7", net.tridentsdk.ui.chat.HoverEvent.class, net.tridentsdk.ui.chat.HoverEvent.item(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.inventory.Item>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|6", net.tridentsdk.inventory.Item.class, item)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|9", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|8", net.tridentsdk.ui.chat.HoverEvent.class, event).getValue()), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|13", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|12", net.tridentsdk.ui.chat.HoverEvent.class, net.tridentsdk.ui.chat.HoverEvent.fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|11", org.hjson.JsonValue.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.HoverEvent>observeState("net.tridentsdk.ui.chat.HoverEventTest|testItem()|10", net.tridentsdk.ui.chat.HoverEvent.class, event).asJson()))).getValue()));
    }
}

