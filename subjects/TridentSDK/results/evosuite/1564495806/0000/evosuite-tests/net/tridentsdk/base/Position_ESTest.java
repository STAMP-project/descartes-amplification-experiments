/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 14:11:17 GMT 2019
 */

package net.tridentsdk.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import net.tridentsdk.base.Position;
import net.tridentsdk.world.World;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Position_ESTest extends Position_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-1751), (-1751), (-1751));
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-1780.5136816580844), (-1780.5136816580844), (-1780.5136816580844));
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0);
      position0.getChunkZ();
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 984.641862638879, 984.641862638879, 984.641862638879, 949.0F, 949.0F);
      int int0 = position0.getChunkZ();
      assertEquals(61, int0);
      assertEquals(229.0F, position0.getYaw(), 0.01F);
      assertEquals(49.0F, position0.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-17.223874821593544), (-2502.6287F), (-17.223874821593544), (-2502.6287F), (-2502.6287F));
      int int0 = position0.getChunkZ();
      assertEquals((-2), int0);
      assertEquals((-72.62866F), position0.getPitch(), 0.01F);
      assertEquals((-342.62866F), position0.getYaw(), 0.01F);
  }
}
