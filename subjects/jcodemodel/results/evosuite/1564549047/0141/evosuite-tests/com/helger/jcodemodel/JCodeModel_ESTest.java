/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 07:27:38 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JCodeModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCodeModel_ESTest extends JCodeModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      assertEquals("\n", jCodeModel0.getBuildingNewLine());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = JCodeModel.checkIfFileSystemIsCaseSensitive();
      assertTrue(boolean0);
  }
}
