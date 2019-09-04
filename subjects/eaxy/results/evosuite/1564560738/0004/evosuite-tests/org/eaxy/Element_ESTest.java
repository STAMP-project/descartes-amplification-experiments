/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 08:18:08 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
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
      QualifiedName qualifiedName0 = new QualifiedName("@", "@");
      Content[] contentArray0 = new Content[9];
      Namespace namespace0 = new Namespace("@", "@");
      Attribute attribute0 = new Attribute(qualifiedName0, "@");
      contentArray0[6] = (Content) namespace0;
      contentArray0[7] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("@", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      QualifiedName qualifiedName0 = new QualifiedName(namespace0, "n@");
      Content[] contentArray0 = new Content[12];
      contentArray0[11] = (Content) namespace0;
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
      QualifiedName qualifiedName0 = new QualifiedName("Qy YgXi`$p", "Qy YgXi`$p", "Qy YgXi`$p");
      Content[] contentArray0 = new Content[3];
      Attribute attribute0 = new Attribute(qualifiedName0, "Qy YgXi`$p");
      contentArray0[1] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      // Undeclared exception!
      try { 
        element0.hasClass("Qy YgXi`$p");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("R|K1a1$]MA8\"cY |");
      HashSet<Attribute> hashSet0 = new HashSet<Attribute>();
      ArrayList<Namespace> arrayList0 = new ArrayList<Namespace>();
      Integer integer0 = new Integer(0);
      Element element0 = new Element(qualifiedName0, hashSet0, arrayList0, integer0);
      assertEquals("R|K1a1$]MA8\"cY |", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("Qy YgXi`$p", "Qy YgXi`$p", "Qy YgXi`$p");
      PriorityQueue<Content> priorityQueue0 = new PriorityQueue<Content>();
      Element element0 = new Element(qualifiedName0, priorityQueue0);
      assertEquals("Qy YgXi`$p", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("@", "@");
      Element element0 = new Element(qualifiedName0, 2);
      // Undeclared exception!
      try { 
        element0.hasClass("@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
