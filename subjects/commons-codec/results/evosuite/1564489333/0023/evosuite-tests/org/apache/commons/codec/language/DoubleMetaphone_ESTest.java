/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 12:50:08 GMT 2019
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.DoubleMetaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DoubleMetaphone_ESTest extends DoubleMetaphone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("NiNBS*", "GN", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("UMB", (String) null, false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("", "1@Ae$yI ~E=#vY!U>ll", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("ALLE", "ALLE", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("OU", "f|b9u>>apzZi+ ", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual((String) null, "PTZ*OzdZ]glz=;8\"k5t", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("HZ;g;`Tlf}r", "Z]Zd5)O\u0007c-('KTyum", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("C", "Cde=?,zh~EFEt", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("D", "WGjFxc{A)MJiDT", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("d6<Z4/SK][D", "YX", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("AGGI", "SZ?X", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "x%\"", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "SCz", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("SCH", "W", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual(":u^t9rSh6[i,%", "^M,ofT(Lk2B`G", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "SC", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("rRw", "ZA", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("OnJ|h_dA*", "PBHSey}k#Pt", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("fNPH@qAe&YPM!", "#u>s", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("?6txnO&>QTswfU]FYo", "ejj@M", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("G/Qr'YJ0", "G/Qr'YJ0", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("mmlo<#YJeHBwILkc!", "i|5zY>iV$", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("jy", "y<;`y|s", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("K((B/dPzX1*?byZ", "JOSE", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("UY", "'uGH$=vJo", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("[L26a@Ke", "UgNF;p%", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("~B[8q9E3/&DRVvi)Ce", "#tL[2{9Vh,1>hGZMH", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("35YIm0lgnKH", "!u+LL/f{", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("HrhumYGH p&1Bx8", "HrhumYGH p&1Bx8", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("1vR*ZdGo:kQ.7Uzt4|", "'/xBF[e(hp$N60}a", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("ORCH", ";]OTcSj(q^yK:#", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException", "ACH", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("UCCES", (String) null, true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "(CtL/`Ccn", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("dt(zp}&czx ", "]~", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("CHORE", "IkCN5w", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "BACHER", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("tH}%,`wsIbb", "org.apache.commons.codec.EncoderException", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("IER", "wYsoz=HX#]1", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }
}
