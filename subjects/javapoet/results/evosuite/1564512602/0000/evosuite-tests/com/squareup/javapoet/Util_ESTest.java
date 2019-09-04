/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 18:51:09 GMT 2019
 */

package com.squareup.javapoet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.squareup.javapoet.Util;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.lang.model.element.Modifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Modifier[] modifierArray0 = new Modifier[6];
      // Undeclared exception!
      try { 
        Util.requireExactlyOneOf((Set<Modifier>) null, modifierArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Modifier[] modifierArray0 = new Modifier[1];
      LinkedHashSet<Modifier> linkedHashSet0 = new LinkedHashSet<Modifier>();
      // Undeclared exception!
      try { 
        Util.requireExactlyOneOf(linkedHashSet0, modifierArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // modifiers [] must contain one of [null]
         //
         verifyException("com.squareup.javapoet.Util", e);
      }
  }
}
