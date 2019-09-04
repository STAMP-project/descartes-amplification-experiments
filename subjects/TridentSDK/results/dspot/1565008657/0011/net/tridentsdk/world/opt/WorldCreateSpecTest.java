package net.tridentsdk.world.opt;


import org.junit.Assert;
import org.junit.Test;


public class WorldCreateSpecTest {
    @Test(timeout = 10000)
    public void testCustom() throws Exception {
        WorldCreateSpec spec = WorldCreateSpec.custom();
        Assert.assertFalse(((WorldCreateSpec) (spec)).isDifficultyLocked());
        Assert.assertNull(((WorldCreateSpec) (spec)).getSpawn());
        Assert.assertEquals(0L, ((long) (((WorldCreateSpec) (spec)).getSeed())));
        Assert.assertEquals("default", ((LevelType) (((WorldCreateSpec) (spec)).getLevelType())).toString());
        Assert.assertTrue(((WorldCreateSpec) (spec)).isAllowFeatures());
        Assert.assertEquals("", ((WorldCreateSpec) (spec)).getOptionString());
        Assert.assertNull(((WorldCreateSpec) (spec)).getProvider());
        Assert.assertFalse(((WorldCreateSpec) (spec)).isDefault());
        spec.isDefault();
        Assert.assertFalse(((WorldCreateSpec) (spec)).isDifficultyLocked());
        Assert.assertNull(((WorldCreateSpec) (spec)).getSpawn());
        Assert.assertEquals(0L, ((long) (((WorldCreateSpec) (spec)).getSeed())));
        Assert.assertEquals("default", ((LevelType) (((WorldCreateSpec) (spec)).getLevelType())).toString());
        Assert.assertTrue(((WorldCreateSpec) (spec)).isAllowFeatures());
        Assert.assertEquals("", ((WorldCreateSpec) (spec)).getOptionString());
        Assert.assertNull(((WorldCreateSpec) (spec)).getProvider());
        Assert.assertFalse(((WorldCreateSpec) (spec)).isDefault());
    }
}

