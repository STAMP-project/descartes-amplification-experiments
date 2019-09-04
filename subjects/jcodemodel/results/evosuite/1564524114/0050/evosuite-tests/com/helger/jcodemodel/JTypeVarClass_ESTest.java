/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 22:55:17 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JTypeVarClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JTypeVarClass_ESTest extends JTypeVarClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 27, "A0Nt1OTAION_YPECDEL");
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jDefinedClass0);
      String string0 = jTypeVarClass0.name();
      assertEquals("A0Nt1OTAION_YPECDEL", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jCodeModel0.NULL);
      String string0 = jTypeVarClass0.name();
      assertEquals("null", string0);
  }
}
