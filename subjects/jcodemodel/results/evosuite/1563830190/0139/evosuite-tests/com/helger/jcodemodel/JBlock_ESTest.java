/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 00:01:19 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JLambdaParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JBlock_ESTest extends JBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JBlock jBlock0 = new JBlock();
      JCodeModel jCodeModel0 = new JCodeModel();
      JLambdaParam jLambdaParam0 = new JLambdaParam(jCodeModel0.BYTE, "d");
      jBlock0._if((IJExpression) jLambdaParam0);
      assertEquals(1, jBlock0.pos());
  }
}
