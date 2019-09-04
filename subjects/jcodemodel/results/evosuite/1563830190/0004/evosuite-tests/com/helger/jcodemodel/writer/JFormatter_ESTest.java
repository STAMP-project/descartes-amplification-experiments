/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 21:22:56 GMT 2019
 */

package com.helger.jcodemodel.writer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDocComment;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JFormatter_ESTest extends JFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Q+|2c");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "PrintWriter");
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("tL<%/wj$SJi>Zn:|8-").when(jDefinedClass0).toString();
      doReturn("Z)d@}iPbJgkm`aN").when(jDefinedClass0).name();
      doReturn(iJClassContainer0, (IJClassContainer) null).when(jDefinedClass0).parentContainer();
      doReturn(false).when(jDefinedClass0).hasHeaderComment();
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.writer.JFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(jDefinedClass0).isPackage();
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JDefinedClass jDefinedClass1 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass1).owner();
      doReturn("").when(jDefinedClass1).toString();
      doReturn("").when(jDefinedClass1).name();
      doReturn(jDefinedClass0).when(jDefinedClass1).parentContainer();
      doReturn(true).when(jDefinedClass1).hasHeaderComment();
      doReturn((JDocComment) null).when(jDefinedClass1).headerComment();
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.writer.JFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jDefinedClass0).isPackage();
      JDefinedClass jDefinedClass1 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass1).owner();
      doReturn(".m").when(jDefinedClass1).toString();
      doReturn(".m").when(jDefinedClass1).name();
      doReturn(jDefinedClass0).when(jDefinedClass1).parentContainer();
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, ".m");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, ".m");
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // this method is only for a pacakge-level class
         //
      }
  }
}