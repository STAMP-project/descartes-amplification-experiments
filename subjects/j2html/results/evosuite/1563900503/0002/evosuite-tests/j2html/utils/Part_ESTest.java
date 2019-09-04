/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 12 14:20:23 GMT 2019
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
      Part part0 = new Part("mediumaquamarine", "@");
      assertEquals("#66cdaa", part0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Part part0 = new Part("#4b0082", "B|E$RI>AX^v+sV");
      assertEquals("#4b0082", part0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Part part0 = new Part("#ee82ee", "");
      assertEquals("violet", part0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Part part0 = new Part("#00008b", "#00008b");
      assertEquals("#00008b", part0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Part part0 = new Part("maroon", "x");
      assertEquals("maroon", part0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Part part0 = new Part("lime", " !important");
      assertEquals("lime", part0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Part part0 = new Part("RZen;>", "animation-name");
      assertEquals("RZen;>", part0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Part part0 = new Part("url($2)", "url($2)");
      assertEquals("url($2)", part0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Part part0 = new Part("font-weight", "font-weight");
      assertEquals("font-weight", part0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Part part0 = new Part("0  0", "+?WNA$'be0U4[rC");
      assertEquals("0 ", part0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Part part0 = new Part("y  0Fq 0", "#f0e68c");
      assertEquals("y  0Fq 0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Part part0 = new Part("> 0 0 0", "#00008b");
      assertEquals("> 0 0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Part part0 = new Part("rEP", "background-size");
      assertEquals("rep", part0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Part part0 = new Part("0 0", "0 0");
      assertEquals("0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Part part0 = new Part("0 0 0", "+?WNA$'be0U4[rC");
      assertEquals("0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Part part0 = new Part("0 0 0 0", "$1$2");
      assertEquals("0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Part part0 = null;
      try {
        part0 = new Part((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}