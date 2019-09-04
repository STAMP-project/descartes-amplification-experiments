/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 22:44:03 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeVarClass;
import com.helger.jcodemodel.JTypeWildcard;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JTypeVarClass_ESTest extends JTypeVarClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.SHORT);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jArrayClass0);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jAnonymousClass0, eWildcardBoundMode0);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jTypeWildcard0);
      JTypeVarClass jTypeVarClass1 = new JTypeVarClass(jTypeVarClass0);
      assertTrue(jTypeVarClass1.isReference());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "com.helger.jcodemodel.JTypeVarClass");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jErrorClass0, jErrorClass0);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jNarrowedClass0, eWildcardBoundMode0);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jTypeWildcard0);
      // Undeclared exception!
      try { 
        jTypeVarClass0.fullName();
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // com.helger.jcodemodel.JTypeVarClass
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 1, "byte");
      LinkedList<JNarrowedClass> linkedList0 = new LinkedList<JNarrowedClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDefinedClass0, linkedList0);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jNarrowedClass0);
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
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.SHORT);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jArrayClass0);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jAnonymousClass0, eWildcardBoundMode0);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jTypeWildcard0);
      String string0 = jTypeVarClass0.fullName();
      assertEquals("? super short[]", string0);
  }
}
