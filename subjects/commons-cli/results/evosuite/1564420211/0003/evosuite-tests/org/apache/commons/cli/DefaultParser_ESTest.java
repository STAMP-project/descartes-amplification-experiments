/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:15:14 GMT 2019
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
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-:`}";
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -:`}
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
      stringArray0[0] = "rNcL'.`u";
      stringArray0[1] = "-V\"~$|";
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -V\"~$|
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "f'*";
      stringArray0[1] = " [ARG]";
      stringArray0[2] = "";
      stringArray0[3] = "w>c,mxg>?";
      stringArray0[4] = "yr{ik";
      stringArray0[5] = "org.apache.commons.cli.CommandLine";
      stringArray0[6] = "org.apache.commons.cli.CommandLine";
      stringArray0[7] = "Either opt or longOpt must be specified";
      stringArray0[8] = "-O";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -O
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Default option wasn't defined";
      stringArray0[1] = "--=";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --=
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "'5Sv%b>QP5";
      stringArray0[2] = "";
      stringArray0[3] = "-";
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "org.apache.commons.cli.DefaultParser";
      stringArray0[1] = "6";
      stringArray0[2] = "+P-(hM[BNfA";
      stringArray0[3] = "Vj$^`,v.Zv@";
      stringArray0[4] = "`.ab^ir4+0/lJ/b";
      stringArray0[5] = "--'5Sv%b>QP5";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --'5Sv%b>QP5
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Properties properties0 = new Properties();
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0);
      CommandLine commandLine1 = defaultParser0.parse(options0, stringArray0, properties0);
      assertFalse(commandLine1.equals((Object)commandLine0));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      defaultParser0.stopAtNonOption = false;
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
  public void test8()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-'=F5@ ";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -'=F5@ 
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}
