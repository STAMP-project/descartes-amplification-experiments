/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 12:39:54 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.util.JCHashCodeCalculator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCHashCodeCalculator_ESTest extends JCHashCodeCalculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = JCHashCodeCalculator.append(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = JCHashCodeCalculator.append(268, 129);
      assertEquals(8437, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = JCHashCodeCalculator.append((-1827), (-1827));
      assertEquals((-58464), int0);
  }
}
