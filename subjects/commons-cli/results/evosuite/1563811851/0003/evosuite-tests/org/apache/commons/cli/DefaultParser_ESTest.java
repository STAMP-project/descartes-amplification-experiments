/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 16:16:03 GMT 2019
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
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
      Options options0 = new Options();
      Properties properties0 = new Properties();
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-Xhe)(\"QY";
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -Xhe)(\"QY
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-true";
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -true
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-v";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -v
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "e.$z-";
      stringArray0[1] = "1";
      stringArray0[2] = "#y(sRWv]f 6k*.w";
      stringArray0[3] = "^fL?BRD AvW &O;";
      stringArray0[4] = "Illegal option name '";
      stringArray0[5] = "K>";
      stringArray0[6] = "-";
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "org.apache.commons.cli.DefaultParser";
      stringArray0[1] = "U+c qz00h<Ec*M~@W";
      stringArray0[2] = "--BEO2;RV5[.pGw";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --BEO2;RV5[.pGw
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      defaultParser0.stopAtNonOption = true;
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "6g{2?&";
      stringArray0[2] = " to desired type: ";
      stringArray0[3] = "O-QD";
      stringArray0[4] = ", ";
      stringArray0[5] = "s~qM-BqXXi";
      stringArray0[6] = "--";
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0);
      CommandLine commandLine1 = defaultParser0.parse(options0, stringArray0, properties0);
      assertFalse(commandLine1.equals((Object)commandLine0));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "BEO2;RV5[.pGw";
      stringArray0[1] = "--8?r Iy4le3j=./_N";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --8?r Iy4le3j=./_N
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "cpE";
      stringArray0[1] = "}do:}/BLL";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "xUe";
      stringArray0[5] = "BkXhe)(o\"QY";
      stringArray0[6] = "-8?r Iy4le3j=./_N";
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -8?r Iy4le3j=./_N
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}