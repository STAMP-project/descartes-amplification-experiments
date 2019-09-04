/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 08:07:20 GMT 2019
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
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(0.0, 3417.8673);
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(0.0, 0.0);
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertEquals(0.0, worldBorder_DoubleXZ0.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, worldBorder_DoubleXZ1.getZ(), 0.01);
      assertFalse(worldBorder_DoubleXZ1.equals((Object)worldBorder_DoubleXZ0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-1995.3861263), 0.2);
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ((-717.013015003261), 0.2);
      boolean boolean0 = worldBorder_DoubleXZ1.equals(worldBorder_DoubleXZ0);
      assertEquals(0.2, worldBorder_DoubleXZ1.getZ(), 0.01);
      assertFalse(boolean0);
      assertEquals((-717.013015003261), worldBorder_DoubleXZ1.getX(), 0.01);
      assertFalse(worldBorder_DoubleXZ0.equals((Object)worldBorder_DoubleXZ1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-140.297086), (-140.297086));
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ((-140.297086), (-140.297086));
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertTrue(boolean0);
      assertEquals((-140.297086), worldBorder_DoubleXZ1.getX(), 0.01);
      assertEquals((-140.297086), worldBorder_DoubleXZ1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-140.297086), (-140.297086));
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(5.999999869243562E7, 5.999999869243562E7);
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertEquals(5.999999869243562E7, worldBorder_DoubleXZ1.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals(5.999999869243562E7, worldBorder_DoubleXZ1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-140.297086), (-140.297086));
      boolean boolean0 = worldBorder_DoubleXZ0.equals("*");
      assertEquals((-140.297086), worldBorder_DoubleXZ0.getZ(), 0.01);
      assertEquals((-140.297086), worldBorder_DoubleXZ0.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-140.297086), (-140.297086));
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ0);
      assertEquals((-140.297086), worldBorder_DoubleXZ0.getX(), 0.01);
      assertEquals((-140.297086), worldBorder_DoubleXZ0.getZ(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ((-140.297086), (-140.297086));
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ((-140.297086), 5.999999869243562E7);
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertFalse(worldBorder_DoubleXZ1.equals((Object)worldBorder_DoubleXZ0));
      assertEquals(5.999999869243562E7, worldBorder_DoubleXZ1.getZ(), 0.01);
      assertFalse(boolean0);
      assertEquals((-140.297086), worldBorder_DoubleXZ1.getX(), 0.01);
  }
}
