/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 05:32:49 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.owasp.html.Strings;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Strings_ESTest extends Strings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('L', 'm').when(charSequence0).charAt(anyInt());
      doReturn(1743, 1743).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-1080), charSequence0, 853, 853);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('X', 'A').when(charSequence0).charAt(anyInt());
      doReturn(1743, 1743).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-1080), charSequence0, 853, 853);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('a', 'a', 'a', 'a', 'a').when(charSequence0).charAt(anyInt());
      doReturn(0).when(charSequence0).length();
      CharSequence charSequence1 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('a', 'a', 'a', 'a', 'a').when(charSequence1).charAt(anyInt());
      doReturn(0).when(charSequence1).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-490), charSequence1, (-490), 60);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-1481), charSequence0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(')', 'Z').when(charSequence0).charAt(anyInt());
      doReturn(0, 0).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-1), charSequence0, (-898), 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charSequence0).length();
      CharSequence charSequence1 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-434)).when(charSequence1).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-434), charSequence1, 0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Strings.regionMatchesIgnoreCase((CharSequence) null, 435, (CharSequence) null, (-1574), 2256);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.Strings", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('L', '(').when(charSequence0).charAt(anyInt());
      doReturn(1743, 1743).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-1080), charSequence0, 853, 853);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('q', 'O').when(charSequence0).charAt(anyInt());
      doReturn((-1), 853).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-1080), charSequence0, (-1993), 853);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('{', '{', '{', 'N').when(charSequence0).charAt(anyInt());
      doReturn(2051, 2051).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-1481), charSequence0, (-1919), 90);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('Z', '[').when(charSequence0).charAt(anyInt());
      doReturn((-1), 32).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-2977), charSequence0, 0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-575)).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 0, charSequence0, (-434), (-434));
      assertFalse(boolean0);
  }
}
