/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:13:55 GMT 2019
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-VgAYPD1Gag";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -VgAYPD1Gag
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "]";
      stringArray0[1] = "]";
      stringArray0[2] = "]";
      stringArray0[3] = "-[q";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -[q
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Axqe8.4S!";
      stringArray0[1] = "Axqe8.4S!";
      stringArray0[2] = "e9C";
      stringArray0[3] = "-h'a2.eN_SB=gG\"IGh";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -h'a2.eN_SB=gG\"IGh
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "p$wMJ\"";
      stringArray0[1] = "---5*9tFR`W%1H}aBj";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: ---5*9tFR`W%1H}aBj
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "h'5a2.eN_SB=gG\"IGh";
      stringArray0[1] = "";
      stringArray0[2] = "-.";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -.
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      defaultParser0.stopAtNonOption = true;
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      defaultParser0.skipParsing = true;
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "4&yYJ3NG?z";
      stringArray0[1] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Axqe8.4S!";
      stringArray0[1] = "1";
      stringArray0[2] = "e9C";
      stringArray0[3] = "--h'5a2.eN_SB=gG\"IGh";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --h'5a2.eN_SB=gG\"IGh
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}
