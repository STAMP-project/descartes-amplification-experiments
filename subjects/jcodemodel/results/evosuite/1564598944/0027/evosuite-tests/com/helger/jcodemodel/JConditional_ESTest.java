/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 19:20:44 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAtom;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JConditional;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JFieldRef;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JOpUnaryTight;
import com.helger.jcodemodel.JStringLiteral;
import com.helger.jcodemodel.JTypeVarClass;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JConditional_ESTest extends JConditional_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JStringLiteral jStringLiteral0 = new JStringLiteral("c");
      JConditional jConditional0 = new JConditional(jStringLiteral0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "c");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "c");
      jConditional0.state(jFormatter0);
      assertEquals("if (\"c\") {c}c", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JLambda jLambda0 = new JLambda();
      JConditional jConditional0 = new JConditional(jLambda0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "t[Z");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "t[Z");
      // Undeclared exception!
      try { 
        jConditional0.state(jFormatter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Lambda expression is empty!
         //
         verifyException("com.helger.jcodemodel.JLambda", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "float");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jErrorClass0, jCodeModel0.NULL);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jNarrowedClass0);
      JFieldRef jFieldRef0 = new JFieldRef(jTypeVarClass0, ")iUb\"e8@6]{_4", true);
      JConditional jConditional0 = new JConditional(jFieldRef0);
      StringWriter stringWriter0 = new StringWriter(40);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "else");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "else");
      // Undeclared exception!
      try { 
        jConditional0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // float
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, (String) null);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDefinedClass0, jDefinedClass0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jNarrowedClass0, "");
      JConditional jConditional0 = new JConditional(jEnumConstant0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, ";c?h{Dm_2Z");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jConditional0.state(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JAtom jAtom0 = new JAtom("Test[trekLKion");
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight("Test[trekLKion", jAtom0);
      JConditional jConditional0 = new JConditional(jOpUnaryTight0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Test[trekLKion");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "Test[trekLKion");
      jConditional0.state(jFormatter0);
      assertEquals("if Test[trekLKion Test[trekLKion {Test[trekLKion}Test[trekLKion", stringWriter0.toString());
  }
}
