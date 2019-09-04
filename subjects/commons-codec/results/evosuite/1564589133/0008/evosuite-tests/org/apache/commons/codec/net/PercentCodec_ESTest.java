/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 16:16:18 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.net.PercentCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PercentCodec_ESTest extends PercentCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)56;
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, false);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, false);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec();
      Object object0 = percentCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec();
      Object object0 = new Object();
      try { 
        percentCodec0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be Percent encoded
         //
         verifyException("org.apache.commons.codec.net.PercentCodec", e);
      }
  }
}