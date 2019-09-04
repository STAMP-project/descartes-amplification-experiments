/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 13:08:00 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeVar;
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
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, jNarrowedClass0);
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
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, ":a,R");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jTypeVar0);
      AbstractJClass[] abstractJClassArray0 = new AbstractJClass[9];
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jTypeVar0, jTypeVar0);
      abstractJClassArray0[0] = (AbstractJClass) jNarrowedClass0;
      JNarrowedClass jNarrowedClass1 = new JNarrowedClass(jAnonymousClass0, abstractJClassArray0);
      JTypeVarClass jTypeVarClass0 = null;
      try {
        jTypeVarClass0 = new JTypeVarClass(jNarrowedClass1);
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
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "\"Y+n]@_wPo Z");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jTypeVar0);
      AbstractJClass[] abstractJClassArray0 = new AbstractJClass[22];
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jAnonymousClass0, abstractJClassArray0);
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
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, jCodeModel0.NULL);
      boolean boolean0 = jNarrowedClass0.isError();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "ucn");
      LinkedList<JDirectClass> linkedList0 = new LinkedList<JDirectClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jErrorClass0, linkedList0);
      boolean boolean0 = jNarrowedClass0.isError();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "Nar;6roTing|Ceasses", "Nar;6roTing|Ceasses");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jErrorClass0);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jAnonymousClass0, jErrorClass0);
      boolean boolean0 = jNarrowedClass0.isError();
      assertTrue(boolean0);
  }
}