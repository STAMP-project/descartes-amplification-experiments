/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 00:23:37 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JAtom;
import com.helger.jcodemodel.JBlock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JBlock_ESTest extends JBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JBlock jBlock0 = new JBlock();
      JAtom jAtom0 = new JAtom("");
      jBlock0._if((IJExpression) jAtom0);
      assertEquals(1, jBlock0.pos());
  }
}
