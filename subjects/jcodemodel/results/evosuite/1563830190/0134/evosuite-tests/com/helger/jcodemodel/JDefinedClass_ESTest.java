/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 23:54:59 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JPackage;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDefinedClass_ESTest extends JDefinedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 31, "Value");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDefinedClass0, jDefinedClass0.EMPTY_ARRAY);
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, jCodeModel0.NULL);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "Name");
      EClassType eClassType0 = EClassType.ANNOTATION_TYPE_DECL;
      JDefinedClass jDefinedClass1 = new JDefinedClass(jDefinedClass0, 0, "Name", eClassType0);
      JDefinedClass jDefinedClass2 = jDefinedClass1._extends((AbstractJClass) jDefinedClass0);
      assertFalse(jDefinedClass2.isHidden());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 37, "B");
      JDefinedClass jDefinedClass1 = jDefinedClass0._extends((AbstractJClass) jCodeModel0.NULL);
      assertFalse(jDefinedClass1.isHidden());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.VOID);
      LinkedList<JDirectClass> linkedList0 = new LinkedList<JDirectClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jArrayClass0, linkedList0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      EClassType eClassType0 = EClassType.CLASS;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jAnonymousClass0, 0, "Uk", eClassType0);
      // Undeclared exception!
      try { 
        jAnonymousClass0._extends((AbstractJClass) jDefinedClass0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal class inheritance loop.  Outer class null may not subclass from inner class: null
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.VOID);
      LinkedList<JDirectClass> linkedList0 = new LinkedList<JDirectClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jArrayClass0, linkedList0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      EClassType eClassType0 = EClassType.CLASS;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jAnonymousClass0, 0, "Uk", eClassType0);
      JDefinedClass jDefinedClass1 = jDefinedClass0._extends((AbstractJClass) jDefinedClass0);
      assertFalse(jDefinedClass1.isHidden());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.VOID);
      LinkedList<JDirectClass> linkedList0 = new LinkedList<JDirectClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jArrayClass0, linkedList0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      EClassType eClassType0 = EClassType.INTERFACE;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jAnonymousClass0, 0, "Uk", eClassType0);
      JDefinedClass jDefinedClass1 = jDefinedClass0._extends((AbstractJClass) jDefinedClass0);
      assertFalse(jDefinedClass1.isHidden());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EClassType eClassType0 = EClassType.INTERFACE;
      JCodeModel jCodeModel0 = new JCodeModel();
      JPackage jPackage0 = new JPackage("H", jCodeModel0);
      JDefinedClass jDefinedClass0 = new JDefinedClass(jPackage0, 0, "H", eClassType0);
      // Undeclared exception!
      try { 
        jDefinedClass0._extends((AbstractJClass) jCodeModel0.NULL);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unable to set the super class for an interface
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.VOID);
      LinkedList<JDirectClass> linkedList0 = new LinkedList<JDirectClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jArrayClass0, linkedList0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      JDefinedClass jDefinedClass0 = jAnonymousClass0._extends((AbstractJClass) jAnonymousClass0);
      assertFalse(jDefinedClass0.isHidden());
  }
}
