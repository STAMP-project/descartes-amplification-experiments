/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 18:58:04 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.Charset;
import org.apache.commons.codec.net.QCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class QCodec_ESTest extends QCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QCodec qCodec0 = new QCodec((Charset) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QCodec qCodec0 = new QCodec("US-ASCII");
      String string0 = qCodec0.encodeText("US-ASCII", "US-ASCII");
      assertFalse(qCodec0.isEncodeBlanks());
      assertEquals("=?US-ASCII?Q?US-ASCII?=", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      assertFalse(qCodec0.isEncodeBlanks());
  }
}
