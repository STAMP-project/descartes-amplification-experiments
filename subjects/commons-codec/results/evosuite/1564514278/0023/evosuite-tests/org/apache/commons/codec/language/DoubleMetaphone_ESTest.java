/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:46:22 GMT 2019
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
      doubleMetaphone0.isDoubleMetaphoneEqual("", "UMB", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "LwC D6 mmU.q*", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("8~W,sl2ll", "8~W,sl2ll", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("ILLA", (String) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("TK", "WRMACHER", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("GI##z]", "", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("M.;zZo4@A@e^", "V\"CzS`3Dt'C0", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("KjH:8!oJ6:|^Z<f+;GI", "?89]z2", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("2]>KuB<0TZJWn>jD Ud", "(kJxZh8XABztu", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("z30#K", "kewnTOoL)=`k,3#", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("=tY}\"XC%4NA |ppp@c_", "", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual((String) null, "+4w/[2,*[X", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual((String) null, "W", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("kZMy:)2>Zn", "wIse/5", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("THov", "8", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("?0", "SC", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual(" 8?WC8t*83=scu5", " 8?WC8t*83=scu5", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("SCH", "", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("s,0Jp+^EX{OREbdN", (String) null, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("ANurRA8'ShfO", "h", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("xa", "IER", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("MACHER", "V", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("vRM%mh", "RgZpHjO9<cG", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("!U5D!iJ", "h", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("j!(]+*FBG+j$", "j!(]+*FBG+j$", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("", "GNJOSE", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual((String) null, "JOSE", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("Gh=gVDBqlh`~\"WlF#L", "", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("i!Y4~!Pp;[=IPp@", "{{G_5TwDjdDn$3+{E", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("Q", "/LGNuxNT2-@x", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "dsGH&s(zm\"3jD>(", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("}j14LlDG&;(+}t]", "xFG6", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("CH", "WWQxUA[sR8", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("m,aY0$W?7u9z(+56D", "CHORujE", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("CHORE", "^?)[5RZ)1XiSr&{", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("O_3~Ch}0Qb", "##Tu2 PzP2/^d-{ENd", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("UCCEE", ":`zq3S%`)xd", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual(">65acCI|N6", "p;7`X", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("CZ", "CZ", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual((String) null, "2bB)dd`}[r.P", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(4);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }
}