/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 21:02:11 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JNarrowedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDirectClass_ESTest extends JDirectClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "A9J y]");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDirectClass0, jDirectClass0.EMPTY_ARRAY);
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, jDirectClass0.EMPTY_ARRAY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(A9J y]<>)
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, ".S[CoJ]");
      assertEquals("S[CoJ]", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "method");
      EClassType eClassType0 = EClassType.INTERFACE;
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, jDirectClass0, eClassType0, "PTx");
      boolean boolean0 = jDirectClass0.equals(jDirectClass1);
      assertEquals("PTx", jDirectClass1.name());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "com.e%:er.jcodemodl.AstractJLlasBotainer");
      boolean boolean0 = jDirectClass0.equals((Object) null);
      assertEquals("AstractJLlasBotainer", jDirectClass0.name());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "Item");
      boolean boolean0 = jDirectClass0.equals(jDirectClass0);
      assertTrue(boolean0);
      assertEquals("Item", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "Item");
      boolean boolean0 = jDirectClass0.equals(jCodeModel0);
      assertEquals("Item", jDirectClass0.name());
      assertFalse(boolean0);
  }
}
