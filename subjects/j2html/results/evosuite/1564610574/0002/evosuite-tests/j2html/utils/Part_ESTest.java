/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 19:09:03 GMT 2019
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
      Part part0 = new Part("#d8bfd8", "I!LN2R#I!#?2");
      assertEquals("#d8bfd8", part0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Part part0 = new Part("#c0c0c0", "");
      assertEquals("silver", part0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Part part0 = new Part("#ffefd5", "#ffefd5");
      assertEquals("#ffefd5", part0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Part part0 = new Part("tan", "tan");
      assertEquals("tan", part0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Part part0 = new Part("dimgray", "gmIqGL?$I%r1,lY");
      assertEquals("dimgray", part0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Part part0 = new Part("springgreen", "");
      assertEquals("#00ff7f", part0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Part part0 = new Part("", "animation-name");
      assertEquals("", part0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Part part0 = new Part("url($2)", "");
      assertEquals("url($2)", part0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Part part0 = new Part((String) null, "bold");
      assertEquals("null", part0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Part part0 = new Part("i+*@0G", "font-weight");
      assertEquals("i+*@0g", part0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Part part0 = new Part("KDDJ\"; lsSp EN-8", "F'pU3soJM^Qz-{\"XM");
      assertEquals("KDDJ\"; lsSp EN-8", part0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Part part0 = new Part("0  0", "0  0");
      assertEquals("0 ", part0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Part part0 = new Part(", t y 0", "bold");
      assertEquals(", t y 0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Part part0 = new Part("background-size", "background-size");
      assertEquals("background-size", part0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Part part0 = new Part("0 0", "#f08080");
      assertEquals("0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Part part0 = new Part("0 0 0 ", "0 0");
      assertEquals("0", part0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Part part0 = new Part("0 0 0 0", "s|Cp%KSY5l:_aj3T");
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
