/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 18:31:57 GMT 2019
 */

package net.tridentsdk.ui.chat;

import org.junit.Test;
import static org.junit.Assert.*;
import net.tridentsdk.ui.chat.ChatComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ChatComponent_ESTest extends ChatComponent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChatComponent chatComponent0 = new ChatComponent();
      ChatComponent chatComponent1 = chatComponent0.addExtra("");
      assertFalse(chatComponent1.isItalic());
  }
}
