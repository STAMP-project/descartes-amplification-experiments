/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 19:50:42 GMT 2019
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class StructuralEvaluator$PreviousSibling_ESTest extends StructuralEvaluator$PreviousSibling_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.AttributeWithValueNot evaluator_AttributeWithValueNot0 = new Evaluator.AttributeWithValueNot("hgroup", "hgroup");
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_AttributeWithValueNot0);
      Element element0 = new Element(":prev*%s");
      // Undeclared exception!
      try { 
        structuralEvaluator_PreviousSibling0.matches(element0, (Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.StructuralEvaluator$PreviousSibling", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Element element0 = new Element("d[");
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling((Evaluator) null);
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches(element0, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Element element0 = new Element("d[");
      Element element1 = new Element("d[");
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling((Evaluator) null);
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches(element0, element1);
      assertFalse(boolean0);
  }
}
