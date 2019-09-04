/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 02:53:12 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Element;
import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HtmlTreeBuilder_ESTest extends HtmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ArrayList<Element> arrayList0 = new ArrayList<Element>(100);
      htmlTreeBuilder0.stack = arrayList0;
      boolean boolean0 = htmlTreeBuilder0.inScope((String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.inScope((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }
}
