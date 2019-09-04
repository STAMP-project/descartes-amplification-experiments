package net.tridentsdk.world;


import org.junit.Assert;
import org.junit.Test;


public class IntPairTest {
    private final IntPair pair = IntPair.make(100, 200);

    @Test(timeout = 10000)
    public void equalsHashString_mg16() throws Exception {
        IntPair __DSPOT_obj_0 = null;
        IntPair dup = IntPair.make(100, 200);
        Assert.assertEquals(100, ((int) (((IntPair) (dup)).getX())));
        Assert.assertEquals(200, ((int) (((IntPair) (dup)).getZ())));
        Assert.assertEquals("IntPair{100,200}", ((IntPair) (dup)).toString());
        Assert.assertEquals(4261, ((int) (((IntPair) (dup)).hashCode())));
        dup.hashCode();
        this.pair.hashCode();
        dup.toString();
        this.pair.toString();
        boolean o_equalsHashString_mg16__8 = dup.equals(__DSPOT_obj_0);
        Assert.assertFalse(o_equalsHashString_mg16__8);
        Assert.assertEquals(100, ((int) (((IntPair) (dup)).getX())));
        Assert.assertEquals(200, ((int) (((IntPair) (dup)).getZ())));
        Assert.assertEquals("IntPair{100,200}", ((IntPair) (dup)).toString());
        Assert.assertEquals(4261, ((int) (((IntPair) (dup)).hashCode())));
    }
}

