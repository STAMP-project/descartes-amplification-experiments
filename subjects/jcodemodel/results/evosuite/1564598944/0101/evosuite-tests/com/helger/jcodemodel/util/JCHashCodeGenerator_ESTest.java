/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 20:40:40 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.util.JCHashCodeGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCHashCodeGenerator_ESTest extends JCHashCodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator((Object) class0);
      assertEquals(17, JCHashCodeGenerator.INITIAL_HASHCODE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator(class0);
      assertEquals(17, JCHashCodeGenerator.INITIAL_HASHCODE);
  }
}