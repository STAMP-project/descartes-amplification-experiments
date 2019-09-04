/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 11:22:06 GMT 2019
 */

package net.tridentsdk.world.opt;

import org.junit.Test;
import static org.junit.Assert.*;
import net.tridentsdk.world.opt.WorldBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class WorldBorder$DoubleXZ_ESTest extends WorldBorder$DoubleXZ_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-1817.6), 482.9003544224);
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ((-1817.6), 1.0);
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertFalse(boolean0);
      assertFalse(worldBorder_DoubleXZ1.equals((Object)worldBorder_DoubleXZ0));
      assertEquals((-1817.6), worldBorder_DoubleXZ1.getX(), 0.01);
      assertEquals(1.0, worldBorder_DoubleXZ1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(6.0E7, 6.0E7);
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(0.0, 6.0E7);
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertEquals(0.0, worldBorder_DoubleXZ1.getX(), 0.01);
      assertEquals(6.0E7, worldBorder_DoubleXZ1.getZ(), 0.01);
      assertFalse(worldBorder_DoubleXZ1.equals((Object)worldBorder_DoubleXZ0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(48.76193964957255, 48.76193964957255);
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(48.76193964957255, 48.76193964957255);
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertEquals(48.76193964957255, worldBorder_DoubleXZ1.getZ(), 0.01);
      assertTrue(boolean0);
      assertEquals(48.76193964957255, worldBorder_DoubleXZ1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-46.9836065543576), 1637.300586465015);
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(1637.300586465015, (-46.9836065543576));
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertEquals(1637.300586465015, worldBorder_DoubleXZ1.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals((-46.9836065543576), worldBorder_DoubleXZ1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-46.9836065543576), 1637.300586465015);
      boolean boolean0 = worldBorder_DoubleXZ0.equals((Object) null);
      assertEquals((-46.9836065543576), worldBorder_DoubleXZ0.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals(1637.300586465015, worldBorder_DoubleXZ0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-46.9836065543576), 1637.300586465015);
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ0);
      assertEquals(1637.300586465015, worldBorder_DoubleXZ0.getZ(), 0.01);
      assertEquals((-46.9836065543576), worldBorder_DoubleXZ0.getX(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-46.9836065543576), 1637.300586465015);
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ((-46.9836065543576), (-46.9836065543576));
      boolean boolean0 = worldBorder_DoubleXZ1.equals(worldBorder_DoubleXZ0);
      assertFalse(worldBorder_DoubleXZ0.equals((Object)worldBorder_DoubleXZ1));
      assertFalse(boolean0);
      assertEquals((-46.9836065543576), worldBorder_DoubleXZ0.getX(), 0.01);
      assertEquals((-46.9836065543576), worldBorder_DoubleXZ1.getZ(), 0.01);
  }
}
