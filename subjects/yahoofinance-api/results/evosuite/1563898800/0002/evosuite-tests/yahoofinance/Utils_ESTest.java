/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 16:24:24 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("nan");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("N/A");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("#,7");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getBigDecimal(",");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("0, ");
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("6");
      assertNotNull(bigDecimal0);
      assertEquals((short)6, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("Ger1lM");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("!KfsI_j&K");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("|jB");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("-");
      assertNull(bigDecimal0);
  }
}
