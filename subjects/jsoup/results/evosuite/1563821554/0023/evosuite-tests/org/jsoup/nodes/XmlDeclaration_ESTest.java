/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 19:23:10 GMT 2019
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
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("TS2>j$-O x 3", false);
      assertEquals(0, xmlDeclaration0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("ZvxY@ue24vA7q6", "ZvxY@ue24vA7q6", false);
      assertFalse(xmlDeclaration0.hasParent());
  }
}
