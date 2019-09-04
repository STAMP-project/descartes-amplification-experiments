/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 16:12:43 GMT 2019
 */

package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.DigestUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DigestUtils_ESTest extends DigestUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils((MessageDigest) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("MD2");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("org.apache.commons.codec.DecoderException", (MessageDigest) null);
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MessageDigest messageDigest0 = mock(MessageDigest.class, new ViolatedAssumptionAnswer());
      doReturn("").when(messageDigest0).toString();
      MessageDigest messageDigest1 = DigestUtils.getDigest("", messageDigest0);
      assertNull(messageDigest1.getAlgorithm());
  }
}
