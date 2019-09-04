/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 07:00:44 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JReferencedClass;
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
      AbstractJClass[] abstractJClassArray0 = new AbstractJClass[15];
      abstractJClassArray0[0] = (AbstractJClass) jCodeModel0.NULL;
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, abstractJClassArray0);
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, jNarrowedClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JNarrowedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JDefinedClass> class0 = JDefinedClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "char");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, jErrorClass0);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jNarrowedClass0);
      JNarrowedClass jNarrowedClass1 = new JNarrowedClass(jTypeVarClass0, jTypeVarClass0.EMPTY_ARRAY);
      LinkedList<JDirectClass> linkedList0 = new LinkedList<JDirectClass>();
      JNarrowedClass jNarrowedClass2 = null;
      try {
        jNarrowedClass2 = new JNarrowedClass(jNarrowedClass1, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(com.helger.jcodemodel.JDefinedClass<>)
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      LinkedList<JTypeVar> linkedList0 = new LinkedList<JTypeVar>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, linkedList0);
      assertTrue(jNarrowedClass0.isReference());
  }
}