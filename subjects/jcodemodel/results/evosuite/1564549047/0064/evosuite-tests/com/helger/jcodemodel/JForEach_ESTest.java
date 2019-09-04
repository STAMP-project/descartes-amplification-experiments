/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 06:06:33 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstantRef;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JForEach;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JForEach_ESTest extends JForEach_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.CHAR);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jArrayClass0, jArrayClass0.EMPTY_ARRAY);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      JMethod jMethod0 = new JMethod(52, jAnonymousClass0);
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jMethod0);
      JForEach jForEach0 = new JForEach(jNarrowedClass0, "nw", jLambdaMethodRef0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "nw");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "nw");
      // Undeclared exception!
      try { 
        jForEach0.state(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "", "VarType");
      JLambda jLambda0 = new JLambda();
      JForEach jForEach0 = new JForEach(jErrorClass0, "VarType", jLambda0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "VarType");
      // Undeclared exception!
      try { 
        jForEach0.state(jFormatter0);
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
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "D", "D");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JEnumConstantRef jEnumConstantRef0 = new JEnumConstantRef(jErrorClass0, "com.helger.jcodemodel.JForEach");
      JForEach jForEach0 = new JForEach(jTypeWildcard0, "guK6bo", jEnumConstantRef0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.JForEach");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "]");
      // Undeclared exception!
      try { 
        jForEach0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // D
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      StringWriter stringWriter0 = new StringWriter();
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jCodeModel0.BYTE);
      JForEach jForEach0 = new JForEach(jCodeModel0.INT, "UL", jLambdaMethodRef0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "UL");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "UL");
      jForEach0.state(jFormatter0);
      assertEquals("for (int UL: byte::new);UL", stringWriter0.toString());
  }
}
