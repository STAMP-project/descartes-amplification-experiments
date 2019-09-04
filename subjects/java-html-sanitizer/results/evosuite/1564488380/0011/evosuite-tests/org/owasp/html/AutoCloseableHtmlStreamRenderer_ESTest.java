/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 12:19:11 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.CharArrayWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.owasp.html.AutoCloseableHtmlStreamRenderer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class AutoCloseableHtmlStreamRenderer_ESTest extends AutoCloseableHtmlStreamRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = AutoCloseableHtmlStreamRenderer.isAutoCloseable((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(0);
      boolean boolean0 = AutoCloseableHtmlStreamRenderer.isAutoCloseable(charArrayWriter0);
      assertTrue(boolean0);
  }
}