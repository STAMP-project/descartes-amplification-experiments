/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 12 14:30:48 GMT 2019
 */

package com.squareup.javapoet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.squareup.javapoet.MethodSpec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MethodSpec_ESTest extends MethodSpec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MethodSpec.Builder methodSpec_Builder0 = MethodSpec.methodBuilder("<init>");
      assertNotNull(methodSpec_Builder0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodSpec.methodBuilder((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name == null
         //
         verifyException("com.squareup.javapoet.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodSpec.methodBuilder("boolean");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not a valid name: boolean
         //
         verifyException("com.squareup.javapoet.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MethodSpec.Builder methodSpec_Builder0 = MethodSpec.methodBuilder("AiniuA");
      assertNotNull(methodSpec_Builder0);
  }
}
