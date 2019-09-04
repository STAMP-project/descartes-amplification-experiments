/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:45:14 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JCommentPart;
import com.helger.jcodemodel.JTypeVarClass;
import java.util.ConcurrentModificationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCommentPart_ESTest extends JCommentPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCommentPart jCommentPart0 = new JCommentPart();
      JCommentPart jCommentPart1 = jCommentPart0.append((Object) null);
      assertSame(jCommentPart0, jCommentPart1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCommentPart jCommentPart0 = new JCommentPart();
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jCodeModel0.NULL);
      JCommentPart jCommentPart1 = jCommentPart0.append(jTypeVarClass0);
      // Undeclared exception!
      try { 
        jCommentPart0.append(jCommentPart1);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCommentPart jCommentPart0 = new JCommentPart();
      JCodeModel jCodeModel0 = new JCodeModel();
      // Undeclared exception!
      try { 
        jCommentPart0.append(jCodeModel0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value is of an unsupported type: class com.helger.jcodemodel.JCodeModel
         //
         verifyException("com.helger.jcodemodel.JCommentPart", e);
      }
  }
}
