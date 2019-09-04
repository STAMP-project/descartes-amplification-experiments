/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 01:26:15 GMT 2019
 */

package org.eaxy.experimental;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import java.util.LinkedList;
import org.eaxy.Document;
import org.eaxy.Element;
import org.eaxy.Namespace;
import org.eaxy.QualifiedName;
import org.eaxy.experimental.SampleXmlBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class SampleXmlBuilder_ESTest extends SampleXmlBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SampleXmlBuilder sampleXmlBuilder0 = null;
      try {
        sampleXmlBuilder0 = new SampleXmlBuilder((URL) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Namespace namespace0 = new Namespace("Vh:");
      QualifiedName qualifiedName0 = new QualifiedName(namespace0, ">...</");
      Element element0 = new Element(qualifiedName0, (-1368));
      Document document0 = new Document(element0);
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder(document0, "");
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.randomAttributeText((String) null, element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Namespace namespace0 = new Namespace("%yT#U", "%yT#U");
      QualifiedName qualifiedName0 = new QualifiedName(namespace0, "simpleType");
      Element element0 = new Element(qualifiedName0, 10000);
      Document document0 = new Document(element0);
      LinkedList<Document> linkedList0 = new LinkedList<Document>();
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder("from", document0, linkedList0);
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.randomAttributeText("$s A^%+vJAU+", element0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find <java.lang.String@0000000013> below [java.lang.String@0000000020]. Actual elements: java.util.ArrayList@0000000021
         //
         verifyException("org.eaxy.ElementSet", e);
      }
  }
}
