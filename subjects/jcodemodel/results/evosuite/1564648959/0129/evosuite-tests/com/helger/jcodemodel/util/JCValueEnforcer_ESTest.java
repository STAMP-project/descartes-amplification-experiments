/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 11:01:14 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.util.JCValueEnforcer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCValueEnforcer_ESTest extends JCValueEnforcer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        JCValueEnforcer.isTrue(false, "[x=(G-6!1oH$j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be true but it is not: [x=(G-6!1oH$j
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCValueEnforcer.isTrue(true, "[x=(G-6!1oH$j");
  }
}
