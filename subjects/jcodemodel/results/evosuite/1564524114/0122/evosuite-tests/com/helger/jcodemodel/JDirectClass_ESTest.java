/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 00:13:43 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JNarrowedClass;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDirectClass_ESTest extends JDirectClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "&2q&55<NZX{G");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, jDirectClass0);
      LinkedList<JAnonymousClass> linkedList0 = new LinkedList<JAnonymousClass>();
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(null<&2q&55<NZX{G>)
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, ".yHpA");
      assertEquals("yHpA", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "\"e\"[-nNq;7ey_lc}D");
      EClassType eClassType0 = EClassType.ANNOTATION_TYPE_DECL;
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, jDirectClass0, eClassType0, "\"e\"[-nNq;7ey_lc}D");
      jDirectClass0.equals(jDirectClass1);
      assertEquals("\"e\"[-nNq;7ey_lc}D", jDirectClass1.name());
      assertEquals("\"e\"[-nNq;7ey_lc}D", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "<.g3)");
      boolean boolean0 = jDirectClass0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals("g3)", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "\"e\"[-nNq;7ey_lc}D");
      boolean boolean0 = jDirectClass0.equals(jDirectClass0);
      assertTrue(boolean0);
      assertEquals("\"e\"[-nNq;7ey_lc}D", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "<.g3)");
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "<.g3)", (String) null);
      boolean boolean0 = jDirectClass0.equals(jErrorClass0);
      assertFalse(boolean0);
      assertEquals("g3)", jDirectClass0.name());
  }
}
