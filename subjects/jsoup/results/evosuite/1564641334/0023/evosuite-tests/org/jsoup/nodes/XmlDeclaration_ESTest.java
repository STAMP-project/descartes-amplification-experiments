/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 07:01:22 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class XmlDeclaration_ESTest extends XmlDeclaration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("?%8J+taF@'", true);
      assertEquals(0, xmlDeclaration0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("", "", true);
      assertEquals(0, xmlDeclaration0.siblingIndex());
  }
}