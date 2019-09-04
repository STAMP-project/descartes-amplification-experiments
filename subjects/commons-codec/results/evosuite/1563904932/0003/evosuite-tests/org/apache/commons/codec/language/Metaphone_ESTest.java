/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 18:09:11 GMT 2019
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.Metaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Metaphone_ESTest extends Metaphone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("", "@b6~~m?Q0");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("zI", "/]wAvs,");
      assertFalse(boolean0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("r)>3[73", "cHe^<{KG? d");
      assertFalse(boolean0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("ksDCyKa:vbh^*mW", "a'LMOc");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.language.Metaphone", "anj4f#WhokzEd\"");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("ae{4i~6Z`", "/'a");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("", "gq2(");
      assertFalse(boolean0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("GN", "E]lDWx");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("W=!nR", "ghc/M':T!:JB,ap");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.isMetaphoneEqual("", "");
      assertEquals(4, metaphone0.getMaxCodeLen());
  }
}
