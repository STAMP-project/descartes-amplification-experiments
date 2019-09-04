/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:15:41 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JTypeVarClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCodeModel_ESTest extends JCodeModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JPackage jPackage0 = new JPackage("\n", jCodeModel0);
      assertTrue(jPackage0.isPackage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jCodeModel0.NULL);
      jCodeModel0.addDontImportClass((AbstractJClass) jTypeVarClass0);
      boolean boolean0 = jCodeModel0.addDontImportClass((AbstractJClass) jTypeVarClass0);
      assertFalse(boolean0);
  }
}