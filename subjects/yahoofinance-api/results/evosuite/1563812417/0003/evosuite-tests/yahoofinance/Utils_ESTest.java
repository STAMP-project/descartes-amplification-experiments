/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 16:25:45 GMT 2019
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
  public void test0()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("$aqK", "");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("Z,nO U@R\"", "^Y3k7>\"FW\"4jM");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getBigDecimal("nan", "\b");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getBigDecimal(",", "G/mbc4ypUg67V<JGp");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("V*$x <&r}783Pa0anS", "0");
      assertEquals((short)0, bigDecimal0.shortValue());
      assertNotNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("", "3B");
      assertNotNull(bigDecimal0);
      assertEquals((short)24064, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("0", "V ");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("8", "&");
      assertNotNull(bigDecimal0);
      assertEquals((byte)8, bigDecimal0.byteValue());
  }
}
