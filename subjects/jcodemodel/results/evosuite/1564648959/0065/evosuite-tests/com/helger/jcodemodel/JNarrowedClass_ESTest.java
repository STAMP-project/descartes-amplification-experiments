/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:54:36 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JReferencedClass;
import com.helger.jcodemodel.JTypeVarClass;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JNarrowedClass_ESTest extends JNarrowedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, jCodeModel0.NULL);
      LinkedList<JArrayClass> linkedList0 = new LinkedList<JArrayClass>();
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(null<null>)
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      AbstractJClass[] abstractJClassArray0 = new AbstractJClass[2];
      abstractJClassArray0[0] = (AbstractJClass) jCodeModel0.NULL;
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, abstractJClassArray0);
      LinkedList<JArrayClass> linkedList0 = new LinkedList<JArrayClass>();
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JNarrowedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, jCodeModel0.NULL);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jNarrowedClass0);
      assertFalse(jTypeVarClass0.isInterface());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      LinkedList<JErrorClass> linkedList0 = new LinkedList<JErrorClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, linkedList0);
      assertTrue(jNarrowedClass0.isReference());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JTypeVarClass> class0 = JTypeVarClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      AbstractJClass[] abstractJClassArray0 = new AbstractJClass[4];
      abstractJClassArray0[0] = (AbstractJClass) jReferencedClass0;
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, abstractJClassArray0);
      // Undeclared exception!
      try { 
        jNarrowedClass0.isError();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JNarrowedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "M", "M");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jErrorClass0, jErrorClass0.EMPTY_ARRAY);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      JNarrowedClass jNarrowedClass1 = new JNarrowedClass(jAnonymousClass0, jNarrowedClass0);
      boolean boolean0 = jNarrowedClass1.isError();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "M", "M");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jErrorClass0, jErrorClass0.EMPTY_ARRAY);
      boolean boolean0 = jNarrowedClass0.isError();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JTypeVarClass> class0 = JTypeVarClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, jReferencedClass0.EMPTY_ARRAY);
      boolean boolean0 = jNarrowedClass0.isError();
      assertFalse(boolean0);
  }
}
