/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 18:26:17 GMT 2019
 */

package j2html.tags;

import org.junit.Test;
import static org.junit.Assert.*;
import j2html.Config;
import j2html.tags.EmptyTag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EmptyTag_ESTest extends EmptyTag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyTag emptyTag0 = new EmptyTag("/");
      Config.closeEmptyTags = true;
      boolean boolean0 = emptyTag0.equals(emptyTag0);
      assertTrue(boolean0);
  }
}
