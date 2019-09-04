/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 16:14:39 GMT 2019
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = " to desired type: ";
      stringArray0[1] = "-";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "-2NLNv";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -2NLNv
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[26];
      stringArray0[0] = "";
      stringArray0[1] = "[&RjAio";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "0_uxE@cO3%^N:k:j";
      stringArray0[5] = "";
      stringArray0[6] = "-1";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -1
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--^qZ$=Sw;";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --^qZ$=Sw;
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = " to desired type: ";
      stringArray0[1] = "-";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-^Z$=Sw;";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -^Z$=Sw;
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      defaultParser0.stopAtNonOption = true;
      String[] stringArray0 = new String[0];
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      defaultParser0.skipParsing = true;
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "c(7!,M";
      stringArray0[1] = "|3";
      stringArray0[2] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[18];
      stringArray0[0] = "--?7S]v]#mm^Sk";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --?7S]v]#mm^Sk
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}