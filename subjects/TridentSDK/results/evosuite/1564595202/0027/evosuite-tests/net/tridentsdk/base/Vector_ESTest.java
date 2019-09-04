/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 18:20:34 GMT 2019
 */

package net.tridentsdk.base;

import org.junit.Test;
import static org.junit.Assert.*;
import net.tridentsdk.base.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Vector_ESTest extends Vector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector vector0 = new Vector(15, 15, 15);
      assertEquals(15.0, vector0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector((-1099.8085108444), (-1387.27), 1203.047446718);
      assertEquals(1203, vector0.getIntZ());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      Vector vector1 = vector0.subtract((double) 15, (double) 15, (double) 15);
      assertEquals(675.0, vector1.getMagnitudeSquared(), 0.01);
      assertEquals((-15.0), vector1.getZ(), 0.01);
      assertEquals((-15.0), vector1.getX(), 0.01);
      assertEquals((-15.0), vector1.getY(), 0.01);
  }
}
