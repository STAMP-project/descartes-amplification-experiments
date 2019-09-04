/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:09:36 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.owasp.html.ElementAndAttributePolicies;
import org.owasp.html.ElementAndAttributePolicyBasedSanitizerPolicy;
import org.owasp.html.Handler;
import org.owasp.html.HtmlStreamEventReceiver;
import org.owasp.html.HtmlStreamRenderer;
import org.owasp.html.TagBalancingHtmlStreamEventReceiver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class TagBalancingHtmlStreamEventReceiver_ESTest extends TagBalancingHtmlStreamEventReceiver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImmutableSet<String> immutableSet0 = ElementAndAttributePolicyBasedSanitizerPolicy.SKIPPABLE_ELEMENT_CONTENT;
      ElementAndAttributePolicyBasedSanitizerPolicy elementAndAttributePolicyBasedSanitizerPolicy0 = new ElementAndAttributePolicyBasedSanitizerPolicy((HtmlStreamEventReceiver) null, (ImmutableMap<String, ElementAndAttributePolicies>) null, immutableSet0);
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver(elementAndAttributePolicyBasedSanitizerPolicy0);
      tagBalancingHtmlStreamEventReceiver0.closeTag("rL_<X$|W5Op6~w&mW3");
      assertFalse(immutableSet0.contains("rL_<X$|W5Op6~w&mW3"));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Handler<Object> handler0 = (Handler<Object>) mock(Handler.class, new ViolatedAssumptionAnswer());
      HtmlStreamRenderer htmlStreamRenderer0 = new HtmlStreamRenderer((Appendable) null, handler0, handler0);
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver(htmlStreamRenderer0);
      // Undeclared exception!
      try { 
        tagBalancingHtmlStreamEventReceiver0.closeTag("QH<S-3~9=aER])j,");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.HtmlStreamRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver((HtmlStreamEventReceiver) null);
      // Undeclared exception!
      try { 
        tagBalancingHtmlStreamEventReceiver0.closeTag("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.TagBalancingHtmlStreamEventReceiver", e);
      }
  }
}
