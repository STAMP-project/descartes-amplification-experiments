/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 06:34:18 GMT 2019
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.DoubleMetaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DoubleMetaphone_ESTest extends DoubleMetaphone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "KNKM");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(object0);
      assertEquals("NKM", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "UMB");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AM", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "n'OGyYT9Z](i");
      assertEquals("NJTS", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "1>ZDamRkz5O2%J");
      assertEquals("STMR", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "PF>5)DdJZp");
      assertEquals("PFTS", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = "{\\u''w";
      Object object0 = doubleMetaphone0.encode((Object) string0);
      assertEquals("", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "$s}`Z-}'W(@p{n");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SSPN", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "w)3|~e");
      assertEquals("", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "TH");
      assertEquals("0", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "SC");
      assertEquals("SK", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "S.D|h<)Al~QEP,");
      assertEquals("STLK", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "AJ");
      assertNotNull(object0);
      assertEquals("AJ", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "SJOSE");
      assertEquals("SJS", object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "JOSE");
      assertEquals("HS", object0);
      assertNotNull(object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "HS");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(object0);
      assertEquals("S", object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) ">gNF4c&/_E%o-u)");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("NFK", object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "G~PTARU:7k\"qL{@m");
      assertEquals("KPTR", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "NogHeXTTdt>'9giEQ-H");
      assertEquals("NKKS", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "36F0]lg0DGf2qqw$");
      assertEquals("FLKT", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "ORCHI|");
      assertEquals("ARX", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "U,CCEE");
      assertEquals("AX", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "UCCEE");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(object0);
      assertEquals("AKS", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "jCz<");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("JS", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "ORCHID");
      assertEquals("ARKT", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "d)~BNEOhj-*4Vh*M");
      assertEquals("TPNJ", object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) ")daGgB-*7UMhpQNGqGU");
      assertEquals("TKPM", object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "CAESAR");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(object0);
      assertEquals("SSR", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "");
      assertNull(object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      try { 
        doubleMetaphone0.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // DoubleMetaphone encode parameter is not of type String
         //
         verifyException("org.apache.commons.codec.language.DoubleMetaphone", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "XpbAcF.7'S");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SPKF", object0);
  }
}
