/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 04:28:19 GMT 2019
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Option option0 = new Option("", true, "Cannot add value, list full.");
      assertTrue(option0.hasArg());
      assertFalse(option0.hasLongOpt());
      assertEquals("Cannot add value, list full.", option0.getDescription());
      assertEquals("", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }
}
