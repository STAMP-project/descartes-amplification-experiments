/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 23 17:25:08 GMT 2019
 */

package org.eaxy.experimental;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SampleSoapXmlBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.eaxy.experimental.SampleSoapXmlBuilder"; 
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
    java.lang.System.setProperty("user.home", "/Users/overaper"); 
    java.lang.System.setProperty("user.dir", "/Users/overaper/Projects/playground/test-replication/subjects/eaxy/results/evosuite/1563900707/0019"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/6n/07_5d5h97nz6fg6y1klwh7rw0000gp/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SampleSoapXmlBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.eaxy.ElementFilters$Identity",
      "org.eaxy.Xml$CommentElement",
      "org.eaxy.Element",
      "org.eaxy.ElementFilters",
      "org.eaxy.Attribute",
      "org.eaxy.ElementSet$1",
      "org.eaxy.ElementFilters$ElementPositionFilter",
      "org.eaxy.Xml$TextElement",
      "org.eaxy.ElementPath",
      "org.eaxy.experimental.SampleSoapXmlBuilder",
      "org.eaxy.Document",
      "org.eaxy.Node",
      "org.eaxy.QualifiedName",
      "org.eaxy.Namespace$1",
      "org.eaxy.Xml$CDataElement",
      "org.eaxy.ElementSet",
      "org.eaxy.experimental.ComplexTypeDefinition",
      "org.eaxy.XmlIterable",
      "org.eaxy.ElementFilter",
      "org.eaxy.CanNeverHappenException",
      "org.eaxy.XmlIterator",
      "org.eaxy.SchemaValidationException",
      "org.eaxy.ElementFilters$ChildQuery",
      "org.eaxy.NonMatchingPathException",
      "org.eaxy.ElementFilters$1",
      "org.eaxy.experimental.SampleXmlBuilder",
      "org.eaxy.Objects",
      "org.eaxy.ElementFilters$3",
      "org.eaxy.ElementFilters$2",
      "org.eaxy.ElementFilters$5",
      "org.eaxy.Validator",
      "org.eaxy.ElementFilters$4",
      "org.eaxy.StaxReader",
      "org.eaxy.experimental.SampleSoapXmlBuilder$SoapServiceDefinition",
      "org.eaxy.ElementQuery",
      "org.eaxy.Content",
      "org.eaxy.Namespace",
      "org.eaxy.XmlVisitor",
      "org.eaxy.experimental.SampleSoapXmlBuilder$SoapOperationDefinition",
      "org.eaxy.ElementFilters$ElementDescendantQuery",
      "org.eaxy.Xml",
      "org.eaxy.MalformedXMLException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SampleSoapXmlBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.eaxy.Namespace$1",
      "org.eaxy.Namespace",
      "org.eaxy.Objects",
      "org.eaxy.experimental.SampleSoapXmlBuilder",
      "org.eaxy.experimental.SampleSoapXmlBuilder$SoapServiceDefinition",
      "org.eaxy.experimental.SampleSoapXmlBuilder$SoapOperationDefinition",
      "org.eaxy.Xml",
      "org.eaxy.QualifiedName",
      "org.eaxy.Element",
      "org.eaxy.Document",
      "org.eaxy.ElementSet$1",
      "org.eaxy.ElementSet",
      "org.eaxy.ElementPath",
      "org.eaxy.ElementFilters",
      "org.eaxy.ElementFilter",
      "org.eaxy.ElementFilters$4",
      "org.eaxy.ElementFilters$ChildQuery",
      "org.eaxy.ElementFilters$3",
      "org.eaxy.Attribute",
      "org.eaxy.ElementFilters$1",
      "org.eaxy.ElementFilters$2",
      "org.eaxy.StaxReader",
      "org.eaxy.MalformedXMLException",
      "org.eaxy.NonMatchingPathException"
    );
  }
}
