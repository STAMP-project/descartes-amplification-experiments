/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 18:31:04 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.net.QCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class QCodec_ESTest extends QCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QCodec qCodec0 = new QCodec("UTF-16BE");
      String string0 = qCodec0.encode("UTF-16BE", "UTF-16BE");
      assertEquals("=?UTF-16BE?Q?=00U=00T=00F=00-=001=006=00B=00E?=", string0);
      assertFalse(qCodec0.isEncodeBlanks());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Charset charset0 = mock(Charset.class, new ViolatedAssumptionAnswer());
      QCodec qCodec0 = new QCodec(charset0);
      // Undeclared exception!
      try { 
        qCodec0.encode("I", "org.apache.commons.codec.DecoderException");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.DecoderException
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode("", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QCodec qCodec0 = new QCodec("UTF-16BE");
      qCodec0.encode((String) null, "=?UTF-16BE?Q?=00U=00T=00F=00-=001=006=00B=00E?=");
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Charset charset0 = mock(Charset.class, new ViolatedAssumptionAnswer());
      QCodec qCodec0 = new QCodec(charset0);
      // Undeclared exception!
      try { 
        qCodec0.encode("')(jc^dv&e4T$", "!7}~'w+u&A<zd]'Cor");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // !7}~'w+u&A<zd]'Cor
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
