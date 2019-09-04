/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 12:08:43 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JErrorClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDefinedClass_ESTest extends JDefinedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jErrorClass0);
      EClassType eClassType0 = EClassType.ENUM;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jAnonymousClass0, 36, "a", eClassType0);
      assertFalse(jDefinedClass0.isHidden());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 56, "SuperCClass");
      boolean boolean0 = jDefinedClass0.hasHeaderComment();
      assertFalse(boolean0);
      assertFalse(jDefinedClass0.isHidden());
  }
}
