/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 09:12:46 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.net.BCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class BCodec_ESTest extends BCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("org.apache.commons.codec.binary.BaseNCodec", "org.apache.commons.codec.binary.BaseNCodec");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.binary.BaseNCodec
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode(") than the specified maximum size of ", ") than the specified maximum size of ");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ) than the specified maximum size of 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Charset charset0 = mock(Charset.class, new ViolatedAssumptionAnswer());
      BCodec bCodec0 = new BCodec(charset0);
      // Undeclared exception!
      try { 
        bCodec0.encode(" cannot be encoded using BCodec", (String) null);
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
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BCodec bCodec0 = new BCodec("UTF-16BE");
      String string0 = bCodec0.encode("UTF-16BE", "UTF-16BE");
      assertEquals("=?UTF-16BE?B?AFUAVABGAC0AMQA2AEIARQ==?=", string0);
      assertNotNull(string0);
  }
}
