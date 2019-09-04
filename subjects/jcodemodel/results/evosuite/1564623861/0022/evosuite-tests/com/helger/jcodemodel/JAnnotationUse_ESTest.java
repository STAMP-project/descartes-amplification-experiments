/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:10:57 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJAnnotationValueOwned;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JTypeVar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationUse_ESTest extends JAnnotationUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "[i/#Jz?=");
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jTypeVar0);
      Class<AbstractJAnnotationValueOwned.JEnumConstantExpr> class0 = AbstractJAnnotationValueOwned.JEnumConstantExpr.class;
      // Undeclared exception!
      try { 
        jAnnotationUse0.param("", class0);
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
      Class<JDefinedClass> class0 = JDefinedClass.class;
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jCodeModel0.NULL);
      JAnnotationUse jAnnotationUse1 = jAnnotationUse0.param("value", class0);
      assertTrue(jAnnotationUse1.hasAnnotationMembers());
  }
}
