/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 11:13:45 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JAtomLong;
import com.helger.jcodemodel.JCase;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
import com.helger.jcodemodel.JOpBinary;
import com.helger.jcodemodel.JOpUnary;
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
      JOpBinary jOpBinary0 = new JOpBinary(jLambda0, "qMJOu+<DQRR4a=uYr", jLambda0);
      JCase jCase0 = new JCase(jOpBinary0, false);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "qMJOu+<DQRR4a=uYr");
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
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "case ", "case ");
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jErrorClass0);
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jTypeVarClass0, "default:");
      JCase jCase0 = new JCase(jLambdaMethodRef0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Offset (");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jCase0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // case 
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "new");
      JLambda jLambda0 = new JLambda();
      JArray jArray0 = new JArray(jDefinedClass0, jLambda0);
      JOpUnary jOpUnary0 = new JOpUnary("new", jArray0);
      JCase jCase0 = new JCase(jOpUnary0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "new");
      // Undeclared exception!
      try { 
        jCase0.state(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JAtomLong jAtomLong0 = new JAtomLong((-874L));
      StringWriter stringWriter0 = new StringWriter();
      JCase jCase0 = new JCase(jAtomLong0, true);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "L");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "L");
      jCase0.state(jFormatter0);
      assertEquals("Ldefault:L", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.FLOAT);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jArrayClass0, "com.helger.jcodemodel.JCommentPart");
      JCase jCase0 = new JCase(jEnumConstant0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.JCommentPart");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.JCommentPart");
      jCase0.state(jFormatter0);
      assertEquals("com.helger.jcodemodel.JCommentPartcase com.helger.jcodemodel.JCommentPart:com.helger.jcodemodel.JCommentPart", stringWriter0.toString());
  }
}