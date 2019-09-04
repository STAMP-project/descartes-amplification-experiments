/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 20:17:30 GMT 2019
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
      doReturn((String) null).when(world0).getName();
      Position position0 = new Position(world0, 1.0, 0.0, 1.0);
      Position position1 = position0.divide(position0);
      assertEquals(Double.NaN, position1.getY(), 0.01);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertEquals(1, position1.getIntZ());
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(1.0, position1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(world0).getName();
      Position position0 = new Position(world0, 1.0, 0.0, 1.0);
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, (-1313), (-1313), (-3927));
      Position position2 = position0.divide(position1);
      assertEquals((-2.5464731347084286E-4), position2.getZ(), 0.01);
      assertEquals(0.0F, position2.getPitch(), 0.01F);
      assertEquals(-0.0, position2.getY(), 0.01);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertEquals((-7.616146230007616E-4), position2.getX(), 0.01);
      assertEquals(0.0F, position2.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 1.0, (-1023.7), 0.0, (-1760), 302.377F);
      assertEquals(32.377014F, position0.getPitch(), 0.01F);
      assertEquals((-320.0F), position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }
}