/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 31 07:25:15 GMT 2019
 */

package com.helger.jcodemodel;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JBlock_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.helger.jcodemodel.JBlock"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/oscar/descartes-evosuite/subjects/jcodemodel/results/evosuite/1564549047/0139"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JBlock_ESTest_scaffolding.class.getClassLoader() ,
      "com.helger.jcodemodel.AbstractJClass",
      "com.helger.jcodemodel.IJDocCommentable",
      "com.helger.jcodemodel.JArray",
      "com.helger.jcodemodel.EClassType",
      "com.helger.jcodemodel.IJGenerable",
      "com.helger.jcodemodel.JDocComment",
      "com.helger.jcodemodel.AbstractJAnnotationValue",
      "com.helger.jcodemodel.JOpTernary",
      "com.helger.jcodemodel.JForEach",
      "com.helger.jcodemodel.IJStatement",
      "com.helger.jcodemodel.IJClassContainer",
      "com.helger.jcodemodel.util.ClassNameComparator",
      "com.helger.jcodemodel.JCatchBlock",
      "com.helger.jcodemodel.JStringLiteral",
      "com.helger.jcodemodel.JInvocation",
      "com.helger.jcodemodel.JOpUnary",
      "com.helger.jcodemodel.JAnnotationStringValue",
      "com.helger.jcodemodel.IJFormatter",
      "com.helger.jcodemodel.IJAnnotationWriter",
      "com.helger.jcodemodel.AbstractJClassContainer",
      "com.helger.jcodemodel.JDefinedClass",
      "com.helger.jcodemodel.JCommentPart",
      "com.helger.jcodemodel.JTypeVarClass",
      "com.helger.jcodemodel.writer.AbstractCodeWriter",
      "com.helger.jcodemodel.JReferencedClass",
      "com.helger.jcodemodel.JMethod",
      "com.helger.jcodemodel.IJObject",
      "com.helger.jcodemodel.IJOwned",
      "com.helger.jcodemodel.JOpUnaryTight",
      "com.helger.jcodemodel.JTryBlock",
      "com.helger.jcodemodel.JAtomDouble",
      "com.helger.jcodemodel.meta.ErrorTypeFound",
      "com.helger.jcodemodel.JBreak",
      "com.helger.jcodemodel.JFieldVar",
      "com.helger.jcodemodel.writer.JCMWriter",
      "com.helger.jcodemodel.JCodeModel",
      "com.helger.jcodemodel.util.UnicodeEscapeWriter",
      "com.helger.jcodemodel.JAtomInt",
      "com.helger.jcodemodel.JAnonymousClass",
      "com.helger.jcodemodel.JClassAlreadyExistsException",
      "com.helger.jcodemodel.fmt.AbstractJResourceFile",
      "com.helger.jcodemodel.writer.AbstractCodeWriter$JavaUnicodeEscapeWriter",
      "com.helger.jcodemodel.JConditional",
      "com.helger.jcodemodel.IJExpressionStatement",
      "com.helger.jcodemodel.AbstractJAnnotationValueOwned$FullClassNameExpr",
      "com.helger.jcodemodel.JReturn",
      "com.helger.jcodemodel.JAtom",
      "com.helger.jcodemodel.IJOwnedMaybe",
      "com.helger.jcodemodel.AbstractJType",
      "com.helger.jcodemodel.JVar",
      "com.helger.jcodemodel.JAtomFloat",
      "com.helger.jcodemodel.JDoLoop",
      "com.helger.jcodemodel.JTypeVar",
      "com.helger.jcodemodel.JLambdaParam",
      "com.helger.jcodemodel.util.JCNameUtilities",
      "com.helger.jcodemodel.JThrow",
      "com.helger.jcodemodel.JWhileLoop",
      "com.helger.jcodemodel.EWildcardBoundMode",
      "com.helger.jcodemodel.JLambda",
      "com.helger.jcodemodel.IJAnnotatable",
      "com.helger.jcodemodel.JCast",
      "com.helger.jcodemodel.IJDeclaration",
      "com.helger.jcodemodel.JAnnotationArrayMember",
      "com.helger.jcodemodel.JErrorClass",
      "com.helger.jcodemodel.JOpBinary",
      "com.helger.jcodemodel.JCase",
      "com.helger.jcodemodel.JErrorClassUsedException",
      "com.helger.jcodemodel.JDirectClass",
      "com.helger.jcodemodel.JLambdaMethodRef",
      "com.helger.jcodemodel.IJGenerifiable",
      "com.helger.jcodemodel.JDefinedClass$1",
      "com.helger.jcodemodel.JPackage",
      "com.helger.jcodemodel.AbstractJAnnotationValueOwned",
      "com.helger.jcodemodel.JTypeWildcard",
      "com.helger.jcodemodel.JForLoop",
      "com.helger.jcodemodel.meta.CodeModelBuildingException",
      "com.helger.jcodemodel.JAtomLong",
      "com.helger.jcodemodel.JNarrowedClass",
      "com.helger.jcodemodel.JEnumConstant",
      "com.helger.jcodemodel.JJavaName",
      "com.helger.jcodemodel.writer.FilterCodeWriter",
      "com.helger.jcodemodel.writer.JFormatter",
      "com.helger.jcodemodel.JAnnotationUse",
      "com.helger.jcodemodel.JLambdaBlock",
      "com.helger.jcodemodel.writer.FileCodeWriter",
      "com.helger.jcodemodel.JArrayCompRef",
      "com.helger.jcodemodel.JArrayClass",
      "com.helger.jcodemodel.JNullType",
      "com.helger.jcodemodel.JBlock",
      "com.helger.jcodemodel.JSwitch",
      "com.helger.jcodemodel.JPrimitiveType",
      "com.helger.jcodemodel.AbstractJAnnotationValueOwned$JEnumConstantExpr",
      "com.helger.jcodemodel.JMods",
      "com.helger.jcodemodel.util.JCValueEnforcer",
      "com.helger.jcodemodel.JExpr",
      "com.helger.jcodemodel.writer.ProgressCodeWriter$IProgressTracker",
      "com.helger.jcodemodel.writer.ProgressCodeWriter",
      "com.helger.jcodemodel.SourcePrintWriter",
      "com.helger.jcodemodel.IJExpression",
      "com.helger.jcodemodel.JAssignment",
      "com.helger.jcodemodel.JLabel",
      "com.helger.jcodemodel.JSynchronizedBlock",
      "com.helger.jcodemodel.JFieldRef",
      "com.helger.jcodemodel.JEnumConstantRef",
      "com.helger.jcodemodel.JContinue",
      "com.helger.jcodemodel.AbstractJGenerifiableImpl",
      "com.helger.jcodemodel.IJAssignmentTarget",
      "com.helger.jcodemodel.util.NullWriter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JBlock_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.helger.jcodemodel.JBlock",
      "com.helger.jcodemodel.util.JCValueEnforcer",
      "com.helger.jcodemodel.JAtom",
      "com.helger.jcodemodel.JExpr",
      "com.helger.jcodemodel.JCodeModel",
      "com.helger.jcodemodel.AbstractJType",
      "com.helger.jcodemodel.AbstractJClass",
      "com.helger.jcodemodel.JNullType",
      "com.helger.jcodemodel.JPrimitiveType",
      "com.helger.jcodemodel.JReferencedClass",
      "com.helger.jcodemodel.writer.JCMWriter",
      "com.helger.jcodemodel.AbstractJClassContainer",
      "com.helger.jcodemodel.JDefinedClass",
      "com.helger.jcodemodel.JAnonymousClass",
      "com.helger.jcodemodel.util.ClassNameComparator",
      "com.helger.jcodemodel.AbstractJGenerifiableImpl",
      "com.helger.jcodemodel.JDefinedClass$1",
      "com.helger.jcodemodel.JMods",
      "com.helger.jcodemodel.JVar",
      "com.helger.jcodemodel.JFieldVar",
      "com.helger.jcodemodel.JJavaName",
      "com.helger.jcodemodel.JNarrowedClass",
      "com.helger.jcodemodel.JLambdaParam",
      "com.helger.jcodemodel.JArrayClass",
      "com.helger.jcodemodel.JLambda",
      "com.helger.jcodemodel.JLambdaBlock",
      "com.helger.jcodemodel.JInvocation",
      "com.helger.jcodemodel.JLambdaMethodRef",
      "com.helger.jcodemodel.JConditional",
      "com.helger.jcodemodel.JEnumConstant",
      "com.helger.jcodemodel.JOpUnary",
      "com.helger.jcodemodel.JOpUnaryTight",
      "com.helger.jcodemodel.JMethod",
      "com.helger.jcodemodel.JAtomLong",
      "com.helger.jcodemodel.JAtomDouble",
      "com.helger.jcodemodel.AbstractJAnnotationValueOwned$FullClassNameExpr",
      "com.helger.jcodemodel.JEnumConstantRef",
      "com.helger.jcodemodel.JFieldRef",
      "com.helger.jcodemodel.JAtomFloat",
      "com.helger.jcodemodel.JArrayCompRef",
      "com.helger.jcodemodel.JTypeVar",
      "com.helger.jcodemodel.JErrorClass",
      "com.helger.jcodemodel.JOpBinary",
      "com.helger.jcodemodel.JArray",
      "com.helger.jcodemodel.JAtomInt",
      "com.helger.jcodemodel.JOpTernary",
      "com.helger.jcodemodel.JTypeVarClass",
      "com.helger.jcodemodel.JStringLiteral",
      "com.helger.jcodemodel.JAssignment",
      "com.helger.jcodemodel.JCast",
      "com.helger.jcodemodel.JTypeWildcard",
      "com.helger.jcodemodel.AbstractJAnnotationValueOwned$JEnumConstantExpr",
      "com.helger.jcodemodel.JErrorClassUsedException",
      "com.helger.jcodemodel.JDirectClass",
      "com.helger.jcodemodel.util.JCNameUtilities",
      "com.helger.jcodemodel.JPackage",
      "com.helger.jcodemodel.AbstractJAnnotationValue",
      "com.helger.jcodemodel.JAnnotationStringValue",
      "com.helger.jcodemodel.JCatchBlock",
      "com.helger.jcodemodel.JCommentPart",
      "com.helger.jcodemodel.JDocComment"
    );
  }
}
