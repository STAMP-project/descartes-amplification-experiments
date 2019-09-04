/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 22:08:12 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JCommentPart;
import com.helger.jcodemodel.JTypeWildcard;
import java.util.ConcurrentModificationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCommentPart_ESTest extends JCommentPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCommentPart jCommentPart0 = new JCommentPart();
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.BOOLEAN);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jArrayClass0, eWildcardBoundMode0);
      jCommentPart0.add((Object) jTypeWildcard0);
      // Undeclared exception!
      try { 
        jCommentPart0.add((Object) jCommentPart0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCommentPart jCommentPart0 = new JCommentPart();
      JCodeModel jCodeModel0 = new JCodeModel();
      // Undeclared exception!
      try { 
        jCommentPart0.add((Object) jCodeModel0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value is of an unsupported type: class com.helger.jcodemodel.JCodeModel
         //
         verifyException("com.helger.jcodemodel.JCommentPart", e);
      }
  }
}
