/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 22:14:06 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDocComment;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDocComment_ESTest extends JDocComment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDocComment jDocComment0 = new JDocComment(jCodeModel0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "author");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "version");
      jDocComment0.generate(jFormatter0);
      assertFalse(jDocComment0.isSingleLineMode());
      assertEquals("", stringWriter0.toString());
  }
}
