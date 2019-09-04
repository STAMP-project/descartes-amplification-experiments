/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 00:01:19 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JAtomLong;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JOpUnary;
import com.helger.jcodemodel.JReferencedClass;
import com.helger.jcodemodel.JTypeWildcard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JEnumConstant_ESTest extends JEnumConstant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "_siHkI)");
      JEnumConstant jEnumConstant0 = new JEnumConstant(jErrorClass0, "_siHkI)");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jErrorClass0, "_siHkI)");
      // Undeclared exception!
      try { 
        jEnumConstant0.equals(jEnumConstant1);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // _siHkI)
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.FLOAT);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jArrayClass0, " R;l@9Buw");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jArrayClass0, " R;l@9Buw");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.FLOAT);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jArrayClass0, " R;l@9Buw");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jArrayClass0, "N<u}q{$aUq1");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JOpUnary> class0 = JOpUnary.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jReferencedClass0, eWildcardBoundMode0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jTypeWildcard0, "UnP}");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jCodeModel0.NULL, "");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JAtomLong> class0 = JAtomLong.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jReferencedClass0, "u");
      boolean boolean0 = jEnumConstant0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.FLOAT);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jArrayClass0, " R;l@9Buw");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JAtomLong> class0 = JAtomLong.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jReferencedClass0, "u");
      boolean boolean0 = jEnumConstant0.equals(jReferencedClass0);
      assertFalse(boolean0);
  }
}