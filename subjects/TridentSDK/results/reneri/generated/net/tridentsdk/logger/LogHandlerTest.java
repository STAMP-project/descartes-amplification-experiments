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


public class LogHandlerTest {
    private static final net.tridentsdk.logger.Logger logger = org.mockito.Mockito.mock(net.tridentsdk.logger.Logger.class);

    private static final net.tridentsdk.logger.LogHandler handler = ( message) -> true;

    static {
        net.tridentsdk.Impl.setImpl(org.mockito.Mockito.mock(net.tridentsdk.Impl.Provider.class));
        org.mockito.Mockito.when(net.tridentsdk.Impl.get().removeHandler(net.tridentsdk.logger.LogHandlerTest.logger, net.tridentsdk.logger.LogHandlerTest.handler)).thenReturn(true);
    }

    @org.junit.Test
    public void intercept() throws java.lang.Exception {
        net.tridentsdk.logger.LogHandler.intercept(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.logger.Logger>observeState("net.tridentsdk.logger.LogHandlerTest|intercept()|0", net.tridentsdk.logger.Logger.class, net.tridentsdk.logger.LogHandlerTest.logger), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.logger.LogHandler>observeState("net.tridentsdk.logger.LogHandlerTest|intercept()|1", net.tridentsdk.logger.LogHandler.class, net.tridentsdk.logger.LogHandlerTest.handler));
    }

    @org.junit.Test
    public void removeHandler() throws java.lang.Exception {
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.logger.LogHandlerTest|removeHandler()|2", net.tridentsdk.logger.LogHandler.removeHandler(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.logger.Logger>observeState("net.tridentsdk.logger.LogHandlerTest|removeHandler()|0", net.tridentsdk.logger.Logger.class, net.tridentsdk.logger.LogHandlerTest.logger), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.logger.LogHandler>observeState("net.tridentsdk.logger.LogHandlerTest|removeHandler()|1", net.tridentsdk.logger.LogHandler.class, net.tridentsdk.logger.LogHandlerTest.handler))));
    }
}

