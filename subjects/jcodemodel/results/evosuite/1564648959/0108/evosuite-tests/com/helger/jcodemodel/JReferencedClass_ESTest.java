/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 10:40:40 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JReferencedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JReferencedClass_ESTest extends JReferencedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JDefinedClass> class0 = JDefinedClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      assertTrue(jReferencedClass0.isReference());
  }
}
