/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 15:00:32 GMT 2019
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
  public void test00()  throws Throwable  {
      double double0 = Utils.getDouble("7K");
      assertEquals(7000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = Utils.getDouble("");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = Utils.getDouble("-");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = Utils.getDouble("N/A");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = Utils.getDouble("0");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = Utils.getDouble("-3");
      assertEquals((-3.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = Utils.getDouble("KSp<ay2].M");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = Utils.getDouble(",_~LK");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = Utils.getDouble("h8xr'o/7%_>@wG--B");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = Utils.getDouble("nan");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getDouble(",");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
