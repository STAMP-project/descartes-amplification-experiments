/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 05:33:43 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JMethod;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMethod_ESTest extends JMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "ENUM");
      JMethod jMethod0 = new JMethod(0, jDefinedClass0);
      assertFalse(jMethod0.hasVarArgs());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 44, jCodeModel0.NULL, "A<Bc2JE!1.>TLZ56hj");
      JAnnotationUse jAnnotationUse0 = jMethod0.annotate((AbstractJClass) jCodeModel0.NULL);
      JAnnotationUse jAnnotationUse1 = jMethod0.annotate((AbstractJClass) jAnonymousClass0);
      assertNotSame(jAnnotationUse1, jAnnotationUse0);
  }
}
