/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 18:13:42 GMT 2019
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Base32_ESTest extends Base32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Base32 base32_0 = new Base32(0, byteArray0);
      boolean boolean0 = base32_0.isInAlphabet("|BK");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)123;
      Base32 base32_0 = new Base32((byte)59, byteArray0, false, (byte)1);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-12);
      Base32 base32_0 = new Base32(76, byteArray0, false);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte)0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      boolean boolean0 = base32_0.isInAlphabet("Parameter supplied to Base-N decode is not a byte[] or a String");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Base32 base32_0 = new Base32((int) (byte)45);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)45);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Base32 base32_0 = new Base32();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }
}