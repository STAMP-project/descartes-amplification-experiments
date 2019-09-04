/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:16:54 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JReferencedClass;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JTypeWildcard_ESTest extends JTypeWildcard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "J");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jErrorClass0);
      LinkedList<JReferencedClass> linkedList0 = new LinkedList<JReferencedClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jAnonymousClass0, linkedList0);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jNarrowedClass0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter(571);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "J");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "J");
      // Undeclared exception!
      try { 
        jTypeWildcard0.generate(jFormatter0);
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
      IJClassContainer<JDirectClass> iJClassContainer0 = (IJClassContainer<JDirectClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isClass();
      EClassType eClassType0 = EClassType.CLASS;
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, iJClassContainer0, eClassType0, "E<z=<^_n'v7Oue0");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jDirectClass0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jTypeWildcard0.generate(jFormatter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.helger.jcodemodel.IJClassContainer$MockitoMock$1174683980 cannot be cast to com.helger.jcodemodel.AbstractJClass
         //
         verifyException("com.helger.jcodemodel.AbstractJClassContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "com.helger.jcodemodel.JDirectClass");
      LinkedList<JAnonymousClass> linkedList0 = new LinkedList<JAnonymousClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jErrorClass0, linkedList0);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jNarrowedClass0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jTypeWildcard0.generate(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // com.helger.jcodemodel.JDirectClass
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jCodeModel0.NULL, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "BoundMode");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      jTypeWildcard0.generate(jFormatter0);
      assertEquals("?", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jCodeModel0.NULL, eWildcardBoundMode0);
      JTypeWildcard jTypeWildcard1 = new JTypeWildcard(jTypeWildcard0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "hP>IE");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "hP>IE");
      jTypeWildcard1.generate(jFormatter0);
      assertEquals("? extends ?", stringWriter0.toString());
  }
}
