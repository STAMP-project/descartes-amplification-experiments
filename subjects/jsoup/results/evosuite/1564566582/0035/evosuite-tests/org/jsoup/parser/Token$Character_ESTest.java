/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 10:30:39 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.Token;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Token$Character_ESTest extends Token$Character_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Token.Character token_Character0 = new Token.Character();
      Token token0 = token_Character0.reset();
      assertSame(token0, token_Character0);
  }
}
