/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 12:37:57 GMT 2019
 */

package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HmacUtils_ESTest extends HmacUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils("HmacSHA224", "HmacSHA224");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[3];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "9");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      HmacUtils hmacUtils0 = new HmacUtils("HmacSHA512", byteArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.isAvailable((HmacAlgorithms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      boolean boolean0 = HmacUtils.isAvailable(hmacAlgorithms0);
      assertTrue(boolean0);
  }
}