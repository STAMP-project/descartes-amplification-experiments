/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:58:04 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.eaxy.Content;
import org.eaxy.Element;
import org.eaxy.ElementSet;
import org.eaxy.QualifiedName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ElementSet_ESTest extends ElementSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Content> arrayList0 = new ArrayList<Content>();
      QualifiedName qualifiedName0 = new QualifiedName("xgih", "xgih", "xgih");
      Element element0 = new Element(qualifiedName0, arrayList0);
      ElementSet elementSet0 = new ElementSet(element0);
      Element element1 = elementSet0.singleOrDefault();
      assertNotNull(element1);
      assertTrue(elementSet0.isPresent());
  }
}
