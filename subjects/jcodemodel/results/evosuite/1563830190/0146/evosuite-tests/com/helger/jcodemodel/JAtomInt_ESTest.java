/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 12 13:45:48 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAtomInt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAtomInt_ESTest extends JAtomInt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JAtomInt jAtomInt0 = new JAtomInt(0);
      assertEquals(0, jAtomInt0.what());
  }
}