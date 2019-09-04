/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 23:26:11 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.util.JCHashCodeGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCHashCodeGenerator_ESTest extends JCHashCodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator(object0);
      assertEquals(17, JCHashCodeGenerator.INITIAL_HASHCODE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator(class0);
      assertEquals(0, JCHashCodeGenerator.ILLEGAL_HASHCODE);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        JCHashCodeGenerator.getHashCode(0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Passed hash code is invalid!
         //
         verifyException("com.helger.jcodemodel.util.JCHashCodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[16];
      // Undeclared exception!
      try { 
        JCHashCodeGenerator.getHashCode((-939), objectArray0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // Hash code cannot be changed anymore!
         //
         verifyException("com.helger.jcodemodel.util.JCHashCodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      int int0 = JCHashCodeGenerator.getHashCode((-1), objectArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = JCHashCodeGenerator.getHashCode(17, (Object[]) null);
      assertEquals(17, int0);
  }
}
