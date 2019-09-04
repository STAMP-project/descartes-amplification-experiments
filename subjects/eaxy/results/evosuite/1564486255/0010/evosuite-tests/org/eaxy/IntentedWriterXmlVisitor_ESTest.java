/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 11:43:51 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.eaxy.IntentedWriterXmlVisitor;
import org.eaxy.Xml;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class IntentedWriterXmlVisitor_ESTest extends IntentedWriterXmlVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      IntentedWriterXmlVisitor intentedWriterXmlVisitor0 = new IntentedWriterXmlVisitor(stringWriter0, "&gt;");
      Xml.CommentElement xml_CommentElement0 = new Xml.CommentElement("&gt;");
      intentedWriterXmlVisitor0.visitComment(xml_CommentElement0);
      assertEquals("<!--&gt;-->\n", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IntentedWriterXmlVisitor intentedWriterXmlVisitor0 = new IntentedWriterXmlVisitor((Writer) null, "j");
      Xml.CommentElement xml_CommentElement0 = new Xml.CommentElement("j");
      // Undeclared exception!
      try { 
        intentedWriterXmlVisitor0.visitComment(xml_CommentElement0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eaxy.IntentedWriterXmlVisitor", e);
      }
  }
}
