/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 10:37:05 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Comment;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Comment_ESTest extends Comment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comment comment0 = new Comment("Od03*H!{W=n_p/<}!a+", "math");
      assertEquals(0, comment0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Comment comment0 = new Comment("math");
      assertEquals("#comment", comment0.nodeName());
  }
}
