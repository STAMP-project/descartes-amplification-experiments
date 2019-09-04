/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 20:58:31 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJAnnotationValueOwned;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JReferencedClass;
import com.helger.jcodemodel.JTypeVar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JEnumConstant_ESTest extends JEnumConstant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "com/helger/jcodemodel/writer/ProgressCodeWriter$IProgressTracker", "Arg");
      JEnumConstant jEnumConstant0 = new JEnumConstant(jErrorClass0, "com/helger/jcodemodel/writer/ProgressCodeWriter$IProgressTracker");
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.SHORT);
      JEnumConstant jEnumConstant1 = new JEnumConstant(jArrayClass0, "");
      // Undeclared exception!
      try { 
        jEnumConstant0.equals(jEnumConstant1);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // com/helger/jcodemodel/writer/ProgressCodeWriter$IProgressTracker
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, " Ca6~%3{~_G3Q;z[`A!");
      JEnumConstant jEnumConstant0 = new JEnumConstant(jTypeVar0, " Ca6~%3{~_G3Q;z[`A!");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jTypeVar0, "Arg");
      boolean boolean0 = jEnumConstant1.equals(jEnumConstant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<AbstractJAnnotationValueOwned.JEnumConstantExpr> class0 = AbstractJAnnotationValueOwned.JEnumConstantExpr.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, jCodeModel0.NULL);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jAnonymousClass0, "Kr Ox.^NGjNW'L>{+/");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jNarrowedClass0, "Kr Ox.^NGjNW'L>{+/");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<AbstractJAnnotationValueOwned.JEnumConstantExpr> class0 = AbstractJAnnotationValueOwned.JEnumConstantExpr.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, jCodeModel0.NULL);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jAnonymousClass0, "Kr Ox.^NGjNW'L>{+/");
      JEnumConstant jEnumConstant1 = new JEnumConstant(jReferencedClass0, "Kr Ox.^NGjNW'L>{+/");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, " Ca6~%3{~_G3Q;z[`A!");
      JEnumConstant jEnumConstant0 = new JEnumConstant(jTypeVar0, " Ca6~%3{~_G3Q;z[`A!");
      boolean boolean0 = jEnumConstant0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<AbstractJAnnotationValueOwned.JEnumConstantExpr> class0 = AbstractJAnnotationValueOwned.JEnumConstantExpr.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, jCodeModel0.NULL);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jAnonymousClass0, "Kr Ox.^NGjNW'L>{+/");
      boolean boolean0 = jEnumConstant0.equals(jEnumConstant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<AbstractJAnnotationValueOwned.JEnumConstantExpr> class0 = AbstractJAnnotationValueOwned.JEnumConstantExpr.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, jCodeModel0.NULL);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jAnonymousClass0, "Kr Ox.^NGjNW'L>{+/");
      boolean boolean0 = jEnumConstant0.equals(jNarrowedClass0);
      assertFalse(boolean0);
  }
}
