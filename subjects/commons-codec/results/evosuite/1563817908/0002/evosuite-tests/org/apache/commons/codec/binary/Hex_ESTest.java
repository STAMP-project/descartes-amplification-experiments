/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:56:05 GMT 2019
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Hex_ESTest extends Hex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hex hex0 = new Hex("ISO-8859-1");
      assertEquals("ISO-8859-1", hex0.getCharsetName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.encode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      Hex hex0 = new Hex(charset0);
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        hex0.encode(byteBuffer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }
}
