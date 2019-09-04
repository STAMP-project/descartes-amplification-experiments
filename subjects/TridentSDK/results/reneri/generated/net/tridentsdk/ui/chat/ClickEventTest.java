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
public class ClickEventTest {
    @org.junit.Test
    public void testRunCommandJson() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.ClickEventTest|testRunCommandJson()|0", org.hjson.JsonValue.class, org.hjson.JsonValue.readJSON("{\"action\":\"run_command\",\"value\":\"/say hello\"}")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonObject>observeState("net.tridentsdk.ui.chat.ClickEventTest|testRunCommandJson()|3", org.hjson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testRunCommandJson()|2", net.tridentsdk.ui.chat.ClickEvent.class, net.tridentsdk.ui.chat.ClickEvent.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickAction>observeState("net.tridentsdk.ui.chat.ClickEventTest|testRunCommandJson()|1", net.tridentsdk.ui.chat.ClickAction.class, net.tridentsdk.ui.chat.ClickAction.RUN_COMMAND), "/say hello")).asJson()));
    }

    @org.junit.Test
    public void testSuggestCommandJson() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.ClickEventTest|testSuggestCommandJson()|0", org.hjson.JsonValue.class, org.hjson.JsonValue.readJSON("{\"action\":\"suggest_command\",\"value\":\"/say hello\"}")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonObject>observeState("net.tridentsdk.ui.chat.ClickEventTest|testSuggestCommandJson()|3", org.hjson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testSuggestCommandJson()|2", net.tridentsdk.ui.chat.ClickEvent.class, net.tridentsdk.ui.chat.ClickEvent.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickAction>observeState("net.tridentsdk.ui.chat.ClickEventTest|testSuggestCommandJson()|1", net.tridentsdk.ui.chat.ClickAction.class, net.tridentsdk.ui.chat.ClickAction.SUGGEST_COMMAND), "/say hello")).asJson()));
    }

    @org.junit.Test
    public void testOpenUrlJson() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.ClickEventTest|testOpenUrlJson()|0", org.hjson.JsonValue.class, org.hjson.JsonValue.readJSON("{\"action\":\"open_url\",\"value\":\"http://google.com\"}")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonObject>observeState("net.tridentsdk.ui.chat.ClickEventTest|testOpenUrlJson()|3", org.hjson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testOpenUrlJson()|2", net.tridentsdk.ui.chat.ClickEvent.class, net.tridentsdk.ui.chat.ClickEvent.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickAction>observeState("net.tridentsdk.ui.chat.ClickEventTest|testOpenUrlJson()|1", net.tridentsdk.ui.chat.ClickAction.class, net.tridentsdk.ui.chat.ClickAction.OPEN_URL), "http://google.com")).asJson()));
    }

    @org.junit.Test
    public void testOpenFileJson() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonValue>observeState("net.tridentsdk.ui.chat.ClickEventTest|testOpenFileJson()|0", org.hjson.JsonValue.class, org.hjson.JsonValue.readJSON("{\"action\":\"open_file\",\"value\":\"nope\"}")), eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonObject>observeState("net.tridentsdk.ui.chat.ClickEventTest|testOpenFileJson()|3", org.hjson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testOpenFileJson()|2", net.tridentsdk.ui.chat.ClickEvent.class, net.tridentsdk.ui.chat.ClickEvent.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickAction>observeState("net.tridentsdk.ui.chat.ClickEventTest|testOpenFileJson()|1", net.tridentsdk.ui.chat.ClickAction.class, net.tridentsdk.ui.chat.ClickAction.OPEN_FILE), "nope")).asJson()));
    }

    @org.junit.Test
    public void testJsonValidity() {
        net.tridentsdk.ui.chat.ClickEvent event = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|1", net.tridentsdk.ui.chat.ClickEvent.class, net.tridentsdk.ui.chat.ClickEvent.of(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickAction>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|0", net.tridentsdk.ui.chat.ClickAction.class, net.tridentsdk.ui.chat.ClickAction.RUN_COMMAND), "/say hi there"));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickAction>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|3", net.tridentsdk.ui.chat.ClickAction.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|2", net.tridentsdk.ui.chat.ClickEvent.class, event).getAction()), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickAction>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|7", net.tridentsdk.ui.chat.ClickAction.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|6", net.tridentsdk.ui.chat.ClickEvent.class, net.tridentsdk.ui.chat.ClickEvent.fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonObject>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|5", org.hjson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|4", net.tridentsdk.ui.chat.ClickEvent.class, event).asJson()))).getAction()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|8", net.tridentsdk.ui.chat.ClickEvent.class, event).getValue()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|13", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|12", net.tridentsdk.ui.chat.ClickEvent.class, net.tridentsdk.ui.chat.ClickEvent.fromJson(eu.stamp_project.reneri.instrumentation.StateObserver.<org.hjson.JsonObject>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|11", org.hjson.JsonObject.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ClickEvent>observeState("net.tridentsdk.ui.chat.ClickEventTest|testJsonValidity()|10", net.tridentsdk.ui.chat.ClickEvent.class, event).asJson()))).getValue()));
    }
}

