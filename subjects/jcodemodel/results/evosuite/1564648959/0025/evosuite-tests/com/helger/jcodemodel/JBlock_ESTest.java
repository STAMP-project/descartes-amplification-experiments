/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:11:57 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JLabel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JBlock_ESTest extends JBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JBlock jBlock0 = new JBlock();
      jBlock0._break((JLabel) null);
      assertEquals(1, jBlock0.pos());
  }
}
