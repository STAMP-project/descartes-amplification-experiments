/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 12:32:46 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JReferencedClass;
import com.helger.jcodemodel.JTypeVar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMethod_ESTest extends JMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "Name");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jTypeVar0);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 0, jCodeModel0.VOID, "Name");
      assertFalse(jMethod0.hasVarArgs());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<Integer> class0 = Integer.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jReferencedClass0);
      JMethod jMethod0 = new JMethod(4, jAnonymousClass0);
      jMethod0.annotate((AbstractJClass) jAnonymousClass0);
      JAnnotationUse jAnnotationUse0 = jMethod0.annotate((AbstractJClass) jAnonymousClass0);
      assertFalse(jAnnotationUse0.hasAnnotationMembers());
  }
}