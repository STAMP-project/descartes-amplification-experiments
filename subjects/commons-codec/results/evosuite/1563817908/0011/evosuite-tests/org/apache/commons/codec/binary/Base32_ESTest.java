/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 18:10:24 GMT 2019
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
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)123;
      Base32 base32_0 = new Base32(56, byteArray0, false, (byte)20);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte) (-80));
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(276, byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base32 base32_0 = new Base32(145);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)1);
      boolean boolean0 = base32_0.isInAlphabet((byte)108);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      boolean boolean0 = base32_0.isInAlphabet((byte)122);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Base32 base32_0 = new Base32();
      boolean boolean0 = base32_0.isInAlphabet((byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)98;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(1797, byteArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)123;
      Base32 base32_0 = new Base32(1797, byteArray0, true);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base32 base32_0 = new Base32();
      boolean boolean0 = base32_0.isInAlphabet((byte) (-125));
      assertFalse(boolean0);
  }
}
