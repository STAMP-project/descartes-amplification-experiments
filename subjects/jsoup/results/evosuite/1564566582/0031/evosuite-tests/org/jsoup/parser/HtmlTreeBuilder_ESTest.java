/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 10:26:58 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HtmlTreeBuilder_ESTest extends HtmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = new Document("");
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.insertOnStackAfter((Element) null, document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ArrayList<Element> arrayList0 = new ArrayList<Element>();
      htmlTreeBuilder0.stack = arrayList0;
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.insertOnStackAfter((Element) null, (Element) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
