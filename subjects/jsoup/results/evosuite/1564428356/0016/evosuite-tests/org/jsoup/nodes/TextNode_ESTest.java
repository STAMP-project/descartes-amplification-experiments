/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 19:45:02 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextNode textNode0 = new TextNode("", "");
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextNode textNode0 = new TextNode("cite");
      assertEquals("#text", textNode0.nodeName());
  }
}