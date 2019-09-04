/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 23:41:40 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationUse_ESTest extends JAnnotationUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, " is a primitive");
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jErrorClass0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jCodeModel0.NULL, "value");
      // Undeclared exception!
      try { 
        jAnnotationUse0.param("", jEnumConstant0);
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
      JEnumConstant jEnumConstant0 = new JEnumConstant(jCodeModel0.NULL, "value");
      JAnnotationUse jAnnotationUse1 = jAnnotationUse0.param("value", jEnumConstant0);
      assertSame(jAnnotationUse0, jAnnotationUse1);
  }
}
