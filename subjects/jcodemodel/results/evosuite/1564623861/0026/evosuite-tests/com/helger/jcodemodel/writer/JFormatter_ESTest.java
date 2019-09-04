/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:15:46 GMT 2019
 */

package com.helger.jcodemodel.writer;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JFormatter_ESTest extends JFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "!");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "!");
      boolean boolean0 = jFormatter0.isPrinting();
      assertTrue(boolean0);
      assertFalse(jFormatter0.isDebugImports());
  }
}
