/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 23:37:49 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JCodeModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCodeModel_ESTest extends JCodeModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<Double> class0 = Double.class;
      jCodeModel0.addDontImportClass(class0);
      boolean boolean0 = jCodeModel0.addDontImportClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        jCodeModel0.addDontImportClass(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // double is a primitive
         //
         verifyException("com.helger.jcodemodel.JCodeModel", e);
      }
  }
}
