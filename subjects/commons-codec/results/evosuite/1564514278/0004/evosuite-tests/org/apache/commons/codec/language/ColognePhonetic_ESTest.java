/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:24:25 GMT 2019
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.ColognePhonetic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ColognePhonetic_ESTest extends ColognePhonetic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      boolean boolean0 = colognePhonetic0.isEncodeEqual("", "CAM,3PC$7Z@OO ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneBuffer", "org.apache.commons.codec.language.ColognePhonetic$CologneBuffer");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneBuffer", " qLC+|fI=Nl`J/@]4vy");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneBuffer", "org.apache.commons.codec.language.ColognePhonetic$CologneBuffer");
      colognePhonetic0.isEncodeEqual("c\\", "org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer");
      colognePhonetic0.isEncodeEqual("$ LH81MW{C*y[{,B0K", "org.apache.commons.codec.language.ColognePhonetic");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.EncoderException", "org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.EncoderException", "org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneBuffer", " qLC+|fI=Nl`J/@]4vy");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneBuffer", "org.apache.commons.codec.EncoderException");
      // Undeclared exception!
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneOutputBuffer", "org.apache.commons.codec.EncoderException");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      // Undeclared exception!
      try { 
        colognePhonetic0.isEncodeEqual((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}