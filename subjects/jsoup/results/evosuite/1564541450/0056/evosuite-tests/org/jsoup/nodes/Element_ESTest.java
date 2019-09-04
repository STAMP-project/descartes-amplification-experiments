/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 03:52:32 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Element_ESTest extends Element_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Document document0 = new Document("o#g.json-des.flemF+t");
      document0.parentNode = (Node) document0;
      document0.siblingIndex = 183;
      // Undeclared exception!
      try { 
        document0.previousSibling();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 182, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Element element0 = new Element("o#g.jsoup.nodes.FlemFnt");
      element0.childNodes = null;
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Element element1 = new Element(tag0, "");
      element1.parentNode = (Node) element0;
      element1.siblingIndex = 6;
      // Undeclared exception!
      try { 
        element1.previousSibling();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "", attributes0);
      assertFalse(element0.hasParent());
  }
}
