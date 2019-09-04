/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 11:55:40 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TreeSet;
import org.eaxy.Attribute;
import org.eaxy.Content;
import org.eaxy.Element;
import org.eaxy.Namespace;
import org.eaxy.QualifiedName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Element_ESTest extends Element_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("<", "<");
      Content[] contentArray0 = new Content[11];
      Namespace namespace0 = new Namespace("-JAy9sqQMx3", "-JAy9sqQMx3");
      contentArray0[0] = (Content) namespace0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("<", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("<", "<");
      Content[] contentArray0 = new Content[11];
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      contentArray0[2] = (Content) namespace0;
      Element element0 = null;
      try {
        element0 = new Element(qualifiedName0, contentArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid namespace {uri=null,prefix=null}
         //
         verifyException("org.eaxy.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("StringBuilder doesn't throw IOException", "StringBuilder doesn't throw IOException", "StringBuilder doesn't throw IOException");
      Attribute attribute0 = new Attribute(qualifiedName0, "StringBuilder doesn't throw IOException");
      Content[] contentArray0 = new Content[10];
      contentArray0[2] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("StringBuilder doesn't throw IOException", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("xhsf''3n@cP;+", "e_wp@tD+4|:Emkg", "e_wp@tD+4|:Emkg");
      TreeSet<Content> treeSet0 = new TreeSet<Content>();
      Element element0 = new Element(qualifiedName0, treeSet0);
      assertEquals("e_wp@tD+4|:Emkg", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("o.eaxy.EleentSet", "o.eaxy.EleentSet", "o.eaxy.EleentSet");
      Element element0 = new Element(qualifiedName0, (-4098));
      assertEquals("o.eaxy.EleentSet", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Namespace namespace0 = new Namespace("o.eaxy.EleentSet", "o.eaxy.EleentSet");
      QualifiedName qualifiedName0 = new QualifiedName("o.eaxy.EleentSet", "o.eaxy.EleentSet", "o.eaxy.EleentSet");
      Content[] contentArray0 = new Content[4];
      Element element0 = new Element(qualifiedName0, contentArray0);
      boolean boolean0 = element0.equals(namespace0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("o.eaxy.EleentSet", "o.eaxy.EleentSet", "o.eaxy.EleentSet");
      Content[] contentArray0 = new Content[4];
      Element element0 = new Element(qualifiedName0, contentArray0);
      boolean boolean0 = element0.equals(element0);
      assertTrue(boolean0);
  }
}
