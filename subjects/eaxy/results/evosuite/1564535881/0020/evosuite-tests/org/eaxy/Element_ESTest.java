/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 01:41:41 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;
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
      QualifiedName qualifiedName0 = new QualifiedName(" not found in ", " not found in ");
      Content[] contentArray0 = new Content[7];
      Namespace namespace0 = new Namespace(" not found in ");
      contentArray0[0] = (Content) namespace0;
      Namespace namespace1 = new Namespace(" not found in ", " not found in ");
      contentArray0[2] = (Content) namespace1;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals(" not found in ", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("Kl F|1QTj.v5ICD)R2", "Kl F|1QTj.v5ICD)R2", "Kl F|1QTj.v5ICD)R2");
      Content[] contentArray0 = new Content[23];
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      contentArray0[9] = (Content) namespace0;
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
      QualifiedName qualifiedName0 = new QualifiedName("NIHd+Ko8", "NIHd+Ko8");
      Content[] contentArray0 = new Content[7];
      Attribute attribute0 = new Attribute(qualifiedName0, "NIHd+Ko8");
      contentArray0[1] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("NIHd+Ko8", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("<", " ~RqwO&?i@/");
      LinkedHashSet<Attribute> linkedHashSet0 = new LinkedHashSet<Attribute>();
      HashSet<Namespace> hashSet0 = new HashSet<Namespace>();
      Integer integer0 = new Integer(2739);
      Element element0 = new Element(qualifiedName0, linkedHashSet0, hashSet0, integer0);
      assertEquals(" ~RqwO&?i@/", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("NIHd+Ko8", "NIHd+Ko8");
      Element element0 = new Element(qualifiedName0, 1);
      assertEquals("NIHd+Ko8", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("NIHd+Ko8", "NIHd+Ko8");
      Stack<Content> stack0 = new Stack<Content>();
      Element element0 = new Element(qualifiedName0, stack0);
      boolean boolean0 = element0.equals(stack0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("NIHd+Ko8", "NIHd+Ko8");
      Stack<Content> stack0 = new Stack<Content>();
      Element element0 = new Element(qualifiedName0, stack0);
      boolean boolean0 = element0.equals(element0);
      assertTrue(boolean0);
  }
}
