/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 02:13:23 GMT 2019
 */

package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.DigestUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DigestUtils_ESTest extends DigestUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils((MessageDigest) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-1");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("SHA-1", (MessageDigest) null);
      assertEquals("SHA-1 Message Digest from SUN, <initialized>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("", (MessageDigest) null);
      assertNull(messageDigest0);
  }
}
