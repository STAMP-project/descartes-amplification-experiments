/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 12 13:42:14 GMT 2019
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.Soundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Soundex_ESTest extends Soundex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Soundex soundex0 = new Soundex("01230120022455012623010202");
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Soundex soundex0 = new Soundex("01230120022455012623010202", false);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Soundex soundex0 = new Soundex("x-*~jgX");
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Soundex soundex0 = null;
      try {
        soundex0 = new Soundex((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      char[] charArray0 = new char[32];
      Soundex soundex0 = new Soundex(charArray0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[31];
      charArray0[5] = '-';
      Soundex soundex0 = new Soundex(charArray0);
      assertEquals(4, soundex0.getMaxLength());
  }
}