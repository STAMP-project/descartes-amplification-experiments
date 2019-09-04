/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 15:13:58 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JPackage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JPackage_ESTest extends JPackage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JPackage jPackage0 = null;
      try {
        jPackage0 = new JPackage("'7,wHwUnHGh4\"&XQD", jCodeModel0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: Package name . is not allowed
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }
}
