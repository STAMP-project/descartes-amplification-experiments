/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 17:49:37 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.owasp.html.HtmlElementTables;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HtmlElementTables$TextContentModel_ESTest extends HtmlElementTables$TextContentModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HtmlElementTables.TextContentModel htmlElementTables_TextContentModel0 = new HtmlElementTables.TextContentModel((byte[]) null);
      // Undeclared exception!
      try { 
        htmlElementTables_TextContentModel0.canContainPlainText((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.HtmlElementTables$TextContentModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      HtmlElementTables.TextContentModel htmlElementTables_TextContentModel0 = new HtmlElementTables.TextContentModel(byteArray0);
      // Undeclared exception!
      try { 
        htmlElementTables_TextContentModel0.canContainPlainText((byte)106);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 106
         //
         verifyException("org.owasp.html.HtmlElementTables$TextContentModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte) (-14);
      HtmlElementTables.TextContentModel htmlElementTables_TextContentModel0 = new HtmlElementTables.TextContentModel(byteArray0);
      boolean boolean0 = htmlElementTables_TextContentModel0.canContainPlainText((byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      HtmlElementTables.TextContentModel htmlElementTables_TextContentModel0 = new HtmlElementTables.TextContentModel(byteArray0);
      boolean boolean0 = htmlElementTables_TextContentModel0.canContainPlainText(3);
      assertFalse(boolean0);
  }
}
