/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 20:16:09 GMT 2019
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
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator("IhN--l,PXAq");
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
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        JCHashCodeGenerator.getHashCode(objectArray0[0], objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.util.JCHashCodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      int int0 = JCHashCodeGenerator.getHashCode((Object) "", objectArray0);
      assertEquals(528, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        JCHashCodeGenerator.getHashCode((Object) class0, objectArray0);
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
  public void test5()  throws Throwable  {
      Object object0 = new Object();
      int int0 = JCHashCodeGenerator.getHashCode(object0, (Object[]) null);
      //  // Unstable assertion: assertEquals(529, int0);
  }
}
