/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 12:01:05 GMT 2019
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
import com.helger.jcodemodel.JPackage;
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
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage0).isUnnamed();
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JPackage jPackage1 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage1).isUnnamed();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("", "").when(jDefinedClass0).toString();
      doReturn((String) null).when(jDefinedClass0).fullName();
      doReturn("").when(jDefinedClass0).name();
      doReturn(iJClassContainer0, jPackage0).when(jDefinedClass0).parentContainer();
      doReturn(jPackage1, (JPackage) null).when(jDefinedClass0)._package();
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
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(jPackage0).isUnnamed();
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JPackage jPackage1 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(jPackage1).isUnnamed();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("", "").when(jDefinedClass0).toString();
      doReturn("").when(jDefinedClass0).name();
      doReturn(iJClassContainer0, jPackage0).when(jDefinedClass0).parentContainer();
      doReturn(jPackage1).when(jDefinedClass0)._package();
      doReturn(false).when(jDefinedClass0).hasHeaderComment();
      jFormatter0.writeClassFull(jDefinedClass0);
      assertFalse(jFormatter0.isDebugImports());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage0).isUnnamed();
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JPackage jPackage1 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage1).isUnnamed();
      JPackage jPackage2 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("", "").when(jDefinedClass0).toString();
      doReturn("").when(jDefinedClass0).fullName();
      doReturn("").when(jDefinedClass0).name();
      doReturn(iJClassContainer0, jPackage0).when(jDefinedClass0).parentContainer();
      doReturn(jPackage1, jPackage2).when(jDefinedClass0)._package();
      doReturn(false).when(jDefinedClass0).hasHeaderComment();
      jFormatter0.writeClassFull(jDefinedClass0);
      assertEquals("import;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "COLLECTING");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "COLLECTING");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage0).isUnnamed();
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JPackage jPackage1 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage1).isUnnamed();
      JPackage jPackage2 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("COLLECTING", "COLLECTING").when(jDefinedClass0).toString();
      doReturn(">`dVibv3a6mEN.L?").when(jDefinedClass0).fullName();
      doReturn("").when(jDefinedClass0).name();
      doReturn(iJClassContainer0, jPackage0).when(jDefinedClass0).parentContainer();
      doReturn(jPackage1, jPackage2).when(jDefinedClass0)._package();
      doReturn(false).when(jDefinedClass0).hasHeaderComment();
      jFormatter0.writeClassFull(jDefinedClass0);
      assertEquals("COLLECTINGimport >`dVibv3a6mEN.L?;COLLECTINGCOLLECTING", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      JCodeModel jCodeModel0 = mock(JCodeModel.class, new ViolatedAssumptionAnswer());
      doReturn(jPackage0).when(jCodeModel0)._package(anyString());
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("j18L~1h5(u*2").when(jDefinedClass0).toString();
      doReturn("").when(jDefinedClass0).name();
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
  public void test5()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage0).isUnnamed();
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JPackage jPackage1 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage1).isUnnamed();
      JPackage jPackage2 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("", "com.helger.jcodemodel.writer.JFormatter$1").when(jDefinedClass0).toString();
      doReturn("com.helger.jcodemodel.writer.JFormatter$1").when(jDefinedClass0).fullName();
      doReturn("").when(jDefinedClass0).name();
      doReturn(iJClassContainer0, jPackage0).when(jDefinedClass0).parentContainer();
      doReturn(jPackage1, jPackage2).when(jDefinedClass0)._package();
      doReturn(false).when(jDefinedClass0).hasHeaderComment();
      jFormatter0.writeClassFull(jDefinedClass0);
      assertEquals("import com.helger.jcodemodel.writer.JFormatter$1;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.JErrorClass");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.JErrorClass");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      JCodeModel jCodeModel0 = mock(JCodeModel.class, new ViolatedAssumptionAnswer());
      doReturn(jPackage0).when(jCodeModel0)._package(anyString());
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("j18L~1h5(u*2").when(jDefinedClass0).toString();
      doReturn("").when(jDefinedClass0).name();
      doReturn(iJClassContainer0).when(jDefinedClass0).parentContainer();
      doReturn(true).when(jDefinedClass0).hasHeaderComment();
      doReturn((JDocComment) null).when(jDefinedClass0).headerComment();
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
  public void test7()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jPackage0).isUnnamed();
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("", (String) null).when(jDefinedClass0).toString();
      doReturn("").when(jDefinedClass0).name();
      doReturn(iJClassContainer0, jPackage0).when(jDefinedClass0).parentContainer();
      doReturn((JPackage) null).when(jDefinedClass0)._package();
      doReturn(false).when(jDefinedClass0).hasHeaderComment();
      jFormatter0.writeClassFull(jDefinedClass0);
      assertFalse(jFormatter0.isDebugImports());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      JCodeModel jCodeModel0 = mock(JCodeModel.class, new ViolatedAssumptionAnswer());
      doReturn(jPackage0).when(jCodeModel0)._package(anyString());
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iJClassContainer0).isPackage();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("j18L~1h5(u*2").when(jDefinedClass0).toString();
      doReturn((String) null).when(jDefinedClass0).name();
      doReturn(iJClassContainer0).when(jDefinedClass0).parentContainer();
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // this method is only for a pacakge-level class
         //
      }
  }
}