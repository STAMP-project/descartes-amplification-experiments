/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:13:24 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.owasp.html.CssSchema;
import org.owasp.html.ElementAndAttributePolicies;
import org.owasp.html.ElementAndAttributePolicyBasedSanitizerPolicy;
import org.owasp.html.Handler;
import org.owasp.html.HtmlStreamEventReceiver;
import org.owasp.html.HtmlStreamRenderer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ElementAndAttributePolicyBasedSanitizerPolicy_ESTest extends ElementAndAttributePolicyBasedSanitizerPolicy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      Handler<Object> handler0 = (Handler<Object>) mock(Handler.class, new ViolatedAssumptionAnswer());
      Handler<Object> handler1 = (Handler<Object>) mock(Handler.class, new ViolatedAssumptionAnswer());
      HtmlStreamRenderer htmlStreamRenderer0 = new HtmlStreamRenderer(stringWriter0, handler0, handler1);
      ImmutableSet<String> immutableSet0 = CssSchema.DEFAULT_WHITELIST;
      ElementAndAttributePolicyBasedSanitizerPolicy elementAndAttributePolicyBasedSanitizerPolicy0 = new ElementAndAttributePolicyBasedSanitizerPolicy(htmlStreamRenderer0, (ImmutableMap<String, ElementAndAttributePolicies>) null, immutableSet0);
      // Undeclared exception!
      try { 
        elementAndAttributePolicyBasedSanitizerPolicy0.closeDocument();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.HtmlStreamRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImmutableSet<String> immutableSet0 = ElementAndAttributePolicyBasedSanitizerPolicy.SKIPPABLE_ELEMENT_CONTENT;
      ElementAndAttributePolicyBasedSanitizerPolicy elementAndAttributePolicyBasedSanitizerPolicy0 = new ElementAndAttributePolicyBasedSanitizerPolicy((HtmlStreamEventReceiver) null, (ImmutableMap<String, ElementAndAttributePolicies>) null, immutableSet0);
      // Undeclared exception!
      try { 
        elementAndAttributePolicyBasedSanitizerPolicy0.closeDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.ElementAndAttributePolicyBasedSanitizerPolicy", e);
      }
  }
}
