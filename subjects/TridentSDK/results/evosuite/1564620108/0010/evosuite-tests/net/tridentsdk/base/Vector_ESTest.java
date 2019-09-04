/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 00:54:42 GMT 2019
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
      Vector vector0 = new Vector(66, 66, 66);
      Vector vector1 = vector0.add(vector0);
      assertEquals(228.6307065990918, vector1.getMagnitude(), 0.01);
      assertEquals(132.0, vector1.getX(), 0.01);
      assertEquals(132.0, vector1.getZ(), 0.01);
      assertEquals(132, vector1.getIntY());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(5015.1730296468, 5015.1730296468, 5015.1730296468);
      assertEquals(7.545588155189E7, vector0.getMagnitudeSquared(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0, vector0.getIntX());
  }
}
