/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 30 14:58:00 GMT 2019
 */

package net.tridentsdk.base;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Position_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.tridentsdk.base.Position"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/oscar/descartes-evosuite/subjects/TridentSDK/results/evosuite/1564495806/0036"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Position_ESTest_scaffolding.class.getClassLoader() ,
      "net.tridentsdk.ui.chat.ChatColor",
      "net.tridentsdk.world.opt.LevelType",
      "org.hjson.JsonLiteral$Iv",
      "net.tridentsdk.inventory.Item",
      "net.tridentsdk.inventory.InventoryType",
      "net.tridentsdk.entity.Entity",
      "net.tridentsdk.world.gen.GeneratorProvider",
      "net.tridentsdk.inventory.PlayerInventory",
      "net.tridentsdk.world.gen.GenContainer",
      "net.tridentsdk.entity.living.EntityLiving",
      "net.tridentsdk.command.CommandSource",
      "net.tridentsdk.base.Position",
      "net.tridentsdk.world.opt.Weather",
      "net.tridentsdk.world.Chunk",
      "net.tridentsdk.world.opt.GameRule",
      "org.hjson.IHjsonDsfProvider",
      "net.tridentsdk.ui.title.Title",
      "net.tridentsdk.world.opt.Dimension",
      "net.tridentsdk.world.opt.WorldBorder$DoubleXZ",
      "net.tridentsdk.command.CommandSourceType",
      "net.tridentsdk.ui.tablist.TabList",
      "org.hjson.WritingBuffer",
      "org.hjson.JsonNumber",
      "net.tridentsdk.ui.chat.HoverEvent",
      "org.hjson.JsonObject",
      "net.tridentsdk.inventory.Inventory",
      "net.tridentsdk.ui.chat.ClickEvent",
      "net.tridentsdk.base.Block",
      "net.tridentsdk.base.Substance",
      "net.tridentsdk.world.World",
      "net.tridentsdk.meta.entity.EntityMeta",
      "net.tridentsdk.ui.bossbar.BossBar",
      "net.tridentsdk.meta.ItemMeta",
      "net.tridentsdk.base.AbstractVector",
      "org.hjson.HjsonOptions",
      "net.tridentsdk.world.gen.GeneratorContext",
      "org.hjson.JsonValue",
      "net.tridentsdk.command.CommandSourceType$1",
      "net.tridentsdk.ui.chat.ClickAction",
      "net.tridentsdk.command.CommandSourceType$3",
      "net.tridentsdk.command.CommandSourceType$2",
      "net.tridentsdk.ui.bossbar.BossBarColor",
      "net.tridentsdk.permission.Permissible",
      "net.tridentsdk.world.opt.GameMode",
      "net.tridentsdk.world.opt.Difficulty",
      "net.tridentsdk.command.CommandSourceType$4",
      "org.hjson.JsonType",
      "net.tridentsdk.ui.chat.ChatComponent$StringChatComponent",
      "net.tridentsdk.world.gen.TerrainGenerator",
      "org.hjson.JsonString",
      "org.hjson.Stringify",
      "net.tridentsdk.base.Vector",
      "net.tridentsdk.ui.chat.HoverAction",
      "net.tridentsdk.ui.chat.ChatType",
      "net.tridentsdk.world.opt.WorldBorder",
      "org.hjson.JsonArray",
      "net.tridentsdk.util.Int2ReferenceOpenHashMap",
      "net.tridentsdk.world.opt.WorldOpts",
      "net.tridentsdk.entity.living.Player",
      "net.tridentsdk.ui.chat.ChatComponent",
      "org.hjson.JsonDsf",
      "net.tridentsdk.world.opt.GameRuleMap",
      "net.tridentsdk.ui.bossbar.BossBarDivision",
      "net.tridentsdk.world.opt.GenOpts",
      "org.hjson.JsonLiteral"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("net.tridentsdk.world.World", false, Position_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Position_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.tridentsdk.base.AbstractVector",
      "net.tridentsdk.base.Position"
    );
  }
}
