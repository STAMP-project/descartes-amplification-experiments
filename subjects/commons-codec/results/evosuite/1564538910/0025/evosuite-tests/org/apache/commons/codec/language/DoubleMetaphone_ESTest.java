/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 02:42:43 GMT 2019
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
      String string0 = doubleMetaphone0.doubleMetaphone("W", true);
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("UMB", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AM", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("u#57FlLjeGb_qo@.}a", true);
      assertEquals("AFLK", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("GNILLO", true);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("CHORE", false);
      assertEquals("XR", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("rg.apache.cmmons.codec.EncoderException", true);
      assertNotNull(string0);
      assertEquals("RKPK", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Rj8zzAd2w_Ou]yx]-*i", true);
      assertNotNull(string0);
      assertEquals("RJTS", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("lx_z;8_K~NnC][A;7H", true);
      assertEquals("LKST", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Z)=X{]9?wI|==B@", true);
      assertEquals("SKSP", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone(">.$z}TzW", true);
      assertEquals("TSTS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Z8V?n>*XC{J", false);
      assertEquals("SFNK", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("FX", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("FKS", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("X7", true);
      assertEquals("S", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("TH", false);
      assertEquals("0", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("SC", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
      assertEquals("SK", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("{T({%SCR\"J!y$8ZUVR", true);
      assertEquals("TSKJ", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("SC", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SK", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("N,]-/nOwG!%Rv=e", true);
      assertEquals("NNKR", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("M\"O%RRc5`ms", false);
      assertEquals("MRKM", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("IER", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AR", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("R", false);
      assertEquals("R", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("PPSM", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("PSM", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("D=\u0010pH-_iw", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
      assertEquals("TF", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("AJLS", true);
      assertEquals("ALS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("yj Lz-O%;I6mFAA", true);
      assertNotNull(string0);
      assertEquals("AJLS", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("gQ4vN?JTn", true);
      assertEquals("KKFN", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("=F@GhiXUDlG3I-.p", true);
      assertNotNull(string0);
      assertEquals("FKKS", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("fIBj_7DgTh<Uz0$L_", true);
      assertEquals("FPJT", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Hu-LCHn~hh", true);
      assertEquals("HLKN", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("ACH", false);
      assertEquals("AK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("cz_", false);
      assertEquals("S", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("WICZ", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("FKTS", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("jB9lLF,+yX0`", true);
      assertEquals("APLF", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-3291));
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("1(Am8PQ@Vv", false);
      assertEquals("MPKF", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("i#FR53Qq6A]k6FB,Ut", false);
      assertNotNull(string0);
      assertEquals("AFRK", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("!KvoVw6>Onnm=}M", true);
      assertNotNull(string0);
      assertEquals("KFFN", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("*imMc|jOu.&[m:i}^t", true);
      assertEquals("MKJM", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("FKKL", true);
      assertEquals("FKL", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("LTFF", false);
      assertNotNull(string0);
      assertEquals("LTF", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone(")#n}e|(3sh_nBBq'2Z", false);
      assertEquals("NXNP", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("TA!;vuKCCYSRzp|p}N", true);
      assertEquals("TFKK", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("JOSE", false);
      assertNotNull(string0);
      assertEquals("HS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("#hDFW=~!J(\"SBQ.*U", false);
      assertEquals("TFJS", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("cWN2HXH}", true);
      assertNotNull(string0);
      assertEquals("KNKS", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(string0);
  }
}