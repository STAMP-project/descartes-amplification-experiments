/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 16:35:59 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = Utils.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.unescape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("yahoofinance.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Utils.unescape("g`nlu60EJe`");
      assertEquals("g`nlu60EJe`", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Utils.unescape("J*0'}");
      assertEquals("J*0\\'}", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = Utils.unescape("Ia~EK\n|-");
      assertEquals("Ia~EK\\n|-", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = Utils.unescape("nQ=# #H[vfQ39\"");
      assertEquals("nQ=# #H[vfQ39\\\"", string0);
  }
}
