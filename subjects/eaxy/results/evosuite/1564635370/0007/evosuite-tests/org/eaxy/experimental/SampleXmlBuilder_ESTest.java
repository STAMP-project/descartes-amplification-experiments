/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 05:05:34 GMT 2019
 */

package org.eaxy.experimental;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import java.util.LinkedList;
import org.eaxy.Document;
import org.eaxy.Element;
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
        sampleXmlBuilder0 = new SampleXmlBuilder((URL) null, ">[{P4<c8w(_4V'fA+");
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
      QualifiedName qualifiedName0 = new QualifiedName("simpleType");
      Element element0 = new Element(qualifiedName0, (-206030524));
      Document document0 = new Document(element0);
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder(document0, "\n");
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.randomElementText("simpleType", element0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find <java.lang.String@0000000030> below [java.lang.String@0000000037]. Actual elements: java.util.ArrayList@0000000038
         //
         verifyException("org.eaxy.ElementSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("^Ygwj`wy~g");
      Element element0 = new Element(qualifiedName0, 39);
      Document document0 = new Document(element0);
      LinkedList<Document> linkedList0 = new LinkedList<Document>();
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder("^Ygwj`wy~g", document0, linkedList0);
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.randomElementText("EjD/kB)-uj'rE|^-V", element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
