package net.tridentsdk.base;


@org.openjdk.jmh.annotations.State(org.openjdk.jmh.annotations.Scope.Benchmark)
public class VectorsTest {
    private static final double CHANGE_TO = -1.382;

    private static final int CHANGE_TO_I = 2919;

    private net.tridentsdk.base.Vector vec = new net.tridentsdk.base.Vector();

    public static net.tridentsdk.base.Vector rand() {
        java.util.concurrent.ThreadLocalRandom r = java.util.concurrent.ThreadLocalRandom.current();
        return new net.tridentsdk.base.Vector(r.nextDouble(), r.nextDouble(), r.nextDouble());
    }

    @org.junit.Test(timeout = 10000)
    public void testOps() throws java.lang.Exception {
        net.tridentsdk.base.Vector v2 = new net.tridentsdk.base.Vector(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO);
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (v2)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (v2)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (v2)).getX())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (v2)).getY())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (v2)).getZ())), 0.1);
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntX())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntY())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-1.382,-1.382,-1.382}", ((net.tridentsdk.base.Vector) (v2)).toString());
        org.junit.Assert.assertEquals(-607553020, ((int) (((net.tridentsdk.base.Vector) (v2)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__3 = this.vec.add(v2);
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getX())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getY())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getZ())), 0.1);
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__3)).getIntX())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__3)).getIntY())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__3)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-1.382,-1.382,-1.382}", ((net.tridentsdk.base.Vector) (o_testOps__3)).toString());
        org.junit.Assert.assertEquals(-607553020, ((int) (((net.tridentsdk.base.Vector) (o_testOps__3)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__4 = this.vec.add(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO);
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getX())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getY())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getZ())), 0.1);
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__4)).getIntX())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__4)).getIntY())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__4)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-1.382,-1.382,-1.382}", ((net.tridentsdk.base.Vector) (o_testOps__4)).toString());
        org.junit.Assert.assertEquals(-607553020, ((int) (((net.tridentsdk.base.Vector) (o_testOps__4)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__5 = this.vec.add(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I);
        org.junit.Assert.assertEquals(5055.856307293553, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(2.5561683E7, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getX())), 0.1);
        org.junit.Assert.assertEquals(2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getY())), 0.1);
        org.junit.Assert.assertEquals(2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getZ())), 0.1);
        org.junit.Assert.assertEquals(2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__5)).getIntX())));
        org.junit.Assert.assertEquals(2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__5)).getIntY())));
        org.junit.Assert.assertEquals(2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__5)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{2919.0,2919.0,2919.0}", ((net.tridentsdk.base.Vector) (o_testOps__5)).toString());
        org.junit.Assert.assertEquals(-955940257, ((int) (((net.tridentsdk.base.Vector) (o_testOps__5)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__6 = this.vec.subtract(v2);
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getX())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getY())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getZ())), 0.1);
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__6)).getIntX())));
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__6)).getIntY())));
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__6)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{1.382,1.382,1.382}", ((net.tridentsdk.base.Vector) (o_testOps__6)).toString());
        org.junit.Assert.assertEquals(1539930628, ((int) (((net.tridentsdk.base.Vector) (o_testOps__6)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__7 = this.vec.subtract(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO);
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getX())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getY())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getZ())), 0.1);
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__7)).getIntX())));
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__7)).getIntY())));
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__7)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{1.382,1.382,1.382}", ((net.tridentsdk.base.Vector) (o_testOps__7)).toString());
        org.junit.Assert.assertEquals(1539930628, ((int) (((net.tridentsdk.base.Vector) (o_testOps__7)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__8 = this.vec.subtract(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I);
        org.junit.Assert.assertEquals(5055.856307293553, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(2.5561683E7, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getX())), 0.1);
        org.junit.Assert.assertEquals(-2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getY())), 0.1);
        org.junit.Assert.assertEquals(-2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getZ())), 0.1);
        org.junit.Assert.assertEquals(-2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__8)).getIntX())));
        org.junit.Assert.assertEquals(-2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__8)).getIntY())));
        org.junit.Assert.assertEquals(-2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__8)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-2919.0,-2919.0,-2919.0}", ((net.tridentsdk.base.Vector) (o_testOps__8)).toString());
        org.junit.Assert.assertEquals(1191543391, ((int) (((net.tridentsdk.base.Vector) (o_testOps__8)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__9 = this.vec.multiply(v2);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getX())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getY())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__9)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__9)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__9)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-0.0,-0.0,-0.0}", ((net.tridentsdk.base.Vector) (o_testOps__9)).toString());
        org.junit.Assert.assertEquals(-2147453857, ((int) (((net.tridentsdk.base.Vector) (o_testOps__9)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__10 = this.vec.multiply(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getX())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getY())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__10)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__10)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__10)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-0.0,-0.0,-0.0}", ((net.tridentsdk.base.Vector) (o_testOps__10)).toString());
        org.junit.Assert.assertEquals(-2147453857, ((int) (((net.tridentsdk.base.Vector) (o_testOps__10)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__11 = this.vec.multiply(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getX())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getY())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__11)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__11)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__11)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{0.0,0.0,0.0}", ((net.tridentsdk.base.Vector) (o_testOps__11)).toString());
        org.junit.Assert.assertEquals(29791, ((int) (((net.tridentsdk.base.Vector) (o_testOps__11)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__12 = this.vec.divide(v2);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getX())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getY())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__12)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__12)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__12)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-0.0,-0.0,-0.0}", ((net.tridentsdk.base.Vector) (o_testOps__12)).toString());
        org.junit.Assert.assertEquals(-2147453857, ((int) (((net.tridentsdk.base.Vector) (o_testOps__12)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__13 = this.vec.divide(net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO, net.tridentsdk.base.VectorsTest.CHANGE_TO);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getX())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getY())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__13)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__13)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__13)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-0.0,-0.0,-0.0}", ((net.tridentsdk.base.Vector) (o_testOps__13)).toString());
        org.junit.Assert.assertEquals(-2147453857, ((int) (((net.tridentsdk.base.Vector) (o_testOps__13)).hashCode())));
        net.tridentsdk.base.Vector o_testOps__14 = this.vec.divide(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getX())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getY())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__14)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__14)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__14)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{0.0,0.0,0.0}", ((net.tridentsdk.base.Vector) (o_testOps__14)).toString());
        org.junit.Assert.assertEquals(29791, ((int) (((net.tridentsdk.base.Vector) (o_testOps__14)).hashCode())));
        new net.tridentsdk.base.Vector();
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (v2)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (v2)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (v2)).getX())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (v2)).getY())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (v2)).getZ())), 0.1);
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntX())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntY())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-1.382,-1.382,-1.382}", ((net.tridentsdk.base.Vector) (v2)).toString());
        org.junit.Assert.assertEquals(-607553020, ((int) (((net.tridentsdk.base.Vector) (v2)).hashCode())));
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getX())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getY())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__3)).getZ())), 0.1);
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__3)).getIntX())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__3)).getIntY())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__3)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-1.382,-1.382,-1.382}", ((net.tridentsdk.base.Vector) (o_testOps__3)).toString());
        org.junit.Assert.assertEquals(-607553020, ((int) (((net.tridentsdk.base.Vector) (o_testOps__3)).hashCode())));
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getX())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getY())), 0.1);
        org.junit.Assert.assertEquals(-1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__4)).getZ())), 0.1);
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__4)).getIntX())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__4)).getIntY())));
        org.junit.Assert.assertEquals(-1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__4)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-1.382,-1.382,-1.382}", ((net.tridentsdk.base.Vector) (o_testOps__4)).toString());
        org.junit.Assert.assertEquals(-607553020, ((int) (((net.tridentsdk.base.Vector) (o_testOps__4)).hashCode())));
        org.junit.Assert.assertEquals(5055.856307293553, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(2.5561683E7, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getX())), 0.1);
        org.junit.Assert.assertEquals(2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getY())), 0.1);
        org.junit.Assert.assertEquals(2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__5)).getZ())), 0.1);
        org.junit.Assert.assertEquals(2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__5)).getIntX())));
        org.junit.Assert.assertEquals(2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__5)).getIntY())));
        org.junit.Assert.assertEquals(2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__5)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{2919.0,2919.0,2919.0}", ((net.tridentsdk.base.Vector) (o_testOps__5)).toString());
        org.junit.Assert.assertEquals(-955940257, ((int) (((net.tridentsdk.base.Vector) (o_testOps__5)).hashCode())));
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getX())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getY())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__6)).getZ())), 0.1);
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__6)).getIntX())));
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__6)).getIntY())));
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__6)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{1.382,1.382,1.382}", ((net.tridentsdk.base.Vector) (o_testOps__6)).toString());
        org.junit.Assert.assertEquals(1539930628, ((int) (((net.tridentsdk.base.Vector) (o_testOps__6)).hashCode())));
        org.junit.Assert.assertEquals(2.393694216060188, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(5.729771999999999, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getX())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getY())), 0.1);
        org.junit.Assert.assertEquals(1.382, ((double) (((net.tridentsdk.base.Vector) (o_testOps__7)).getZ())), 0.1);
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__7)).getIntX())));
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__7)).getIntY())));
        org.junit.Assert.assertEquals(1, ((int) (((net.tridentsdk.base.Vector) (o_testOps__7)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{1.382,1.382,1.382}", ((net.tridentsdk.base.Vector) (o_testOps__7)).toString());
        org.junit.Assert.assertEquals(1539930628, ((int) (((net.tridentsdk.base.Vector) (o_testOps__7)).hashCode())));
        org.junit.Assert.assertEquals(5055.856307293553, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(2.5561683E7, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getX())), 0.1);
        org.junit.Assert.assertEquals(-2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getY())), 0.1);
        org.junit.Assert.assertEquals(-2919.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__8)).getZ())), 0.1);
        org.junit.Assert.assertEquals(-2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__8)).getIntX())));
        org.junit.Assert.assertEquals(-2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__8)).getIntY())));
        org.junit.Assert.assertEquals(-2919, ((int) (((net.tridentsdk.base.Vector) (o_testOps__8)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-2919.0,-2919.0,-2919.0}", ((net.tridentsdk.base.Vector) (o_testOps__8)).toString());
        org.junit.Assert.assertEquals(1191543391, ((int) (((net.tridentsdk.base.Vector) (o_testOps__8)).hashCode())));
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getX())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getY())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__9)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__9)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__9)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__9)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-0.0,-0.0,-0.0}", ((net.tridentsdk.base.Vector) (o_testOps__9)).toString());
        org.junit.Assert.assertEquals(-2147453857, ((int) (((net.tridentsdk.base.Vector) (o_testOps__9)).hashCode())));
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getX())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getY())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__10)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__10)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__10)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__10)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-0.0,-0.0,-0.0}", ((net.tridentsdk.base.Vector) (o_testOps__10)).toString());
        org.junit.Assert.assertEquals(-2147453857, ((int) (((net.tridentsdk.base.Vector) (o_testOps__10)).hashCode())));
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getX())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getY())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__11)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__11)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__11)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__11)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{0.0,0.0,0.0}", ((net.tridentsdk.base.Vector) (o_testOps__11)).toString());
        org.junit.Assert.assertEquals(29791, ((int) (((net.tridentsdk.base.Vector) (o_testOps__11)).hashCode())));
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getX())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getY())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__12)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__12)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__12)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__12)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-0.0,-0.0,-0.0}", ((net.tridentsdk.base.Vector) (o_testOps__12)).toString());
        org.junit.Assert.assertEquals(-2147453857, ((int) (((net.tridentsdk.base.Vector) (o_testOps__12)).hashCode())));
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getX())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getY())), 0.1);
        org.junit.Assert.assertEquals(-0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__13)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__13)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__13)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__13)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{-0.0,-0.0,-0.0}", ((net.tridentsdk.base.Vector) (o_testOps__13)).toString());
        org.junit.Assert.assertEquals(-2147453857, ((int) (((net.tridentsdk.base.Vector) (o_testOps__13)).hashCode())));
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getX())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getY())), 0.1);
        org.junit.Assert.assertEquals(0.0, ((double) (((net.tridentsdk.base.Vector) (o_testOps__14)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__14)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__14)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (o_testOps__14)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{0.0,0.0,0.0}", ((net.tridentsdk.base.Vector) (o_testOps__14)).toString());
        org.junit.Assert.assertEquals(29791, ((int) (((net.tridentsdk.base.Vector) (o_testOps__14)).hashCode())));
    }

    public static void main(java.lang.String[] args) {
        net.tridentsdk.base.VectorsTest.m2();
    }

    public static void m1() {
        net.tridentsdk.base.Vector vec = new net.tridentsdk.base.Vector(0, 0, 0);
        int recursions = 600000000;
        long modulo = 100;
        net.tridentsdk.base.VectorsTest.p("Attempting to inline add(i, i, i)");
        int curMod = 0;
        for (int i = 0; i < recursions; i++) {
            if ((i & modulo) == 0) {
                curMod = i ^ ((int) (java.lang.System.currentTimeMillis()));
            }
            vec.add(curMod, curMod, curMod);
        }
        net.tridentsdk.base.VectorsTest.p(("Finished attempt at " + (((vec.getX()) + (vec.getY())) + (vec.getZ()))));
    }

    private static void p(java.lang.String s) {
        java.lang.System.out.println(s);
    }

    public static void m2() {
        org.openjdk.jmh.runner.options.Options opt = new org.openjdk.jmh.runner.options.OptionsBuilder().include(((".*" + (net.tridentsdk.base.VectorsTest.class.getSimpleName())) + ".*")).timeUnit(java.util.concurrent.TimeUnit.SECONDS).mode(org.openjdk.jmh.annotations.Mode.Throughput).operationsPerInvocation(1).warmupIterations(20).measurementIterations(5).forks(1).threads(4).build();
        java.util.Collection<org.openjdk.jmh.results.RunResult> results = null;
        try {
            results = new org.openjdk.jmh.runner.Runner(opt).run();
        } catch (org.openjdk.jmh.runner.RunnerException e) {
            e.printStackTrace();
        }
        for (org.openjdk.jmh.results.RunResult result : results) {
            java.lang.System.out.println((((result.getPrimaryResult().getLabel()) + " - ") + (result.getPrimaryResult().getScore())));
        }
    }

    private int modifier;

    private net.tridentsdk.base.Vector adder;

    @org.openjdk.jmh.annotations.Setup(org.openjdk.jmh.annotations.Level.Iteration)
    public void setup() {
        this.modifier = java.util.concurrent.ThreadLocalRandom.current().nextInt();
        this.adder = new net.tridentsdk.base.Vector(this.modifier, this.modifier, this.modifier);
    }

    public void add() {
        this.vec.add(this.modifier, this.modifier, this.modifier);
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void addT() {
        this.vec.add(this.adder);
    }

    @org.openjdk.jmh.annotations.TearDown(org.openjdk.jmh.annotations.Level.Trial)
    public void teardown(org.openjdk.jmh.infra.Blackhole bh) {
        bh.consume((((this.vec.getX()) + (this.vec.getY())) + (this.vec.getZ())));
    }

    public static void m3() {
        while (true) {
        } 
    }
}

