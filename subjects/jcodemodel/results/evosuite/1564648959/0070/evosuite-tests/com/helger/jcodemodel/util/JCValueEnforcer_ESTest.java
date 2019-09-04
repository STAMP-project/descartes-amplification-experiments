/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:59:23 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.util.JCValueEnforcer;
import java.sql.SQLWarning;
import java.util.LinkedHashSet;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCValueEnforcer_ESTest extends JCValueEnforcer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(",n)|68I4IITq").when(supplier0).get();
      // Undeclared exception!
      try { 
        JCValueEnforcer.notNull((Object) null, (Supplier<? extends String>) supplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The value of ',n)|68I4IITq' may not be null!
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      LinkedHashSet<SQLWarning> linkedHashSet0 = new LinkedHashSet<SQLWarning>();
      LinkedHashSet<SQLWarning> linkedHashSet1 = JCValueEnforcer.notNull(linkedHashSet0, (Supplier<? extends String>) supplier0);
      assertTrue(linkedHashSet1.isEmpty());
  }
}
