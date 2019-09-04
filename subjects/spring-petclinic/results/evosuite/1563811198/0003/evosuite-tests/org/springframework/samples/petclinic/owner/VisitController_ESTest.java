/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 16:05:25 GMT 2019
 */

package org.springframework.samples.petclinic.owner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.owner.PetRepository;
import org.springframework.samples.petclinic.owner.VisitController;
import org.springframework.samples.petclinic.visit.VisitRepository;
import org.springframework.web.bind.WebDataBinder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class VisitController_ESTest extends VisitController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VisitRepository visitRepository0 = mock(VisitRepository.class, new ViolatedAssumptionAnswer());
      PetRepository petRepository0 = mock(PetRepository.class, new ViolatedAssumptionAnswer());
      VisitController visitController0 = new VisitController(visitRepository0, petRepository0);
      // Undeclared exception!
      try { 
        visitController0.setAllowedFields((WebDataBinder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.samples.petclinic.owner.VisitController", e);
      }
  }
}
