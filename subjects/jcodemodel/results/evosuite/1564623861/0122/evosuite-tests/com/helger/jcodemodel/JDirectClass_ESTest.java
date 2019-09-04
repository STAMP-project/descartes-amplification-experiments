/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 03:56:23 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JNullType;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDirectClass_ESTest extends JDirectClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "v");
      LinkedList<JNullType> linkedList0 = new LinkedList<JNullType>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDirectClass0, linkedList0);
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(v<>)
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, ".<O2x1y_{(c<sTqxJ");
      assertEquals("<O2x1y_{(c<sTqxJ", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "Cannot have two varargs in a method,\nCheck if varParam method of JMethod is invoked more than once");
      EClassType eClassType0 = EClassType.ANNOTATION_TYPE_DECL;
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, jDirectClass0, eClassType0, "Cannot have two varargs in a method,\nCheck if varParam method of JMethod is invoked more than once");
      jDirectClass0.equals(jDirectClass1);
      assertEquals("Cannot have two varargs in a method,\nCheck if varParam method of JMethod is invoked more than once", jDirectClass1.name());
      assertEquals("Cannot have two varargs in a method,\nCheck if varParam method of JMethod is invoked more than once", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "Cannot have two varargs in a method,\nCheck if varParam method of JMethod is invoked more than once");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDirectClass0, jDirectClass0.EMPTY_ARRAY);
      boolean boolean0 = jDirectClass0.equals(jNarrowedClass0);
      assertEquals("Cannot have two varargs in a method,\nCheck if varParam method of JMethod is invoked more than once", jDirectClass0.name());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "3J.Q");
      boolean boolean0 = jDirectClass0.equals(jDirectClass0);
      assertTrue(boolean0);
      assertEquals("Q", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "3J.Q");
      boolean boolean0 = jDirectClass0.equals((Object) null);
      assertEquals("Q", jDirectClass0.name());
      assertFalse(boolean0);
  }
}
