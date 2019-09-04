/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 20:45:58 GMT 2019
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
      Vector vector0 = new Vector(3074, 3074, 3074);
      Vector vector1 = vector0.subtract(333.6, 333.6, 1529.1);
      assertEquals(1544.9, vector1.getZ(), 0.01);
      assertEquals(4172.085848829096, vector1.getMagnitude(), 0.01);
      assertEquals(2740.4, vector1.getY(), 0.01);
      assertEquals(2740, vector1.getIntX());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector((-1.0), (-1.0), 5);
      assertEquals((-1.0), vector0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0.0, vector0.getMagnitude(), 0.01);
  }
}