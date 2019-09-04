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
package net.tridentsdk.world.opt;


public class ConstantsTest {
    private final net.tridentsdk.world.opt.Weather weather = new net.tridentsdk.world.opt.Weather() {
        @java.lang.Override
        public void clear() {
        }

        @java.lang.Override
        public void beginRaining() {
        }

        @java.lang.Override
        public void beginThunder() {
        }

        @java.lang.Override
        public void stopThunder() {
        }

        @java.lang.Override
        public boolean isRaining() {
            return false;
        }

        @java.lang.Override
        public int getRainTime() {
            return 0;
        }

        @java.lang.Override
        public void setRainTime(int ticks) {
        }

        @java.lang.Override
        public boolean isThundering() {
            return false;
        }

        @java.lang.Override
        public int getThunderTime() {
            return 0;
        }

        @java.lang.Override
        public void setThunderTime(int ticks) {
        }

        @java.lang.Override
        public boolean isClear() {
            return false;
        }

        @java.lang.Override
        public int getClearTime() {
            return 0;
        }

        @java.lang.Override
        public void setClearTime(int ticks) {
        }
    };

    @org.junit.Test
    public void testWorldBorder() {
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.opt.WorldBorder.DoubleXZ>observeState("net.tridentsdk.world.opt.ConstantsTest|testWorldBorder()|0", net.tridentsdk.world.opt.WorldBorder.DoubleXZ.class, net.tridentsdk.world.opt.WorldBorder.DEFAULT_CENTER).getX(), 0);
        org.junit.Assert.assertEquals(0, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.opt.WorldBorder.DoubleXZ>observeState("net.tridentsdk.world.opt.ConstantsTest|testWorldBorder()|1", net.tridentsdk.world.opt.WorldBorder.DoubleXZ.class, net.tridentsdk.world.opt.WorldBorder.DEFAULT_CENTER).getZ(), 0);
    }
}

