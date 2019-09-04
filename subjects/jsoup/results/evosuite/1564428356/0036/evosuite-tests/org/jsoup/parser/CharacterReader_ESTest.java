/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 20:09:26 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class CharacterReader_ESTest extends CharacterReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("9 y|h/-'y%^QB");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 965);
      boolean boolean0 = characterReader0.matchesDigit();
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0$+GQrx\f0{@6]'");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 40);
      boolean boolean0 = characterReader0.matchesDigit();
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Array must not contain any n7ll objects");
      boolean boolean0 = characterReader0.matchesDigit();
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      boolean boolean0 = characterReader0.matchesDigit();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(b@HYKBUc");
      boolean boolean0 = characterReader0.matchesDigit();
      assertEquals(0, characterReader0.pos());
      assertFalse(boolean0);
  }
}