/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 07:27:52 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PseudoTextElement_ESTest extends PseudoTextElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Attributes attributes0 = new Attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "xDL", attributes0);
      assertNull(pseudoTextElement0.tagName());
  }
}
