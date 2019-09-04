package net.tridentsdk.world.opt;


import org.junit.Assert;
import org.junit.Test;


public class OptsTest {
    @Test(timeout = 10000)
    public void gameRuleValueTestnull35_failAssert0() throws Exception {
        try {
            GameRuleMap map = new GameRuleMap();
            map.set(GameRule.DAYLIGHT_CYCLE, false);
            map.set(GameRule.SEND_CMD_FEEDBACK, false);
            map.isSet(GameRule.DAYLIGHT_CYCLE);
            map.isSet(GameRule.SEND_CMD_FEEDBACK);
            map.get(GameRule.DAYLIGHT_CYCLE);
            map.reset(GameRule.DAYLIGHT_CYCLE);
            map.get(GameRule.DAYLIGHT_CYCLE);
            map.get(GameRule.SEND_CMD_FEEDBACK);
            map.resetAll();
            map.get(GameRule.SEND_CMD_FEEDBACK);
            GameRuleMap map2 = new GameRuleMap();
            map2.set(GameRule.DAYLIGHT_CYCLE, false);
            map2.set(GameRule.SEND_CMD_FEEDBACK, false);
            map.copyTo(null);
            map2.get(GameRule.DAYLIGHT_CYCLE);
            map2.get(GameRule.SEND_CMD_FEEDBACK);
            org.junit.Assert.fail("gameRuleValueTestnull35 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

