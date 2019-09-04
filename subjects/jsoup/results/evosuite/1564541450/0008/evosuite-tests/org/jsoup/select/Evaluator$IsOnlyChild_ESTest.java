/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 03:01:10 GMT 2019
 */

package org.jsoup.select;

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
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evaluator$IsOnlyChild_ESTest extends Evaluator$IsOnlyChild_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.IsOnlyChild evaluator_IsOnlyChild0 = new Evaluator.IsOnlyChild();
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "", attributes0);
      // Undeclared exception!
      try { 
        evaluator_IsOnlyChild0.matches(element0, (Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Evaluator$IsOnlyChild", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evaluator.IsOnlyChild evaluator_IsOnlyChild0 = new Evaluator.IsOnlyChild();
      Document document0 = new Document("");
      boolean boolean0 = evaluator_IsOnlyChild0.matches(document0, document0);
      assertFalse(boolean0);
  }
}
