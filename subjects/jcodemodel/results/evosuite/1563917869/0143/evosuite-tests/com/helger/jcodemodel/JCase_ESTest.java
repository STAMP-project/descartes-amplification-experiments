/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 00:28:44 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JCase;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
import com.helger.jcodemodel.JTypeVarClass;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCase_ESTest extends JCase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JLambda jLambda0 = new JLambda();
      JCase jCase0 = new JCase(jLambda0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "W$P<M bN33Nc<zhpNb");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "W$P<M bN33Nc<zhpNb");
      // Undeclared exception!
      try { 
        jCase0.state(jFormatter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Lambda expression is empty!
         //
         verifyException("com.helger.jcodemodel.JLambda", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "com.helger.jcodemodel.JCase", "com.helger.jcodemodel.JCase");
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jErrorClass0);
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jTypeVarClass0);
      JCase jCase0 = new JCase(jLambdaMethodRef0, false);
      StringWriter stringWriter0 = new StringWriter(887);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.JCase");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.JCase");
      // Undeclared exception!
      try { 
        jCase0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // com.helger.jcodemodel.JCase
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JEnumConstant jEnumConstant0 = new JEnumConstant(jCodeModel0.NULL, "cohelgr.jcoemodelJOKeInay");
      JCase jCase0 = new JCase(jEnumConstant0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "cohelgr.jcoemodelJOKeInay");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "cohelgr.jcoemodelJOKeInay");
      jCase0.state(jFormatter0);
      assertEquals("cohelgr.jcoemodelJOKeInaycase cohelgr.jcoemodelJOKeInay:cohelgr.jcoemodelJOKeInay", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCase jCase0 = new JCase((IJExpression) null, true);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.writer.JFormatter$ImportedClasses");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.writer.JFormatter$ImportedClasses");
      jCase0.state(jFormatter0);
      assertEquals("com.helger.jcodemodel.writer.JFormatter$ImportedClassesdefault:com.helger.jcodemodel.writer.JFormatter$ImportedClasses", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCase jCase0 = new JCase((IJExpression) null, false);
      StringWriter stringWriter0 = new StringWriter(10);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jCase0.state(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.writer.JFormatter", e);
      }
  }
}
