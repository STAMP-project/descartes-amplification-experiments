/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 22:09:14 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JVar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JVar_ESTest extends JVar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JMods jMods0 = new JMods((-2362));
      JCodeModel jCodeModel0 = new JCodeModel();
      JVar jVar0 = new JVar(jMods0, jCodeModel0.INT, "Operator1", (IJExpression) null);
      boolean boolean0 = jVar0.isAnnotated();
      assertFalse(boolean0);
  }
}
