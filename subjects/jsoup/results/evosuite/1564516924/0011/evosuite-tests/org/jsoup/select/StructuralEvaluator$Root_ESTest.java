/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 20:14:54 GMT 2019
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Element;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class StructuralEvaluator$Root_ESTest extends StructuralEvaluator$Root_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      boolean boolean0 = structuralEvaluator_Root0.matches((Element) null, (Element) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Element element0 = new Element("RS10$Icmr/;GZ");
      boolean boolean0 = structuralEvaluator_Root0.matches((Element) null, element0);
      assertFalse(boolean0);
  }
}