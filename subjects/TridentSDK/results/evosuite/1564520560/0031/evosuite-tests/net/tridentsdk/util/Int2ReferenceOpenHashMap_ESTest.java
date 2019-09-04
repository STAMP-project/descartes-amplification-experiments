/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 21:41:58 GMT 2019
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
  public void test00()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      assertNotNull(int2ReferenceOpenHashMap0);
      
      int2ReferenceOpenHashMap0.containsNullKey = true;
      int2ReferenceOpenHashMap0.size = 1;
      Object object0 = int2ReferenceOpenHashMap0.remove(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      assertNotNull(int2ReferenceOpenHashMap0);
      
      int[] intArray0 = new int[5];
      intArray0[0] = (-1091);
      int2ReferenceOpenHashMap0.mask = 0;
      int2ReferenceOpenHashMap0.key = intArray0;
      // Undeclared exception!
      int2ReferenceOpenHashMap0.remove(3394);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      assertNotNull(int2ReferenceOpenHashMap0);
      
      int2ReferenceOpenHashMap0.containsNullKey = true;
      int2ReferenceOpenHashMap0.maxFill = (-894);
      Object object0 = int2ReferenceOpenHashMap0.remove(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(0, 1);
      assertNotNull(int2ReferenceOpenHashMap0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>(2272, 1.0F);
      assertNotNull(int2ReferenceOpenHashMap0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      assertNotNull(int2ReferenceOpenHashMap0);
      
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) int2ReferenceOpenHashMap0;
      int2ReferenceOpenHashMap0.n = 0;
      int2ReferenceOpenHashMap0.value = objectArray0;
      int2ReferenceOpenHashMap0.containsNullKey = true;
      Object object0 = int2ReferenceOpenHashMap0.remove(0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>();
      assertNotNull(int2ReferenceOpenHashMap0);
      
      int2ReferenceOpenHashMap0.key = null;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.remove(2902);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      assertNotNull(int2ReferenceOpenHashMap0);
      
      int[] intArray0 = new int[7];
      intArray0[3] = 1;
      intArray0[4] = 1;
      int2ReferenceOpenHashMap0.key = intArray0;
      Object object0 = int2ReferenceOpenHashMap0.remove((-4637));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int[] intArray0 = new int[5];
      intArray0[0] = (-1091);
      int2ReferenceOpenHashMap0.key = intArray0;
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap1.key = int2ReferenceOpenHashMap0.key;
      int2ReferenceOpenHashMap1.mask = 0;
      // Undeclared exception!
      int2ReferenceOpenHashMap1.remove((-1091));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>();
      int2ReferenceOpenHashMap0.containsNullKey = true;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.remove(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = int2ReferenceOpenHashMap0.remove(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = int2ReferenceOpenHashMap0.remove(1302);
      assertNull(object0);
  }
}