/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 30 11:45:01 GMT 2019
 */

package org.eaxy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ElementSet_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.eaxy.ElementSet"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/oscar/descartes-evosuite/subjects/eaxy/results/evosuite/1564486255/0011"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ElementSet_ESTest_scaffolding.class.getClassLoader() ,
      "org.eaxy.Xml$CommentElement",
      "org.eaxy.Element",
      "org.eaxy.ElementFilters",
      "org.eaxy.ElementSet$1",
      "org.eaxy.Attribute",
      "org.eaxy.Xml$TextElement",
      "org.eaxy.ElementPath",
      "org.eaxy.Node",
      "org.eaxy.Document",
      "org.eaxy.QualifiedName",
      "org.eaxy.Namespace$1",
      "org.eaxy.Xml$CDataElement",
      "org.eaxy.ElementSet",
      "org.eaxy.XmlIterable",
      "org.eaxy.ElementFilter",
      "org.eaxy.CanNeverHappenException",
      "org.eaxy.XmlIterator",
      "org.eaxy.NonMatchingPathException",
      "org.eaxy.ElementFilters$1",
      "org.eaxy.Objects",
      "org.eaxy.ElementFilters$3",
      "org.eaxy.ElementFilters$2",
      "org.eaxy.ElementFilters$5",
      "org.eaxy.Validator",
      "org.eaxy.ElementFilters$4",
      "org.eaxy.ElementQuery",
      "org.eaxy.Content",
      "org.eaxy.Namespace",
      "org.eaxy.XmlVisitor",
      "org.eaxy.Xml"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ElementSet_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.eaxy.ElementSet$1",
      "org.eaxy.ElementSet",
      "org.eaxy.ElementFilters",
      "org.eaxy.Namespace$1",
      "org.eaxy.Namespace",
      "org.eaxy.QualifiedName",
      "org.eaxy.Objects",
      "org.eaxy.Element",
      "org.eaxy.ElementPath",
      "org.eaxy.Xml$CommentElement",
      "org.eaxy.Xml$CDataElement",
      "org.eaxy.Attribute",
      "org.eaxy.Xml$TextElement",
      "org.eaxy.NonMatchingPathException"
    );
  }
}
