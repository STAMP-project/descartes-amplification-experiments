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
    public void testNormalize() throws java.lang.Exception {
        net.tridentsdk.base.Vector v2 = new net.tridentsdk.base.Vector(net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I, net.tridentsdk.base.VectorsTest.CHANGE_TO_I).normalize();
        org.junit.Assert.assertEquals(1.0, ((double) (((net.tridentsdk.base.Vector) (v2)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(1.0, ((double) (((net.tridentsdk.base.Vector) (v2)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.5773502691896257, ((double) (((net.tridentsdk.base.Vector) (v2)).getX())), 0.1);
        org.junit.Assert.assertEquals(0.5773502691896257, ((double) (((net.tridentsdk.base.Vector) (v2)).getY())), 0.1);
        org.junit.Assert.assertEquals(0.5773502691896257, ((double) (((net.tridentsdk.base.Vector) (v2)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{0.5773502691896257,0.5773502691896257,0.5773502691896257}", ((net.tridentsdk.base.Vector) (v2)).toString());
        org.junit.Assert.assertEquals(-179022918, ((int) (((net.tridentsdk.base.Vector) (v2)).hashCode())));
        v2.getMagnitude();
        org.junit.Assert.assertEquals(1.0, ((double) (((net.tridentsdk.base.Vector) (v2)).getMagnitudeSquared())), 0.1);
        org.junit.Assert.assertEquals(1.0, ((double) (((net.tridentsdk.base.Vector) (v2)).getMagnitude())), 0.1);
        org.junit.Assert.assertEquals(0.5773502691896257, ((double) (((net.tridentsdk.base.Vector) (v2)).getX())), 0.1);
        org.junit.Assert.assertEquals(0.5773502691896257, ((double) (((net.tridentsdk.base.Vector) (v2)).getY())), 0.1);
        org.junit.Assert.assertEquals(0.5773502691896257, ((double) (((net.tridentsdk.base.Vector) (v2)).getZ())), 0.1);
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntX())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntY())));
        org.junit.Assert.assertEquals(0, ((int) (((net.tridentsdk.base.Vector) (v2)).getIntZ())));
        org.junit.Assert.assertEquals("Vector{0.5773502691896257,0.5773502691896257,0.5773502691896257}", ((net.tridentsdk.base.Vector) (v2)).toString());
        org.junit.Assert.assertEquals(-179022918, ((int) (((net.tridentsdk.base.Vector) (v2)).hashCode())));
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

