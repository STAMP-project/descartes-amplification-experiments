/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 22:53:59 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JMethod;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMethod_ESTest extends JMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 40, "boolean");
      JMethod jMethod0 = new JMethod(jDefinedClass0, 0, jCodeModel0.INT, "deprecated");
      assertFalse(jMethod0.hasVarArgs());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 40, "boolean");
      JMethod jMethod0 = new JMethod(0, jDefinedClass0);
      assertTrue(jMethod0.isConstructor());
  }
}
