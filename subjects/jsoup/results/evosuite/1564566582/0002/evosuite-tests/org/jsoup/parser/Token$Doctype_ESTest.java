/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 09:53:13 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.Token;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Token$Doctype_ESTest extends Token$Doctype_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.reset();
      assertFalse(token_Doctype0.isForceQuirks());
  }
}
