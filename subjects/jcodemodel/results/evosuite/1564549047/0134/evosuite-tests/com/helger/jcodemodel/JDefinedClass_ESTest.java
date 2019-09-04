/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 07:19:16 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDefinedClass_ESTest extends JDefinedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "$S");
      EClassType eClassType0 = EClassType.INTERFACE;
      JDefinedClass jDefinedClass1 = new JDefinedClass(jDefinedClass0, 0, "$S", eClassType0);
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, (IJClassContainer<?>) null, eClassType0, "$S");
      JDefinedClass jDefinedClass2 = jDefinedClass1._extends((AbstractJClass) jDirectClass0);
      assertFalse(jDefinedClass2.isHidden());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "$S");
      EClassType eClassType0 = EClassType.ANNOTATION_TYPE_DECL;
      JDefinedClass jDefinedClass1 = new JDefinedClass(jDefinedClass0, 0, (String) null, eClassType0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jDefinedClass1);
      JDefinedClass jDefinedClass2 = jDefinedClass1._extends((AbstractJClass) jAnonymousClass0);
      assertFalse(jDefinedClass2.isHidden());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 37, "SuperClass");
      JDefinedClass jDefinedClass1 = jDefinedClass0._extends((AbstractJClass) jCodeModel0.NULL);
      assertFalse(jDefinedClass1.isHidden());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDirectClass> iJClassContainer0 = (IJClassContainer<JDirectClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isClass();
      EClassType eClassType0 = EClassType.ANNOTATION_TYPE_DECL;
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, iJClassContainer0, eClassType0, "} JN`$/_");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jDirectClass0);
      // Undeclared exception!
      try { 
        jAnonymousClass0._extends((AbstractJClass) jDirectClass0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.helger.jcodemodel.IJClassContainer$MockitoMock$1988507316 cannot be cast to com.helger.jcodemodel.AbstractJClass
         //
         verifyException("com.helger.jcodemodel.AbstractJClassContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.VOID);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jArrayClass0);
      EClassType eClassType0 = EClassType.ENUM;
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, jAnonymousClass0, eClassType0, "thro");
      // Undeclared exception!
      try { 
        jAnonymousClass0._extends((AbstractJClass) jDirectClass0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal class inheritance loop.  Outer class null may not subclass from inner class: null
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "$S");
      EClassType eClassType0 = EClassType.INTERFACE;
      JDefinedClass jDefinedClass1 = new JDefinedClass(jDefinedClass0, 0, "$S", eClassType0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jDefinedClass1);
      JDefinedClass jDefinedClass2 = jAnonymousClass0._extends((AbstractJClass) jDefinedClass1);
      assertFalse(jDefinedClass2.isHidden());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "$S");
      EClassType eClassType0 = EClassType.INTERFACE;
      JDefinedClass jDefinedClass1 = new JDefinedClass(jDefinedClass0, 0, (String) null, eClassType0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jDefinedClass1);
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, jAnonymousClass0, eClassType0, "$S");
      // Undeclared exception!
      try { 
        jDefinedClass1._extends((AbstractJClass) jDirectClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "$S");
      EClassType eClassType0 = EClassType.INTERFACE;
      JDefinedClass jDefinedClass1 = new JDefinedClass(jDefinedClass0, 0, "$S", eClassType0);
      // Undeclared exception!
      try { 
        jDefinedClass1._extends((AbstractJClass) jDefinedClass0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unable to set the super class for an interface
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }
}