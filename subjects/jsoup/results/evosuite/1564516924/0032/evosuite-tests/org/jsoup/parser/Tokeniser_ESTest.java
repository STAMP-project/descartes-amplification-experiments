/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 20:38:17 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Tokeniser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Tokeniser_ESTest extends Tokeniser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Q8r<|7M8Y: N{");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 43);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 43);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.doctypePending = null;
      // Undeclared exception!
      try { 
        tokeniser0.createDoctypePending();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tokeniser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Q8r<|7M8Y: N{");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 43);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 43);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.createDoctypePending();
  }
}
