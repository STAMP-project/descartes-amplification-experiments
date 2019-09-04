/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 11:28:11 GMT 2019
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
      Vector vector0 = new Vector((-117), (-117), (-117));
      Vector vector1 = vector0.subtract((double) (-117), (double) (-117), (double) (-117));
      assertEquals(0.0, vector1.getMagnitudeSquared(), 0.01);
      assertEquals(0.0, vector1.getZ(), 0.01);
      assertEquals(0.0, vector1.getX(), 0.01);
      assertEquals(0.0, vector1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(0.0, 1.0, 0.0);
      assertEquals(1.0, vector0.getMagnitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0.0, vector0.getZ(), 0.01);
  }
}
