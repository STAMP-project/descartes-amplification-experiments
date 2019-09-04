/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 06:27:12 GMT 2019
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
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("\"f5robTb~A~CJ@leLCz", true);
      assertNotNull(string0);
      assertEquals("FRPT", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone(", R*Lmp;.yak", false);
      assertNotNull(string0);
      assertEquals("RLMP", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("O/^|*tMM<gnFA1Q", false);
      assertEquals("ATMN", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("$LLE", true);
      assertEquals("L", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("WoC4ll|Pa_fB_2jQL", true);
      assertEquals("FKLP", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("CHORE", true);
      assertEquals("XR", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("BACHER", true);
      assertNotNull(string0);
      assertEquals("PKR", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("PNBACHER", false);
      assertEquals("NPKR", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("7VdzzP$~^C4;r_3OP", false);
      assertEquals("FTSP", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("k2^ZV)%PFDcc^]|13", true);
      assertEquals("KTSF", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("'1k~tzI~t99IN7\"?TMU", true);
      assertNotNull(string0);
      assertEquals("KTST", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("\"Zh", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("J", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("WR7B}XC<R(\"5DG304MG", true);
      assertEquals("RPKS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("FX", false);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("FKS", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("ALKX", false);
      assertEquals("ALKK", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("X", false);
      assertEquals("S", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("#k3bw", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("KP", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("A#a@W:[TH>iy}Nzoh", false);
      assertNotNull(string0);
      assertEquals("A0NS", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("eIthtQ.E{(_d^wu", false);
      assertEquals("A0TK", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("SC", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SK", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("`iE!p)tuKsCPw4gM", true);
      assertEquals("PTKS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("sHQZYmBp~", true);
      assertEquals("XKSM", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("SCH", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("X", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("RRPK", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
      assertEquals("RPK", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("IER", true);
      assertEquals("AR", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Z=zy NA[y)'Pp %v3", true);
      assertEquals("SSNP", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("2AdcYPhTi8<rM", true);
      assertEquals("TSFT", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("KLL", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("KL", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("iJ>~x:s q-9d", true);
      assertEquals("AJKS", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("(,IJj%}94|t%", true);
      assertEquals("JT", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("o (NYjAZ,xRco5/", false);
      assertEquals("ANJS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("j;", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
      assertEquals("J", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("JOSE", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
      assertEquals("HS", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("/RUgN!X*lgyW]P4tz", false);
      assertEquals("RKNK", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("gRLB2N~w>!l[kj-$5\"", true);
      assertEquals("KRLP", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("gh", false);
      assertEquals("K", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("+#y1V|uw{/xDG#f`", true);
      assertEquals("FKST", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("ucHGB^ 0'lV|Jgg/U", false);
      assertEquals("AXKP", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("ACH", false);
      assertEquals("AK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("UCCES", false);
      assertEquals("AKSS", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("+ aL%[kCz5Q", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("LKXK", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(84);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("+QQu", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("K", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("FRNN", true);
      assertEquals("FRN", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("UMB", true);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AM", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("FF", true);
      assertEquals("F", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("}}S1s&BBFOt>>ad", true);
      assertEquals("SSPF", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("v[{hkVVS.6>o.wBl.u", true);
      assertEquals("FKFS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("HARAC", true);
      assertEquals("HRK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("z_k^<Pjbz=}@", false);
      assertEquals("SKPP", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("KNKK", true);
      assertEquals("NK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(string0);
  }
}