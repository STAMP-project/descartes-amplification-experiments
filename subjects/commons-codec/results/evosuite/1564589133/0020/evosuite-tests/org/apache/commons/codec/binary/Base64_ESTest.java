/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 16:27:20 GMT 2019
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Base64_ESTest extends Base64_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)65;
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-932), byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000\u0000\u0000\u0000\u0000A\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)127;
      Base64 base64_0 = new Base64(76, byteArray0, false);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)123;
      Base64 base64_0 = new Base64(64, byteArray0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-123);
      Base64 base64_0 = new Base64(76, byteArray0, true);
      assertTrue(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Base64 base64_0 = new Base64(0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Base64 base64_0 = new Base64();
      assertFalse(base64_0.isUrlSafe());
  }
}
