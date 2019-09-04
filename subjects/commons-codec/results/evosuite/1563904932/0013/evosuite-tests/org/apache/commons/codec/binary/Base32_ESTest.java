/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 18:27:37 GMT 2019
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
      byte[] byteArray0 = new byte[4];
      Base32 base32_0 = new Base32((-3502), byteArray0);
      boolean boolean0 = base32_0.isInAlphabet("h}z^@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)22);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte) (-67));
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      Base32 base32_0 = new Base32(8, byteArray0, false);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Base32 base32_0 = new Base32(64);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)4);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Base32 base32_0 = new Base32();
      boolean boolean0 = base32_0.isInAlphabet("{VXTV~:{");
      assertFalse(boolean0);
  }
}