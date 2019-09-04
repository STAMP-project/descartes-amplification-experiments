/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 15:06:42 GMT 2019
 */

package net.tridentsdk.world.opt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.tridentsdk.world.opt.GameRuleMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class GameRuleMap_ESTest extends GameRuleMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GameRuleMap gameRuleMap0 = new GameRuleMap();
      // Undeclared exception!
      try { 
        gameRuleMap0.copyTo((GameRuleMap) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.world.opt.GameRuleMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GameRuleMap gameRuleMap0 = new GameRuleMap();
      gameRuleMap0.copyTo(gameRuleMap0);
  }
}