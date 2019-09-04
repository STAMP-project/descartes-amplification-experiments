/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 04:44:24 GMT 2019
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
      Long long0 = Utils.getLong("nan");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long long0 = Utils.getLong("");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Long long0 = Utils.getLong("-");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Long long0 = Utils.getLong("N/A");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Long long0 = Utils.getLong("O1gL,Hr?VE`T!");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Long long0 = Utils.getLong(",");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Long long0 = Utils.getLong("0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Long long0 = Utils.getLong("04,");
      assertEquals(4L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Long long0 = Utils.getLong("-2");
      assertEquals((-2L), (long)long0);
  }
}
