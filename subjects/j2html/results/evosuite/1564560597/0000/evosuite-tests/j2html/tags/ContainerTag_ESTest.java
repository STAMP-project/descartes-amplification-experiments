/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 08:11:04 GMT 2019
 */

package j2html.tags;

import org.junit.Test;
import static org.junit.Assert.*;
import j2html.tags.ContainerTag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ContainerTag_ESTest extends ContainerTag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContainerTag containerTag0 = new ContainerTag("TlD");
      boolean boolean0 = containerTag0.equals(containerTag0);
      assertTrue(boolean0);
  }
}
