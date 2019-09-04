/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 04:43:11 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Calendar calendar0 = Utils.parseDateTime("RAF", "nan", (TimeZone) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Calendar calendar0 = Utils.parseDateTime("%s=%s", "-", (TimeZone) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(907, "'");
      Calendar calendar0 = Utils.parseDateTime("N/A", "xBo|oKfTJ", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1096796124), "Q3@");
      Calendar calendar0 = Utils.parseDateTime("*#J<r)s'}&Lga1OQ`", "", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(907, "'");
      Calendar calendar0 = Utils.parseDateTime("NB8", "?I p", simpleTimeZone0);
      assertNull(calendar0);
  }
}
