/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 03:54:54 GMT 2019
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
      Comment comment0 = new Comment("", "");
      assertFalse(comment0.hasParent());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Comment comment0 = new Comment("");
      assertFalse(comment0.hasParent());
  }
}
