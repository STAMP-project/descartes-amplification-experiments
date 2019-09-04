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


public class WorldCreateSpecTest {
    @org.junit.Test
    public void defaultOpts() throws java.lang.Exception {
        net.tridentsdk.world.opt.WorldCreateSpec spec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.opt.WorldCreateSpec>observeState("net.tridentsdk.world.opt.WorldCreateSpecTest|defaultOpts()|0", net.tridentsdk.world.opt.WorldCreateSpec.class, net.tridentsdk.world.opt.WorldCreateSpec.getDefaultOptions());
        org.junit.Assert.assertTrue(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.world.opt.WorldCreateSpecTest|defaultOpts()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.opt.WorldCreateSpec>observeState("net.tridentsdk.world.opt.WorldCreateSpecTest|defaultOpts()|1", net.tridentsdk.world.opt.WorldCreateSpec.class, spec).isDefault()));
    }

    @org.junit.Test
    public void testCustom() throws java.lang.Exception {
        net.tridentsdk.world.opt.WorldCreateSpec spec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.opt.WorldCreateSpec>observeState("net.tridentsdk.world.opt.WorldCreateSpecTest|testCustom()|0", net.tridentsdk.world.opt.WorldCreateSpec.class, net.tridentsdk.world.opt.WorldCreateSpec.custom());
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.world.opt.WorldCreateSpecTest|testCustom()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.opt.WorldCreateSpec>observeState("net.tridentsdk.world.opt.WorldCreateSpecTest|testCustom()|1", net.tridentsdk.world.opt.WorldCreateSpec.class, spec).isDefault()));
    }
}

