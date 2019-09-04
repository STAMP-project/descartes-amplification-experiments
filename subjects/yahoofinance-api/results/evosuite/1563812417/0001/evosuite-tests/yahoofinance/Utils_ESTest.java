/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 16:22:52 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = Utils.getString("nan");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = Utils.getString("-");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = Utils.getString("N/A");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Utils.getString("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = Utils.getString(",");
      assertEquals(",", string0);
  }
}
