/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 17:11:11 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JReferencedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JReferencedClass_ESTest extends JReferencedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JErrorClass> class0 = JErrorClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      assertFalse(jReferencedClass0.isInterface());
  }
}
