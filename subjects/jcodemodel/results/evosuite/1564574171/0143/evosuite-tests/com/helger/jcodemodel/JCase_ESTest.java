/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 14:31:24 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JCase;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JEnumConstantRef;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JTypeWildcard;
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
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "F/YO 4\"l", "F/YO 4\"l");
      JInvocation jInvocation0 = new JInvocation(jErrorClass0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(0, jAnonymousClass0);
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jInvocation0, jMethod0);
      JCase jCase0 = new JCase(jLambdaMethodRef0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "cq!gJvnkDlW");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "&UM^d3'DL_!");
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JLambda jLambda0 = new JLambda();
      JArray jArray0 = new JArray(jCodeModel0.SHORT, jLambda0);
      JCase jCase0 = new JCase(jArray0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "default:");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "default:");
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
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JInvocation jInvocation0 = new JInvocation(jTypeWildcard0);
      JCase jCase0 = new JCase(jInvocation0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "x|^!v>Woo");
      // Undeclared exception!
      try { 
        jCase0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // 
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JEnumConstantRef jEnumConstantRef0 = new JEnumConstantRef(jCodeModel0.NULL, "default:");
      JCase jCase0 = new JCase(jEnumConstantRef0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "default:");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "default:");
      jCase0.state(jFormatter0);
      assertEquals("default:case null.default::default:", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JEnumConstantRef jEnumConstantRef0 = new JEnumConstantRef(jCodeModel0.NULL, "default:");
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "default:");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "default:");
      JCase jCase0 = new JCase(jEnumConstantRef0, true);
      jCase0.state(jFormatter0);
      assertEquals("default:default:default:", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JEnumConstant jEnumConstant0 = new JEnumConstant(jCodeModel0.NULL, "CDY(%81\"}-?EL>");
      JCase jCase0 = new JCase(jEnumConstant0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "CDY(%81\"}-?EL>");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "CDY(%81\"}-?EL>");
      jCase0.state(jFormatter0);
      assertEquals("CDY(%81\"}-?EL>case CDY(%81\"}-?EL>:CDY(%81\"}-?EL>", stringWriter0.toString());
  }
}
