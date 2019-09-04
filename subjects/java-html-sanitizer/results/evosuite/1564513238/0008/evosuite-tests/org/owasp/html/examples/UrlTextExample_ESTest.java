/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:10:58 GMT 2019
 */

package org.owasp.html.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.owasp.html.HtmlStreamEventReceiver;
import org.owasp.html.examples.UrlTextExample;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class UrlTextExample_ESTest extends UrlTextExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UrlTextExample.AppendDomainAfterText urlTextExample_AppendDomainAfterText0 = new UrlTextExample.AppendDomainAfterText((HtmlStreamEventReceiver) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UrlTextExample urlTextExample0 = new UrlTextExample();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "4kF~L#{wmPH@";
      stringArray0[1] = "org.owasp.html.HtmlStreamEventReceiverWrapper";
      stringArray0[2] = "";
      stringArray0[3] = "DoYN)G!04";
      stringArray0[4] = "+1kz=|!g}h+@.O(]zB";
      stringArray0[5] = "";
      UrlTextExample.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        UrlTextExample.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        UrlTextExample.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
