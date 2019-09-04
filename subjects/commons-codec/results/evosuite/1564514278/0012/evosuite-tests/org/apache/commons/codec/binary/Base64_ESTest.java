/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:32:53 GMT 2019
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.binary.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Base64_ESTest extends Base64_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Base64 base64_0 = new Base64();
      base64_0.isInAlphabet("Parameter supplied to Base-N encode is not a byte[]");
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)125;
      Base64 base64_0 = new Base64(93, byteArray0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-25);
      Base64 base64_0 = new Base64(0, byteArray0, false);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Base64 base64_0 = new Base64(83);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Base64 base64_0 = new Base64();
      base64_0.isInAlphabet("{eynJ~lp_gD");
      assertFalse(base64_0.isUrlSafe());
  }
}
