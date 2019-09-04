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
package net.tridentsdk.world;


public class IntPairTest {
    private final net.tridentsdk.world.IntPair pair = net.tridentsdk.world.IntPair.make(100, 200);

    @org.junit.Test
    public void testGets() {
        org.junit.Assert.assertEquals(100, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.world.IntPairTest|testGets()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|testGets()|0", net.tridentsdk.world.IntPair.class, this.pair).getX()));
        org.junit.Assert.assertEquals(200, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.world.IntPairTest|testGets()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|testGets()|2", net.tridentsdk.world.IntPair.class, this.pair).getZ()));
    }

    @org.junit.Test
    public void equalsHashString() {
        net.tridentsdk.world.IntPair dup = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|equalsHashString()|0", net.tridentsdk.world.IntPair.class, net.tridentsdk.world.IntPair.make(100, 200));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.world.IntPairTest|equalsHashString()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|equalsHashString()|1", net.tridentsdk.world.IntPair.class, dup).hashCode()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.world.IntPairTest|equalsHashString()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|equalsHashString()|3", net.tridentsdk.world.IntPair.class, this.pair).hashCode()));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|equalsHashString()|5", net.tridentsdk.world.IntPair.class, dup), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|equalsHashString()|6", net.tridentsdk.world.IntPair.class, this.pair));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.world.IntPairTest|equalsHashString()|8", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|equalsHashString()|7", net.tridentsdk.world.IntPair.class, dup).toString()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.world.IntPairTest|equalsHashString()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.IntPair>observeState("net.tridentsdk.world.IntPairTest|equalsHashString()|9", net.tridentsdk.world.IntPair.class, this.pair).toString()));
    }
}

