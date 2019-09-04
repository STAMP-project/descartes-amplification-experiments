/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:59:19 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
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
      QualifiedName qualifiedName0 = new QualifiedName("tj", "tj", "tj");
      Element element0 = new Element(qualifiedName0, (-3002));
      ElementSet elementSet0 = new ElementSet(element0);
      Element element1 = elementSet0.single();
      assertEquals("tj", element1.tagName());
  }
}
