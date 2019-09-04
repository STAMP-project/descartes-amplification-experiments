/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 18:04:42 GMT 2019
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
      Calendar calendar0 = Utils.parseHistDate("nan");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Calendar calendar0 = Utils.parseHistDate("-");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Calendar calendar0 = Utils.parseHistDate("N/A");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Calendar calendar0 = Utils.parseHistDate("u\n");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Calendar calendar0 = Utils.parseHistDate("");
      assertNull(calendar0);
  }
}
