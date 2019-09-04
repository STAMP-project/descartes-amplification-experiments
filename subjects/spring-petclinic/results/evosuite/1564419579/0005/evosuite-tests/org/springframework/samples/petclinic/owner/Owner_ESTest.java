/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:07:32 GMT 2019
 */

package org.springframework.samples.petclinic.owner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.Pet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Owner_ESTest extends Owner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Owner owner0 = new Owner();
      // Undeclared exception!
      try { 
        owner0.getPet((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.samples.petclinic.owner.Owner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Owner owner0 = new Owner();
      Pet pet0 = owner0.getPet("Jd", true);
      assertNull(pet0);
  }
}
