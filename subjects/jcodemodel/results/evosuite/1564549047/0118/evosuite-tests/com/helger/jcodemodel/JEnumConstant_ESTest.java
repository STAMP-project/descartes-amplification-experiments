/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 07:05:35 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JTypeVar;
import com.helger.jcodemodel.JTypeVarClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JEnumConstant_ESTest extends JEnumConstant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, ")z8?^h#", "osbgH=|G>gI?");
      JEnumConstant jEnumConstant0 = new JEnumConstant(jErrorClass0, "NewType");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jErrorClass0, "NewType");
      // Undeclared exception!
      try { 
        jEnumConstant0.equals(jEnumConstant1);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // )z8?^h#
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JEnumConstant jEnumConstant0 = new JEnumConstant(jCodeModel0.NULL, "com.helger.jcodemodel.JPrimitiveType");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jCodeModel0.NULL, "qZgwy");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "h vale of he arra ");
      JEnumConstant jEnumConstant0 = new JEnumConstant(jTypeVar0, "h vale of he arra ");
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jCodeModel0.NULL);
      JEnumConstant jEnumConstant1 = new JEnumConstant(jTypeVarClass0, "h vale of he arra ");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JEnumConstant jEnumConstant0 = new JEnumConstant(jCodeModel0.NULL, "Type");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jCodeModel0.NULL, "Type");
      boolean boolean0 = jEnumConstant1.equals(jEnumConstant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "", "");
      JEnumConstant jEnumConstant0 = new JEnumConstant(jErrorClass0, "");
      boolean boolean0 = jEnumConstant0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "", "");
      JEnumConstant jEnumConstant0 = new JEnumConstant(jErrorClass0, "");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JEnumConstant jEnumConstant0 = new JEnumConstant(jCodeModel0.NULL, "com.helger.jcodemodel.JPrimitiveType");
      boolean boolean0 = jEnumConstant0.equals((Object) null);
      assertFalse(boolean0);
  }
}