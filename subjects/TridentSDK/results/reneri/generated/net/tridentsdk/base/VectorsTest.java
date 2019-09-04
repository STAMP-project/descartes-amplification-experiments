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
package net.tridentsdk.base;


@org.openjdk.jmh.annotations.State(org.openjdk.jmh.annotations.Scope.Benchmark)
public class VectorsTest {
    // close eyes, put hand on numpad to get these values
    // numbers selected from "fair dice roll"
    private static final double CHANGE_TO = -1.382;

    private static final int CHANGE_TO_I = 2919;

    private net.tridentsdk.base.Vector vec = new net.tridentsdk.base.Vector();

    public static net.tridentsdk.base.Vector rand() {
        java.util.concurrent.ThreadLocalRandom r = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.ThreadLocalRandom>observeState("net.tridentsdk.base.VectorsTest|rand()|0", java.util.concurrent.ThreadLocalRandom.class, java.util.concurrent.ThreadLocalRandom.current());
        return eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|rand()|7", net.tridentsdk.base.Vector.class, new net.tridentsdk.base.Vector(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|rand()|2", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.ThreadLocalRandom>observeState("net.tridentsdk.base.VectorsTest|rand()|1", java.util.concurrent.ThreadLocalRandom.class, r).nextDouble()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|rand()|4", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.ThreadLocalRandom>observeState("net.tridentsdk.base.VectorsTest|rand()|3", java.util.concurrent.ThreadLocalRandom.class, r).nextDouble()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|rand()|6", eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.ThreadLocalRandom>observeState("net.tridentsdk.base.VectorsTest|rand()|5", java.util.concurrent.ThreadLocalRandom.class, r).nextDouble())));
    }

    @org.junit.Test
    public void testSetsEqualsHash() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|1", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|0", net.tridentsdk.base.Vector.class, this.vec).setX(net.tridentsdk.base.VectorsTest.CHANGE_TO)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|3", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|2", net.tridentsdk.base.Vector.class, this.vec).setY(net.tridentsdk.base.VectorsTest.CHANGE_TO)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|5", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|4", net.tridentsdk.base.Vector.class, this.vec).setZ(net.tridentsdk.base.VectorsTest.CHANGE_TO)));
        net.tridentsdk.base.Vector v2 = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|6", net.tridentsdk.base.Vector.class, new net.tridentsdk.base.Vector(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|7", net.tridentsdk.base.Vector.class, v2), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|8", net.tridentsdk.base.Vector.class, this.vec));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|10", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|9", net.tridentsdk.base.Vector.class, v2).hashCode()), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|12", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|11", net.tridentsdk.base.Vector.class, this.vec).hashCode()));
        org.junit.Assert.assertFalse(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|15", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|13", net.tridentsdk.base.Vector.class, this.vec).equals(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.Object>observeState("net.tridentsdk.base.VectorsTest|testSetsEqualsHash()|14", java.lang.Object.class, new java.lang.Object()))));
    }

    @org.junit.Test
    public void testSGDouble() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|1", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|0", net.tridentsdk.base.Vector.class, this.vec).setX(net.tridentsdk.base.VectorsTest.CHANGE_TO)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|3", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|2", net.tridentsdk.base.Vector.class, this.vec).setY(net.tridentsdk.base.VectorsTest.CHANGE_TO)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|5", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|4", net.tridentsdk.base.Vector.class, this.vec).setZ(net.tridentsdk.base.VectorsTest.CHANGE_TO)));
        org.junit.Assert.assertEquals(net.tridentsdk.base.VectorsTest.CHANGE_TO, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|6", net.tridentsdk.base.Vector.class, this.vec).getX(), 0);
        org.junit.Assert.assertEquals(net.tridentsdk.base.VectorsTest.CHANGE_TO, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|7", net.tridentsdk.base.Vector.class, this.vec).getY(), 0);
        org.junit.Assert.assertEquals(net.tridentsdk.base.VectorsTest.CHANGE_TO, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGDouble()|8", net.tridentsdk.base.Vector.class, this.vec).getZ(), 0);
    }

    @org.junit.Test
    public void testSGInt() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|1", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|0", net.tridentsdk.base.Vector.class, this.vec).setX(net.tridentsdk.base.VectorsTest.CHANGE_TO_I)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|3", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|2", net.tridentsdk.base.Vector.class, this.vec).setY(net.tridentsdk.base.VectorsTest.CHANGE_TO_I)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|5", net.tridentsdk.base.Vector.class, (this.vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|4", net.tridentsdk.base.Vector.class, this.vec).setZ(net.tridentsdk.base.VectorsTest.CHANGE_TO_I)));
        org.junit.Assert.assertEquals(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|testSGInt()|7", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|6", net.tridentsdk.base.Vector.class, this.vec).getIntX()));
        org.junit.Assert.assertEquals(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|testSGInt()|9", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|8", net.tridentsdk.base.Vector.class, this.vec).getIntY()));
        org.junit.Assert.assertEquals(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|testSGInt()|11", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testSGInt()|10", net.tridentsdk.base.Vector.class, this.vec).getIntZ()));
    }

    @org.junit.Test
    public void testOps() {
        net.tridentsdk.base.Vector v2 = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|0", net.tridentsdk.base.Vector.class, new net.tridentsdk.base.Vector(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|3", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|1", net.tridentsdk.base.Vector.class, this.vec).add(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|2", net.tridentsdk.base.Vector.class, v2)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|5", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|4", net.tridentsdk.base.Vector.class, this.vec).add(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|7", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|6", net.tridentsdk.base.Vector.class, this.vec).add(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|10", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|8", net.tridentsdk.base.Vector.class, this.vec).subtract(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|9", net.tridentsdk.base.Vector.class, v2)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|12", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|11", net.tridentsdk.base.Vector.class, this.vec).subtract(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|14", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|13", net.tridentsdk.base.Vector.class, this.vec).subtract(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|17", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|15", net.tridentsdk.base.Vector.class, this.vec).multiply(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|16", net.tridentsdk.base.Vector.class, v2)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|19", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|18", net.tridentsdk.base.Vector.class, this.vec).multiply(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|21", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|20", net.tridentsdk.base.Vector.class, this.vec).multiply(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|24", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|22", net.tridentsdk.base.Vector.class, this.vec).divide(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|23", net.tridentsdk.base.Vector.class, v2)));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|26", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|25", net.tridentsdk.base.Vector.class, this.vec).divide(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|28", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|27", net.tridentsdk.base.Vector.class, this.vec).divide(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|29", net.tridentsdk.base.Vector.class, new net.tridentsdk.base.Vector()), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testOps()|30", net.tridentsdk.base.Vector.class, this.vec));
    }

    @org.junit.Test
    public void testIntConstructor() {
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testIntConstructor()|0", net.tridentsdk.base.Vector.class, new net.tridentsdk.base.Vector(0, 0, 0)), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testIntConstructor()|1", net.tridentsdk.base.Vector.class, this.vec));
    }

    @org.junit.Test
    public void testNormalize() {
        net.tridentsdk.base.Vector v2 = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testNormalize()|1", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testNormalize()|0", net.tridentsdk.base.Vector.class, new net.tridentsdk.base.Vector(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I)).normalize());
        org.junit.Assert.assertEquals(1, eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|testNormalize()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testNormalize()|2", net.tridentsdk.base.Vector.class, v2).getMagnitude()), 0);
    }

    @org.junit.Test
    public void testToString() {
        org.junit.Assert.assertNotNull(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|testToString()|1", eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testToString()|0", net.tridentsdk.base.Vector.class, this.vec).toString()));
    }

    @org.junit.Test
    public void testToPosition() {
        net.tridentsdk.world.World world = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.World>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|0", net.tridentsdk.world.World.class, org.mockito.Mockito.mock(net.tridentsdk.world.World.class));
        net.tridentsdk.base.Position position = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Position>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|3", net.tridentsdk.base.Position.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|1", net.tridentsdk.base.Vector.class, this.vec).toPosition(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.World>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|2", net.tridentsdk.world.World.class, world)));
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.world.World>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|4", net.tridentsdk.world.World.class, world), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Position>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|5", net.tridentsdk.base.Position.class, position).getWorld());
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Position>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|6", net.tridentsdk.base.Position.class, position).getX(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|7", net.tridentsdk.base.Vector.class, this.vec).getX(), 0);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Position>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|8", net.tridentsdk.base.Position.class, position).getY(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|9", net.tridentsdk.base.Vector.class, this.vec).getY(), 0);
        org.junit.Assert.assertEquals(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Position>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|10", net.tridentsdk.base.Position.class, position).getZ(), eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|testToPosition()|11", net.tridentsdk.base.Vector.class, this.vec).getZ(), 0);
    }

    public static void main(java.lang.String[] args) {
        net.tridentsdk.base.VectorsTest.m2();
    }

    // Runtime params
    // -server -XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining
    public static void m1() {
        net.tridentsdk.base.Vector vec = eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|m1()|0", net.tridentsdk.base.Vector.class, new net.tridentsdk.base.Vector(0, 0, 0));
        int recursions = 600000000;
        long modulo = 100;
        net.tridentsdk.base.VectorsTest.p("Attempting to inline add(i, i, i)");
        int curMod = 0;
        for (int i = 0; (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|1", i)) < (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|2", recursions)); i++) {
            if (((eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|3", i)) & (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|4", modulo))) == 0) {
                eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|7", (curMod = (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|5", i)) ^ (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|6", ((int) (java.lang.System.currentTimeMillis()))))));
            }
            eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|m1()|12", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|m1()|8", net.tridentsdk.base.Vector.class, vec).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|9", curMod), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|10", curMod), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m1()|11", curMod)));
        }
        net.tridentsdk.base.VectorsTest.p(("Finished attempt at " + (((eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|m1()|13", net.tridentsdk.base.Vector.class, vec).getX()) + (eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|m1()|14", net.tridentsdk.base.Vector.class, vec).getY())) + (eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|m1()|15", net.tridentsdk.base.Vector.class, vec).getZ()))));
    }

    private static void p(java.lang.String s) {
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("net.tridentsdk.base.VectorsTest|p(java.lang.String)|0", java.io.PrintStream.class, java.lang.System.out).println(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|p(java.lang.String)|1", s));
    }

    // //////////////////////////////////////////////////////
    // BENCHMARKING ////////////////////////////////////////
    // //////////////////////////////////////////////////////
    public static void m2() {
        org.openjdk.jmh.runner.options.Options opt = eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.Options>observeState("net.tridentsdk.base.VectorsTest|m2()|12", org.openjdk.jmh.runner.options.Options.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.ChainedOptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|11", org.openjdk.jmh.runner.options.ChainedOptionsBuilder.class, // .verbosity(VerboseMode.SILENT)
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.ChainedOptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|10", org.openjdk.jmh.runner.options.ChainedOptionsBuilder.class, // .measurementTime(TimeValue.milliseconds(1))
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.ChainedOptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|9", org.openjdk.jmh.runner.options.ChainedOptionsBuilder.class, // .warmupTime(TimeValue.milliseconds(1))
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.ChainedOptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|8", org.openjdk.jmh.runner.options.ChainedOptionsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.ChainedOptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|7", org.openjdk.jmh.runner.options.ChainedOptionsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.ChainedOptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|6", org.openjdk.jmh.runner.options.ChainedOptionsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.ChainedOptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|4", org.openjdk.jmh.runner.options.ChainedOptionsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.ChainedOptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|2", org.openjdk.jmh.runner.options.ChainedOptionsBuilder.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.OptionsBuilder>observeState("net.tridentsdk.base.VectorsTest|m2()|0", org.openjdk.jmh.runner.options.OptionsBuilder.class, new org.openjdk.jmh.runner.options.OptionsBuilder()).include(((".*" + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m2()|1", net.tridentsdk.base.VectorsTest.class.getSimpleName()))) + ".*"))).timeUnit(eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.TimeUnit>observeState("net.tridentsdk.base.VectorsTest|m2()|3", java.util.concurrent.TimeUnit.class, java.util.concurrent.TimeUnit.SECONDS))).mode(eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.annotations.Mode>observeState("net.tridentsdk.base.VectorsTest|m2()|5", org.openjdk.jmh.annotations.Mode.class, org.openjdk.jmh.annotations.Mode.Throughput))).operationsPerInvocation(1)).warmupIterations(20)).measurementIterations(5)).forks(1)).threads(4)).build());
        java.util.Collection<org.openjdk.jmh.results.RunResult> results = null;
        try {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<org.openjdk.jmh.results.RunResult>>observeState("net.tridentsdk.base.VectorsTest|m2()|15", java.util.Collection.class, (results = eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.Runner>observeState("net.tridentsdk.base.VectorsTest|m2()|14", org.openjdk.jmh.runner.Runner.class, new org.openjdk.jmh.runner.Runner(eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.options.Options>observeState("net.tridentsdk.base.VectorsTest|m2()|13", org.openjdk.jmh.runner.options.Options.class, opt))).run()));
        } catch (org.openjdk.jmh.runner.RunnerException e) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.runner.RunnerException>observeState("net.tridentsdk.base.VectorsTest|m2()|16", org.openjdk.jmh.runner.RunnerException.class, e).printStackTrace();
        }
        for (org.openjdk.jmh.results.RunResult result : eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Collection<org.openjdk.jmh.results.RunResult>>observeState("net.tridentsdk.base.VectorsTest|m2()|17", java.util.Collection.class, results)) {
            eu.stamp_project.reneri.instrumentation.StateObserver.<java.io.PrintStream>observeState("net.tridentsdk.base.VectorsTest|m2()|18", java.io.PrintStream.class, java.lang.System.out).println((((eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m2()|21", eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.results.Result>observeState("net.tridentsdk.base.VectorsTest|m2()|20", org.openjdk.jmh.results.Result.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.results.RunResult>observeState("net.tridentsdk.base.VectorsTest|m2()|19", org.openjdk.jmh.results.RunResult.class, result).getPrimaryResult()).getLabel())) + " - ") + (eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|m2()|24", eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.results.Result>observeState("net.tridentsdk.base.VectorsTest|m2()|23", org.openjdk.jmh.results.Result.class, eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.results.RunResult>observeState("net.tridentsdk.base.VectorsTest|m2()|22", org.openjdk.jmh.results.RunResult.class, result).getPrimaryResult()).getScore()))));
        }
    }

    private int modifier;

    private net.tridentsdk.base.Vector adder;

    @org.openjdk.jmh.annotations.Setup(org.openjdk.jmh.annotations.Level.Iteration)
    public void setup() {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|setup()|1", (this.modifier = eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.concurrent.ThreadLocalRandom>observeState("net.tridentsdk.base.VectorsTest|setup()|0", java.util.concurrent.ThreadLocalRandom.class, java.util.concurrent.ThreadLocalRandom.current()).nextInt()));
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|setup()|5", net.tridentsdk.base.Vector.class, (this.adder = new net.tridentsdk.base.Vector(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|setup()|2", this.modifier), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|setup()|3", this.modifier), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|setup()|4", this.modifier))));
    }

    // @Benchmark
    public void add() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|add()|4", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|add()|0", net.tridentsdk.base.Vector.class, this.vec).add(eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|add()|1", this.modifier), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|add()|2", this.modifier), eu.stamp_project.reneri.instrumentation.StateObserver.observe("net.tridentsdk.base.VectorsTest|add()|3", this.modifier)));
    }

    // Code duplication - addT - 2.5937485694194634E7
    // invokespecial opcode - addT - 2.4965829257029913E7
    // 27: invokespecial #8 // Method addImpl:(DDD)V
    // Notice the similar times between the invokespecial
    // and code duplication - this is inlining at work
    // what it does is it expands the method and pulls the
    // addImpl operations, injecting them in place of the
    // method call.
    // Ignoring the initial warmup iterations allow us to
    // look at the following jump between a time similar to
    // invokevirtual jump to that of inlined code:
    // # Warmup Iteration   8: 18829839.027 ops/s
    // # Warmup Iteration   9: 25005316.367 ops/s
    // # Warmup Iteration  10: 24855428.458 ops/s
    // # Warmup Iteration  11: 25181116.085 ops/s
    // This is an oversimplification of the JIT due to other
    // potential things that it could do (such as deopts)
    // that cause invokevirtual to be slightly slower than
    // using invokespecial, but I have chosen to ignore them
    // for brevity. Please use -verbose:jit for more info.
    // 
    // Also note that these numbers are single-thread values
    // because the contended performance is irrelevant to
    // the raw times produced by any individual thread
    // that acquires the lock immediately. However, due to
    // the fact that this is highly unlikely, I will post
    // numbers running at 4 thread concurrent:
    // addImpl - addT - 9473313.90775613
    // add     - addT - 3940973.8172573545
    // As you can see the speedup provided by delegating
    // down to an ininable method is double and a half the
    // throughput of delegating to a lower implementation.
    // Note to self: javap -v -l -c -p [file] > ..txt
    // -v -l -c
    // Remember your media players when analysing bytecode
    // invokevirtual opcode - addT - 1.873220697301835E7
    @org.openjdk.jmh.annotations.Benchmark
    public void addT() {
        eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|addT()|2", net.tridentsdk.base.Vector.class, eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|addT()|0", net.tridentsdk.base.Vector.class, this.vec).add(eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|addT()|1", net.tridentsdk.base.Vector.class, this.adder)));
    }

    @org.openjdk.jmh.annotations.TearDown(org.openjdk.jmh.annotations.Level.Trial)
    public void teardown(org.openjdk.jmh.infra.Blackhole bh) {
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.openjdk.jmh.infra.Blackhole>observeState("net.tridentsdk.base.VectorsTest|teardown(org.openjdk.jmh.infra.Blackhole)|0", org.openjdk.jmh.infra.Blackhole.class, bh).consume((((eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|teardown(org.openjdk.jmh.infra.Blackhole)|1", net.tridentsdk.base.Vector.class, this.vec).getX()) + (eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|teardown(org.openjdk.jmh.infra.Blackhole)|2", net.tridentsdk.base.Vector.class, this.vec).getY())) + (eu.stamp_project.reneri.instrumentation.StateObserver.<net.tridentsdk.base.Vector>observeState("net.tridentsdk.base.VectorsTest|teardown(org.openjdk.jmh.infra.Blackhole)|3", net.tridentsdk.base.Vector.class, this.vec).getZ())));
    }

    // JVM tuning test dummy
    public static void m3() {
        while (true) {
        } 
    }
}

