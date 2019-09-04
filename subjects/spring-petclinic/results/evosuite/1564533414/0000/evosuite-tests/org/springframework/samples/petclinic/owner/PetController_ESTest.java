/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 00:38:04 GMT 2019
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
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.owner.PetController;
import org.springframework.samples.petclinic.owner.PetRepository;
import org.springframework.web.bind.WebDataBinder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PetController_ESTest extends PetController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PetRepository petRepository0 = mock(PetRepository.class, new ViolatedAssumptionAnswer());
      OwnerRepository ownerRepository0 = mock(OwnerRepository.class, new ViolatedAssumptionAnswer());
      PetController petController0 = new PetController(petRepository0, ownerRepository0);
      // Undeclared exception!
      try { 
        petController0.initOwnerBinder((WebDataBinder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.samples.petclinic.owner.PetController", e);
      }
  }
}
