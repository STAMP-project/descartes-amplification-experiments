/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 04:30:45 GMT 2019
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
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-5gwX}.L_s<( ";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -5gwX}.L_s<( 
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-|v";
      DefaultParser defaultParser0 = new DefaultParser();
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -|v
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "org.apache.commons.cli.DefaultParser";
      stringArray0[1] = "):~%eGu\"UuXX";
      stringArray0[2] = "aI.&6^";
      stringArray0[3] = "' contains an illegal character : '";
      stringArray0[4] = "--A9w)P{sk2ufk=sjy?X";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --A9w)P{sk2ufk=sjy?X
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = " [ARG]";
      stringArray0[1] = "-";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = " [ARG]";
      stringArray0[1] = "--org.apache.commons.cli.Util";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --org.apache.commons.cli.Util
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[2];
      defaultParser0.stopAtNonOption = true;
      // Undeclared exception!
      try { 
        defaultParser0.parse((Options) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      defaultParser0.skipParsing = true;
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "$";
      stringArray0[1] = "> k:E3>?CcEx3U";
      stringArray0[2] = "$";
      stringArray0[3] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-&";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -&
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}
