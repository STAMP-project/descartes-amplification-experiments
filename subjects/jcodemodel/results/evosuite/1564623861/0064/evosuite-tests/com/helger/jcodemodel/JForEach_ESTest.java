/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:53:39 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JAtomFloat;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JForEach;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeVarClass;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JForEach_ESTest extends JForEach_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.FLOAT);
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "Attribute");
      JMethod jMethod0 = new JMethod(jDefinedClass0, 59, jCodeModel0.FLOAT, "Attribute");
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jMethod0);
      JForEach jForEach0 = new JForEach(jArrayClass0, "Attribute", jLambdaMethodRef0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "for (");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "Attribute");
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
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.DOUBLE);
      LinkedList<JTypeVarClass> linkedList0 = new LinkedList<JTypeVarClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jArrayClass0, linkedList0);
      JLambda jLambda0 = new JLambda();
      JForEach jForEach0 = new JForEach(jNarrowedClass0, "Type", jLambda0);
      StringWriter stringWriter0 = new StringWriter(93);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
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
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "= \"", "Collection");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JInvocation jInvocation0 = new JInvocation(jCodeModel0.VOID);
      JForEach jForEach0 = new JForEach(jTypeWildcard0, "Collection", jInvocation0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Collection");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "= \"");
      // Undeclared exception!
      try { 
        jForEach0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // = \"
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAtomFloat jAtomFloat0 = new JAtomFloat((-302.5192F));
      StringWriter stringWriter0 = new StringWriter();
      JForEach jForEach0 = new JForEach(jCodeModel0.CHAR, "F", jAtomFloat0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "java.lang.Float.NEGATIVE_INFINITY");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "java.lang.Float.NEGATIVE_INFINITY");
      jForEach0.state(jFormatter0);
      assertEquals("for (char F: -302.5192F);java.lang.Float.NEGATIVE_INFINITY", stringWriter0.toString());
  }
}
