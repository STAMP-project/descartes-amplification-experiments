/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 07:32:24 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JCommentPart;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCommentPart_ESTest extends JCommentPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCommentPart jCommentPart0 = new JCommentPart();
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "^h");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "^h");
      jCommentPart0.format(jFormatter0, "^h");
      assertEquals("", stringWriter0.toString());
  }
}
