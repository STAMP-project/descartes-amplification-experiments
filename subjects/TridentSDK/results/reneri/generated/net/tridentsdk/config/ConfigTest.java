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
package net.tridentsdk.config;


public class ConfigTest {
    private static final java.lang.String TEST_PATH = (net.tridentsdk.util.Misc.HOME) + "/kek/cfg.json";

    static {
        net.tridentsdk.Impl.setImpl(org.mockito.Mockito.mock(net.tridentsdk.Impl.Provider.class));
        org.mockito.Mockito.when(net.tridentsdk.Impl.get().newCfg(java.nio.file.Paths.get(net.tridentsdk.config.ConfigTest.TEST_PATH))).thenReturn(org.mockito.Mockito.mock(net.tridentsdk.config.Config.class));
    }

    @org.junit.Test
    public void testPathString() {
        net.tridentsdk.config.Config cfg = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.config.Config>observeState("net.tridentsdk.config.ConfigTest|testPathString()|0", net.tridentsdk.config.Config.class, net.tridentsdk.config.Config.load(net.tridentsdk.config.ConfigTest.TEST_PATH));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.config.Config>observeState("net.tridentsdk.config.ConfigTest|testPathString()|1", net.tridentsdk.config.Config.class, cfg));
    }

    @org.junit.Test
    public void testPath() {
        // This is stupid
        java.nio.file.Path path = eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.file.Path>observeState("net.tridentsdk.config.ConfigTest|testPath()|0", java.nio.file.Path.class, java.nio.file.Paths.get(net.tridentsdk.config.ConfigTest.TEST_PATH));
        net.tridentsdk.config.Config cfg = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.config.Config>observeState("net.tridentsdk.config.ConfigTest|testPath()|2", net.tridentsdk.config.Config.class, net.tridentsdk.config.Config.load(eu.stamp_project.reneri.instrumentation.StateObserver.<java.nio.file.Path>observeState("net.tridentsdk.config.ConfigTest|testPath()|1", java.nio.file.Path.class, path)));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.config.Config>observeState("net.tridentsdk.config.ConfigTest|testPath()|3", net.tridentsdk.config.Config.class, cfg));
    }

    @org.junit.Test
    public void testFile() {
        java.io.File file = eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("net.tridentsdk.config.ConfigTest|testFile()|0", java.io.File.class, new java.io.File(net.tridentsdk.config.ConfigTest.TEST_PATH));
        net.tridentsdk.config.Config cfg = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.config.Config>observeState("net.tridentsdk.config.ConfigTest|testFile()|2", net.tridentsdk.config.Config.class, net.tridentsdk.config.Config.load(eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.File>observeState("net.tridentsdk.config.ConfigTest|testFile()|1", java.io.File.class, file)));
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.config.Config>observeState("net.tridentsdk.config.ConfigTest|testFile()|3", net.tridentsdk.config.Config.class, cfg));
    }
}

