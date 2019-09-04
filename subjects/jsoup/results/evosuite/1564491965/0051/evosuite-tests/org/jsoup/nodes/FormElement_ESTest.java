/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 14:01:39 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FormElement_ESTest extends FormElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "hgroup", attributes0);
      assertFalse(formElement0.hasParent());
  }
}
