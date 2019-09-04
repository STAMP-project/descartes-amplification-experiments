/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 21:19:00 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JNarrowedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationUse_ESTest extends JAnnotationUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, jCodeModel0.NULL);
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jNarrowedClass0);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        jAnnotationUse0.paramArray("", intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The value of the string 'Name' may not be empty!
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jCodeModel0.NULL);
      int[] intArray0 = new int[5];
      JAnnotationUse jAnnotationUse1 = jAnnotationUse0.paramArray("value", intArray0);
      assertSame(jAnnotationUse1, jAnnotationUse0);
  }
}
