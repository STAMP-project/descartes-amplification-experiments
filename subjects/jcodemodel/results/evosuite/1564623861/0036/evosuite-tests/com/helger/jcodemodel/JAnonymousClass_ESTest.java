/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:24:27 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnonymousClass_ESTest extends JAnonymousClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      assertFalse(jAnonymousClass0.isArray());
  }
}
