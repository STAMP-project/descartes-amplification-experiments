/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:08:22 GMT 2019
 */

package j2html.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import j2html.utils.Part;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Part_ESTest extends Part_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Part part0 = new Part("#0000cd", "vkal");
      assertEquals("#0000cd", part0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Part part0 = new Part("#ff69b4", "Us5fTht");
      assertEquals("#ff69b4", part0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Part part0 = new Part("#fffff0", "vkal");
      assertEquals("ivory", part0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Part part0 = new Part("#daa520", "");
      assertEquals("#daa520", part0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Part part0 = new Part("brown", "F2<]*SP^${yAzD*}?");
      assertEquals("brown", part0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Part part0 = new Part("skyblue", "");
      assertEquals("skyblue", part0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Part part0 = new Part("slateblue", "springgreen");
      assertEquals("#6a5acd", part0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Part part0 = new Part("animation-name", "animation-name");
      assertEquals("animation-name", part0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Part part0 = new Part("url($2)", "url($2)");
      assertEquals("url($2)", part0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Part part0 = new Part((String) null, "font-weight");
      assertEquals("null", part0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Part part0 = new Part("0 1 0 ", " C");
      assertEquals("0 1", part0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Part part0 = new Part("0 0 0j 0", "0 0 0j 0");
      assertEquals("0 0 0j", part0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Part part0 = new Part("0 1 0 0", " C");
      assertEquals("0 1 0 0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Part part0 = new Part("CkwgR-(mFnv72w", "background-size");
      assertEquals("ckwgr-(mfnv72w", part0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Part part0 = new Part("0 0", "0 0");
      assertEquals("0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Part part0 = new Part("0 0 0", "0 0 0");
      assertEquals("0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Part part0 = new Part("0 0 0 0", "0 0 0 0");
      assertEquals("0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Part part0 = null;
      try {
        part0 = new Part("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
