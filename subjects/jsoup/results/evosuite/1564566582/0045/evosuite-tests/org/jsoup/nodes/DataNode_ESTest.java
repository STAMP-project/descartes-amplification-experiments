/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 10:38:15 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DataNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DataNode_ESTest extends DataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataNode dataNode0 = new DataNode("]nN@=5_U|", (String) null);
      assertEquals("#data", dataNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataNode dataNode0 = new DataNode("2(5R{m1n<HCU/xaQ ");
      assertEquals("#data", dataNode0.nodeName());
  }
}
