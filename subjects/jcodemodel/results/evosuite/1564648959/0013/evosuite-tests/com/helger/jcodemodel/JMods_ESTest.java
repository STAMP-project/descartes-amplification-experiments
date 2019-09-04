/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 08:59:52 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JMods;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMods_ESTest extends JMods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        JMods.forInterface((-2285));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: Illegal modifiers for interface: com.helger.jcodemodel.JMods@0000000001
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JMods jMods0 = new JMods(64);
      assertEquals(64, jMods0.getValue());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JMods jMods0 = JMods.forInterface(1);
      assertEquals(1, jMods0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        JMods.forInterface(1371);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: Illegal modifiers for interface: com.helger.jcodemodel.JMods@0000000001
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JMods jMods0 = JMods.forInterface(0);
      assertEquals(0, jMods0.getValue());
  }
}
