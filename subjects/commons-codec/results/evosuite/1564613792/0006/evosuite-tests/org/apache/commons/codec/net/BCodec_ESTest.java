/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 23:04:52 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.net.BCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class BCodec_ESTest extends BCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BCodec bCodec0 = new BCodec("UTF-16LE");
      assertEquals("UTF-16LE", bCodec0.getDefaultCharset());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode("UTF-16BE", "UTF-16BE");
      assertEquals("=?UTF-16BE?B?AFUAVABGAC0AMQA2AEIARQ==?=", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BCodec bCodec0 = new BCodec((Charset) null);
      // Undeclared exception!
      try { 
        bCodec0.encode("", "org.apache.commons.codec.net.BCodec");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.net.BCodec
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("Objects of type ", "Objects of type ");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // Objects of type 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode((String) null, "=?UTF-16BE?B?AFUAVABGAC0AMQA2AEIARQ==?=");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("O-MG.", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
