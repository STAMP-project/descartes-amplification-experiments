/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 12:56:59 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JReferencedClass;
import com.helger.jcodemodel.JTypeVarClass;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JTypeVarClass_ESTest extends JTypeVarClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "M");
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jDefinedClass0);
      // Undeclared exception!
      try { 
        jTypeVarClass0.fullName();
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
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "r", "com.helger.jcodemodel.JTypeVarClass");
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jErrorClass0);
      // Undeclared exception!
      try { 
        jTypeVarClass0.fullName();
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // r
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JPackage jPackage0 = new JPackage("", jCodeModel0);
      EClassType eClassType0 = EClassType.CLASS;
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, jPackage0, eClassType0, "");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDirectClass0, jCodeModel0.NULL);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jNarrowedClass0);
      String string0 = jTypeVarClass0.fullName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<Object> class0 = Object.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      LinkedList<JNarrowedClass> linkedList0 = new LinkedList<JNarrowedClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, linkedList0);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jNarrowedClass0);
      JTypeVarClass jTypeVarClass1 = new JTypeVarClass(jTypeVarClass0);
      String string0 = jTypeVarClass1.fullName();
      assertEquals("java.lang.Object", string0);
  }
}