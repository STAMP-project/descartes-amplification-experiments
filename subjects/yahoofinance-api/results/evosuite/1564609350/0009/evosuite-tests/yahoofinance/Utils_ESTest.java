/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 21:54:37 GMT 2019
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
      Calendar calendar0 = Utils.parseDateTime("kAU8)Tc<zJ:`eJh7e$y", "nan", (TimeZone) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Calendar calendar0 = Utils.parseDateTime("-", "VWl(Yx 8}Y", (TimeZone) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Calendar calendar0 = Utils.parseDateTime("N/A", "N/A", (TimeZone) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-27), "");
      Calendar calendar0 = Utils.parseDateTime("aan", ",", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-27), "");
      Calendar calendar0 = Utils.parseDateTime(",", "", simpleTimeZone0);
      assertNull(calendar0);
  }
}
