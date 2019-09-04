/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 11:12:14 GMT 2019
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
      Position position0 = new Position(world0);
      Position position1 = new Position(world0, 0.0, 0.0, 0.0);
      boolean boolean0 = position0.equals(position1);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertTrue(boolean0);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.0, 0.0, 0.0F, 0.0F);
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, 0.0, 0.0, 1.0);
      boolean boolean0 = position1.equals(position0);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.0, 0.0);
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, 2697, 2697, (-935));
      boolean boolean0 = position1.equals(position0);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertFalse(boolean0);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-1), (-455), (-1));
      boolean boolean0 = position0.equals(position0);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertTrue(boolean0);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.0, 0.0, (-2875.0088F), (-2875.0088F));
      Position position1 = new Position(world0, 0, 0, 0);
      boolean boolean0 = position1.equals(position0);
      assertEquals((-85.00879F), position0.getPitch(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertFalse(boolean0);
      assertFalse(position0.equals((Object)position1));
      assertEquals((-355.0088F), position0.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.0, 0.0, (-2875.82F), (-2875.82F));
      Position position1 = new Position(world0, 0, 0, 0);
      boolean boolean0 = position0.equals(position1);
      assertEquals((-85.82007F), position0.getPitch(), 0.01F);
      assertEquals((-355.82007F), position0.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertFalse(position1.equals((Object)position0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.0, 0.0, 2611.722F, 2611.722F);
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, 0, 0, 0);
      boolean boolean0 = position0.equals(position1);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertFalse(boolean0);
      assertEquals(1.7219238F, position0.getPitch(), 0.01F);
      assertEquals(91.721924F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.0, 0.0, 2611.722F, 2611.722F);
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, 0.0, 0.0, 2611.722F);
      boolean boolean0 = position0.equals(position1);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertFalse(boolean0);
      assertEquals(1.7219238F, position0.getPitch(), 0.01F);
      assertEquals(91.721924F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-3085.963230648), (-3085.963230648), (-3085.963230648), (-34.552025F), (-34.552025F));
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, (-3085.963230648), (-34.552025F), (-34.552025F));
      boolean boolean0 = position0.equals(position1);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0);
      boolean boolean0 = position0.equals("cS");
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertFalse(boolean0);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }
}