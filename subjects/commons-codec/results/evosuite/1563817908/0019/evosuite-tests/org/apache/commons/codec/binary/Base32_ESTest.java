/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 18:21:37 GMT 2019
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Base32_ESTest extends Base32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)127;
      Base32 base32_0 = new Base32(83, byteArray0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)123);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)23);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte) (-1));
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(64, byteArray0, false, (byte)89);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base32 base32_0 = new Base32((byte)48, byteArray0, true);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Base32 base32_0 = new Base32((int) (byte)48);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Base32 base32_0 = new Base32();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }
}
