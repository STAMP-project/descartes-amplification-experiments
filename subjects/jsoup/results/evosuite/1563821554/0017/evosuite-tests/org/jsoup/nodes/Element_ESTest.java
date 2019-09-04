/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 19:15:15 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Element_ESTest extends Element_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "link", attributes0);
      assertEquals("link", element0.baseUri());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Element element0 = new Element(tag0, "29\"zMRnA;[}");
      assertEquals("29\"zMRnA;[}", element0.baseUri());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Element element0 = new Element("6,t");
      assertFalse(element0.isBlock());
  }
}
