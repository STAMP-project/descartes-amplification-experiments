/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 00:18:36 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCast;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JReferencedClass;
import com.helger.jcodemodel.JTypeVarClass;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JInvocation_ESTest extends JInvocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JInvocation jInvocation0 = new JInvocation((IJExpression) null, "_\"?");
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "2qB8Uun/a[..K}Hu");
      jInvocation0.generate(jFormatter0);
      assertEquals("_\"?()", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 39, jCodeModel0.BOOLEAN, "xi#\"exzG`gP1,aZo");
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.FLOAT, jMethod0);
      assertFalse(jInvocation0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jCodeModel0.NULL);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jTypeVarClass0, ((AbstractJClass) jCodeModel0.NULL).EMPTY_ARRAY);
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, (String) null);
      JMethod jMethod0 = new JMethod(0, jDefinedClass0);
      JInvocation jInvocation0 = new JInvocation(jNarrowedClass0, jMethod0);
      assertFalse(jInvocation0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JLambda jLambda0 = new JLambda();
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jLambda0, "");
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "5>HT1CQ<;ZQ!3qOk2");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "c^F");
      // Undeclared exception!
      try { 
        jInvocation0.generate(jFormatter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Lambda expression is empty!
         //
         verifyException("com.helger.jcodemodel.JLambda", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "D.a275[?4M(");
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "D.a275[?4M(", "D.a275[?4M(");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JInvocation jInvocation0 = new JInvocation(jTypeWildcard0, "Argument");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "D.a275[?4M(");
      // Undeclared exception!
      try { 
        jInvocation0.generate(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // D.a275[?4M(
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JInvocation jInvocation0 = new JInvocation(jCodeModel0.NULL, "O");
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "O");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "O");
      jInvocation0.generate(jFormatter0);
      assertEquals("null.O()", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.LONG);
      JInvocation jInvocation0 = new JInvocation(jArrayClass0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.JAnnotationUse");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.JAnnotationUse");
      jInvocation0.generate(jFormatter0);
      assertEquals("new long[] {}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JCast> class0 = JCast.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jReferencedClass0);
      JInvocation jInvocation0 = new JInvocation(jAnonymousClass0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.JEnumConstant");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.JEnumConstant");
      jInvocation0.generate(jFormatter0);
      assertEquals("new com.helger.jcodemodel.JCast() {com.helger.jcodemodel.JEnumConstant}com.helger.jcodemodel.JEnumConstant", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.BOOLEAN);
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jArrayClass0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jTypeVarClass0);
      JMethod jMethod0 = new JMethod(0, jAnonymousClass0);
      JInvocation jInvocation0 = new JInvocation((IJExpression) null, jMethod0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jInvocation0.generate(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.writer.JFormatter", e);
      }
  }
}
