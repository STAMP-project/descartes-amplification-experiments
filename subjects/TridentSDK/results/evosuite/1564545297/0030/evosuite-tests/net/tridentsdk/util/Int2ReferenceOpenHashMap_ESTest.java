/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 04:33:53 GMT 2019
 */

package net.tridentsdk.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.tridentsdk.util.Int2ReferenceOpenHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Int2ReferenceOpenHashMap_ESTest extends Int2ReferenceOpenHashMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int2ReferenceOpenHashMap0.size = 1;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.rehash(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = null;
      try {
        int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(2146035952, 0.16898471F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Too large (2146035952 expected elements with load factor 0.16898471)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.value = null;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.rehash(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.rehash((-106));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(2, 1.0F);
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      intArray0[1] = 2;
      int2ReferenceOpenHashMap0.key = intArray0;
      int2ReferenceOpenHashMap0.containsNullKey = true;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.rehash(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(1, 1.0F);
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int2ReferenceOpenHashMap0.key = intArray0;
      int2ReferenceOpenHashMap0.containsNullKey = true;
      // Undeclared exception!
      int2ReferenceOpenHashMap0.rehash(1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.rehash(0);
  }
}
