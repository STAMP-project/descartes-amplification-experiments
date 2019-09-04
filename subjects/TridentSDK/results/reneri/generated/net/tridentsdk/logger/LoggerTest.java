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
package net.tridentsdk.logger;


public class LoggerTest {
    private static final java.lang.String NAME = net.tridentsdk.logger.LoggerTest.class.getSimpleName();

    static {
        net.tridentsdk.Impl.setImpl(org.mockito.Mockito.mock(net.tridentsdk.Impl.Provider.class));
        org.mockito.Mockito.when(net.tridentsdk.Impl.get().newLogger(net.tridentsdk.logger.LoggerTest.NAME)).thenReturn(org.mockito.Mockito.mock(net.tridentsdk.logger.Logger.class));
    }

    @org.junit.Test
    public void get() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.logger.Logger>observeState("net.tridentsdk.logger.LoggerTest|get()|0", net.tridentsdk.logger.Logger.class, net.tridentsdk.logger.Logger.get(net.tridentsdk.logger.LoggerTest.NAME)));
    }

    @org.junit.Test
    public void get1() throws java.lang.Exception {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.logger.Logger>observeState("net.tridentsdk.logger.LoggerTest|get1()|0", net.tridentsdk.logger.Logger.class, net.tridentsdk.logger.Logger.get(this.getClass())));
    }
}

