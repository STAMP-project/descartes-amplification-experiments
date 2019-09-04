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
package net.tridentsdk.entity.living;


/**
 *
 *
 * @author TridentSDK
 * @since 0.5-alpha
 */
public class PlayerTest {
    @org.junit.Test
    public void testSendMessageDefault() {
        java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage> messages = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.LinkedList<net.tridentsdk.entity.living.PlayerTest.SentMessage>>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|0", java.util.LinkedList.class, new java.util.LinkedList<>());
        net.tridentsdk.entity.living.Player player = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.PlayerTest.DummyPlayer>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|2", net.tridentsdk.entity.living.PlayerTest.DummyPlayer.class, new net.tridentsdk.entity.living.PlayerTest.DummyPlayer(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage>>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|1", java.util.List.class, messages)));
        net.tridentsdk.ui.chat.ChatComponent component = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|3", net.tridentsdk.ui.chat.ChatComponent.class, net.tridentsdk.ui.chat.ChatComponent.text("hi there"));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.Player>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|4", net.tridentsdk.entity.living.Player.class, player).sendMessage(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|5", net.tridentsdk.ui.chat.ChatComponent.class, component), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|6", net.tridentsdk.ui.chat.ChatType.class, net.tridentsdk.ui.chat.ChatType.CHAT));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.Player>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|7", net.tridentsdk.entity.living.Player.class, player).sendMessage(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|8", net.tridentsdk.ui.chat.ChatComponent.class, component));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.Player>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|9", net.tridentsdk.entity.living.Player.class, player).sendMessage("hi there");
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.PlayerTest.SentMessage>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|11", net.tridentsdk.entity.living.PlayerTest.SentMessage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage>>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|10", java.util.List.class, messages).get(0)).getMessage(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|12", net.tridentsdk.ui.chat.ChatComponent.class, component));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.PlayerTest.SentMessage>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|14", net.tridentsdk.entity.living.PlayerTest.SentMessage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage>>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|13", java.util.List.class, messages).get(0)).getType(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|15", net.tridentsdk.ui.chat.ChatType.class, net.tridentsdk.ui.chat.ChatType.CHAT));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.PlayerTest.SentMessage>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|17", net.tridentsdk.entity.living.PlayerTest.SentMessage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage>>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|16", java.util.List.class, messages).get(1)).getMessage(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|18", net.tridentsdk.ui.chat.ChatComponent.class, component));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.PlayerTest.SentMessage>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|20", net.tridentsdk.entity.living.PlayerTest.SentMessage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage>>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|19", java.util.List.class, messages).get(1)).getType(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|21", net.tridentsdk.ui.chat.ChatType.class, net.tridentsdk.ui.chat.ChatType.SYSTEM));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.PlayerTest.SentMessage>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|23", net.tridentsdk.entity.living.PlayerTest.SentMessage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage>>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|22", java.util.List.class, messages).get(2)).getMessage(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatComponent>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|24", net.tridentsdk.ui.chat.ChatComponent.class, component));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.entity.living.PlayerTest.SentMessage>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|26", net.tridentsdk.entity.living.PlayerTest.SentMessage.class, eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage>>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|25", java.util.List.class, messages).get(2)).getType(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.ui.chat.ChatType>observeState("net.tridentsdk.entity.living.PlayerTest|testSendMessageDefault()|27", net.tridentsdk.ui.chat.ChatType.class, net.tridentsdk.ui.chat.ChatType.SYSTEM));
    }

    @lombok.Data
    private final class SentMessage {
        private final net.tridentsdk.ui.chat.ChatComponent message;

        private final net.tridentsdk.ui.chat.ChatType type;
    }

    @lombok.AllArgsConstructor
    private final class DummyPlayer implements net.tridentsdk.entity.living.Player {
        private final java.util.List<net.tridentsdk.entity.living.PlayerTest.SentMessage> sentMessages;

        @java.lang.Override
        public int getId() {
            return 0;
        }

        @java.lang.Override
        public net.tridentsdk.base.Position getPosition() {
            return null;
        }

        @java.lang.Override
        public void setPosition(net.tridentsdk.base.Position position) {
        }

        @java.lang.Override
        public boolean isOnGround() {
            return false;
        }

        @java.lang.Override
        public net.tridentsdk.world.World getWorld() {
            return null;
        }

        @java.lang.Override
        public void remove() {
        }

        @java.lang.Override
        public void updateMetadata() {
        }

        @java.lang.Override
        public java.lang.String getName() {
            return null;
        }

        @java.lang.Override
        public java.util.UUID getUuid() {
            return null;
        }

        @java.lang.Override
        public net.tridentsdk.ui.chat.ChatComponent getTabListName() {
            return null;
        }

        @java.lang.Override
        public void setTabListName(net.tridentsdk.ui.chat.ChatComponent name) {
        }

        @java.lang.Override
        public void sendMessage(net.tridentsdk.ui.chat.ChatComponent message, net.tridentsdk.ui.chat.ChatType type) {
            this.sentMessages.add(new net.tridentsdk.entity.living.PlayerTest.SentMessage(message, type));
        }

        @java.lang.Override
        public void kick(net.tridentsdk.ui.chat.ChatComponent reason) {
        }

        @java.lang.Override
        public void chat(java.lang.String msg) {
        }

        @java.lang.Override
        public net.tridentsdk.world.opt.GameMode getGameMode() {
            return null;
        }

        @java.lang.Override
        public void setGameMode(net.tridentsdk.world.opt.GameMode gameMode) {
        }

        @java.lang.Override
        public net.tridentsdk.ui.tablist.TabList getTabList() {
            return null;
        }

        @java.lang.Override
        public void setTabList(net.tridentsdk.ui.tablist.TabList tabList) {
        }

        @java.lang.Override
        public net.tridentsdk.meta.entity.living.PlayerMeta getMetadata() {
            return null;
        }

        @java.lang.Override
        public java.util.List<net.tridentsdk.ui.bossbar.BossBar> getBossBars() {
            return null;
        }

        @java.lang.Override
        public void addBossBar(net.tridentsdk.ui.bossbar.BossBar bar) {
        }

        @java.lang.Override
        public void removeBossBar(net.tridentsdk.ui.bossbar.BossBar bar) {
        }

        @java.lang.Override
        public void updateBossBars() {
        }

        @java.lang.Override
        public void sendTitle(net.tridentsdk.ui.title.Title title) {
        }

        @java.lang.Override
        public void resetTitle() {
        }

        @java.lang.Override
        public net.tridentsdk.inventory.PlayerInventory getInventory() {
            return null;
        }

        @java.lang.Override
        public void openInventory(net.tridentsdk.inventory.Inventory inventory) {
        }

        @java.lang.Override
        public boolean isGodMode() {
            return false;
        }

        @java.lang.Override
        public void setGodMode(boolean godMode) {
        }

        @java.lang.Override
        public boolean canFly() {
            return false;
        }

        @java.lang.Override
        public void setCanFly(boolean canFly) {
        }

        @java.lang.Override
        public boolean isFlying() {
            return false;
        }

        @java.lang.Override
        public void setFlying(boolean flying) {
        }

        @java.lang.Override
        public float getFlyingSpeed() {
            return 0;
        }

        @java.lang.Override
        public void setFlyingSpeed(float flyingSpeed) {
        }

        @java.lang.Override
        public float getWalkingSpeed() {
            return 0;
        }

        @java.lang.Override
        public void setWalkingSpeed(float walkingSpeed) {
        }

        @java.lang.Override
        public void setSprinting(boolean sprinting) {
        }

        @java.lang.Override
        public boolean isSprinting() {
            return false;
        }

        @java.lang.Override
        public void setCrouching(boolean crouching) {
        }

        @java.lang.Override
        public boolean isCrouching() {
            return false;
        }

        @java.lang.Override
        public void runCommand(java.lang.String command) {
        }

        @java.lang.Override
        public net.tridentsdk.command.CommandSourceType getCmdType() {
            return null;
        }

        @java.lang.Override
        public boolean hasPermission(java.lang.String perm) {
            return false;
        }

        @java.lang.Override
        public void addPermission(java.lang.String perm) {
        }

        @java.lang.Override
        public boolean removePermission(java.lang.String perm) {
            return false;
        }

        @java.lang.Override
        public void setOp(boolean op) {
        }

        @java.lang.Override
        public boolean isOp() {
            return false;
        }
    }
}

