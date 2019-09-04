/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 11:14:10 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Calendar calendar0 = Utils.parseDividendDate("0-\u0000\u0000\u0000-00");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Calendar calendar0 = Utils.parseDividendDate("00-\u0000\u0000\u0000-00");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Calendar calendar0 = Utils.parseDividendDate("nan");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Calendar calendar0 = Utils.parseDividendDate("");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Calendar calendar0 = Utils.parseDividendDate("N/A");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Calendar calendar0 = Utils.parseDividendDate("-");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Calendar calendar0 = Utils.parseDividendDate("h3-z-UPM");
      assertNull(calendar0);
  }
}
