/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 03:54:00 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JTypeVar;
import com.helger.jcodemodel.JTypeVarClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationUse_ESTest extends JAnnotationUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "O{mIO`*s?C");
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jTypeVar0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jTypeVarClass0);
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jAnonymousClass0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jTypeVar0, "O{mIO`*s?C");
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
