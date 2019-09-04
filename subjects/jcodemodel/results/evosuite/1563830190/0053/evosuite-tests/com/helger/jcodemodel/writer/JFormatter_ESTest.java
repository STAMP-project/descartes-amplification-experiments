/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 22:20:54 GMT 2019
 */

package com.helger.jcodemodel.writer;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JFormatter_ESTest extends JFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "3}4wpZ;");
      Stack<JTypeWildcard> stack0 = new Stack<JTypeWildcard>();
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "3}4wpZ;");
      jFormatter0.addDontImportClasses(stack0);
      assertFalse(jFormatter0.isDebugImports());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "3}4wpZ;");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "3}4wpZ;");
      jFormatter0.addDontImportClasses((Iterable<? extends AbstractJClass>) null);
      assertFalse(jFormatter0.isDebugImports());
  }
}