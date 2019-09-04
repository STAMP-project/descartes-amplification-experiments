/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 31 08:44:07 GMT 2019
 */

package com.squareup.javapoet;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ArrayTypeName_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.squareup.javapoet.ArrayTypeName"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/oscar/descartes-evosuite/subjects/javapoet/results/evosuite/1564562226/0005"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ArrayTypeName_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.internal.util.reflection.GenericMetadataSupport$BoundedType",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$FromClassGenericMetadataSupport",
      "com.squareup.javapoet.AnnotationSpec$Builder",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$NotGenericReturnTypeSupport",
      "com.squareup.javapoet.FieldSpec",
      "com.squareup.javapoet.ClassName",
      "com.squareup.javapoet.WildcardTypeName",
      "com.squareup.javapoet.MethodSpec$Builder",
      "com.squareup.javapoet.CodeWriter",
      "org.mockito.exceptions.base.MockitoException",
      "com.squareup.javapoet.Util",
      "com.squareup.javapoet.CodeBlock",
      "com.squareup.javapoet.TypeVariableName",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType",
      "com.squareup.javapoet.ParameterSpec",
      "com.squareup.javapoet.TypeSpec$Builder",
      "com.squareup.javapoet.FieldSpec$Builder",
      "com.squareup.javapoet.MethodSpec",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$FromParameterizedTypeGenericMetadataSupport",
      "com.squareup.javapoet.ParameterizedTypeName",
      "com.squareup.javapoet.TypeSpec",
      "com.squareup.javapoet.TypeSpec$Kind",
      "com.squareup.javapoet.CodeBlock$Builder",
      "com.squareup.javapoet.CodeBlock$CodeBlockJoiner",
      "com.squareup.javapoet.AnnotationSpec",
      "com.squareup.javapoet.TypeName",
      "org.mockito.internal.util.reflection.GenericMetadataSupport",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$GenericArrayReturnType",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$WildCardBoundedType",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$ParameterizedReturnType",
      "com.squareup.javapoet.ArrayTypeName"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.lang.reflect.GenericArrayType", false, ArrayTypeName_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.lang.reflect.WildcardType", false, ArrayTypeName_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ArrayTypeName_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.squareup.javapoet.Util",
      "com.squareup.javapoet.ClassName",
      "com.squareup.javapoet.TypeName",
      "com.squareup.javapoet.ArrayTypeName",
      "com.squareup.javapoet.TypeVariableName",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$WildCardBoundedType",
      "com.squareup.javapoet.WildcardTypeName"
    );
  }
}
