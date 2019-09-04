/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 00:04:20 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Document_ESTest extends Document_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertFalse(document_OutputSettings0.outline());
      assertTrue(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Document document0 = new Document("");
      assertFalse(document0.updateMetaCharsetElement());
  }
}
