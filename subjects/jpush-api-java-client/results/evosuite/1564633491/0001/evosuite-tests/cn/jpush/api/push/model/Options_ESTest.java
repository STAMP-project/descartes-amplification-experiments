/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 04:27:09 GMT 2019
 */

package cn.jpush.api.push.model;

import org.junit.Test;
import static org.junit.Assert.*;
import cn.jpush.api.push.model.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Options_ESTest extends Options_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Options.Builder options_Builder0 = new Options.Builder();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Options options0 = Options.sendno();
      assertEquals(100000, options0.getSendno());
  }
}
