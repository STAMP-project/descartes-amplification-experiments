/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 06:12:34 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.util.JCValueEnforcer;
import java.nio.CharBuffer;
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
      doReturn((Object) null).when(supplier0).get();
      // Undeclared exception!
      try { 
        JCValueEnforcer.notNull((String) null, (Supplier<? extends String>) supplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The value of 'null' may not be null!
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharBuffer charBuffer0 = mock(CharBuffer.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(charBuffer0).toString();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      CharBuffer charBuffer1 = JCValueEnforcer.notNull(charBuffer0, (Supplier<? extends String>) supplier0);
      assertEquals(0, charBuffer1.position());
  }
}
