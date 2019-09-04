/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 08:41:23 GMT 2019
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
      Vector vector0 = new Vector((-48), (-48), (-48));
      Vector vector1 = vector0.divide((-48), (-48), (-48));
      assertEquals(1.0, vector1.getX(), 0.01);
      assertEquals(1, vector1.getIntY());
      assertEquals(1.0, vector1.getZ(), 0.01);
      assertEquals(3.0, vector1.getMagnitudeSquared(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector((-3306), (-182.809484), (-1.0));
      assertEquals((-182.809484), vector0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0.0, vector0.getMagnitude(), 0.01);
  }
}
