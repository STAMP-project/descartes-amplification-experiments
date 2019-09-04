/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 30 10:54:49 GMT 2019
 */

package org.springframework.samples.petclinic.owner;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class VisitController_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springframework.samples.petclinic.owner.VisitController"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/oscar/descartes-evosuite/subjects/spring-petclinic/results/evosuite/1564483796/0003"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VisitController_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.samples.petclinic.owner.Pet",
      "org.springframework.core.ParameterNameDiscoverer",
      "org.springframework.beans.PropertyEditorRegistrySupport",
      "org.springframework.validation.Validator",
      "org.springframework.beans.PropertyEditorRegistry",
      "org.springframework.validation.BindingErrorProcessor",
      "org.springframework.data.annotation.QueryAnnotation",
      "org.springframework.context.support.DefaultMessageSourceResolvable",
      "org.springframework.validation.ObjectError",
      "org.springframework.beans.PropertyBatchUpdateException",
      "org.springframework.data.repository.Repository",
      "org.springframework.core.MethodParameter",
      "org.springframework.beans.TypeConverter",
      "org.springframework.samples.petclinic.visit.VisitRepository",
      "org.springframework.core.NestedExceptionUtils",
      "org.springframework.context.MessageSourceResolvable",
      "org.springframework.core.NestedRuntimeException",
      "org.springframework.validation.AbstractBindingResult",
      "org.springframework.validation.AbstractErrors",
      "org.springframework.validation.FieldError",
      "org.springframework.format.Parser",
      "org.springframework.validation.DataBinder",
      "org.springframework.samples.petclinic.model.NamedEntity",
      "org.springframework.validation.DirectFieldBindingResult",
      "org.springframework.core.convert.ConversionException",
      "org.springframework.beans.TypeMismatchException",
      "org.springframework.core.AttributeAccessor",
      "org.springframework.samples.petclinic.owner.PetType",
      "org.springframework.beans.TypeConverterSupport",
      "org.springframework.core.AttributeAccessorSupport",
      "org.springframework.transaction.annotation.Isolation",
      "org.springframework.beans.PropertyValues",
      "org.springframework.beans.PropertyEditorRegistrySupport$CustomEditorHolder",
      "org.springframework.data.jpa.repository.Query",
      "org.springframework.samples.petclinic.visit.Visit",
      "org.springframework.validation.Errors",
      "org.springframework.dao.DataAccessException",
      "org.springframework.beans.BeanWrapper",
      "org.springframework.validation.BindingResult",
      "org.springframework.stereotype.Controller",
      "org.springframework.format.Printer",
      "org.springframework.beans.PropertyAccessor",
      "org.springframework.core.convert.ConverterNotFoundException",
      "org.springframework.transaction.annotation.Propagation",
      "org.springframework.beans.BeanMetadataAttributeAccessor",
      "org.springframework.format.Formatter",
      "org.springframework.core.convert.TypeDescriptor",
      "org.springframework.stereotype.Indexed",
      "org.springframework.validation.MessageCodesResolver",
      "org.springframework.validation.BeanPropertyBindingResult",
      "org.springframework.validation.BindException",
      "org.springframework.core.convert.ConversionService",
      "org.springframework.samples.petclinic.owner.VisitController",
      "org.springframework.beans.ConversionNotSupportedException",
      "org.springframework.beans.BeanMetadataElement",
      "org.springframework.samples.petclinic.model.BaseEntity",
      "org.springframework.beans.PropertyAccessException",
      "org.springframework.beans.PropertyValue",
      "org.springframework.beans.BeansException",
      "org.springframework.beans.MutablePropertyValues",
      "org.springframework.beans.support.SortDefinition",
      "org.springframework.stereotype.Component",
      "org.springframework.samples.petclinic.owner.Owner",
      "org.springframework.validation.AbstractPropertyBindingResult",
      "org.springframework.samples.petclinic.model.Person",
      "org.springframework.web.bind.WebDataBinder",
      "org.springframework.beans.ConfigurablePropertyAccessor",
      "org.springframework.samples.petclinic.owner.PetRepository",
      "org.springframework.transaction.annotation.Transactional",
      "org.springframework.beans.SimpleTypeConverter"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.springframework.samples.petclinic.owner.PetRepository", false, VisitController_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.springframework.samples.petclinic.visit.VisitRepository", false, VisitController_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VisitController_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springframework.samples.petclinic.owner.VisitController",
      "org.springframework.transaction.annotation.Propagation",
      "org.springframework.transaction.annotation.Isolation",
      "org.springframework.validation.DataBinder"
    );
  }
}
