/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:56:55 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JReferencedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JReferencedClass_ESTest extends JReferencedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JNarrowedClass> class0 = JNarrowedClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      AbstractJClass abstractJClass0 = jReferencedClass0.outer();
      assertNull(abstractJClass0);
  }
}
