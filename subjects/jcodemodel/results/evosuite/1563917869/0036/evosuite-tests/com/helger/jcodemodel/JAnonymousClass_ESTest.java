/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 22:23:11 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JReferencedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnonymousClass_ESTest extends JAnonymousClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<Object> class0 = Object.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jReferencedClass0);
      assertFalse(jAnonymousClass0.isAbstract());
  }
}
